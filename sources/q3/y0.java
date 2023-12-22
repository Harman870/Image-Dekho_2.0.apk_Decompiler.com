package q3;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import n4.c;
import n4.g8;
import n4.z4;

public final class y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11304a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11305b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11306c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f11307d;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, int i10) {
        this.f11304a = i10;
        this.f11307d = obj;
        this.f11305b = obj2;
        this.f11306c = obj3;
    }

    public final void run() {
        Bundle bundle;
        switch (this.f11304a) {
            case 0:
                z0 z0Var = (z0) this.f11307d;
                if (z0Var.f11316b > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f11305b;
                    Bundle bundle2 = z0Var.f11317c;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.f11306c);
                    } else {
                        bundle = null;
                    }
                    lifecycleCallback.onCreate(bundle);
                }
                if (((z0) this.f11307d).f11316b >= 2) {
                    ((LifecycleCallback) this.f11305b).onStart();
                }
                if (((z0) this.f11307d).f11316b >= 3) {
                    ((LifecycleCallback) this.f11305b).onResume();
                }
                if (((z0) this.f11307d).f11316b >= 4) {
                    ((LifecycleCallback) this.f11305b).onStop();
                }
                if (((z0) this.f11307d).f11316b >= 5) {
                    ((LifecycleCallback) this.f11305b).onDestroy();
                    return;
                }
                return;
            default:
                ((z4) this.f11307d).f10346a.b();
                if (((c) this.f11305b).f9642c.x() == null) {
                    ((z4) this.f11307d).f10346a.n((c) this.f11305b, (g8) this.f11306c);
                    return;
                } else {
                    ((z4) this.f11307d).f10346a.q((c) this.f11305b, (g8) this.f11306c);
                    return;
                }
        }
    }
}
