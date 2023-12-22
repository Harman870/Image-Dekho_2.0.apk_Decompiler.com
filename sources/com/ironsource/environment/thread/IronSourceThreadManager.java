package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k6.j;
import o8.g;
import w8.l;
import x8.f;

public final class IronSourceThreadManager {
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3762a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f3763b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final Handler f3764c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f3765d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f3766e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f3767f;

    /* renamed from: g  reason: collision with root package name */
    public static final g f3768g;

    public static final class a extends x8.g implements w8.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3769a = new a();

        public a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new d(0, (l) null, (l) null, 7);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f3764c = new Handler(handlerThread.getLooper());
        b bVar = new b("mediationBackground");
        bVar.start();
        bVar.a();
        f3765d = bVar;
        b bVar2 = new b("adapterBackground");
        bVar2.start();
        bVar2.a();
        f3766e = bVar2;
        b bVar3 = new b("publisher-callbacks");
        bVar3.start();
        bVar3.a();
        f3767f = bVar3;
        a aVar = a.f3769a;
        f.f(aVar, "initializer");
        f3768g = new g(aVar);
    }

    private IronSourceThreadManager() {
    }

    public static d a() {
        return (d) f3768g.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z9, boolean z10, List<? extends Runnable> list) {
        f.f(list, "tasks");
        if (!z9) {
            for (Runnable run : list) {
                run.run();
            }
        } else if (!z10) {
            for (Runnable postMediationBackgroundTask$default : list) {
                postMediationBackgroundTask$default(INSTANCE, postMediationBackgroundTask$default, 0, 2, (Object) null);
            }
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(list.size());
            for (Runnable jVar : list) {
                postMediationBackgroundTask$default(INSTANCE, new j(jVar, countDownLatch, 1), 0, 2, (Object) null);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final Handler getInitHandler() {
        return f3764c;
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f3762a;
    }

    public final void postAdapterBackgroundTask(Runnable runnable) {
        f.f(runnable, "action");
        postAdapterBackgroundTask$default(this, runnable, 0, 2, (Object) null);
    }

    public final void postAdapterBackgroundTask(Runnable runnable, long j10) {
        f.f(runnable, "action");
        if (f3762a) {
            a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            f3766e.a(runnable, j10);
        }
    }

    public final void postMediationBackgroundTask(Runnable runnable) {
        f.f(runnable, "action");
        postMediationBackgroundTask$default(this, runnable, 0, 2, (Object) null);
    }

    public final void postMediationBackgroundTask(Runnable runnable, long j10) {
        f.f(runnable, "action");
        if (f3762a) {
            a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            f3765d.a(runnable, j10);
        }
    }

    public final void postOnUiThreadTask(Runnable runnable) {
        f.f(runnable, "action");
        postOnUiThreadTask$default(this, runnable, 0, 2, (Object) null);
    }

    public final void postOnUiThreadTask(Runnable runnable, long j10) {
        f.f(runnable, "action");
        f3763b.postDelayed(runnable, j10);
    }

    public final void postPublisherCallback(Runnable runnable) {
        f.f(runnable, "action");
        postPublisherCallback$default(this, runnable, 0, 2, (Object) null);
    }

    public final void postPublisherCallback(Runnable runnable, long j10) {
        f.f(runnable, "action");
        f3767f.a(runnable, j10);
    }

    public final void removeAdapterBackgroundTask(Runnable runnable) {
        boolean z9;
        f.f(runnable, "action");
        if (!f3762a || !a().getQueue().contains(runnable)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            a().remove(runnable);
        } else {
            f3766e.a(runnable);
        }
    }

    public final void removeMediationBackgroundTask(Runnable runnable) {
        boolean z9;
        f.f(runnable, "action");
        if (!f3762a || !a().getQueue().contains(runnable)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            a().remove(runnable);
        } else {
            f3765d.a(runnable);
        }
    }

    public final void removeUiThreadTask(Runnable runnable) {
        f.f(runnable, "action");
        f3763b.removeCallbacks(runnable);
    }

    public final void setUseSharedExecutorService(boolean z9) {
        f3762a = z9;
    }
}
