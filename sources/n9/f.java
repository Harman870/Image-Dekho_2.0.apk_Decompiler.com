package n9;

import j9.b0;
import j9.d;
import j9.r;
import j9.x;
import java.util.List;
import javax.annotation.Nullable;
import m9.c;
import m9.i;

public final class f implements r.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<r> f10389a;

    /* renamed from: b  reason: collision with root package name */
    public final i f10390b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final c f10391c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10392d;

    /* renamed from: e  reason: collision with root package name */
    public final x f10393e;

    /* renamed from: f  reason: collision with root package name */
    public final d f10394f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10395g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10396h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10397i;

    /* renamed from: j  reason: collision with root package name */
    public int f10398j;

    public f(List<r> list, i iVar, @Nullable c cVar, int i10, x xVar, d dVar, int i11, int i12, int i13) {
        this.f10389a = list;
        this.f10390b = iVar;
        this.f10391c = cVar;
        this.f10392d = i10;
        this.f10393e = xVar;
        this.f10394f = dVar;
        this.f10395g = i11;
        this.f10396h = i12;
        this.f10397i = i13;
    }

    public final b0 a(x xVar) {
        return b(xVar, this.f10390b, this.f10391c);
    }

    public final b0 b(x xVar, i iVar, @Nullable c cVar) {
        if (this.f10392d < this.f10389a.size()) {
            this.f10398j++;
            c cVar2 = this.f10391c;
            if (cVar2 == null) {
                x xVar2 = xVar;
            } else if (!cVar2.a().j(xVar.f9016a)) {
                StringBuilder g10 = androidx.activity.f.g("network interceptor ");
                g10.append(this.f10389a.get(this.f10392d - 1));
                g10.append(" must retain the same host and port");
                throw new IllegalStateException(g10.toString());
            }
            if (this.f10391c == null || this.f10398j <= 1) {
                List<r> list = this.f10389a;
                int i10 = this.f10392d;
                f fVar = new f(list, iVar, cVar, i10 + 1, xVar, this.f10394f, this.f10395g, this.f10396h, this.f10397i);
                r rVar = list.get(i10);
                b0 a10 = rVar.a(fVar);
                if (cVar != null && this.f10392d + 1 < this.f10389a.size() && fVar.f10398j != 1) {
                    throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
                } else if (a10 == null) {
                    throw new NullPointerException("interceptor " + rVar + " returned null");
                } else if (a10.f8827g != null) {
                    return a10;
                } else {
                    throw new IllegalStateException("interceptor " + rVar + " returned a response with no body");
                }
            } else {
                StringBuilder g11 = androidx.activity.f.g("network interceptor ");
                g11.append(this.f10389a.get(this.f10392d - 1));
                g11.append(" must call proceed() exactly once");
                throw new IllegalStateException(g11.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
