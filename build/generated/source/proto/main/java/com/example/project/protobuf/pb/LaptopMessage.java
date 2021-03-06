// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_message.proto

package com.example.project.protobuf.pb;

public final class LaptopMessage {
  private LaptopMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_protobuf_Laptop_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_protobuf_Laptop_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024laptop_message.proto\022\020example.protobuf" +
      "\032\027processor_message.proto\032\024memory_messag" +
      "e.proto\032\025storage_message.proto\032\024screen_m" +
      "essage.proto\032\026keyboard_message.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\263\003\n\006Laptop" +
      "\022\n\n\002id\030\001 \001(\t\022\r\n\005brand\030\002 \001(\t\022\014\n\004name\030\003 \001(" +
      "\t\022\"\n\003cpu\030\004 \001(\0132\025.example.protobuf.CPU\022%\n" +
      "\003ram\030\005 \001(\0132\030.example.protobuf.Memory\022#\n\004" +
      "gpus\030\006 \003(\0132\025.example.protobuf.GPU\022+\n\010sto" +
      "rages\030\007 \003(\0132\031.example.protobuf.Storage\022(" +
      "\n\006screen\030\010 \001(\0132\030.example.protobuf.Screen" +
      "\022,\n\010keyboard\030\t \001(\0132\032.example.protobuf.Ke" +
      "yboard\022\023\n\tweight_kg\030\n \001(\001H\000\022\023\n\tweight_lb" +
      "\030\013 \001(\001H\000\022\021\n\tprice_usd\030\014 \001(\001\022\024\n\014release_y" +
      "ear\030\r \001(\r\022.\n\nupdated_at\030\016 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\010\n\006weightB\'\n\037com.examp" +
      "le.project.protobuf.pbP\001Z\002pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.project.protobuf.pb.ProcessorMessage.getDescriptor(),
          com.example.project.protobuf.pb.MemoryMessage.getDescriptor(),
          com.example.project.protobuf.pb.StorageMessage.getDescriptor(),
          com.example.project.protobuf.pb.ScreenMessage.getDescriptor(),
          com.example.project.protobuf.pb.KeyboardMessage.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_example_protobuf_Laptop_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_protobuf_Laptop_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_protobuf_Laptop_descriptor,
        new java.lang.String[] { "Id", "Brand", "Name", "Cpu", "Ram", "Gpus", "Storages", "Screen", "Keyboard", "WeightKg", "WeightLb", "PriceUsd", "ReleaseYear", "UpdatedAt", "Weight", });
    com.example.project.protobuf.pb.ProcessorMessage.getDescriptor();
    com.example.project.protobuf.pb.MemoryMessage.getDescriptor();
    com.example.project.protobuf.pb.StorageMessage.getDescriptor();
    com.example.project.protobuf.pb.ScreenMessage.getDescriptor();
    com.example.project.protobuf.pb.KeyboardMessage.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
