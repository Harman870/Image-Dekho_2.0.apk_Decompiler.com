package g2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class e<Z> extends h<ImageView, Z> {

    /* renamed from: c  reason: collision with root package name */
    public Animatable f6563c;

    public e(ImageView imageView) {
        super(imageView);
    }

    public final void a(Object obj) {
        i(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f6563c = animatable;
            animatable.start();
            return;
        }
        this.f6563c = null;
    }

    public final void c(Drawable drawable) {
        i((Object) null);
        this.f6563c = null;
        ((ImageView) this.f6564a).setImageDrawable(drawable);
    }

    public final void d(Drawable drawable) {
        i((Object) null);
        this.f6563c = null;
        ((ImageView) this.f6564a).setImageDrawable(drawable);
    }

    public final void h(Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.f6563c;
        if (animatable != null) {
            animatable.stop();
        }
        i((Object) null);
        this.f6563c = null;
        ((ImageView) this.f6564a).setImageDrawable(drawable);
    }

    public abstract void i(Z z9);

    public final void onStart() {
        Animatable animatable = this.f6563c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.f6563c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
