package c5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class a implements TypeEvaluator<C0023d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f2459b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0023d f2460a = new C0023d();

        public final Object evaluate(float f10, Object obj, Object obj2) {
            C0023d dVar = (C0023d) obj;
            C0023d dVar2 = (C0023d) obj2;
            C0023d dVar3 = this.f2460a;
            float f11 = dVar.f2463a;
            float f12 = 1.0f - f10;
            float f13 = (dVar2.f2463a * f10) + (f11 * f12);
            float f14 = dVar.f2464b;
            float f15 = dVar2.f2464b * f10;
            float f16 = dVar.f2465c;
            float f17 = f10 * dVar2.f2465c;
            dVar3.f2463a = f13;
            dVar3.f2464b = f15 + (f14 * f12);
            dVar3.f2465c = f17 + (f12 * f16);
            return dVar3;
        }
    }

    public static class b extends Property<d, C0023d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2461a = new b();

        public b() {
            super(C0023d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((d) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setRevealInfo((C0023d) obj2);
        }
    }

    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f2462a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((d) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: c5.d$d  reason: collision with other inner class name */
    public static class C0023d {

        /* renamed from: a  reason: collision with root package name */
        public float f2463a;

        /* renamed from: b  reason: collision with root package name */
        public float f2464b;

        /* renamed from: c  reason: collision with root package name */
        public float f2465c;

        public C0023d() {
        }

        public C0023d(float f10, float f11, float f12) {
            this.f2463a = f10;
            this.f2464b = f11;
            this.f2465c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0023d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(C0023d dVar);
}
