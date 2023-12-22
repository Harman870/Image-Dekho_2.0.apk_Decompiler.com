package n4;

import android.os.Bundle;
import androidx.activity.f;
import androidx.fragment.app.w0;
import c.a;
import g1.t;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import r3.o;
import z5.c;

public final class d3 {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f9668b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f9669c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference f9670d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final t f9671a;

    public d3(t tVar) {
        this.f9671a = tVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        o.h(atomicReference);
        o.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder g10 = f.g("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (g10.length() != 1) {
                    g10.append(", ");
                }
                g10.append(str);
            }
        }
        g10.append("]");
        return g10.toString();
    }

    public final String b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f9671a.b()) {
            return bundle.toString();
        }
        StringBuilder g10 = f.g("Bundle[{");
        for (String next : bundle.keySet()) {
            if (g10.length() != 8) {
                g10.append(", ");
            }
            g10.append(e(next));
            g10.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            g10.append(str);
        }
        g10.append("}]");
        return g10.toString();
    }

    public final String c(r rVar) {
        String str;
        if (!this.f9671a.b()) {
            return rVar.toString();
        }
        StringBuilder g10 = f.g("origin=");
        g10.append(rVar.f10087c);
        g10.append(",name=");
        g10.append(d(rVar.f10085a));
        g10.append(",params=");
        p pVar = rVar.f10086b;
        if (pVar == null) {
            str = null;
        } else if (!this.f9671a.b()) {
            str = pVar.toString();
        } else {
            str = b(pVar.x());
        }
        g10.append(str);
        return g10.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f9671a.b() ? str : g(str, a.f2360s, a.f2356q, f9668b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f9671a.b() ? str : g(str, y3.a.K, y3.a.J, f9669c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f9671a.b()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return w0.d("experiment_id(", str, ")");
        }
        return g(str, c.f13184h, c.f13183g, f9670d);
    }
}
