package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzb extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<AdvertisingIdClient> f2759a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2760b;

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f2761c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    public boolean f2762d = false;

    public zzb(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f2759a = new WeakReference<>(advertisingIdClient);
        this.f2760b = j10;
        start();
    }

    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        try {
            if (!this.f2761c.await(this.f2760b, TimeUnit.MILLISECONDS) && (advertisingIdClient = this.f2759a.get()) != null) {
                advertisingIdClient.zza();
                this.f2762d = true;
            }
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = this.f2759a.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f2762d = true;
            }
        }
    }
}
