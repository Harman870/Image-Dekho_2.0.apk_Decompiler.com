package p9;

import java.io.IOException;
import k9.b;
import p9.f;

public final class l extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f10793b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f.C0128f f10794c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(f.C0128f fVar, Object[] objArr, q qVar) {
        super("OkHttp %s stream %d", objArr);
        this.f10794c = fVar;
        this.f10793b = qVar;
    }

    public final void a() {
        try {
            f.this.f10744b.b(this.f10793b);
        } catch (IOException e10) {
            q9.f fVar = q9.f.f11399a;
            StringBuilder g10 = androidx.activity.f.g("Http2Connection.Listener failure for ");
            g10.append(f.this.f10746d);
            fVar.m(4, g10.toString(), e10);
            try {
                this.f10793b.c(2, e10);
            } catch (IOException unused) {
            }
        }
    }
}
