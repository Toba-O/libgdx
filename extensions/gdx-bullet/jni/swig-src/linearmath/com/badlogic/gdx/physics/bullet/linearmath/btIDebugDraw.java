/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btIDebugDraw extends BulletBase {
	private long swigCPtr;
	
	protected btIDebugDraw(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btIDebugDraw, normally you should not need this constructor it's intended for low-level usage. */ 
	public btIDebugDraw(long cPtr, boolean cMemoryOwn) {
		this("btIDebugDraw", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btIDebugDraw obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btIDebugDraw(swigCPtr);
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
    LinearMathJNI.btIDebugDraw_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    LinearMathJNI.btIDebugDraw_change_ownership(this, swigCPtr, true);
  }

  static public class DefaultColors extends BulletBase {
  	private long swigCPtr;
  	
  	protected DefaultColors(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new DefaultColors, normally you should not need this constructor it's intended for low-level usage. */ 
  	public DefaultColors(long cPtr, boolean cMemoryOwn) {
  		this("DefaultColors", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(DefaultColors obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				LinearMathJNI.delete_btIDebugDraw_DefaultColors(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setActiveObject(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_activeObject_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getActiveObject() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_activeObject_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setDeactivatedObject(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_deactivatedObject_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getDeactivatedObject() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_deactivatedObject_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setWantsDeactivationObject(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_wantsDeactivationObject_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getWantsDeactivationObject() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_wantsDeactivationObject_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setDisabledDeactivationObject(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_disabledDeactivationObject_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getDisabledDeactivationObject() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_disabledDeactivationObject_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setDisabledSimulationObject(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_disabledSimulationObject_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getDisabledSimulationObject() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_disabledSimulationObject_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setAabb(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_aabb_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getAabb() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_aabb_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setContactPoint(btVector3 value) {
      LinearMathJNI.btIDebugDraw_DefaultColors_contactPoint_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getContactPoint() {
      long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_contactPoint_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public DefaultColors() {
      this(LinearMathJNI.new_btIDebugDraw_DefaultColors(), true);
    }
  
  }

  public btIDebugDraw.DefaultColors getDefaultColors() {
    return new btIDebugDraw.DefaultColors((getClass() == btIDebugDraw.class) ? LinearMathJNI.btIDebugDraw_getDefaultColors(swigCPtr, this) : LinearMathJNI.btIDebugDraw_getDefaultColorsSwigExplicitbtIDebugDraw(swigCPtr, this), true);
  }

  public void setDefaultColors(btIDebugDraw.DefaultColors arg0) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_setDefaultColors(swigCPtr, this, btIDebugDraw.DefaultColors.getCPtr(arg0), arg0); else LinearMathJNI.btIDebugDraw_setDefaultColorsSwigExplicitbtIDebugDraw(swigCPtr, this, btIDebugDraw.DefaultColors.getCPtr(arg0), arg0);
  }

  public void drawLine(Vector3 from, Vector3 to, Vector3 color) {
    LinearMathJNI.btIDebugDraw_drawLine__SWIG_0(swigCPtr, this, from, to, color);
  }

  public void drawLine(Vector3 from, Vector3 to, Vector3 fromColor, Vector3 toColor) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawLine__SWIG_1(swigCPtr, this, from, to, fromColor, toColor); else LinearMathJNI.btIDebugDraw_drawLineSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, from, to, fromColor, toColor);
  }

  public void drawSphere(float radius, Matrix4 transform, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSphere__SWIG_0(swigCPtr, this, radius, transform, color); else LinearMathJNI.btIDebugDraw_drawSphereSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, radius, transform, color);
  }

  public void drawSphere(Vector3 p, float radius, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSphere__SWIG_1(swigCPtr, this, p, radius, color); else LinearMathJNI.btIDebugDraw_drawSphereSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, p, radius, color);
  }

  public void drawTriangle(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 arg3, Vector3 arg4, Vector3 arg5, Vector3 color, float alpha) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawTriangle__SWIG_0(swigCPtr, this, v0, v1, v2, arg3, arg4, arg5, color, alpha); else LinearMathJNI.btIDebugDraw_drawTriangleSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, v0, v1, v2, arg3, arg4, arg5, color, alpha);
  }

  public void drawTriangle(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 color, float arg4) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawTriangle__SWIG_1(swigCPtr, this, v0, v1, v2, color, arg4); else LinearMathJNI.btIDebugDraw_drawTriangleSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, v0, v1, v2, color, arg4);
  }

  public void drawContactPoint(Vector3 PointOnB, Vector3 normalOnB, float distance, int lifeTime, Vector3 color) {
    LinearMathJNI.btIDebugDraw_drawContactPoint(swigCPtr, this, PointOnB, normalOnB, distance, lifeTime, color);
  }

  public void reportErrorWarning(String warningString) {
    LinearMathJNI.btIDebugDraw_reportErrorWarning(swigCPtr, this, warningString);
  }

  public void draw3dText(Vector3 location, String textString) {
    LinearMathJNI.btIDebugDraw_draw3dText(swigCPtr, this, location, textString);
  }

  public void setDebugMode(int debugMode) {
    LinearMathJNI.btIDebugDraw_setDebugMode(swigCPtr, this, debugMode);
  }

  public int getDebugMode() {
    return LinearMathJNI.btIDebugDraw_getDebugMode(swigCPtr, this);
  }

  public void drawAabb(Vector3 from, Vector3 to, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawAabb(swigCPtr, this, from, to, color); else LinearMathJNI.btIDebugDraw_drawAabbSwigExplicitbtIDebugDraw(swigCPtr, this, from, to, color);
  }

  public void drawTransform(Matrix4 transform, float orthoLen) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawTransform(swigCPtr, this, transform, orthoLen); else LinearMathJNI.btIDebugDraw_drawTransformSwigExplicitbtIDebugDraw(swigCPtr, this, transform, orthoLen);
  }

  public void drawArc(Vector3 center, Vector3 normal, Vector3 axis, float radiusA, float radiusB, float minAngle, float maxAngle, Vector3 color, boolean drawSect, float stepDegrees) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawArc__SWIG_0(swigCPtr, this, center, normal, axis, radiusA, radiusB, minAngle, maxAngle, color, drawSect, stepDegrees); else LinearMathJNI.btIDebugDraw_drawArcSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, center, normal, axis, radiusA, radiusB, minAngle, maxAngle, color, drawSect, stepDegrees);
  }

  public void drawArc(Vector3 center, Vector3 normal, Vector3 axis, float radiusA, float radiusB, float minAngle, float maxAngle, Vector3 color, boolean drawSect) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawArc__SWIG_1(swigCPtr, this, center, normal, axis, radiusA, radiusB, minAngle, maxAngle, color, drawSect); else LinearMathJNI.btIDebugDraw_drawArcSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, center, normal, axis, radiusA, radiusB, minAngle, maxAngle, color, drawSect);
  }

  public void drawSpherePatch(Vector3 center, Vector3 up, Vector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, Vector3 color, float stepDegrees, boolean drawCenter) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSpherePatch__SWIG_0(swigCPtr, this, center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, drawCenter); else LinearMathJNI.btIDebugDraw_drawSpherePatchSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, drawCenter);
  }

  public void drawSpherePatch(Vector3 center, Vector3 up, Vector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, Vector3 color, float stepDegrees) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSpherePatch__SWIG_1(swigCPtr, this, center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees); else LinearMathJNI.btIDebugDraw_drawSpherePatchSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees);
  }

  public void drawSpherePatch(Vector3 center, Vector3 up, Vector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSpherePatch__SWIG_2(swigCPtr, this, center, up, axis, radius, minTh, maxTh, minPs, maxPs, color); else LinearMathJNI.btIDebugDraw_drawSpherePatchSwigExplicitbtIDebugDraw__SWIG_2(swigCPtr, this, center, up, axis, radius, minTh, maxTh, minPs, maxPs, color);
  }

  public void drawBox(Vector3 bbMin, Vector3 bbMax, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawBox__SWIG_0(swigCPtr, this, bbMin, bbMax, color); else LinearMathJNI.btIDebugDraw_drawBoxSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, bbMin, bbMax, color);
  }

  public void drawBox(Vector3 bbMin, Vector3 bbMax, Matrix4 trans, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawBox__SWIG_1(swigCPtr, this, bbMin, bbMax, trans, color); else LinearMathJNI.btIDebugDraw_drawBoxSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, bbMin, bbMax, trans, color);
  }

  public void drawCapsule(float radius, float halfHeight, int upAxis, Matrix4 transform, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawCapsule(swigCPtr, this, radius, halfHeight, upAxis, transform, color); else LinearMathJNI.btIDebugDraw_drawCapsuleSwigExplicitbtIDebugDraw(swigCPtr, this, radius, halfHeight, upAxis, transform, color);
  }

  public void drawCylinder(float radius, float halfHeight, int upAxis, Matrix4 transform, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawCylinder(swigCPtr, this, radius, halfHeight, upAxis, transform, color); else LinearMathJNI.btIDebugDraw_drawCylinderSwigExplicitbtIDebugDraw(swigCPtr, this, radius, halfHeight, upAxis, transform, color);
  }

  public void drawCone(float radius, float height, int upAxis, Matrix4 transform, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawCone(swigCPtr, this, radius, height, upAxis, transform, color); else LinearMathJNI.btIDebugDraw_drawConeSwigExplicitbtIDebugDraw(swigCPtr, this, radius, height, upAxis, transform, color);
  }

  public void drawPlane(Vector3 planeNormal, float planeConst, Matrix4 transform, Vector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawPlane(swigCPtr, this, planeNormal, planeConst, transform, color); else LinearMathJNI.btIDebugDraw_drawPlaneSwigExplicitbtIDebugDraw(swigCPtr, this, planeNormal, planeConst, transform, color);
  }

  public void clearLines() {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_clearLines(swigCPtr, this); else LinearMathJNI.btIDebugDraw_clearLinesSwigExplicitbtIDebugDraw(swigCPtr, this);
  }

  public void flushLines() {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_flushLines(swigCPtr, this); else LinearMathJNI.btIDebugDraw_flushLinesSwigExplicitbtIDebugDraw(swigCPtr, this);
  }

  public btIDebugDraw() {
    this(LinearMathJNI.new_btIDebugDraw(), true);
    LinearMathJNI.btIDebugDraw_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public final static class DebugDrawModes {
    public final static int DBG_NoDebug = 0;
    public final static int DBG_DrawWireframe = 1;
    public final static int DBG_DrawAabb = 2;
    public final static int DBG_DrawFeaturesText = 4;
    public final static int DBG_DrawContactPoints = 8;
    public final static int DBG_NoDeactivation = 16;
    public final static int DBG_NoHelpText = 32;
    public final static int DBG_DrawText = 64;
    public final static int DBG_ProfileTimings = 128;
    public final static int DBG_EnableSatComparison = 256;
    public final static int DBG_DisableBulletLCP = 512;
    public final static int DBG_EnableCCD = 1024;
    public final static int DBG_DrawConstraints = (1 << 11);
    public final static int DBG_DrawConstraintLimits = (1 << 12);
    public final static int DBG_FastWireframe = (1 << 13);
    public final static int DBG_DrawNormals = (1 << 14);
    public final static int DBG_DrawFrames = (1 << 15);
    public final static int DBG_MAX_DEBUG_DRAW_MODE = DBG_DrawFrames + 1;
  }

}
