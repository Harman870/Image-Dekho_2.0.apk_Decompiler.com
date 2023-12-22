package h9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z7.e;

public final class h<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7058e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7059f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f7060g = new e("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f7061a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7062b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7063c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f7064d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7065a;

        public a(int i10) {
            this.f7065a = i10;
        }
    }

    static {
        Class<h> cls = h.class;
        f7058e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f7059f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public h(int i10, boolean z9) {
        this.f7061a = i10;
        this.f7062b = z9;
        int i11 = i10 - 1;
        this.f7063c = i11;
        this.f7064d = new AtomicReferenceArray(i10);
        boolean z10 = false;
        if (i11 <= 1073741823) {
            if (!((i10 & i11) == 0 ? true : z10)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f7063c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (this.f7062b || this.f7064d.get(i11 & i12) == null) {
                if (f7059f.compareAndSet(this, j10, (-1152921503533105153L & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                    this.f7064d.set(i11 & i12, e10);
                    h hVar = this;
                    while ((hVar._state & 1152921504606846976L) != 0) {
                        hVar = hVar.e();
                        Object obj = hVar.f7064d.get(hVar.f7063c & i11);
                        if (!(obj instanceof a) || ((a) obj).f7065a != i11) {
                            hVar = null;
                            continue;
                        } else {
                            hVar.f7064d.set(hVar.f7063c & i11, e10);
                            continue;
                        }
                        if (hVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f7061a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f7059f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:3: B:16:0x0067->B:19:0x0072, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h9.h<E> e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f7059f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            h9.h r0 = (h9.h) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f7058e
            r1 = 0
            h9.h r4 = new h9.h
            int r5 = r10.f7061a
            int r5 = r5 * 2
            boolean r6 = r10.f7062b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.f7063c
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f7064d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            h9.h$a r7 = new h9.h$a
            r7.<init>(r5)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f7064d
            int r9 = r4.f7063c
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
        L_0x0067:
            boolean r5 = r0.compareAndSet(r10, r1, r4)
            if (r5 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r5 = r0.get(r10)
            if (r5 == 0) goto L_0x0067
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.h.e():h9.h");
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f7060g;
            }
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f7063c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f7064d.get(i13);
            if (obj == null) {
                if (this.f7062b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((long) ((i10 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f7059f.compareAndSet(this, j10, (j10 & -1073741824) | j11)) {
                    this.f7064d.set(this.f7063c & i10, (Object) null);
                    return obj2;
                } else if (this.f7062b) {
                    h hVar = this;
                    while (true) {
                        long j12 = hVar._state;
                        int i14 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            hVar = hVar.e();
                        } else {
                            if (f7059f.compareAndSet(hVar, j12, (j12 & -1073741824) | j11)) {
                                hVar.f7064d.set(hVar.f7063c & i14, (Object) null);
                                hVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (hVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
