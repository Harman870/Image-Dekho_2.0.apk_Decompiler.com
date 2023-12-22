package com.ironsource.mediationsdk;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.q  reason: case insensitive filesystem */
public final class C0192q {

    /* renamed from: f  reason: collision with root package name */
    public static final C0192q f4818f = new C0192q();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4819a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4820b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public int f4821c;

    /* renamed from: d  reason: collision with root package name */
    public int f4822d;

    /* renamed from: e  reason: collision with root package name */
    public int f4823e;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSource.AD_UNIT f4824a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ IronSourceError f4825b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ boolean f4826c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ String f4827d;

        public a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, boolean z9, String str) {
            this.f4824a = ad_unit;
            this.f4825b = ironSourceError;
            this.f4826c = z9;
            this.f4827d = str;
        }

        public final void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            C0192q qVar = C0192q.this;
            IronSource.AD_UNIT ad_unit = this.f4824a;
            IronSourceError ironSourceError = this.f4825b;
            boolean z9 = this.f4826c;
            C0192q qVar2 = C0192q.f4818f;
            qVar.b(ad_unit, ironSourceError, z9);
            C0192q.this.f4820b.put(this.f4827d, Boolean.FALSE);
        }
    }

    private C0192q() {
    }

    public static synchronized C0192q a() {
        C0192q qVar;
        synchronized (C0192q.class) {
            qVar = f4818f;
        }
        return qVar;
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i10) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f4822d = i10;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f4821c = i10;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f4823e = i10;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        a(ad_unit, ironSourceError, false);
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, boolean z9) {
        int i10;
        if (!a(ad_unit)) {
            String ad_unit2 = ad_unit.toString();
            if (!this.f4819a.containsKey(ad_unit2)) {
                b(ad_unit, ironSourceError, z9);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i10 = this.f4822d;
            } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i10 = this.f4821c;
            } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
                i10 = this.f4823e;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i10 = 0;
            }
            long j10 = ((long) i10) * 1000;
            long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f4819a.get(ad_unit2)).longValue();
            if (currentTimeMillis > j10) {
                b(ad_unit, ironSourceError, z9);
                return;
            }
            this.f4820b.put(ad_unit2, Boolean.TRUE);
            long j11 = j10 - currentTimeMillis;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("delaying callback by " + j11);
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ad_unit, ironSourceError, z9, ad_unit2), j11);
        }
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (!this.f4820b.containsKey(ad_unit.toString())) {
            return false;
        }
        return ((Boolean) this.f4820b.get(ad_unit.toString())).booleanValue();
    }

    public final void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, boolean z9) {
        this.f4819a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            P.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C0196u.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            l.a().a(ironSourceError, z9);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }
}
