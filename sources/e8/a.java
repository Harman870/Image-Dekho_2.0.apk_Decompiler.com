package e8;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6214a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final C0080a f6215b = new C0080a();

    /* renamed from: e8.a$a  reason: collision with other inner class name */
    public static class C0080a extends a {
        public final float a(float f10) {
            return f10;
        }

        public final float b(float f10) {
            return f10;
        }
    }

    public static class b extends a {

        /* renamed from: c  reason: collision with root package name */
        public final AccelerateInterpolator f6216c = new AccelerateInterpolator(3.0f);

        /* renamed from: d  reason: collision with root package name */
        public final DecelerateInterpolator f6217d = new DecelerateInterpolator(3.0f);

        public final float a(float f10) {
            return this.f6216c.getInterpolation(f10);
        }

        public final float b(float f10) {
            return this.f6217d.getInterpolation(f10);
        }

        public final float c(float f10) {
            return 1.0f / (b(f10) + (1.0f - a(f10)));
        }
    }

    public abstract float a(float f10);

    public abstract float b(float f10);

    public float c(float f10) {
        return 1.0f;
    }
}
