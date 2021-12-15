package io.grpc.process;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: main/proto/server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProcessServiceGrpc {

  private ProcessServiceGrpc() {}

  public static final String SERVICE_NAME = "process.ProcessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.process.MessageRequest,
      io.grpc.process.MessageReply> getProcessMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessMessage",
      requestType = io.grpc.process.MessageRequest.class,
      responseType = io.grpc.process.MessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.process.MessageRequest,
      io.grpc.process.MessageReply> getProcessMessageMethod() {
    io.grpc.MethodDescriptor<io.grpc.process.MessageRequest, io.grpc.process.MessageReply> getProcessMessageMethod;
    if ((getProcessMessageMethod = ProcessServiceGrpc.getProcessMessageMethod) == null) {
      synchronized (ProcessServiceGrpc.class) {
        if ((getProcessMessageMethod = ProcessServiceGrpc.getProcessMessageMethod) == null) {
          ProcessServiceGrpc.getProcessMessageMethod = getProcessMessageMethod =
              io.grpc.MethodDescriptor.<io.grpc.process.MessageRequest, io.grpc.process.MessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.process.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.process.MessageReply.getDefaultInstance()))
              .setSchemaDescriptor(new ProcessServiceMethodDescriptorSupplier("ProcessMessage"))
              .build();
        }
      }
    }
    return getProcessMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProcessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessServiceStub>() {
        @java.lang.Override
        public ProcessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessServiceStub(channel, callOptions);
        }
      };
    return ProcessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProcessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessServiceBlockingStub>() {
        @java.lang.Override
        public ProcessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessServiceBlockingStub(channel, callOptions);
        }
      };
    return ProcessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProcessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessServiceFutureStub>() {
        @java.lang.Override
        public ProcessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessServiceFutureStub(channel, callOptions);
        }
      };
    return ProcessServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProcessServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.process.MessageRequest> processMessage(
        io.grpc.stub.StreamObserver<io.grpc.process.MessageReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getProcessMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessMessageMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.process.MessageRequest,
                io.grpc.process.MessageReply>(
                  this, METHODID_PROCESS_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ProcessServiceStub extends io.grpc.stub.AbstractAsyncStub<ProcessServiceStub> {
    private ProcessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.process.MessageRequest> processMessage(
        io.grpc.stub.StreamObserver<io.grpc.process.MessageReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getProcessMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ProcessServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProcessServiceBlockingStub> {
    private ProcessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ProcessServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProcessServiceFutureStub> {
    private ProcessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PROCESS_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProcessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProcessServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_PROCESS_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.processMessage(
              (io.grpc.stub.StreamObserver<io.grpc.process.MessageReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProcessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.process.ProcessServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProcessService");
    }
  }

  private static final class ProcessServiceFileDescriptorSupplier
      extends ProcessServiceBaseDescriptorSupplier {
    ProcessServiceFileDescriptorSupplier() {}
  }

  private static final class ProcessServiceMethodDescriptorSupplier
      extends ProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProcessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProcessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProcessServiceFileDescriptorSupplier())
              .addMethod(getProcessMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
