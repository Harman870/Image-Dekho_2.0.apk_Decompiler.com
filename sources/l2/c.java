package l2;

import v5.o;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9211b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f9210a = i10;
        this.f9211b = obj;
    }

    public final void run() {
        switch (this.f9210a) {
            case 0:
                d dVar = d.this;
                if (dVar.N) {
                    c.super.cancel();
                    return;
                } else {
                    dVar.dismiss();
                    return;
                }
            default:
                o oVar = (o) this.f9211b;
                boolean isPopupShowing = oVar.f12551h.isPopupShowing();
                oVar.t(isPopupShowing);
                oVar.f12555m = isPopupShowing;
                return;
        }
    }
}
