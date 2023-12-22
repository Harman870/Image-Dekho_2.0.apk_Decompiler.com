package d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.n0;
import com.imgdkh.app.R;
import d.a;
import d.i;
import g.a;
import g.g;
import h0.j0;
import h0.l0;
import h0.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class z extends a implements ActionBarOverlayLayout.d {
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* renamed from: z  reason: collision with root package name */
    public static final AccelerateInterpolator f5999z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f6000a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6001b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f6002c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f6003d;

    /* renamed from: e  reason: collision with root package name */
    public n0 f6004e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f6005f;

    /* renamed from: g  reason: collision with root package name */
    public View f6006g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6007h;

    /* renamed from: i  reason: collision with root package name */
    public d f6008i;

    /* renamed from: j  reason: collision with root package name */
    public d f6009j;
    public a.C0083a k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6010l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f6011m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f6012n;

    /* renamed from: o  reason: collision with root package name */
    public int f6013o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6014p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6015q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6016r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6017s = true;

    /* renamed from: t  reason: collision with root package name */
    public g f6018t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6019v;
    public final a w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final b f6020x = new b();

    /* renamed from: y  reason: collision with root package name */
    public final c f6021y = new c();

    public class a extends c6.b {
        public a() {
        }

        public final void a() {
            View view;
            z zVar = z.this;
            if (zVar.f6014p && (view = zVar.f6006g) != null) {
                view.setTranslationY(0.0f);
                z.this.f6003d.setTranslationY(0.0f);
            }
            z.this.f6003d.setVisibility(8);
            z.this.f6003d.setTransitioning(false);
            z zVar2 = z.this;
            zVar2.f6018t = null;
            a.C0083a aVar = zVar2.k;
            if (aVar != null) {
                aVar.d(zVar2.f6009j);
                zVar2.f6009j = null;
                zVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = z.this.f6002c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.h.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends c6.b {
        public b() {
        }

        public final void a() {
            z zVar = z.this;
            zVar.f6018t = null;
            zVar.f6003d.requestLayout();
        }
    }

    public class c implements h0.n0 {
        public c() {
        }
    }

    public class d extends g.a implements f.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f6023c;

        /* renamed from: d  reason: collision with root package name */
        public final f f6024d;

        /* renamed from: e  reason: collision with root package name */
        public a.C0083a f6025e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<View> f6026f;

        public d(Context context, i.e eVar) {
            this.f6023c = context;
            this.f6025e = eVar;
            f fVar = new f(context);
            fVar.f449l = 1;
            this.f6024d = fVar;
            fVar.f443e = this;
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            a.C0083a aVar = this.f6025e;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        public final void b(f fVar) {
            if (this.f6025e != null) {
                i();
                androidx.appcompat.widget.c cVar = z.this.f6005f.f681d;
                if (cVar != null) {
                    cVar.n();
                }
            }
        }

        public final void c() {
            z zVar = z.this;
            if (zVar.f6008i == this) {
                if (!(!zVar.f6015q)) {
                    zVar.f6009j = this;
                    zVar.k = this.f6025e;
                } else {
                    this.f6025e.d(this);
                }
                this.f6025e = null;
                z.this.r(false);
                ActionBarContextView actionBarContextView = z.this.f6005f;
                if (actionBarContextView.k == null) {
                    actionBarContextView.h();
                }
                z zVar2 = z.this;
                zVar2.f6002c.setHideOnContentScrollEnabled(zVar2.f6019v);
                z.this.f6008i = null;
            }
        }

        public final View d() {
            WeakReference<View> weakReference = this.f6026f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final f e() {
            return this.f6024d;
        }

        public final MenuInflater f() {
            return new g.f(this.f6023c);
        }

        public final CharSequence g() {
            return z.this.f6005f.getSubtitle();
        }

        public final CharSequence h() {
            return z.this.f6005f.getTitle();
        }

        public final void i() {
            if (z.this.f6008i == this) {
                this.f6024d.w();
                try {
                    this.f6025e.c(this, this.f6024d);
                } finally {
                    this.f6024d.v();
                }
            }
        }

        public final boolean j() {
            return z.this.f6005f.f539s;
        }

        public final void k(View view) {
            z.this.f6005f.setCustomView(view);
            this.f6026f = new WeakReference<>(view);
        }

        public final void l(int i10) {
            m(z.this.f6000a.getResources().getString(i10));
        }

        public final void m(CharSequence charSequence) {
            z.this.f6005f.setSubtitle(charSequence);
        }

        public final void n(int i10) {
            o(z.this.f6000a.getResources().getString(i10));
        }

        public final void o(CharSequence charSequence) {
            z.this.f6005f.setTitle(charSequence);
        }

        public final void p(boolean z9) {
            this.f6394b = z9;
            z.this.f6005f.setTitleOptional(z9);
        }
    }

    public z(Activity activity, boolean z9) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (!z9) {
            this.f6006g = decorView.findViewById(16908290);
        }
    }

    public z(Dialog dialog) {
        new ArrayList();
        s(dialog.getWindow().getDecorView());
    }

    public final boolean b() {
        n0 n0Var = this.f6004e;
        if (n0Var == null || !n0Var.l()) {
            return false;
        }
        this.f6004e.collapseActionView();
        return true;
    }

    public final void c(boolean z9) {
        if (z9 != this.f6010l) {
            this.f6010l = z9;
            int size = this.f6011m.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f6011m.get(i10).a();
            }
        }
    }

    public final int d() {
        return this.f6004e.o();
    }

    public final Context e() {
        if (this.f6001b == null) {
            TypedValue typedValue = new TypedValue();
            this.f6000a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f6001b = new ContextThemeWrapper(this.f6000a, i10);
            } else {
                this.f6001b = this.f6000a;
            }
        }
        return this.f6001b;
    }

    public final void g() {
        t(this.f6000a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    public final boolean i(int i10, KeyEvent keyEvent) {
        f fVar;
        int i11;
        d dVar = this.f6008i;
        if (dVar == null || (fVar = dVar.f6024d) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z9 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z9 = false;
        }
        fVar.setQwertyMode(z9);
        return fVar.performShortcut(i10, keyEvent, 0);
    }

    public final void l(boolean z9) {
        if (!this.f6007h) {
            int i10 = z9 ? 4 : 0;
            int o10 = this.f6004e.o();
            this.f6007h = true;
            this.f6004e.m((i10 & 4) | (o10 & -5));
        }
    }

    public final void m(int i10) {
        this.f6004e.q(i10);
    }

    public final void n(f.b bVar) {
        this.f6004e.v(bVar);
    }

    public final void o(boolean z9) {
        g gVar;
        this.u = z9;
        if (!z9 && (gVar = this.f6018t) != null) {
            gVar.a();
        }
    }

    public final void p(CharSequence charSequence) {
        this.f6004e.setWindowTitle(charSequence);
    }

    public final g.a q(i.e eVar) {
        d dVar = this.f6008i;
        if (dVar != null) {
            dVar.c();
        }
        this.f6002c.setHideOnContentScrollEnabled(false);
        this.f6005f.h();
        d dVar2 = new d(this.f6005f.getContext(), eVar);
        dVar2.f6024d.w();
        try {
            if (!dVar2.f6025e.a(dVar2, dVar2.f6024d)) {
                return null;
            }
            this.f6008i = dVar2;
            dVar2.i();
            this.f6005f.f(dVar2);
            r(true);
            return dVar2;
        } finally {
            dVar2.f6024d.v();
        }
    }

    public final void r(boolean z9) {
        l0 l0Var;
        l0 l0Var2;
        long j10;
        if (z9) {
            if (!this.f6016r) {
                this.f6016r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6002c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.f6016r) {
            this.f6016r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6002c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        ActionBarContainer actionBarContainer = this.f6003d;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.g.c(actionBarContainer)) {
            if (z9) {
                l0Var = this.f6004e.s(4, 100);
                l0Var2 = this.f6005f.e(0, 200);
            } else {
                l0Var2 = this.f6004e.s(0, 200);
                l0Var = this.f6005f.e(8, 100);
            }
            g gVar = new g();
            gVar.f6445a.add(l0Var);
            View view = l0Var.f6707a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = l0Var2.f6707a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            gVar.f6445a.add(l0Var2);
            gVar.b();
        } else if (z9) {
            this.f6004e.j(4);
            this.f6005f.setVisibility(0);
        } else {
            this.f6004e.j(0);
            this.f6005f.setVisibility(8);
        }
    }

    public final void s(View view) {
        n0 n0Var;
        boolean z9;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f6002c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof n0) {
            n0Var = (n0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            n0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder g10 = androidx.activity.f.g("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            g10.append(str);
            throw new IllegalStateException(g10.toString());
        }
        this.f6004e = n0Var;
        this.f6005f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f6003d = actionBarContainer;
        n0 n0Var2 = this.f6004e;
        if (n0Var2 == null || this.f6005f == null || actionBarContainer == null) {
            throw new IllegalStateException(z.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f6000a = n0Var2.b();
        if ((this.f6004e.o() & 4) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f6007h = true;
        }
        Context context = this.f6000a;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f6004e.k();
        t(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f6000a.obtainStyledAttributes((AttributeSet) null, y3.a.f13024e, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6002c;
            if (actionBarOverlayLayout2.f549h) {
                this.f6019v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f6003d;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.i.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void t(boolean z9) {
        boolean z10;
        boolean z11;
        this.f6012n = z9;
        if (!z9) {
            this.f6004e.n();
            this.f6003d.setTabContainer((b1) null);
        } else {
            this.f6003d.setTabContainer((b1) null);
            this.f6004e.n();
        }
        boolean z12 = true;
        if (this.f6004e.r() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n0 n0Var = this.f6004e;
        if (this.f6012n || !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        n0Var.w(z11);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6002c;
        if (this.f6012n || !z10) {
            z12 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z12);
    }

    public final void u(boolean z9) {
        boolean z10;
        View view;
        View view2;
        View view3;
        boolean z11 = this.f6015q;
        if (!this.f6016r && z11) {
            z10 = false;
        } else {
            z10 = true;
        }
        j0 j0Var = null;
        if (z10) {
            if (!this.f6017s) {
                this.f6017s = true;
                g gVar = this.f6018t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f6003d.setVisibility(0);
                if (this.f6013o != 0 || (!this.u && !z9)) {
                    this.f6003d.setAlpha(1.0f);
                    this.f6003d.setTranslationY(0.0f);
                    if (this.f6014p && (view2 = this.f6006g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f6020x.a();
                } else {
                    this.f6003d.setTranslationY(0.0f);
                    float f10 = (float) (-this.f6003d.getHeight());
                    if (z9) {
                        int[] iArr = {0, 0};
                        this.f6003d.getLocationInWindow(iArr);
                        f10 -= (float) iArr[1];
                    }
                    this.f6003d.setTranslationY(f10);
                    g gVar2 = new g();
                    l0 a10 = y.a(this.f6003d);
                    a10.e(0.0f);
                    c cVar = this.f6021y;
                    View view4 = a10.f6707a.get();
                    if (view4 != null) {
                        if (cVar != null) {
                            j0Var = new j0(cVar, 0, view4);
                        }
                        l0.a.a(view4.animate(), j0Var);
                    }
                    if (!gVar2.f6449e) {
                        gVar2.f6445a.add(a10);
                    }
                    if (this.f6014p && (view3 = this.f6006g) != null) {
                        view3.setTranslationY(f10);
                        l0 a11 = y.a(this.f6006g);
                        a11.e(0.0f);
                        if (!gVar2.f6449e) {
                            gVar2.f6445a.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z12 = gVar2.f6449e;
                    if (!z12) {
                        gVar2.f6447c = decelerateInterpolator;
                    }
                    if (!z12) {
                        gVar2.f6446b = 250;
                    }
                    b bVar = this.f6020x;
                    if (!z12) {
                        gVar2.f6448d = bVar;
                    }
                    this.f6018t = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6002c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f6017s) {
            this.f6017s = false;
            g gVar3 = this.f6018t;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.f6013o != 0 || (!this.u && !z9)) {
                this.w.a();
                return;
            }
            this.f6003d.setAlpha(1.0f);
            this.f6003d.setTransitioning(true);
            g gVar4 = new g();
            float f11 = (float) (-this.f6003d.getHeight());
            if (z9) {
                int[] iArr2 = {0, 0};
                this.f6003d.getLocationInWindow(iArr2);
                f11 -= (float) iArr2[1];
            }
            l0 a12 = y.a(this.f6003d);
            a12.e(f11);
            c cVar2 = this.f6021y;
            View view5 = a12.f6707a.get();
            if (view5 != null) {
                if (cVar2 != null) {
                    j0Var = new j0(cVar2, 0, view5);
                }
                l0.a.a(view5.animate(), j0Var);
            }
            if (!gVar4.f6449e) {
                gVar4.f6445a.add(a12);
            }
            if (this.f6014p && (view = this.f6006g) != null) {
                l0 a13 = y.a(view);
                a13.e(f11);
                if (!gVar4.f6449e) {
                    gVar4.f6445a.add(a13);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f5999z;
            boolean z13 = gVar4.f6449e;
            if (!z13) {
                gVar4.f6447c = accelerateInterpolator;
            }
            if (!z13) {
                gVar4.f6446b = 250;
            }
            a aVar = this.w;
            if (!z13) {
                gVar4.f6448d = aVar;
            }
            this.f6018t = gVar4;
            gVar4.b();
        }
    }
}
