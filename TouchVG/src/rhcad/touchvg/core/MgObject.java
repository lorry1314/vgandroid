/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgObject {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    touchvgJNI.MgObject_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.MgObject_change_ownership(this, swigCPtr, true);
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgObject_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgObject_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgObject_release(swigCPtr, this);
  }

  public void addRef() {
    touchvgJNI.MgObject_addRef(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgObject_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgObject_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgObject_isKindOf(swigCPtr, this, type);
  }

  public MgObject() {
    this(touchvgJNI.new_MgObject(), true);
    touchvgJNI.MgObject_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
