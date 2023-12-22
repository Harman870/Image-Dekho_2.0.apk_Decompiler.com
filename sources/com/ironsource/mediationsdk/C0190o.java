package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.a;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.o  reason: case insensitive filesystem */
public abstract class C0190o {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<ImpressionDataListener> f4811a;

    /* renamed from: b  reason: collision with root package name */
    public a f4812b = new a();

    /* renamed from: c  reason: collision with root package name */
    public IronSourceSegment f4813c;

    /* renamed from: d  reason: collision with root package name */
    public AdInfo f4814d;

    public C0190o(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.f4811a = hashSet;
        this.f4813c = ironSourceSegment;
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f4813c = ironSourceSegment;
    }

    public final void a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.f4814d = new AdInfo(impressionData);
        }
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f4811a.add(impressionDataListener);
        }
    }

    public final void a_() {
        this.f4814d = null;
    }

    public final void b(com.ironsource.mediationsdk.adunit.a.a aVar, String str) {
        if (aVar != null) {
            ImpressionData a10 = aVar.a(str);
            if (a10 != null) {
                Iterator<ImpressionDataListener> it = this.f4811a.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a10);
                    next.onImpressionSuccess(a10);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f4811a.remove(impressionDataListener);
        }
    }
}
