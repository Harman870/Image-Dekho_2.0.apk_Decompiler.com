package androidx.fragment.app;

import c7.b;
import c7.c;
import e9.q;
import j6.d;
import j6.v;
import j6.w;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.Set;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

public final /* synthetic */ class v0 implements d {
    public static /* synthetic */ boolean a(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static long b() {
        return new Date().getTime();
    }

    public static HashMap c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static /* synthetic */ Iterator d() {
        try {
            return Arrays.asList(new q[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String e(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "ADDING" : i10 == 3 ? "REMOVING" : "null";
    }

    public static /* synthetic */ String f(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i10 == 3 ? "DECODE_DATA" : "null";
    }

    public static /* synthetic */ String g(int i10) {
        return i10 == 1 ? "UNKNOWN" : i10 == 2 ? "HORIZONTAL_DIMENSION" : i10 == 3 ? "VERTICAL_DIMENSION" : i10 == 4 ? "LEFT" : i10 == 5 ? "RIGHT" : i10 == 6 ? "TOP" : i10 == 7 ? "BOTTOM" : i10 == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ String i(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "BAD_CONFIG" : "null";
    }

    public Object h(w wVar) {
        Set<c7.d> f10 = wVar.f(v.a(c7.d.class));
        c cVar = c.f2517b;
        if (cVar == null) {
            synchronized (c.class) {
                cVar = c.f2517b;
                if (cVar == null) {
                    cVar = new c();
                    c.f2517b = cVar;
                }
            }
        }
        return new b(f10, cVar);
    }
}
