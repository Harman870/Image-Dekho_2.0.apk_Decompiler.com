package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;

public final class v implements b.C0015b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2146a;

    public v(RecyclerView recyclerView) {
        this.f2146a = recyclerView;
    }

    public final int a() {
        return this.f2146a.getChildCount();
    }

    public final void b(int i10) {
        View childAt = this.f2146a.getChildAt(i10);
        if (childAt != null) {
            RecyclerView recyclerView = this.f2146a;
            recyclerView.getClass();
            RecyclerView.I(childAt);
            RecyclerView.d dVar = recyclerView.k;
            childAt.clearAnimation();
        }
        this.f2146a.removeViewAt(i10);
    }
}
