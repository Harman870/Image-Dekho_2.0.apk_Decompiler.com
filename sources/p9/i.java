package p9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k9.b;

public final class i extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10784b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f10785c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f10786d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(f fVar, Object[] objArr, int i10, ArrayList arrayList, boolean z9) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f10786d = fVar;
        this.f10784b = i10;
        this.f10785c = arrayList;
    }

    public final void a() {
        this.f10786d.f10752j.getClass();
        try {
            this.f10786d.u.t(this.f10784b, 6);
            synchronized (this.f10786d) {
                this.f10786d.w.remove(Integer.valueOf(this.f10784b));
            }
        } catch (IOException unused) {
        }
    }
}
