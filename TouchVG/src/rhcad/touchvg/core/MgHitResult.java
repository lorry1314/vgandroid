/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgHitResult {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgHitResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgHitResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgHitResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNearpt(Point2d value) {
    touchvgJNI.MgHitResult_nearpt_set(swigCPtr, this, Point2d.getCPtr(value), value);
  }

  public Point2d getNearpt() {
    long cPtr = touchvgJNI.MgHitResult_nearpt_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Point2d(cPtr, false);
  }

  public void setSegment(int value) {
    touchvgJNI.MgHitResult_segment_set(swigCPtr, this, value);
  }

  public int getSegment() {
    return touchvgJNI.MgHitResult_segment_get(swigCPtr, this);
  }

  public void setInside(boolean value) {
    touchvgJNI.MgHitResult_inside_set(swigCPtr, this, value);
  }

  public boolean getInside() {
    return touchvgJNI.MgHitResult_inside_get(swigCPtr, this);
  }

  public void setContained(boolean value) {
    touchvgJNI.MgHitResult_contained_set(swigCPtr, this, value);
  }

  public boolean getContained() {
    return touchvgJNI.MgHitResult_contained_get(swigCPtr, this);
  }

  public void setDist(float value) {
    touchvgJNI.MgHitResult_dist_set(swigCPtr, this, value);
  }

  public float getDist() {
    return touchvgJNI.MgHitResult_dist_get(swigCPtr, this);
  }

  public MgHitResult() {
    this(touchvgJNI.new_MgHitResult(), true);
  }

}
