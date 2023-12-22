package w2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import y2.b;

public final class o implements b<Executor> {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f12718a = new o();
    }

    public final Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
