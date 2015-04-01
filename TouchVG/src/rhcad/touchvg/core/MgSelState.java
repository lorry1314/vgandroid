/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class MgSelState {
  public final static MgSelState kMgSelNone = new MgSelState("kMgSelNone");
  public final static MgSelState kMgSelOneShape = new MgSelState("kMgSelOneShape");
  public final static MgSelState kMgSelMultiShapes = new MgSelState("kMgSelMultiShapes");
  public final static MgSelState kMgSelVertexes = new MgSelState("kMgSelVertexes");
  public final static MgSelState kMgSelVertex = new MgSelState("kMgSelVertex");
  public final static MgSelState kMgSelDraw = new MgSelState("kMgSelDraw");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MgSelState swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MgSelState.class + " with value " + swigValue);
  }

  private MgSelState(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MgSelState(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MgSelState(String swigName, MgSelState swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MgSelState[] swigValues = { kMgSelNone, kMgSelOneShape, kMgSelMultiShapes, kMgSelVertexes, kMgSelVertex, kMgSelDraw };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

