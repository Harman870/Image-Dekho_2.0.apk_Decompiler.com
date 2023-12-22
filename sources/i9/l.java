package i9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7981b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7982c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7983d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7984e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f7985a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<l> cls = l.class;
        f7981b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f7982c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f7983d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f7984e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final g a(g gVar, boolean z9) {
        if (z9) {
            return b(gVar);
        }
        g gVar2 = (g) f7981b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z9 = true;
        if (gVar.f7971b.b() != 1) {
            z9 = false;
        }
        if (z9) {
            f7984e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f7985a.get(i10) != null) {
            Thread.yield();
        }
        this.f7985a.lazySet(i10, gVar);
        f7982c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f7983d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f7985a.getAndSet(i11, (Object) null)) != null) {
                boolean z9 = true;
                if (andSet.f7971b.b() != 1) {
                    z9 = false;
                }
                if (z9) {
                    f7984e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long e(l lVar) {
        boolean z9;
        int i10 = lVar.consumerIndex;
        int i11 = lVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = lVar.f7985a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i12);
            if (gVar != null) {
                if (gVar.f7971b.b() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, gVar, (Object) null)) {
                            if (atomicReferenceArray.get(i12) != gVar) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        f7984e.decrementAndGet(lVar);
                        a(gVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
        return f(lVar, true);
    }

    public final long f(l lVar, boolean z9) {
        g gVar;
        boolean z10;
        boolean z11;
        do {
            gVar = (g) lVar.lastScheduledTask;
            if (gVar != null) {
                z10 = true;
                if (z9) {
                    if (gVar.f7971b.b() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return -2;
                    }
                }
                j.f7977e.getClass();
                long nanoTime = System.nanoTime() - gVar.f7970a;
                long j10 = j.f7973a;
                if (nanoTime >= j10) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7981b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(lVar, gVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != gVar) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j10 - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z10);
        a(gVar, false);
        return -1;
    }
}
