package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class u extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public r f2144c;

    /* renamed from: d  reason: collision with root package name */
    public q f2145d;

    public static int c(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public final int[] a(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.e()) {
            iArr[0] = c(view, d(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.f()) {
            iArr[1] = c(view, e(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final s d(RecyclerView.l lVar) {
        q qVar = this.f2145d;
        if (qVar == null || qVar.f2140a != lVar) {
            this.f2145d = new q(lVar);
        }
        return this.f2145d;
    }

    public final s e(RecyclerView.l lVar) {
        r rVar = this.f2144c;
        if (rVar == null || rVar.f2140a != lVar) {
            this.f2144c = new r(lVar);
        }
        return this.f2144c;
    }
}
