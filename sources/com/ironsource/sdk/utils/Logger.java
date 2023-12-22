package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.g.d;

public class Logger {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f5753a;

    public static void d(String str, String str2) {
        if (f5753a) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f5753a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f5753a) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f5753a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i10) {
        f5753a = d.C0067d.MODE_0.f5646d != i10;
    }

    public static void i(String str, String str2) {
        if (f5753a) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (f5753a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    public static void v(String str, String str2) {
        if (f5753a) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (f5753a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (f5753a) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f5753a) {
            Log.w(str, str2, th);
        }
    }
}
