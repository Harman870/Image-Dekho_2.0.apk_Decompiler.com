package p9;

import java.io.IOException;
import k9.b;

public final class e extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10740c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f10741d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, Object[] objArr, int i10, int i11) {
        super("OkHttp %s stream %d", objArr);
        this.f10741d = fVar;
        this.f10739b = i10;
        this.f10740c = i11;
    }

    public final void a() {
        try {
            f fVar = this.f10741d;
            fVar.u.t(this.f10739b, this.f10740c);
        } catch (IOException e10) {
            this.f10741d.a(2, 2, e10);
        }
    }
}
