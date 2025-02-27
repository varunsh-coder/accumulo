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
package org.apache.accumulo.fate.zookeeper;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZooCacheFactoryTest {
  private ZooCacheFactory zcf;

  @BeforeEach
  public void setUp() {
    zcf = new ZooCacheFactory();
  }

  @AfterEach
  public void tearDown() {
    zcf.reset();
  }

  @Test
  public void testGetZooCache() {
    String zks1 = "zk1";
    int timeout1 = 1000;
    ZooCache zc1 = zcf.getZooCache(zks1, timeout1);
    ZooCache zc1a = zcf.getZooCache(zks1, timeout1);
    assertSame(zc1, zc1a);

    String zks2 = "zk2";
    int timeout2 = 1000;
    ZooCache zc2 = zcf.getZooCache(zks2, timeout2);
    assertNotSame(zc1, zc2);

    String zks3 = "zk1";
    int timeout3 = 2000;
    ZooCache zc3 = zcf.getZooCache(zks3, timeout3);
    assertNotSame(zc1, zc3);
  }

  @Test
  public void testGetNewZooCache() {
    String zks1 = "zk1";
    int timeout1 = 1000;
    ZooCache zc1 = zcf.getNewZooCache(zks1, timeout1);
    assertNotNull(zc1);
    ZooCache zc1a = zcf.getZooCache(zks1, timeout1);
    assertNotSame(zc1, zc1a);
    ZooCache zc1b = zcf.getNewZooCache(zks1, timeout1);
    assertNotSame(zc1, zc1b);
    assertNotSame(zc1a, zc1b);
  }

  @Test
  public void testReset() {
    String zks1 = "zk1";
    int timeout1 = 1000;
    ZooCache zc1 = zcf.getZooCache(zks1, timeout1);
    zcf.reset();
    ZooCache zc1a = zcf.getZooCache(zks1, timeout1);
    assertNotSame(zc1, zc1a);
  }
}
