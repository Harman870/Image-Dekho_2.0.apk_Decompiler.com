package e9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6250b = AtomicIntegerFieldUpdater.newUpdater(m.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f6251a;

    public m(Throwable th, boolean z9) {
        this.f6251a = th;
        this._handled = z9 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f6251a + ']';
    }
}
