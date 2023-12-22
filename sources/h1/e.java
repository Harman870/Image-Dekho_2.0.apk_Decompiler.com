package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6814a;

    public e(d dVar) {
        this.f6814a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f6814a.f6806e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).a(this.f6814a);
        }
    }

    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f6814a.f6806e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).b(this.f6814a);
        }
    }
}
