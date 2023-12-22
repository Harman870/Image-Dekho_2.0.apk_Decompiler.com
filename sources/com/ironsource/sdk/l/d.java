package com.ironsource.sdk.l;

import android.os.Handler;
import com.ironsource.environment.thread.a;
import com.ironsource.sdk.h.c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static d f5730e;

    /* renamed from: a  reason: collision with root package name */
    public c f5731a = new c(a.a());

    /* renamed from: b  reason: collision with root package name */
    public final String f5732b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5733c;

    /* renamed from: d  reason: collision with root package name */
    public Thread f5734d;

    public d(String str, JSONObject jSONObject) {
        this.f5732b = str;
        this.f5733c = jSONObject;
        IronSourceStorageUtils.deleteFolder(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, "temp"));
        IronSourceStorageUtils.makeDir(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, "temp"));
    }

    public static synchronized d a(String str, a aVar, JSONObject jSONObject) {
        d dVar;
        synchronized (d.class) {
            if (f5730e == null) {
                f5730e = new d(str, jSONObject);
            }
            dVar = f5730e;
        }
        return dVar;
    }

    public Thread a(c cVar, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f5733c.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f5733c.optInt("readTimeout", 5);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new Thread(new b8.c(new b8.a(cVar, str, (int) timeUnit.toMillis((long) i10), (int) timeUnit.toMillis((long) i11), IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f5732b, "temp")), handler));
    }

    public final synchronized void a() {
        f5730e = null;
        c cVar = this.f5731a;
        if (cVar != null) {
            cVar.f5729a = null;
            this.f5731a = null;
        }
    }

    public final boolean b() {
        Thread thread = this.f5734d;
        return thread != null && thread.isAlive();
    }

    public final void a(c cVar, String str) {
        int optInt = this.f5733c.optInt("connectionTimeout", 5);
        int optInt2 = this.f5733c.optInt("readTimeout", 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread thread = new Thread(new b8.c(new b8.a(cVar, str, (int) timeUnit.toMillis((long) optInt), (int) timeUnit.toMillis((long) optInt2), IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f5732b, "temp")), this.f5731a));
        this.f5734d = thread;
        thread.start();
    }
}
