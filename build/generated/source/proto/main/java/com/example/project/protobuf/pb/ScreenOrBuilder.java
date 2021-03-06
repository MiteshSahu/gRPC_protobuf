// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: screen_message.proto

package com.example.project.protobuf.pb;

public interface ScreenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:example.protobuf.Screen)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float size_inch = 1;</code>
   * @return The sizeInch.
   */
  float getSizeInch();

  /**
   * <code>.example.protobuf.Screen.Resolution resolution = 2;</code>
   * @return Whether the resolution field is set.
   */
  boolean hasResolution();
  /**
   * <code>.example.protobuf.Screen.Resolution resolution = 2;</code>
   * @return The resolution.
   */
  com.example.project.protobuf.pb.Screen.Resolution getResolution();
  /**
   * <code>.example.protobuf.Screen.Resolution resolution = 2;</code>
   */
  com.example.project.protobuf.pb.Screen.ResolutionOrBuilder getResolutionOrBuilder();

  /**
   * <code>.example.protobuf.Screen.Panel panel = 3;</code>
   * @return The enum numeric value on the wire for panel.
   */
  int getPanelValue();
  /**
   * <code>.example.protobuf.Screen.Panel panel = 3;</code>
   * @return The panel.
   */
  com.example.project.protobuf.pb.Screen.Panel getPanel();

  /**
   * <code>bool multitouch = 4;</code>
   * @return The multitouch.
   */
  boolean getMultitouch();
}
