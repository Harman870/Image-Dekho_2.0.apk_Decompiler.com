package d;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.y0;
import com.imgdkh.app.R;
import d.c;
import d.w;
import d0.f;
import g.a;
import g.e;
import h0.l0;
import h0.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

public final class i extends h implements f.a, LayoutInflater.Factory2 {

    /* renamed from: w0  reason: collision with root package name */
    public static final m.h<String, Integer> f5881w0 = new m.h<>();

    /* renamed from: x0  reason: collision with root package name */
    public static final int[] f5882x0 = {16842836};

    /* renamed from: y0  reason: collision with root package name */
    public static final boolean f5883y0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: z0  reason: collision with root package name */
    public static final boolean f5884z0 = true;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public n[] M;
    public n N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int T = -100;
    public int U;
    public int V;
    public boolean W;
    public l X;
    public j Y;
    public boolean Z;

    /* renamed from: j  reason: collision with root package name */
    public final Object f5885j;
    public final Context k;

    /* renamed from: l  reason: collision with root package name */
    public Window f5886l;

    /* renamed from: m  reason: collision with root package name */
    public C0075i f5887m;

    /* renamed from: n  reason: collision with root package name */
    public final g f5888n;

    /* renamed from: o  reason: collision with root package name */
    public a f5889o;

    /* renamed from: o0  reason: collision with root package name */
    public int f5890o0;

    /* renamed from: p  reason: collision with root package name */
    public g.f f5891p;
    public final a p0 = new a();

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f5892q;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5893q0;

    /* renamed from: r  reason: collision with root package name */
    public m0 f5894r;

    /* renamed from: r0  reason: collision with root package name */
    public Rect f5895r0;

    /* renamed from: s  reason: collision with root package name */
    public d f5896s;

    /* renamed from: s0  reason: collision with root package name */
    public Rect f5897s0;

    /* renamed from: t  reason: collision with root package name */
    public o f5898t;

    /* renamed from: t0  reason: collision with root package name */
    public q f5899t0;
    public g.a u;
    public OnBackInvokedDispatcher u0;

    /* renamed from: v  reason: collision with root package name */
    public ActionBarContextView f5900v;

    /* renamed from: v0  reason: collision with root package name */
    public OnBackInvokedCallback f5901v0;
    public PopupWindow w;

    /* renamed from: x  reason: collision with root package name */
    public l f5902x;

