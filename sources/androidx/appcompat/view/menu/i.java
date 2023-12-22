package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.imgdkh.app.R;
import h.d;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f487a;

    /* renamed from: b  reason: collision with root package name */
    public final f f488b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f489c;

    /* renamed from: d  reason: collision with root package name */
    public final int f490d;

    /* renamed from: e  reason: collision with root package name */
    public final int f491e;

    /* renamed from: f  reason: collision with root package name */
    public View f492f;

    /* renamed from: g  reason: collision with root package name */
    public int f493g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f494h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f495i;

    /* renamed from: j  reason: collision with root package name */
    public d f496j;
    public PopupWindow.OnDismissListener k;

    /* renamed from: l  reason: collision with root package name */
    public final a f497l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public final void onDismiss() {
            i.this.c();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(int i10, int i11, Context context, View view, f fVar, boolean z9) {
        this.f493g = 8388611;
        this.f497l = new a();
        this.f487a = context;
        this.f488b = fVar;
        this.f492f = view;
        this.f489c = z9;
        this.f490d = i10;
        this.f491e = i11;
    }

    public i(Context context, f fVar, View view, boolean z9) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z9);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.j, h.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.d a() {
        /*
            r14 = this;
            h.d r0 = r14.f496j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f487a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.i.b.a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f487a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f487a
            android.view.View r3 = r14.f492f
            int r4 = r14.f490d
            int r5 = r14.f491e
            boolean r6 = r14.f489c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r10 = r14.f487a
            androidx.appcompat.view.menu.f r12 = r14.f488b
            android.view.View r11 = r14.f492f
            int r8 = r14.f490d
            int r9 = r14.f491e
            boolean r13 = r14.f489c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.f r1 = r14.f488b
            r0.m(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f497l
            r0.s(r1)
            android.view.View r1 = r14.f492f
            r0.o(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f495i
            r0.k(r1)
            boolean r1 = r14.f494h
            r0.p(r1)
            int r1 = r14.f493g
            r0.q(r1)
            r14.f496j = r0
        L_0x0079:
            h.d r0 = r14.f496j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():h.d");
    }

    public final boolean b() {
        d dVar = this.f496j;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f496j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z9, boolean z10) {
        d a10 = a();
        a10.t(z10);
        if (z9) {
            int i12 = this.f493g;
            View view = this.f492f;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if ((Gravity.getAbsoluteGravity(i12, y.e.d(view)) & 7) == 5) {
                i10 -= this.f492f.getWidth();
            }
            a10.r(i10);
            a10.u(i11);
            int i13 = (int) ((this.f487a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f6673a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.show();
    }
}
