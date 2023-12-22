package j6;

import a7.m;
import android.content.Intent;
import java.util.Map;
import k6.l;
import r6.a;
import r6.b;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8752a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8753b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8754c;

    public /* synthetic */ n(Object obj, int i10, Object obj2) {
        this.f8752a = i10;
        this.f8753b = obj;
        this.f8754c = obj2;
    }

    public final void run() {
        switch (this.f8752a) {
            case 0:
                ((b) ((Map.Entry) this.f8753b).getKey()).a((a) this.f8754c);
                return;
            case 1:
                Runnable runnable = (Runnable) this.f8753b;
                l.b bVar = (l.b) this.f8754c;
                try {
                    runnable.run();
                    l lVar = l.this;
                    lVar.getClass();
                    if (n.a.f9456f.b(lVar, (Object) null, n.a.f9457g)) {
                        n.a.c(lVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((l.a) bVar).a(e10);
                    return;
                }
            default:
                ((m) this.f8753b).getClass();
                m.a((Intent) this.f8754c);
                return;
        }
    }
}
