package r3;

import android.os.Bundle;
import o3.b;

public abstract class i0 extends s0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f11597d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f11598e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f11599f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(b bVar, int i10, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f11599f = bVar;
        this.f11597d = i10;
        this.f11598e = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a() {
        /*
            r3 = this;
            int r0 = r3.f11597d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            boolean r0 = r3.d()
            if (r0 != 0) goto L_0x0035
            r3.b r0 = r3.f11599f
            r0.B(r1, r2)
            o3.b r0 = new o3.b
            r1 = 8
            r0.<init>(r1, r2)
            goto L_0x0032
        L_0x0019:
            r3.b r0 = r3.f11599f
            r0.B(r1, r2)
            android.os.Bundle r0 = r3.f11598e
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
        L_0x002b:
            o3.b r0 = new o3.b
            int r1 = r3.f11597d
            r0.<init>(r1, r2)
        L_0x0032:
            r3.c(r0)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.i0.a():void");
    }

    public final void b() {
    }

    public abstract void c(b bVar);

    public abstract boolean d();
}
