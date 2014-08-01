/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgCommandDraw extends MgCommand {
  private long swigCPtr;

  protected MgCommandDraw(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgCommandDraw_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgCommandDraw obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgCommandDraw(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    touchvgJNI.MgCommandDraw_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.MgCommandDraw_change_ownership(this, swigCPtr, true);
  }

  public MgCommandDraw(String name) {
    this(touchvgJNI.new_MgCommandDraw(name), true);
    touchvgJNI.MgCommandDraw_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public MgShape addShape(MgMotion sender, MgShape shape) {
    long cPtr = touchvgJNI.MgCommandDraw_addShape__SWIG_0(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgShape.getCPtr(shape), shape);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public MgShape addShape(MgMotion sender) {
    long cPtr = touchvgJNI.MgCommandDraw_addShape__SWIG_1(swigCPtr, this, MgMotion.getCPtr(sender), sender);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public boolean touchBeganStep(MgMotion sender) {
    return touchvgJNI.MgCommandDraw_touchBeganStep(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchMovedStep(MgMotion sender) {
    return touchvgJNI.MgCommandDraw_touchMovedStep(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchEndedStep(MgMotion sender) {
    return touchvgJNI.MgCommandDraw_touchEndedStep(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public int getShapeType() {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_getShapeType(swigCPtr, this) : touchvgJNI.MgCommandDraw_getShapeTypeSwigExplicitMgCommandDraw(swigCPtr, this);
  }

  protected int getMaxStep() {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_getMaxStep(swigCPtr, this) : touchvgJNI.MgCommandDraw_getMaxStepSwigExplicitMgCommandDraw(swigCPtr, this);
  }

  protected void setStepPoint(int step, Point2d pt) {
    if (getClass() == MgCommandDraw.class) touchvgJNI.MgCommandDraw_setStepPoint(swigCPtr, this, step, Point2d.getCPtr(pt), pt); else touchvgJNI.MgCommandDraw_setStepPointSwigExplicitMgCommandDraw(swigCPtr, this, step, Point2d.getCPtr(pt), pt);
  }

  public boolean initialize(MgMotion sender, MgStorage arg1) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_initialize(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgStorage.getCPtr(arg1), arg1) : touchvgJNI.MgCommandDraw_initializeSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgStorage.getCPtr(arg1), arg1);
  }

  public boolean backStep(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_backStep(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_backStepSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean cancel(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_cancel(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_cancelSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean draw(MgMotion sender, GiGraphics gs) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_draw(swigCPtr, this, MgMotion.getCPtr(sender), sender, GiGraphics.getCPtr(gs), gs) : touchvgJNI.MgCommandDraw_drawSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender, GiGraphics.getCPtr(gs), gs);
  }

  public boolean gatherShapes(MgMotion sender, MgShapes shapes) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_gatherShapes(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgShapes.getCPtr(shapes), shapes) : touchvgJNI.MgCommandDraw_gatherShapesSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgShapes.getCPtr(shapes), shapes);
  }

  public boolean touchBegan(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_touchBegan(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_touchBeganSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchMoved(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_touchMoved(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_touchMovedSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchEnded(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_touchEnded(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_touchEndedSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean click(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_click(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_clickSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean longPress(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_longPress(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_longPressSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean mouseHover(MgMotion sender) {
    return (getClass() == MgCommandDraw.class) ? touchvgJNI.MgCommandDraw_mouseHover(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCommandDraw_mouseHoverSwigExplicitMgCommandDraw(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public int getStep() {
    return touchvgJNI.MgCommandDraw_getStep(swigCPtr, this);
  }

  public MgShape dynshape() {
    long cPtr = touchvgJNI.MgCommandDraw_dynshape(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public void setStep(int step) {
    touchvgJNI.MgCommandDraw_setStep(swigCPtr, this, step);
  }

  public Point2d snapPoint(MgMotion sender, boolean firstStep) {
    return new Point2d(touchvgJNI.MgCommandDraw_snapPoint__SWIG_0(swigCPtr, this, MgMotion.getCPtr(sender), sender, firstStep), true);
  }

  public Point2d snapPoint(MgMotion sender) {
    return new Point2d(touchvgJNI.MgCommandDraw_snapPoint__SWIG_1(swigCPtr, this, MgMotion.getCPtr(sender), sender), true);
  }

  public Point2d snapPoint(MgMotion sender, Point2d orignPt, boolean firstStep) {
    return new Point2d(touchvgJNI.MgCommandDraw_snapPoint__SWIG_2(swigCPtr, this, MgMotion.getCPtr(sender), sender, Point2d.getCPtr(orignPt), orignPt, firstStep), true);
  }

  public Point2d snapPoint(MgMotion sender, Point2d orignPt) {
    return new Point2d(touchvgJNI.MgCommandDraw_snapPoint__SWIG_3(swigCPtr, this, MgMotion.getCPtr(sender), sender, Point2d.getCPtr(orignPt), orignPt), true);
  }

}
