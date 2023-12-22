package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.imgdkh.app.R;
import h0.l0;
import h0.s0;
import h0.y;
import i0.f;
import i0.j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.c;
import y.a;

public class DrawerLayout extends ViewGroup {
    public static final int[] D = {16843828};
    public static final int[] E = {16842931};
    public static final boolean F = true;
    public static final boolean G = true;
    public static boolean H;
    public Rect A;
    public Matrix B;
    public final a C = new a();

    /* renamed from: a  reason: collision with root package name */
    public final c f1295a = new c();

    /* renamed from: b  reason: collision with root package name */
    public float f1296b;

    /* renamed from: c  reason: collision with root package name */
    public int f1297c;

    /* renamed from: d  reason: collision with root package name */
    public int f1298d = -1728053248;

    /* renamed from: e  reason: collision with root package name */
    public float f1299e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f1300f = new Paint();

    /* renamed from: g  reason: collision with root package name */
    public final o0.c f1301g;

    /* renamed from: h  reason: collision with root package name */
    public final o0.c f1302h;

    /* renamed from: i  reason: collision with root package name */
    public final g f1303i;

    /* renamed from: j  reason: collision with root package name */
    public final g f1304j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1305l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1306m = true;

    /* renamed from: n  reason: collision with root package name */
    public int f1307n = 3;

    /* renamed from: o  reason: collision with root package name */
    public int f1308o = 3;

    /* renamed from: p  reason: collision with root package name */
    public int f1309p = 3;

    /* renamed from: q  reason: collision with root package name */
    public int f1310q = 3;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1311r;

    /* renamed from: s  reason: collision with root package name */
    public d f1312s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f1313t;
    public float u;

    /* renamed from: v  reason: collision with root package name */
    public float f1314v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public Object f1315x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1316y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<View> f1317z;

    public class a implements j {
        public a() {
        }

        public final boolean a(View view) {
            DrawerLayout.this.getClass();
            if (!DrawerLayout.n(view) || DrawerLayout.this.i(view) == 2) {
                return false;
            }
            DrawerLayout.this.b(view);
            return true;
        }
    }

    public class b extends h0.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1319d = new Rect();

