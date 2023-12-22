package i3;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzax;
import java.lang.Thread;
import java.util.concurrent.CopyOnWriteArrayList;
import r3.o;

@SuppressLint({"StaticFieldLeak"})
public final class t {

    /* renamed from: f  reason: collision with root package name */
    public static volatile t f7161f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7162a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f7163b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final q f7164c = new q(this);

    /* renamed from: d  reason: collision with root package name */
    public volatile zzax f7165d;

    /* renamed from: e  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f7166e;

    public t(Context context) {
        Context applicationContext = context.getApplicationContext();
        o.h(applicationContext);
        this.f7162a = applicationContext;
        new k();
    }

    public static void a() {
        if (!(Thread.currentThread() instanceof s)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
