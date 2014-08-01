/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class CmdSubject extends CmdObserver {
  private long swigCPtr;

  protected CmdSubject(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.CmdSubject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CmdSubject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_CmdSubject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void registerObserver(CmdObserver observer) {
    touchvgJNI.CmdSubject_registerObserver(swigCPtr, this, CmdObserver.getCPtr(observer), observer);
  }

  public void unregisterObserver(CmdObserver observer) {
    touchvgJNI.CmdSubject_unregisterObserver(swigCPtr, this, CmdObserver.getCPtr(observer), observer);
  }

}
