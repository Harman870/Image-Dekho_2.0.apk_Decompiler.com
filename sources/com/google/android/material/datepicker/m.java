package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class m extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f3144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3145b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f3146c;

    public m(i iVar, y yVar, MaterialButton materialButton) {
        this.f3146c = iVar;
        this.f3144a = yVar;
        this.f3145b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f3145b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        LinearLayoutManager c02 = this.f3146c.c0();
        if (i10 < 0) {
            i12 = c02.I0();
        } else {
            i12 = c02.J0();
        }
        i iVar = this.f3146c;
        Calendar c10 = e0.c(this.f3144a.f3179c.f3088a.f3162a);
        c10.add(2, i12);
        iVar.Y = new v(c10);
        MaterialButton materialButton = this.f3145b;
        Calendar c11 = e0.c(this.f3144a.f3179c.f3088a.f3162a);
        c11.add(2, i12);
        c11.set(5, 1);
        Calendar c12 = e0.c(c11);
        c12.get(2);
        c12.get(1);
        c12.getMaximum(7);
        c12.getActualMaximum(5);
        c12.getTimeInMillis();
        materialButton.setText(e0.b("yMMMM", Locale.getDefault()).format(new Date(c12.getTimeInMillis())));
    }
}
