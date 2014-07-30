/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiPlaying {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiPlaying(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiPlaying obj) {
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

  public static GiPlaying fromHandle(int h) {
    long cPtr = touchvgJNI.GiPlaying_fromHandle(h);
    return (cPtr == 0) ? null : new GiPlaying(cPtr, false);
  }

  public int toHandle() {
    return touchvgJNI.GiPlaying_toHandle(swigCPtr, this);
  }

  public static GiPlaying create(MgCoreView v, int tag, boolean doubleSided) {
    long cPtr = touchvgJNI.GiPlaying_create__SWIG_0(MgCoreView.getCPtr(v), v, tag, doubleSided);
    return (cPtr == 0) ? null : new GiPlaying(cPtr, false);
  }

  public static GiPlaying create(MgCoreView v, int tag) {
    long cPtr = touchvgJNI.GiPlaying_create__SWIG_1(MgCoreView.getCPtr(v), v, tag);
    return (cPtr == 0) ? null : new GiPlaying(cPtr, false);
  }

  public void release(MgCoreView v) {
    touchvgJNI.GiPlaying_release(swigCPtr, this, MgCoreView.getCPtr(v), v);
  }

  public void clear() {
    touchvgJNI.GiPlaying_clear(swigCPtr, this);
  }

  public int getTag() {
    return touchvgJNI.GiPlaying_getTag(swigCPtr, this);
  }

  public int acquireFrontDoc() {
    return touchvgJNI.GiPlaying_acquireFrontDoc(swigCPtr, this);
  }

  public static void releaseDoc(int doc) {
    touchvgJNI.GiPlaying_releaseDoc(doc);
  }

  public MgShapeDoc getBackDoc() {
    long cPtr = touchvgJNI.GiPlaying_getBackDoc(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public void submitBackDoc() {
    touchvgJNI.GiPlaying_submitBackDoc(swigCPtr, this);
  }

  public int acquireFrontShapes() {
    return touchvgJNI.GiPlaying_acquireFrontShapes(swigCPtr, this);
  }

  public static void releaseShapes(int shapes) {
    touchvgJNI.GiPlaying_releaseShapes(shapes);
  }

  public int getBackShapesHandle(boolean needClear) {
    return touchvgJNI.GiPlaying_getBackShapesHandle(swigCPtr, this, needClear);
  }

  public MgShapes getBackShapes(boolean needClear) {
    long cPtr = touchvgJNI.GiPlaying_getBackShapes(swigCPtr, this, needClear);
    return (cPtr == 0) ? null : new MgShapes(cPtr, false);
  }

  public void submitBackShapes() {
    touchvgJNI.GiPlaying_submitBackShapes(swigCPtr, this);
  }

  public void stop() {
    touchvgJNI.GiPlaying_stop(swigCPtr, this);
  }

  public boolean isStopping() {
    return touchvgJNI.GiPlaying_isStopping(swigCPtr, this);
  }

  public final static int kDrawingTag = -1;
  public final static int kPlayingTag = -2;

}
