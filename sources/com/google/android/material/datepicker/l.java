package com.google.android.material.datepicker;

import android.view.View;
import com.imgdkh.app.R;
import h0.a;
import i0.f;

public final class l extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f3143d;

    public l(i iVar) {
        this.f3143d = iVar;
    }

    public final void d(View view, f fVar) {
        i iVar;
        int i10;
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        if (this.f3143d.u0.getVisibility() == 0) {
            iVar = this.f3143d;
            i10 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            iVar = this.f3143d;
            i10 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        fVar.j(iVar.t(i10));
    }
}
