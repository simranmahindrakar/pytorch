package org.pytorch;

public enum MemoryFormat {
  CONTIGUOUS(1),
  CHANNELS_LAST(2),
  ;

  final int jniCode;

  DType(int jniCode) {
    this.jniCode = jniCode;
  }
}