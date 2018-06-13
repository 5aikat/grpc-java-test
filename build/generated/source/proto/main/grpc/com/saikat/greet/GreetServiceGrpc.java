package com.saikat.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: greet/greet.proto")
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGreetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.saikat.greet.GreetRequest,
      com.saikat.greet.GreetResponse> METHOD_GREET = getGreetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.saikat.greet.GreetRequest,
      com.saikat.greet.GreetResponse> getGreetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.saikat.greet.GreetRequest,
      com.saikat.greet.GreetResponse> getGreetMethod() {
    return getGreetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.saikat.greet.GreetRequest,
      com.saikat.greet.GreetResponse> getGreetMethodHelper() {
    io.grpc.MethodDescriptor<com.saikat.greet.GreetRequest, com.saikat.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod = 
              io.grpc.MethodDescriptor.<com.saikat.greet.GreetRequest, com.saikat.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "greet.GreetService", "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.GreetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
                  .build();
          }
        }
     }
     return getGreetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGreetManyTimesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.saikat.greet.GreetManyTimesRequest,
      com.saikat.greet.GreetManyTimesResponse> METHOD_GREET_MANY_TIMES = getGreetManyTimesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.saikat.greet.GreetManyTimesRequest,
      com.saikat.greet.GreetManyTimesResponse> getGreetManyTimesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.saikat.greet.GreetManyTimesRequest,
      com.saikat.greet.GreetManyTimesResponse> getGreetManyTimesMethod() {
    return getGreetManyTimesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.saikat.greet.GreetManyTimesRequest,
      com.saikat.greet.GreetManyTimesResponse> getGreetManyTimesMethodHelper() {
    io.grpc.MethodDescriptor<com.saikat.greet.GreetManyTimesRequest, com.saikat.greet.GreetManyTimesResponse> getGreetManyTimesMethod;
    if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
          GreetServiceGrpc.getGreetManyTimesMethod = getGreetManyTimesMethod = 
              io.grpc.MethodDescriptor.<com.saikat.greet.GreetManyTimesRequest, com.saikat.greet.GreetManyTimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.GreetService", "GreetManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.GreetManyTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.GreetManyTimesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyTimes"))
                  .build();
          }
        }
     }
     return getGreetManyTimesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongGreetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.saikat.greet.LongGreetRequest,
      com.saikat.greet.LongGreetResponse> METHOD_LONG_GREET = getLongGreetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.saikat.greet.LongGreetRequest,
      com.saikat.greet.LongGreetResponse> getLongGreetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.saikat.greet.LongGreetRequest,
      com.saikat.greet.LongGreetResponse> getLongGreetMethod() {
    return getLongGreetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.saikat.greet.LongGreetRequest,
      com.saikat.greet.LongGreetResponse> getLongGreetMethodHelper() {
    io.grpc.MethodDescriptor<com.saikat.greet.LongGreetRequest, com.saikat.greet.LongGreetResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
          GreetServiceGrpc.getLongGreetMethod = getLongGreetMethod = 
              io.grpc.MethodDescriptor.<com.saikat.greet.LongGreetRequest, com.saikat.greet.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.GreetService", "LongGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.LongGreetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("LongGreet"))
                  .build();
          }
        }
     }
     return getLongGreetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGreetEveryoneMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.saikat.greet.GreetEveryoneRequest,
      com.saikat.greet.GreetEveryoneResponse> METHOD_GREET_EVERYONE = getGreetEveryoneMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.saikat.greet.GreetEveryoneRequest,
      com.saikat.greet.GreetEveryoneResponse> getGreetEveryoneMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.saikat.greet.GreetEveryoneRequest,
      com.saikat.greet.GreetEveryoneResponse> getGreetEveryoneMethod() {
    return getGreetEveryoneMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.saikat.greet.GreetEveryoneRequest,
      com.saikat.greet.GreetEveryoneResponse> getGreetEveryoneMethodHelper() {
    io.grpc.MethodDescriptor<com.saikat.greet.GreetEveryoneRequest, com.saikat.greet.GreetEveryoneResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod = 
              io.grpc.MethodDescriptor.<com.saikat.greet.GreetEveryoneRequest, com.saikat.greet.GreetEveryoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.GreetService", "GreetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.GreetEveryoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.greet.GreetEveryoneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetEveryone"))
                  .build();
          }
        }
     }
     return getGreetEveryoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    return new GreetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary gRPC API
     * </pre>
     */
    public void greet(com.saikat.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.saikat.greet.GreetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *Server Streaming gRPC API
     * </pre>
     */
    public void greetManyTimes(com.saikat.greet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.saikat.greet.GreetManyTimesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetManyTimesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming gRPC API
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.saikat.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.saikat.greet.LongGreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLongGreetMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *Bi-directional Streaming gRPC API
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.saikat.greet.GreetEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.saikat.greet.GreetEveryoneResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetEveryoneMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.saikat.greet.GreetRequest,
                com.saikat.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimesMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.saikat.greet.GreetManyTimesRequest,
                com.saikat.greet.GreetManyTimesResponse>(
                  this, METHODID_GREET_MANY_TIMES)))
          .addMethod(
            getLongGreetMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.saikat.greet.LongGreetRequest,
                com.saikat.greet.LongGreetResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryoneMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.saikat.greet.GreetEveryoneRequest,
                com.saikat.greet.GreetEveryoneResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractStub<GreetServiceStub> {
    private GreetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary gRPC API
     * </pre>
     */
    public void greet(com.saikat.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.saikat.greet.GreetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server Streaming gRPC API
     * </pre>
     */
    public void greetManyTimes(com.saikat.greet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.saikat.greet.GreetManyTimesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming gRPC API
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.saikat.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.saikat.greet.LongGreetResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bi-directional Streaming gRPC API
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.saikat.greet.GreetEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.saikat.greet.GreetEveryoneResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary gRPC API
     * </pre>
     */
    public com.saikat.greet.GreetResponse greet(com.saikat.greet.GreetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server Streaming gRPC API
     * </pre>
     */
    public java.util.Iterator<com.saikat.greet.GreetManyTimesResponse> greetManyTimes(
        com.saikat.greet.GreetManyTimesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetManyTimesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary gRPC API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saikat.greet.GreetResponse> greet(
        com.saikat.greet.GreetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIMES = 1;
  private static final int METHODID_LONG_GREET = 2;
  private static final int METHODID_GREET_EVERYONE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.saikat.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.saikat.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIMES:
          serviceImpl.greetManyTimes((com.saikat.greet.GreetManyTimesRequest) request,
              (io.grpc.stub.StreamObserver<com.saikat.greet.GreetManyTimesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.saikat.greet.LongGreetResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.saikat.greet.GreetEveryoneResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saikat.greet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethodHelper())
              .addMethod(getGreetManyTimesMethodHelper())
              .addMethod(getLongGreetMethodHelper())
              .addMethod(getGreetEveryoneMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
