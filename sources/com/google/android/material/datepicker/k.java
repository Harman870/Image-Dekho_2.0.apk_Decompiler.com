package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.c;
import java.util.Calendar;

public final class k extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3140a = e0.e((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3141b = e0.e((Calendar) null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f3142c;

    public k(i iVar) {
        this.f3142c = iVar;
    }

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof g0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            g0 g0Var = (g0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (c<Long, Long> cVar : this.f3142c.V.j()) {
                cVar.getClass();
            }
        }
    }
}
