package k6;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n.a;

@SuppressLint({"RestrictedApi"})
public final class l<V> extends n.a<V> implements ScheduledFuture<V> {

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledFuture<?> f9101h;

    public class a implements b<V> {
        public a() {
        }

        public final void a(Exception exc) {
            l lVar = l.this;
            lVar.getClass();
            if (n.a.f9456f.b(lVar, (Object) null, new a.c(exc))) {
                n.a.c(lVar);
            }
        }
    }

    public interface b<T> {
    }

    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public l(c<V> cVar) {
        this.f9101h = cVar.a(new a());
    }

    public final void b() {
        boolean z9;
        ScheduledFuture<?> scheduledFuture = this.f9101h;
        Object obj = this.f9458a;
        if (!(obj instanceof a.b) || !((a.b) obj).f9463a) {
            z9 = false;
        } else {
            z9 = true;
        }
        scheduledFuture.cancel(z9);
    }

    public final int compareTo(Object obj) {
        return this.f9101h.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f9101h.getDelay(timeUnit);
    }
}
