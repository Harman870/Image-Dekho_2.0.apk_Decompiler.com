package c3;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;
import t2.d;

@AutoValue
public abstract class e {

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: c3.e$a$a  reason: collision with other inner class name */
        public static abstract class C0022a {
        }

        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract f3.a a();

    public final long b(d dVar, long j10, int i10) {
        long j11;
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long a11 = aVar.a();
        int i11 = i10 - 1;
        if (a11 > 1) {
            j11 = a11;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i11) * ((double) a11) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j11 * ((long) i11))))), a10), aVar.c());
    }

    public abstract Map<d, a> c();
}
