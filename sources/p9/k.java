package p9;

import k9.b;

public final class k extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10791b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f10792c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f fVar, Object[] objArr, int i10, int i11) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f10792c = fVar;
        this.f10791b = i10;
    }

    public final void a() {
        this.f10792c.f10752j.getClass();
        synchronized (this.f10792c) {
            this.f10792c.w.remove(Integer.valueOf(this.f10791b));
        }
    }
}
