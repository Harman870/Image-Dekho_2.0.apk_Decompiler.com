package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import f4.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3.d;
import p3.e;
import p3.h;
import p3.i;
import q3.n0;
import q3.w0;
import q3.x0;
import r3.o;

@KeepName
public abstract class BasePendingResult<R extends h> extends e<R> {
    public static final ThreadLocal<Boolean> zaa = new w0(0);
    @KeepName
    private x0 mResultGuardian;
    public final a<R> zab;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<e.a> zag;
    private i<? super R> zah;
    private final AtomicReference<n0> zai;
    /* access modifiers changed from: private */
    public R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zan;
    private boolean zaq;

    public static class a<R extends h> extends f {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a();
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(hVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i10);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f2808i);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    public BasePendingResult(d dVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(dVar != null ? dVar.a() : Looper.getMainLooper());
        new WeakReference(dVar);
    }

    private final R zaa() {
        R r4;
        synchronized (this.zae) {
            o.j("Result has already been consumed.", !this.zal);
            o.j("Result is not ready.", isReady());
            r4 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet((Object) null) == null) {
            o.h(r4);
            return r4;
        }
        throw null;
    }

    private final void zab(R r4) {
        this.zaj = r4;
        this.zak = r4.getStatus();
        this.zaf.countDown();
        i<? super R> iVar = this.zah;
        if (iVar != null) {
            this.zab.removeMessages(2);
            a<R> aVar = this.zab;
            h zaa2 = zaa();
            aVar.getClass();
            aVar.sendMessage(aVar.obtainMessage(1, new Pair(iVar, zaa2)));
        } else if (this.zaj instanceof p3.f) {
            this.mResultGuardian = new x0(this);
        }
        ArrayList<e.a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(h hVar) {
        if (hVar instanceof p3.f) {
            try {
                ((p3.f) hVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    public final void addStatusListener(e.a aVar) {
        o.a("Callback cannot be null.", aVar != null);
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            o.g("await must not be called on the UI thread when time is greater than zero.");
        }
        o.j("Result has already been consumed.", !this.zal);
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f2808i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f2806g);
        }
        o.j("Result is not ready.", isReady());
        return zaa();
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(R r4) {
        synchronized (this.zae) {
            if (!this.zan) {
                isReady();
                o.j("Results have already been set", !isReady());
                o.j("Result has already been consumed", !this.zal);
                zab(r4);
                return;
            }
            zal(r4);
        }
    }

    public final void zak() {
        boolean z9 = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z9 = false;
        }
        this.zaq = z9;
    }
}
