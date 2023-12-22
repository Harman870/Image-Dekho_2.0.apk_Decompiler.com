package g2;

import android.graphics.drawable.Drawable;
import f2.d;
import j2.l;

public abstract class c<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f6560a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6561b;

    /* renamed from: c  reason: collision with root package name */
    public d f6562c;

    public c() {
        if (l.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f6560a = Integer.MIN_VALUE;
            this.f6561b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void b(d dVar) {
        this.f6562c = dVar;
    }

    public final void c(Drawable drawable) {
    }

    public final void d(Drawable drawable) {
    }

    public final void e(f fVar) {
        fVar.b(this.f6560a, this.f6561b);
    }

    public final void f(f fVar) {
    }

    public final d g() {
        return this.f6562c;
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}
