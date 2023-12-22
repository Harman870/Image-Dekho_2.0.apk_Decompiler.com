package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import com.imgdkh.app.R;
import h0.l0;
import h0.x;
import java.util.Calendar;
import java.util.WeakHashMap;

public final class y extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final a f3179c;

    /* renamed from: d  reason: collision with root package name */
    public final d<?> f3180d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3181e;

    /* renamed from: f  reason: collision with root package name */
    public final i.e f3182f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3183g;

    public static class a extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f3184t;
        public final MaterialCalendarGridView u;

        public a(LinearLayout linearLayout, boolean z9) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f3184t = textView;
            WeakHashMap<View, l0> weakHashMap = h0.y.f6776a;
            new x().e(textView, Boolean.TRUE);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z9) {
                textView.setVisibility(8);
            }
        }
    }

    public y(ContextThemeWrapper contextThemeWrapper, d dVar, a aVar, f fVar, i.d dVar2) {
        int i10;
        v vVar = aVar.f3088a;
        v vVar2 = aVar.f3089b;
        v vVar3 = aVar.f3091d;
        if (vVar.f3162a.compareTo(vVar3.f3162a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (vVar3.f3162a.compareTo(vVar2.f3162a) <= 0) {
            int i11 = w.f3169g;
            int i12 = i.f3131v0;
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
            if (q.g0(contextThemeWrapper)) {
                i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            } else {
                i10 = 0;
            }
            this.f3183g = dimensionPixelSize + i10;
            this.f3179c = aVar;
            this.f3180d = dVar;
            this.f3181e = fVar;
            this.f3182f = dVar2;
            if (!this.f1855a.a()) {
                this.f1856b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int a() {
        return this.f3179c.f3094g;
    }

    public final long b(int i10) {
        Calendar c10 = e0.c(this.f3179c.f3088a.f3162a);
        c10.add(2, i10);
        return new v(c10).f3162a.getTimeInMillis();
    }

    public final void d(RecyclerView.z zVar, int i10) {
        a aVar = (a) zVar;
        Calendar c10 = e0.c(this.f3179c.f3088a.f3162a);
        c10.add(2, i10);
        v vVar = new v(c10);
        aVar.f3184t.setText(vVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !vVar.equals(materialCalendarGridView.getAdapter().f3171a)) {
            w wVar = new w(vVar, this.f3180d, this.f3179c, this.f3181e);
            materialCalendarGridView.setNumColumns(vVar.f3165d);
            materialCalendarGridView.setAdapter((ListAdapter) wVar);
        } else {
            materialCalendarGridView.invalidate();
            w a10 = materialCalendarGridView.getAdapter();
            for (Long longValue : a10.f3173c) {
                a10.e(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a10.f3172b;
            if (dVar != null) {
                for (Long longValue2 : dVar.n()) {
                    a10.e(materialCalendarGridView, longValue2.longValue());
                }
                a10.f3173c = a10.f3172b.n();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new x(this, materialCalendarGridView));
    }

    public final RecyclerView.z e(RecyclerView recyclerView, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!q.g0(recyclerView.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f3183g));
        return new a(linearLayout, true);
    }
}
