package e9;

import androidx.activity.f;
import o8.h;
import w8.l;

public final class l0 extends d {

    /* renamed from: a  reason: collision with root package name */
    public final l<Throwable, h> f6249a;

    public l0(l<? super Throwable, h> lVar) {
        this.f6249a = lVar;
    }

    public final void a(Throwable th) {
        this.f6249a.invoke(th);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return h.f10610a;
    }

    public final String toString() {
        StringBuilder g10 = f.g("InvokeOnCancel[");
        g10.append(this.f6249a.getClass().getSimpleName());
        g10.append('@');
        g10.append(t.c(this));
        g10.append(']');
        return g10.toString();
    }
}
