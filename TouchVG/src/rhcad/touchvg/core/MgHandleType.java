/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class MgHandleType {
  public final static MgHandleType kMgHandleVertex = new MgHandleType("kMgHandleVertex");
  public final static MgHandleType kMgHandleCenter = new MgHandleType("kMgHandleCenter");
  public final static MgHandleType kMgHandleMidPoint = new MgHandleType("kMgHandleMidPoint");
  public final static MgHandleType kMgHandleQuadrant = new MgHandleType("kMgHandleQuadrant");
  public final static MgHandleType kMgHandleOutside = new MgHandleType("kMgHandleOutside");
  public final static MgHandleType kMgHandleNoSnap = new MgHandleType("kMgHandleNoSnap");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MgHandleType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MgHandleType.class + " with value " + swigValue);
  }

  private MgHandleType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MgHandleType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MgHandleType(String swigName, MgHandleType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MgHandleType[] swigValues = { kMgHandleVertex, kMgHandleCenter, kMgHandleMidPoint, kMgHandleQuadrant, kMgHandleOutside, kMgHandleNoSnap };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

