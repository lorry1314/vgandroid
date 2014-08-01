/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class mglnrel {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected mglnrel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(mglnrel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_mglnrel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean isLeft(Point2d a, Point2d b, Point2d pt) {
    return touchvgJNI.mglnrel_isLeft(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt);
  }

  public static boolean isLeft2(Point2d a, Point2d b, Point2d pt, Tol tol) {
    return touchvgJNI.mglnrel_isLeft2(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Tol.getCPtr(tol), tol);
  }

  public static boolean isLeftOn(Point2d a, Point2d b, Point2d pt) {
    return touchvgJNI.mglnrel_isLeftOn(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt);
  }

  public static boolean isLeftOn2(Point2d a, Point2d b, Point2d pt, Tol tol) {
    return touchvgJNI.mglnrel_isLeftOn2(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Tol.getCPtr(tol), tol);
  }

  public static boolean isColinear(Point2d a, Point2d b, Point2d pt) {
    return touchvgJNI.mglnrel_isColinear(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt);
  }

  public static boolean isColinear2(Point2d a, Point2d b, Point2d pt, Tol tol) {
    return touchvgJNI.mglnrel_isColinear2(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Tol.getCPtr(tol), tol);
  }

  public static boolean isIntersectProp(Point2d a, Point2d b, Point2d c, Point2d d) {
    return touchvgJNI.mglnrel_isIntersectProp(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(c), c, Point2d.getCPtr(d), d);
  }

  public static boolean isBetweenLine(Point2d a, Point2d b, Point2d pt) {
    return touchvgJNI.mglnrel_isBetweenLine(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt);
  }

  public static boolean isBetweenLine2(Point2d a, Point2d b, Point2d pt, Tol tol) {
    return touchvgJNI.mglnrel_isBetweenLine2(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Tol.getCPtr(tol), tol);
  }

  public static boolean isBetweenLine3(Point2d a, Point2d b, Point2d pt, Point2d nearpt) {
    return touchvgJNI.mglnrel_isBetweenLine3__SWIG_0(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Point2d.getCPtr(nearpt), nearpt);
  }

  public static boolean isBetweenLine3(Point2d a, Point2d b, Point2d pt) {
    return touchvgJNI.mglnrel_isBetweenLine3__SWIG_1(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt);
  }

  public static boolean isIntersect(Point2d a, Point2d b, Point2d c, Point2d d) {
    return touchvgJNI.mglnrel_isIntersect(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(c), c, Point2d.getCPtr(d), d);
  }

  public static float ptToBeeline(Point2d a, Point2d b, Point2d pt) {
    return touchvgJNI.mglnrel_ptToBeeline(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt);
  }

  public static float ptToBeeline2(Point2d a, Point2d b, Point2d pt, Point2d ptPerp) {
    return touchvgJNI.mglnrel_ptToBeeline2(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Point2d.getCPtr(ptPerp), ptPerp);
  }

  public static float ptToLine(Point2d a, Point2d b, Point2d pt, Point2d nearpt) {
    return touchvgJNI.mglnrel_ptToLine(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(pt), pt, Point2d.getCPtr(nearpt), nearpt);
  }

  public static boolean crossLineAbc(float a1, float b1, float c1, float a2, float b2, float c2, Point2d ptCross, Tol tolVec) {
    return touchvgJNI.mglnrel_crossLineAbc__SWIG_0(a1, b1, c1, a2, b2, c2, Point2d.getCPtr(ptCross), ptCross, Tol.getCPtr(tolVec), tolVec);
  }

  public static boolean crossLineAbc(float a1, float b1, float c1, float a2, float b2, float c2, Point2d ptCross) {
    return touchvgJNI.mglnrel_crossLineAbc__SWIG_1(a1, b1, c1, a2, b2, c2, Point2d.getCPtr(ptCross), ptCross);
  }

  public static boolean cross2Line(Point2d a, Point2d b, Point2d c, Point2d d, Point2d ptCross, Tol tolVec) {
    return touchvgJNI.mglnrel_cross2Line__SWIG_0(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(c), c, Point2d.getCPtr(d), d, Point2d.getCPtr(ptCross), ptCross, Tol.getCPtr(tolVec), tolVec);
  }

  public static boolean cross2Line(Point2d a, Point2d b, Point2d c, Point2d d, Point2d ptCross) {
    return touchvgJNI.mglnrel_cross2Line__SWIG_1(Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(c), c, Point2d.getCPtr(d), d, Point2d.getCPtr(ptCross), ptCross);
  }

  public static boolean clipLine(Point2d pt1, Point2d pt2, Box2d box) {
    return touchvgJNI.mglnrel_clipLine(Point2d.getCPtr(pt1), pt1, Point2d.getCPtr(pt2), pt2, Box2d.getCPtr(box), box);
  }

  public mglnrel() {
    this(touchvgJNI.new_mglnrel(), true);
  }

}
