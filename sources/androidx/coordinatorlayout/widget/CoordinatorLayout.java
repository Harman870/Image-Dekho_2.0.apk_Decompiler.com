package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b0.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.n;
import h0.o;
import h0.p;
import h0.q;
import h0.s0;
import h0.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import y.a;

public class CoordinatorLayout extends ViewGroup implements n, o {

    /* renamed from: t  reason: collision with root package name */
    public static final String f1212t;
    public static final Class<?>[] u = {Context.class, AttributeSet.class};

    /* renamed from: v  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f1213v = new ThreadLocal<>();
    public static final i w = new i();

    /* renamed from: x  reason: collision with root package name */
    public static final g0.f f1214x = new g0.f(12);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1215a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final v.a f1216b = new v.a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1217c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1218d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1219e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1220f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1221g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1222h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1223i;

    /* renamed from: j  reason: collision with root package name */
    public View f1224j;
    public View k;

    /* renamed from: l  reason: collision with root package name */
    public g f1225l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1226m;

    /* renamed from: n  reason: collision with root package name */
    public s0 f1227n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1228o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1229p;

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1230q;

    /* renamed from: r  reason: collision with root package name */
    public a f1231r;

    /* renamed from: s  reason: collision with root package name */
    public final p f1232s = new p();

    public class a implements q {
        public a() {
        }

