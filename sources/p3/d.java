package p3;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import q3.c;
import q3.i;

@Deprecated
public abstract class d {
    @GuardedBy("sAllClients")

    /* renamed from: a  reason: collision with root package name */
    public static final Set<d> f10674a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends c {
    }

    @Deprecated
    public interface b extends i {
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }
}
