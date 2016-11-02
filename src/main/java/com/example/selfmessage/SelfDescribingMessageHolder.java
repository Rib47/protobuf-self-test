// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: selfmessage.proto

package com.example.selfmessage;

public final class SelfDescribingMessageHolder {
  private SelfDescribingMessageHolder() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelfDescribingMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:selfmessage.SelfDescribingMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Set of .proto files which define the type.
     * </pre>
     *
     * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
     */
    boolean hasProtoDescriptor();
    /**
     * <pre>
     * Set of .proto files which define the type.
     * </pre>
     *
     * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
     */
    com.google.protobuf.DescriptorProtos.FileDescriptorProto getProtoDescriptor();
    /**
     * <pre>
     * Set of .proto files which define the type.
     * </pre>
     *
     * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
     */
    com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder getProtoDescriptorOrBuilder();

    /**
     * <pre>
     * The message data.
     * </pre>
     *
     * <code>required bytes message_data = 3;</code>
     */
    boolean hasMessageData();
    /**
     * <pre>
     * The message data.
     * </pre>
     *
     * <code>required bytes message_data = 3;</code>
     */
    com.google.protobuf.ByteString getMessageData();
  }
  /**
   * Protobuf type {@code selfmessage.SelfDescribingMessage}
   */
  public  static final class SelfDescribingMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:selfmessage.SelfDescribingMessage)
      SelfDescribingMessageOrBuilder {
    // Use SelfDescribingMessage.newBuilder() to construct.
    private SelfDescribingMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelfDescribingMessage() {
      messageData_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SelfDescribingMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = protoDescriptor_.toBuilder();
              }
              protoDescriptor_ = input.readMessage(com.google.protobuf.DescriptorProtos.FileDescriptorProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(protoDescriptor_);
                protoDescriptor_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 26: {
              bitField0_ |= 0x00000002;
              messageData_ = input.readBytes();
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
      return com.example.selfmessage.SelfDescribingMessageHolder.internal_static_selfmessage_SelfDescribingMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.selfmessage.SelfDescribingMessageHolder.internal_static_selfmessage_SelfDescribingMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.class, com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.Builder.class);
    }

    private int bitField0_;
    public static final int PROTO_DESCRIPTOR_FIELD_NUMBER = 1;
    private com.google.protobuf.DescriptorProtos.FileDescriptorProto protoDescriptor_;
    /**
     * <pre>
     * Set of .proto files which define the type.
     * </pre>
     *
     * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
     */
    public boolean hasProtoDescriptor() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Set of .proto files which define the type.
     * </pre>
     *
     * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
     */
    public com.google.protobuf.DescriptorProtos.FileDescriptorProto getProtoDescriptor() {
      return protoDescriptor_ == null ? com.google.protobuf.DescriptorProtos.FileDescriptorProto.getDefaultInstance() : protoDescriptor_;
    }
    /**
     * <pre>
     * Set of .proto files which define the type.
     * </pre>
     *
     * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
     */
    public com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder getProtoDescriptorOrBuilder() {
      return protoDescriptor_ == null ? com.google.protobuf.DescriptorProtos.FileDescriptorProto.getDefaultInstance() : protoDescriptor_;
    }

    public static final int MESSAGE_DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString messageData_;
    /**
     * <pre>
     * The message data.
     * </pre>
     *
     * <code>required bytes message_data = 3;</code>
     */
    public boolean hasMessageData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * The message data.
     * </pre>
     *
     * <code>required bytes message_data = 3;</code>
     */
    public com.google.protobuf.ByteString getMessageData() {
      return messageData_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasProtoDescriptor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMessageData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getProtoDescriptor().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getProtoDescriptor());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(3, messageData_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getProtoDescriptor());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, messageData_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage)) {
        return super.equals(obj);
      }
      com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage other = (com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage) obj;

      boolean result = true;
      result = result && (hasProtoDescriptor() == other.hasProtoDescriptor());
      if (hasProtoDescriptor()) {
        result = result && getProtoDescriptor()
            .equals(other.getProtoDescriptor());
      }
      result = result && (hasMessageData() == other.hasMessageData());
      if (hasMessageData()) {
        result = result && getMessageData()
            .equals(other.getMessageData());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasProtoDescriptor()) {
        hash = (37 * hash) + PROTO_DESCRIPTOR_FIELD_NUMBER;
        hash = (53 * hash) + getProtoDescriptor().hashCode();
      }
      if (hasMessageData()) {
        hash = (37 * hash) + MESSAGE_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getMessageData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code selfmessage.SelfDescribingMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:selfmessage.SelfDescribingMessage)
        com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.selfmessage.SelfDescribingMessageHolder.internal_static_selfmessage_SelfDescribingMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.selfmessage.SelfDescribingMessageHolder.internal_static_selfmessage_SelfDescribingMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.class, com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.Builder.class);
      }

      // Construct using com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.newBuilder()
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
          getProtoDescriptorFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (protoDescriptorBuilder_ == null) {
          protoDescriptor_ = null;
        } else {
          protoDescriptorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        messageData_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.selfmessage.SelfDescribingMessageHolder.internal_static_selfmessage_SelfDescribingMessage_descriptor;
      }

      public com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage getDefaultInstanceForType() {
        return com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.getDefaultInstance();
      }

      public com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage build() {
        com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage buildPartial() {
        com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage result = new com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (protoDescriptorBuilder_ == null) {
          result.protoDescriptor_ = protoDescriptor_;
        } else {
          result.protoDescriptor_ = protoDescriptorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.messageData_ = messageData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage) {
          return mergeFrom((com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage other) {
        if (other == com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage.getDefaultInstance()) return this;
        if (other.hasProtoDescriptor()) {
          mergeProtoDescriptor(other.getProtoDescriptor());
        }
        if (other.hasMessageData()) {
          setMessageData(other.getMessageData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasProtoDescriptor()) {
          return false;
        }
        if (!hasMessageData()) {
          return false;
        }
        if (!getProtoDescriptor().isInitialized()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.DescriptorProtos.FileDescriptorProto protoDescriptor_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DescriptorProtos.FileDescriptorProto, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder, com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder> protoDescriptorBuilder_;
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public boolean hasProtoDescriptor() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public com.google.protobuf.DescriptorProtos.FileDescriptorProto getProtoDescriptor() {
        if (protoDescriptorBuilder_ == null) {
          return protoDescriptor_ == null ? com.google.protobuf.DescriptorProtos.FileDescriptorProto.getDefaultInstance() : protoDescriptor_;
        } else {
          return protoDescriptorBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public Builder setProtoDescriptor(com.google.protobuf.DescriptorProtos.FileDescriptorProto value) {
        if (protoDescriptorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          protoDescriptor_ = value;
          onChanged();
        } else {
          protoDescriptorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public Builder setProtoDescriptor(
          com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder builderForValue) {
        if (protoDescriptorBuilder_ == null) {
          protoDescriptor_ = builderForValue.build();
          onChanged();
        } else {
          protoDescriptorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public Builder mergeProtoDescriptor(com.google.protobuf.DescriptorProtos.FileDescriptorProto value) {
        if (protoDescriptorBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              protoDescriptor_ != null &&
              protoDescriptor_ != com.google.protobuf.DescriptorProtos.FileDescriptorProto.getDefaultInstance()) {
            protoDescriptor_ =
              com.google.protobuf.DescriptorProtos.FileDescriptorProto.newBuilder(protoDescriptor_).mergeFrom(value).buildPartial();
          } else {
            protoDescriptor_ = value;
          }
          onChanged();
        } else {
          protoDescriptorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public Builder clearProtoDescriptor() {
        if (protoDescriptorBuilder_ == null) {
          protoDescriptor_ = null;
          onChanged();
        } else {
          protoDescriptorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder getProtoDescriptorBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getProtoDescriptorFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      public com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder getProtoDescriptorOrBuilder() {
        if (protoDescriptorBuilder_ != null) {
          return protoDescriptorBuilder_.getMessageOrBuilder();
        } else {
          return protoDescriptor_ == null ?
              com.google.protobuf.DescriptorProtos.FileDescriptorProto.getDefaultInstance() : protoDescriptor_;
        }
      }
      /**
       * <pre>
       * Set of .proto files which define the type.
       * </pre>
       *
       * <code>required .google.protobuf.FileDescriptorProto proto_descriptor = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.DescriptorProtos.FileDescriptorProto, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder, com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder> 
          getProtoDescriptorFieldBuilder() {
        if (protoDescriptorBuilder_ == null) {
          protoDescriptorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.DescriptorProtos.FileDescriptorProto, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder, com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder>(
                  getProtoDescriptor(),
                  getParentForChildren(),
                  isClean());
          protoDescriptor_ = null;
        }
        return protoDescriptorBuilder_;
      }

      private com.google.protobuf.ByteString messageData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * The message data.
       * </pre>
       *
       * <code>required bytes message_data = 3;</code>
       */
      public boolean hasMessageData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       * The message data.
       * </pre>
       *
       * <code>required bytes message_data = 3;</code>
       */
      public com.google.protobuf.ByteString getMessageData() {
        return messageData_;
      }
      /**
       * <pre>
       * The message data.
       * </pre>
       *
       * <code>required bytes message_data = 3;</code>
       */
      public Builder setMessageData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        messageData_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The message data.
       * </pre>
       *
       * <code>required bytes message_data = 3;</code>
       */
      public Builder clearMessageData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        messageData_ = getDefaultInstance().getMessageData();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:selfmessage.SelfDescribingMessage)
    }

    // @@protoc_insertion_point(class_scope:selfmessage.SelfDescribingMessage)
    private static final com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage();
    }

    public static com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SelfDescribingMessage>
        PARSER = new com.google.protobuf.AbstractParser<SelfDescribingMessage>() {
      public SelfDescribingMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SelfDescribingMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SelfDescribingMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelfDescribingMessage> getParserForType() {
      return PARSER;
    }

    public com.example.selfmessage.SelfDescribingMessageHolder.SelfDescribingMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_selfmessage_SelfDescribingMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_selfmessage_SelfDescribingMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021selfmessage.proto\022\013selfmessage\032 google" +
      "/protobuf/descriptor.proto\"m\n\025SelfDescri" +
      "bingMessage\022>\n\020proto_descriptor\030\001 \002(\0132$." +
      "google.protobuf.FileDescriptorProto\022\024\n\014m" +
      "essage_data\030\003 \002(\014B6\n\027com.example.selfmes" +
      "sageB\033SelfDescribingMessageHolder"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    internal_static_selfmessage_SelfDescribingMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_selfmessage_SelfDescribingMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_selfmessage_SelfDescribingMessage_descriptor,
        new java.lang.String[] { "ProtoDescriptor", "MessageData", });
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
