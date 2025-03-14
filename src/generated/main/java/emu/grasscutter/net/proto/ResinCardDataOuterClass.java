// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResinCardData.proto

package emu.grasscutter.net.proto;

public final class ResinCardDataOuterClass {
  private ResinCardDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResinCardDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResinCardData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 4;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 expire_time = 6;</code>
     * @return The expireTime.
     */
    int getExpireTime();

    /**
     * <code>uint32 GAOEKIGIGBP = 10;</code>
     * @return The gAOEKIGIGBP.
     */
    int getGAOEKIGIGBP();

    /**
     * <code>uint32 remain_reward_days = 7;</code>
     * @return The remainRewardDays.
     */
    int getRemainRewardDays();
  }
  /**
   * <pre>
   * Obf: BHBOJFOBDPL
   * </pre>
   *
   * Protobuf type {@code ResinCardData}
   */
  public static final class ResinCardData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResinCardData)
      ResinCardDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResinCardData.newBuilder() to construct.
    private ResinCardData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResinCardData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResinCardData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResinCardData(
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
            case 32: {

              configId_ = input.readUInt32();
              break;
            }
            case 48: {

              expireTime_ = input.readUInt32();
              break;
            }
            case 56: {

              remainRewardDays_ = input.readUInt32();
              break;
            }
            case 80: {

              gAOEKIGIGBP_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ResinCardDataOuterClass.internal_static_ResinCardData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ResinCardDataOuterClass.internal_static_ResinCardData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.class, emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 4;
    private int configId_;
    /**
     * <code>uint32 config_id = 4;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int EXPIRE_TIME_FIELD_NUMBER = 6;
    private int expireTime_;
    /**
     * <code>uint32 expire_time = 6;</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public int getExpireTime() {
      return expireTime_;
    }

    public static final int GAOEKIGIGBP_FIELD_NUMBER = 10;
    private int gAOEKIGIGBP_;
    /**
     * <code>uint32 GAOEKIGIGBP = 10;</code>
     * @return The gAOEKIGIGBP.
     */
    @java.lang.Override
    public int getGAOEKIGIGBP() {
      return gAOEKIGIGBP_;
    }

    public static final int REMAIN_REWARD_DAYS_FIELD_NUMBER = 7;
    private int remainRewardDays_;
    /**
     * <code>uint32 remain_reward_days = 7;</code>
     * @return The remainRewardDays.
     */
    @java.lang.Override
    public int getRemainRewardDays() {
      return remainRewardDays_;
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
      if (configId_ != 0) {
        output.writeUInt32(4, configId_);
      }
      if (expireTime_ != 0) {
        output.writeUInt32(6, expireTime_);
      }
      if (remainRewardDays_ != 0) {
        output.writeUInt32(7, remainRewardDays_);
      }
      if (gAOEKIGIGBP_ != 0) {
        output.writeUInt32(10, gAOEKIGIGBP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, configId_);
      }
      if (expireTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, expireTime_);
      }
      if (remainRewardDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, remainRewardDays_);
      }
      if (gAOEKIGIGBP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gAOEKIGIGBP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData other = (emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
      if (getExpireTime()
          != other.getExpireTime()) return false;
      if (getGAOEKIGIGBP()
          != other.getGAOEKIGIGBP()) return false;
      if (getRemainRewardDays()
          != other.getRemainRewardDays()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime();
      hash = (37 * hash) + GAOEKIGIGBP_FIELD_NUMBER;
      hash = (53 * hash) + getGAOEKIGIGBP();
      hash = (37 * hash) + REMAIN_REWARD_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getRemainRewardDays();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData prototype) {
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
     * Obf: BHBOJFOBDPL
     * </pre>
     *
     * Protobuf type {@code ResinCardData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResinCardData)
        emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ResinCardDataOuterClass.internal_static_ResinCardData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ResinCardDataOuterClass.internal_static_ResinCardData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.class, emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.newBuilder()
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
        configId_ = 0;

        expireTime_ = 0;

        gAOEKIGIGBP_ = 0;

        remainRewardDays_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ResinCardDataOuterClass.internal_static_ResinCardData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData build() {
        emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData buildPartial() {
        emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData result = new emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData(this);
        result.configId_ = configId_;
        result.expireTime_ = expireTime_;
        result.gAOEKIGIGBP_ = gAOEKIGIGBP_;
        result.remainRewardDays_ = remainRewardDays_;
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
        if (other instanceof emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData) {
          return mergeFrom((emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData other) {
        if (other == emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getExpireTime() != 0) {
          setExpireTime(other.getExpireTime());
        }
        if (other.getGAOEKIGIGBP() != 0) {
          setGAOEKIGIGBP(other.getGAOEKIGIGBP());
        }
        if (other.getRemainRewardDays() != 0) {
          setRemainRewardDays(other.getRemainRewardDays());
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
        emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 4;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 4;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int expireTime_ ;
      /**
       * <code>uint32 expire_time = 6;</code>
       * @return The expireTime.
       */
      @java.lang.Override
      public int getExpireTime() {
        return expireTime_;
      }
      /**
       * <code>uint32 expire_time = 6;</code>
       * @param value The expireTime to set.
       * @return This builder for chaining.
       */
      public Builder setExpireTime(int value) {
        
        expireTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 expire_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearExpireTime() {
        
        expireTime_ = 0;
        onChanged();
        return this;
      }

      private int gAOEKIGIGBP_ ;
      /**
       * <code>uint32 GAOEKIGIGBP = 10;</code>
       * @return The gAOEKIGIGBP.
       */
      @java.lang.Override
      public int getGAOEKIGIGBP() {
        return gAOEKIGIGBP_;
      }
      /**
       * <code>uint32 GAOEKIGIGBP = 10;</code>
       * @param value The gAOEKIGIGBP to set.
       * @return This builder for chaining.
       */
      public Builder setGAOEKIGIGBP(int value) {
        
        gAOEKIGIGBP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GAOEKIGIGBP = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGAOEKIGIGBP() {
        
        gAOEKIGIGBP_ = 0;
        onChanged();
        return this;
      }

      private int remainRewardDays_ ;
      /**
       * <code>uint32 remain_reward_days = 7;</code>
       * @return The remainRewardDays.
       */
      @java.lang.Override
      public int getRemainRewardDays() {
        return remainRewardDays_;
      }
      /**
       * <code>uint32 remain_reward_days = 7;</code>
       * @param value The remainRewardDays to set.
       * @return This builder for chaining.
       */
      public Builder setRemainRewardDays(int value) {
        
        remainRewardDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 remain_reward_days = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainRewardDays() {
        
        remainRewardDays_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ResinCardData)
    }

    // @@protoc_insertion_point(class_scope:ResinCardData)
    private static final emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData();
    }

    public static emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResinCardData>
        PARSER = new com.google.protobuf.AbstractParser<ResinCardData>() {
      @java.lang.Override
      public ResinCardData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResinCardData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResinCardData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResinCardData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ResinCardDataOuterClass.ResinCardData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResinCardData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResinCardData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ResinCardData.proto\"h\n\rResinCardData\022\021" +
      "\n\tconfig_id\030\004 \001(\r\022\023\n\013expire_time\030\006 \001(\r\022\023" +
      "\n\013GAOEKIGIGBP\030\n \001(\r\022\032\n\022remain_reward_day" +
      "s\030\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ResinCardData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResinCardData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResinCardData_descriptor,
        new java.lang.String[] { "ConfigId", "ExpireTime", "GAOEKIGIGBP", "RemainRewardDays", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
