package com.developer.kalert;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import c6.b;

public class Rotate3dAnimation extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public int f2675a;

    /* renamed from: b  reason: collision with root package name */
    public int f2676b;

    /* renamed from: c  reason: collision with root package name */
    public float f2677c;

    /* renamed from: d  reason: collision with root package name */
    public float f2678d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2679e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2680f;

    /* renamed from: g  reason: collision with root package name */
    public float f2681g;

    /* renamed from: h  reason: collision with root package name */
    public float f2682h;

    /* renamed from: i  reason: collision with root package name */
    public Camera f2683i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2684j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2685a;

        /* renamed from: b  reason: collision with root package name */
        public float f2686b;
    }

    public Rotate3dAnimation(int i10, float f10, float f11) {
        this.f2675a = 0;
        this.f2676b = 0;
        this.f2677c = 0.0f;
        this.f2678d = 0.0f;
        this.f2684j = i10;
        this.f2679e = f10;
        this.f2680f = f11;
        this.f2681g = 0.0f;
        this.f2682h = 0.0f;
    }

    public Rotate3dAnimation(int i10, float f10, float f11, float f12, float f13) {
        this.f2684j = i10;
        this.f2679e = f10;
        this.f2680f = f11;
        this.f2675a = 0;
        this.f2676b = 0;
        this.f2677c = f12;
        this.f2678d = f13;
        b();
    }

    public Rotate3dAnimation(int i10, float f10, float f11, int i11, float f12, int i12, float f13) {
        this.f2684j = i10;
        this.f2679e = f10;
        this.f2680f = f11;
        this.f2677c = f12;
        this.f2675a = i11;
        this.f2678d = f13;
        this.f2676b = i12;
        b();
    }

    public Rotate3dAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2675a = 0;
        this.f2676b = 0;
        this.f2677c = 0.0f;
        this.f2678d = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2481n);
        this.f2679e = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f2680f = obtainStyledAttributes.getFloat(4, 0.0f);
        this.f2684j = obtainStyledAttributes.getInt(3, 0);
        a c10 = c(obtainStyledAttributes.peekValue(1));
        this.f2675a = c10.f2685a;
        this.f2677c = c10.f2686b;
        a c11 = c(obtainStyledAttributes.peekValue(2));
        this.f2676b = c11.f2685a;
        this.f2678d = c11.f2686b;
        obtainStyledAttributes.recycle();
        b();
    }

    public static a c(TypedValue typedValue) {
        a aVar = new a();
        if (typedValue == null) {
            aVar.f2685a = 0;
            aVar.f2686b = 0.0f;
        } else {
            int i10 = typedValue.type;
            if (i10 == 6) {
                int i11 = typedValue.data;
                int i12 = 1;
                if ((i11 & 15) == 1) {
                    i12 = 2;
                }
                aVar.f2685a = i12;
                aVar.f2686b = TypedValue.complexToFloat(i11);
                return aVar;
            } else if (i10 == 4) {
                aVar.f2685a = 0;
                aVar.f2686b = typedValue.getFloat();
                return aVar;
            } else if (i10 >= 16 && i10 <= 31) {
                aVar.f2685a = 0;
                aVar.f2686b = (float) typedValue.data;
                return aVar;
            }
        }
        aVar.f2685a = 0;
        aVar.f2686b = 0.0f;
        return aVar;
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        float f11 = this.f2679e;
        float e10 = com.ironsource.adapters.ironsource.a.e(this.f2680f, f11, f10, f11);
        Matrix matrix = transformation.getMatrix();
        this.f2683i.save();
        int i10 = this.f2684j;
        if (i10 == 0) {
            this.f2683i.rotateX(e10);
        } else if (i10 == 1) {
            this.f2683i.rotateY(e10);
        } else if (i10 == 2) {
            this.f2683i.rotateZ(e10);
        }
        this.f2683i.getMatrix(matrix);
        this.f2683i.restore();
        matrix.preTranslate(-this.f2681g, -this.f2682h);
        matrix.postTranslate(this.f2681g, this.f2682h);
    }

    public final void b() {
        if (this.f2675a == 0) {
            this.f2681g = this.f2677c;
        }
        if (this.f2676b == 0) {
            this.f2682h = this.f2678d;
        }
    }

    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f2683i = new Camera();
        this.f2681g = resolveSize(this.f2675a, this.f2677c, i10, i12);
        this.f2682h = resolveSize(this.f2676b, this.f2678d, i11, i13);
    }
}
