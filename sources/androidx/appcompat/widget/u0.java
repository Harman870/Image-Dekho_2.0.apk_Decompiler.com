package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import h0.l0;
import h0.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l0.i;
import l0.j;

public class u0 implements h.f {
    public static Method A;
    public static Method B;

    /* renamed from: a  reason: collision with root package name */
    public Context f958a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f959b;

    /* renamed from: c  reason: collision with root package name */
    public p0 f960c;

    /* renamed from: d  reason: collision with root package name */
    public int f961d = -2;

    /* renamed from: e  reason: collision with root package name */
    public int f962e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f963f;

    /* renamed from: g  reason: collision with root package name */
    public int f964g;

    /* renamed from: h  reason: collision with root package name */
    public int f965h = 1002;

    /* renamed from: i  reason: collision with root package name */
    public boolean f966i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f967j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public int f968l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f969m = Integer.MAX_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public d f970n;

    /* renamed from: o  reason: collision with root package name */
    public View f971o;

    /* renamed from: p  reason: collision with root package name */
    public AdapterView.OnItemClickListener f972p;

    /* renamed from: q  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f973q;

    /* renamed from: r  reason: collision with root package name */
    public final g f974r = new g();

    /* renamed from: s  reason: collision with root package name */
    public final f f975s = new f();

    /* renamed from: t  reason: collision with root package name */
    public final e f976t = new e();
    public final c u = new c();

    /* renamed from: v  reason: collision with root package name */
    public final Handler f977v;
    public final Rect w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public Rect f978x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f979y;

