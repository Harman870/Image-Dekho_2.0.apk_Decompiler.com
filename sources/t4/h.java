package t4;

import android.view.View;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final View f12018a;

    /* renamed from: b  reason: collision with root package name */
    public int f12019b;

    /* renamed from: c  reason: collision with root package name */
    public int f12020c;

    /* renamed from: d  reason: collision with root package name */
    public int f12021d;

    public h(View view) {
        this.f12018a = view;
    }

    public final void a() {
        View view = this.f12018a;
        int top = this.f12021d - (view.getTop() - this.f12019b);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        view.offsetTopAndBottom(top);
        View view2 = this.f12018a;
        view2.offsetLeftAndRight(0 - (view2.getLeft() - this.f12020c));
    }
}
