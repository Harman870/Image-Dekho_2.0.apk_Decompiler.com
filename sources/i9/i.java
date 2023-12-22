package i9;

import androidx.activity.f;
import e9.t;

public final class i extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f7972c;

    public i(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f7972c = runnable;
    }

    public final void run() {
        try {
            this.f7972c.run();
        } finally {
            this.f7971b.a();
        }
    }

    public final String toString() {
        StringBuilder g10 = f.g("Task[");
        g10.append(this.f7972c.getClass().getSimpleName());
        g10.append('@');
        g10.append(t.c(this.f7972c));
        g10.append(", ");
        g10.append(this.f7970a);
        g10.append(", ");
        g10.append(this.f7971b);
        g10.append(']');
        return g10.toString();
    }
}