    /* renamed from: z  reason: collision with root package name */
    public r f980z;

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z9) {
            return popupWindow.getMaxAvailableHeight(view, i10, z9);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z9) {
            popupWindow.setIsClippedToScreen(z9);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            p0 p0Var = u0.this.f960c;
            if (p0Var != null) {
                p0Var.setListSelectionHidden(true);
                p0Var.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        public final void onChanged() {
            if (u0.this.b()) {
                u0.this.show();
            }
        }

        public final void onInvalidated() {
            u0.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z9 = true;
            if (i10 == 1) {
                if (u0.this.f980z.getInputMethodMode() != 2) {
                    z9 = false;
                }
                if (!z9 && u0.this.f980z.getContentView() != null) {
                    u0 u0Var = u0.this;
                    u0Var.f977v.removeCallbacks(u0Var.f974r);
                    u0.this.f974r.run();
                }
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            r rVar;
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (action == 0 && (rVar = u0.this.f980z) != null && rVar.isShowing() && x9 >= 0 && x9 < u0.this.f980z.getWidth() && y9 >= 0 && y9 < u0.this.f980z.getHeight()) {
                u0 u0Var = u0.this;
                u0Var.f977v.postDelayed(u0Var.f974r, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                u0 u0Var2 = u0.this;
                u0Var2.f977v.removeCallbacks(u0Var2.f974r);
                return false;
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public final void run() {
            p0 p0Var = u0.this.f960c;
            if (p0Var != null) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (y.g.b(p0Var) && u0.this.f960c.getCount() > u0.this.f960c.getChildCount()) {
                    int childCount = u0.this.f960c.getChildCount();
                    u0 u0Var = u0.this;
                    if (childCount <= u0Var.f969m) {
                        u0Var.f980z.setInputMethodMode(2);
                        u0.this.show();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public u0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f958a = context;
        this.f977v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y3.a.f13038t, i10, i11);
        this.f963f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f964g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f966i = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i10, i11);
        this.f980z = rVar;
        rVar.setInputMethodMode(1);
    }

    public final boolean b() {
        return this.f980z.isShowing();
    }

    public final int c() {
        return this.f963f;
    }

    public final void dismiss() {
        this.f980z.dismiss();
        this.f980z.setContentView((View) null);
        this.f960c = null;
        this.f977v.removeCallbacks(this.f974r);
    }

    public final Drawable e() {
        return this.f980z.getBackground();
    }

    public final p0 g() {
        return this.f960c;
    }

    public final void h(Drawable drawable) {
        this.f980z.setBackgroundDrawable(drawable);
    }

    public final void i(int i10) {
        this.f964g = i10;
        this.f966i = true;
    }

    public final void k(int i10) {
        this.f963f = i10;
    }

    public final int m() {
        if (!this.f966i) {
            return 0;
        }
        return this.f964g;
    }

    public void o(ListAdapter listAdapter) {
        d dVar = this.f970n;
        if (dVar == null) {
            this.f970n = new d();
        } else {
            ListAdapter listAdapter2 = this.f959b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f959b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f970n);
        }
        p0 p0Var = this.f960c;
        if (p0Var != null) {
            p0Var.setAdapter(this.f959b);
        }
    }

    public p0 p(Context context, boolean z9) {
        return new p0(context, z9);
    }

    public final void q(int i10) {
        Drawable background = this.f980z.getBackground();
        if (background != null) {
            background.getPadding(this.w);
            Rect rect = this.w;
            this.f962e = rect.left + rect.right + i10;
            return;
        }
        this.f962e = i10;
    }

    public final void show() {
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        p0 p0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f960c == null) {
            p0 p5 = p(this.f958a, !this.f979y);
            this.f960c = p5;
            p5.setAdapter(this.f959b);
            this.f960c.setOnItemClickListener(this.f972p);
            this.f960c.setFocusable(true);
            this.f960c.setFocusableInTouchMode(true);
            this.f960c.setOnItemSelectedListener(new t0(this));
            this.f960c.setOnScrollListener(this.f976t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f973q;
            if (onItemSelectedListener != null) {
                this.f960c.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.f980z.setContentView(this.f960c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f980z.getContentView();
        }
        Drawable background = this.f980z.getBackground();
        int i17 = 0;
        if (background != null) {
            background.getPadding(this.w);
            Rect rect = this.w;
            int i18 = rect.top;
            i10 = rect.bottom + i18;
            if (!this.f966i) {
                this.f964g = -i18;
            }
        } else {
            this.w.setEmpty();
            i10 = 0;
        }
        if (this.f980z.getInputMethodMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        int a10 = a.a(this.f980z, this.f971o, this.f964g, z9);
        if (this.f961d == -1) {
            i11 = a10 + i10;
        } else {
            int i19 = this.f962e;
            if (i19 != -2) {
                i15 = 1073741824;
                if (i19 == -1) {
                    int i20 = this.f958a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.w;
                    i19 = i20 - (rect2.left + rect2.right);
                }
            } else {
                int i21 = this.f958a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.w;
                i19 = i21 - (rect3.left + rect3.right);
                i15 = Integer.MIN_VALUE;
            }
            int a11 = this.f960c.a(View.MeasureSpec.makeMeasureSpec(i19, i15), a10 + 0);
            if (a11 > 0) {
                i16 = this.f960c.getPaddingBottom() + this.f960c.getPaddingTop() + i10 + 0;
            } else {
                i16 = 0;
            }
            i11 = a11 + i16;
        }
        if (this.f980z.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.d(this.f980z, this.f965h);
        if (this.f980z.isShowing()) {
            View view = this.f971o;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.g.b(view)) {
                int i22 = this.f962e;
                if (i22 == -1) {
                    i22 = -1;
                } else if (i22 == -2) {
                    i22 = this.f971o.getWidth();
                }
                int i23 = this.f961d;
                if (i23 == -1) {
                    if (!z10) {
                        i11 = -1;
                    }
                    if (z10) {
                        r rVar = this.f980z;
                        if (this.f962e == -1) {
                            i14 = -1;
                        } else {
                            i14 = 0;
                        }
                        rVar.setWidth(i14);
                        this.f980z.setHeight(0);
                    } else {
                        r rVar2 = this.f980z;
                        if (this.f962e == -1) {
                            i17 = -1;
                        }
                        rVar2.setWidth(i17);
                        this.f980z.setHeight(-1);
                    }
                } else if (i23 != -2) {
                    i11 = i23;
                }
                this.f980z.setOutsideTouchable(true);
                r rVar3 = this.f980z;
                View view2 = this.f971o;
                int i24 = this.f963f;
                int i25 = this.f964g;
                if (i22 < 0) {
                    i12 = -1;
                } else {
                    i12 = i22;
                }
                if (i11 < 0) {
                    i13 = -1;
                } else {
                    i13 = i11;
                }
                rVar3.update(view2, i24, i25, i12, i13);
                return;
            }
            return;
        }
        int i26 = this.f962e;
        if (i26 == -1) {
            i26 = -1;
        } else if (i26 == -2) {
            i26 = this.f971o.getWidth();
        }
        int i27 = this.f961d;
        if (i27 == -1) {
            i11 = -1;
        } else if (i27 != -2) {
            i11 = i27;
        }
        this.f980z.setWidth(i26);
        this.f980z.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(this.f980z, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(this.f980z, true);
        }
        this.f980z.setOutsideTouchable(true);
        this.f980z.setTouchInterceptor(this.f975s);
        if (this.k) {
            j.c(this.f980z, this.f967j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(this.f980z, new Object[]{this.f978x});
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(this.f980z, this.f978x);
        }
        i.a(this.f980z, this.f971o, this.f963f, this.f964g, this.f968l);
        this.f960c.setSelection(-1);
        if ((!this.f979y || this.f960c.isInTouchMode()) && (p0Var = this.f960c) != null) {
            p0Var.setListSelectionHidden(true);
            p0Var.requestLayout();
        }
        if (!this.f979y) {
            this.f977v.post(this.u);
        }
    }
}
