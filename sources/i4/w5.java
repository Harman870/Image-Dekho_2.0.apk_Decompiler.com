package i4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class w5 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7760a = Logger.getLogger(w5.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f7761b = new AtomicBoolean(false);

    public static boolean a() {
        return f7761b.get();
    }
}
