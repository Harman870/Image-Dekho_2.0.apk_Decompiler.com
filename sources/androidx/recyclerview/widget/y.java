package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class y {
    public static int a(RecyclerView.w wVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z9) {
        if (lVar.w() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return Math.abs(RecyclerView.l.G(view) - RecyclerView.l.G(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int b(RecyclerView.w wVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z9, boolean z10) {
        if (lVar.w() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z10 ? Math.max(0, (wVar.b() - Math.max(RecyclerView.l.G(view), RecyclerView.l.G(view2))) - 1) : Math.max(0, Math.min(RecyclerView.l.G(view), RecyclerView.l.G(view2)));
        if (!z9) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(RecyclerView.l.G(view) - RecyclerView.l.G(view2)) + 1)))) + ((float) (sVar.k() - sVar.e(view))));
    }

    public static int c(RecyclerView.w wVar, s sVar, View view, View view2, RecyclerView.l lVar, boolean z9) {
        if (lVar.w() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return wVar.b();
        }
        return (int) ((((float) (sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(RecyclerView.l.G(view) - RecyclerView.l.G(view2)) + 1))) * ((float) wVar.b()));
    }
}
