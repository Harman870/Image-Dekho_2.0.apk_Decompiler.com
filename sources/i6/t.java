package i6;

import android.os.Looper;
import i4.i7;
import java.util.concurrent.Executor;

public final class t implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final t f7924b = new t();

    /* renamed from: a  reason: collision with root package name */
    public final i7 f7925a = new i7(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f7925a.post(runnable);
    }
}
