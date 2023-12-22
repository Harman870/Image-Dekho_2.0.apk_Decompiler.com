package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<B>> f3842a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f3843b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f3844c = "";

    /* renamed from: d  reason: collision with root package name */
    public B f3845d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f3846e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3847f;

    /* renamed from: g  reason: collision with root package name */
    public final Timer f3848g = new Timer();

    /* renamed from: h  reason: collision with root package name */
    public ConcurrentHashMap<String, AdInfo> f3849h = new ConcurrentHashMap<>();

    public class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f3850a;

        public a(String str) {
            this.f3850a = str;
        }

        public final void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f3850a + " from memory");
                D.this.f3842a.remove(this.f3850a);
                ironLog.verbose("waterfall size is currently " + D.this.f3842a.size());
                ironLog.verbose("removing adInfo with id " + this.f3850a + " from memory");
                D.this.f3849h.remove(this.f3850a);
                ironLog.verbose("adInfo size is currently " + D.this.f3849h.size());
            } finally {
                cancel();
            }
        }
    }

    public D(List<String> list, int i10) {
        this.f3846e = list;
        this.f3847f = i10;
    }

    public final AdInfo a(String str) {
        if (this.f3849h.containsKey(str)) {
            return this.f3849h.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<B> a() {
        CopyOnWriteArrayList<B> copyOnWriteArrayList = this.f3842a.get(this.f3843b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized void a(B b10) {
        IronLog.INTERNAL.verbose();
        B b11 = this.f3845d;
        if (b11 != null && !b11.equals(b10)) {
            this.f3845d.f();
        }
        this.f3845d = b10;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.f3849h.put(str, new AdInfo(impressionData));
        }
    }

    public final void a(CopyOnWriteArrayList<B> copyOnWriteArrayList, String str) {
        boolean z9;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        Iterator<B> it = a().iterator();
        while (it.hasNext()) {
            O next = it.next();
            if (!next.equals(this.f3845d)) {
                next.f();
            }
        }
        this.f3842a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f3844c)) {
            synchronized (this) {
                B b10 = this.f3845d;
                if (b10 == null || !b10.f3827p.equals(this.f3844c)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            }
            if (z9) {
                IronLog ironLog2 = IronLog.INTERNAL;
                StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                sb.append(this.f3844c);
                sb.append(" is still showing - the current waterfall ");
                com.ironsource.adapters.ironsource.a.i(sb, this.f3843b, " will be deleted instead", ironLog2);
                String str2 = this.f3843b;
                this.f3843b = this.f3844c;
                this.f3844c = str2;
            }
            this.f3848g.schedule(new a(this.f3844c), (long) this.f3847f);
        }
        this.f3844c = this.f3843b;
        this.f3843b = str;
    }

    public final boolean b() {
        return this.f3842a.size() > 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r5.f3846e.contains(r6.o()) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r5.f3845d.o().equals(r6.o()) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(com.ironsource.mediationsdk.B r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0076 }
            r0.verbose()     // Catch:{ all -> 0x0076 }
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L_0x0054
            boolean r3 = r6.k()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0011
            goto L_0x0054
        L_0x0011:
            com.ironsource.mediationsdk.B r3 = r5.f3845d     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0017
        L_0x0015:
            r3 = r1
            goto L_0x0055
        L_0x0017:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = r6.b()     // Catch:{ all -> 0x0076 }
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x0076 }
            if (r3 != r4) goto L_0x0030
            com.ironsource.mediationsdk.B r3 = r5.f3845d     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r3.n()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r6.n()     // Catch:{ all -> 0x0076 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0030
            goto L_0x0054
        L_0x0030:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = r6.b()     // Catch:{ all -> 0x0076 }
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x0076 }
            if (r3 == r4) goto L_0x0044
            java.util.List<java.lang.String> r3 = r5.f3846e     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r6.o()     // Catch:{ all -> 0x0076 }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0015
        L_0x0044:
            com.ironsource.mediationsdk.B r3 = r5.f3845d     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r3.o()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r6.o()     // Catch:{ all -> 0x0076 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0015
        L_0x0054:
            r3 = r2
        L_0x0055:
            if (r3 == 0) goto L_0x0071
            if (r6 == 0) goto L_0x0071
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r4.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = r6.n()     // Catch:{ all -> 0x0076 }
            r4.append(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = " will not be added to the auction request"
            r4.append(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0076 }
            r0.verbose(r6)     // Catch:{ all -> 0x0076 }
        L_0x0071:
            monitor-exit(r5)
            if (r3 != 0) goto L_0x0075
            return r2
        L_0x0075:
            return r1
        L_0x0076:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.D.b(com.ironsource.mediationsdk.B):boolean");
    }
}
