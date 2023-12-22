package com.google.android.material.datepicker;

import android.view.View;

public final class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f3147a;

    public n(i iVar) {
        this.f3147a = iVar;
    }

    public final void onClick(View view) {
        i iVar = this.f3147a;
        int i10 = iVar.Z;
        if (i10 == 2) {
            iVar.f0(1);
        } else if (i10 == 1) {
            iVar.f0(2);
        }
    }
}
