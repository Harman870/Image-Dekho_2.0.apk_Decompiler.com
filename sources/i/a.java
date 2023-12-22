package i;

import android.os.Looper;
import androidx.activity.result.c;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f7081c;

    /* renamed from: b  reason: collision with root package name */
    public b f7082b = new b();

    public a() {
        super(0);
    }

    public static a A() {
        if (f7081c != null) {
            return f7081c;
        }
        synchronized (a.class) {
            if (f7081c == null) {
                f7081c = new a();
            }
        }
        return f7081c;
    }

    public final void B(Runnable runnable) {
        b bVar = this.f7082b;
        if (bVar.f7084c == null) {
            synchronized (bVar.f7083b) {
                if (bVar.f7084c == null) {
                    bVar.f7084c = b.A(Looper.getMainLooper());
                }
            }
        }
        bVar.f7084c.post(runnable);
    }
}
