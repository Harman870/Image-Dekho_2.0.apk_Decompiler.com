package d;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l1;
import d.a;
import d.i;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class w extends a {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f5975a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f5976b;

    /* renamed from: c  reason: collision with root package name */
    public final e f5977c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5978d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5979e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5980f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<a.b> f5981g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final a f5982h = new a();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            f fVar;
            w wVar = w.this;
            Menu r4 = wVar.r();
            if (r4 instanceof f) {
                fVar = (f) r4;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.w();
            }
            try {
                r4.clear();
                if (!wVar.f5976b.onCreatePanelMenu(0, r4) || !wVar.f5976b.onPreparePanel(0, (View) null, r4)) {
                    r4.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.v();
                }
            }
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }
    }

    public final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5985a;

        public c() {
        }

        public final void a(f fVar, boolean z9) {
            if (!this.f5985a) {
                this.f5985a = true;
                w.this.f5975a.i();
                w.this.f5976b.onPanelClosed(108, fVar);
                this.f5985a = false;
            }
        }

        public final boolean b(f fVar) {
            w.this.f5976b.onMenuOpened(108, fVar);
            return true;
        }
    }

    public final class d implements f.a {
        public d() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        public final void b(f fVar) {
            if (w.this.f5975a.a()) {
                w.this.f5976b.onPanelClosed(108, fVar);
            } else if (w.this.f5976b.onPreparePanel(0, (View) null, fVar)) {
                w.this.f5976b.onMenuOpened(108, fVar);
            }
        }
    }

    public class e implements i.c {
        public e() {
        }
    }

    public w(Toolbar toolbar, CharSequence charSequence, i.C0075i iVar) {
        b bVar = new b();
        toolbar.getClass();
        l1 l1Var = new l1(toolbar, false);
        this.f5975a = l1Var;
        iVar.getClass();
        this.f5976b = iVar;
        l1Var.f859l = iVar;
        toolbar.setOnMenuItemClickListener(bVar);
        l1Var.setWindowTitle(charSequence);
        this.f5977c = new e();
    }

    public final boolean a() {
        return this.f5975a.e();
    }

    public final boolean b() {
        if (!this.f5975a.l()) {
            return false;
        }
        this.f5975a.collapseActionView();
        return true;
    }

    public final void c(boolean z9) {
        if (z9 != this.f5980f) {
            this.f5980f = z9;
            int size = this.f5981g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f5981g.get(i10).a();
            }
        }
    }

    public final int d() {
        return this.f5975a.f850b;
    }

    public final Context e() {
        return this.f5975a.b();
    }

    public final boolean f() {
        this.f5975a.f849a.removeCallbacks(this.f5982h);
        Toolbar toolbar = this.f5975a.f849a;
        a aVar = this.f5982h;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.m(toolbar, aVar);
        return true;
    }

    public final void g() {
    }

    public final void h() {
        this.f5975a.f849a.removeCallbacks(this.f5982h);
    }

    public final boolean i(int i10, KeyEvent keyEvent) {
        Menu r4 = r();
        if (r4 == null) {
            return false;
        }
        boolean z9 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z9 = false;
        }
        r4.setQwertyMode(z9);
        return r4.performShortcut(i10, keyEvent, 0);
    }

    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    public final boolean k() {
        return this.f5975a.f();
    }

    public final void l(boolean z9) {
    }

    public final void m(int i10) {
        this.f5975a.q(i10);
    }

    public final void n(f.b bVar) {
        this.f5975a.v(bVar);
    }

    public final void o(boolean z9) {
    }

    public final void p(CharSequence charSequence) {
        this.f5975a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        if (!this.f5979e) {
            l1 l1Var = this.f5975a;
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = l1Var.f849a;
            toolbar.N = cVar;
            toolbar.O = dVar;
            ActionMenuView actionMenuView = toolbar.f641a;
            if (actionMenuView != null) {
                actionMenuView.u = cVar;
                actionMenuView.f573v = dVar;
            }
            this.f5979e = true;
        }
        return this.f5975a.f849a.getMenu();
    }
}
