/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.accumulo.core.file.rfile;

import java.util.ArrayList;
import java.util.List;

import org.apache.accumulo.core.cli.Help;
import org.apache.accumulo.core.conf.DefaultConfiguration;
import org.apache.accumulo.core.crypto.CryptoServiceFactory;
import org.apache.accumulo.core.file.FileSKVWriter;
import org.apache.accumulo.core.file.rfile.bcfile.Compression;
import org.apache.accumulo.core.spi.file.rfile.compression.NoCompression;
import org.apache.accumulo.start.spi.KeywordExecutable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.google.auto.service.AutoService;

/**
 * Create an empty RFile for use in recovering from data loss where Accumulo still refers internally
 * to a path.
 */
@AutoService(KeywordExecutable.class)
public class CreateEmpty implements KeywordExecutable {
  private static final Logger log = LoggerFactory.getLogger(CreateEmpty.class);

  public static class NamedLikeRFile implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
      if (!value.endsWith(".rf")) {
        throw new ParameterException("File must end with .rf and '" + value + "' does not.");
      }
    }
  }

  public static class IsSupportedCompressionAlgorithm implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
      List<String> algorithms = Compression.getSupportedAlgorithms();
      if (!algorithms.contains(value)) {
        throw new ParameterException("Compression codec must be one of " + algorithms);
      }
    }
  }

  static class Opts extends Help {
    @Parameter(names = {"-c", "--codec"}, description = "the compression codec to use.",
        validateWith = IsSupportedCompressionAlgorithm.class)
    String codec = new NoCompression().getName();
    @Parameter(
        description = " <path> { <path> ... } Each path given is a URL."
            + " Relative paths are resolved according to the default filesystem defined in"
            + " your Hadoop configuration, which is usually an HDFS instance.",
        required = true, validateWith = NamedLikeRFile.class)
    List<String> files = new ArrayList<>();
  }

  public static void main(String[] args) throws Exception {
    new CreateEmpty().execute(args);
  }

  @Override
  public String keyword() {
    return "create-empty";
  }

  @Override
  public String description() {
    return "Creates an empty rfile";
  }

  @Override
  public void execute(String[] args) throws Exception {
    Configuration conf = new Configuration();

    Opts opts = new Opts();
    opts.parseArgs("accumulo create-empty", args);

    for (String arg : opts.files) {
      Path path = new Path(arg);
      log.info("Writing to file '{}'", path);
      FileSKVWriter writer = new RFileOperations().newWriterBuilder()
          .forFile(arg, path.getFileSystem(conf), conf, CryptoServiceFactory.newDefaultInstance())
          .withTableConfiguration(DefaultConfiguration.getInstance()).withCompression(opts.codec)
          .build();
      writer.close();
    }
  }

}
