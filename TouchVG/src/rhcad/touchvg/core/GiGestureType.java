/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class GiGestureType {
  public final static GiGestureType kGiGestureUnknown = new GiGestureType("kGiGestureUnknown");
  public final static GiGestureType kGiGesturePan = new GiGestureType("kGiGesturePan");
  public final static GiGestureType kGiGestureTap = new GiGestureType("kGiGestureTap");
  public final static GiGestureType kGiGestureDblTap = new GiGestureType("kGiGestureDblTap");
  public final static GiGestureType kGiGesturePress = new GiGestureType("kGiGesturePress");
  public final static GiGestureType kGiTwoFingersMove = new GiGestureType("kGiTwoFingersMove");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GiGestureType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GiGestureType.class + " with value " + swigValue);
  }

  private GiGestureType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GiGestureType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GiGestureType(String swigName, GiGestureType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GiGestureType[] swigValues = { kGiGestureUnknown, kGiGesturePan, kGiGestureTap, kGiGestureDblTap, kGiGesturePress, kGiTwoFingersMove };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

