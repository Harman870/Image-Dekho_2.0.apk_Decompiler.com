package s4;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import w0.b;
import w0.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f11855a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final b f11856b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final w0.a f11857c = new w0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final c f11858d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f11859e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : com.ironsource.adapters.ironsource.a.e(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }
}
