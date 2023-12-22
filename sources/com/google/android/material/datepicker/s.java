package com.google.android.material.datepicker;

import android.view.View;

public final class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f3160a;

    public s(q qVar) {
        this.f3160a = qVar;
    }

    public final void onClick(View view) {
        q qVar = this.f3160a;
        qVar.T0.setEnabled(qVar.e0().l());
        this.f3160a.R0.toggle();
        q qVar2 = this.f3160a;
        qVar2.j0(qVar2.R0);
        this.f3160a.i0();
    }
}
