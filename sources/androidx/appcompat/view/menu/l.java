package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.w0;
import com.imgdkh.app.R;
import h.d;

public final class l extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f499b;

    /* renamed from: c  reason: collision with root package name */
    public final f f500c;

    /* renamed from: d  reason: collision with root package name */
    public final e f501d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f502e;

    /* renamed from: f  reason: collision with root package name */
    public final int f503f;

    /* renamed from: g  reason: collision with root package name */
    public final int f504g;

    /* renamed from: h  reason: collision with root package name */
    public final int f505h;

    /* renamed from: i  reason: collision with root package name */
    public final w0 f506i;

    /* renamed from: j  reason: collision with root package name */
    public final a f507j = new a();
    public final b k = new b();

    /* renamed from: l  reason: collision with root package name */
    public PopupWindow.OnDismissListener f508l;

    /* renamed from: m  reason: collision with root package name */
    public View f509m;

    /* renamed from: n  reason: collision with root package name */
    public View f510n;

    /* renamed from: o  reason: collision with root package name */
    public j.a f511o;

    /* renamed from: p  reason: collision with root package name */
    public ViewTreeObserver f512p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f513q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f514r;

    /* renamed from: s  reason: collision with root package name */
    public int f515s;

    /* renamed from: t  reason: collision with root package name */
    public int f516t = 0;
    public boolean u;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (l.this.b()) {
                l lVar = l.this;
                if (!lVar.f506i.f979y) {
                    View view = lVar.f510n;
                    if (view == null || !view.isShown()) {
                        l.this.dismiss();
                    } else {
                        l.this.f506i.show();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f512p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f512p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f512p.removeGlobalOnLayoutListener(lVar.f507j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i10, int i11, Context context, View view, f fVar, boolean z9) {
        this.f499b = context;
        this.f500c = fVar;
        this.f502e = z9;
        this.f501d = new e(fVar, LayoutInflater.from(context), z9, R.layout.abc_popup_menu_item_layout);
        this.f504g = i10;
        this.f505h = i11;
        Resources resources = context.getResources();
        this.f503f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f509m = view;
        this.f506i = new w0(context, i10, i11);
        fVar.b(this, context);
    }

    public final void a(f fVar, boolean z9) {
        if (fVar == this.f500c) {
            dismiss();
            j.a aVar = this.f511o;
            if (aVar != null) {
                aVar.a(fVar, z9);
            }
        }
    }

    public final boolean b() {
        return !this.f513q && this.f506i.b();
    }

    public final void dismiss() {
        if (b()) {
            this.f506i.dismiss();
        }
    }

    public final void e(Parcelable parcelable) {
    }

    public final void f() {
        this.f514r = false;
        e eVar = this.f501d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final p0 g() {
        return this.f506i.f960c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f499b
            android.view.View r6 = r9.f510n
            boolean r8 = r9.f502e
            int r3 = r9.f504g
            int r4 = r9.f505h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f511o
            r0.f495i = r2
            h.d r3 = r0.f496j
            if (r3 == 0) goto L_0x0023
            r3.k(r2)
        L_0x0023:
            boolean r2 = h.d.v(r10)
            r0.f494h = r2
            h.d r3 = r0.f496j
            if (r3 == 0) goto L_0x0030
            r3.p(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f508l
            r0.k = r2
            r2 = 0
            r9.f508l = r2
            androidx.appcompat.view.menu.f r2 = r9.f500c
            r2.c(r1)
            androidx.appcompat.widget.w0 r2 = r9.f506i
            int r3 = r2.f963f
            int r2 = r2.m()
            int r4 = r9.f516t
            android.view.View r5 = r9.f509m
            java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
            int r5 = h0.y.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f509m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f492f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.j$a r0 = r9.f511o
            if (r0 == 0) goto L_0x0079
            r0.b(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.h(androidx.appcompat.view.menu.m):boolean");
    }

    public final boolean i() {
        return false;
    }

    public final Parcelable j() {
        return null;
    }

    public final void k(j.a aVar) {
        this.f511o = aVar;
    }

    public final void m(f fVar) {
    }

    public final void o(View view) {
        this.f509m = view;
    }

    public final void onDismiss() {
        this.f513q = true;
        this.f500c.c(true);
        ViewTreeObserver viewTreeObserver = this.f512p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f512p = this.f510n.getViewTreeObserver();
            }
            this.f512p.removeGlobalOnLayoutListener(this.f507j);
            this.f512p = null;
        }
        this.f510n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.f508l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(boolean z9) {
        this.f501d.f434c = z9;
    }

    public final void q(int i10) {
        this.f516t = i10;
    }

    public final void r(int i10) {
        this.f506i.f963f = i10;
    }

    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f508l = onDismissListener;
    }

    public final void show() {
        View view;
        boolean z9;
        Rect rect;
        boolean z10 = true;
        if (!b()) {
            if (this.f513q || (view = this.f509m) == null) {
                z10 = false;
            } else {
                this.f510n = view;
                this.f506i.f980z.setOnDismissListener(this);
                w0 w0Var = this.f506i;
                w0Var.f972p = this;
                w0Var.f979y = true;
                w0Var.f980z.setFocusable(true);
                View view2 = this.f510n;
                if (this.f512p == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f512p = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f507j);
                }
                view2.addOnAttachStateChangeListener(this.k);
                w0 w0Var2 = this.f506i;
                w0Var2.f971o = view2;
                w0Var2.f968l = this.f516t;
                if (!this.f514r) {
                    this.f515s = d.n(this.f501d, this.f499b, this.f503f);
                    this.f514r = true;
                }
                this.f506i.q(this.f515s);
                this.f506i.f980z.setInputMethodMode(2);
                w0 w0Var3 = this.f506i;
                Rect rect2 = this.f6673a;
                if (rect2 != null) {
                    w0Var3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                w0Var3.f978x = rect;
                this.f506i.show();
                p0 p0Var = this.f506i.f960c;
                p0Var.setOnKeyListener(this);
                if (this.u && this.f500c.f450m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f499b).inflate(R.layout.abc_popup_menu_header_item_layout, p0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f500c.f450m);
                    }
                    frameLayout.setEnabled(false);
                    p0Var.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f506i.o(this.f501d);
                this.f506i.show();
            }
        }
        if (!z10) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void t(boolean z9) {
        this.u = z9;
    }

    public final void u(int i10) {
        this.f506i.i(i10);
    }
}
