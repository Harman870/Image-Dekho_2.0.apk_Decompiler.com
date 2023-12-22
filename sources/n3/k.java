package n3;

import n4.l6;
import q3.w;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9544b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f9543a = i10;
        this.f9544b = obj;
    }

    public final void run() {
        switch (this.f9543a) {
            case 0:
                ((p) this.f9544b).a(2, "Service disconnected");
                return;
            case 1:
                ((w) this.f9544b).h();
                return;
            default:
                ((l6) this.f9544b).f9926j = null;
                return;
        }
    }
}
