package io.grpc.examples.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: main/proto/server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProcessGrpc {

  private ProcessGrpc() {}

  public static final String SERVICE_NAME = "process.Process";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.server.MessageRequest,
      io.grpc.examples.server.MessageReply> getSendReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendReply",
      requestType = io.grpc.examples.server.MessageRequest.class,
      responseType = io.grpc.examples.server.MessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.server.MessageRequest,
      io.grpc.examples.server.MessageReply> getSendReplyMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.server.MessageRequest, io.grpc.examples.server.MessageReply> getSendReplyMethod;
    if ((getSendReplyMethod = ProcessGrpc.getSendReplyMethod) == null) {
      synchronized (ProcessGrpc.class) {
        if ((getSendReplyMethod = ProcessGrpc.getSendReplyMethod) == null) {
          ProcessGrpc.getSendReplyMethod = getSendReplyMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.server.MessageRequest, io.grpc.examples.server.MessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.server.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.server.MessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProcessMethodDescriptorSupplier("SendReply"))
              .build();
        }
      }
    }
    return getSendReplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProcessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessStub>() {
        @java.lang.Override
        public ProcessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessStub(channel, callOptions);
        }
      };
    return ProcessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProcessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessBlockingStub>() {
        @java.lang.Override
        public ProcessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessBlockingStub(channel, callOptions);
        }
      };
    return ProcessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProcessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessFutureStub>() {
        @java.lang.Override
        public ProcessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessFutureStub(channel, callOptions);
        }
      };
    return ProcessFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ProcessImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a message reply
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.server.MessageRequest> sendReply(
        io.grpc.stub.StreamObserver<io.grpc.examples.server.MessageReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendReplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendReplyMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.server.MessageRequest,
                io.grpc.examples.server.MessageReply>(
                  this, METHODID_SEND_REPLY)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ProcessStub extends io.grpc.stub.AbstractAsyncStub<ProcessStub> {
    private ProcessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a message reply
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.server.MessageRequest> sendReply(
        io.grpc.stub.StreamObserver<io.grpc.examples.server.MessageReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendReplyMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ProcessBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProcessBlockingStub> {
    private ProcessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ProcessFutureStub extends io.grpc.stub.AbstractFutureStub<ProcessFutureStub> {
    private ProcessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_REPLY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProcessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProcessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_REPLY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendReply(
              (io.grpc.stub.StreamObserver<io.grpc.examples.server.MessageReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProcessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProcessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.server.ServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Process");
    }
  }

  private static final class ProcessFileDescriptorSupplier
      extends ProcessBaseDescriptorSupplier {
    ProcessFileDescriptorSupplier() {}
  }

  private static final class ProcessMethodDescriptorSupplier
      extends ProcessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProcessMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProcessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProcessFileDescriptorSupplier())
              .addMethod(getSendReplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}