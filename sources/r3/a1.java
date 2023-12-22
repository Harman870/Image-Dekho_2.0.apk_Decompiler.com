package r3;

import android.os.Parcel;
import android.os.Parcelable;
import y3.a;

public final class a1 implements Parcelable.Creator {
    public static void a(e eVar, Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.x(parcel, 1, eVar.f11558a);
        a.x(parcel, 2, eVar.f11559b);
        a.x(parcel, 3, eVar.f11560c);
        a.B(parcel, 4, eVar.f11561d);
        a.w(parcel, 5, eVar.f11562e);
        a.D(parcel, 6, eVar.f11563f, i10);
        a.v(parcel, 7, eVar.f11564g);
        a.A(parcel, 8, eVar.f11565h, i10);
        a.D(parcel, 10, eVar.f11566i, i10);
        a.D(parcel, 11, eVar.f11567j, i10);
        a.u(parcel, 12, eVar.k);
        a.x(parcel, 13, eVar.f11568l);
        a.u(parcel, 14, eVar.f11569m);
        a.B(parcel, 15, eVar.f11570n);
        a.S(G, parcel);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = s3.b.o(r23)
            com.google.android.gms.common.api.Scope[] r2 = r3.e.f11556o
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            o3.d[] r4 = r3.e.f11557p
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0093
            int r2 = r23.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x008e;
                case 2: goto L_0x0089;
                case 3: goto L_0x0084;
                case 4: goto L_0x007f;
                case 5: goto L_0x007a;
                case 6: goto L_0x0070;
                case 7: goto L_0x006b;
                case 8: goto L_0x0061;
                case 9: goto L_0x0033;
                case 10: goto L_0x0056;
                case 11: goto L_0x004b;
                case 12: goto L_0x0046;
                case 13: goto L_0x0041;
                case 14: goto L_0x003c;
                case 15: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            s3.b.n(r2, r0)
            goto L_0x0025
        L_0x0037:
            java.lang.String r21 = s3.b.c(r2, r0)
            goto L_0x0025
        L_0x003c:
            boolean r20 = s3.b.h(r2, r0)
            goto L_0x0025
        L_0x0041:
            int r19 = s3.b.j(r2, r0)
            goto L_0x0025
        L_0x0046:
            boolean r18 = s3.b.h(r2, r0)
            goto L_0x0025
        L_0x004b:
            android.os.Parcelable$Creator<o3.d> r3 = o3.d.CREATOR
            java.lang.Object[] r2 = s3.b.e(r0, r2, r3)
            r17 = r2
            o3.d[] r17 = (o3.d[]) r17
            goto L_0x0025
        L_0x0056:
            android.os.Parcelable$Creator<o3.d> r3 = o3.d.CREATOR
            java.lang.Object[] r2 = s3.b.e(r0, r2, r3)
            r16 = r2
            o3.d[] r16 = (o3.d[]) r16
            goto L_0x0025
        L_0x0061:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = s3.b.b(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006b:
            android.os.Bundle r14 = s3.b.a(r2, r0)
            goto L_0x0025
        L_0x0070:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = s3.b.e(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007a:
            android.os.IBinder r12 = s3.b.i(r2, r0)
            goto L_0x0025
        L_0x007f:
            java.lang.String r11 = s3.b.c(r2, r0)
            goto L_0x0025
        L_0x0084:
            int r10 = s3.b.j(r2, r0)
            goto L_0x0025
        L_0x0089:
            int r9 = s3.b.j(r2, r0)
            goto L_0x0025
        L_0x008e:
            int r8 = s3.b.j(r2, r0)
            goto L_0x0025
        L_0x0093:
            s3.b.g(r1, r0)
            r3.e r0 = new r3.e
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.a1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
