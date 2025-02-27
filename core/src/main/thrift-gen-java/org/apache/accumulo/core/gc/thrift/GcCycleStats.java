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
/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.gc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class GcCycleStats implements org.apache.thrift.TBase<GcCycleStats, GcCycleStats._Fields>, java.io.Serializable, Cloneable, Comparable<GcCycleStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GcCycleStats");

  private static final org.apache.thrift.protocol.TField STARTED_FIELD_DESC = new org.apache.thrift.protocol.TField("started", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField FINISHED_FIELD_DESC = new org.apache.thrift.protocol.TField("finished", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CANDIDATES_FIELD_DESC = new org.apache.thrift.protocol.TField("candidates", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField IN_USE_FIELD_DESC = new org.apache.thrift.protocol.TField("inUse", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField DELETED_FIELD_DESC = new org.apache.thrift.protocol.TField("deleted", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField ERRORS_FIELD_DESC = new org.apache.thrift.protocol.TField("errors", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField BULKS_FIELD_DESC = new org.apache.thrift.protocol.TField("bulks", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GcCycleStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GcCycleStatsTupleSchemeFactory();

  public long started; // required
  public long finished; // required
  public long candidates; // required
  public long inUse; // required
  public long deleted; // required
  public long errors; // required
  public long bulks; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STARTED((short)1, "started"),
    FINISHED((short)2, "finished"),
    CANDIDATES((short)3, "candidates"),
    IN_USE((short)4, "inUse"),
    DELETED((short)5, "deleted"),
    ERRORS((short)6, "errors"),
    BULKS((short)7, "bulks");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STARTED
          return STARTED;
        case 2: // FINISHED
          return FINISHED;
        case 3: // CANDIDATES
          return CANDIDATES;
        case 4: // IN_USE
          return IN_USE;
        case 5: // DELETED
          return DELETED;
        case 6: // ERRORS
          return ERRORS;
        case 7: // BULKS
          return BULKS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STARTED_ISSET_ID = 0;
  private static final int __FINISHED_ISSET_ID = 1;
  private static final int __CANDIDATES_ISSET_ID = 2;
  private static final int __INUSE_ISSET_ID = 3;
  private static final int __DELETED_ISSET_ID = 4;
  private static final int __ERRORS_ISSET_ID = 5;
  private static final int __BULKS_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STARTED, new org.apache.thrift.meta_data.FieldMetaData("started", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FINISHED, new org.apache.thrift.meta_data.FieldMetaData("finished", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CANDIDATES, new org.apache.thrift.meta_data.FieldMetaData("candidates", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IN_USE, new org.apache.thrift.meta_data.FieldMetaData("inUse", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DELETED, new org.apache.thrift.meta_data.FieldMetaData("deleted", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ERRORS, new org.apache.thrift.meta_data.FieldMetaData("errors", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BULKS, new org.apache.thrift.meta_data.FieldMetaData("bulks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GcCycleStats.class, metaDataMap);
  }

  public GcCycleStats() {
  }

  public GcCycleStats(
    long started,
    long finished,
    long candidates,
    long inUse,
    long deleted,
    long errors,
    long bulks)
  {
    this();
    this.started = started;
    setStartedIsSet(true);
    this.finished = finished;
    setFinishedIsSet(true);
    this.candidates = candidates;
    setCandidatesIsSet(true);
    this.inUse = inUse;
    setInUseIsSet(true);
    this.deleted = deleted;
    setDeletedIsSet(true);
    this.errors = errors;
    setErrorsIsSet(true);
    this.bulks = bulks;
    setBulksIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GcCycleStats(GcCycleStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.started = other.started;
    this.finished = other.finished;
    this.candidates = other.candidates;
    this.inUse = other.inUse;
    this.deleted = other.deleted;
    this.errors = other.errors;
    this.bulks = other.bulks;
  }

  public GcCycleStats deepCopy() {
    return new GcCycleStats(this);
  }

  @Override
  public void clear() {
    setStartedIsSet(false);
    this.started = 0;
    setFinishedIsSet(false);
    this.finished = 0;
    setCandidatesIsSet(false);
    this.candidates = 0;
    setInUseIsSet(false);
    this.inUse = 0;
    setDeletedIsSet(false);
    this.deleted = 0;
    setErrorsIsSet(false);
    this.errors = 0;
    setBulksIsSet(false);
    this.bulks = 0;
  }

  public long getStarted() {
    return this.started;
  }

  public GcCycleStats setStarted(long started) {
    this.started = started;
    setStartedIsSet(true);
    return this;
  }

  public void unsetStarted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTED_ISSET_ID);
  }

  /** Returns true if field started is set (has been assigned a value) and false otherwise */
  public boolean isSetStarted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTED_ISSET_ID);
  }

  public void setStartedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTED_ISSET_ID, value);
  }

  public long getFinished() {
    return this.finished;
  }

  public GcCycleStats setFinished(long finished) {
    this.finished = finished;
    setFinishedIsSet(true);
    return this;
  }

  public void unsetFinished() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FINISHED_ISSET_ID);
  }

  /** Returns true if field finished is set (has been assigned a value) and false otherwise */
  public boolean isSetFinished() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FINISHED_ISSET_ID);
  }

  public void setFinishedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FINISHED_ISSET_ID, value);
  }

  public long getCandidates() {
    return this.candidates;
  }

  public GcCycleStats setCandidates(long candidates) {
    this.candidates = candidates;
    setCandidatesIsSet(true);
    return this;
  }

  public void unsetCandidates() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CANDIDATES_ISSET_ID);
  }

  /** Returns true if field candidates is set (has been assigned a value) and false otherwise */
  public boolean isSetCandidates() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CANDIDATES_ISSET_ID);
  }

  public void setCandidatesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CANDIDATES_ISSET_ID, value);
  }

  public long getInUse() {
    return this.inUse;
  }

  public GcCycleStats setInUse(long inUse) {
    this.inUse = inUse;
    setInUseIsSet(true);
    return this;
  }

  public void unsetInUse() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INUSE_ISSET_ID);
  }

  /** Returns true if field inUse is set (has been assigned a value) and false otherwise */
  public boolean isSetInUse() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INUSE_ISSET_ID);
  }

  public void setInUseIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INUSE_ISSET_ID, value);
  }

  public long getDeleted() {
    return this.deleted;
  }

  public GcCycleStats setDeleted(long deleted) {
    this.deleted = deleted;
    setDeletedIsSet(true);
    return this;
  }

  public void unsetDeleted() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DELETED_ISSET_ID);
  }

  /** Returns true if field deleted is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleted() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DELETED_ISSET_ID);
  }

  public void setDeletedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DELETED_ISSET_ID, value);
  }

  public long getErrors() {
    return this.errors;
  }

  public GcCycleStats setErrors(long errors) {
    this.errors = errors;
    setErrorsIsSet(true);
    return this;
  }

  public void unsetErrors() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERRORS_ISSET_ID);
  }

  /** Returns true if field errors is set (has been assigned a value) and false otherwise */
  public boolean isSetErrors() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERRORS_ISSET_ID);
  }

  public void setErrorsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERRORS_ISSET_ID, value);
  }

  public long getBulks() {
    return this.bulks;
  }

  public GcCycleStats setBulks(long bulks) {
    this.bulks = bulks;
    setBulksIsSet(true);
    return this;
  }

  public void unsetBulks() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BULKS_ISSET_ID);
  }

  /** Returns true if field bulks is set (has been assigned a value) and false otherwise */
  public boolean isSetBulks() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BULKS_ISSET_ID);
  }

  public void setBulksIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BULKS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STARTED:
      if (value == null) {
        unsetStarted();
      } else {
        setStarted((java.lang.Long)value);
      }
      break;

    case FINISHED:
      if (value == null) {
        unsetFinished();
      } else {
        setFinished((java.lang.Long)value);
      }
      break;

    case CANDIDATES:
      if (value == null) {
        unsetCandidates();
      } else {
        setCandidates((java.lang.Long)value);
      }
      break;

    case IN_USE:
      if (value == null) {
        unsetInUse();
      } else {
        setInUse((java.lang.Long)value);
      }
      break;

    case DELETED:
      if (value == null) {
        unsetDeleted();
      } else {
        setDeleted((java.lang.Long)value);
      }
      break;

    case ERRORS:
      if (value == null) {
        unsetErrors();
      } else {
        setErrors((java.lang.Long)value);
      }
      break;

    case BULKS:
      if (value == null) {
        unsetBulks();
      } else {
        setBulks((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STARTED:
      return getStarted();

    case FINISHED:
      return getFinished();

    case CANDIDATES:
      return getCandidates();

    case IN_USE:
      return getInUse();

    case DELETED:
      return getDeleted();

    case ERRORS:
      return getErrors();

    case BULKS:
      return getBulks();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STARTED:
      return isSetStarted();
    case FINISHED:
      return isSetFinished();
    case CANDIDATES:
      return isSetCandidates();
    case IN_USE:
      return isSetInUse();
    case DELETED:
      return isSetDeleted();
    case ERRORS:
      return isSetErrors();
    case BULKS:
      return isSetBulks();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GcCycleStats)
      return this.equals((GcCycleStats)that);
    return false;
  }

  public boolean equals(GcCycleStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_started = true;
    boolean that_present_started = true;
    if (this_present_started || that_present_started) {
      if (!(this_present_started && that_present_started))
        return false;
      if (this.started != that.started)
        return false;
    }

    boolean this_present_finished = true;
    boolean that_present_finished = true;
    if (this_present_finished || that_present_finished) {
      if (!(this_present_finished && that_present_finished))
        return false;
      if (this.finished != that.finished)
        return false;
    }

    boolean this_present_candidates = true;
    boolean that_present_candidates = true;
    if (this_present_candidates || that_present_candidates) {
      if (!(this_present_candidates && that_present_candidates))
        return false;
      if (this.candidates != that.candidates)
        return false;
    }

    boolean this_present_inUse = true;
    boolean that_present_inUse = true;
    if (this_present_inUse || that_present_inUse) {
      if (!(this_present_inUse && that_present_inUse))
        return false;
      if (this.inUse != that.inUse)
        return false;
    }

    boolean this_present_deleted = true;
    boolean that_present_deleted = true;
    if (this_present_deleted || that_present_deleted) {
      if (!(this_present_deleted && that_present_deleted))
        return false;
      if (this.deleted != that.deleted)
        return false;
    }

    boolean this_present_errors = true;
    boolean that_present_errors = true;
    if (this_present_errors || that_present_errors) {
      if (!(this_present_errors && that_present_errors))
        return false;
      if (this.errors != that.errors)
        return false;
    }

    boolean this_present_bulks = true;
    boolean that_present_bulks = true;
    if (this_present_bulks || that_present_bulks) {
      if (!(this_present_bulks && that_present_bulks))
        return false;
      if (this.bulks != that.bulks)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(started);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(finished);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(candidates);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(inUse);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(deleted);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(errors);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(bulks);

    return hashCode;
  }

  @Override
  public int compareTo(GcCycleStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStarted(), other.isSetStarted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.started, other.started);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFinished(), other.isSetFinished());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFinished()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.finished, other.finished);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCandidates(), other.isSetCandidates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCandidates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.candidates, other.candidates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInUse(), other.isSetInUse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInUse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inUse, other.inUse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDeleted(), other.isSetDeleted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleted, other.deleted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetErrors(), other.isSetErrors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errors, other.errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBulks(), other.isSetBulks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBulks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bulks, other.bulks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GcCycleStats(");
    boolean first = true;

    sb.append("started:");
    sb.append(this.started);
    first = false;
    if (!first) sb.append(", ");
    sb.append("finished:");
    sb.append(this.finished);
    first = false;
    if (!first) sb.append(", ");
    sb.append("candidates:");
    sb.append(this.candidates);
    first = false;
    if (!first) sb.append(", ");
    sb.append("inUse:");
    sb.append(this.inUse);
    first = false;
    if (!first) sb.append(", ");
    sb.append("deleted:");
    sb.append(this.deleted);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errors:");
    sb.append(this.errors);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bulks:");
    sb.append(this.bulks);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GcCycleStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GcCycleStatsStandardScheme getScheme() {
      return new GcCycleStatsStandardScheme();
    }
  }

  private static class GcCycleStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<GcCycleStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GcCycleStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STARTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.started = iprot.readI64();
              struct.setStartedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FINISHED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.finished = iprot.readI64();
              struct.setFinishedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CANDIDATES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.candidates = iprot.readI64();
              struct.setCandidatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IN_USE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.inUse = iprot.readI64();
              struct.setInUseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DELETED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.deleted = iprot.readI64();
              struct.setDeletedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ERRORS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.errors = iprot.readI64();
              struct.setErrorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // BULKS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.bulks = iprot.readI64();
              struct.setBulksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GcCycleStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STARTED_FIELD_DESC);
      oprot.writeI64(struct.started);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FINISHED_FIELD_DESC);
      oprot.writeI64(struct.finished);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CANDIDATES_FIELD_DESC);
      oprot.writeI64(struct.candidates);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IN_USE_FIELD_DESC);
      oprot.writeI64(struct.inUse);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DELETED_FIELD_DESC);
      oprot.writeI64(struct.deleted);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ERRORS_FIELD_DESC);
      oprot.writeI64(struct.errors);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BULKS_FIELD_DESC);
      oprot.writeI64(struct.bulks);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GcCycleStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GcCycleStatsTupleScheme getScheme() {
      return new GcCycleStatsTupleScheme();
    }
  }

  private static class GcCycleStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<GcCycleStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GcCycleStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStarted()) {
        optionals.set(0);
      }
      if (struct.isSetFinished()) {
        optionals.set(1);
      }
      if (struct.isSetCandidates()) {
        optionals.set(2);
      }
      if (struct.isSetInUse()) {
        optionals.set(3);
      }
      if (struct.isSetDeleted()) {
        optionals.set(4);
      }
      if (struct.isSetErrors()) {
        optionals.set(5);
      }
      if (struct.isSetBulks()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetStarted()) {
        oprot.writeI64(struct.started);
      }
      if (struct.isSetFinished()) {
        oprot.writeI64(struct.finished);
      }
      if (struct.isSetCandidates()) {
        oprot.writeI64(struct.candidates);
      }
      if (struct.isSetInUse()) {
        oprot.writeI64(struct.inUse);
      }
      if (struct.isSetDeleted()) {
        oprot.writeI64(struct.deleted);
      }
      if (struct.isSetErrors()) {
        oprot.writeI64(struct.errors);
      }
      if (struct.isSetBulks()) {
        oprot.writeI64(struct.bulks);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GcCycleStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.started = iprot.readI64();
        struct.setStartedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.finished = iprot.readI64();
        struct.setFinishedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.candidates = iprot.readI64();
        struct.setCandidatesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.inUse = iprot.readI64();
        struct.setInUseIsSet(true);
      }
      if (incoming.get(4)) {
        struct.deleted = iprot.readI64();
        struct.setDeletedIsSet(true);
      }
      if (incoming.get(5)) {
        struct.errors = iprot.readI64();
        struct.setErrorsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.bulks = iprot.readI64();
        struct.setBulksIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

