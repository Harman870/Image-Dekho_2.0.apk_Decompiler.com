package o7;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import x8.f;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f10597a = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        f.f(runnable, "r");
        String format = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f10597a.incrementAndGet())}, 2));
        f.e(format, "format(locale, format, *args)");
        return new Thread(runnable, format);
    }
}
