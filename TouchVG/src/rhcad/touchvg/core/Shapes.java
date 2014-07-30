/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class Shapes {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Shapes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Shapes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_Shapes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Shapes(int n) {
    this(touchvgJNI.new_Shapes__SWIG_0(n), true);
  }

  public Shapes() {
    this(touchvgJNI.new_Shapes__SWIG_1(), true);
  }

  public void setSize(int n) {
    touchvgJNI.Shapes_setSize(swigCPtr, this, n);
  }

  public Shapes(MgShape v1, MgShape v2) {
    this(touchvgJNI.new_Shapes__SWIG_2(MgShape.getCPtr(v1), v1, MgShape.getCPtr(v2), v2), true);
  }

  public Shapes(MgShape v1, MgShape v2, MgShape v3, MgShape v4) {
    this(touchvgJNI.new_Shapes__SWIG_3(MgShape.getCPtr(v1), v1, MgShape.getCPtr(v2), v2, MgShape.getCPtr(v3), v3, MgShape.getCPtr(v4), v4), true);
  }

  public int count() {
    return touchvgJNI.Shapes_count(swigCPtr, this);
  }

  public MgShape get(int index) {
    long cPtr = touchvgJNI.Shapes_get(swigCPtr, this, index);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public void set(int index, MgShape value) {
    touchvgJNI.Shapes_set__SWIG_0(swigCPtr, this, index, MgShape.getCPtr(value), value);
  }

  public void set(int index, MgShape v1, MgShape v2) {
    touchvgJNI.Shapes_set__SWIG_1(swigCPtr, this, index, MgShape.getCPtr(v1), v1, MgShape.getCPtr(v2), v2);
  }

}
