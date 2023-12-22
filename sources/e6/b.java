package e6;

import android.os.Bundle;
import d.u;
import f6.a;
import j4.a6;
import j4.c2;
import j4.r1;
import j4.v1;
import java.util.concurrent.ConcurrentHashMap;
import r3.o;

public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f6194b;

    /* renamed from: a  reason: collision with root package name */
    public final u f6195a;

    public b(u uVar) {
        o.h(uVar);
        this.f6195a = uVar;
        new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle) {
        boolean z9;
        boolean z10 = true;
        if (!a.f6386b.contains("fcm")) {
            if (!a.f6385a.contains(str)) {
                a6 a6Var = a.f6387c;
                int i10 = a6Var.f8044d;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z9 = true;
                        break;
                    }
                    boolean containsKey = bundle.containsKey((String) a6Var.get(i11));
                    i11++;
                    if (containsKey) {
                        break;
                    }
                }
            } else {
                z9 = false;
            }
            if (z9) {
                if ("_cmp".equals(str)) {
                    if (!a.f6386b.contains("fcm")) {
                        a6 a6Var2 = a.f6387c;
                        int i12 = a6Var2.f8044d;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= i12) {
                                bundle.putString("_cis", "fcm_integration");
                                break;
                            }
                            boolean containsKey2 = bundle.containsKey((String) a6Var2.get(i13));
                            i13++;
                            if (containsKey2) {
                                break;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    c2 c2Var = (c2) this.f6195a.f5966a;
                    c2Var.getClass();
                    c2Var.b(new v1(c2Var, (Long) null, "fcm", str, bundle, true));
                }
            }
        }
    }

    public final void b(String str) {
        if (!a.f6386b.contains("fcm")) {
            c2 c2Var = (c2) this.f6195a.f5966a;
            c2Var.getClass();
            c2Var.b(new r1(c2Var, str));
        }
    }
}
