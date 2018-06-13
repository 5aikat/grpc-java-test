// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.saikat.greet;

/**
 * Protobuf type {@code greet.GreetRequest}
 */
public  final class GreetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greet.GreetRequest)
    GreetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreetRequest.newBuilder() to construct.
  private GreetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreetRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GreetRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.saikat.greet.Greeting.Builder subBuilder = null;
            if (greeting_ != null) {
              subBuilder = greeting_.toBuilder();
            }
            greeting_ = input.readMessage(com.saikat.greet.Greeting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(greeting_);
              greeting_ = subBuilder.buildPartial();
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
    return com.saikat.greet.Greet.internal_static_greet_GreetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.saikat.greet.Greet.internal_static_greet_GreetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.saikat.greet.GreetRequest.class, com.saikat.greet.GreetRequest.Builder.class);
  }

  public static final int GREETING_FIELD_NUMBER = 1;
  private com.saikat.greet.Greeting greeting_;
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  public boolean hasGreeting() {
    return greeting_ != null;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  public com.saikat.greet.Greeting getGreeting() {
    return greeting_ == null ? com.saikat.greet.Greeting.getDefaultInstance() : greeting_;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  public com.saikat.greet.GreetingOrBuilder getGreetingOrBuilder() {
    return getGreeting();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (greeting_ != null) {
      output.writeMessage(1, getGreeting());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (greeting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGreeting());
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
    if (!(obj instanceof com.saikat.greet.GreetRequest)) {
      return super.equals(obj);
    }
    com.saikat.greet.GreetRequest other = (com.saikat.greet.GreetRequest) obj;

    boolean result = true;
    result = result && (hasGreeting() == other.hasGreeting());
    if (hasGreeting()) {
      result = result && getGreeting()
          .equals(other.getGreeting());
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
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGreeting()) {
      hash = (37 * hash) + GREETING_FIELD_NUMBER;
      hash = (53 * hash) + getGreeting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.saikat.greet.GreetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saikat.greet.GreetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.saikat.greet.GreetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saikat.greet.GreetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.saikat.greet.GreetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.saikat.greet.GreetRequest parseFrom(
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
  public static Builder newBuilder(com.saikat.greet.GreetRequest prototype) {
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
   * Protobuf type {@code greet.GreetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.GreetRequest)
      com.saikat.greet.GreetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.saikat.greet.Greet.internal_static_greet_GreetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.saikat.greet.Greet.internal_static_greet_GreetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.saikat.greet.GreetRequest.class, com.saikat.greet.GreetRequest.Builder.class);
    }

    // Construct using com.saikat.greet.GreetRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (greetingBuilder_ == null) {
        greeting_ = null;
      } else {
        greeting_ = null;
        greetingBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.saikat.greet.Greet.internal_static_greet_GreetRequest_descriptor;
    }

    public com.saikat.greet.GreetRequest getDefaultInstanceForType() {
      return com.saikat.greet.GreetRequest.getDefaultInstance();
    }

    public com.saikat.greet.GreetRequest build() {
      com.saikat.greet.GreetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.saikat.greet.GreetRequest buildPartial() {
      com.saikat.greet.GreetRequest result = new com.saikat.greet.GreetRequest(this);
      if (greetingBuilder_ == null) {
        result.greeting_ = greeting_;
      } else {
        result.greeting_ = greetingBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.saikat.greet.GreetRequest) {
        return mergeFrom((com.saikat.greet.GreetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.saikat.greet.GreetRequest other) {
      if (other == com.saikat.greet.GreetRequest.getDefaultInstance()) return this;
      if (other.hasGreeting()) {
        mergeGreeting(other.getGreeting());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.saikat.greet.GreetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.saikat.greet.GreetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.saikat.greet.Greeting greeting_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.saikat.greet.Greeting, com.saikat.greet.Greeting.Builder, com.saikat.greet.GreetingOrBuilder> greetingBuilder_;
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public boolean hasGreeting() {
      return greetingBuilder_ != null || greeting_ != null;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.saikat.greet.Greeting getGreeting() {
      if (greetingBuilder_ == null) {
        return greeting_ == null ? com.saikat.greet.Greeting.getDefaultInstance() : greeting_;
      } else {
        return greetingBuilder_.getMessage();
      }
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(com.saikat.greet.Greeting value) {
      if (greetingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        greeting_ = value;
        onChanged();
      } else {
        greetingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(
        com.saikat.greet.Greeting.Builder builderForValue) {
      if (greetingBuilder_ == null) {
        greeting_ = builderForValue.build();
        onChanged();
      } else {
        greetingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder mergeGreeting(com.saikat.greet.Greeting value) {
      if (greetingBuilder_ == null) {
        if (greeting_ != null) {
          greeting_ =
            com.saikat.greet.Greeting.newBuilder(greeting_).mergeFrom(value).buildPartial();
        } else {
          greeting_ = value;
        }
        onChanged();
      } else {
        greetingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder clearGreeting() {
      if (greetingBuilder_ == null) {
        greeting_ = null;
        onChanged();
      } else {
        greeting_ = null;
        greetingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.saikat.greet.Greeting.Builder getGreetingBuilder() {
      
      onChanged();
      return getGreetingFieldBuilder().getBuilder();
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.saikat.greet.GreetingOrBuilder getGreetingOrBuilder() {
      if (greetingBuilder_ != null) {
        return greetingBuilder_.getMessageOrBuilder();
      } else {
        return greeting_ == null ?
            com.saikat.greet.Greeting.getDefaultInstance() : greeting_;
      }
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.saikat.greet.Greeting, com.saikat.greet.Greeting.Builder, com.saikat.greet.GreetingOrBuilder> 
        getGreetingFieldBuilder() {
      if (greetingBuilder_ == null) {
        greetingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.saikat.greet.Greeting, com.saikat.greet.Greeting.Builder, com.saikat.greet.GreetingOrBuilder>(
                getGreeting(),
                getParentForChildren(),
                isClean());
        greeting_ = null;
      }
      return greetingBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:greet.GreetRequest)
  }

  // @@protoc_insertion_point(class_scope:greet.GreetRequest)
  private static final com.saikat.greet.GreetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.saikat.greet.GreetRequest();
  }

  public static com.saikat.greet.GreetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreetRequest>
      PARSER = new com.google.protobuf.AbstractParser<GreetRequest>() {
    public GreetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GreetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GreetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreetRequest> getParserForType() {
    return PARSER;
  }

  public com.saikat.greet.GreetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

