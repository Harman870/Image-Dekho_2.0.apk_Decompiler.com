package e9;

import java.util.concurrent.CancellationException;
import o8.h;
import x8.f;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6244a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6245b;

    /* renamed from: c  reason: collision with root package name */
    public final w8.l<Throwable, h> f6246c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6247d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f6248e;

    public l(Object obj, d dVar, w8.l<? super Throwable, h> lVar, Object obj2, Throwable th) {
        this.f6244a = obj;
        this.f6245b = dVar;
        this.f6246c = lVar;
        this.f6247d = obj2;
        this.f6248e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, d dVar, w8.l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : dVar, (w8.l<? super Throwable, h>) (i10 & 4) != 0 ? null : lVar, (Object) null, (Throwable) (i10 & 16) != 0 ? null : cancellationException);
    }

    public static l a(l lVar, d dVar, CancellationException cancellationException, int i10) {
        Object obj = null;
        Object obj2 = (i10 & 1) != 0 ? lVar.f6244a : null;
        if ((i10 & 2) != 0) {
            dVar = lVar.f6245b;
        }
        d dVar2 = dVar;
        w8.l<Throwable, h> lVar2 = (i10 & 4) != 0 ? lVar.f6246c : null;
        if ((i10 & 8) != 0) {
            obj = lVar.f6247d;
        }
        Object obj3 = obj;
        Throwable th = cancellationException;
        if ((i10 & 16) != 0) {
            th = lVar.f6248e;
        }
        lVar.getClass();
        return new l(obj2, dVar2, (w8.l<? super Throwable, h>) lVar2, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f.a(this.f6244a, lVar.f6244a) && f.a(this.f6245b, lVar.f6245b) && f.a(this.f6246c, lVar.f6246c) && f.a(this.f6247d, lVar.f6247d) && f.a(this.f6248e, lVar.f6248e);
    }

    public final int hashCode() {
        Object obj = this.f6244a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f6245b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        w8.l<Throwable, h> lVar = this.f6246c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f6247d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f6248e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("CompletedContinuation(result=");
        g10.append(this.f6244a);
        g10.append(", cancelHandler=");
        g10.append(this.f6245b);
        g10.append(", onCancellation=");
        g10.append(this.f6246c);
        g10.append(", idempotentResume=");
        g10.append(this.f6247d);
        g10.append(", cancelCause=");
        g10.append(this.f6248e);
        g10.append(')');
        return g10.toString();
    }
}
