package h9;

import e9.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x8.i;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7052a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7053b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7054c;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends b<f> {

        /* renamed from: b  reason: collision with root package name */
        public final f f7055b;

        /* renamed from: c  reason: collision with root package name */
        public f f7056c;

        public a(f fVar) {
            this.f7055b = fVar;
        }

        public final void b(Object obj, Object obj2) {
            boolean z9;
            f fVar;
            f fVar2 = (f) obj;
            boolean z10 = true;
            if (obj2 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                fVar = this.f7055b;
            } else {
                fVar = this.f7056c;
            }
            if (fVar != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f7052a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(fVar2, this, fVar)) {
                        if (atomicReferenceFieldUpdater.get(fVar2) != this) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10 && z9) {
                    f fVar3 = this.f7055b;
                    f fVar4 = this.f7056c;
                    x8.f.c(fVar4);
                    fVar3.f(fVar4);
                }
            }
        }
    }

    public /* synthetic */ class b extends i {
        public b(Object obj) {
            super(obj);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<f> cls2 = f.class;
        f7052a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f7053b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f7054c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f7052a;
        r4 = ((h9.l) r4).f7067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h9.f e() {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r0 = r10._prev
            h9.f r0 = (h9.f) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L_0x0024
            if (r0 != r2) goto L_0x0010
            return r2
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f7053b
        L_0x0012:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L_0x001a
            r5 = r6
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r2
        L_0x0024:
            boolean r7 = r10.i()
            if (r7 == 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r2
        L_0x002e:
            boolean r7 = r4 instanceof h9.k
            if (r7 == 0) goto L_0x0038
            h9.k r4 = (h9.k) r4
            r4.a(r2)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof h9.l
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f7052a
            h9.l r4 = (h9.l) r4
            h9.f r4 = r4.f7067a
        L_0x0044:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L_0x004c
            r5 = r6
            goto L_0x0052
        L_0x004c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r2 = r3
            goto L_0x0006
        L_0x0057:
            java.lang.Object r2 = r2._prev
            h9.f r2 = (h9.f) r2
            goto L_0x0007
        L_0x005c:
            r3 = r4
            h9.f r3 = (h9.f) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.f.e():h9.f");
    }

    public final void f(f fVar) {
        boolean z9;
        do {
            f fVar2 = (f) fVar._prev;
            if (g() == fVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7053b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(fVar, fVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != fVar2) {
                            z9 = false;
                            continue;
                            break;
                        }
                    } else {
                        z9 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z9);
        if (i()) {
            fVar.e();
        }
    }

    public final Object g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public final f h() {
        Object g10 = g();
        f fVar = null;
        l lVar = g10 instanceof l ? (l) g10 : null;
        if (lVar != null) {
            fVar = lVar.f7067a;
        }
        return fVar == null ? (f) g10 : fVar;
    }

    public boolean i() {
        return g() instanceof l;
    }

    public final void j() {
        boolean z9;
        f fVar;
        do {
            Object g10 = g();
            z9 = false;
            if (!(g10 instanceof l)) {
                if (g10 != this) {
                    fVar = (f) g10;
                    l lVar = (l) fVar._removedRef;
                    if (lVar == null) {
                        lVar = new l(fVar);
                        f7054c.lazySet(fVar, lVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7052a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, g10, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != g10) {
                                continue;
                                break;
                            }
                        } else {
                            z9 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    f fVar2 = (f) g10;
                    return;
                }
            } else {
                f fVar3 = ((l) g10).f7067a;
                return;
            }
        } while (!z9);
        fVar.e();
    }

    public String toString() {
        return new b(this) + '@' + t.c(this);
    }
}
