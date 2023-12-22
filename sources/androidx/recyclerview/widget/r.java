package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class r extends s {
    public r(RecyclerView.l lVar) {
        super(lVar);
    }

    public final int b(View view) {
        this.f2140a.getClass();
        return view.getBottom() + ((RecyclerView.m) view.getLayoutParams()).f1887b.bottom + ((RecyclerView.m) view.getLayoutParams()).bottomMargin;
    }

    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2140a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1887b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + mVar.topMargin + mVar.bottomMargin;
    }

    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2140a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1887b;
        return view.getMeasuredWidth() + rect.left + rect.right + mVar.leftMargin + mVar.rightMargin;
    }

    public final int e(View view) {
        this.f2140a.getClass();
        return (view.getTop() - ((RecyclerView.m) view.getLayoutParams()).f1887b.top) - ((RecyclerView.m) view.getLayoutParams()).topMargin;
    }

    public final int f() {
        return this.f2140a.f1879o;
    }

    public final int g() {
        RecyclerView.l lVar = this.f2140a;
        return lVar.f1879o - lVar.C();
    }

    public final int h() {
        return this.f2140a.C();
    }

    public final int i() {
        return this.f2140a.f1877m;
    }

    public final int j() {
        return this.f2140a.f1876l;
    }

    public final int k() {
        return this.f2140a.F();
    }

    public final int l() {
        RecyclerView.l lVar = this.f2140a;
        return (lVar.f1879o - lVar.F()) - this.f2140a.C();
    }

    public final int m(View view) {
        this.f2140a.J(view, this.f2142c);
        return this.f2142c.bottom;
    }

    public final int n(View view) {
        this.f2140a.J(view, this.f2142c);
        return this.f2142c.top;
    }

    public final void o(int i10) {
        this.f2140a.O(i10);
    }
}
