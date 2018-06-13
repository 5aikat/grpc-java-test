package com.saikat.sum;

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
    comments = "Source: Sum/sum.proto")
public final class SumServiceGrpc {

  private SumServiceGrpc() {}

  public static final String SERVICE_NAME = "sum.SumService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSumMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.saikat.sum.SumRequest,
      com.saikat.sum.SumResponse> METHOD_SUM = getSumMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.saikat.sum.SumRequest,
      com.saikat.sum.SumResponse> getSumMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.saikat.sum.SumRequest,
      com.saikat.sum.SumResponse> getSumMethod() {
    return getSumMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.saikat.sum.SumRequest,
      com.saikat.sum.SumResponse> getSumMethodHelper() {
    io.grpc.MethodDescriptor<com.saikat.sum.SumRequest, com.saikat.sum.SumResponse> getSumMethod;
    if ((getSumMethod = SumServiceGrpc.getSumMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getSumMethod = SumServiceGrpc.getSumMethod) == null) {
          SumServiceGrpc.getSumMethod = getSumMethod = 
              io.grpc.MethodDescriptor.<com.saikat.sum.SumRequest, com.saikat.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sum.SumService", "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saikat.sum.SumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("Sum"))
                  .build();
          }
        }
     }
     return getSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumServiceStub newStub(io.grpc.Channel channel) {
    return new SumServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SumServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SumServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.saikat.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.saikat.sum.SumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSumMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.saikat.sum.SumRequest,
                com.saikat.sum.SumResponse>(
                  this, METHODID_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class SumServiceStub extends io.grpc.stub.AbstractStub<SumServiceStub> {
    private SumServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SumServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SumServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.saikat.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.saikat.sum.SumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSumMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SumServiceBlockingStub extends io.grpc.stub.AbstractStub<SumServiceBlockingStub> {
    private SumServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SumServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.saikat.sum.SumResponse sum(com.saikat.sum.SumRequest request) {
      return blockingUnaryCall(
          getChannel(), getSumMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SumServiceFutureStub extends io.grpc.stub.AbstractStub<SumServiceFutureStub> {
    private SumServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SumServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saikat.sum.SumResponse> sum(
        com.saikat.sum.SumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSumMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.saikat.sum.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.saikat.sum.SumResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saikat.sum.Sum.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SumService");
    }
  }

  private static final class SumServiceFileDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier {
    SumServiceFileDescriptorSupplier() {}
  }

  private static final class SumServiceMethodDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SumServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumServiceFileDescriptorSupplier())
              .addMethod(getSumMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
