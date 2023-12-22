package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.activity.o;
import androidx.activity.result.f;
import androidx.activity.result.g;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import d1.b;
import d1.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x.a;

public class p extends ComponentActivity implements a.c {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f1598v = 0;

    /* renamed from: q  reason: collision with root package name */
    public final s f1599q = new s(new a());

    /* renamed from: r  reason: collision with root package name */
    public final m f1600r = new m(this);

    /* renamed from: s  reason: collision with root package name */
    public boolean f1601s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1602t;
    public boolean u = true;

    public class a extends u<p> implements f0, o, g, d, c0 {
        public a() {
            super(p.this);
        }

        public final p A() {
            return p.this;
        }

        public final LayoutInflater B() {
            return p.this.getLayoutInflater().cloneInContext(p.this);
        }

        public final void C() {
            p.this.y();
        }

        public final void a() {
            p.this.getClass();
        }

        public final OnBackPressedDispatcher b() {
            return p.this.f233g;
        }

        public final b c() {
            return p.this.f231e.f6042b;
        }

        public final View i(int i10) {
            return p.this.findViewById(i10);
        }

        public final boolean m() {
            Window window = p.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final f o() {
            return p.this.f235i;
        }

        public final e0 p() {
            return p.this.p();
        }

        public final m r() {
            return p.this.f1600r;
        }
    }

    public p() {
        this.f231e.f6042b.b("android:support:lifecycle", new c(this, 1));
        u(new androidx.activity.d(this, 1));
    }

    public static boolean x(y yVar) {
        p pVar;
        g.c cVar = g.c.CREATED;
        g.c cVar2 = g.c.STARTED;
        boolean z9 = false;
        for (o oVar : yVar.f1649c.h()) {
            if (oVar != null) {
                u<?> uVar = oVar.f1580t;
                if (uVar == null) {
                    pVar = null;
                } else {
                    pVar = uVar.A();
                }
                if (pVar != null) {
                    z9 |= x(oVar.k());
                }
                p0 p0Var = oVar.O;
                if (p0Var != null) {
                    p0Var.d();
                    if (p0Var.f1605b.f1744b.a(cVar2)) {
                        m mVar = oVar.O.f1605b;
                        mVar.e("setCurrentState");
                        mVar.g(cVar);
                        z9 = true;
                    }
                }
                if (oVar.N.f1744b.a(cVar2)) {
                    m mVar2 = oVar.N;
                    mVar2.e("setCurrentState");
                    mVar2.g(cVar);
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1601s);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1602t);
        printWriter.print(" mStopped=");
        printWriter.print(this.u);
        if (getApplication() != null) {
            z0.a.a(this).b(str2, printWriter);
        }
        this.f1599q.f1618a.f1638e.v(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public final void l() {
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f1599q.a();
        super.onActivityResult(i10, i11, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1599q.a();
        super.onConfigurationChanged(configuration);
        this.f1599q.f1618a.f1638e.i(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1600r.f(g.b.ON_CREATE);
        z zVar = this.f1599q.f1618a.f1638e;
        zVar.f1669z = false;
        zVar.A = false;
        zVar.G.f1441h = false;
        zVar.u(1);
    }

    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        super.onCreatePanelMenu(i10, menu);
        if (i10 != 0) {
            return true;
        }
        s sVar = this.f1599q;
        getMenuInflater();
        return sVar.f1618a.f1638e.k() | true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1599q.f1618a.f1638e.f1652f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1599q.f1618a.f1638e.l();
        this.f1600r.f(g.b.ON_DESTROY);
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.f1599q.f1618a.f1638e.m();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f1599q.f1618a.f1638e.p();
        }
        if (i10 != 6) {
            return false;
        }
        return this.f1599q.f1618a.f1638e.j();
    }

    public final void onMultiWindowModeChanged(boolean z9) {
        this.f1599q.f1618a.f1638e.n(z9);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f1599q.a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.f1599q.f1618a.f1638e.q();
        }
        super.onPanelClosed(i10, menu);
    }

    public void onPause() {
        super.onPause();
        this.f1602t = false;
        this.f1599q.f1618a.f1638e.u(5);
        this.f1600r.f(g.b.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z9) {
        this.f1599q.f1618a.f1638e.s(z9);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1600r.f(g.b.ON_RESUME);
        z zVar = this.f1599q.f1618a.f1638e;
        zVar.f1669z = false;
        zVar.A = false;
        zVar.G.f1441h = false;
        zVar.u(7);
    }

    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(0, view, menu);
            return this.f1599q.f1618a.f1638e.t() | true;
        }
        super.onPreparePanel(i10, view, menu);
        return true;
    }

    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f1599q.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void onResume() {
        this.f1599q.a();
        super.onResume();
        this.f1602t = true;
        this.f1599q.f1618a.f1638e.y(true);
    }

    public void onStart() {
        this.f1599q.a();
        super.onStart();
        this.u = false;
        if (!this.f1601s) {
            this.f1601s = true;
            z zVar = this.f1599q.f1618a.f1638e;
            zVar.f1669z = false;
            zVar.A = false;
            zVar.G.f1441h = false;
            zVar.u(4);
        }
        this.f1599q.f1618a.f1638e.y(true);
        this.f1600r.f(g.b.ON_START);
        z zVar2 = this.f1599q.f1618a.f1638e;
        zVar2.f1669z = false;
        zVar2.A = false;
        zVar2.G.f1441h = false;
        zVar2.u(5);
    }

    public final void onStateNotSaved() {
        this.f1599q.a();
    }

    public void onStop() {
        super.onStop();
        this.u = true;
        do {
        } while (x(w()));
        z zVar = this.f1599q.f1618a.f1638e;
        zVar.A = true;
        zVar.G.f1441h = true;
        zVar.u(4);
        this.f1600r.f(g.b.ON_STOP);
    }

    public final z w() {
        return this.f1599q.f1618a.f1638e;
    }

    @Deprecated
    public void y() {
        invalidateOptionsMenu();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1599q.f1618a.f1638e.f1652f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
