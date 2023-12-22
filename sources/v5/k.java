package v5;

import android.view.View;

public final /* synthetic */ class k implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12544a;

    public /* synthetic */ k(o oVar) {
        this.f12544a = oVar;
    }

    public final void onFocusChange(View view, boolean z9) {
        o oVar = this.f12544a;
        oVar.f12554l = z9;
        oVar.q();
        if (!z9) {
            oVar.t(false);
            oVar.f12555m = false;
        }
    }
}
