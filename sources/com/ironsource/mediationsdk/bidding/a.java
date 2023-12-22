package com.ironsource.mediationsdk.bidding;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.d;
import com.ironsource.mediationsdk.utils.j;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

public final class a implements Callable<j> {

    /* renamed from: a  reason: collision with root package name */
    public final int f4324a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4325b;

    /* renamed from: c  reason: collision with root package name */
    public final AdData f4326c;

    /* renamed from: d  reason: collision with root package name */
    public final c f4327d;

    /* renamed from: e  reason: collision with root package name */
    public final b f4328e;

    /* renamed from: f  reason: collision with root package name */
    public final NetworkSettings f4329f;

    public a(int i10, String str, AdData adData, c cVar, b bVar, NetworkSettings networkSettings) {
        this.f4324a = i10;
        this.f4325b = str;
        this.f4326c = adData;
        this.f4327d = cVar;
        this.f4328e = bVar;
        this.f4329f = networkSettings;
    }

    public final Object call() {
        d dVar = new d();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.f4325b + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            this.f4327d.a(this.f4326c, new u7.a(this, dVar, arrayBlockingQueue));
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.getMessage());
            e10.printStackTrace();
        }
        b bVar = this.f4328e;
        if (bVar != null) {
            bVar.b(this.f4329f);
        }
        return (j) arrayBlockingQueue.take();
    }
}
