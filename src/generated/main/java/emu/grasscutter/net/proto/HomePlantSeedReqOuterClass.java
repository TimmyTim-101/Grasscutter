// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantSeedReq.proto

package emu.grasscutter.net.proto;

public final class HomePlantSeedReqOuterClass {
  private HomePlantSeedReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantSeedReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantSeedReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 seed_id_list = 7;</code>
     * @return A list containing the seedIdList.
     */
    java.util.List<java.lang.Integer> getSeedIdListList();
    /**
     * <code>repeated uint32 seed_id_list = 7;</code>
     * @return The count of seedIdList.
     */
    int getSeedIdListCount();
    /**
     * <code>repeated uint32 seed_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The seedIdList at the given index.
     */
    int getSeedIdList(int index);

    /**
     * <code>uint32 field_guid = 6;</code>
     * @return The fieldGuid.
     */
    int getFieldGuid();

    /**
     * <code>uint32 index = 10;</code>
     * @return The index.
     */
    int getIndex();
  }
  /**
   * <pre>
   * CmdId: 4578
   * Obf: LNJFLEBKHEP
   * </pre>
   *
   * Protobuf type {@code HomePlantSeedReq}
   */
  public static final class HomePlantSeedReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantSeedReq)
      HomePlantSeedReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantSeedReq.newBuilder() to construct.
    private HomePlantSeedReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantSeedReq() {
      seedIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantSeedReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomePlantSeedReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 48: {

              fieldGuid_ = input.readUInt32();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                seedIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              seedIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                seedIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                seedIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {

              index_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          seedIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.internal_static_HomePlantSeedReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.internal_static_HomePlantSeedReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.class, emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.Builder.class);
    }

    public static final int SEED_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList seedIdList_;
    /**
     * <code>repeated uint32 seed_id_list = 7;</code>
     * @return A list containing the seedIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSeedIdListList() {
      return seedIdList_;
    }
    /**
     * <code>repeated uint32 seed_id_list = 7;</code>
     * @return The count of seedIdList.
     */
    public int getSeedIdListCount() {
      return seedIdList_.size();
    }
    /**
     * <code>repeated uint32 seed_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The seedIdList at the given index.
     */
    public int getSeedIdList(int index) {
      return seedIdList_.getInt(index);
    }
    private int seedIdListMemoizedSerializedSize = -1;

    public static final int FIELD_GUID_FIELD_NUMBER = 6;
    private int fieldGuid_;
    /**
     * <code>uint32 field_guid = 6;</code>
     * @return The fieldGuid.
     */
    @java.lang.Override
    public int getFieldGuid() {
      return fieldGuid_;
    }

    public static final int INDEX_FIELD_NUMBER = 10;
    private int index_;
    /**
     * <code>uint32 index = 10;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (fieldGuid_ != 0) {
        output.writeUInt32(6, fieldGuid_);
      }
      if (getSeedIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(seedIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < seedIdList_.size(); i++) {
        output.writeUInt32NoTag(seedIdList_.getInt(i));
      }
      if (index_ != 0) {
        output.writeUInt32(10, index_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fieldGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, fieldGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < seedIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(seedIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSeedIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        seedIdListMemoizedSerializedSize = dataSize;
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, index_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq other = (emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq) obj;

      if (!getSeedIdListList()
          .equals(other.getSeedIdListList())) return false;
      if (getFieldGuid()
          != other.getFieldGuid()) return false;
      if (getIndex()
          != other.getIndex()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getSeedIdListCount() > 0) {
        hash = (37 * hash) + SEED_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSeedIdListList().hashCode();
      }
      hash = (37 * hash) + FIELD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getFieldGuid();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 4578
     * Obf: LNJFLEBKHEP
     * </pre>
     *
     * Protobuf type {@code HomePlantSeedReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantSeedReq)
        emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.internal_static_HomePlantSeedReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.internal_static_HomePlantSeedReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.class, emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        seedIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        fieldGuid_ = 0;

        index_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.internal_static_HomePlantSeedReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq build() {
        emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq buildPartial() {
        emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq result = new emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          seedIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.seedIdList_ = seedIdList_;
        result.fieldGuid_ = fieldGuid_;
        result.index_ = index_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq other) {
        if (other == emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq.getDefaultInstance()) return this;
        if (!other.seedIdList_.isEmpty()) {
          if (seedIdList_.isEmpty()) {
            seedIdList_ = other.seedIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSeedIdListIsMutable();
            seedIdList_.addAll(other.seedIdList_);
          }
          onChanged();
        }
        if (other.getFieldGuid() != 0) {
          setFieldGuid(other.getFieldGuid());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList seedIdList_ = emptyIntList();
      private void ensureSeedIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          seedIdList_ = mutableCopy(seedIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @return A list containing the seedIdList.
       */
      public java.util.List<java.lang.Integer>
          getSeedIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(seedIdList_) : seedIdList_;
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @return The count of seedIdList.
       */
      public int getSeedIdListCount() {
        return seedIdList_.size();
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The seedIdList at the given index.
       */
      public int getSeedIdList(int index) {
        return seedIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The seedIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSeedIdList(
          int index, int value) {
        ensureSeedIdListIsMutable();
        seedIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @param value The seedIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSeedIdList(int value) {
        ensureSeedIdListIsMutable();
        seedIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @param values The seedIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSeedIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSeedIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, seedIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seed_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeedIdList() {
        seedIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int fieldGuid_ ;
      /**
       * <code>uint32 field_guid = 6;</code>
       * @return The fieldGuid.
       */
      @java.lang.Override
      public int getFieldGuid() {
        return fieldGuid_;
      }
      /**
       * <code>uint32 field_guid = 6;</code>
       * @param value The fieldGuid to set.
       * @return This builder for chaining.
       */
      public Builder setFieldGuid(int value) {
        
        fieldGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 field_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFieldGuid() {
        
        fieldGuid_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 10;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 10;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomePlantSeedReq)
    }

    // @@protoc_insertion_point(class_scope:HomePlantSeedReq)
    private static final emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq();
    }

    public static emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantSeedReq>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantSeedReq>() {
      @java.lang.Override
      public HomePlantSeedReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomePlantSeedReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomePlantSeedReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantSeedReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantSeedReqOuterClass.HomePlantSeedReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantSeedReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantSeedReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HomePlantSeedReq.proto\"K\n\020HomePlantSee" +
      "dReq\022\024\n\014seed_id_list\030\007 \003(\r\022\022\n\nfield_guid" +
      "\030\006 \001(\r\022\r\n\005index\030\n \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomePlantSeedReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantSeedReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantSeedReq_descriptor,
        new java.lang.String[] { "SeedIdList", "FieldGuid", "Index", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
