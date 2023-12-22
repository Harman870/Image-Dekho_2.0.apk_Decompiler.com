package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import c6.b;
import com.imgdkh.app.R;
import d.i;
import h0.l0;
import h0.y;

public final class l1 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f849a;

    /* renamed from: b  reason: collision with root package name */
    public int f850b;

    /* renamed from: c  reason: collision with root package name */
    public b1 f851c;

    /* renamed from: d  reason: collision with root package name */
    public View f852d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f853e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f854f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f855g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f856h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f857i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f858j;
    public CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f859l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f860m;

    /* renamed from: n  reason: collision with root package name */
    public c f861n;

    /* renamed from: o  reason: collision with root package name */
    public int f862o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f863p;

    public class a extends b {
        public boolean w = false;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f864x;

        public a(int i10) {
            this.f864x = i10;
        }

        public final void a() {
            if (!this.w) {
                l1.this.f849a.setVisibility(this.f864x);
            }
        }

        public final void e(View view) {
            this.w = true;
        }

        public final void k() {
            l1.this.f849a.setVisibility(0);
        }
    }

    public l1(Toolbar toolbar, boolean z9) {
        boolean z10;
        Drawable drawable;
        this.f849a = toolbar;
        this.f857i = toolbar.getTitle();
        this.f858j = toolbar.getSubtitle();
        if (this.f857i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f856h = z10;
        this.f855g = toolbar.getNavigationIcon();
        i1 m2 = i1.m(toolbar.getContext(), (AttributeSet) null, y3.a.f13024e, R.attr.actionBarStyle);
        int i10 = 15;
        this.f863p = m2.e(15);
        if (z9) {
            CharSequence k10 = m2.k(27);
            if (!TextUtils.isEmpty(k10)) {
                this.f856h = true;
                this.f857i = k10;
                if ((this.f850b & 8) != 0) {
                    this.f849a.setTitle(k10);
                    if (this.f856h) {
                        y.o(this.f849a.getRootView(), k10);
                    }
                }
            }
            CharSequence k11 = m2.k(25);
            if (!TextUtils.isEmpty(k11)) {
                this.f858j = k11;
                if ((this.f850b & 8) != 0) {
                    this.f849a.setSubtitle(k11);
                }
            }
            Drawable e10 = m2.e(20);
            if (e10 != null) {
                this.f854f = e10;
                y();
            }
            Drawable e11 = m2.e(17);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f855g == null && (drawable = this.f863p) != null) {
                v(drawable);
            }
            m(m2.h(10, 0));
            int i11 = m2.i(9, 0);
            if (i11 != 0) {
                View inflate = LayoutInflater.from(this.f849a.getContext()).inflate(i11, this.f849a, false);
                View view = this.f852d;
                if (!(view == null || (this.f850b & 16) == 0)) {
                    this.f849a.removeView(view);
                }
                this.f852d = inflate;
                if (!(inflate == null || (this.f850b & 16) == 0)) {
                    this.f849a.addView(inflate);
                }
                m(this.f850b | 16);
            }
            int layoutDimension = m2.f809b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f849a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f849a.setLayoutParams(layoutParams);
            }
            int c10 = m2.c(7, -1);
            int c11 = m2.c(3, -1);
            if (c10 >= 0 || c11 >= 0) {
                Toolbar toolbar2 = this.f849a;
                int max = Math.max(c10, 0);
                int max2 = Math.max(c11, 0);
                if (toolbar2.f659t == null) {
                    toolbar2.f659t = new a1();
                }
                toolbar2.f659t.a(max, max2);
            }
            int i12 = m2.i(28, 0);
            if (i12 != 0) {
                Toolbar toolbar3 = this.f849a;
                Context context = toolbar3.getContext();
                toolbar3.f651l = i12;
                i0 i0Var = toolbar3.f642b;
                if (i0Var != null) {
                    i0Var.setTextAppearance(context, i12);
                }
            }
            int i13 = m2.i(26, 0);
            if (i13 != 0) {
                Toolbar toolbar4 = this.f849a;
                Context context2 = toolbar4.getContext();
                toolbar4.f652m = i13;
                i0 i0Var2 = toolbar4.f643c;
                if (i0Var2 != null) {
                    i0Var2.setTextAppearance(context2, i13);
                }
            }
            int i14 = m2.i(22, 0);
            if (i14 != 0) {
                this.f849a.setPopupTheme(i14);
            }
        } else {
            if (this.f849a.getNavigationIcon() != null) {
                this.f863p = this.f849a.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f850b = i10;
        }
        m2.n();
        if (R.string.abc_action_bar_up_description != this.f862o) {
            this.f862o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f849a.getNavigationContentDescription())) {
                q(this.f862o);
            }
        }
        this.k = this.f849a.getNavigationContentDescription();
        this.f849a.setNavigationOnClickListener(new k1(this));
    }

    public final boolean a() {
        boolean z9;
        ActionMenuView actionMenuView = this.f849a.f641a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.f572t;
            if (cVar == null || !cVar.m()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final Context b() {
        return this.f849a.getContext();
    }

    public final void c() {
        this.f860m = true;
    }

    public final void collapseActionView() {
        h hVar;
        Toolbar.f fVar = this.f849a.M;
        if (fVar == null) {
            hVar = null;
        } else {
            hVar = fVar.f669b;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f849a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f641a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.f572t
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.f726v
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l1.d():boolean");
    }

    public final boolean e() {
        boolean z9;
        ActionMenuView actionMenuView = this.f849a.f641a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.f572t;
            if (cVar == null || !cVar.g()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        boolean z9;
        ActionMenuView actionMenuView = this.f849a.f641a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.f572t;
            if (cVar == null || !cVar.n()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final void g(f fVar, i.d dVar) {
        if (this.f861n == null) {
            c cVar = new c(this.f849a.getContext());
            this.f861n = cVar;
            cVar.f391i = R.id.action_menu_presenter;
        }
        c cVar2 = this.f861n;
        cVar2.f387e = dVar;
        Toolbar toolbar = this.f849a;
        if (fVar != null || toolbar.f641a != null) {
            toolbar.e();
            f fVar2 = toolbar.f641a.f568p;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.L);
                    fVar2.r(toolbar.M);
                }
                if (toolbar.M == null) {
                    toolbar.M = new Toolbar.f();
                }
                cVar2.f723r = true;
                if (fVar != null) {
                    fVar.b(cVar2, toolbar.f650j);
                    fVar.b(toolbar.M, toolbar.f650j);
                } else {
                    cVar2.d(toolbar.f650j, (f) null);
                    toolbar.M.d(toolbar.f650j, (f) null);
                    cVar2.f();
                    toolbar.M.f();
                }
                toolbar.f641a.setPopupTheme(toolbar.k);
                toolbar.f641a.setPresenter(cVar2);
                toolbar.L = cVar2;
                toolbar.s();
            }
        }
    }

    public final CharSequence getTitle() {
        return this.f849a.getTitle();
    }

    public final boolean h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f849a;
        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f641a) == null || !actionMenuView.f571s) {
            return false;
        }
        return true;
    }

    public final void i() {
        c cVar;
        ActionMenuView actionMenuView = this.f849a.f641a;
        if (actionMenuView != null && (cVar = actionMenuView.f572t) != null) {
            cVar.g();
            c.a aVar = cVar.u;
            if (aVar != null && aVar.b()) {
                aVar.f496j.dismiss();
            }
        }
    }

    public final void j(int i10) {
        this.f849a.setVisibility(i10);
    }

    public final void k() {
    }

    public final boolean l() {
        Toolbar.f fVar = this.f849a.M;
        if (fVar == null || fVar.f669b == null) {
            return false;
        }
        return true;
    }

    public final void m(int i10) {
        View view;
        Toolbar toolbar;
        Drawable drawable;
        Toolbar toolbar2;
        int i11 = this.f850b ^ i10;
        this.f850b = i10;
        if (i11 != 0) {
            CharSequence charSequence = null;
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    x();
                }
                if ((this.f850b & 4) != 0) {
                    toolbar2 = this.f849a;
                    drawable = this.f855g;
                    if (drawable == null) {
                        drawable = this.f863p;
                    }
                } else {
                    toolbar2 = this.f849a;
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i11 & 3) != 0) {
                y();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f849a.setTitle(this.f857i);
                    toolbar = this.f849a;
                    charSequence = this.f858j;
                } else {
                    this.f849a.setTitle((CharSequence) null);
                    toolbar = this.f849a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.f852d) != null) {
                if ((i10 & 16) != 0) {
                    this.f849a.addView(view);
                } else {
                    this.f849a.removeView(view);
                }
            }
        }
    }

    public final void n() {
        Toolbar toolbar;
        b1 b1Var = this.f851c;
        if (b1Var != null && b1Var.getParent() == (toolbar = this.f849a)) {
            toolbar.removeView(this.f851c);
        }
        this.f851c = null;
    }

    public final int o() {
        return this.f850b;
    }

    public final void p(int i10) {
        this.f854f = i10 != 0 ? e.a.a(b(), i10) : null;
        y();
    }

    public final void q(int i10) {
        this.k = i10 == 0 ? null : b().getString(i10);
        x();
    }

    public final int r() {
        return 0;
    }

    public final l0 s(int i10, long j10) {
        l0 a10 = y.a(this.f849a);
        a10.a(i10 == 0 ? 1.0f : 0.0f);
        a10.c(j10);
        a10.d(new a(i10));
        return a10;
    }

    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? e.a.a(b(), i10) : null);
    }

    public final void setIcon(Drawable drawable) {
        this.f853e = drawable;
        y();
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.f859l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f856h) {
            this.f857i = charSequence;
            if ((this.f850b & 8) != 0) {
                this.f849a.setTitle(charSequence);
                if (this.f856h) {
                    y.o(this.f849a.getRootView(), charSequence);
                }
            }
        }
    }

    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void v(Drawable drawable) {
        Toolbar toolbar;
        this.f855g = drawable;
        if ((this.f850b & 4) != 0) {
            toolbar = this.f849a;
            if (drawable == null) {
                drawable = this.f863p;
            }
        } else {
            toolbar = this.f849a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void w(boolean z9) {
        this.f849a.setCollapsible(z9);
    }

    public final void x() {
        if ((this.f850b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f849a.setNavigationContentDescription(this.f862o);
        } else {
            this.f849a.setNavigationContentDescription(this.k);
        }
    }

    public final void y() {
        Drawable drawable;
        int i10 = this.f850b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f854f) == null) {
            drawable = this.f853e;
        }
        this.f849a.setLogo(drawable);
    }
}
