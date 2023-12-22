package q3;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import m3.l;
import p3.h;

public final class o0<A extends a<? extends h, Object>> extends r0 {

    /* renamed from: b  reason: collision with root package name */
    public final A f11266b;

    public o0(l lVar) {
        super(1);
        this.f11266b = lVar;
    }

    public final void a(Status status) {
        try {
            this.f11266b.b(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void b(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f11266b.b(new Status(10, sb.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(q3.w<?> r9) {
        /*
            r8 = this;
            A r0 = r8.f11266b     // Catch:{ RuntimeException -> 0x0033 }
            p3.a$e r9 = r9.f11287b     // Catch:{ RuntimeException -> 0x0033 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x0033 }
            r0.a(r9)     // Catch:{ DeadObjectException -> 0x001f, RemoteException -> 0x000b }
            goto L_0x001e
        L_0x000b:
            r9 = move-exception
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0033 }
            java.lang.String r4 = r9.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0033 }
            r2 = 1
            r3 = 8
            r5 = 0
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x0033 }
            r0.b(r7)     // Catch:{ RuntimeException -> 0x0033 }
        L_0x001e:
            return
        L_0x001f:
            r9 = move-exception
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0033 }
            java.lang.String r4 = r9.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0033 }
            r2 = 1
            r3 = 8
            r5 = 0
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x0033 }
            r0.b(r7)     // Catch:{ RuntimeException -> 0x0033 }
            throw r9     // Catch:{ RuntimeException -> 0x0033 }
        L_0x0033:
            r9 = move-exception
            r8.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.o0.c(q3.w):void");
    }

    public final void d(n nVar, boolean z9) {
        A a10 = this.f11266b;
        nVar.f11262a.put(a10, Boolean.valueOf(z9));
        a10.addStatusListener(new m(nVar, a10));
    }
}
