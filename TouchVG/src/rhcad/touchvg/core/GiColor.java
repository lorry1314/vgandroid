/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiColor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiColor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiColor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiColor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setR(short value) {
    touchvgJNI.GiColor_r_set(swigCPtr, this, value);
  }

  public short getR() {
    return touchvgJNI.GiColor_r_get(swigCPtr, this);
  }

  public void setG(short value) {
    touchvgJNI.GiColor_g_set(swigCPtr, this, value);
  }

  public short getG() {
    return touchvgJNI.GiColor_g_get(swigCPtr, this);
  }

  public void setB(short value) {
    touchvgJNI.GiColor_b_set(swigCPtr, this, value);
  }

  public short getB() {
    return touchvgJNI.GiColor_b_get(swigCPtr, this);
  }

  public void setA(short value) {
    touchvgJNI.GiColor_a_set(swigCPtr, this, value);
  }

  public short getA() {
    return touchvgJNI.GiColor_a_get(swigCPtr, this);
  }

  public GiColor() {
    this(touchvgJNI.new_GiColor__SWIG_0(), true);
  }

  public GiColor(int _r, int _g, int _b, int _a) {
    this(touchvgJNI.new_GiColor__SWIG_1(_r, _g, _b, _a), true);
  }

  public GiColor(int _r, int _g, int _b) {
    this(touchvgJNI.new_GiColor__SWIG_2(_r, _g, _b), true);
  }

  public GiColor(GiColor c) {
    this(touchvgJNI.new_GiColor__SWIG_3(GiColor.getCPtr(c), c), true);
  }

  public GiColor(int rgb, boolean alpha) {
    this(touchvgJNI.new_GiColor__SWIG_4(rgb, alpha), true);
  }

  public GiColor(int rgb) {
    this(touchvgJNI.new_GiColor__SWIG_5(rgb), true);
  }

  public static GiColor White() {
    return new GiColor(touchvgJNI.GiColor_White(), true);
  }

  public static GiColor Black() {
    return new GiColor(touchvgJNI.GiColor_Black(), true);
  }

  public static GiColor Blue() {
    return new GiColor(touchvgJNI.GiColor_Blue(), true);
  }

  public static GiColor Red() {
    return new GiColor(touchvgJNI.GiColor_Red(), true);
  }

  public static GiColor Green() {
    return new GiColor(touchvgJNI.GiColor_Green(), true);
  }

  public static GiColor Invalid() {
    return new GiColor(touchvgJNI.GiColor_Invalid(), true);
  }

  public int getARGB() {
    return touchvgJNI.GiColor_getARGB(swigCPtr, this);
  }

  public void setARGB(int value) {
    touchvgJNI.GiColor_setARGB(swigCPtr, this, value);
  }

  public void set(int _r, int _g, int _b) {
    touchvgJNI.GiColor_set__SWIG_0(swigCPtr, this, _r, _g, _b);
  }

  public void set(int _r, int _g, int _b, int _a) {
    touchvgJNI.GiColor_set__SWIG_1(swigCPtr, this, _r, _g, _b, _a);
  }

  public boolean isInvalid() {
    return touchvgJNI.GiColor_isInvalid(swigCPtr, this);
  }

  public boolean equals(GiColor src) {
    return touchvgJNI.GiColor_equals(swigCPtr, this, GiColor.getCPtr(src), src);
  }

}
