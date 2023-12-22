package androidx.emoji2.text;

import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

public final class h extends f.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.h f1364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1365b;

    public h(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1364a = hVar;
        this.f1365b = threadPoolExecutor;
    }

    public final void a(Throwable th) {
        try {
            this.f1364a.a(th);
        } finally {
            this.f1365b.shutdown();
        }
    }

    public final void b(n nVar) {
        try {
            this.f1364a.b(nVar);
        } finally {
            this.f1365b.shutdown();
        }
    }
}
