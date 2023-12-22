package h1;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f6801a;

    public b(c cVar) {
        this.f6801a = cVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.f6801a.a(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.f6801a.b(drawable);
    }
}
