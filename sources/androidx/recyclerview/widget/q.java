package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class q extends s {
    public q(RecyclerView.l lVar) {
        super(lVar);
    }

    public final int b(View view) {
        this.f2140a.getClass();
        return view.getRight() + ((RecyclerView.m) view.getLayoutParams()).f1887b.right + ((RecyclerView.m) view.getLayoutParams()).rightMargin;
    }

    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2140a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1887b;
        return view.getMeasuredWidth() + rect.left + rect.right + mVar.leftMargin + mVar.rightMargin;
    }

    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f2140a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1887b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + mVar.topMargin + mVar.bottomMargin;
    }

    public final int e(View view) {
        this.f2140a.getClass();
        return (view.getLeft() - ((RecyclerView.m) view.getLayoutParams()).f1887b.left) - ((RecyclerView.m) view.getLayoutParams()).leftMargin;
    }

    public final int f() {
        return this.f2140a.f1878n;
    }

    public final int g() {
        RecyclerView.l lVar = this.f2140a;
        return lVar.f1878n - lVar.E();
    }

    public final int h() {
        return this.f2140a.E();
    }

    public final int i() {
        return this.f2140a.f1876l;
    }

    public final int j() {
        return this.f2140a.f1877m;
    }

    public final int k() {
        return this.f2140a.D();
    }

    public final int l() {
        RecyclerView.l lVar = this.f2140a;
        return (lVar.f1878n - lVar.D()) - this.f2140a.E();
    }

    public final int m(View view) {
        this.f2140a.J(view, this.f2142c);
        return this.f2142c.right;
    }

    public final int n(View view) {
        this.f2140a.J(view, this.f2142c);
        return this.f2142c.left;
    }

    public final void o(int i10) {
        this.f2140a.N(i10);
    }
}
