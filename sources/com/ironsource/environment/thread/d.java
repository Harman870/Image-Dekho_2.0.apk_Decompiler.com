package com.ironsource.environment.thread;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o8.h;
import w8.l;
import x8.f;
import x8.g;

public final class d extends ScheduledThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final l<Throwable, h> f3775a;

    /* renamed from: b  reason: collision with root package name */
    public final l<String, h> f3776b;

    public static final class a extends g implements l<Throwable, h> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3777a = new a();

        public a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return h.f10610a;
        }
    }

    public static final class b extends g implements l<String, h> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3778a = new b();

        public b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            f.f((String) obj, "it");
            return h.f10610a;
        }
    }

    public d() {
        this(0, (l) null, (l) null, 7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(int r1, w8.l r2, w8.l r3, int r4) {
        /*
            r0 = this;
            int r1 = com.ironsource.environment.thread.e.f3779a
            com.ironsource.environment.thread.d$a r2 = com.ironsource.environment.thread.d.a.f3777a
            com.ironsource.environment.thread.d$b r3 = com.ironsource.environment.thread.d.b.f3778a
            java.lang.String r4 = "report"
            x8.f.f(r2, r4)
            java.lang.String r4 = "log"
            x8.f.f(r3, r4)
            o7.a r4 = new o7.a
            r4.<init>()
            r0.<init>(r1, r4)
            r0.f3775a = r2
            r0.f3776b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.thread.d.<init>(int, w8.l, w8.l, int):void");
    }

    public static String a(String str) {
        return d.class.getName() + " RuntimeException caught: " + str;
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th != null) {
            this.f3776b.invoke(a(th.toString()));
            this.f3775a.invoke(th);
        } else if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (CancellationException e10) {
                this.f3776b.invoke(a(e10.toString()));
                this.f3775a.invoke(e10);
            } catch (ExecutionException e11) {
                this.f3776b.invoke(a(e11.toString()));
                this.f3775a.invoke(e11.getCause());
            } catch (InterruptedException e12) {
                this.f3776b.invoke(a(e12.toString()));
                Thread.currentThread().interrupt();
            }
        }
    }
}
