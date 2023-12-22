package r5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import n4.z;
import z5.c;

public final class i {

    /* renamed from: m  reason: collision with root package name */
    public static final g f11702m = new g(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public z f11703a;

    /* renamed from: b  reason: collision with root package name */
    public z f11704b;

    /* renamed from: c  reason: collision with root package name */
    public z f11705c;

    /* renamed from: d  reason: collision with root package name */
    public z f11706d;

    /* renamed from: e  reason: collision with root package name */
    public c f11707e;

    /* renamed from: f  reason: collision with root package name */
    public c f11708f;

    /* renamed from: g  reason: collision with root package name */
    public c f11709g;

    /* renamed from: h  reason: collision with root package name */
    public c f11710h;

    /* renamed from: i  reason: collision with root package name */
    public e f11711i;

    /* renamed from: j  reason: collision with root package name */
    public e f11712j;
    public e k;

    /* renamed from: l  reason: collision with root package name */
    public e f11713l;

    public i() {
        this.f11703a = new h();
        this.f11704b = new h();
        this.f11705c = new h();
        this.f11706d = new h();
        this.f11707e = new a(0.0f);
        this.f11708f = new a(0.0f);
        this.f11709g = new a(0.0f);
        this.f11710h = new a(0.0f);
        this.f11711i = new e();
        this.f11712j = new e();
        this.k = new e();
        this.f11713l = new e();
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(c.a.U);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c10 = c(obtainStyledAttributes, 5, cVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            a aVar = new a();
            z f10 = c.f(i13);
            aVar.f11714a = f10;
            float b10 = a.b(f10);
            if (b10 != -1.0f) {
                aVar.e(b10);
            }
            aVar.f11718e = c11;
            z f11 = c.f(i14);
            aVar.f11715b = f11;
            float b11 = a.b(f11);
            if (b11 != -1.0f) {
                aVar.f(b11);
            }
            aVar.f11719f = c12;
            z f12 = c.f(i15);
            aVar.f11716c = f12;
            float b12 = a.b(f12);
            if (b12 != -1.0f) {
                aVar.d(b12);
            }
            aVar.f11720g = c13;
            z f13 = c.f(i16);
            aVar.f11717d = f13;
            float b13 = a.b(f13);
            if (b13 != -1.0f) {
                aVar.c(b13);
            }
            aVar.f11721h = c14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.M, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        Class<e> cls = e.class;
        boolean z9 = this.f11713l.getClass().equals(cls) && this.f11712j.getClass().equals(cls) && this.f11711i.getClass().equals(cls) && this.k.getClass().equals(cls);
        float a10 = this.f11707e.a(rectF);
        return z9 && ((this.f11708f.a(rectF) > a10 ? 1 : (this.f11708f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f11710h.a(rectF) > a10 ? 1 : (this.f11710h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f11709g.a(rectF) > a10 ? 1 : (this.f11709g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f11704b instanceof h) && (this.f11703a instanceof h) && (this.f11705c instanceof h) && (this.f11706d instanceof h));
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public z f11714a = new h();

        /* renamed from: b  reason: collision with root package name */
        public z f11715b = new h();

        /* renamed from: c  reason: collision with root package name */
        public z f11716c = new h();

        /* renamed from: d  reason: collision with root package name */
        public z f11717d = new h();

        /* renamed from: e  reason: collision with root package name */
        public c f11718e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f11719f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f11720g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f11721h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public e f11722i = new e();

        /* renamed from: j  reason: collision with root package name */
        public e f11723j = new e();
        public e k = new e();

        /* renamed from: l  reason: collision with root package name */
        public e f11724l = new e();

        public a() {
        }

        public static float b(z zVar) {
            if (zVar instanceof h) {
                return ((h) zVar).f11701b;
            }
            if (zVar instanceof d) {
                return ((d) zVar).f11658b;
            }
            return -1.0f;
        }

        public final i a() {
            return new i(this);
        }

        public final void c(float f10) {
            this.f11721h = new a(f10);
        }

        public final void d(float f10) {
            this.f11720g = new a(f10);
        }

        public final void e(float f10) {
            this.f11718e = new a(f10);
        }

        public final void f(float f10) {
            this.f11719f = new a(f10);
        }

        public a(i iVar) {
            this.f11714a = iVar.f11703a;
            this.f11715b = iVar.f11704b;
            this.f11716c = iVar.f11705c;
            this.f11717d = iVar.f11706d;
            this.f11718e = iVar.f11707e;
            this.f11719f = iVar.f11708f;
            this.f11720g = iVar.f11709g;
            this.f11721h = iVar.f11710h;
            this.f11722i = iVar.f11711i;
            this.f11723j = iVar.f11712j;
            this.k = iVar.k;
            this.f11724l = iVar.f11713l;
        }
    }

    public i(a aVar) {
        this.f11703a = aVar.f11714a;
        this.f11704b = aVar.f11715b;
        this.f11705c = aVar.f11716c;
        this.f11706d = aVar.f11717d;
        this.f11707e = aVar.f11718e;
        this.f11708f = aVar.f11719f;
        this.f11709g = aVar.f11720g;
        this.f11710h = aVar.f11721h;
        this.f11711i = aVar.f11722i;
        this.f11712j = aVar.f11723j;
        this.k = aVar.k;
        this.f11713l = aVar.f11724l;
    }
}
