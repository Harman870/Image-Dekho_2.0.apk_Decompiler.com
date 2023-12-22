package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

public final class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f3148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f3149b;

    public o(i iVar, y yVar) {
        this.f3149b = iVar;
        this.f3148a = yVar;
    }

    public final void onClick(View view) {
        int I0 = this.f3149b.c0().I0() + 1;
        if (I0 < this.f3149b.f3133q0.getAdapter().a()) {
            i iVar = this.f3149b;
            Calendar c10 = e0.c(this.f3148a.f3179c.f3088a.f3162a);
            c10.add(2, I0);
            iVar.e0(new v(c10));
        }
    }
}
