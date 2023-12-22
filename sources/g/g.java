package g;

import android.view.View;
import android.view.animation.Interpolator;
import c6.b;
import h0.l0;
import h0.m0;
import java.util.ArrayList;
import java.util.Iterator;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l0> f6445a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f6446b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f6447c;

    /* renamed from: d  reason: collision with root package name */
    public m0 f6448d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6449e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6450f = new a();

    public class a extends b {
        public boolean w = false;

        /* renamed from: x  reason: collision with root package name */
        public int f6451x = 0;

        public a() {
        }

        public final void a() {
            int i10 = this.f6451x + 1;
            this.f6451x = i10;
            if (i10 == g.this.f6445a.size()) {
                m0 m0Var = g.this.f6448d;
                if (m0Var != null) {
                    m0Var.a();
                }
                this.f6451x = 0;
                this.w = false;
                g.this.f6449e = false;
            }
        }

        public final void k() {
            if (!this.w) {
                this.w = true;
                m0 m0Var = g.this.f6448d;
                if (m0Var != null) {
                    m0Var.k();
                }
            }
        }
    }

    public final void a() {
        if (this.f6449e) {
            Iterator<l0> it = this.f6445a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f6449e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f6449e) {
            Iterator<l0> it = this.f6445a.iterator();
            while (it.hasNext()) {
                l0 next = it.next();
                long j10 = this.f6446b;
                if (j10 >= 0) {
                    next.c(j10);
                }
                Interpolator interpolator = this.f6447c;
                if (!(interpolator == null || (view = next.f6707a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f6448d != null) {
                    next.d(this.f6450f);
                }
                View view2 = next.f6707a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f6449e = true;
        }
    }
}
