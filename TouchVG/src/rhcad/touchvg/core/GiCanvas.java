/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiCanvas {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiCanvas(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiCanvas obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiCanvas(swigCPtr);
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
    touchvgJNI.GiCanvas_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.GiCanvas_change_ownership(this, swigCPtr, true);
  }

  public void setPen(int argb, float width, int style, float phase, float orgw) {
    touchvgJNI.GiCanvas_setPen(swigCPtr, this, argb, width, style, phase, orgw);
  }

  public void setBrush(int argb, int style) {
    touchvgJNI.GiCanvas_setBrush(swigCPtr, this, argb, style);
  }

  public void clearRect(float x, float y, float w, float h) {
    touchvgJNI.GiCanvas_clearRect(swigCPtr, this, x, y, w, h);
  }

  public void drawRect(float x, float y, float w, float h, boolean stroke, boolean fill) {
    touchvgJNI.GiCanvas_drawRect(swigCPtr, this, x, y, w, h, stroke, fill);
  }

  public void drawLine(float x1, float y1, float x2, float y2) {
    touchvgJNI.GiCanvas_drawLine(swigCPtr, this, x1, y1, x2, y2);
  }

  public void drawEllipse(float x, float y, float w, float h, boolean stroke, boolean fill) {
    touchvgJNI.GiCanvas_drawEllipse(swigCPtr, this, x, y, w, h, stroke, fill);
  }

  public void beginPath() {
    touchvgJNI.GiCanvas_beginPath(swigCPtr, this);
  }

  public void moveTo(float x, float y) {
    touchvgJNI.GiCanvas_moveTo(swigCPtr, this, x, y);
  }

  public void lineTo(float x, float y) {
    touchvgJNI.GiCanvas_lineTo(swigCPtr, this, x, y);
  }

  public void bezierTo(float c1x, float c1y, float c2x, float c2y, float x, float y) {
    touchvgJNI.GiCanvas_bezierTo(swigCPtr, this, c1x, c1y, c2x, c2y, x, y);
  }

  public void quadTo(float cpx, float cpy, float x, float y) {
    touchvgJNI.GiCanvas_quadTo(swigCPtr, this, cpx, cpy, x, y);
  }

  public void closePath() {
    touchvgJNI.GiCanvas_closePath(swigCPtr, this);
  }

  public void drawPath(boolean stroke, boolean fill) {
    touchvgJNI.GiCanvas_drawPath(swigCPtr, this, stroke, fill);
  }

  public void saveClip() {
    touchvgJNI.GiCanvas_saveClip(swigCPtr, this);
  }

  public void restoreClip() {
    touchvgJNI.GiCanvas_restoreClip(swigCPtr, this);
  }

  public boolean clipRect(float x, float y, float w, float h) {
    return touchvgJNI.GiCanvas_clipRect(swigCPtr, this, x, y, w, h);
  }

  public boolean clipPath() {
    return touchvgJNI.GiCanvas_clipPath(swigCPtr, this);
  }

  public boolean drawHandle(float x, float y, int type) {
    return touchvgJNI.GiCanvas_drawHandle(swigCPtr, this, x, y, type);
  }

  public boolean drawBitmap(String name, float xc, float yc, float w, float h, float angle) {
    return touchvgJNI.GiCanvas_drawBitmap(swigCPtr, this, name, xc, yc, w, h, angle);
  }

  public float drawTextAt(String text, float x, float y, float h, int align) {
    return touchvgJNI.GiCanvas_drawTextAt(swigCPtr, this, text, x, y, h, align);
  }

  public boolean beginShape(int type, int sid, int version, float x, float y, float w, float h) {
    return (getClass() == GiCanvas.class) ? touchvgJNI.GiCanvas_beginShape(swigCPtr, this, type, sid, version, x, y, w, h) : touchvgJNI.GiCanvas_beginShapeSwigExplicitGiCanvas(swigCPtr, this, type, sid, version, x, y, w, h);
  }

  public void endShape(int type, int sid, float x, float y) {
    if (getClass() == GiCanvas.class) touchvgJNI.GiCanvas_endShape(swigCPtr, this, type, sid, x, y); else touchvgJNI.GiCanvas_endShapeSwigExplicitGiCanvas(swigCPtr, this, type, sid, x, y);
  }

  public GiCanvas() {
    this(touchvgJNI.new_GiCanvas(), true);
    touchvgJNI.GiCanvas_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public final static int kLineDashMask = 0xFFF;
  public final static int kLineCapDefault = 0;
  public final static int kLineCapMask = 0x70000;
  public final static int kLineCapButt = 0x10000;
  public final static int kLineCapRound = 0x20000;
  public final static int kLineCapSquare = 0x40000;

}
