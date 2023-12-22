package e0;

import android.os.Handler;
import java.util.concurrent.Callable;

public final class o<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Callable<T> f6159a;

    /* renamed from: b  reason: collision with root package name */
    public g0.a<T> f6160b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f6161c;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0.a f6162a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f6163b;

        public a(g0.a aVar, Object obj) {
            this.f6162a = aVar;
            this.f6163b = obj;
        }

        public final void run() {
            this.f6162a.accept(this.f6163b);
        }
    }

    public o(Handler handler, i iVar, j jVar) {
        this.f6159a = iVar;
        this.f6160b = jVar;
        this.f6161c = handler;
    }

    public final void run() {
        T t10;
        try {
            t10 = this.f6159a.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f6161c.post(new a(this.f6160b, t10));
    }
}
