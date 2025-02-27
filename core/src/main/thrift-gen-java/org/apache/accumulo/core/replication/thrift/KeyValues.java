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
package org.apache.accumulo.core.replication.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class KeyValues implements org.apache.thrift.TBase<KeyValues, KeyValues._Fields>, java.io.Serializable, Cloneable, Comparable<KeyValues> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeyValues");

  private static final org.apache.thrift.protocol.TField KEY_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("keyValues", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeyValuesStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeyValuesTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.accumulo.core.dataImpl.thrift.TKeyValue> keyValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY_VALUES((short)1, "keyValues");

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
        case 1: // KEY_VALUES
          return KEY_VALUES;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY_VALUES, new org.apache.thrift.meta_data.FieldMetaData("keyValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.accumulo.core.dataImpl.thrift.TKeyValue.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeyValues.class, metaDataMap);
  }

  public KeyValues() {
  }

  public KeyValues(
    java.util.List<org.apache.accumulo.core.dataImpl.thrift.TKeyValue> keyValues)
  {
    this();
    this.keyValues = keyValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeyValues(KeyValues other) {
    if (other.isSetKeyValues()) {
      java.util.List<org.apache.accumulo.core.dataImpl.thrift.TKeyValue> __this__keyValues = new java.util.ArrayList<org.apache.accumulo.core.dataImpl.thrift.TKeyValue>(other.keyValues.size());
      for (org.apache.accumulo.core.dataImpl.thrift.TKeyValue other_element : other.keyValues) {
        __this__keyValues.add(new org.apache.accumulo.core.dataImpl.thrift.TKeyValue(other_element));
      }
      this.keyValues = __this__keyValues;
    }
  }

  public KeyValues deepCopy() {
    return new KeyValues(this);
  }

  @Override
  public void clear() {
    this.keyValues = null;
  }

  public int getKeyValuesSize() {
    return (this.keyValues == null) ? 0 : this.keyValues.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.accumulo.core.dataImpl.thrift.TKeyValue> getKeyValuesIterator() {
    return (this.keyValues == null) ? null : this.keyValues.iterator();
  }

  public void addToKeyValues(org.apache.accumulo.core.dataImpl.thrift.TKeyValue elem) {
    if (this.keyValues == null) {
      this.keyValues = new java.util.ArrayList<org.apache.accumulo.core.dataImpl.thrift.TKeyValue>();
    }
    this.keyValues.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.accumulo.core.dataImpl.thrift.TKeyValue> getKeyValues() {
    return this.keyValues;
  }

  public KeyValues setKeyValues(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.accumulo.core.dataImpl.thrift.TKeyValue> keyValues) {
    this.keyValues = keyValues;
    return this;
  }

  public void unsetKeyValues() {
    this.keyValues = null;
  }

  /** Returns true if field keyValues is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyValues() {
    return this.keyValues != null;
  }

  public void setKeyValuesIsSet(boolean value) {
    if (!value) {
      this.keyValues = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case KEY_VALUES:
      if (value == null) {
        unsetKeyValues();
      } else {
        setKeyValues((java.util.List<org.apache.accumulo.core.dataImpl.thrift.TKeyValue>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY_VALUES:
      return getKeyValues();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEY_VALUES:
      return isSetKeyValues();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof KeyValues)
      return this.equals((KeyValues)that);
    return false;
  }

  public boolean equals(KeyValues that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_keyValues = true && this.isSetKeyValues();
    boolean that_present_keyValues = true && that.isSetKeyValues();
    if (this_present_keyValues || that_present_keyValues) {
      if (!(this_present_keyValues && that_present_keyValues))
        return false;
      if (!this.keyValues.equals(that.keyValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKeyValues()) ? 131071 : 524287);
    if (isSetKeyValues())
      hashCode = hashCode * 8191 + keyValues.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(KeyValues other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetKeyValues(), other.isSetKeyValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyValues, other.keyValues);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyValues(");
    boolean first = true;

    sb.append("keyValues:");
    if (this.keyValues == null) {
      sb.append("null");
    } else {
      sb.append(this.keyValues);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KeyValuesStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyValuesStandardScheme getScheme() {
      return new KeyValuesStandardScheme();
    }
  }

  private static class KeyValuesStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeyValues> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeyValues struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.keyValues = new java.util.ArrayList<org.apache.accumulo.core.dataImpl.thrift.TKeyValue>(_list8.size);
                @org.apache.thrift.annotation.Nullable org.apache.accumulo.core.dataImpl.thrift.TKeyValue _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new org.apache.accumulo.core.dataImpl.thrift.TKeyValue();
                  _elem9.read(iprot);
                  struct.keyValues.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setKeyValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeyValues struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keyValues != null) {
        oprot.writeFieldBegin(KEY_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.keyValues.size()));
          for (org.apache.accumulo.core.dataImpl.thrift.TKeyValue _iter11 : struct.keyValues)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeyValuesTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeyValuesTupleScheme getScheme() {
      return new KeyValuesTupleScheme();
    }
  }

  private static class KeyValuesTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeyValues> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeyValues struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKeyValues()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetKeyValues()) {
        {
          oprot.writeI32(struct.keyValues.size());
          for (org.apache.accumulo.core.dataImpl.thrift.TKeyValue _iter12 : struct.keyValues)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeyValues struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.keyValues = new java.util.ArrayList<org.apache.accumulo.core.dataImpl.thrift.TKeyValue>(_list13.size);
          @org.apache.thrift.annotation.Nullable org.apache.accumulo.core.dataImpl.thrift.TKeyValue _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new org.apache.accumulo.core.dataImpl.thrift.TKeyValue();
            _elem14.read(iprot);
            struct.keyValues.add(_elem14);
          }
        }
        struct.setKeyValuesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

