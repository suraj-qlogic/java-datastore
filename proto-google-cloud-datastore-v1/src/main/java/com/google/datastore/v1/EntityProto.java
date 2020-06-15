/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/entity.proto

package com.google.datastore.v1;

public final class EntityProto {
  private EntityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_PartitionId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_PartitionId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_Key_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_Key_PathElement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Key_PathElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_ArrayValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ArrayValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_datastore_v1_Entity_PropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Entity_PropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/datastore/v1/entity.proto\022\023goog"
          + "le.datastore.v1\032\034google/api/annotations."
          + "proto\032\034google/protobuf/struct.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\032\030google/typ"
          + "e/latlng.proto\"7\n\013PartitionId\022\022\n\nproject"
          + "_id\030\002 \001(\t\022\024\n\014namespace_id\030\004 \001(\t\"\267\001\n\003Key\022"
          + "6\n\014partition_id\030\001 \001(\0132 .google.datastore"
          + ".v1.PartitionId\0222\n\004path\030\002 \003(\0132$.google.d"
          + "atastore.v1.Key.PathElement\032D\n\013PathEleme"
          + "nt\022\014\n\004kind\030\001 \001(\t\022\014\n\002id\030\002 \001(\003H\000\022\016\n\004name\030\003"
          + " \001(\tH\000B\t\n\007id_type\"8\n\nArrayValue\022*\n\006value"
          + "s\030\001 \003(\0132\032.google.datastore.v1.Value\"\361\003\n\005"
          + "Value\0220\n\nnull_value\030\013 \001(\0162\032.google.proto"
          + "buf.NullValueH\000\022\027\n\rboolean_value\030\001 \001(\010H\000"
          + "\022\027\n\rinteger_value\030\002 \001(\003H\000\022\026\n\014double_valu"
          + "e\030\003 \001(\001H\000\0225\n\017timestamp_value\030\n \001(\0132\032.goo"
          + "gle.protobuf.TimestampH\000\022-\n\tkey_value\030\005 "
          + "\001(\0132\030.google.datastore.v1.KeyH\000\022\026\n\014strin"
          + "g_value\030\021 \001(\tH\000\022\024\n\nblob_value\030\022 \001(\014H\000\022.\n"
          + "\017geo_point_value\030\010 \001(\0132\023.google.type.Lat"
          + "LngH\000\0223\n\014entity_value\030\006 \001(\0132\033.google.dat"
          + "astore.v1.EntityH\000\0226\n\013array_value\030\t \001(\0132"
          + "\037.google.datastore.v1.ArrayValueH\000\022\017\n\007me"
          + "aning\030\016 \001(\005\022\034\n\024exclude_from_indexes\030\023 \001("
          + "\010B\014\n\nvalue_type\"\277\001\n\006Entity\022%\n\003key\030\001 \001(\0132"
          + "\030.google.datastore.v1.Key\022?\n\nproperties\030"
          + "\003 \003(\0132+.google.datastore.v1.Entity.Prope"
          + "rtiesEntry\032M\n\017PropertiesEntry\022\013\n\003key\030\001 \001"
          + "(\t\022)\n\005value\030\002 \001(\0132\032.google.datastore.v1."
          + "Value:\0028\001B\275\001\n\027com.google.datastore.v1B\013E"
          + "ntityProtoP\001Z<google.golang.org/genproto"
          + "/googleapis/datastore/v1;datastore\252\002\031Goo"
          + "gle.Cloud.Datastore.V1\312\002\031Google\\Cloud\\Da"
          + "tastore\\V1\352\002\034Google::Cloud::Datastore::V"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
            });
    internal_static_google_datastore_v1_PartitionId_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_datastore_v1_PartitionId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_PartitionId_descriptor,
            new java.lang.String[] {
              "ProjectId", "NamespaceId",
            });
    internal_static_google_datastore_v1_Key_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_google_datastore_v1_Key_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_Key_descriptor,
            new java.lang.String[] {
              "PartitionId", "Path",
            });
    internal_static_google_datastore_v1_Key_PathElement_descriptor =
        internal_static_google_datastore_v1_Key_descriptor.getNestedTypes().get(0);
    internal_static_google_datastore_v1_Key_PathElement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_Key_PathElement_descriptor,
            new java.lang.String[] {
              "Kind", "Id", "Name", "IdType",
            });
    internal_static_google_datastore_v1_ArrayValue_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_datastore_v1_ArrayValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_ArrayValue_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_datastore_v1_Value_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_google_datastore_v1_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_Value_descriptor,
            new java.lang.String[] {
              "NullValue",
              "BooleanValue",
              "IntegerValue",
              "DoubleValue",
              "TimestampValue",
              "KeyValue",
              "StringValue",
              "BlobValue",
              "GeoPointValue",
              "EntityValue",
              "ArrayValue",
              "Meaning",
              "ExcludeFromIndexes",
              "ValueType",
            });
    internal_static_google_datastore_v1_Entity_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_datastore_v1_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_Entity_descriptor,
            new java.lang.String[] {
              "Key", "Properties",
            });
    internal_static_google_datastore_v1_Entity_PropertiesEntry_descriptor =
        internal_static_google_datastore_v1_Entity_descriptor.getNestedTypes().get(0);
    internal_static_google_datastore_v1_Entity_PropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_datastore_v1_Entity_PropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
