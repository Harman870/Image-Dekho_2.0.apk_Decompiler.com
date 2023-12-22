package k6;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import l2.b;

public final class a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f9061e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f9062a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f9063b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9064c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f9065d;

    public a(String str, int i10, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f9063b = str;
        this.f9064c = i10;
        this.f9065d = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = f9061e.newThread(new b(this, 1, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f9063b, Long.valueOf(this.f9062a.getAndIncrement())}));
        return newThread;
    }
}