    /* renamed from: y  reason: collision with root package name */
    public l0 f5903y = null;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5904z = true;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            i iVar = i.this;
            if ((iVar.f5890o0 & 1) != 0) {
                iVar.J(0);
            }
            i iVar2 = i.this;
            if ((iVar2.f5890o0 & 4096) != 0) {
                iVar2.J(108);
            }
            i iVar3 = i.this;
            iVar3.Z = false;
            iVar3.f5890o0 = 0;
        }
    }

    public class b implements c.a {
        public b() {
        }

        public final boolean a() {
            i iVar = i.this;
            iVar.Q();
            a aVar = iVar.f5889o;
            if (aVar == null || (aVar.d() & 4) == 0) {
                return false;
            }
            return true;
        }

        public final void b(f.b bVar, int i10) {
            i iVar = i.this;
            iVar.Q();
            a aVar = iVar.f5889o;
            if (aVar != null) {
                aVar.n(bVar);
                aVar.m(i10);
            }
        }

        public final Drawable c() {
            Drawable drawable;
            int resourceId;
            Context e10 = e();
            TypedArray obtainStyledAttributes = e10.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.homeAsUpIndicator});
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable = e.a.a(e10, resourceId);
            }
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public final void d(int i10) {
            i iVar = i.this;
            iVar.Q();
            a aVar = iVar.f5889o;
            if (aVar != null) {
                aVar.m(i10);
            }
        }

        public final Context e() {
            return i.this.M();
        }
    }

    public interface c {
    }

    public final class d implements j.a {
        public d() {
        }

        public final void a(androidx.appcompat.view.menu.f fVar, boolean z9) {
            i.this.F(fVar);
        }

        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            Window.Callback P = i.this.P();
            if (P == null) {
                return true;
            }
            P.onMenuOpened(108, fVar);
            return true;
        }
    }

    public class e implements a.C0083a {

        /* renamed from: a  reason: collision with root package name */
        public a.C0083a f5908a;

        public class a extends c6.b {
            public a() {
            }

            public final void a() {
                i.this.f5900v.setVisibility(8);
                i iVar = i.this;
                PopupWindow popupWindow = iVar.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (iVar.f5900v.getParent() instanceof View) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.h.c((View) i.this.f5900v.getParent());
                }
                i.this.f5900v.h();
                i.this.f5903y.d((h0.m0) null);
                i iVar2 = i.this;
                iVar2.f5903y = null;
                ViewGroup viewGroup = iVar2.B;
                WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                y.h.c(viewGroup);
            }
        }

        public e(e.a aVar) {
            this.f5908a = aVar;
        }

        public final boolean a(g.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f5908a.a(aVar, fVar);
        }

        public final boolean b(g.a aVar, MenuItem menuItem) {
            return this.f5908a.b(aVar, menuItem);
        }

        public final boolean c(g.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = i.this.B;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.h.c(viewGroup);
            return this.f5908a.c(aVar, fVar);
        }

        public final void d(g.a aVar) {
            this.f5908a.d(aVar);
            i iVar = i.this;
            if (iVar.w != null) {
                iVar.f5886l.getDecorView().removeCallbacks(i.this.f5902x);
            }
            i iVar2 = i.this;
            if (iVar2.f5900v != null) {
                l0 l0Var = iVar2.f5903y;
                if (l0Var != null) {
                    l0Var.b();
                }
                i iVar3 = i.this;
                l0 a10 = y.a(iVar3.f5900v);
                a10.a(0.0f);
                iVar3.f5903y = a10;
                i.this.f5903y.d(new a());
            }
            g gVar = i.this.f5888n;
            if (gVar != null) {
                gVar.k();
            }
            i iVar4 = i.this;
            iVar4.u = null;
            ViewGroup viewGroup = iVar4.B;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.h.c(viewGroup);
            i.this.X();
        }
    }

    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static d0.f b(Configuration configuration) {
            return d0.f.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(d0.f fVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f6032a.a()));
        }

        public static void d(Configuration configuration, d0.f fVar) {
            configuration.setLocales(LocaleList.forLanguageTags(fVar.f6032a.a()));
        }
    }

    public static class g {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode & 3;
            if (i10 != i11) {
                configuration3.colorMode |= i11;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode & 12;
            if (i12 != i13) {
                configuration3.colorMode |= i13;
            }
        }
    }

    public static class h {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, i iVar) {
            Objects.requireNonNull(iVar);
            n nVar = new n(iVar);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, nVar);
            return nVar;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: d.i$i  reason: collision with other inner class name */
    public class C0075i extends g.h {

        /* renamed from: b  reason: collision with root package name */
        public c f5910b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5911c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5912d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5913e;

        public C0075i(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public final void a(Window.Callback callback) {
            try {
                this.f5911c = true;
                callback.onContentChanged();
                this.f5911c = false;
            } catch (Throwable th) {
                this.f5911c = false;
                throw th;
            }
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f5912d) {
                return this.f6453a.dispatchKeyEvent(keyEvent);
            }
            if (i.this.I(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            if (r6 != false) goto L_0x0048;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004d
                d.i r0 = d.i.this
                int r3 = r6.getKeyCode()
                r0.Q()
                d.a r4 = r0.f5889o
                if (r4 == 0) goto L_0x001c
                boolean r3 = r4.i(r3, r6)
                if (r3 == 0) goto L_0x001c
                goto L_0x0048
            L_0x001c:
                d.i$n r3 = r0.N
                if (r3 == 0) goto L_0x0031
                int r4 = r6.getKeyCode()
                boolean r3 = r0.U(r3, r4, r6)
                if (r3 == 0) goto L_0x0031
                d.i$n r6 = r0.N
                if (r6 == 0) goto L_0x0048
                r6.f5933l = r2
                goto L_0x0048
            L_0x0031:
                d.i$n r3 = r0.N
                if (r3 != 0) goto L_0x004a
                d.i$n r3 = r0.O(r1)
                r0.V(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.U(r3, r4, r6)
                r3.k = r1
                if (r6 == 0) goto L_0x004a
            L_0x0048:
                r6 = r2
                goto L_0x004b
            L_0x004a:
                r6 = r1
            L_0x004b:
                if (r6 == 0) goto L_0x004e
            L_0x004d:
                r1 = r2
            L_0x004e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d.i.C0075i.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
            if (this.f5911c) {
                this.f6453a.onContentChanged();
            }
        }

        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i10) {
            View view;
            c cVar = this.f5910b;
            if (cVar != null) {
                w.e eVar = (w.e) cVar;
                if (i10 == 0) {
                    view = new View(w.this.f5975a.b());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            i iVar = i.this;
            if (i10 == 108) {
                iVar.Q();
                a aVar = iVar.f5889o;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                iVar.getClass();
            }
            return true;
        }

        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f5913e) {
                this.f6453a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            i iVar = i.this;
            if (i10 == 108) {
                iVar.Q();
                a aVar = iVar.f5889o;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i10 == 0) {
                n O = iVar.O(i10);
                if (O.f5934m) {
                    iVar.G(O, false);
                }
            } else {
                iVar.getClass();
            }
        }

        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f459x = true;
            }
            c cVar = this.f5910b;
            if (cVar != null) {
                w.e eVar = (w.e) cVar;
                if (i10 == 0) {
                    w wVar = w.this;
                    if (!wVar.f5978d) {
                        wVar.f5975a.f860m = true;
                        wVar.f5978d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f459x = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = i.this.O(0).f5930h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
            if (h0.y.g.c(r0) != false) goto L_0x0143;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) {
            /*
                r8 = this;
                d.i r0 = d.i.this
                boolean r1 = r0.f5904z
                if (r1 == 0) goto L_0x01b0
                if (r10 == 0) goto L_0x000a
                goto L_0x01b0
            L_0x000a:
                g.e$a r10 = new g.e$a
                android.content.Context r0 = r0.k
                r10.<init>(r0, r9)
                d.i r9 = d.i.this
                g.a r0 = r9.u
                if (r0 == 0) goto L_0x001a
                r0.c()
            L_0x001a:
                d.i$e r0 = new d.i$e
                r0.<init>(r10)
                r9.Q()
                d.a r1 = r9.f5889o
                if (r1 == 0) goto L_0x0035
                g.a r1 = r1.q(r0)
                r9.u = r1
                if (r1 == 0) goto L_0x0035
                d.g r1 = r9.f5888n
                if (r1 == 0) goto L_0x0035
                r1.n()
            L_0x0035:
                g.a r1 = r9.u
                r2 = 0
                if (r1 != 0) goto L_0x01a4
                h0.l0 r1 = r9.f5903y
                if (r1 == 0) goto L_0x0041
                r1.b()
            L_0x0041:
                g.a r1 = r9.u
                if (r1 == 0) goto L_0x0048
                r1.c()
            L_0x0048:
                d.g r1 = r9.f5888n
                if (r1 == 0) goto L_0x0053
                boolean r3 = r9.R
                if (r3 != 0) goto L_0x0053
                r1.q()     // Catch:{ AbstractMethodError -> 0x0053 }
            L_0x0053:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.f5900v
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L_0x0102
                boolean r1 = r9.J
                if (r1 == 0) goto L_0x00e2
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                android.content.Context r5 = r9.k
                android.content.res.Resources$Theme r5 = r5.getTheme()
                r6 = 2130903055(0x7f03000f, float:1.7412917E38)
                r5.resolveAttribute(r6, r1, r3)
                int r6 = r1.resourceId
                if (r6 == 0) goto L_0x0093
                android.content.Context r6 = r9.k
                android.content.res.Resources r6 = r6.getResources()
                android.content.res.Resources$Theme r6 = r6.newTheme()
                r6.setTo(r5)
                int r5 = r1.resourceId
                r6.applyStyle(r5, r3)
                g.c r5 = new g.c
                android.content.Context r7 = r9.k
                r5.<init>((android.content.Context) r7, (int) r4)
                android.content.res.Resources$Theme r7 = r5.getTheme()
                r7.setTo(r6)
                goto L_0x0095
            L_0x0093:
                android.content.Context r5 = r9.k
            L_0x0095:
                androidx.appcompat.widget.ActionBarContextView r6 = new androidx.appcompat.widget.ActionBarContextView
                r6.<init>(r5, r2)
                r9.f5900v = r6
                android.widget.PopupWindow r6 = new android.widget.PopupWindow
                r7 = 2130903070(0x7f03001e, float:1.7412948E38)
                r6.<init>(r5, r2, r7)
                r9.w = r6
                r7 = 2
                l0.j.d(r6, r7)
                android.widget.PopupWindow r6 = r9.w
                androidx.appcompat.widget.ActionBarContextView r7 = r9.f5900v
                r6.setContentView(r7)
                android.widget.PopupWindow r6 = r9.w
                r7 = -1
                r6.setWidth(r7)
                android.content.res.Resources$Theme r6 = r5.getTheme()
                r7 = 2130903049(0x7f030009, float:1.7412905E38)
                r6.resolveAttribute(r7, r1, r3)
                int r1 = r1.data
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r5)
                androidx.appcompat.widget.ActionBarContextView r5 = r9.f5900v
                r5.setContentHeight(r1)
                android.widget.PopupWindow r1 = r9.w
                r5 = -2
                r1.setHeight(r5)
                d.l r1 = new d.l
                r1.<init>(r9)
                r9.f5902x = r1
                goto L_0x0102
            L_0x00e2:
                android.view.ViewGroup r1 = r9.B
                r5 = 2131296336(0x7f090050, float:1.8210586E38)
                android.view.View r1 = r1.findViewById(r5)
                androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
                if (r1 == 0) goto L_0x0102
                android.content.Context r5 = r9.M()
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                r1.setLayoutInflater(r5)
                android.view.View r1 = r1.a()
                androidx.appcompat.widget.ActionBarContextView r1 = (androidx.appcompat.widget.ActionBarContextView) r1
                r9.f5900v = r1
            L_0x0102:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.f5900v
                if (r1 == 0) goto L_0x0192
                h0.l0 r1 = r9.f5903y
                if (r1 == 0) goto L_0x010d
                r1.b()
            L_0x010d:
                androidx.appcompat.widget.ActionBarContextView r1 = r9.f5900v
                r1.h()
                g.d r1 = new g.d
                androidx.appcompat.widget.ActionBarContextView r5 = r9.f5900v
                android.content.Context r5 = r5.getContext()
                androidx.appcompat.widget.ActionBarContextView r6 = r9.f5900v
                r1.<init>(r5, r6, r0)
                androidx.appcompat.view.menu.f r5 = r1.f6406h
                boolean r0 = r0.a(r1, r5)
                if (r0 == 0) goto L_0x0190
                r1.i()
                androidx.appcompat.widget.ActionBarContextView r0 = r9.f5900v
                r0.f(r1)
                r9.u = r1
                boolean r0 = r9.A
                if (r0 == 0) goto L_0x0142
                android.view.ViewGroup r0 = r9.B
                if (r0 == 0) goto L_0x0142
                java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
                boolean r0 = h0.y.g.c(r0)
                if (r0 == 0) goto L_0x0142
                goto L_0x0143
            L_0x0142:
                r3 = r4
            L_0x0143:
                r0 = 1065353216(0x3f800000, float:1.0)
                androidx.appcompat.widget.ActionBarContextView r1 = r9.f5900v
                if (r3 == 0) goto L_0x0161
                r3 = 0
                r1.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r9.f5900v
                h0.l0 r1 = h0.y.a(r1)
                r1.a(r0)
                r9.f5903y = r1
                d.m r0 = new d.m
                r0.<init>(r9)
                r1.d(r0)
                goto L_0x0180
            L_0x0161:
                r1.setAlpha(r0)
                androidx.appcompat.widget.ActionBarContextView r0 = r9.f5900v
                r0.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r0 = r9.f5900v
                android.view.ViewParent r0 = r0.getParent()
                boolean r0 = r0 instanceof android.view.View
                if (r0 == 0) goto L_0x0180
                androidx.appcompat.widget.ActionBarContextView r0 = r9.f5900v
                android.view.ViewParent r0 = r0.getParent()
                android.view.View r0 = (android.view.View) r0
                java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
                h0.y.h.c(r0)
            L_0x0180:
                android.widget.PopupWindow r0 = r9.w
                if (r0 == 0) goto L_0x0192
                android.view.Window r0 = r9.f5886l
                android.view.View r0 = r0.getDecorView()
                d.l r1 = r9.f5902x
                r0.post(r1)
                goto L_0x0192
            L_0x0190:
                r9.u = r2
            L_0x0192:
                g.a r0 = r9.u
                if (r0 == 0) goto L_0x019d
                d.g r0 = r9.f5888n
                if (r0 == 0) goto L_0x019d
                r0.n()
            L_0x019d:
                r9.X()
                g.a r0 = r9.u
                r9.u = r0
            L_0x01a4:
                r9.X()
                g.a r9 = r9.u
                if (r9 == 0) goto L_0x01af
                g.e r2 = r10.e(r9)
            L_0x01af:
                return r2
            L_0x01b0:
                android.view.ActionMode r9 = super.onWindowStartingActionMode(r9, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: d.i.C0075i.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
        }
    }

    public class j extends k {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f5915c;

        public j(Context context) {
            super();
            this.f5915c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public final int c() {
            return this.f5915c.isPowerSaveMode() ? 2 : 1;
        }

        public final void d() {
            i.this.d();
        }
    }

    public abstract class k {

        /* renamed from: a  reason: collision with root package name */
        public a f5917a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public final void onReceive(Context context, Intent intent) {
                k.this.d();
            }
        }

        public k() {
        }

        public final void a() {
            a aVar = this.f5917a;
            if (aVar != null) {
                try {
                    i.this.k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f5917a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f5917a == null) {
                    this.f5917a = new a();
                }
                i.this.k.registerReceiver(this.f5917a, b10);
            }
        }
    }

    public class l extends k {

        /* renamed from: c  reason: collision with root package name */
        public final y f5920c;

        public l(y yVar) {
            super();
            this.f5920c = yVar;
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:62:0x010e A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c() {
            /*
                r23 = this;
                r1 = r23
                d.y r2 = r1.f5920c
                d.y$a r3 = r2.f5996c
                long r4 = r3.f5998b
                long r6 = java.lang.System.currentTimeMillis()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r4 = 0
                r5 = 1
                if (r0 <= 0) goto L_0x0014
                r0 = r5
                goto L_0x0015
            L_0x0014:
                r0 = r4
            L_0x0015:
                if (r0 == 0) goto L_0x0019
                goto L_0x00f1
            L_0x0019:
                android.content.Context r0 = r2.f5994a
                java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
                int r0 = y3.a.i(r0, r6)
                java.lang.String r6 = "Failed to get last known location"
                java.lang.String r7 = "TwilightManager"
                r8 = 0
                if (r0 != 0) goto L_0x0040
                java.lang.String r0 = "network"
                android.location.LocationManager r9 = r2.f5995b     // Catch:{ Exception -> 0x0039 }
                boolean r9 = r9.isProviderEnabled(r0)     // Catch:{ Exception -> 0x0039 }
                if (r9 == 0) goto L_0x003d
                android.location.LocationManager r9 = r2.f5995b     // Catch:{ Exception -> 0x0039 }
                android.location.Location r0 = r9.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x0039 }
                goto L_0x003e
            L_0x0039:
                r0 = move-exception
                android.util.Log.d(r7, r6, r0)
            L_0x003d:
                r0 = r8
            L_0x003e:
                r9 = r0
                goto L_0x0041
            L_0x0040:
                r9 = r8
            L_0x0041:
                android.content.Context r0 = r2.f5994a
                java.lang.String r10 = "android.permission.ACCESS_FINE_LOCATION"
                int r0 = y3.a.i(r0, r10)
                if (r0 != 0) goto L_0x0061
                java.lang.String r0 = "gps"
                android.location.LocationManager r10 = r2.f5995b     // Catch:{ Exception -> 0x005d }
                boolean r10 = r10.isProviderEnabled(r0)     // Catch:{ Exception -> 0x005d }
                if (r10 == 0) goto L_0x0061
                android.location.LocationManager r10 = r2.f5995b     // Catch:{ Exception -> 0x005d }
                android.location.Location r0 = r10.getLastKnownLocation(r0)     // Catch:{ Exception -> 0x005d }
                r8 = r0
                goto L_0x0061
            L_0x005d:
                r0 = move-exception
                android.util.Log.d(r7, r6, r0)
            L_0x0061:
                if (r8 == 0) goto L_0x0072
                if (r9 == 0) goto L_0x0072
                long r10 = r8.getTime()
                long r12 = r9.getTime()
                int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r0 <= 0) goto L_0x0075
                goto L_0x0074
            L_0x0072:
                if (r8 == 0) goto L_0x0075
            L_0x0074:
                r9 = r8
            L_0x0075:
                if (r9 == 0) goto L_0x00f4
                d.y$a r0 = r2.f5996c
                long r6 = java.lang.System.currentTimeMillis()
                d.x r2 = d.x.f5989d
                if (r2 != 0) goto L_0x0088
                d.x r2 = new d.x
                r2.<init>()
                d.x.f5989d = r2
            L_0x0088:
                d.x r2 = d.x.f5989d
                r17 = 86400000(0x5265c00, double:4.2687272E-316)
                long r11 = r6 - r17
                double r13 = r9.getLatitude()
                double r15 = r9.getLongitude()
                r10 = r2
                r10.a(r11, r13, r15)
                double r13 = r9.getLatitude()
                double r15 = r9.getLongitude()
                r11 = r6
                r10.a(r11, r13, r15)
                int r8 = r2.f5992c
                if (r8 != r5) goto L_0x00ac
                r4 = r5
            L_0x00ac:
                long r13 = r2.f5991b
                long r11 = r2.f5990a
                long r15 = r6 + r17
                double r17 = r9.getLatitude()
                double r8 = r9.getLongitude()
                r10 = r2
                r19 = r11
                r11 = r15
                r21 = r13
                r13 = r17
                r15 = r8
                r10.a(r11, r13, r15)
                long r8 = r2.f5991b
                r10 = 0
                r12 = -1
                int r2 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
                if (r2 == 0) goto L_0x00e9
                int r2 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
                if (r2 != 0) goto L_0x00d5
                goto L_0x00e9
            L_0x00d5:
                int r2 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                if (r2 <= 0) goto L_0x00db
                long r8 = r8 + r10
                goto L_0x00e4
            L_0x00db:
                int r2 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
                if (r2 <= 0) goto L_0x00e2
                long r8 = r19 + r10
                goto L_0x00e4
            L_0x00e2:
                long r8 = r21 + r10
            L_0x00e4:
                r6 = 60000(0xea60, double:2.9644E-319)
                long r8 = r8 + r6
                goto L_0x00ed
            L_0x00e9:
                r8 = 43200000(0x2932e00, double:2.1343636E-316)
                long r8 = r8 + r6
            L_0x00ed:
                r0.f5997a = r4
                r0.f5998b = r8
            L_0x00f1:
                boolean r0 = r3.f5997a
                goto L_0x010c
            L_0x00f4:
                java.lang.String r0 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                android.util.Log.i(r7, r0)
                java.util.Calendar r0 = java.util.Calendar.getInstance()
                r2 = 11
                int r0 = r0.get(r2)
                r2 = 6
                if (r0 < r2) goto L_0x010a
                r2 = 22
                if (r0 < r2) goto L_0x010b
            L_0x010a:
                r4 = r5
            L_0x010b:
                r0 = r4
            L_0x010c:
                if (r0 == 0) goto L_0x010f
                r5 = 2
            L_0x010f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d.i.l.c():int");
        }

        public final void d() {
            i.this.d();
        }
    }

    public class m extends ContentFrameLayout {
        public m(g.c cVar) {
            super(cVar, (AttributeSet) null);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return i.this.I(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z9;
            if (motionEvent.getAction() == 0) {
                int x9 = (int) motionEvent.getX();
                int y9 = (int) motionEvent.getY();
                if (x9 < -5 || y9 < -5 || x9 > getWidth() + 5 || y9 > getHeight() + 5) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i iVar = i.this;
                    iVar.G(iVar.O(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(e.a.a(getContext(), i10));
        }
    }

    public static final class n {

        /* renamed from: a  reason: collision with root package name */
        public int f5923a;

        /* renamed from: b  reason: collision with root package name */
        public int f5924b;

        /* renamed from: c  reason: collision with root package name */
        public int f5925c;

        /* renamed from: d  reason: collision with root package name */
        public int f5926d;

        /* renamed from: e  reason: collision with root package name */
        public m f5927e;

        /* renamed from: f  reason: collision with root package name */
        public View f5928f;

        /* renamed from: g  reason: collision with root package name */
        public View f5929g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f5930h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f5931i;

        /* renamed from: j  reason: collision with root package name */
        public g.c f5932j;
        public boolean k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5933l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5934m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5935n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5936o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f5937p;

        public n(int i10) {
            this.f5923a = i10;
        }
    }

    public final class o implements j.a {
        public o() {
        }

        public final void a(androidx.appcompat.view.menu.f fVar, boolean z9) {
            boolean z10;
            int i10;
            n nVar;
            androidx.appcompat.view.menu.f k = fVar.k();
            int i11 = 0;
            if (k != fVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            i iVar = i.this;
            if (z10) {
                fVar = k;
            }
            n[] nVarArr = iVar.M;
            if (nVarArr != null) {
                i10 = nVarArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    nVar = nVarArr[i11];
                    if (nVar != null && nVar.f5930h == fVar) {
                        break;
                    }
                    i11++;
                } else {
                    nVar = null;
                    break;
                }
            }
            if (nVar != null) {
                i iVar2 = i.this;
                if (z10) {
                    iVar2.E(nVar.f5923a, nVar, k);
                    i.this.G(nVar, true);
                    return;
                }
                iVar2.G(nVar, z9);
            }
        }

        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            Window.Callback P;
            if (fVar != fVar.k()) {
                return true;
            }
            i iVar = i.this;
            if (!iVar.G || (P = iVar.P()) == null || i.this.R) {
                return true;
            }
            P.onMenuOpened(108, fVar);
            return true;
        }
    }

    public i(Context context, Window window, g gVar, Object obj) {
        m.h<String, Integer> hVar;
        Integer orDefault;
        f fVar;
        this.k = context;
        this.f5888n = gVar;
        this.f5885j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof f)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        fVar = (f) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            fVar = null;
            if (fVar != null) {
                this.T = fVar.z().h();
            }
        }
        if (this.T == -100 && (orDefault = hVar.getOrDefault(this.f5885j.getClass().getName(), null)) != null) {
            this.T = orDefault.intValue();
            (hVar = f5881w0).remove(this.f5885j.getClass().getName());
        }
        if (window != null) {
            C(window);
        }
        androidx.appcompat.widget.j.d();
    }

    public static d0.f D(Context context) {
        d0.f fVar;
        d0.f fVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = h.f5874c) == null) {
            return null;
        }
        d0.f b10 = f.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.f6032a.isEmpty()) {
            fVar2 = d0.f.f6031b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                if (i10 >= b10.f6032a.size() + fVar.f6032a.size()) {
                    break;
                }
                if (i10 < fVar.f6032a.size()) {
                    locale = fVar.f6032a.get(i10);
                } else {
                    locale = b10.f6032a.get(i10 - fVar.f6032a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            fVar2 = new d0.f(new d0.h(f.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (fVar2.f6032a.isEmpty()) {
            return b10;
        }
        return fVar2;
    }

    public static Configuration H(Context context, int i10, d0.f fVar, Configuration configuration, boolean z9) {
        int i11 = i10 != 1 ? i10 != 2 ? z9 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        if (fVar != null) {
            f.d(configuration2, fVar);
        }
        return configuration2;
    }

    public final void A(CharSequence charSequence) {
        this.f5892q = charSequence;
        m0 m0Var = this.f5894r;
        if (m0Var != null) {
            m0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f5889o;
        if (aVar != null) {
            aVar.p(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(boolean r12, boolean r13) {
        /*
            r11 = this;
            boolean r0 = r11.R
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.T
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = d.h.f5873b
        L_0x000f:
            android.content.Context r2 = r11.k
            int r2 = r11.R(r2, r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            r5 = 0
            if (r3 >= r4) goto L_0x0023
            android.content.Context r4 = r11.k
            d0.f r4 = D(r4)
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            if (r13 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            android.content.Context r13 = r11.k
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            d0.f r4 = d.i.f.b(r13)
        L_0x0036:
            android.content.Context r13 = r11.k
            android.content.res.Configuration r13 = H(r13, r2, r4, r5, r1)
            android.content.Context r2 = r11.k
            boolean r6 = r11.W
            r7 = 1
            if (r6 != 0) goto L_0x007a
            java.lang.Object r6 = r11.f5885j
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 == 0) goto L_0x007a
            android.content.pm.PackageManager r6 = r2.getPackageManager()
            if (r6 != 0) goto L_0x0051
            r2 = r1
            goto L_0x007e
        L_0x0051:
            r8 = 29
            if (r3 < r8) goto L_0x0058
            r3 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x005a
        L_0x0058:
            r3 = 786432(0xc0000, float:1.102026E-39)
        L_0x005a:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0070 }
            java.lang.Object r9 = r11.f5885j     // Catch:{ NameNotFoundException -> 0x0070 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ NameNotFoundException -> 0x0070 }
            r8.<init>(r2, r9)     // Catch:{ NameNotFoundException -> 0x0070 }
            android.content.pm.ActivityInfo r2 = r6.getActivityInfo(r8, r3)     // Catch:{ NameNotFoundException -> 0x0070 }
            if (r2 == 0) goto L_0x007a
            int r2 = r2.configChanges     // Catch:{ NameNotFoundException -> 0x0070 }
            r11.V = r2     // Catch:{ NameNotFoundException -> 0x0070 }
            goto L_0x007a
        L_0x0070:
            r2 = move-exception
            java.lang.String r3 = "AppCompatDelegate"
            java.lang.String r6 = "Exception while getting ActivityInfo"
            android.util.Log.d(r3, r6, r2)
            r11.V = r1
        L_0x007a:
            r11.W = r7
            int r2 = r11.V
        L_0x007e:
            android.content.res.Configuration r3 = r11.S
            if (r3 != 0) goto L_0x008c
            android.content.Context r3 = r11.k
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L_0x008c:
            int r6 = r3.uiMode
            r6 = r6 & 48
            int r8 = r13.uiMode
            r8 = r8 & 48
            d0.f r3 = d.i.f.b(r3)
            if (r4 != 0) goto L_0x009c
            r13 = r5
            goto L_0x00a0
        L_0x009c:
            d0.f r13 = d.i.f.b(r13)
        L_0x00a0:
            if (r6 == r8) goto L_0x00a5
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x00a6
        L_0x00a5:
            r4 = r1
        L_0x00a6:
            if (r13 == 0) goto L_0x00b2
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00b2
            r3 = r4 | 4
            r4 = r3 | 8192(0x2000, float:1.14794E-41)
        L_0x00b2:
            int r3 = ~r2
            r3 = r3 & r4
            r6 = 28
            r9 = 3
            if (r3 == 0) goto L_0x00f6
            if (r12 == 0) goto L_0x00f6
            boolean r12 = r11.P
            if (r12 == 0) goto L_0x00f6
            boolean r12 = f5883y0
            if (r12 != 0) goto L_0x00c7
            boolean r12 = r11.Q
            if (r12 == 0) goto L_0x00f6
        L_0x00c7:
            java.lang.Object r12 = r11.f5885j
            boolean r3 = r12 instanceof android.app.Activity
            if (r3 == 0) goto L_0x00f6
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x00f6
            java.lang.Object r12 = r11.f5885j
            android.app.Activity r12 = (android.app.Activity) r12
            int r3 = x.a.f12762c
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L_0x00e3
            r12.recreate()
            goto L_0x00f4
        L_0x00e3:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r10 = r12.getMainLooper()
            r3.<init>(r10)
            androidx.activity.i r10 = new androidx.activity.i
            r10.<init>(r9, r12)
            r3.post(r10)
        L_0x00f4:
            r12 = r7
            goto L_0x00f7
        L_0x00f6:
            r12 = r1
        L_0x00f7:
            if (r12 != 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            r12 = r4 & r2
            if (r12 != r4) goto L_0x0100
            r1 = r7
        L_0x0100:
            android.content.Context r12 = r11.k
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r12.getConfiguration()
            r2.<init>(r3)
            android.content.res.Configuration r3 = r12.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & -49
            r3 = r3 | r8
            r2.uiMode = r3
            if (r13 == 0) goto L_0x011f
            d.i.f.d(r2, r13)
        L_0x011f:
            r12.updateConfiguration(r2, r5)
            int r3 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r3 >= r8) goto L_0x01d6
            if (r3 < r6) goto L_0x012c
            goto L_0x01d6
        L_0x012c:
            boolean r3 = d.v.f5974h
            java.lang.String r6 = "ResourcesFlusher"
            if (r3 != 0) goto L_0x0148
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r8 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0140 }
            d.v.f5973g = r3     // Catch:{ NoSuchFieldException -> 0x0140 }
            r3.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x0140 }
            goto L_0x0146
        L_0x0140:
            r3 = move-exception
            java.lang.String r8 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r6, r8, r3)
        L_0x0146:
            d.v.f5974h = r7
        L_0x0148:
            java.lang.reflect.Field r3 = d.v.f5973g
            if (r3 != 0) goto L_0x014e
            goto L_0x01d6
        L_0x014e:
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x0153 }
            goto L_0x015a
        L_0x0153:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r6, r3, r12)
            r12 = r5
        L_0x015a:
            if (r12 != 0) goto L_0x015e
            goto L_0x01d6
        L_0x015e:
            boolean r3 = d.v.f5968b
            if (r3 != 0) goto L_0x017a
            java.lang.Class r3 = r12.getClass()     // Catch:{ NoSuchFieldException -> 0x0172 }
            java.lang.String r8 = "mDrawableCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0172 }
            d.v.f5967a = r3     // Catch:{ NoSuchFieldException -> 0x0172 }
            r3.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x0172 }
            goto L_0x0178
        L_0x0172:
            r3 = move-exception
            java.lang.String r8 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r6, r8, r3)
        L_0x0178:
            d.v.f5968b = r7
        L_0x017a:
            java.lang.reflect.Field r3 = d.v.f5967a
            if (r3 == 0) goto L_0x0189
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x0183 }
            goto L_0x018a
        L_0x0183:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r6, r3, r12)
        L_0x0189:
            r12 = r5
        L_0x018a:
            if (r12 == 0) goto L_0x01d6
            boolean r3 = d.v.f5970d
            if (r3 != 0) goto L_0x01a1
            java.lang.String r3 = "android.content.res.ThemedResourceCache"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0199 }
            d.v.f5969c = r3     // Catch:{ ClassNotFoundException -> 0x0199 }
            goto L_0x019f
        L_0x0199:
            r3 = move-exception
            java.lang.String r8 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r6, r8, r3)
        L_0x019f:
            d.v.f5970d = r7
        L_0x01a1:
            java.lang.Class<?> r3 = d.v.f5969c
            if (r3 != 0) goto L_0x01a6
            goto L_0x01d6
        L_0x01a6:
            boolean r8 = d.v.f5972f
            if (r8 != 0) goto L_0x01be
            java.lang.String r8 = "mUnthemedEntries"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x01b6 }
            d.v.f5971e = r3     // Catch:{ NoSuchFieldException -> 0x01b6 }
            r3.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x01b6 }
            goto L_0x01bc
        L_0x01b6:
            r3 = move-exception
            java.lang.String r8 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r6, r8, r3)
        L_0x01bc:
            d.v.f5972f = r7
        L_0x01be:
            java.lang.reflect.Field r3 = d.v.f5971e
            if (r3 != 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x01cb }
            android.util.LongSparseArray r12 = (android.util.LongSparseArray) r12     // Catch:{ IllegalAccessException -> 0x01cb }
            r5 = r12
            goto L_0x01d1
        L_0x01cb:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r6, r3, r12)
        L_0x01d1:
            if (r5 == 0) goto L_0x01d6
            d.v.a.a(r5)
        L_0x01d6:
            int r12 = r11.U
            if (r12 == 0) goto L_0x01ea
            android.content.Context r3 = r11.k
            r3.setTheme(r12)
            android.content.Context r12 = r11.k
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r3 = r11.U
            r12.applyStyle(r3, r7)
        L_0x01ea:
            if (r1 == 0) goto L_0x0217
            java.lang.Object r12 = r11.f5885j
            boolean r1 = r12 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0217
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r1 = r12 instanceof androidx.lifecycle.l
            if (r1 == 0) goto L_0x020a
            r1 = r12
            androidx.lifecycle.l r1 = (androidx.lifecycle.l) r1
            androidx.lifecycle.m r1 = r1.r()
            androidx.lifecycle.g$c r1 = r1.f1744b
            androidx.lifecycle.g$c r3 = androidx.lifecycle.g.c.CREATED
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x0217
            goto L_0x0212
        L_0x020a:
            boolean r1 = r11.Q
            if (r1 == 0) goto L_0x0217
            boolean r1 = r11.R
            if (r1 != 0) goto L_0x0217
        L_0x0212:
            r12.onConfigurationChanged(r2)
            goto L_0x0217
        L_0x0216:
            r7 = r12
        L_0x0217:
            if (r7 == 0) goto L_0x0233
            java.lang.Object r12 = r11.f5885j
            boolean r1 = r12 instanceof d.f
            if (r1 == 0) goto L_0x0233
            r1 = r4 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0228
            d.f r12 = (d.f) r12
            r12.getClass()
        L_0x0228:
            r12 = r4 & 4
            if (r12 == 0) goto L_0x0233
            java.lang.Object r12 = r11.f5885j
            d.f r12 = (d.f) r12
            r12.getClass()
        L_0x0233:
            if (r7 == 0) goto L_0x0248
            if (r13 == 0) goto L_0x0248
            android.content.Context r12 = r11.k
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            d0.f r12 = d.i.f.b(r12)
            d.i.f.c(r12)
        L_0x0248:
            if (r0 != 0) goto L_0x0254
            android.content.Context r12 = r11.k
            d.i$k r12 = r11.N(r12)
            r12.e()
            goto L_0x025b
        L_0x0254:
            d.i$l r12 = r11.X
            if (r12 == 0) goto L_0x025b
            r12.a()
        L_0x025b:
            if (r0 != r9) goto L_0x0270
            android.content.Context r12 = r11.k
            d.i$j r13 = r11.Y
            if (r13 != 0) goto L_0x026a
            d.i$j r13 = new d.i$j
            r13.<init>(r12)
            r11.Y = r13
        L_0x026a:
            d.i$j r12 = r11.Y
            r12.e()
            goto L_0x0277
        L_0x0270:
            d.i$j r12 = r11.Y
            if (r12 == 0) goto L_0x0277
            r12.a()
        L_0x0277:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.B(boolean, boolean):boolean");
    }

    public final void C(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f5886l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0075i)) {
                C0075i iVar = new C0075i(callback);
                this.f5887m = iVar;
                window.setCallback(iVar);
                Context context = this.k;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f5882x0);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    androidx.appcompat.widget.j a10 = androidx.appcompat.widget.j.a();
                    synchronized (a10) {
                        drawable = a10.f813a.f(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f5886l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.u0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f5901v0) == null)) {
                        h.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f5901v0 = null;
                    }
                    Object obj = this.f5885j;
                    if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                        onBackInvokedDispatcher2 = h.a((Activity) this.f5885j);
                    }
                    this.u0 = onBackInvokedDispatcher2;
                    X();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void E(int i10, n nVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (nVar == null && i10 >= 0) {
                n[] nVarArr = this.M;
                if (i10 < nVarArr.length) {
                    nVar = nVarArr[i10];
                }
            }
            if (nVar != null) {
                fVar = nVar.f5930h;
            }
        }
        if ((nVar == null || nVar.f5934m) && !this.R) {
            C0075i iVar = this.f5887m;
            Window.Callback callback = this.f5886l.getCallback();
            iVar.getClass();
            try {
                iVar.f5913e = true;
                callback.onPanelClosed(i10, fVar);
                iVar.f5913e = false;
            } catch (Throwable th) {
                iVar.f5913e = false;
                throw th;
            }
        }
    }

    public final void F(androidx.appcompat.view.menu.f fVar) {
        if (!this.L) {
            this.L = true;
            this.f5894r.l();
            Window.Callback P2 = P();
            if (P2 != null && !this.R) {
                P2.onPanelClosed(108, fVar);
            }
            this.L = false;
        }
    }

    public final void G(n nVar, boolean z9) {
        m mVar;
        m0 m0Var;
        if (!z9 || nVar.f5923a != 0 || (m0Var = this.f5894r) == null || !m0Var.a()) {
            WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
            if (!(windowManager == null || !nVar.f5934m || (mVar = nVar.f5927e) == null)) {
                windowManager.removeView(mVar);
                if (z9) {
                    E(nVar.f5923a, nVar, (androidx.appcompat.view.menu.f) null);
                }
            }
            nVar.k = false;
            nVar.f5933l = false;
            nVar.f5934m = false;
            nVar.f5928f = null;
            nVar.f5935n = true;
            if (this.N == nVar) {
                this.N = null;
            }
            if (nVar.f5923a == 0) {
                X();
                return;
            }
            return;
        }
        F(nVar.f5930h);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5885j
            boolean r1 = r0 instanceof h0.f.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof d.p
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f5886l
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = h0.f.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            r3 = 0
            if (r0 != r1) goto L_0x003d
            d.i$i r0 = r6.f5887m
            android.view.Window r4 = r6.f5886l
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f5912d = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f5912d = r3
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f5912d = r3
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            r4 = r2
            goto L_0x004a
        L_0x0049:
            r4 = r3
        L_0x004a:
            r5 = 4
            if (r4 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0066
            if (r0 == r1) goto L_0x0053
            goto L_0x0105
        L_0x0053:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0106
            d.i$n r0 = r6.O(r3)
            boolean r1 = r0.f5934m
            if (r1 != 0) goto L_0x0106
            r6.V(r0, r7)
            goto L_0x0106
        L_0x0066:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            r6.O = r2
            goto L_0x0105
        L_0x0074:
            if (r0 == r5) goto L_0x00fe
            if (r0 == r1) goto L_0x007a
            goto L_0x0105
        L_0x007a:
            g.a r0 = r6.u
            if (r0 == 0) goto L_0x0080
            goto L_0x0106
        L_0x0080:
            d.i$n r0 = r6.O(r3)
            androidx.appcompat.widget.m0 r1 = r6.f5894r
            if (r1 == 0) goto L_0x00ba
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x00ba
            android.content.Context r1 = r6.k
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ba
            androidx.appcompat.widget.m0 r1 = r6.f5894r
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r6.R
            if (r1 != 0) goto L_0x00da
            boolean r7 = r6.V(r0, r7)
            if (r7 == 0) goto L_0x00da
            androidx.appcompat.widget.m0 r7 = r6.f5894r
            boolean r7 = r7.f()
            goto L_0x00e0
        L_0x00b3:
            androidx.appcompat.widget.m0 r7 = r6.f5894r
            boolean r7 = r7.e()
            goto L_0x00e0
        L_0x00ba:
            boolean r1 = r0.f5934m
            if (r1 != 0) goto L_0x00dc
            boolean r4 = r0.f5933l
            if (r4 == 0) goto L_0x00c3
            goto L_0x00dc
        L_0x00c3:
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x00da
            boolean r1 = r0.f5936o
            if (r1 == 0) goto L_0x00d2
            r0.k = r3
            boolean r1 = r6.V(r0, r7)
            goto L_0x00d3
        L_0x00d2:
            r1 = r2
        L_0x00d3:
            if (r1 == 0) goto L_0x00da
            r6.T(r0, r7)
            r7 = r2
            goto L_0x00e0
        L_0x00da:
            r7 = r3
            goto L_0x00e0
        L_0x00dc:
            r6.G(r0, r2)
            r7 = r1
        L_0x00e0:
            if (r7 == 0) goto L_0x0106
            android.content.Context r7 = r6.k
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00f6
            r7.playSoundEffect(r3)
            goto L_0x0106
        L_0x00f6:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0106
        L_0x00fe:
            boolean r7 = r6.S()
            if (r7 == 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = r3
        L_0x0106:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.I(android.view.KeyEvent):boolean");
    }

    public final void J(int i10) {
        n O2 = O(i10);
        if (O2.f5930h != null) {
            Bundle bundle = new Bundle();
            O2.f5930h.t(bundle);
            if (bundle.size() > 0) {
                O2.f5937p = bundle;
            }
            O2.f5930h.w();
            O2.f5930h.clear();
        }
        O2.f5936o = true;
        O2.f5935n = true;
        if ((i10 == 108 || i10 == 0) && this.f5894r != null) {
            n O3 = O(0);
            O3.k = false;
            V(O3, (KeyEvent) null);
        }
    }

    public final void K() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        int i10;
        Context context;
        if (!this.A) {
            TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(y3.a.f13032n);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(com.ironsource.sdk.mediation.R.styleable.AppCompatTheme_windowNoTitle, false)) {
                    u(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    u(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    u(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    u(10);
                }
                this.J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                L();
                this.f5886l.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.k);
                if (this.K) {
                    if (this.I) {
                        i10 = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i10 = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i10, (ViewGroup) null);
                } else if (this.J) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.H = false;
                    this.G = false;
                } else if (this.G) {
                    TypedValue typedValue = new TypedValue();
                    this.k.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new g.c(this.k, typedValue.resourceId);
                    } else {
                        context = this.k;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    m0 m0Var = (m0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f5894r = m0Var;
                    m0Var.setWindowCallback(P());
                    if (this.H) {
                        this.f5894r.k(109);
                    }
                    if (this.E) {
                        this.f5894r.k(2);
                    }
                    if (this.F) {
                        this.f5894r.k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    j jVar = new j(this);
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.i.u(viewGroup, jVar);
                    if (this.f5894r == null) {
                        this.C = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = r1.f933a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f5886l.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f5886l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new k(this));
                    this.B = viewGroup;
                    Object obj = this.f5885j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f5892q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        m0 m0Var2 = this.f5894r;
                        if (m0Var2 != null) {
                            m0Var2.setWindowTitle(charSequence);
                        } else {
                            a aVar = this.f5889o;
                            if (aVar != null) {
                                aVar.p(charSequence);
                            } else {
                                TextView textView = this.C;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(16908290);
                    View decorView = this.f5886l.getDecorView();
                    contentFrameLayout2.f597g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                    if (y.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.k.obtainStyledAttributes(y3.a.f13032n);
                    obtainStyledAttributes2.getValue(com.ironsource.sdk.mediation.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(com.ironsource.sdk.mediation.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.A = true;
                    n O2 = O(0);
                    if (!this.R && O2.f5930h == null) {
                        this.f5890o0 |= 4096;
                        if (!this.Z) {
                            y.d.m(this.f5886l.getDecorView(), this.p0);
                            this.Z = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder g10 = androidx.activity.f.g("AppCompat does not support the current theme features: { windowActionBar: ");
                g10.append(this.G);
                g10.append(", windowActionBarOverlay: ");
                g10.append(this.H);
                g10.append(", android:windowIsFloating: ");
                g10.append(this.J);
                g10.append(", windowActionModeOverlay: ");
                g10.append(this.I);
                g10.append(", windowNoTitle: ");
                g10.append(this.K);
                g10.append(" }");
                throw new IllegalArgumentException(g10.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void L() {
        if (this.f5886l == null) {
            Object obj = this.f5885j;
            if (obj instanceof Activity) {
                C(((Activity) obj).getWindow());
            }
        }
        if (this.f5886l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context M() {
        Context context;
        Q();
        a aVar = this.f5889o;
        if (aVar != null) {
            context = aVar.e();
        } else {
            context = null;
        }
        if (context == null) {
            return this.k;
        }
        return context;
    }

    public final k N(Context context) {
        if (this.X == null) {
            if (y.f5993d == null) {
                Context applicationContext = context.getApplicationContext();
                y.f5993d = new y(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new l(y.f5993d);
        }
        return this.X;
    }

    public final n O(int i10) {
        n[] nVarArr = this.M;
        if (nVarArr == null || nVarArr.length <= i10) {
            n[] nVarArr2 = new n[(i10 + 1)];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.M = nVarArr2;
            nVarArr = nVarArr2;
        }
        n nVar = nVarArr[i10];
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(i10);
        nVarArr[i10] = nVar2;
        return nVar2;
    }

    public final Window.Callback P() {
        return this.f5886l.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q() {
        /*
            r3 = this;
            r3.K()
            boolean r0 = r3.G
            if (r0 == 0) goto L_0x0037
            d.a r0 = r3.f5889o
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f5885j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            d.z r0 = new d.z
            java.lang.Object r1 = r3.f5885j
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.H
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f5889o = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            d.z r0 = new d.z
            java.lang.Object r1 = r3.f5885j
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            d.a r0 = r3.f5889o
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f5893q0
            r0.l(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.Q():void");
    }

    public final int R(Context context, int i10) {
        k kVar;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        if (this.Y == null) {
                            this.Y = new j(context);
                        }
                        kVar = this.Y;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                kVar = N(context);
            }
            return kVar.c();
        }
        return i10;
    }

    public final boolean S() {
        boolean z9 = this.O;
        this.O = false;
        n O2 = O(0);
        if (O2.f5934m) {
            if (!z9) {
                G(O2, true);
            }
            return true;
        }
        g.a aVar = this.u;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        Q();
        a aVar2 = this.f5889o;
        if (aVar2 == null || !aVar2.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0144, code lost:
        if (r15 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0168, code lost:
        if (r15.f429f.getCount() > 0) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(d.i.n r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f5934m
            if (r0 != 0) goto L_0x01d3
            boolean r0 = r13.R
            if (r0 == 0) goto L_0x000a
            goto L_0x01d3
        L_0x000a:
            int r0 = r14.f5923a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.k
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.P()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f5923a
            androidx.appcompat.view.menu.f r4 = r14.f5930h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.G(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.k
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.V(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            d.i$m r15 = r14.f5927e
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r5 = r14.f5935n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.f5929g
            if (r15 == 0) goto L_0x01a9
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01a9
            int r15 = r15.width
            if (r15 != r3) goto L_0x01a9
            r6 = r3
            goto L_0x01aa
        L_0x006b:
            if (r15 != 0) goto L_0x00d6
            android.content.Context r15 = r13.M()
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            r6 = 2130903048(0x7f030008, float:1.7412903E38)
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x0092
            r5.applyStyle(r6, r2)
        L_0x0092:
            r6 = 2130903952(0x7f030390, float:1.7414737E38)
            r5.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            if (r3 == 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r3 = 2132017721(0x7f140239, float:1.9673728E38)
        L_0x00a0:
            r5.applyStyle(r3, r2)
            g.c r3 = new g.c
            r3.<init>((android.content.Context) r15, (int) r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.f5932j = r3
            int[] r15 = y3.a.f13032n
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            r3 = 86
            int r3 = r15.getResourceId(r3, r1)
            r14.f5924b = r3
            int r3 = r15.getResourceId(r2, r1)
            r14.f5926d = r3
            r15.recycle()
            d.i$m r15 = new d.i$m
            g.c r3 = r14.f5932j
            r15.<init>(r3)
            r14.f5927e = r15
            r15 = 81
            r14.f5925c = r15
            goto L_0x00e5
        L_0x00d6:
            boolean r3 = r14.f5935n
            if (r3 == 0) goto L_0x00e5
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00e5
            d.i$m r15 = r14.f5927e
            r15.removeAllViews()
        L_0x00e5:
            android.view.View r15 = r14.f5929g
            if (r15 == 0) goto L_0x00ec
            r14.f5928f = r15
            goto L_0x0146
        L_0x00ec:
            androidx.appcompat.view.menu.f r15 = r14.f5930h
            if (r15 != 0) goto L_0x00f1
            goto L_0x0148
        L_0x00f1:
            d.i$o r15 = r13.f5898t
            if (r15 != 0) goto L_0x00fc
            d.i$o r15 = new d.i$o
            r15.<init>()
            r13.f5898t = r15
        L_0x00fc:
            d.i$o r15 = r13.f5898t
            androidx.appcompat.view.menu.d r3 = r14.f5931i
            if (r3 != 0) goto L_0x0114
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            g.c r5 = r14.f5932j
            r3.<init>(r5)
            r14.f5931i = r3
            r3.f428e = r15
            androidx.appcompat.view.menu.f r15 = r14.f5930h
            android.content.Context r5 = r15.f439a
            r15.b(r3, r5)
        L_0x0114:
            androidx.appcompat.view.menu.d r15 = r14.f5931i
            d.i$m r3 = r14.f5927e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f427d
            if (r5 != 0) goto L_0x0140
            android.view.LayoutInflater r5 = r15.f425b
            r6 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.f427d = r3
            androidx.appcompat.view.menu.d$a r3 = r15.f429f
            if (r3 != 0) goto L_0x0134
            androidx.appcompat.view.menu.d$a r3 = new androidx.appcompat.view.menu.d$a
            r3.<init>()
            r15.f429f = r3
        L_0x0134:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f427d
            androidx.appcompat.view.menu.d$a r5 = r15.f429f
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f427d
            r3.setOnItemClickListener(r15)
        L_0x0140:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.f427d
            r14.f5928f = r15
            if (r15 == 0) goto L_0x0148
        L_0x0146:
            r15 = r2
            goto L_0x0149
        L_0x0148:
            r15 = r1
        L_0x0149:
            if (r15 == 0) goto L_0x01d1
            android.view.View r15 = r14.f5928f
            if (r15 != 0) goto L_0x0150
            goto L_0x016c
        L_0x0150:
            android.view.View r15 = r14.f5929g
            if (r15 == 0) goto L_0x0155
            goto L_0x016a
        L_0x0155:
            androidx.appcompat.view.menu.d r15 = r14.f5931i
            androidx.appcompat.view.menu.d$a r3 = r15.f429f
            if (r3 != 0) goto L_0x0162
            androidx.appcompat.view.menu.d$a r3 = new androidx.appcompat.view.menu.d$a
            r3.<init>()
            r15.f429f = r3
        L_0x0162:
            androidx.appcompat.view.menu.d$a r15 = r15.f429f
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x016c
        L_0x016a:
            r15 = r2
            goto L_0x016d
        L_0x016c:
            r15 = r1
        L_0x016d:
            if (r15 != 0) goto L_0x0170
            goto L_0x01d1
        L_0x0170:
            android.view.View r15 = r14.f5928f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x017d
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x017d:
            int r3 = r14.f5924b
            d.i$m r5 = r14.f5927e
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f5928f
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0195
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f5928f
            r3.removeView(r5)
        L_0x0195:
            d.i$m r3 = r14.f5927e
            android.view.View r5 = r14.f5928f
            r3.addView(r5, r15)
            android.view.View r15 = r14.f5928f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01a9
            android.view.View r15 = r14.f5928f
            r15.requestFocus()
        L_0x01a9:
            r6 = r4
        L_0x01aa:
            r14.f5933l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f5925c
            r15.gravity = r1
            int r1 = r14.f5926d
            r15.windowAnimations = r1
            d.i$m r1 = r14.f5927e
            r0.addView(r1, r15)
            r14.f5934m = r2
            int r14 = r14.f5923a
            if (r14 != 0) goto L_0x01d0
            r13.X()
        L_0x01d0:
            return
        L_0x01d1:
            r14.f5935n = r2
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.T(d.i$n, android.view.KeyEvent):void");
    }

    public final boolean U(n nVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nVar.k || V(nVar, keyEvent)) && (fVar = nVar.f5930h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean V(n nVar, KeyEvent keyEvent) {
        boolean z9;
        int i10;
        boolean z10;
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        Resources.Theme theme;
        m0 m0Var4;
        if (this.R) {
            return false;
        }
        if (nVar.k) {
            return true;
        }
        n nVar2 = this.N;
        if (!(nVar2 == null || nVar2 == nVar)) {
            G(nVar2, false);
        }
        Window.Callback P2 = P();
        if (P2 != null) {
            nVar.f5929g = P2.onCreatePanelView(nVar.f5923a);
        }
        int i11 = nVar.f5923a;
        if (i11 == 0 || i11 == 108) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && (m0Var4 = this.f5894r) != null) {
            m0Var4.c();
        }
        if (nVar.f5929g == null && (!z9 || !(this.f5889o instanceof w))) {
            androidx.appcompat.view.menu.f fVar = nVar.f5930h;
            if (fVar == null || nVar.f5936o) {
                if (fVar == null) {
                    Context context = this.k;
                    int i12 = nVar.f5923a;
                    if ((i12 == 0 || i12 == 108) && this.f5894r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            g.c cVar = new g.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f443e = this;
                    androidx.appcompat.view.menu.f fVar3 = nVar.f5930h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(nVar.f5931i);
                        }
                        nVar.f5930h = fVar2;
                        androidx.appcompat.view.menu.d dVar = nVar.f5931i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f439a);
                        }
                    }
                    if (nVar.f5930h == null) {
                        return false;
                    }
                }
                if (z9 && (m0Var3 = this.f5894r) != null) {
                    if (this.f5896s == null) {
                        this.f5896s = new d();
                    }
                    m0Var3.g(nVar.f5930h, this.f5896s);
                }
                nVar.f5930h.w();
                if (!P2.onCreatePanelMenu(nVar.f5923a, nVar.f5930h)) {
                    androidx.appcompat.view.menu.f fVar4 = nVar.f5930h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(nVar.f5931i);
                        }
                        nVar.f5930h = null;
                    }
                    if (z9 && (m0Var2 = this.f5894r) != null) {
                        m0Var2.g((androidx.appcompat.view.menu.f) null, this.f5896s);
                    }
                    return false;
                }
                nVar.f5936o = false;
            }
            nVar.f5930h.w();
            Bundle bundle = nVar.f5937p;
            if (bundle != null) {
                nVar.f5930h.s(bundle);
                nVar.f5937p = null;
            }
            if (!P2.onPreparePanel(0, nVar.f5929g, nVar.f5930h)) {
                if (z9 && (m0Var = this.f5894r) != null) {
                    m0Var.g((androidx.appcompat.view.menu.f) null, this.f5896s);
                }
                nVar.f5930h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            nVar.f5930h.setQwertyMode(z10);
            nVar.f5930h.v();
        }
        nVar.k = true;
        nVar.f5933l = false;
        this.N = nVar;
        return true;
    }

    public final void W() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void X() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.u0 != null && (O(0).f5934m || this.u != null)) {
                z9 = true;
            }
            if (z9 && this.f5901v0 == null) {
                this.f5901v0 = h.b(this.u0, this);
            } else if (!z9 && (onBackInvokedCallback = this.f5901v0) != null) {
                h.c(this.u0, onBackInvokedCallback);
            }
        }
    }

    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i10;
        int i11;
        n nVar;
        Window.Callback P2 = P();
        if (P2 != null && !this.R) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            n[] nVarArr = this.M;
            if (nVarArr != null) {
                i11 = nVarArr.length;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
            while (true) {
                if (i10 < i11) {
                    nVar = nVarArr[i10];
                    if (nVar != null && nVar.f5930h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    nVar = null;
                    break;
                }
            }
            if (nVar != null) {
                return P2.onMenuItemSelected(nVar.f5923a, menuItem);
            }
        }
        return false;
    }

    public final void b(androidx.appcompat.view.menu.f fVar) {
        m0 m0Var = this.f5894r;
        if (m0Var == null || !m0Var.h() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.f5894r.d())) {
            n O2 = O(0);
            O2.f5935n = true;
            G(O2, false);
            T(O2, (KeyEvent) null);
            return;
        }
        Window.Callback P2 = P();
        if (this.f5894r.a()) {
            this.f5894r.e();
            if (!this.R) {
                P2.onPanelClosed(108, O(0).f5930h);
            }
        } else if (P2 != null && !this.R) {
            if (this.Z && (1 & this.f5890o0) != 0) {
                this.f5886l.getDecorView().removeCallbacks(this.p0);
                this.p0.run();
            }
            n O3 = O(0);
            androidx.appcompat.view.menu.f fVar2 = O3.f5930h;
            if (fVar2 != null && !O3.f5936o && P2.onPreparePanel(0, O3.f5929g, fVar2)) {
                P2.onMenuOpened(108, O3.f5930h);
                this.f5894r.f();
            }
        }
    }

    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.f5887m.a(this.f5886l.getCallback());
    }

    public final boolean d() {
        return B(true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context e(android.content.Context r12) {
        /*
            r11 = this;
            r0 = 1
            r11.P = r0
            int r1 = r11.T
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            int r1 = d.h.f5873b
        L_0x000c:
            int r1 = r11.R(r12, r1)
            boolean r2 = d.h.m(r12)
            if (r2 == 0) goto L_0x0071
            boolean r2 = d.h.m(r12)
            if (r2 != 0) goto L_0x001d
            goto L_0x0071
        L_0x001d:
            boolean r2 = d0.a.a()
            if (r2 == 0) goto L_0x0032
            boolean r2 = d.h.f5877f
            if (r2 != 0) goto L_0x0071
            d.t$a r2 = d.h.f5872a
            androidx.activity.i r3 = new androidx.activity.i
            r3.<init>(r0, r12)
            r2.execute(r3)
            goto L_0x0071
        L_0x0032:
            java.lang.Object r2 = d.h.f5880i
            monitor-enter(r2)
            d0.f r3 = d.h.f5874c     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0057
            d0.f r3 = d.h.f5875d     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0047
            java.lang.String r3 = d.t.b(r12)     // Catch:{ all -> 0x006e }
            d0.f r3 = d0.f.a(r3)     // Catch:{ all -> 0x006e }
            d.h.f5875d = r3     // Catch:{ all -> 0x006e }
        L_0x0047:
            d0.f r3 = d.h.f5875d     // Catch:{ all -> 0x006e }
            d0.g r3 = r3.f6032a     // Catch:{ all -> 0x006e }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0052
            goto L_0x006c
        L_0x0052:
            d0.f r3 = d.h.f5875d     // Catch:{ all -> 0x006e }
            d.h.f5874c = r3     // Catch:{ all -> 0x006e }
            goto L_0x006c
        L_0x0057:
            d0.f r4 = d.h.f5875d     // Catch:{ all -> 0x006e }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x006c
            d0.f r3 = d.h.f5874c     // Catch:{ all -> 0x006e }
            d.h.f5875d = r3     // Catch:{ all -> 0x006e }
            d0.g r3 = r3.f6032a     // Catch:{ all -> 0x006e }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x006e }
            d.t.a(r12, r3)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r12
        L_0x0071:
            d0.f r2 = D(r12)
            boolean r3 = f5884z0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x008a
            boolean r3 = r12 instanceof android.view.ContextThemeWrapper
            if (r3 == 0) goto L_0x008a
            android.content.res.Configuration r3 = H(r12, r1, r2, r5, r4)
            r6 = r12
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch:{ IllegalStateException -> 0x008a }
            r6.applyOverrideConfiguration(r3)     // Catch:{ IllegalStateException -> 0x008a }
            return r12
        L_0x008a:
            boolean r3 = r12 instanceof g.c
            if (r3 == 0) goto L_0x0099
            android.content.res.Configuration r3 = H(r12, r1, r2, r5, r4)
            r6 = r12
            g.c r6 = (g.c) r6     // Catch:{ IllegalStateException -> 0x0099 }
            r6.a(r3)     // Catch:{ IllegalStateException -> 0x0099 }
            return r12
        L_0x0099:
            boolean r3 = f5883y0
            if (r3 != 0) goto L_0x009e
            return r12
        L_0x009e:
            int r3 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r6 = new android.content.res.Configuration
            r6.<init>()
            r7 = -1
            r6.uiMode = r7
            r7 = 0
            r6.fontScale = r7
            android.content.Context r6 = r12.createConfigurationContext(r6)
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            android.content.res.Resources r8 = r12.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r9 = r8.uiMode
            r6.uiMode = r9
            boolean r9 = r6.equals(r8)
            if (r9 != 0) goto L_0x01a7
            android.content.res.Configuration r9 = new android.content.res.Configuration
            r9.<init>()
            r9.fontScale = r7
            int r7 = r6.diff(r8)
            if (r7 != 0) goto L_0x00d8
            goto L_0x01a8
        L_0x00d8:
            float r7 = r6.fontScale
            float r10 = r8.fontScale
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            r9.fontScale = r10
        L_0x00e2:
            int r7 = r6.mcc
            int r10 = r8.mcc
            if (r7 == r10) goto L_0x00ea
            r9.mcc = r10
        L_0x00ea:
            int r7 = r6.mnc
            int r10 = r8.mnc
            if (r7 == r10) goto L_0x00f2
            r9.mnc = r10
        L_0x00f2:
            d.i.f.a(r6, r8, r9)
            int r7 = r6.touchscreen
            int r10 = r8.touchscreen
            if (r7 == r10) goto L_0x00fd
            r9.touchscreen = r10
        L_0x00fd:
            int r7 = r6.keyboard
            int r10 = r8.keyboard
            if (r7 == r10) goto L_0x0105
            r9.keyboard = r10
        L_0x0105:
            int r7 = r6.keyboardHidden
            int r10 = r8.keyboardHidden
            if (r7 == r10) goto L_0x010d
            r9.keyboardHidden = r10
        L_0x010d:
            int r7 = r6.navigation
            int r10 = r8.navigation
            if (r7 == r10) goto L_0x0115
            r9.navigation = r10
        L_0x0115:
            int r7 = r6.navigationHidden
            int r10 = r8.navigationHidden
            if (r7 == r10) goto L_0x011d
            r9.navigationHidden = r10
        L_0x011d:
            int r7 = r6.orientation
            int r10 = r8.orientation
            if (r7 == r10) goto L_0x0125
            r9.orientation = r10
        L_0x0125:
            int r7 = r6.screenLayout
            r7 = r7 & 15
            int r10 = r8.screenLayout
            r10 = r10 & 15
            if (r7 == r10) goto L_0x0134
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0134:
            int r7 = r6.screenLayout
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r10 = r8.screenLayout
            r10 = r10 & 192(0xc0, float:2.69E-43)
            if (r7 == r10) goto L_0x0143
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0143:
            int r7 = r6.screenLayout
            r7 = r7 & 48
            int r10 = r8.screenLayout
            r10 = r10 & 48
            if (r7 == r10) goto L_0x0152
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0152:
            int r7 = r6.screenLayout
            r7 = r7 & 768(0x300, float:1.076E-42)
            int r10 = r8.screenLayout
            r10 = r10 & 768(0x300, float:1.076E-42)
            if (r7 == r10) goto L_0x0161
            int r7 = r9.screenLayout
            r7 = r7 | r10
            r9.screenLayout = r7
        L_0x0161:
            r7 = 26
            if (r3 < r7) goto L_0x0168
            d.i.g.a(r6, r8, r9)
        L_0x0168:
            int r3 = r6.uiMode
            r3 = r3 & 15
            int r7 = r8.uiMode
            r7 = r7 & 15
            if (r3 == r7) goto L_0x0177
            int r3 = r9.uiMode
            r3 = r3 | r7
            r9.uiMode = r3
        L_0x0177:
            int r3 = r6.uiMode
            r3 = r3 & 48
            int r7 = r8.uiMode
            r7 = r7 & 48
            if (r3 == r7) goto L_0x0186
            int r3 = r9.uiMode
            r3 = r3 | r7
            r9.uiMode = r3
        L_0x0186:
            int r3 = r6.screenWidthDp
            int r7 = r8.screenWidthDp
            if (r3 == r7) goto L_0x018e
            r9.screenWidthDp = r7
        L_0x018e:
            int r3 = r6.screenHeightDp
            int r7 = r8.screenHeightDp
            if (r3 == r7) goto L_0x0196
            r9.screenHeightDp = r7
        L_0x0196:
            int r3 = r6.smallestScreenWidthDp
            int r7 = r8.smallestScreenWidthDp
            if (r3 == r7) goto L_0x019e
            r9.smallestScreenWidthDp = r7
        L_0x019e:
            int r3 = r6.densityDpi
            int r6 = r8.densityDpi
            if (r3 == r6) goto L_0x01a8
            r9.densityDpi = r6
            goto L_0x01a8
        L_0x01a7:
            r9 = r5
        L_0x01a8:
            android.content.res.Configuration r1 = H(r12, r1, r2, r9, r0)
            g.c r2 = new g.c
            r3 = 2132017733(0x7f140245, float:1.9673753E38)
            r2.<init>((android.content.Context) r12, (int) r3)
            r2.a(r1)
            android.content.res.Resources$Theme r12 = r12.getTheme()     // Catch:{ NullPointerException -> 0x01bf }
            if (r12 == 0) goto L_0x01bf
            r12 = r0
            goto L_0x01c0
        L_0x01bf:
            r12 = r4
        L_0x01c0:
            if (r12 == 0) goto L_0x020c
            android.content.res.Resources$Theme r12 = r2.getTheme()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto L_0x01d0
            z.j.a(r12)
            goto L_0x020c
        L_0x01d0:
            java.lang.Object r1 = z.i.f13111a
            monitor-enter(r1)
            boolean r3 = z.i.f13113c     // Catch:{ all -> 0x0209 }
            if (r3 != 0) goto L_0x01f1
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01e7 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01e7 }
            z.i.f13112b = r3     // Catch:{ NoSuchMethodException -> 0x01e7 }
            r3.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01e7 }
            goto L_0x01ef
        L_0x01e7:
            r3 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r3)     // Catch:{ all -> 0x0209 }
        L_0x01ef:
            z.i.f13113c = r0     // Catch:{ all -> 0x0209 }
        L_0x01f1:
            java.lang.reflect.Method r0 = z.i.f13112b     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x0207
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x01fd, InvocationTargetException -> 0x01fb }
            r0.invoke(r12, r3)     // Catch:{ IllegalAccessException -> 0x01fd, InvocationTargetException -> 0x01fb }
            goto L_0x0207
        L_0x01fb:
            r12 = move-exception
            goto L_0x01fe
        L_0x01fd:
            r12 = move-exception
        L_0x01fe:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r3, r12)     // Catch:{ all -> 0x0209 }
            z.i.f13112b = r5     // Catch:{ all -> 0x0209 }
        L_0x0207:
            monitor-exit(r1)     // Catch:{ all -> 0x0209 }
            goto L_0x020c
        L_0x0209:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0209 }
            throw r12
        L_0x020c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.e(android.content.Context):android.content.Context");
    }

    public final <T extends View> T f(int i10) {
        K();
        return this.f5886l.findViewById(i10);
    }

    public final Context g() {
        return this.k;
    }

    public final int h() {
        return this.T;
    }

    public final MenuInflater i() {
        if (this.f5891p == null) {
            Q();
            a aVar = this.f5889o;
            this.f5891p = new g.f(aVar != null ? aVar.e() : this.k);
        }
        return this.f5891p;
    }

    public final a j() {
        Q();
        return this.f5889o;
    }

    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof i)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void l() {
        if (this.f5889o != null) {
            Q();
            if (!this.f5889o.f()) {
                this.f5890o0 |= 1;
                if (!this.Z) {
                    View decorView = this.f5886l.getDecorView();
                    a aVar = this.p0;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.m(decorView, aVar);
                    this.Z = true;
                }
            }
        }
    }

    public final void n(Configuration configuration) {
        if (this.G && this.A) {
            Q();
            a aVar = this.f5889o;
            if (aVar != null) {
                aVar.g();
            }
        }
        androidx.appcompat.widget.j a10 = androidx.appcompat.widget.j.a();
        Context context = this.k;
        synchronized (a10) {
            y0 y0Var = a10.f813a;
            synchronized (y0Var) {
                m.e eVar = y0Var.f1002b.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        B(false, false);
    }

    public final void o() {
        this.P = true;
        B(false, true);
        L();
        Object obj = this.f5885j;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = x.j.b(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.f5889o;
                if (aVar == null) {
                    this.f5893q0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (h.f5879h) {
                h.t(this);
                h.f5878g.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.appcompat.widget.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.widget.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: androidx.appcompat.widget.AppCompatButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: androidx.appcompat.widget.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: androidx.appcompat.widget.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: androidx.appcompat.widget.AppCompatButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: androidx.appcompat.widget.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: androidx.appcompat.widget.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: androidx.appcompat.widget.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: androidx.appcompat.widget.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: androidx.appcompat.widget.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: androidx.appcompat.widget.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: androidx.appcompat.widget.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: androidx.appcompat.widget.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: androidx.appcompat.widget.AppCompatButton} */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r10v17, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.widget.i0] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        if (r10.equals("ImageButton") == false) goto L_0x0144;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            d.q r9 = r8.f5899t0
            r0 = 0
            if (r9 != 0) goto L_0x0059
            android.content.Context r9 = r8.k
            int[] r1 = y3.a.f13032n
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r1)
            r1 = 116(0x74, float:1.63E-43)
            java.lang.String r9 = r9.getString(r1)
            if (r9 != 0) goto L_0x001b
            d.q r9 = new d.q
            r9.<init>()
            goto L_0x0057
        L_0x001b:
            android.content.Context r1 = r8.k     // Catch:{ all -> 0x0036 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0036 }
            java.lang.Class r1 = r1.loadClass(r9)     // Catch:{ all -> 0x0036 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0036 }
            d.q r1 = (d.q) r1     // Catch:{ all -> 0x0036 }
            r8.f5899t0 = r1     // Catch:{ all -> 0x0036 }
            goto L_0x0059
        L_0x0036:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = ". Falling back to default."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r9, r1)
            d.q r9 = new d.q
            r9.<init>()
        L_0x0057:
            r8.f5899t0 = r9
        L_0x0059:
            d.q r9 = r8.f5899t0
            int r1 = androidx.appcompat.widget.q1.f921a
            r9.getClass()
            r1 = 4
            int[] r2 = y3.a.D
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r2, r0, r0)
            int r3 = r2.getResourceId(r1, r0)
            if (r3 == 0) goto L_0x0074
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L_0x0074:
            r2.recycle()
            if (r3 == 0) goto L_0x008a
            boolean r2 = r11 instanceof g.c
            if (r2 == 0) goto L_0x0084
            r2 = r11
            g.c r2 = (g.c) r2
            int r2 = r2.f6396a
            if (r2 == r3) goto L_0x008a
        L_0x0084:
            g.c r2 = new g.c
            r2.<init>((android.content.Context) r11, (int) r3)
            goto L_0x008b
        L_0x008a:
            r2 = r11
        L_0x008b:
            r10.getClass()
            int r3 = r10.hashCode()
            r4 = 3
            r5 = -1
            r6 = 1
            switch(r3) {
                case -1946472170: goto L_0x0139;
                case -1455429095: goto L_0x012e;
                case -1346021293: goto L_0x0123;
                case -938935918: goto L_0x0118;
                case -937446323: goto L_0x010f;
                case -658531749: goto L_0x0104;
                case -339785223: goto L_0x00f9;
                case 776382189: goto L_0x00ee;
                case 799298502: goto L_0x00e0;
                case 1125864064: goto L_0x00d2;
                case 1413872058: goto L_0x00c4;
                case 1601505219: goto L_0x00b6;
                case 1666676343: goto L_0x00a8;
                case 2001146706: goto L_0x009a;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x0144
        L_0x009a:
            java.lang.String r1 = "Button"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00a4
            goto L_0x0144
        L_0x00a4:
            r1 = 13
            goto L_0x0145
        L_0x00a8:
            java.lang.String r1 = "EditText"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00b2
            goto L_0x0144
        L_0x00b2:
            r1 = 12
            goto L_0x0145
        L_0x00b6:
            java.lang.String r1 = "CheckBox"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00c0
            goto L_0x0144
        L_0x00c0:
            r1 = 11
            goto L_0x0145
        L_0x00c4:
            java.lang.String r1 = "AutoCompleteTextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00ce
            goto L_0x0144
        L_0x00ce:
            r1 = 10
            goto L_0x0145
        L_0x00d2:
            java.lang.String r1 = "ImageView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00dc
            goto L_0x0144
        L_0x00dc:
            r1 = 9
            goto L_0x0145
        L_0x00e0:
            java.lang.String r1 = "ToggleButton"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00ea
            goto L_0x0144
        L_0x00ea:
            r1 = 8
            goto L_0x0145
        L_0x00ee:
            java.lang.String r1 = "RadioButton"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00f7
            goto L_0x0144
        L_0x00f7:
            r1 = 7
            goto L_0x0145
        L_0x00f9:
            java.lang.String r1 = "Spinner"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0102
            goto L_0x0144
        L_0x0102:
            r1 = 6
            goto L_0x0145
        L_0x0104:
            java.lang.String r1 = "SeekBar"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x010d
            goto L_0x0144
        L_0x010d:
            r1 = 5
            goto L_0x0145
        L_0x010f:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0145
            goto L_0x0144
        L_0x0118:
            java.lang.String r1 = "TextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0121
            goto L_0x0144
        L_0x0121:
            r1 = r4
            goto L_0x0145
        L_0x0123:
            java.lang.String r1 = "MultiAutoCompleteTextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x012c
            goto L_0x0144
        L_0x012c:
            r1 = 2
            goto L_0x0145
        L_0x012e:
            java.lang.String r1 = "CheckedTextView"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0137
            goto L_0x0144
        L_0x0137:
            r1 = r6
            goto L_0x0145
        L_0x0139:
            java.lang.String r1 = "RatingBar"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r1 = r0
            goto L_0x0145
        L_0x0144:
            r1 = r5
        L_0x0145:
            r3 = 0
            switch(r1) {
                case 0: goto L_0x01c2;
                case 1: goto L_0x01bc;
                case 2: goto L_0x01b6;
                case 3: goto L_0x0188;
                case 4: goto L_0x0182;
                case 5: goto L_0x017c;
                case 6: goto L_0x0173;
                case 7: goto L_0x016e;
                case 8: goto L_0x0168;
                case 9: goto L_0x0162;
                case 10: goto L_0x015d;
                case 11: goto L_0x0158;
                case 12: goto L_0x0151;
                case 13: goto L_0x014c;
                default: goto L_0x0149;
            }
        L_0x0149:
            r1 = r3
            goto L_0x01c7
        L_0x014c:
            androidx.appcompat.widget.AppCompatButton r1 = r9.b(r2, r12)
            goto L_0x018c
        L_0x0151:
            androidx.appcompat.widget.k r1 = new androidx.appcompat.widget.k
            r1.<init>(r2, r12)
            goto L_0x01c7
        L_0x0158:
            androidx.appcompat.widget.f r1 = r9.c(r2, r12)
            goto L_0x018c
        L_0x015d:
            androidx.appcompat.widget.d r1 = r9.a(r2, r12)
            goto L_0x018c
        L_0x0162:
            androidx.appcompat.widget.p r1 = new androidx.appcompat.widget.p
            r1.<init>(r2, r12, r0)
            goto L_0x01c7
        L_0x0168:
            androidx.appcompat.widget.l0 r1 = new androidx.appcompat.widget.l0
            r1.<init>(r2, r12)
            goto L_0x01c7
        L_0x016e:
            androidx.appcompat.widget.t r1 = r9.d(r2, r12)
            goto L_0x018c
        L_0x0173:
            androidx.appcompat.widget.z r1 = new androidx.appcompat.widget.z
            r7 = 2130904079(0x7f03040f, float:1.7414994E38)
            r1.<init>(r2, r12, r7)
            goto L_0x01c7
        L_0x017c:
            androidx.appcompat.widget.w r1 = new androidx.appcompat.widget.w
            r1.<init>(r2, r12)
            goto L_0x01c7
        L_0x0182:
            androidx.appcompat.widget.n r1 = new androidx.appcompat.widget.n
            r1.<init>(r2, r12)
            goto L_0x01c7
        L_0x0188:
            androidx.appcompat.widget.i0 r1 = r9.e(r2, r12)
        L_0x018c:
            if (r1 == 0) goto L_0x018f
            goto L_0x01c7
        L_0x018f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " asked to inflate view for <"
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = ">, but returned null"
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x01b6:
            androidx.appcompat.widget.q r1 = new androidx.appcompat.widget.q
            r1.<init>(r2, r12)
            goto L_0x01c7
        L_0x01bc:
            androidx.appcompat.widget.g r1 = new androidx.appcompat.widget.g
            r1.<init>(r2, r12)
            goto L_0x01c7
        L_0x01c2:
            androidx.appcompat.widget.u r1 = new androidx.appcompat.widget.u
            r1.<init>(r2, r12)
        L_0x01c7:
            if (r1 != 0) goto L_0x0221
            if (r11 == r2) goto L_0x0221
            java.lang.String r11 = "view"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x01d9
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r3, r10)
        L_0x01d9:
            java.lang.Object[] r11 = r9.f5953a     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            r11[r0] = r2     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            r11[r6] = r12     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            r11 = 46
            int r11 = r10.indexOf(r11)     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            if (r5 != r11) goto L_0x0206
            r11 = r0
        L_0x01e8:
            java.lang.String[] r1 = d.q.f5951g     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            if (r11 >= r4) goto L_0x01ff
            r1 = r1[r11]     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            android.view.View r1 = r9.f(r2, r10, r1)     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            if (r1 == 0) goto L_0x01fc
            java.lang.Object[] r9 = r9.f5953a
            r9[r0] = r3
            r9[r6] = r3
            r3 = r1
            goto L_0x0220
        L_0x01fc:
            int r11 = r11 + 1
            goto L_0x01e8
        L_0x01ff:
            java.lang.Object[] r9 = r9.f5953a
            r9[r0] = r3
            r9[r6] = r3
            goto L_0x0220
        L_0x0206:
            android.view.View r10 = r9.f(r2, r10, r3)     // Catch:{ Exception -> 0x021a, all -> 0x0212 }
            java.lang.Object[] r9 = r9.f5953a
            r9[r0] = r3
            r9[r6] = r3
            r3 = r10
            goto L_0x0220
        L_0x0212:
            r10 = move-exception
            java.lang.Object[] r9 = r9.f5953a
            r9[r0] = r3
            r9[r6] = r3
            throw r10
        L_0x021a:
            java.lang.Object[] r9 = r9.f5953a
            r9[r0] = r3
            r9[r6] = r3
        L_0x0220:
            r1 = r3
        L_0x0221:
            if (r1 == 0) goto L_0x02aa
            android.content.Context r9 = r1.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x024b
            java.util.WeakHashMap<android.view.View, h0.l0> r10 = h0.y.f6776a
            boolean r10 = h0.y.c.a(r1)
            if (r10 != 0) goto L_0x0234
            goto L_0x024b
        L_0x0234:
            int[] r10 = d.q.f5947c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r0)
            if (r10 == 0) goto L_0x0248
            d.q$a r11 = new d.q$a
            r11.<init>(r1, r10)
            r1.setOnClickListener(r11)
        L_0x0248:
            r9.recycle()
        L_0x024b:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 <= r10) goto L_0x0252
            goto L_0x02aa
        L_0x0252:
            int[] r9 = d.q.f5948d
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0270
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, h0.l0> r11 = h0.y.f6776a
            h0.x r11 = new h0.x
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r1, r10)
        L_0x0270:
            r9.recycle()
            int[] r9 = d.q.f5949e
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0286
            java.lang.String r10 = r9.getString(r0)
            h0.y.o(r1, r10)
        L_0x0286:
            r9.recycle()
            int[] r9 = d.q.f5950f
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x02a7
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, h0.l0> r11 = h0.y.f6776a
            h0.v r11 = new h0.v
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r1, r10)
        L_0x02a7:
            r9.recycle()
        L_0x02aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5885j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = d.h.f5879h
            monitor-enter(r0)
            d.h.t(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.Z
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f5886l
            android.view.View r0 = r0.getDecorView()
            d.i$a r1 = r3.p0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f5885j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            m.h<java.lang.String, java.lang.Integer> r0 = f5881w0
            java.lang.Object r1 = r3.f5885j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            m.h<java.lang.String, java.lang.Integer> r0 = f5881w0
            java.lang.Object r1 = r3.f5885j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            d.a r0 = r3.f5889o
            if (r0 == 0) goto L_0x0063
            r0.h()
        L_0x0063:
            d.i$l r0 = r3.X
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            d.i$j r0 = r3.Y
            if (r0 == 0) goto L_0x0071
            r0.a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.p():void");
    }

    public final void q() {
        Q();
        a aVar = this.f5889o;
        if (aVar != null) {
            aVar.o(true);
        }
    }

    public final void r() {
        B(true, false);
    }

    public final void s() {
        Q();
        a aVar = this.f5889o;
        if (aVar != null) {
            aVar.o(false);
        }
    }

    public final boolean u(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.K && i10 == 108) {
            return false;
        }
        if (this.G && i10 == 1) {
            this.G = false;
        }
        if (i10 == 1) {
            W();
            this.K = true;
            return true;
        } else if (i10 == 2) {
            W();
            this.E = true;
            return true;
        } else if (i10 == 5) {
            W();
            this.F = true;
            return true;
        } else if (i10 == 10) {
            W();
            this.I = true;
            return true;
        } else if (i10 == 108) {
            W();
            this.G = true;
            return true;
        } else if (i10 != 109) {
            return this.f5886l.requestFeature(i10);
        } else {
            W();
            this.H = true;
            return true;
        }
    }

    public final void v(int i10) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i10, viewGroup);
        this.f5887m.a(this.f5886l.getCallback());
    }

    public final void w(View view) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f5887m.a(this.f5886l.getCallback());
    }

    public final void x(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f5887m.a(this.f5886l.getCallback());
    }

    public final void y(Toolbar toolbar) {
        CharSequence charSequence;
        if (this.f5885j instanceof Activity) {
            Q();
            a aVar = this.f5889o;
            if (!(aVar instanceof z)) {
                this.f5891p = null;
                if (aVar != null) {
                    aVar.h();
                }
                this.f5889o = null;
                if (toolbar != null) {
                    Object obj = this.f5885j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f5892q;
                    }
                    w wVar = new w(toolbar, charSequence, this.f5887m);
                    this.f5889o = wVar;
                    this.f5887m.f5910b = wVar.f5977c;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f5887m.f5910b = null;
                }
                l();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void z(int i10) {
        this.U = i10;
    }
}
