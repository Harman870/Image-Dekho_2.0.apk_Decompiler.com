package com.ironsource.mediationsdk.logger;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

public enum IronLog {
    API(0),
    CALLBACK(1),
    ADAPTER_API(2),
    ADAPTER_CALLBACK(3),
    NETWORK(4),
    INTERNAL(5),
    NATIVE(6),
    EVENT(7);
    

    /* renamed from: a  reason: collision with root package name */
    public IronSourceLogger.IronSourceTag f4664a;

    /* access modifiers changed from: public */
    IronLog(int i10) {
        this.f4664a = r1;
    }

    public static String a() {
        String str;
        StringBuilder sb;
        StackTraceElement stackTraceElement;
        StackTraceElement stackTraceElement2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String[] split = stackTrace[5].getClassName().split("\\.");
        String str2 = split[split.length - 1];
        if (str2.contains("$")) {
            str2 = str2.split("\\$")[0];
        }
        String[] split2 = stackTrace[5].getClassName().split("\\.");
        String str3 = split2[split2.length - 1];
        if (str3.contains("$")) {
            String[] split3 = str3.split("\\$");
            sb = new StringBuilder();
            sb.append(split3[1]);
            sb.append(".");
            stackTraceElement = stackTrace[5];
        } else {
            if (stackTrace[5].getMethodName().contains("$")) {
                String[] split4 = stackTrace[6].getClassName().split("\\$");
                if (split4.length > 1) {
                    sb = new StringBuilder();
                    sb.append(split4[1]);
                    sb.append(".");
                    stackTraceElement = stackTrace[6];
                } else {
                    stackTraceElement2 = stackTrace[6];
                }
            } else {
                stackTraceElement2 = stackTrace[5];
            }
            str = stackTraceElement2.getMethodName();
            return String.format("%s %s", new Object[]{str2, str});
        }
        sb.append(stackTraceElement.getMethodName());
        str = sb.toString();
        return String.format("%s %s", new Object[]{str2, str});
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        return String.format("%s - %s", new Object[]{a(), str});
    }

    public final void error() {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(""), 3);
    }

    public final void error(String str) {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(str), 3);
    }

    public final void info() {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(""), 1);
    }

    public final void info(String str) {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(str), 1);
    }

    public final void verbose() {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(""), 0);
    }

    public final void verbose(String str) {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(str), 0);
    }

    public final void warning() {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(""), 2);
    }

    public final void warning(String str) {
        IronSourceLoggerManager.getLogger().log(this.f4664a, b(str), 2);
    }
}
