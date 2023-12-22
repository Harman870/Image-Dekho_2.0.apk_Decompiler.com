package p9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k9.b;

public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10781b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f10782c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f10783d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f fVar, Object[] objArr, int i10, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f10783d = fVar;
        this.f10781b = i10;
        this.f10782c = arrayList;
    }

    public final void a() {
        this.f10783d.f10752j.getClass();
        try {
            this.f10783d.u.t(this.f10781b, 6);
            synchronized (this.f10783d) {
                this.f10783d.w.remove(Integer.valueOf(this.f10781b));
            }
        } catch (IOException unused) {
        }
    }
}
