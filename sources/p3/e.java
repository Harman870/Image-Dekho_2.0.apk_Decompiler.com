package p3;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p3.h;

public abstract class e<R extends h> {

    public interface a {
        void a(Status status);
    }

    public abstract R await(long j10, TimeUnit timeUnit);
}
