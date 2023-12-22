package com.ironsource.environment;

import java.lang.Thread;

public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f3720a;

    public d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f3720a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append(System.lineSeparator());
        boolean z9 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            if (stackTraceElement.toString().contains(e.a().f3731h)) {
                z9 = true;
            }
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                if (stackTraceElement2.toString().contains(e.a().f3731h)) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(System.currentTimeMillis());
            new c(sb2, sb3.toString(), "Crash").d();
        }
        this.f3720a.uncaughtException(thread, th);
    }
}
