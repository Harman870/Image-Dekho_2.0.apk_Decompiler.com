package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class t extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u f2143q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f2143q = uVar;
    }

    public final void c(View view, RecyclerView.v.a aVar) {
        u uVar = this.f2143q;
        int[] a10 = uVar.a(uVar.f2008a.getLayoutManager(), view);
        int i10 = a10[0];
        int i11 = a10[1];
        int ceil = (int) Math.ceil(((double) h(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2133j;
            aVar.f1914a = i10;
            aVar.f1915b = i11;
            aVar.f1916c = ceil;
            aVar.f1918e = decelerateInterpolator;
            aVar.f1919f = true;
        }
    }

    public final float g(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public final int h(int i10) {
        return Math.min(100, super.h(i10));
    }
}
