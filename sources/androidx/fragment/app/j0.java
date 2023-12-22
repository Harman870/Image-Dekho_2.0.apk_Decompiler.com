package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

public final class j0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f1521a;

    public j0(Rect rect) {
        this.f1521a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f1521a;
    }
}
