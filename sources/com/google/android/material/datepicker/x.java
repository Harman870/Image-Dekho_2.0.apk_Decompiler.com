package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import java.util.Iterator;

public final class x implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f3178b;

    public x(y yVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f3178b = yVar;
        this.f3177a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean z9;
        w a10 = this.f3177a.getAdapter();
        if (i10 < a10.b() || i10 > (a10.b() + a10.f3171a.f3166e) - 1) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            i.e eVar = this.f3178b.f3182f;
            i.d dVar = (i.d) eVar;
            if (i.this.W.f3090c.k(this.f3177a.getAdapter().getItem(i10).longValue())) {
                i.this.V.d();
                Iterator<z<S>> it = i.this.T.iterator();
                while (it.hasNext()) {
                    it.next().a(i.this.V.o());
                }
                i.this.f3133q0.getAdapter().f1855a.b();
                RecyclerView recyclerView = i.this.p0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1855a.b();
                }
            }
        }
    }
}
