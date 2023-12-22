package com.google.android.material.datepicker;

import android.view.View;

public final class f0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3121a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f3122b;

    public f0(g0 g0Var, int i10) {
        this.f3122b = g0Var;
        this.f3121a = i10;
    }

    public final void onClick(View view) {
        v a10 = v.a(this.f3121a, this.f3122b.f3127c.Y.f3163b);
        a aVar = this.f3122b.f3127c.W;
        if (a10.f3162a.compareTo(aVar.f3088a.f3162a) < 0) {
            a10 = aVar.f3088a;
        } else {
            if (a10.f3162a.compareTo(aVar.f3089b.f3162a) > 0) {
                a10 = aVar.f3089b;
            }
        }
        this.f3122b.f3127c.e0(a10);
        this.f3122b.f3127c.f0(1);
    }
}
