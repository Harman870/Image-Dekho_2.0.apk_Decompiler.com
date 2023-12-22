package com.ironsource.mediationsdk.logger;

public abstract class IronSourceLogger {

    /* renamed from: a  reason: collision with root package name */
    public int f4667a;

    /* renamed from: b  reason: collision with root package name */
    public String f4668b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel(IronSourceLogger ironSourceLogger) {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f4668b = str;
        this.f4667a = 0;
    }

    public IronSourceLogger(String str, int i10) {
        this.f4668b = str;
        this.f4667a = i10;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f4668b;
            return str != null && str.equals(ironSourceLogger.f4668b);
        }
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i10) {
        this.f4667a = i10;
    }
}
