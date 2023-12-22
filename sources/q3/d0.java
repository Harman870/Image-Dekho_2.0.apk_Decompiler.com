package q3;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import f4.f;
import p3.a;
import r3.b;
import r3.d;
import r3.l;
import r3.p;
import r3.q;

public final class d0<T> implements OnCompleteListener<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f11226a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11227b;

    /* renamed from: c  reason: collision with root package name */
    public final a<?> f11228c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11229d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11230e;

    public d0(d dVar, int i10, a aVar, long j10, long j11) {
        this.f11226a = dVar;
        this.f11227b = i10;
        this.f11228c = aVar;
        this.f11229d = j10;
        this.f11230e = j11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r2 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        if (r2 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static r3.d a(q3.w<?> r6, r3.b<?> r7, int r8) {
        /*
            r3.x0 r7 = r7.f11519v
            r0 = 0
            if (r7 != 0) goto L_0x0007
            r7 = r0
            goto L_0x0009
        L_0x0007:
            r3.d r7 = r7.f11653d
        L_0x0009:
            if (r7 == 0) goto L_0x0041
            boolean r1 = r7.f11547b
            if (r1 == 0) goto L_0x0041
            int[] r1 = r7.f11549d
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x002a
            int[] r1 = r7.f11551f
            if (r1 != 0) goto L_0x001a
            goto L_0x003a
        L_0x001a:
            r4 = r2
        L_0x001b:
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0027
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0024
            r2 = r3
            goto L_0x0027
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0027:
            if (r2 == 0) goto L_0x003a
            goto L_0x0041
        L_0x002a:
            r4 = r2
        L_0x002b:
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0037
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0034
            r2 = r3
            goto L_0x0037
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            int r6 = r6.f11296l
            int r8 = r7.f11550e
            if (r6 >= r8) goto L_0x0041
            return r7
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d0.a(q3.w, r3.b, int):r3.d");
    }

    public final void onComplete(Task<T> task) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int i16;
        int i17;
        boolean z10;
        if (this.f11226a.b()) {
            q qVar = p.a().f11619a;
            if (qVar == null || qVar.f11624b) {
                w wVar = (w) this.f11226a.f11221j.get(this.f11228c);
                if (wVar != null) {
                    a.e eVar = wVar.f11287b;
                    if (eVar instanceof b) {
                        b bVar = (b) eVar;
                        boolean z11 = true;
                        if (this.f11229d > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i18 = bVar.f11515q;
                        if (qVar != null) {
                            boolean z12 = z9 & qVar.f11625c;
                            int i19 = qVar.f11626d;
                            int i20 = qVar.f11627e;
                            i12 = qVar.f11623a;
                            if (bVar.f11519v != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && !bVar.h()) {
                                d a10 = a(wVar, bVar, this.f11227b);
                                if (a10 != null) {
                                    if (!a10.f11548c || this.f11229d <= 0) {
                                        z11 = false;
                                    }
                                    i20 = a10.f11550e;
                                    z12 = z11;
                                } else {
                                    return;
                                }
                            }
                            i11 = i19;
                            i10 = i20;
                        } else {
                            i12 = 0;
                            i10 = 100;
                            i11 = 5000;
                        }
                        d dVar = this.f11226a;
                        if (task.isSuccessful()) {
                            i14 = 0;
                            i13 = 0;
                        } else {
                            if (task.isCanceled()) {
                                i16 = 100;
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof p3.b) {
                                    Status status = ((p3.b) exception).f10660a;
                                    int i21 = status.f2811b;
                                    o3.b bVar2 = status.f2814e;
                                    if (bVar2 == null) {
                                        i17 = -1;
                                    } else {
                                        i17 = bVar2.f10539b;
                                    }
                                    i13 = i17;
                                    i14 = i21;
                                } else {
                                    i16 = 101;
                                }
                            }
                            i14 = i16;
                            i13 = -1;
                        }
                        if (z9) {
                            long j12 = this.f11229d;
                            j11 = System.currentTimeMillis();
                            j10 = j12;
                            i15 = (int) (SystemClock.elapsedRealtime() - this.f11230e);
                        } else {
                            j11 = 0;
                            j10 = 0;
                            i15 = -1;
                        }
                        l lVar = new l(this.f11227b, i14, i13, j10, j11, (String) null, (String) null, i18, i15);
                        long j13 = (long) i11;
                        f fVar = dVar.f11224n;
                        fVar.sendMessage(fVar.obtainMessage(18, new e0(lVar, i12, j13, i10)));
                    }
                }
            }
        }
    }
}
