/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgGrid extends MgBaseRect {
  private long swigCPtr;

  protected MgGrid(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgGrid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgGrid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgGrid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MgGrid() {
    this(touchvgJNI.new_MgGrid(), true);
  }

  public static MgGrid create() {
    long cPtr = touchvgJNI.MgGrid_create();
    return (cPtr == 0) ? null : new MgGrid(cPtr, false);
  }

  public static int Type() {
    return touchvgJNI.MgGrid_Type();
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgGrid_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgGrid_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgGrid_release(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgGrid_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgGrid_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgGrid_isKindOf(swigCPtr, this, type);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgGrid_getExtent(swigCPtr, this), true);
  }

  public void update() {
    touchvgJNI.MgGrid_update(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgGrid_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void clear() {
    touchvgJNI.MgGrid_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgGrid_clearCachedData(swigCPtr, this);
  }

  public int getPointCount() {
    return touchvgJNI.MgGrid_getPointCount(swigCPtr, this);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgGrid_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgGrid_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public boolean isClosed() {
    return touchvgJNI.MgGrid_isClosed(swigCPtr, this);
  }

  public boolean hitTestBox(Box2d rect) {
    return touchvgJNI.MgGrid_hitTestBox(swigCPtr, this, Box2d.getCPtr(rect), rect);
  }

  public boolean draw(int mode, GiGraphics gs, GiContext ctx, int segment) {
    return touchvgJNI.MgGrid_draw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, segment);
  }

  public void output(GiPath path) {
    touchvgJNI.MgGrid_output(swigCPtr, this, GiPath.getCPtr(path), path);
  }

  public boolean save(MgStorage s) {
    return touchvgJNI.MgGrid_save(swigCPtr, this, MgStorage.getCPtr(s), s);
  }

  public boolean load(MgShapeFactory factory, MgStorage s) {
    return touchvgJNI.MgGrid_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s);
  }

  public int getHandleCount() {
    return touchvgJNI.MgGrid_getHandleCount(swigCPtr, this);
  }

  public Point2d getHandlePoint(int index) {
    return new Point2d(touchvgJNI.MgGrid_getHandlePoint(swigCPtr, this, index), true);
  }

  public boolean setHandlePoint(int index, Point2d pt, float tol) {
    return touchvgJNI.MgGrid_setHandlePoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt, tol);
  }

  public boolean isHandleFixed(int index) {
    return touchvgJNI.MgGrid_isHandleFixed(swigCPtr, this, index);
  }

  public int getHandleType(int index) {
    return touchvgJNI.MgGrid_getHandleType(swigCPtr, this, index);
  }

  public boolean offset(Vector2d vec, int segment) {
    return touchvgJNI.MgGrid_offset(swigCPtr, this, Vector2d.getCPtr(vec), vec, segment);
  }

  public float hitTest(Point2d pt, float tol, MgHitResult res) {
    return touchvgJNI.MgGrid_hitTest(swigCPtr, this, Point2d.getCPtr(pt), pt, tol, MgHitResult.getCPtr(res), res);
  }

  public int snap(Point2d pnt, Point2d dist) {
    return touchvgJNI.MgGrid_snap(swigCPtr, this, Point2d.getCPtr(pnt), pnt, Point2d.getCPtr(dist), dist);
  }

  public boolean isValid(float tol) {
    return touchvgJNI.MgGrid_isValid(swigCPtr, this, tol);
  }

}
