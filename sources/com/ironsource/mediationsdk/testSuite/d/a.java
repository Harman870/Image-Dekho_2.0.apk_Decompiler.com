package com.ironsource.mediationsdk.testSuite.d;

import d9.g;
import java.util.Arrays;
import java.util.List;
import x8.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4904a = new a();

    private a() {
    }

    public static String a(Object obj) {
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        return "'" + obj + '\'';
    }

    public static String a(List<? extends Object> list) {
        String str;
        f.f(list, "methodArgs");
        String str2 = new String();
        for (T next : list) {
            StringBuilder g10 = androidx.activity.f.g(str2);
            if (next instanceof List) {
                String str3 = "[";
                for (Object a10 : (List) next) {
                    str3 = str3 + a(a10) + ',';
                }
                str = g.C(str3) + ']';
            } else {
                str = a((Object) next);
            }
            g10.append(str);
            str2 = g10.toString() + ',';
        }
        return g.C(str2);
    }

    public static List<Object> a(Object... objArr) {
        f.f(objArr, "items");
        return c.a.f(Arrays.copyOf(objArr, objArr.length));
    }
}
