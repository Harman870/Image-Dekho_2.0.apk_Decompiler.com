package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.f;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;

public final class g implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t0.b f1477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1478b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1479c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m.a f1480d;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            gVar.f1478b.endViewTransition(gVar.f1479c);
            g.this.f1480d.a();
        }
    }

    public g(View view, ViewGroup viewGroup, m.a aVar, t0.b bVar) {
        this.f1477a = bVar;
        this.f1478b = viewGroup;
        this.f1479c = view;
        this.f1480d = aVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1478b.post(new a());
        if (y.I(2)) {
            StringBuilder g10 = f.g("Animation from operation ");
            g10.append(this.f1477a);
            g10.append(" has ended.");
            Log.v("FragmentManager", g10.toString());
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (y.I(2)) {
            StringBuilder g10 = f.g("Animation from operation ");
            g10.append(this.f1477a);
            g10.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", g10.toString());
        }
    }
}
