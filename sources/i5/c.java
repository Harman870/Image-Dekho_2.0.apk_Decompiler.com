package i5;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7873a;

    public c(d dVar) {
        this.f7873a = dVar;
    }

    public final boolean onPreDraw() {
        d dVar = this.f7873a;
        float rotation = dVar.f3234v.getRotation();
        if (dVar.f3228o == rotation) {
            return true;
        }
        dVar.f3228o = rotation;
        dVar.p();
        return true;
    }
}
