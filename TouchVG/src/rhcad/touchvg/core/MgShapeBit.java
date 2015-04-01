/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class MgShapeBit {
  public final static MgShapeBit kMgSquare = new MgShapeBit("kMgSquare");
  public final static MgShapeBit kMgClosed = new MgShapeBit("kMgClosed");
  public final static MgShapeBit kMgFixedLength = new MgShapeBit("kMgFixedLength");
  public final static MgShapeBit kMgFixedSize = new MgShapeBit("kMgFixedSize");
  public final static MgShapeBit kMgRotateDisnable = new MgShapeBit("kMgRotateDisnable");
  public final static MgShapeBit kMgLocked = new MgShapeBit("kMgLocked");
  public final static MgShapeBit kMgNoSnap = new MgShapeBit("kMgNoSnap");
  public final static MgShapeBit kMgNoAction = new MgShapeBit("kMgNoAction");
  public final static MgShapeBit kMgNoClone = new MgShapeBit("kMgNoClone");
  public final static MgShapeBit kMgHideContent = new MgShapeBit("kMgHideContent");
  public final static MgShapeBit kMgNoDel = new MgShapeBit("kMgNoDel");
  public final static MgShapeBit kMgCanSelLocked = new MgShapeBit("kMgCanSelLocked");
  public final static MgShapeBit kMgNotAddRel = new MgShapeBit("kMgNotAddRel");
  public final static MgShapeBit kMgNotShowSnap = new MgShapeBit("kMgNotShowSnap");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MgShapeBit swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MgShapeBit.class + " with value " + swigValue);
  }

  private MgShapeBit(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MgShapeBit(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MgShapeBit(String swigName, MgShapeBit swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MgShapeBit[] swigValues = { kMgSquare, kMgClosed, kMgFixedLength, kMgFixedSize, kMgRotateDisnable, kMgLocked, kMgNoSnap, kMgNoAction, kMgNoClone, kMgHideContent, kMgNoDel, kMgCanSelLocked, kMgNotAddRel, kMgNotShowSnap };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

