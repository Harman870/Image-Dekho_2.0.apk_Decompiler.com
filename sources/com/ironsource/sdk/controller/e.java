package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final A.d f5377a;

    public e(A.d dVar) {
        this.f5377a = dVar;
    }

    public final synchronized void a(String str, String str2) {
        if (this.f5377a == null) {
            Logger.e(com.ironsource.sdk.c.e.f5173a, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = A.d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f5377a, new Object[]{str2});
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }
}
