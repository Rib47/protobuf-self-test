// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: address.proto

package com.example.address;

public final class AddressBookProto {
  private AddressBookProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddressBookOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.address.AddressBook)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    java.util.List<com.example.address.PersonProto.Person> 
        getPersonList();
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    com.example.address.PersonProto.Person getPerson(int index);
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    int getPersonCount();
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    java.util.List<? extends com.example.address.PersonProto.PersonOrBuilder> 
        getPersonOrBuilderList();
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    com.example.address.PersonProto.PersonOrBuilder getPersonOrBuilder(
            int index);
  }
  /**
   * Protobuf type {@code com.example.address.AddressBook}
   */
  public  static final class AddressBook extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.address.AddressBook)
      AddressBookOrBuilder {
    // Use AddressBook.newBuilder() to construct.
    private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddressBook() {
      person_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddressBook(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                person_ = new java.util.ArrayList<com.example.address.PersonProto.Person>();
                mutable_bitField0_ |= 0x00000001;
              }
              person_.add(
                  input.readMessage(com.example.address.PersonProto.Person.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          person_ = java.util.Collections.unmodifiableList(person_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AddressBookProto.internal_static_com_example_address_AddressBook_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AddressBookProto.internal_static_com_example_address_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddressBook.class, Builder.class);
    }

    public static final int PERSON_FIELD_NUMBER = 1;
    private java.util.List<com.example.address.PersonProto.Person> person_;
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    public java.util.List<com.example.address.PersonProto.Person> getPersonList() {
      return person_;
    }
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    public java.util.List<? extends com.example.address.PersonProto.PersonOrBuilder> 
        getPersonOrBuilderList() {
      return person_;
    }
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    public int getPersonCount() {
      return person_.size();
    }
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    public com.example.address.PersonProto.Person getPerson(int index) {
      return person_.get(index);
    }
    /**
     * <code>repeated .com.example.address.Person person = 1;</code>
     */
    public com.example.address.PersonProto.PersonOrBuilder getPersonOrBuilder(
        int index) {
      return person_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPersonCount(); i++) {
        if (!getPerson(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < person_.size(); i++) {
        output.writeMessage(1, person_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < person_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, person_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof AddressBook)) {
        return super.equals(obj);
      }
      AddressBook other = (AddressBook) obj;

      boolean result = true;
      result = result && getPersonList()
          .equals(other.getPersonList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (getPersonCount() > 0) {
        hash = (37 * hash) + PERSON_FIELD_NUMBER;
        hash = (53 * hash) + getPersonList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AddressBook parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBook parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBook parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddressBook parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddressBook parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressBook parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressBook parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AddressBook parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddressBook parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddressBook parseFrom(
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
    public static Builder newBuilder(AddressBook prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.address.AddressBook}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.address.AddressBook)
        AddressBookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddressBookProto.internal_static_com_example_address_AddressBook_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddressBookProto.internal_static_com_example_address_AddressBook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddressBook.class, Builder.class);
      }

      // Construct using com.example.address.AddressBookProto.AddressBook.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPersonFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (personBuilder_ == null) {
          person_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          personBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AddressBookProto.internal_static_com_example_address_AddressBook_descriptor;
      }

      public AddressBook getDefaultInstanceForType() {
        return AddressBook.getDefaultInstance();
      }

      public AddressBook build() {
        AddressBook result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public AddressBook buildPartial() {
        AddressBook result = new AddressBook(this);
        int from_bitField0_ = bitField0_;
        if (personBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            person_ = java.util.Collections.unmodifiableList(person_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.person_ = person_;
        } else {
          result.person_ = personBuilder_.build();
        }
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
        if (other instanceof AddressBook) {
          return mergeFrom((AddressBook)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AddressBook other) {
        if (other == AddressBook.getDefaultInstance()) return this;
        if (personBuilder_ == null) {
          if (!other.person_.isEmpty()) {
            if (person_.isEmpty()) {
              person_ = other.person_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePersonIsMutable();
              person_.addAll(other.person_);
            }
            onChanged();
          }
        } else {
          if (!other.person_.isEmpty()) {
            if (personBuilder_.isEmpty()) {
              personBuilder_.dispose();
              personBuilder_ = null;
              person_ = other.person_;
              bitField0_ = (bitField0_ & ~0x00000001);
              personBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPersonFieldBuilder() : null;
            } else {
              personBuilder_.addAllMessages(other.person_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getPersonCount(); i++) {
          if (!getPerson(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        AddressBook parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AddressBook) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.example.address.PersonProto.Person> person_ =
        java.util.Collections.emptyList();
      private void ensurePersonIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          person_ = new java.util.ArrayList<com.example.address.PersonProto.Person>(person_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.example.address.PersonProto.Person, com.example.address.PersonProto.Person.Builder, com.example.address.PersonProto.PersonOrBuilder> personBuilder_;

      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public java.util.List<com.example.address.PersonProto.Person> getPersonList() {
        if (personBuilder_ == null) {
          return java.util.Collections.unmodifiableList(person_);
        } else {
          return personBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public int getPersonCount() {
        if (personBuilder_ == null) {
          return person_.size();
        } else {
          return personBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public com.example.address.PersonProto.Person getPerson(int index) {
        if (personBuilder_ == null) {
          return person_.get(index);
        } else {
          return personBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder setPerson(
          int index, com.example.address.PersonProto.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.set(index, value);
          onChanged();
        } else {
          personBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder setPerson(
          int index, com.example.address.PersonProto.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.set(index, builderForValue.build());
          onChanged();
        } else {
          personBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder addPerson(com.example.address.PersonProto.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.add(value);
          onChanged();
        } else {
          personBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder addPerson(
          int index, com.example.address.PersonProto.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePersonIsMutable();
          person_.add(index, value);
          onChanged();
        } else {
          personBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder addPerson(
          com.example.address.PersonProto.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.add(builderForValue.build());
          onChanged();
        } else {
          personBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder addPerson(
          int index, com.example.address.PersonProto.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.add(index, builderForValue.build());
          onChanged();
        } else {
          personBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder addAllPerson(
          Iterable<? extends com.example.address.PersonProto.Person> values) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, person_);
          onChanged();
        } else {
          personBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder clearPerson() {
        if (personBuilder_ == null) {
          person_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          personBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public Builder removePerson(int index) {
        if (personBuilder_ == null) {
          ensurePersonIsMutable();
          person_.remove(index);
          onChanged();
        } else {
          personBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public com.example.address.PersonProto.Person.Builder getPersonBuilder(
          int index) {
        return getPersonFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public com.example.address.PersonProto.PersonOrBuilder getPersonOrBuilder(
          int index) {
        if (personBuilder_ == null) {
          return person_.get(index);  } else {
          return personBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public java.util.List<? extends com.example.address.PersonProto.PersonOrBuilder> 
           getPersonOrBuilderList() {
        if (personBuilder_ != null) {
          return personBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(person_);
        }
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public com.example.address.PersonProto.Person.Builder addPersonBuilder() {
        return getPersonFieldBuilder().addBuilder(
            com.example.address.PersonProto.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public com.example.address.PersonProto.Person.Builder addPersonBuilder(
          int index) {
        return getPersonFieldBuilder().addBuilder(
            index, com.example.address.PersonProto.Person.getDefaultInstance());
      }
      /**
       * <code>repeated .com.example.address.Person person = 1;</code>
       */
      public java.util.List<com.example.address.PersonProto.Person.Builder> 
           getPersonBuilderList() {
        return getPersonFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.example.address.PersonProto.Person, com.example.address.PersonProto.Person.Builder, com.example.address.PersonProto.PersonOrBuilder> 
          getPersonFieldBuilder() {
        if (personBuilder_ == null) {
          personBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.example.address.PersonProto.Person, com.example.address.PersonProto.Person.Builder, com.example.address.PersonProto.PersonOrBuilder>(
                  person_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          person_ = null;
        }
        return personBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.example.address.AddressBook)
    }

    // @@protoc_insertion_point(class_scope:com.example.address.AddressBook)
    private static final AddressBook DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AddressBook();
    }

    public static AddressBook getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<AddressBook>
        PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
      public AddressBook parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddressBook(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddressBook> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AddressBook> getParserForType() {
      return PARSER;
    }

    public AddressBook getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_address_AddressBook_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_address_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\raddress.proto\022\023com.example.address\032\014pe" +
      "rson.proto\":\n\013AddressBook\022+\n\006person\030\001 \003(" +
      "\0132\033.com.example.address.PersonB\'\n\023com.ex" +
      "ample.addressB\020AddressBookProto"
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
          com.example.address.PersonProto.getDescriptor(),
        }, assigner);
    internal_static_com_example_address_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_address_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_address_AddressBook_descriptor,
        new String[] { "Person", });
    com.example.address.PersonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}