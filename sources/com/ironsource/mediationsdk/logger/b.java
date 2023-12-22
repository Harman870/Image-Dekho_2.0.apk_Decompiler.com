package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

public final class b extends IronSourceLogger {

    /* renamed from: c  reason: collision with root package name */
    public LogListener f4672c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4673d;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4674a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceLogger.IronSourceTag f4675b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ int f4676c;

        public a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i10) {
            this.f4674a = str;
            this.f4675b = ironSourceTag;
            this.f4676c = i10;
        }

        public final void run() {
            String str;
            LogListener logListener = b.this.f4672c;
            if (logListener != null && (str = this.f4674a) != null) {
                logListener.onLog(this.f4675b, str, this.f4676c);
            }
        }
    }

    private b() {
        super("publisher");
    }

    public b(LogListener logListener, int i10) {
        super("publisher", 1);
        this.f4672c = null;
        this.f4673d = false;
    }

    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        a aVar = new a(str, ironSourceTag, i10);
        if (this.f4673d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
