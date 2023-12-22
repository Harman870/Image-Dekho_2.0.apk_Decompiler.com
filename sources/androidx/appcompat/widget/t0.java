package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public final class t0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u0 f956a;

    public t0(u0 u0Var) {
        this.f956a = u0Var;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        p0 p0Var;
        if (i10 != -1 && (p0Var = this.f956a.f960c) != null) {
            p0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