        public final s0 a(View view, s0 s0Var) {
            boolean z9;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!g0.b.a(coordinatorLayout.f1227n, s0Var)) {
                coordinatorLayout.f1227n = s0Var;
                boolean z10 = true;
                if (s0Var.e() > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                coordinatorLayout.f1228o = z9;
                if (z9 || coordinatorLayout.getBackground() != null) {
                    z10 = false;
                }
                coordinatorLayout.setWillNotDraw(z10);
                if (!s0Var.f6743a.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, l0> weakHashMap = y.f6776a;
                        if (y.d.b(childAt) && ((f) childAt.getLayoutParams()).f1235a != null && s0Var.f6743a.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return s0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z9) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1230q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1230q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1235a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1236b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1237c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1238d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1239e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1240f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1241g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1242h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1243i;

        /* renamed from: j  reason: collision with root package name */
        public int f1244j;
        public View k;

        /* renamed from: l  reason: collision with root package name */
        public View f1245l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1246m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1247n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1248o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1249p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1250q = new Rect();

        public f() {
            super(-2, -2);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2357q0);
            this.f1237c = obtainStyledAttributes.getInteger(0, 0);
            this.f1240f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1238d = obtainStyledAttributes.getInteger(2, 0);
            this.f1239e = obtainStyledAttributes.getInteger(6, -1);
            this.f1241g = obtainStyledAttributes.getInt(5, 0);
            this.f1242h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1236b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f1212t;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f1212t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f1213v;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e10) {
                        throw new RuntimeException(com.ironsource.adapters.ironsource.a.g("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1235a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1235a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super(fVar);
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f1247n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f1248o;
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends n0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f1252c;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1252c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1252c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f9479a, i10);
            SparseArray<Parcelable> sparseArray = this.f1252c;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f1252c.keyAt(i12);
                parcelableArr[i12] = this.f1252c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public static class i implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            float m2 = y.i.m((View) obj);
            float m8 = y.i.m((View) obj2);
            if (m2 > m8) {
                return -1;
            }
            if (m2 < m8) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f1212t = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            w = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            u = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1213v = r0
            g0.f r0 = new g0.f
            r1 = 12
            r0.<init>(r1)
            f1214x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = c.a.p0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1223i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f1223i.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f1223i;
                iArr2[i10] = (int) (((float) iArr2[i10]) * f10);
            }
        }
        this.f1229p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.d.c(this) == 0) {
            y.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f1214x.b();
        return rect == null ? new Rect() : rect;
    }

    public static void h(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14;
        int i15 = fVar.f1237c;
        if (i15 == 0) {
            i15 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = fVar.f1238d;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i16, i10);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int i19 = absoluteGravity2 & 7;
        int i20 = absoluteGravity2 & 112;
        if (i19 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i19 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i20 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i20 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i17 == 1) {
            i13 -= i11 / 2;
        } else if (i17 != 5) {
            i13 -= i11;
        }
        if (i18 == 16) {
            i14 -= i12 / 2;
        } else if (i18 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    public static f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1236b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.f1235a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.f();
                    }
                    fVar.f1235a = behavior;
                    fVar.f1236b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c cVar2 = (c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar3 = fVar.f1235a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.f();
                            }
                            fVar.f1235a = cVar2;
                            fVar.f1236b = true;
                            if (cVar2 != null) {
                                cVar2.c(fVar);
                            }
                        }
                    } catch (Exception e10) {
                        StringBuilder g10 = androidx.activity.f.g("Default behavior class ");
                        g10.append(dVar.value().getName());
                        g10.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", g10.toString(), e10);
                    }
                }
            }
            fVar.f1236b = true;
        }
        return fVar;
    }

    public static void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1243i;
        if (i11 != i10) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.f1243i = i10;
        }
    }

    public static void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1244j;
        if (i11 != i10) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f1244j = i10;
        }
    }

    public final void b(View view, View view2, int i10, int i11) {
        p pVar = this.f1232s;
        if (i11 == 1) {
            pVar.f6714b = i10;
        } else {
            pVar.f6713a = i10;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    public final void c(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view) {
        List list = (List) ((m.h) this.f1216b.f12378b).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                c cVar = ((f) view2.getLayoutParams()).f1235a;
                if (cVar != null) {
                    cVar.d(this, view2, view);
                }
            }
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f1235a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1229p;
        boolean z9 = false;
        if (drawable != null && drawable.isStateful()) {
            z9 = false | drawable.setState(drawableState);
        }
        if (z9) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect, boolean z9) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z9) {
            g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList f(View view) {
        v.a aVar = this.f1216b;
        int i10 = ((m.h) aVar.f12378b).f9301c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((m.h) aVar.f12378b).l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((m.h) aVar.f12378b).h(i11));
            }
        }
        this.f1218d.clear();
        if (arrayList != null) {
            this.f1218d.addAll(arrayList);
        }
        return this.f1218d;
    }

    public final void g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = v.b.f12381a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = v.b.f12381a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        v.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = v.b.f12382b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f1215a);
    }

    public final s0 getLastWindowInsets() {
        return this.f1227n;
    }

    public int getNestedScrollAxes() {
        p pVar = this.f1232s;
        return pVar.f6714b | pVar.f6713a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1229p;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void i(View view, int i10) {
        p pVar = this.f1232s;
        if (i10 == 1) {
            pVar.f6714b = 0;
        } else {
            pVar.f6713a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f1235a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    fVar.f1247n = false;
                } else if (i10 == 1) {
                    fVar.f1248o = false;
                }
                fVar.f1249p = false;
            }
        }
        this.k = null;
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int i13;
        int i14;
        int childCount = getChildCount();
        boolean z9 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f1235a) != null) {
                    int[] iArr2 = this.f1219e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1219e;
                    if (i10 > 0) {
                        i13 = Math.max(i15, iArr3[0]);
                    } else {
                        i13 = Math.min(i15, iArr3[0]);
                    }
                    i15 = i13;
                    int[] iArr4 = this.f1219e;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr4[1]);
                    } else {
                        i14 = Math.min(i16, iArr4[1]);
                    }
                    i16 = i14;
                    z9 = true;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        if (z9) {
            q(1);
        }
    }

    public final int k(int i10) {
        StringBuilder sb;
        int[] iArr = this.f1223i;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i10);
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i10);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int i15;
        int i16;
        int childCount = getChildCount();
        boolean z9 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                int i20 = i14;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f1235a) != null) {
                    int[] iArr2 = this.f1219e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f1219e;
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr3[0]);
                    } else {
                        i15 = Math.min(i17, iArr3[0]);
                    }
                    i17 = i15;
                    int[] iArr4 = this.f1219e;
                    if (i13 > 0) {
                        i16 = Math.max(i18, iArr4[1]);
                    } else {
                        i16 = Math.min(i18, iArr4[1]);
                    }
                    i18 = i16;
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (z9) {
            q(1);
        }
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1220f);
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1235a;
                if (cVar != null) {
                    boolean p5 = cVar.p(this, childAt, view, view2, i10, i11);
                    z9 |= p5;
                    if (i12 == 0) {
                        fVar.f1247n = p5;
                    } else if (i12 == 1) {
                        fVar.f1248o = p5;
                    }
                } else if (i12 == 0) {
                    fVar.f1247n = false;
                } else if (i12 == 1) {
                    fVar.f1248o = false;
                }
            }
        }
        return z9;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f1226m) {
            if (this.f1225l == null) {
                this.f1225l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1225l);
        }
        if (this.f1227n == null) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.d.b(this)) {
                y.h.c(this);
            }
        }
        this.f1222h = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f1226m && this.f1225l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1225l);
        }
        View view = this.k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1222h = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1228o && this.f1229p != null) {
            s0 s0Var = this.f1227n;
            int e10 = s0Var != null ? s0Var.e() : 0;
            if (e10 > 0) {
                this.f1229p.setBounds(0, 0, getWidth(), e10);
                this.f1229p.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t10;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int d10 = y.e.d(this);
        int size = this.f1215a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f1215a.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1235a) == null || !cVar.h(this, view, d10))) {
                r(view, d10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0190, code lost:
        if (r0.i(r30, r19, r24, r20, r25) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            r30.u()
            int r0 = r30.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r6.getChildAt(r1)
            v.a r4 = r6.f1216b
            java.lang.Object r5 = r4.f12378b
            m.h r5 = (m.h) r5
            int r5 = r5.f9301c
            r8 = r7
        L_0x001b:
            if (r8 >= r5) goto L_0x0034
            java.lang.Object r9 = r4.f12378b
            m.h r9 = (m.h) r9
            java.lang.Object r9 = r9.l(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = r2
            goto L_0x0035
        L_0x0031:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0034:
            r3 = r7
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = r2
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = r7
        L_0x003d:
            boolean r1 = r6.f1226m
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.f1222h
            if (r0 == 0) goto L_0x005b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.f1225l
            if (r0 != 0) goto L_0x0052
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r6.f1225l = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.f1225l
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r6.f1226m = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r6.f1222h
            if (r0 == 0) goto L_0x006f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.f1225l
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.f1225l
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r6.f1226m = r7
        L_0x0071:
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, h0.l0> r3 = h0.y.f6776a
            int r10 = h0.y.e.d(r30)
            if (r10 != r2) goto L_0x008b
            r11 = r2
            goto L_0x008c
        L_0x008b:
            r11 = r7
        L_0x008c:
            int r12 = android.view.View.MeasureSpec.getMode(r31)
            int r13 = android.view.View.MeasureSpec.getSize(r31)
            int r14 = android.view.View.MeasureSpec.getMode(r32)
            int r15 = android.view.View.MeasureSpec.getSize(r32)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            h0.s0 r3 = r6.f1227n
            if (r3 == 0) goto L_0x00b5
            boolean r3 = h0.y.d.b(r30)
            if (r3 == 0) goto L_0x00b5
            r18 = r2
            goto L_0x00b7
        L_0x00b5:
            r18 = r7
        L_0x00b7:
            java.util.ArrayList r2 = r6.f1215a
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = r7
            r2 = r1
        L_0x00c1:
            if (r2 >= r5) goto L_0x01ec
            java.util.ArrayList r0 = r6.f1215a
            java.lang.Object r0 = r0.get(r2)
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            int r0 = r19.getVisibility()
            r7 = 8
            if (r0 != r7) goto L_0x00e3
            r21 = r2
            r28 = r5
            r22 = r8
            r26 = r9
            r27 = r10
            r23 = 0
            goto L_0x01de
        L_0x00e3:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
            int r0 = r7.f1239e
            if (r0 < 0) goto L_0x012f
            if (r12 == 0) goto L_0x012f
            int r0 = r6.k(r0)
            r21 = r1
            int r1 = r7.f1237c
            if (r1 != 0) goto L_0x00fd
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00fd:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L_0x010a
            if (r11 == 0) goto L_0x010f
        L_0x010a:
            r2 = 5
            if (r1 != r2) goto L_0x011b
            if (r11 == 0) goto L_0x011b
        L_0x010f:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0136
        L_0x011b:
            if (r1 != r2) goto L_0x011f
            if (r11 == 0) goto L_0x0124
        L_0x011f:
            r2 = 3
            if (r1 != r2) goto L_0x012d
            if (r11 == 0) goto L_0x012d
        L_0x0124:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0136
        L_0x012d:
            r2 = 0
            goto L_0x0134
        L_0x012f:
            r21 = r1
            r22 = r2
            goto L_0x012d
        L_0x0134:
            r20 = r2
        L_0x0136:
            if (r18 == 0) goto L_0x0169
            boolean r0 = h0.y.d.b(r19)
            if (r0 != 0) goto L_0x0169
            h0.s0 r0 = r6.f1227n
            int r0 = r0.c()
            h0.s0 r1 = r6.f1227n
            int r1 = r1.d()
            int r1 = r1 + r0
            h0.s0 r0 = r6.f1227n
            int r0 = r0.e()
            h0.s0 r2 = r6.f1227n
            int r2 = r2.b()
            int r2 = r2 + r0
            int r0 = r13 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r24 = r0
            r25 = r1
            goto L_0x016d
        L_0x0169:
            r24 = r31
            r25 = r32
        L_0x016d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r7.f1235a
            if (r0 == 0) goto L_0x0193
            r2 = r21
            r1 = r30
            r21 = r22
            r23 = 0
            r22 = r8
            r8 = r2
            r2 = r19
            r26 = r9
            r9 = r3
            r3 = r24
            r27 = r10
            r10 = r4
            r4 = r20
            r28 = r5
            r5 = r25
            boolean r0 = r0.i(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01b3
            goto L_0x01a5
        L_0x0193:
            r28 = r5
            r26 = r9
            r27 = r10
            r23 = 0
            r9 = r3
            r10 = r4
            r29 = r22
            r22 = r8
            r8 = r21
            r21 = r29
        L_0x01a5:
            r5 = 0
            r0 = r30
            r1 = r19
            r2 = r24
            r3 = r20
            r4 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01b3:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r16
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r1 + r17
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r1
            r1 = r2
        L_0x01de:
            int r2 = r21 + 1
            r8 = r22
            r7 = r23
            r9 = r26
            r10 = r27
            r5 = r28
            goto L_0x00c1
        L_0x01ec:
            r8 = r1
            r9 = r3
            r10 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r31
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r32
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1235a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1235a) != null) {
                    z9 |= cVar.j(view);
                }
            }
        }
        return z9;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        b(view, view2, i10, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f9479a);
        SparseArray<Parcelable> sparseArray = hVar.f1252c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = l(childAt).f1235a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1235a;
            if (!(id == -1 || cVar == null || (o10 = cVar.o(childAt)) == null)) {
                sparseArray.append(id, o10);
            }
        }
        hVar.f1252c = sparseArray;
        return hVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1224j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f1224j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1235a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1224j
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f1224j
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i10, int i11) {
        Rect a10 = a();
        g(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            f1214x.a(a10);
        }
    }

    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z9;
        boolean z10;
        boolean z11;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        Rect rect2;
        int i20;
        int i21;
        c cVar;
        int i22 = i10;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int d10 = y.e.d(this);
        int size = this.f1215a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i23 = 0;
        int i24 = i22;
        while (i23 < size) {
            View view = (View) this.f1215a.get(i23);
            f fVar = (f) view.getLayoutParams();
            if (i24 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = a12;
                i11 = i23;
            } else {
                int i25 = 0;
                while (i25 < i23) {
                    if (fVar.f1245l == ((View) this.f1215a.get(i25))) {
                        f fVar2 = (f) view.getLayoutParams();
                        if (fVar2.k != null) {
                            Rect a13 = a();
                            Rect a14 = a();
                            Rect a15 = a();
                            g(fVar2.k, a13);
                            e(view, a14, false);
                            int measuredWidth = view.getMeasuredWidth();
                            i21 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            boolean z12 = true;
                            int i26 = measuredWidth;
                            Rect rect3 = a15;
                            i20 = i23;
                            Rect rect4 = a14;
                            Rect rect5 = a13;
                            rect2 = a12;
                            f fVar3 = fVar2;
                            i19 = i25;
                            h(d10, a13, rect3, fVar2, i26, measuredHeight);
                            Rect rect6 = rect3;
                            if (rect6.left == rect4.left && rect6.top == rect4.top) {
                                z12 = false;
                            }
                            c(fVar3, rect6, i26, measuredHeight);
                            int i27 = rect6.left - rect4.left;
                            int i28 = rect6.top - rect4.top;
                            if (i27 != 0) {
                                WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                                view.offsetLeftAndRight(i27);
                            }
                            if (i28 != 0) {
                                WeakHashMap<View, l0> weakHashMap3 = y.f6776a;
                                view.offsetTopAndBottom(i28);
                            }
                            if (z12 && (cVar = fVar3.f1235a) != null) {
                                cVar.d(this, view, fVar3.k);
                            }
                            rect5.setEmpty();
                            g0.f fVar4 = f1214x;
                            fVar4.a(rect5);
                            rect4.setEmpty();
                            fVar4.a(rect4);
                            rect6.setEmpty();
                            fVar4.a(rect6);
                            i25 = i19 + 1;
                            size = i21;
                            i23 = i20;
                            a12 = rect2;
                        }
                    }
                    i19 = i25;
                    i21 = size;
                    rect2 = a12;
                    i20 = i23;
                    i25 = i19 + 1;
                    size = i21;
                    i23 = i20;
                    a12 = rect2;
                }
                int i29 = size;
                Rect rect7 = a12;
                i11 = i23;
                e(view, a11, true);
                if (fVar.f1241g != 0 && !a11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f1241g, d10);
                    int i30 = absoluteGravity & 112;
                    if (i30 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i30 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i31 = absoluteGravity & 7;
                    if (i31 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i31 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f1242h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, l0> weakHashMap4 = y.f6776a;
                    if (y.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar5 = (f) view.getLayoutParams();
                        c cVar2 = fVar5.f1235a;
                        Rect a16 = a();
                        Rect a17 = a();
                        a17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(view, a16)) {
                            a16.set(a17);
                        } else if (!a17.contains(a16)) {
                            StringBuilder g10 = androidx.activity.f.g("Rect should be within the child's bounds. Rect:");
                            g10.append(a16.toShortString());
                            g10.append(" | Bounds:");
                            g10.append(a17.toShortString());
                            throw new IllegalArgumentException(g10.toString());
                        }
                        a17.setEmpty();
                        g0.f fVar6 = f1214x;
                        fVar6.a(a17);
                        if (!a16.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar5.f1242h, d10);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (a16.top - fVar5.topMargin) - fVar5.f1244j) >= (i18 = a10.top)) {
                                z10 = false;
                            } else {
                                x(view, i18 - i17);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - fVar5.bottomMargin) + fVar5.f1244j) < (i16 = a10.bottom)) {
                                x(view, height - i16);
                                z10 = true;
                            }
                            if (!z10) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (a16.left - fVar5.leftMargin) - fVar5.f1243i) >= (i15 = a10.left)) {
                                z11 = false;
                            } else {
                                w(view, i15 - i14);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - fVar5.rightMargin) + fVar5.f1243i) < (i13 = a10.right)) {
                                w(view, width - i13);
                                z11 = true;
                            }
                            if (!z11) {
                                w(view, 0);
                            }
                        }
                        a16.setEmpty();
                        fVar6.a(a16);
                    }
                }
                if (i22 != 2) {
                    rect = rect7;
                    rect.set(((f) view.getLayoutParams()).f1250q);
                    if (rect.equals(a11)) {
                        i12 = i29;
                        i24 = i22;
                    } else {
                        ((f) view.getLayoutParams()).f1250q.set(a11);
                    }
                } else {
                    rect = rect7;
                }
                i12 = i29;
                for (int i32 = i11 + 1; i32 < i12; i32++) {
                    View view2 = (View) this.f1215a.get(i32);
                    f fVar7 = (f) view2.getLayoutParams();
                    c cVar3 = fVar7.f1235a;
                    if (cVar3 != null && cVar3.b(view2, view)) {
                        if (i22 != 0 || !fVar7.f1249p) {
                            if (i22 != 2) {
                                z9 = cVar3.d(this, view2, view);
                            } else {
                                cVar3.e(this, view);
                                z9 = true;
                            }
                            if (i22 == 1) {
                                fVar7.f1249p = z9;
                            }
                        } else {
                            fVar7.f1249p = false;
                        }
                    }
                }
                i24 = i22;
            }
            i23 = i11 + 1;
            size = i12;
            a12 = rect;
        }
        Rect rect8 = a12;
        a10.setEmpty();
        g0.f fVar8 = f1214x;
        fVar8.a(a10);
        a11.setEmpty();
        fVar8.a(a11);
        rect8.setEmpty();
        fVar8.a(rect8);
    }

    public final void r(View view, int i10) {
        boolean z9;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        int i11 = 0;
        if (view2 != null || fVar.f1240f == -1) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a10 = a();
            Rect a11 = a();
            try {
                g(view2, a10);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                h(i10, a10, a11, fVar2, measuredWidth, measuredHeight);
                c(fVar2, a11, measuredWidth, measuredHeight);
                view.layout(a11.left, a11.top, a11.right, a11.bottom);
            } finally {
                a10.setEmpty();
                g0.f fVar3 = f1214x;
                fVar3.a(a10);
                a11.setEmpty();
                fVar3.a(a11);
            }
        } else {
            int i12 = fVar.f1239e;
            if (i12 >= 0) {
                f fVar4 = (f) view.getLayoutParams();
                int i13 = fVar4.f1237c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int k10 = k(i12) - measuredWidth2;
                if (i14 == 1) {
                    k10 += measuredWidth2 / 2;
                } else if (i14 == 5) {
                    k10 += measuredWidth2;
                }
                if (i15 == 16) {
                    i11 = 0 + (measuredHeight2 / 2);
                } else if (i15 == 80) {
                    i11 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar4.leftMargin, Math.min(k10, ((width - getPaddingRight()) - measuredWidth2) - fVar4.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar4.topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - fVar4.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar5 = (f) view.getLayoutParams();
            Rect a12 = a();
            a12.set(getPaddingLeft() + fVar5.leftMargin, getPaddingTop() + fVar5.topMargin, (getWidth() - getPaddingRight()) - fVar5.rightMargin, (getHeight() - getPaddingBottom()) - fVar5.bottomMargin);
            if (this.f1227n != null) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (y.d.b(this) && !y.d.b(view)) {
                    a12.left = this.f1227n.c() + a12.left;
                    a12.top = this.f1227n.e() + a12.top;
                    a12.right -= this.f1227n.d();
                    a12.bottom -= this.f1227n.b();
                }
            }
            Rect a13 = a();
            int i16 = fVar5.f1237c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            h0.e.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a12, a13, i10);
            view.layout(a13.left, a13.top, a13.right, a13.bottom);
            a12.setEmpty();
            g0.f fVar6 = f1214x;
            fVar6.a(a12);
            a13.setEmpty();
            fVar6.a(a13);
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        c cVar = ((f) view.getLayoutParams()).f1235a;
        if (cVar == null || !cVar.m(this, view, rect, z9)) {
            return super.requestChildRectangleOnScreen(view, rect, z9);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9 && !this.f1221g) {
            v(false);
            this.f1221g = true;
        }
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1230q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z9;
        Drawable drawable2 = this.f1229p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1229p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1229p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1229p;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                a.c.b(drawable4, y.e.d(this));
                Drawable drawable5 = this.f1229p;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable5.setVisible(z9, false);
                this.f1229p.setCallback(this);
            }
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            y.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = y.a.f13006a;
            drawable = a.b.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f1229p;
        if (drawable != null && drawable.isVisible() != z9) {
            this.f1229p.setVisible(z9, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        boolean z9;
        int i11;
        MotionEvent motionEvent2 = motionEvent;
        int i12 = i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1217c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i13);
            } else {
                i11 = i13;
            }
            arrayList.add(getChildAt(i11));
        }
        i iVar = w;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1235a;
            if ((!z10 && !z11) || actionMasked == 0) {
                if (!z10 && cVar != null) {
                    if (i12 == 0) {
                        z10 = cVar.g(this, view, motionEvent2);
                    } else if (i12 == 1) {
                        z10 = cVar.r(this, view, motionEvent2);
                    }
                    if (z10) {
                        this.f1224j = view;
                    }
                }
                if (fVar.f1235a == null) {
                    fVar.f1246m = false;
                }
                boolean z12 = fVar.f1246m;
                if (z12) {
                    z9 = true;
                } else {
                    z9 = z12 | false;
                    fVar.f1246m = z9;
                }
                if (!z9 || z12) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z9 && !z11) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i12 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i12 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r5 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0184 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f1215a
            r0.clear()
            v.a r0 = r12.f1216b
            java.lang.Object r1 = r0.f12378b
            m.h r1 = (m.h) r1
            int r1 = r1.f9301c
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 >= r1) goto L_0x002a
            java.lang.Object r4 = r0.f12378b
            m.h r4 = (m.h) r4
            java.lang.Object r4 = r4.l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0027
            r4.clear()
            java.lang.Object r5 = r0.f12377a
            g0.d r5 = (g0.d) r5
            r5.a(r4)
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x002a:
            java.lang.Object r0 = r0.f12378b
            m.h r0 = (m.h) r0
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x0036:
            if (r1 >= r0) goto L_0x01b1
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = l(r3)
            int r5 = r4.f1240f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x004d
            r4.f1245l = r7
            r4.k = r7
            goto L_0x00cb
        L_0x004d:
            android.view.View r5 = r4.k
            if (r5 == 0) goto L_0x007e
            int r5 = r5.getId()
            int r6 = r4.f1240f
            if (r5 == r6) goto L_0x005a
            goto L_0x0077
        L_0x005a:
            android.view.View r5 = r4.k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0060:
            if (r6 == r12) goto L_0x0079
            if (r6 == 0) goto L_0x0073
            if (r6 != r3) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x006e
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006e:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0060
        L_0x0073:
            r4.f1245l = r7
            r4.k = r7
        L_0x0077:
            r5 = r2
            goto L_0x007c
        L_0x0079:
            r4.f1245l = r5
            r5 = r8
        L_0x007c:
            if (r5 != 0) goto L_0x00cb
        L_0x007e:
            int r5 = r4.f1240f
            android.view.View r5 = r12.findViewById(r5)
            r4.k = r5
            if (r5 == 0) goto L_0x00c1
            if (r5 != r12) goto L_0x0099
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0091
            goto L_0x00c7
        L_0x0091:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0099:
            android.view.ViewParent r6 = r5.getParent()
        L_0x009d:
            if (r6 == r12) goto L_0x00be
            if (r6 == 0) goto L_0x00be
            if (r6 != r3) goto L_0x00b2
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00aa
            goto L_0x00c7
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00b9
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b9:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x009d
        L_0x00be:
            r4.f1245l = r5
            goto L_0x00cb
        L_0x00c1:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x018c
        L_0x00c7:
            r4.f1245l = r7
            r4.k = r7
        L_0x00cb:
            v.a r5 = r12.f1216b
            java.lang.Object r6 = r5.f12378b
            m.h r6 = (m.h) r6
            boolean r6 = r6.containsKey(r3)
            if (r6 != 0) goto L_0x00de
            java.lang.Object r5 = r5.f12378b
            m.h r5 = (m.h) r5
            r5.put(r3, r7)
        L_0x00de:
            r5 = r2
        L_0x00df:
            if (r5 >= r0) goto L_0x0188
            if (r5 != r1) goto L_0x00e5
            goto L_0x0184
        L_0x00e5:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f1245l
            if (r6 == r9) goto L_0x011c
            java.util.WeakHashMap<android.view.View, h0.l0> r9 = h0.y.f6776a
            int r9 = h0.y.e.d(r12)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
            int r10 = r10.f1241g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x010c
            int r11 = r4.f1242h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x010c
            r9 = r8
            goto L_0x010d
        L_0x010c:
            r9 = r2
        L_0x010d:
            if (r9 != 0) goto L_0x011c
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r4.f1235a
            if (r9 == 0) goto L_0x011a
            boolean r9 = r9.b(r3, r6)
            if (r9 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r9 = r2
            goto L_0x011d
        L_0x011c:
            r9 = r8
        L_0x011d:
            if (r9 == 0) goto L_0x0184
            v.a r9 = r12.f1216b
            java.lang.Object r9 = r9.f12378b
            m.h r9 = (m.h) r9
            boolean r9 = r9.containsKey(r6)
            if (r9 != 0) goto L_0x013e
            v.a r9 = r12.f1216b
            java.lang.Object r10 = r9.f12378b
            m.h r10 = (m.h) r10
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x013e
            java.lang.Object r9 = r9.f12378b
            m.h r9 = (m.h) r9
            r9.put(r6, r7)
        L_0x013e:
            v.a r9 = r12.f1216b
            java.lang.Object r10 = r9.f12378b
            m.h r10 = (m.h) r10
            boolean r10 = r10.containsKey(r6)
            if (r10 == 0) goto L_0x017c
            java.lang.Object r10 = r9.f12378b
            m.h r10 = (m.h) r10
            boolean r10 = r10.containsKey(r3)
            if (r10 == 0) goto L_0x017c
            java.lang.Object r10 = r9.f12378b
            m.h r10 = (m.h) r10
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0178
            java.lang.Object r10 = r9.f12377a
            g0.d r10 = (g0.d) r10
            java.lang.Object r10 = r10.b()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0171
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0171:
            java.lang.Object r9 = r9.f12378b
            m.h r9 = (m.h) r9
            r9.put(r6, r10)
        L_0x0178:
            r10.add(r3)
            goto L_0x0184
        L_0x017c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0184:
            int r5 = r5 + 1
            goto L_0x00df
        L_0x0188:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x018c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f1240f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            java.util.ArrayList r0 = r12.f1215a
            v.a r1 = r12.f1216b
            java.lang.Object r3 = r1.f12379c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f12380d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            java.lang.Object r3 = r1.f12378b
            m.h r3 = (m.h) r3
            int r3 = r3.f9301c
        L_0x01c9:
            if (r2 >= r3) goto L_0x01e1
            java.lang.Object r4 = r1.f12378b
            m.h r4 = (m.h) r4
            java.lang.Object r4 = r4.h(r2)
            java.lang.Object r5 = r1.f12379c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f12380d
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.a(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01c9
        L_0x01e1:
            java.lang.Object r1 = r1.f12379c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.ArrayList r0 = r12.f1215a
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f1235a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f1246m = false;
        }
        this.f1224j = null;
        this.f1221g = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1229p;
    }

    public final void y() {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.d.b(this)) {
            if (this.f1231r == null) {
                this.f1231r = new a();
            }
            y.i.u(this, this.f1231r);
            setSystemUiVisibility(1280);
            return;
        }
        y.i.u(this, (q) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
