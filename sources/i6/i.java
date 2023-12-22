package i6;

import android.os.HandlerThread;
import c4.f;
import i4.i7;
import u3.a;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7907e = new a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    public volatile long f7908a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f7909b;

    /* renamed from: c  reason: collision with root package name */
    public final i7 f7910c;

    /* renamed from: d  reason: collision with root package name */
    public final f f7911d;

    public i(c6.f fVar) {
        f7907e.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f7910c = new i7(handlerThread.getLooper());
        fVar.a();
        this.f7911d = new f(this, fVar.f2495b);
    }
}
