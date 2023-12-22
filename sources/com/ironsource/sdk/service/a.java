package com.ironsource.sdk.service;

import java.util.HashMap;
import x8.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5745a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Long> f5746b = new HashMap<>();

    private a() {
    }

    public static long a(String str) {
        f.f(str, "instance");
        Long l6 = f5746b.get(str);
        if (l6 != null) {
            return l6.longValue();
        }
        return -1;
    }

    public static boolean a(String str, long j10) {
        f.f(str, "instance");
        if (!(str.length() == 0)) {
            HashMap<String, Long> hashMap = f5746b;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, Long.valueOf(j10));
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        f.f(str, "instance");
        HashMap<String, Long> hashMap = f5746b;
        if (hashMap.get(str) == null) {
            return false;
        }
        hashMap.remove(str);
        return true;
    }

    public static long c(String str) {
        f.f(str, "instance");
        Long l6 = f5746b.get(str);
        if (l6 != null) {
            return System.currentTimeMillis() - l6.longValue();
        }
        return -1;
    }
}
