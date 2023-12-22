package com.google.android.material.datepicker;

import android.view.View;
import h0.q;
import h0.s0;

public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3159c;

    public r(int i10, View view, int i11) {
        this.f3157a = i10;
        this.f3158b = view;
        this.f3159c = i11;
    }

    public final s0 a(View view, s0 s0Var) {
        int i10 = s0Var.a(7).f5b;
        if (this.f3157a >= 0) {
            this.f3158b.getLayoutParams().height = this.f3157a + i10;
            View view2 = this.f3158b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f3158b;
        view3.setPadding(view3.getPaddingLeft(), this.f3159c + i10, this.f3158b.getPaddingRight(), this.f3158b.getPaddingBottom());
        return s0Var;
    }
}
