package p9;

import java.io.IOException;
import k9.b;
import p9.t;
import t9.e;

public final class j extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10787b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f10788c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10789d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f10790e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(f fVar, Object[] objArr, int i10, e eVar, int i11, boolean z9) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f10790e = fVar;
        this.f10787b = i10;
        this.f10788c = eVar;
        this.f10789d = i11;
    }

    public final void a() {
        try {
            t.a aVar = this.f10790e.f10752j;
            e eVar = this.f10788c;
            int i10 = this.f10789d;
            aVar.getClass();
            eVar.skip((long) i10);
            this.f10790e.u.t(this.f10787b, 6);
            synchronized (this.f10790e) {
                this.f10790e.w.remove(Integer.valueOf(this.f10787b));
            }
        } catch (IOException unused) {
        }
    }
}
