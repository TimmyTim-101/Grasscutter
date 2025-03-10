// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartArenaChallengeLevelRsp.proto

package emu.grasscutter.net.proto;

public final class StartArenaChallengeLevelRspOuterClass {
  private StartArenaChallengeLevelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartArenaChallengeLevelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartArenaChallengeLevelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DBPEAEAANPG = 13;</code>
     * @return The dBPEAEAANPG.
     */
    int getDBPEAEAANPG();

    /**
     * <code>uint32 gadget_entity_id = 11;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 PEPMDOACJNL = 2;</code>
     * @return The pEPMDOACJNL.
     */
    int getPEPMDOACJNL();
  }
  /**
   * <pre>
   * CmdId: 2075
   * Obf: ILKDHAHONPJ
   * </pre>
   *
   * Protobuf type {@code StartArenaChallengeLevelRsp}
   */
  public static final class StartArenaChallengeLevelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartArenaChallengeLevelRsp)
      StartArenaChallengeLevelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartArenaChallengeLevelRsp.newBuilder() to construct.
    private StartArenaChallengeLevelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartArenaChallengeLevelRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartArenaChallengeLevelRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartArenaChallengeLevelRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              pEPMDOACJNL_ = input.readUInt32();
              break;
            }
            case 88: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 104: {

              dBPEAEAANPG_ = input.readUInt32();
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.class, emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.Builder.class);
    }

    public static final int DBPEAEAANPG_FIELD_NUMBER = 13;
    private int dBPEAEAANPG_;
    /**
     * <code>uint32 DBPEAEAANPG = 13;</code>
     * @return The dBPEAEAANPG.
     */
    @java.lang.Override
    public int getDBPEAEAANPG() {
      return dBPEAEAANPG_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 11;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 11;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PEPMDOACJNL_FIELD_NUMBER = 2;
    private int pEPMDOACJNL_;
    /**
     * <code>uint32 PEPMDOACJNL = 2;</code>
     * @return The pEPMDOACJNL.
     */
    @java.lang.Override
    public int getPEPMDOACJNL() {
      return pEPMDOACJNL_;
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
      if (pEPMDOACJNL_ != 0) {
        output.writeUInt32(2, pEPMDOACJNL_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(11, gadgetEntityId_);
      }
      if (dBPEAEAANPG_ != 0) {
        output.writeUInt32(13, dBPEAEAANPG_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pEPMDOACJNL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pEPMDOACJNL_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, gadgetEntityId_);
      }
      if (dBPEAEAANPG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, dBPEAEAANPG_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp other = (emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp) obj;

      if (getDBPEAEAANPG()
          != other.getDBPEAEAANPG()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getPEPMDOACJNL()
          != other.getPEPMDOACJNL()) return false;
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
      hash = (37 * hash) + DBPEAEAANPG_FIELD_NUMBER;
      hash = (53 * hash) + getDBPEAEAANPG();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PEPMDOACJNL_FIELD_NUMBER;
      hash = (53 * hash) + getPEPMDOACJNL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp prototype) {
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
     * CmdId: 2075
     * Obf: ILKDHAHONPJ
     * </pre>
     *
     * Protobuf type {@code StartArenaChallengeLevelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartArenaChallengeLevelRsp)
        emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.class, emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.newBuilder()
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
        dBPEAEAANPG_ = 0;

        gadgetEntityId_ = 0;

        retcode_ = 0;

        pEPMDOACJNL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp build() {
        emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp buildPartial() {
        emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp result = new emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp(this);
        result.dBPEAEAANPG_ = dBPEAEAANPG_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.retcode_ = retcode_;
        result.pEPMDOACJNL_ = pEPMDOACJNL_;
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
        if (other instanceof emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp) {
          return mergeFrom((emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp other) {
        if (other == emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.getDefaultInstance()) return this;
        if (other.getDBPEAEAANPG() != 0) {
          setDBPEAEAANPG(other.getDBPEAEAANPG());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getPEPMDOACJNL() != 0) {
          setPEPMDOACJNL(other.getPEPMDOACJNL());
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
        emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dBPEAEAANPG_ ;
      /**
       * <code>uint32 DBPEAEAANPG = 13;</code>
       * @return The dBPEAEAANPG.
       */
      @java.lang.Override
      public int getDBPEAEAANPG() {
        return dBPEAEAANPG_;
      }
      /**
       * <code>uint32 DBPEAEAANPG = 13;</code>
       * @param value The dBPEAEAANPG to set.
       * @return This builder for chaining.
       */
      public Builder setDBPEAEAANPG(int value) {
        
        dBPEAEAANPG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DBPEAEAANPG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDBPEAEAANPG() {
        
        dBPEAEAANPG_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 11;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 11;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int pEPMDOACJNL_ ;
      /**
       * <code>uint32 PEPMDOACJNL = 2;</code>
       * @return The pEPMDOACJNL.
       */
      @java.lang.Override
      public int getPEPMDOACJNL() {
        return pEPMDOACJNL_;
      }
      /**
       * <code>uint32 PEPMDOACJNL = 2;</code>
       * @param value The pEPMDOACJNL to set.
       * @return This builder for chaining.
       */
      public Builder setPEPMDOACJNL(int value) {
        
        pEPMDOACJNL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PEPMDOACJNL = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPEPMDOACJNL() {
        
        pEPMDOACJNL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartArenaChallengeLevelRsp)
    }

    // @@protoc_insertion_point(class_scope:StartArenaChallengeLevelRsp)
    private static final emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp();
    }

    public static emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartArenaChallengeLevelRsp>
        PARSER = new com.google.protobuf.AbstractParser<StartArenaChallengeLevelRsp>() {
      @java.lang.Override
      public StartArenaChallengeLevelRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartArenaChallengeLevelRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StartArenaChallengeLevelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartArenaChallengeLevelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartArenaChallengeLevelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!StartArenaChallengeLevelRsp.proto\"r\n\033S" +
      "tartArenaChallengeLevelRsp\022\023\n\013DBPEAEAANP" +
      "G\030\r \001(\r\022\030\n\020gadget_entity_id\030\013 \001(\r\022\017\n\007ret" +
      "code\030\017 \001(\005\022\023\n\013PEPMDOACJNL\030\002 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartArenaChallengeLevelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartArenaChallengeLevelRsp_descriptor,
        new java.lang.String[] { "DBPEAEAANPG", "GadgetEntityId", "Retcode", "PEPMDOACJNL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
