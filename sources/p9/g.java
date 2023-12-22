package p9;

import java.io.IOException;
import k9.b;

public final class g extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10780b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, Object... objArr) {
        super("OkHttp %s ping", objArr);
        this.f10780b = fVar;
    }

    public final void a() {
        f fVar = this.f10780b;
        fVar.getClass();
        try {
            fVar.u.s(2, 0, false);
        } catch (IOException e10) {
            fVar.a(2, 2, e10);
        }
    }
}
