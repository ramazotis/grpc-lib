// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/server.proto

package io.grpc.examples.server;

public final class ServerProto {
  private ServerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_process_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_process_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_process_MessageReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_process_MessageReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027main/proto/server.proto\022\007process\"\036\n\016Me" +
      "ssageRequest\022\014\n\004name\030\001 \001(\t\"3\n\014MessageRep" +
      "ly\022\022\n\nkafkaTopic\030\001 \001(\t\022\017\n\007message\030\002 \001(\t2" +
      "L\n\007Process\022A\n\tSendReply\022\027.process.Messag" +
      "eRequest\032\025.process.MessageReply\"\000(\0010\001B1\n" +
      "\027io.grpc.examples.serverB\013ServerProtoP\001\210" +
      "\001\001\242\002\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_process_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_process_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_process_MessageRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_process_MessageReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_process_MessageReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_process_MessageReply_descriptor,
        new java.lang.String[] { "KafkaTopic", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}