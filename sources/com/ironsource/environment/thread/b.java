package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import x8.f;

public final class b extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public Handler f3774a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        f.f(str, "name");
    }

    public final void a() {
        this.f3774a = new Handler(getLooper());
    }

    public final void a(Runnable runnable) {
        f.f(runnable, "task");
        Handler handler = this.f3774a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public final void a(Runnable runnable, long j10) {
        f.f(runnable, "task");
        Handler handler = this.f3774a;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }
}
