package f9;

import android.os.Handler;
import android.os.Looper;
import e9.a0;
import e9.s0;
import h9.j;
import i9.c;
import java.util.concurrent.CancellationException;
import q8.f;

public final class a extends b {
    private volatile a _immediate;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6389b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6390c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6391d;

    /* renamed from: e  reason: collision with root package name */
    public final a f6392e;

    public a(Handler handler) {
        this(handler, (String) null, false);
    }

    public final void L(f fVar, Runnable runnable) {
        if (!this.f6389b.post(runnable)) {
            y3.a.f(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
            a0.f6219b.L(fVar, runnable);
        }
    }

    public final boolean M() {
        return !this.f6391d || !x8.f.a(Looper.myLooper(), this.f6389b.getLooper());
    }

    public final s0 N() {
        return this.f6392e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f6389b == this.f6389b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6389b);
    }

    public final String toString() {
        String str;
        s0 s0Var;
        c cVar = a0.f6218a;
        s0 s0Var2 = j.f7066a;
        if (this == s0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                s0Var = s0Var2.N();
            } catch (UnsupportedOperationException unused) {
                s0Var = null;
            }
            if (this == s0Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f6390c;
        if (str2 == null) {
            str2 = this.f6389b.toString();
        }
        if (this.f6391d) {
            return x8.f.j(".immediate", str2);
        }
        return str2;
    }

    public a(Handler handler, String str, boolean z9) {
        this.f6389b = handler;
        this.f6390c = str;
        this.f6391d = z9;
        this._immediate = z9 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f6392e = aVar;
    }
}
