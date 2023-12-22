package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import u9.b0;
import u9.d;
import u9.i;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1361b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1362c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1363d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f1360a = i10;
        this.f1361b = obj;
        this.f1362c = obj2;
        this.f1363d = obj3;
    }

    public final void run() {
        switch (this.f1360a) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1361b;
                f.h hVar = (f.h) this.f1362c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1363d;
                bVar.getClass();
                try {
                    l a10 = c.a(bVar.f1337a);
                    if (a10 != null) {
                        l.b bVar2 = (l.b) a10.f1355a;
                        synchronized (bVar2.f1386d) {
                            bVar2.f1388f = threadPoolExecutor;
                        }
                        a10.f1355a.a(new h(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                i.a.C0158a aVar = (i.a.C0158a) this.f1361b;
                d dVar = (d) this.f1362c;
                b0 b0Var = (b0) this.f1363d;
                boolean u = i.a.this.f12278b.u();
                i.a aVar2 = i.a.this;
                if (u) {
                    dVar.b(aVar2, new IOException("Canceled"));
                    return;
                } else {
                    dVar.a(aVar2, b0Var);
                    return;
                }
        }
    }
}
