package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class l0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f1528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1529b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1530c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1531d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1532e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1533f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k0 f1534g;

    public l0(k0 k0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1534g = k0Var;
        this.f1528a = obj;
        this.f1529b = arrayList;
        this.f1532e = obj2;
        this.f1533f = arrayList2;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f1528a;
        if (obj != null) {
            this.f1534g.t(obj, this.f1529b, (ArrayList<View>) null);
        }
        Object obj2 = this.f1530c;
        if (obj2 != null) {
            this.f1534g.t(obj2, this.f1531d, (ArrayList<View>) null);
        }
        Object obj3 = this.f1532e;
        if (obj3 != null) {
            this.f1534g.t(obj3, this.f1533f, (ArrayList<View>) null);
        }
    }
}
