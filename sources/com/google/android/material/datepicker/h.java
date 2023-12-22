package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

public final class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f3129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f3130b;

    public h(i iVar, y yVar) {
        this.f3130b = iVar;
        this.f3129a = yVar;
    }

    public final void onClick(View view) {
        int J0 = this.f3130b.c0().J0() - 1;
        if (J0 >= 0) {
            i iVar = this.f3130b;
            Calendar c10 = e0.c(this.f3129a.f3179c.f3088a.f3162a);
            c10.add(2, J0);
            iVar.e0(new v(c10));
        }
    }
}
