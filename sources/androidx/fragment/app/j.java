package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f1518a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1519b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f1520c;

    public j(o0 o0Var, View view, Rect rect) {
        this.f1518a = o0Var;
        this.f1519b = view;
        this.f1520c = rect;
    }

    public final void run() {
        o0 o0Var = this.f1518a;
        View view = this.f1519b;
        Rect rect = this.f1520c;
        o0Var.getClass();
        o0.g(view, rect);
    }
}
