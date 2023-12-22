package h0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import h0.d;
import h0.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

public final class s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f6742b = (Build.VERSION.SDK_INT >= 30 ? j.f6770q : k.f6771b);

    /* renamed from: a  reason: collision with root package name */
    public final k f6743a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f6744a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f6745b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f6746c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f6747d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f6744a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f6745b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f6746c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder g10 = androidx.activity.f.g("Failed to get visible insets from AttachInfo ");
                g10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", g10.toString(), e10);
            }
        }
    }

    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public static Field f6748e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f6749f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f6750g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f6751h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f6752c;

        /* renamed from: d  reason: collision with root package name */
        public a0.b f6753d;

        public b() {
            this.f6752c = i();
        }

        public b(s0 s0Var) {
            super(s0Var);
            this.f6752c = s0Var.h();
        }

        private static WindowInsets i() {
            if (!f6749f) {
                try {
                    f6748e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f6749f = true;
            }
            Field field = f6748e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f6751h) {
                try {
                    f6750g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f6751h = true;
            }
            Constructor<WindowInsets> constructor = f6750g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        public s0 b() {
            a();
            s0 i10 = s0.i((View) null, this.f6752c);
            i10.f6743a.o(this.f6756b);
            i10.f6743a.q(this.f6753d);
            return i10;
        }

        public void e(a0.b bVar) {
            this.f6753d = bVar;
        }

        public void g(a0.b bVar) {
            WindowInsets windowInsets = this.f6752c;
            if (windowInsets != null) {
                this.f6752c = windowInsets.replaceSystemWindowInsets(bVar.f4a, bVar.f5b, bVar.f6c, bVar.f7d);
            }
        }
    }

    public static class c extends e {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets$Builder f6754c;

        public c() {
            this.f6754c = new WindowInsets$Builder();
        }

        public c(s0 s0Var) {
            super(s0Var);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets h10 = s0Var.h();
            if (h10 == null) {
                windowInsets$Builder = new WindowInsets$Builder();
            }
            this.f6754c = windowInsets$Builder;
        }

        public s0 b() {
            a();
            s0 i10 = s0.i((View) null, this.f6754c.build());
            i10.f6743a.o(this.f6756b);
            return i10;
        }

        public void d(a0.b bVar) {
            this.f6754c.setMandatorySystemGestureInsets(bVar.d());
        }

        public void e(a0.b bVar) {
            this.f6754c.setStableInsets(bVar.d());
        }

        public void f(a0.b bVar) {
            this.f6754c.setSystemGestureInsets(bVar.d());
        }

        public void g(a0.b bVar) {
            this.f6754c.setSystemWindowInsets(bVar.d());
        }

        public void h(a0.b bVar) {
            this.f6754c.setTappableElementInsets(bVar.d());
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(s0 s0Var) {
            super(s0Var);
        }

        public void c(int i10, a0.b bVar) {
            this.f6754c.setInsets(m.a(i10), bVar.d());
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f6755a;

        /* renamed from: b  reason: collision with root package name */
        public a0.b[] f6756b;

        public e() {
            this(new s0());
        }

        public e(s0 s0Var) {
            this.f6755a = s0Var;
        }

        public final void a() {
            a0.b[] bVarArr = this.f6756b;
            if (bVarArr != null) {
                a0.b bVar = bVarArr[l.a(1)];
                a0.b bVar2 = this.f6756b[l.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f6755a.a(2);
                }
                if (bVar == null) {
                    bVar = this.f6755a.a(1);
                }
                g(a0.b.a(bVar, bVar2));
                a0.b bVar3 = this.f6756b[l.a(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                a0.b bVar4 = this.f6756b[l.a(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                a0.b bVar5 = this.f6756b[l.a(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        public s0 b() {
            throw null;
        }

        public void c(int i10, a0.b bVar) {
            if (this.f6756b == null) {
                this.f6756b = new a0.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f6756b[l.a(i11)] = bVar;
                }
            }
        }

        public void d(a0.b bVar) {
        }

        public void e(a0.b bVar) {
            throw null;
        }

        public void f(a0.b bVar) {
        }

        public void g(a0.b bVar) {
            throw null;
        }

        public void h(a0.b bVar) {
        }
    }

    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f6757h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f6758i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f6759j;
        public static Field k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f6760l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f6761c;

        /* renamed from: d  reason: collision with root package name */
        public a0.b[] f6762d;

        /* renamed from: e  reason: collision with root package name */
        public a0.b f6763e = null;

        /* renamed from: f  reason: collision with root package name */
        public s0 f6764f;

        /* renamed from: g  reason: collision with root package name */
        public a0.b f6765g;

        public f(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var);
            this.f6761c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private a0.b r(int i10, boolean z9) {
            a0.b bVar = a0.b.f3e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = a0.b.a(bVar, s(i11, z9));
                }
            }
            return bVar;
        }

        private a0.b t() {
            s0 s0Var = this.f6764f;
            if (s0Var != null) {
                return s0Var.f6743a.h();
            }
            return a0.b.f3e;
        }

        private a0.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f6757h) {
                    v();
                }
                Method method = f6758i;
                if (!(method == null || f6759j == null || k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) k.get(f6760l.get(invoke));
                        if (rect != null) {
                            return a0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder g10 = androidx.activity.f.g("Failed to get visible insets. (Reflection error). ");
                        g10.append(e10.getMessage());
                        Log.e("WindowInsetsCompat", g10.toString(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f6758i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f6759j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                f6760l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                f6760l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder g10 = androidx.activity.f.g("Failed to get visible insets. (Reflection error). ");
                g10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", g10.toString(), e10);
            }
            f6757h = true;
        }

        public void d(View view) {
            a0.b u = u(view);
            if (u == null) {
                u = a0.b.f3e;
            }
            w(u);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f6765g, ((f) obj).f6765g);
        }

        public a0.b f(int i10) {
            return r(i10, false);
        }

        public final a0.b j() {
            if (this.f6763e == null) {
                this.f6763e = a0.b.b(this.f6761c.getSystemWindowInsetLeft(), this.f6761c.getSystemWindowInsetTop(), this.f6761c.getSystemWindowInsetRight(), this.f6761c.getSystemWindowInsetBottom());
            }
            return this.f6763e;
        }

        public s0 l(int i10, int i11, int i12, int i13) {
            e eVar;
            s0 i14 = s0.i((View) null, this.f6761c);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                eVar = new d(i14);
            } else if (i15 >= 29) {
                eVar = new c(i14);
            } else {
                eVar = new b(i14);
            }
            eVar.g(s0.f(j(), i10, i11, i12, i13));
            eVar.e(s0.f(h(), i10, i11, i12, i13));
            return eVar.b();
        }

        public boolean n() {
            return this.f6761c.isRound();
        }

        public void o(a0.b[] bVarArr) {
            this.f6762d = bVarArr;
        }

        public void p(s0 s0Var) {
            this.f6764f = s0Var;
        }

        public a0.b s(int i10, boolean z9) {
            int i11;
            d dVar;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (i10 != 1) {
                a0.b bVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        a0.b[] bVarArr = this.f6762d;
                        if (bVarArr != null) {
                            bVar = bVarArr[l.a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        a0.b j10 = j();
                        a0.b t10 = t();
                        int i16 = j10.f7d;
                        if (i16 > t10.f7d) {
                            return a0.b.b(0, 0, 0, i16);
                        }
                        a0.b bVar2 = this.f6765g;
                        if (bVar2 == null || bVar2.equals(a0.b.f3e) || (i11 = this.f6765g.f7d) <= t10.f7d) {
                            return a0.b.f3e;
                        }
                        return a0.b.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return i();
                    } else {
                        if (i10 == 32) {
                            return g();
                        }
                        if (i10 == 64) {
                            return k();
                        }
                        if (i10 != 128) {
                            return a0.b.f3e;
                        }
                        s0 s0Var = this.f6764f;
                        if (s0Var != null) {
                            dVar = s0Var.f6743a.e();
                        } else {
                            dVar = e();
                        }
                        if (dVar == null) {
                            return a0.b.f3e;
                        }
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 28) {
                            i12 = d.a.d(dVar.f6695a);
                        } else {
                            i12 = 0;
                        }
                        if (i17 >= 28) {
                            i13 = d.a.f(dVar.f6695a);
                        } else {
                            i13 = 0;
                        }
                        if (i17 >= 28) {
                            i14 = d.a.e(dVar.f6695a);
                        } else {
                            i14 = 0;
                        }
                        if (i17 >= 28) {
                            i15 = d.a.c(dVar.f6695a);
                        }
                        return a0.b.b(i12, i13, i14, i15);
                    }
                } else if (z9) {
                    a0.b t11 = t();
                    a0.b h10 = h();
                    return a0.b.b(Math.max(t11.f4a, h10.f4a), 0, Math.max(t11.f6c, h10.f6c), Math.max(t11.f7d, h10.f7d));
                } else {
                    a0.b j11 = j();
                    s0 s0Var2 = this.f6764f;
                    if (s0Var2 != null) {
                        bVar = s0Var2.f6743a.h();
                    }
                    int i18 = j11.f7d;
                    if (bVar != null) {
                        i18 = Math.min(i18, bVar.f7d);
                    }
                    return a0.b.b(j11.f4a, 0, j11.f6c, i18);
                }
            } else if (z9) {
                return a0.b.b(0, Math.max(t().f5b, j().f5b), 0, 0);
            } else {
                return a0.b.b(0, j().f5b, 0, 0);
            }
        }

        public void w(a0.b bVar) {
            this.f6765g = bVar;
        }
    }

    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public a0.b f6766m = null;

        public g(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        public s0 b() {
            return s0.i((View) null, this.f6761c.consumeStableInsets());
        }

        public s0 c() {
            return s0.i((View) null, this.f6761c.consumeSystemWindowInsets());
        }

        public final a0.b h() {
            if (this.f6766m == null) {
                this.f6766m = a0.b.b(this.f6761c.getStableInsetLeft(), this.f6761c.getStableInsetTop(), this.f6761c.getStableInsetRight(), this.f6761c.getStableInsetBottom());
            }
            return this.f6766m;
        }

        public boolean m() {
            return this.f6761c.isConsumed();
        }

        public void q(a0.b bVar) {
            this.f6766m = bVar;
        }
    }

    public static class h extends g {
        public h(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        public s0 a() {
            return s0.i((View) null, this.f6761c.consumeDisplayCutout());
        }

        public d e() {
            DisplayCutout a10 = this.f6761c.getDisplayCutout();
            if (a10 == null) {
                return null;
            }
            return new d(a10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f6761c, hVar.f6761c) && Objects.equals(this.f6765g, hVar.f6765g);
        }

        public int hashCode() {
            return this.f6761c.hashCode();
        }
    }

    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public a0.b f6767n = null;

        /* renamed from: o  reason: collision with root package name */
        public a0.b f6768o = null;

        /* renamed from: p  reason: collision with root package name */
        public a0.b f6769p = null;

        public i(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        public a0.b g() {
            if (this.f6768o == null) {
                this.f6768o = a0.b.c(this.f6761c.getMandatorySystemGestureInsets());
            }
            return this.f6768o;
        }

        public a0.b i() {
            if (this.f6767n == null) {
                this.f6767n = a0.b.c(this.f6761c.getSystemGestureInsets());
            }
            return this.f6767n;
        }

        public a0.b k() {
            if (this.f6769p == null) {
                this.f6769p = a0.b.c(this.f6761c.getTappableElementInsets());
            }
            return this.f6769p;
        }

        public s0 l(int i10, int i11, int i12, int i13) {
            return s0.i((View) null, this.f6761c.inset(i10, i11, i12, i13));
        }

        public void q(a0.b bVar) {
        }
    }

    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final s0 f6770q = s0.i((View) null, WindowInsets.CONSUMED);

        public j(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        public final void d(View view) {
        }

        public a0.b f(int i10) {
            return a0.b.c(this.f6761c.getInsets(m.a(i10)));
        }
    }

    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final s0 f6771b;

        /* renamed from: a  reason: collision with root package name */
        public final s0 f6772a;

        static {
            e eVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                eVar = new d();
            } else if (i10 >= 29) {
                eVar = new c();
            } else {
                eVar = new b();
            }
            f6771b = eVar.b().f6743a.a().f6743a.b().f6743a.c();
        }

        public k(s0 s0Var) {
            this.f6772a = s0Var;
        }

        public s0 a() {
            return this.f6772a;
        }

        public s0 b() {
            return this.f6772a;
        }

        public s0 c() {
            return this.f6772a;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() != kVar.n() || m() != kVar.m() || !g0.b.a(j(), kVar.j()) || !g0.b.a(h(), kVar.h()) || !g0.b.a(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public a0.b f(int i10) {
            return a0.b.f3e;
        }

        public a0.b g() {
            return j();
        }

        public a0.b h() {
            return a0.b.f3e;
        }

        public int hashCode() {
            return g0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public a0.b i() {
            return j();
        }

        public a0.b j() {
            return a0.b.f3e;
        }

        public a0.b k() {
            return j();
        }

        public s0 l(int i10, int i11, int i12, int i13) {
            return f6771b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(a0.b[] bVarArr) {
        }

        public void p(s0 s0Var) {
        }

        public void q(a0.b bVar) {
        }
    }

    public static final class l {
        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(androidx.activity.e.a("type needs to be >= FIRST and <= LAST, type=", i10));
        }
    }

    public static final class m {
        public static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets$Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets$Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets$Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets$Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets$Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets$Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets$Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    public s0() {
        this.f6743a = new k(this);
    }

    public s0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f6743a = i10 >= 30 ? new j(this, windowInsets) : i10 >= 29 ? new i(this, windowInsets) : i10 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static a0.b f(a0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f4a - i10);
        int max2 = Math.max(0, bVar.f5b - i11);
        int max3 = Math.max(0, bVar.f6c - i12);
        int max4 = Math.max(0, bVar.f7d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : a0.b.b(max, max2, max3, max4);
    }

    public static s0 i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        s0 s0Var = new s0(windowInsets);
        if (view != null) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.g.b(view)) {
                s0Var.f6743a.p(y.j.a(view));
                s0Var.f6743a.d(view.getRootView());
            }
        }
        return s0Var;
    }

    public final a0.b a(int i10) {
        return this.f6743a.f(i10);
    }

    @Deprecated
    public final int b() {
        return this.f6743a.j().f7d;
    }

    @Deprecated
    public final int c() {
        return this.f6743a.j().f4a;
    }

    @Deprecated
    public final int d() {
        return this.f6743a.j().f6c;
    }

    @Deprecated
    public final int e() {
        return this.f6743a.j().f5b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        return g0.b.a(this.f6743a, ((s0) obj).f6743a);
    }

    @Deprecated
    public final s0 g(int i10, int i11, int i12, int i13) {
        e eVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            eVar = new d(this);
        } else if (i14 >= 29) {
            eVar = new c(this);
        } else {
            eVar = new b(this);
        }
        eVar.g(a0.b.b(i10, i11, i12, i13));
        return eVar.b();
    }

    public final WindowInsets h() {
        k kVar = this.f6743a;
        if (kVar instanceof f) {
            return ((f) kVar).f6761c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f6743a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
