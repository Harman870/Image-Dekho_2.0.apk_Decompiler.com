package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1454c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t0.b f1455d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m.a f1456e;

    public e(ViewGroup viewGroup, View view, boolean z9, t0.b bVar, m.a aVar) {
        this.f1452a = viewGroup;
        this.f1453b = view;
        this.f1454c = z9;
        this.f1455d = bVar;
        this.f1456e = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1452a.endViewTransition(this.f1453b);
        if (this.f1454c) {
            w0.a(this.f1455d.f1628a, this.f1453b);
        }
        this.f1456e.a();
        if (y.I(2)) {
            StringBuilder g10 = f.g("Animator from operation ");
            g10.append(this.f1455d);
            g10.append(" has ended.");
            Log.v("FragmentManager", g10.toString());
        }
    }
}