        public b() {
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View g10 = DrawerLayout.this.g();
            if (g10 == null) {
                return true;
            }
            int j10 = DrawerLayout.this.j(g10);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            Gravity.getAbsoluteGravity(j10, y.e.d(drawerLayout));
            return true;
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public final void d(View view, i0.f fVar) {
            if (DrawerLayout.F) {
                this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(fVar.f7091a);
                this.f6677a.onInitializeAccessibilityNodeInfo(view, obtain);
                fVar.f7093c = -1;
                fVar.f7091a.setSource(view);
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                ViewParent f10 = y.d.f(view);
                if (f10 instanceof View) {
                    fVar.f7092b = -1;
                    fVar.f7091a.setParent((View) f10);
                }
                Rect rect = this.f1319d;
                obtain.getBoundsInScreen(rect);
                fVar.f7091a.setBoundsInScreen(rect);
                fVar.f7091a.setVisibleToUser(obtain.isVisibleToUser());
                fVar.f7091a.setPackageName(obtain.getPackageName());
                fVar.g(obtain.getClassName());
                fVar.i(obtain.getContentDescription());
                fVar.f7091a.setEnabled(obtain.isEnabled());
                fVar.f7091a.setFocused(obtain.isFocused());
                fVar.f7091a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                fVar.f7091a.setSelected(obtain.isSelected());
                fVar.a(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.l(childAt)) {
                        fVar.f7091a.addChild(childAt);
                    }
                }
            }
            fVar.g("androidx.drawerlayout.widget.DrawerLayout");
            fVar.f7091a.setFocusable(false);
            fVar.f7091a.setFocused(false);
            fVar.f7091a.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f7094e.f7103a);
            fVar.f7091a.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f7095f.f7103a);
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.F || DrawerLayout.l(view)) {
                return super.f(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class c extends h0.a {
        public final void d(View view, i0.f fVar) {
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            if (!DrawerLayout.l(view)) {
                fVar.f7092b = -1;
                fVar.f7091a.setParent((View) null);
            }
        }
    }

    public interface d {
        void a();

        void b();

        void c(float f10);

        void d();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1321a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f1322b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1323c;

        /* renamed from: d  reason: collision with root package name */
        public int f1324d;

        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.E);
            this.f1321a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(e eVar) {
            super(eVar);
            this.f1321a = eVar.f1321a;
        }
    }

    public static class f extends n0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f1325c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1326d;

        /* renamed from: e  reason: collision with root package name */
        public int f1327e;

        /* renamed from: f  reason: collision with root package name */
        public int f1328f;

        /* renamed from: g  reason: collision with root package name */
        public int f1329g;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1325c = parcel.readInt();
            this.f1326d = parcel.readInt();
            this.f1327e = parcel.readInt();
            this.f1328f = parcel.readInt();
            this.f1329g = parcel.readInt();
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f1325c);
            parcel.writeInt(this.f1326d);
            parcel.writeInt(this.f1327e);
            parcel.writeInt(this.f1328f);
            parcel.writeInt(this.f1329g);
        }
    }

    public class g extends c.C0121c {

        /* renamed from: a  reason: collision with root package name */
        public final int f1330a;

        /* renamed from: b  reason: collision with root package name */
        public o0.c f1331b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1332c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                boolean z9;
                int i10;
                View view;
                int i11;
                g gVar = g.this;
                int i12 = gVar.f1331b.f10492o;
                int i13 = 3;
                if (gVar.f1330a == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z9) {
                    view = drawerLayout.e(3);
                    if (view != null) {
                        i11 = -view.getWidth();
                    } else {
                        i11 = 0;
                    }
                    i10 = i11 + i12;
                } else {
                    view = drawerLayout.e(5);
                    i10 = DrawerLayout.this.getWidth() - i12;
                }
                if (view == null) {
                    return;
                }
                if (((z9 && view.getLeft() < i10) || (!z9 && view.getLeft() > i10)) && DrawerLayout.this.i(view) == 0) {
                    gVar.f1331b.s(view, i10, view.getTop());
                    ((e) view.getLayoutParams()).f1323c = true;
                    DrawerLayout.this.invalidate();
                    if (gVar.f1330a == 3) {
                        i13 = 5;
                    }
                    View e10 = DrawerLayout.this.e(i13);
                    if (e10 != null) {
                        DrawerLayout.this.b(e10);
                    }
                    DrawerLayout drawerLayout2 = DrawerLayout.this;
                    if (!drawerLayout2.f1311r) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout2.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            drawerLayout2.getChildAt(i14).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout2.f1311r = true;
                    }
                }
            }
        }

        public g(int i10) {
            this.f1330a = i10;
        }

        public final int a(View view, int i10) {
            int i11;
            int i12;
            if (DrawerLayout.this.a(view, 3)) {
                i11 = -view.getWidth();
                i12 = 0;
            } else {
                i12 = DrawerLayout.this.getWidth();
                i11 = i12 - view.getWidth();
            }
            return Math.max(i11, Math.min(i10, i12));
        }

        public final int b(View view, int i10) {
            return view.getTop();
        }

        public final int c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.o(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public final void e(int i10, int i11) {
            DrawerLayout drawerLayout;
            int i12;
            if ((i10 & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i12 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i12 = 5;
            }
            View e10 = drawerLayout.e(i12);
            if (e10 != null && DrawerLayout.this.i(e10) == 0) {
                this.f1331b.b(e10, i11);
            }
        }

        public final void f() {
            DrawerLayout.this.postDelayed(this.f1332c, 160);
        }

        public final void g(View view, int i10) {
            ((e) view.getLayoutParams()).f1323c = false;
            int i11 = 3;
            if (this.f1330a == 3) {
                i11 = 5;
            }
            View e10 = DrawerLayout.this.e(i11);
            if (e10 != null) {
                DrawerLayout.this.b(e10);
            }
        }

        public final void h(int i10) {
            DrawerLayout.this.v(this.f1331b.f10497t, i10);
        }

        public final void i(View view, int i10, int i11) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? (float) (i10 + width) : (float) (DrawerLayout.this.getWidth() - i10)) / ((float) width);
            DrawerLayout.this.s(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public final void j(View view, float f10, float f11) {
            int i10;
            DrawerLayout.this.getClass();
            float f12 = ((e) view.getLayoutParams()).f1322b;
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 > 0 || (i11 == 0 && f12 > 0.5f)) {
                    i10 = 0;
                } else {
                    i10 = -width;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f1331b.q(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public final boolean k(View view, int i10) {
            DrawerLayout.this.getClass();
            return DrawerLayout.o(view) && DrawerLayout.this.a(view, this.f1330a) && DrawerLayout.this.i(view) == 0;
        }
    }

    static {
        boolean z9 = true;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29) {
            z9 = false;
        }
        H = z9;
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.drawerLayoutStyle);
        float f10;
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f1297c = (int) ((64.0f * f11) + 0.5f);
        float f12 = f11 * 400.0f;
        g gVar = new g(3);
        this.f1303i = gVar;
        g gVar2 = new g(5);
        this.f1304j = gVar2;
        o0.c cVar = new o0.c(getContext(), this, gVar);
        cVar.f10480b = (int) (((float) cVar.f10480b) * 1.0f);
        this.f1301g = cVar;
        cVar.f10494q = 1;
        cVar.f10491n = f12;
        gVar.f1331b = cVar;
        o0.c cVar2 = new o0.c(getContext(), this, gVar2);
        cVar2.f10480b = (int) (((float) cVar2.f10480b) * 1.0f);
        this.f1302h = cVar2;
        cVar2.f10494q = 2;
        cVar2.f10491n = f12;
        gVar2.f1331b = cVar2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.s(this, 1);
        y.n(this, new b());
        setMotionEventSplittingEnabled(false);
        if (y.d.b(this)) {
            setOnApplyWindowInsetsListener(new q0.a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(D);
            try {
                this.w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.a.u, R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                f10 = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                f10 = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            this.f1296b = f10;
            obtainStyledAttributes2.recycle();
            this.f1317z = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String k(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean l(View view) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return (y.d.c(view) == 4 || y.d.c(view) == 2) ? false : true;
    }

    public static boolean m(View view) {
        return ((e) view.getLayoutParams()).f1321a == 0;
    }

    public static boolean n(View view) {
        if (o(view)) {
            return (((e) view.getLayoutParams()).f1324d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean o(View view) {
        int i10 = ((e) view.getLayoutParams()).f1321a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, y.e.d(view));
        if ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) {
            return false;
        }
        return true;
    }

    public static boolean p(View view) {
        if (o(view)) {
            return ((e) view.getLayoutParams()).f1322b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean a(View view, int i10) {
        return (j(view) & i10) == i10;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z9 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!o(childAt)) {
                    this.f1317z.add(childAt);
                } else if (n(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z9 = true;
                }
            }
            if (!z9) {
                int size = this.f1317z.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = this.f1317z.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.f1317z.clear();
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        int i11;
        super.addView(view, i10, layoutParams);
        if (f() != null || o(view)) {
            i11 = 4;
        } else {
            i11 = 1;
        }
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.s(view, i11);
        if (!F) {
            y.n(view, this.f1295a);
        }
    }

    public final void b(View view) {
        int i10;
        o0.c cVar;
        if (o(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f1306m) {
                eVar.f1322b = 0.0f;
                eVar.f1324d = 0;
            } else {
                eVar.f1324d |= 4;
                if (a(view, 3)) {
                    cVar = this.f1301g;
                    i10 = -view.getWidth();
                } else {
                    cVar = this.f1302h;
                    i10 = getWidth();
                }
                cVar.s(view, i10, view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void c() {
        View e10 = e(8388611);
        if (e10 != null) {
            b(e10);
            return;
        }
        StringBuilder g10 = androidx.activity.f.g("No drawer view found with gravity ");
        g10.append(k(8388611));
        throw new IllegalArgumentException(g10.toString());
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((e) getChildAt(i10).getLayoutParams()).f1322b);
        }
        this.f1299e = f10;
        boolean g10 = this.f1301g.g();
        boolean g11 = this.f1302h.g();
        if (g10 || g11) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.d.k(this);
        }
    }

    public final void d(boolean z9) {
        boolean z10;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (o(childAt) && (!z9 || eVar.f1323c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    z10 = this.f1301g.s(childAt, -width, childAt.getTop());
                } else {
                    z10 = this.f1302h.s(childAt, getWidth(), childAt.getTop());
                }
                z11 |= z10;
                eVar.f1323c = false;
            }
        }
        g gVar = this.f1303i;
        DrawerLayout.this.removeCallbacks(gVar.f1332c);
        g gVar2 = this.f1304j;
        DrawerLayout.this.removeCallbacks(gVar2.f1332c);
        if (z11) {
            invalidate();
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z9;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1299e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.A == null) {
                this.A = new Rect();
            }
            childAt.getHitRect(this.A);
            if (this.A.contains((int) x9, (int) y9) && !m(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.B == null) {
                            this.B = new Matrix();
                        }
                        matrix.invert(this.B);
                        obtain.transform(this.B);
                    }
                    z9 = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z9 = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z9;
        int height = getHeight();
        boolean m2 = m(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (m2) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background == null || background.getOpacity() != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9 && o(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i11) {
                                i11 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f1299e;
        if (f10 > 0.0f && m2) {
            int i13 = this.f1298d;
            this.f1300f.setColor((((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.f1300f);
        }
        return drawChild;
    }

    public final View e(int i10) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, y.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((j(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((e) childAt.getLayoutParams()).f1324d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (o(childAt) && p(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (G) {
            return this.f1296b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    public final int h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int d10 = y.e.d(this);
        if (i10 == 3) {
            int i15 = this.f1307n;
            if (i15 != 3) {
                return i15;
            }
            if (d10 == 0) {
                i11 = this.f1309p;
            } else {
                i11 = this.f1310q;
            }
            if (i11 != 3) {
                return i11;
            }
            return 0;
        } else if (i10 == 5) {
            int i16 = this.f1308o;
            if (i16 != 3) {
                return i16;
            }
            if (d10 == 0) {
                i12 = this.f1310q;
            } else {
                i12 = this.f1309p;
            }
            if (i12 != 3) {
                return i12;
            }
            return 0;
        } else if (i10 == 8388611) {
            int i17 = this.f1309p;
            if (i17 != 3) {
                return i17;
            }
            if (d10 == 0) {
                i13 = this.f1307n;
            } else {
                i13 = this.f1308o;
            }
            if (i13 != 3) {
                return i13;
            }
            return 0;
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i18 = this.f1310q;
            if (i18 != 3) {
                return i18;
            }
            if (d10 == 0) {
                i14 = this.f1308o;
            } else {
                i14 = this.f1307n;
            }
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
    }

    public final int i(View view) {
        if (o(view)) {
            return h(((e) view.getLayoutParams()).f1321a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int j(View view) {
        int i10 = ((e) view.getLayoutParams()).f1321a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        return Gravity.getAbsoluteGravity(i10, y.e.d(this));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1306m = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1306m = true;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1316y && this.w != null) {
            Object obj = this.f1315x;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.w.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[LOOP:0: B:8:0x0024->B:20:0x0057, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            o0.c r1 = r8.f1301g
            boolean r1 = r1.r(r9)
            o0.c r2 = r8.f1302h
            boolean r2 = r2.r(r9)
            r1 = r1 | r2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 == r3) goto L_0x0070
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0070
            goto L_0x0075
        L_0x001e:
            o0.c r9 = r8.f1301g
            float[] r0 = r9.f10482d
            int r0 = r0.length
            r4 = r2
        L_0x0024:
            if (r4 >= r0) goto L_0x005a
            int r5 = r9.k
            int r6 = r3 << r4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002f
            r5 = r3
            goto L_0x0030
        L_0x002f:
            r5 = r2
        L_0x0030:
            if (r5 != 0) goto L_0x0033
            goto L_0x0052
        L_0x0033:
            float[] r5 = r9.f10484f
            r5 = r5[r4]
            float[] r6 = r9.f10482d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f10485g
            r6 = r6[r4]
            float[] r7 = r9.f10483e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f10480b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r2
        L_0x0053:
            if (r5 == 0) goto L_0x0057
            r9 = r3
            goto L_0x005b
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x005a:
            r9 = r2
        L_0x005b:
            if (r9 == 0) goto L_0x0075
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f1303i
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$g$a r9 = r9.f1332c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f1304j
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$g$a r9 = r9.f1332c
            r0.removeCallbacks(r9)
            goto L_0x0075
        L_0x0070:
            r8.d(r3)
            r8.f1311r = r2
        L_0x0075:
            r9 = r2
            goto L_0x009f
        L_0x0077:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.u = r0
            r8.f1314v = r9
            float r4 = r8.f1299e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009c
            o0.c r4 = r8.f1301g
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.h(r0, r9)
            if (r9 == 0) goto L_0x009c
            boolean r9 = m(r9)
            if (r9 == 0) goto L_0x009c
            r9 = r3
            goto L_0x009d
        L_0x009c:
            r9 = r2
        L_0x009d:
            r8.f1311r = r2
        L_0x009f:
            if (r1 != 0) goto L_0x00c4
            if (r9 != 0) goto L_0x00c4
            int r9 = r8.getChildCount()
            r0 = r2
        L_0x00a8:
            if (r0 >= r9) goto L_0x00bd
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.e) r1
            boolean r1 = r1.f1323c
            if (r1 == 0) goto L_0x00ba
            r9 = r3
            goto L_0x00be
        L_0x00ba:
            int r0 = r0 + 1
            goto L_0x00a8
        L_0x00bd:
            r9 = r2
        L_0x00be:
            if (r9 != 0) goto L_0x00c4
            boolean r9 = r8.f1311r
            if (r9 == 0) goto L_0x00c5
        L_0x00c4:
            r2 = r3
        L_0x00c5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z9;
        if (i10 == 4) {
            if (g() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View g10 = g();
        if (g10 != null && i(g10) == 0) {
            d(false);
        }
        if (g10 != null) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11 = true;
        this.f1305l = true;
        int i19 = i12 - i10;
        int childCount = getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (m(childAt)) {
                    int i21 = eVar.leftMargin;
                    childAt.layout(i21, eVar.topMargin, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + eVar.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (eVar.f1322b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i22 = i19 - ((int) (eVar.f1322b * f12));
                        f10 = ((float) (i19 - i22)) / f12;
                        i14 = i22;
                    }
                    if (f10 != eVar.f1322b) {
                        z10 = z11;
                    } else {
                        z10 = false;
                    }
                    int i23 = eVar.f1321a & 112;
                    if (i23 != 16) {
                        if (i23 != 80) {
                            i16 = eVar.topMargin;
                            i18 = measuredWidth + i14;
                            i17 = measuredHeight + i16;
                        } else {
                            int i24 = i13 - i11;
                            i16 = (i24 - eVar.bottomMargin) - childAt.getMeasuredHeight();
                            i18 = measuredWidth + i14;
                            i17 = i24 - eVar.bottomMargin;
                        }
                        childAt.layout(i14, i16, i18, i17);
                    } else {
                        int i25 = i13 - i11;
                        int i26 = (i25 - measuredHeight) / 2;
                        int i27 = eVar.topMargin;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = i26 + measuredHeight;
                            int i29 = i25 - eVar.bottomMargin;
                            if (i28 > i29) {
                                i26 = i29 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i26, measuredWidth + i14, measuredHeight + i26);
                    }
                    if (z10) {
                        s(childAt, f10);
                    }
                    if (eVar.f1322b > 0.0f) {
                        i15 = 0;
                    } else {
                        i15 = 4;
                    }
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
            i20++;
            z11 = true;
        }
        if (H && (rootWindowInsets = getRootWindowInsets()) != null) {
            a0.b i30 = s0.i((View) null, rootWindowInsets).f6743a.i();
            o0.c cVar = this.f1301g;
            cVar.f10492o = Math.max(cVar.f10493p, i30.f4a);
            o0.c cVar2 = this.f1302h;
            cVar2.f10492o = Math.max(cVar2.f10493p, i30.f6c);
        }
        this.f1305l = false;
        this.f1306m = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = android.view.View.MeasureSpec.getMode(r17)
            int r2 = android.view.View.MeasureSpec.getMode(r18)
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 300(0x12c, float:4.2E-43)
            if (r1 != r5) goto L_0x001a
            if (r2 == r5) goto L_0x0026
        L_0x001a:
            boolean r5 = r16.isInEditMode()
            if (r5 == 0) goto L_0x019d
            if (r1 != 0) goto L_0x0023
            r3 = r6
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            r4 = r6
        L_0x0026:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.f1315x
            r2 = 0
            if (r1 == 0) goto L_0x0038
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            boolean r1 = h0.y.d.b(r16)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            java.util.WeakHashMap<android.view.View, h0.l0> r5 = h0.y.f6776a
            int r5 = h0.y.e.d(r16)
            int r6 = r16.getChildCount()
            r7 = r2
            r8 = r7
            r9 = r8
        L_0x0046:
            if (r2 >= r6) goto L_0x019c
            android.view.View r10 = r0.getChildAt(r2)
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x0056
            goto L_0x00f8
        L_0x0056:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r11 = (androidx.drawerlayout.widget.DrawerLayout.e) r11
            r12 = 3
            if (r1 == 0) goto L_0x00d7
            int r13 = r11.f1321a
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r5)
            boolean r14 = h0.y.d.b(r10)
            java.lang.Object r15 = r0.f1315x
            android.view.WindowInsets r15 = (android.view.WindowInsets) r15
            if (r14 == 0) goto L_0x0099
            if (r13 != r12) goto L_0x0082
            int r12 = r15.getSystemWindowInsetLeft()
            int r13 = r15.getSystemWindowInsetTop()
            int r14 = r15.getSystemWindowInsetBottom()
            android.view.WindowInsets r15 = r15.replaceSystemWindowInsets(r12, r13, r7, r14)
            goto L_0x0095
        L_0x0082:
            r12 = 5
            if (r13 != r12) goto L_0x0095
            int r12 = r15.getSystemWindowInsetTop()
            int r13 = r15.getSystemWindowInsetRight()
            int r14 = r15.getSystemWindowInsetBottom()
            android.view.WindowInsets r15 = r15.replaceSystemWindowInsets(r7, r12, r13, r14)
        L_0x0095:
            r10.dispatchApplyWindowInsets(r15)
            goto L_0x00d7
        L_0x0099:
            if (r13 != r12) goto L_0x00ac
            int r12 = r15.getSystemWindowInsetLeft()
            int r13 = r15.getSystemWindowInsetTop()
            int r14 = r15.getSystemWindowInsetBottom()
            android.view.WindowInsets r15 = r15.replaceSystemWindowInsets(r12, r13, r7, r14)
            goto L_0x00bf
        L_0x00ac:
            r12 = 5
            if (r13 != r12) goto L_0x00bf
            int r12 = r15.getSystemWindowInsetTop()
            int r13 = r15.getSystemWindowInsetRight()
            int r14 = r15.getSystemWindowInsetBottom()
            android.view.WindowInsets r15 = r15.replaceSystemWindowInsets(r7, r12, r13, r14)
        L_0x00bf:
            int r12 = r15.getSystemWindowInsetLeft()
            r11.leftMargin = r12
            int r12 = r15.getSystemWindowInsetTop()
            r11.topMargin = r12
            int r12 = r15.getSystemWindowInsetRight()
            r11.rightMargin = r12
            int r12 = r15.getSystemWindowInsetBottom()
            r11.bottomMargin = r12
        L_0x00d7:
            boolean r12 = m(r10)
            if (r12 == 0) goto L_0x00fe
            int r7 = r11.leftMargin
            int r7 = r3 - r7
            int r12 = r11.rightMargin
            int r7 = r7 - r12
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            int r13 = r11.topMargin
            int r13 = r4 - r13
            int r11 = r11.bottomMargin
            int r13 = r13 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r12)
            r10.measure(r7, r11)
        L_0x00f8:
            r13 = r17
            r14 = r18
            goto L_0x0173
        L_0x00fe:
            boolean r12 = o(r10)
            if (r12 == 0) goto L_0x0178
            boolean r12 = G
            if (r12 == 0) goto L_0x0115
            float r12 = h0.y.i.i(r10)
            float r13 = r0.f1296b
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0115
            h0.y.i.s(r10, r13)
        L_0x0115:
            int r12 = r0.j(r10)
            r12 = r12 & 7
            r13 = 3
            if (r12 != r13) goto L_0x011f
            r7 = 1
        L_0x011f:
            if (r7 == 0) goto L_0x0123
            if (r8 != 0) goto L_0x0128
        L_0x0123:
            if (r7 != 0) goto L_0x014e
            if (r9 != 0) goto L_0x0128
            goto L_0x014e
        L_0x0128:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
            java.lang.String r3 = k(r12)
            r2.append(r3)
            java.lang.String r3 = " but this "
            r2.append(r3)
            java.lang.String r3 = "DrawerLayout"
            r2.append(r3)
            java.lang.String r3 = " already has a drawer view along that edge"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x014e:
            if (r7 == 0) goto L_0x0152
            r8 = 1
            goto L_0x0153
        L_0x0152:
            r9 = 1
        L_0x0153:
            int r7 = r0.f1297c
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r12 = r11.rightMargin
            int r7 = r7 + r12
            int r12 = r11.width
            r13 = r17
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r13, r7, r12)
            int r12 = r11.topMargin
            int r14 = r11.bottomMargin
            int r12 = r12 + r14
            int r11 = r11.height
            r14 = r18
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r14, r12, r11)
            r10.measure(r7, r11)
        L_0x0173:
            int r2 = r2 + 1
            r7 = 0
            goto L_0x0046
        L_0x0178:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Child "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = " at index "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x019c:
            return
        L_0x019d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        View e10;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f9479a);
        int i10 = fVar.f1325c;
        if (!(i10 == 0 || (e10 = e(i10)) == null)) {
            q(e10);
        }
        int i11 = fVar.f1326d;
        if (i11 != 3) {
            r(i11, 3);
        }
        int i12 = fVar.f1327e;
        if (i12 != 3) {
            r(i12, 5);
        }
        int i13 = fVar.f1328f;
        if (i13 != 3) {
            r(i13, 8388611);
        }
        int i14 = fVar.f1329g;
        if (i14 != 3) {
            r(i14, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i10) {
        if (!G) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.e.d(this);
            y.e.d(this);
        }
    }

    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            e eVar = (e) getChildAt(i10).getLayoutParams();
            int i11 = eVar.f1324d;
            boolean z9 = true;
            boolean z10 = i11 == 1;
            if (i11 != 2) {
                z9 = false;
            }
            if (z10 || z9) {
                fVar.f1325c = eVar.f1321a;
            } else {
                i10++;
            }
        }
        fVar.f1326d = this.f1307n;
        fVar.f1327e = this.f1308o;
        fVar.f1328f = this.f1309p;
        fVar.f1329g = this.f1310q;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (i(r7) != 2) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            o0.c r0 = r6.f1301g
            r0.k(r7)
            o0.c r0 = r6.f1302h
            r0.k(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 == r2) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x0069
        L_0x001a:
            r6.d(r2)
            goto L_0x0067
        L_0x001e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            o0.c r3 = r6.f1301g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.h(r4, r5)
            if (r3 == 0) goto L_0x0056
            boolean r3 = m(r3)
            if (r3 == 0) goto L_0x0056
            float r3 = r6.u
            float r0 = r0 - r3
            float r3 = r6.f1314v
            float r7 = r7 - r3
            o0.c r3 = r6.f1301g
            int r3 = r3.f10480b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0056
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L_0x0056
            int r7 = r6.i(r7)
            r0 = 2
            if (r7 != r0) goto L_0x0057
        L_0x0056:
            r1 = r2
        L_0x0057:
            r6.d(r1)
            goto L_0x0069
        L_0x005b:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.u = r0
            r6.f1314v = r7
        L_0x0067:
            r6.f1311r = r1
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void q(View view) {
        o0.c cVar;
        if (o(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f1306m) {
                eVar.f1322b = 1.0f;
                eVar.f1324d = 1;
                u(view, true);
                t(view);
            } else {
                int i10 = 0;
                eVar.f1324d |= 2;
                if (a(view, 3)) {
                    cVar = this.f1301g;
                } else {
                    cVar = this.f1302h;
                    i10 = getWidth() - view.getWidth();
                }
                cVar.s(view, i10, view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void r(int i10, int i11) {
        View e10;
        o0.c cVar;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, y.e.d(this));
        if (i11 == 3) {
            this.f1307n = i10;
        } else if (i11 == 5) {
            this.f1308o = i10;
        } else if (i11 == 8388611) {
            this.f1309p = i10;
        } else if (i11 == 8388613) {
            this.f1310q = i10;
        }
        if (i10 != 0) {
            if (absoluteGravity == 3) {
                cVar = this.f1301g;
            } else {
                cVar = this.f1302h;
            }
            cVar.a();
        }
        if (i10 == 1) {
            View e11 = e(absoluteGravity);
            if (e11 != null) {
                b(e11);
            }
        } else if (i10 == 2 && (e10 = e(absoluteGravity)) != null) {
            q(e10);
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9) {
            d(true);
        }
    }

    public final void requestLayout() {
        if (!this.f1305l) {
            super.requestLayout();
        }
    }

    public final void s(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 != eVar.f1322b) {
            eVar.f1322b = f10;
            ArrayList arrayList = this.f1313t;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((d) this.f1313t.get(size)).c(f10);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setDrawerElevation(float f10) {
        this.f1296b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (o(childAt)) {
                float f11 = this.f1296b;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.i.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.f1312s;
        if (!(dVar2 == null || (arrayList = this.f1313t) == null)) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            if (this.f1313t == null) {
                this.f1313t = new ArrayList();
            }
            this.f1313t.add(dVar);
        }
        this.f1312s = dVar;
    }

    public void setDrawerLockMode(int i10) {
        r(i10, 3);
        r(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f1298d = i10;
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = y.a.f13006a;
            drawable = a.b.b(context, i10);
        } else {
            drawable = null;
        }
        this.w = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.w = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(View view) {
        f.a aVar = f.a.f7100l;
        y.k(view, aVar.a());
        y.h(view, 0);
        if (n(view) && i(view) != 2) {
            y.l(view, aVar, this.C);
        }
    }

    public final void u(View view, boolean z9) {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((z9 || o(childAt)) && (!z9 || childAt != view)) {
                i10 = 4;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
            } else {
                WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                i10 = 1;
            }
            y.d.s(childAt, i10);
        }
    }

    public final void v(View view, int i10) {
        View rootView;
        int i11 = this.f1301g.f10479a;
        int i12 = this.f1302h.f10479a;
        int i13 = 2;
        if (i11 == 1 || i12 == 1) {
            i13 = 1;
        } else if (!(i11 == 2 || i12 == 2)) {
            i13 = 0;
        }
        if (view != null && i10 == 0) {
            float f10 = ((e) view.getLayoutParams()).f1322b;
            if (f10 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.f1324d & 1) == 1) {
                    eVar.f1324d = 0;
                    ArrayList arrayList = this.f1313t;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((d) this.f1313t.get(size)).d();
                        }
                    }
                    u(view, false);
                    t(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.f1324d & 1) == 0) {
                    eVar2.f1324d = 1;
                    ArrayList arrayList2 = this.f1313t;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((d) this.f1313t.get(size2)).a();
                        }
                    }
                    u(view, true);
                    t(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i13 != this.k) {
            this.k = i13;
            ArrayList arrayList3 = this.f1313t;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((d) this.f1313t.get(size3)).b();
                }
            }
        }
    }
}
