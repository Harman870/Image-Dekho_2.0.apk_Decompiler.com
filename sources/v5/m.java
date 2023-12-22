package v5;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class m implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12546a;

    public /* synthetic */ m(o oVar) {
        this.f12546a = oVar;
    }

    public final void onDismiss() {
        o oVar = this.f12546a;
        oVar.f12555m = true;
        oVar.f12557o = System.currentTimeMillis();
        oVar.t(false);
    }
}
