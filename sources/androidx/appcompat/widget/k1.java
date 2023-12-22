package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import h.a;

public final class k1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l1 f842b;

    public k1(l1 l1Var) {
        this.f842b = l1Var;
        this.f841a = new a(l1Var.f849a.getContext(), l1Var.f857i);
    }

    public final void onClick(View view) {
        l1 l1Var = this.f842b;
        Window.Callback callback = l1Var.f859l;
        if (callback != null && l1Var.f860m) {
            callback.onMenuItemSelected(0, this.f841a);
        }
    }
}
