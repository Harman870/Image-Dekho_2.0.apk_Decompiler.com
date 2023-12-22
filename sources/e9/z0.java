package e9;

import q8.f;

public final class z0 extends p {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6278b = 0;

    static {
        new z0();
    }

    public final void L(f fVar, Runnable runnable) {
        if (((c1) fVar.get(c1.f6224a)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
