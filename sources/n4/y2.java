package n4;

import j4.i0;

public abstract class y2 extends i0 implements z2 {
    public y2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0177, code lost:
        r11.writeNoException();
        r11.writeTypedList(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01fd, code lost:
        r11.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0200, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r9, android.os.Parcel r10, android.os.Parcel r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            switch(r9) {
                case 1: goto L_0x01e4;
                case 2: goto L_0x01ca;
                case 3: goto L_0x0005;
                case 4: goto L_0x01b8;
                case 5: goto L_0x0191;
                case 6: goto L_0x017f;
                case 7: goto L_0x015e;
                case 8: goto L_0x0005;
                case 9: goto L_0x0140;
                case 10: goto L_0x0125;
                case 11: goto L_0x010b;
                case 12: goto L_0x00f0;
                case 13: goto L_0x00c1;
                case 14: goto L_0x009c;
                case 15: goto L_0x007b;
                case 16: goto L_0x005f;
                case 17: goto L_0x0047;
                case 18: goto L_0x0034;
                case 19: goto L_0x0019;
                case 20: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return r0
        L_0x0006:
            android.os.Parcelable$Creator<n4.g8> r9 = n4.g8.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.g8 r9 = (n4.g8) r9
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.r(r9)
            goto L_0x01fd
        L_0x0019:
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.Parcelable$Creator<n4.g8> r0 = n4.g8.CREATOR
            android.os.Parcelable r0 = j4.j0.a(r10, r0)
            n4.g8 r0 = (n4.g8) r0
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.i(r9, r0)
            goto L_0x01fd
        L_0x0034:
            android.os.Parcelable$Creator<n4.g8> r9 = n4.g8.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.g8 r9 = (n4.g8) r9
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.v(r9)
            goto L_0x01fd
        L_0x0047:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            java.lang.String r2 = r10.readString()
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            java.util.List r9 = r10.zzg(r9, r0, r2)
            goto L_0x0177
        L_0x005f:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            android.os.Parcelable$Creator<n4.g8> r2 = n4.g8.CREATOR
            android.os.Parcelable r2 = j4.j0.a(r10, r2)
            n4.g8 r2 = (n4.g8) r2
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            java.util.List r9 = r10.A(r9, r0, r2)
            goto L_0x0177
        L_0x007b:
            java.lang.String r9 = r10.readString()
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            java.lang.ClassLoader r4 = j4.j0.f8270a
            int r4 = r10.readInt()
            if (r4 == 0) goto L_0x0090
            r0 = r1
        L_0x0090:
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            java.util.List r9 = r10.n(r9, r2, r3, r0)
            goto L_0x0177
        L_0x009c:
            java.lang.String r9 = r10.readString()
            java.lang.String r2 = r10.readString()
            java.lang.ClassLoader r3 = j4.j0.f8270a
            int r3 = r10.readInt()
            if (r3 == 0) goto L_0x00ad
            r0 = r1
        L_0x00ad:
            android.os.Parcelable$Creator<n4.g8> r3 = n4.g8.CREATOR
            android.os.Parcelable r3 = j4.j0.a(r10, r3)
            n4.g8 r3 = (n4.g8) r3
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            java.util.List r9 = r10.s(r9, r2, r0, r3)
            goto L_0x0177
        L_0x00c1:
            android.os.Parcelable$Creator<n4.c> r9 = n4.c.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.c r9 = (n4.c) r9
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r3.o.h(r9)
            n4.z7 r0 = r9.f9642c
            r3.o.h(r0)
            java.lang.String r0 = r9.f9640a
            r3.o.e(r0)
            java.lang.String r0 = r9.f9640a
            r10.E(r0, r1)
            n4.c r0 = new n4.c
            r0.<init>(r9)
            q3.i0 r9 = new q3.i0
            r9.<init>(r10, r1, r0)
            r10.c(r9)
            goto L_0x01fd
        L_0x00f0:
            android.os.Parcelable$Creator<n4.c> r9 = n4.c.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.c r9 = (n4.c) r9
            android.os.Parcelable$Creator<n4.g8> r0 = n4.g8.CREATOR
            android.os.Parcelable r0 = j4.j0.a(r10, r0)
            n4.g8 r0 = (n4.g8) r0
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.k(r9, r0)
            goto L_0x01fd
        L_0x010b:
            android.os.Parcelable$Creator<n4.g8> r9 = n4.g8.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.g8 r9 = (n4.g8) r9
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            java.lang.String r9 = r10.t(r9)
            r11.writeNoException()
            r11.writeString(r9)
            goto L_0x0200
        L_0x0125:
            long r3 = r10.readLong()
            java.lang.String r5 = r10.readString()
            java.lang.String r6 = r10.readString()
            java.lang.String r7 = r10.readString()
            j4.j0.b(r10)
            r2 = r8
            n4.z4 r2 = (n4.z4) r2
            r2.f(r3, r5, r6, r7)
            goto L_0x01fd
        L_0x0140:
            android.os.Parcelable$Creator<n4.r> r9 = n4.r.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.r r9 = (n4.r) r9
            java.lang.String r0 = r10.readString()
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            byte[] r9 = r10.u(r9, r0)
            r11.writeNoException()
            r11.writeByteArray(r9)
            goto L_0x0200
        L_0x015e:
            android.os.Parcelable$Creator<n4.g8> r9 = n4.g8.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.g8 r9 = (n4.g8) r9
            int r2 = r10.readInt()
            if (r2 == 0) goto L_0x016d
            r0 = r1
        L_0x016d:
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            java.util.ArrayList r9 = r10.p(r9, r0)
        L_0x0177:
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L_0x0200
        L_0x017f:
            android.os.Parcelable$Creator<n4.g8> r9 = n4.g8.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.g8 r9 = (n4.g8) r9
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.B(r9)
            goto L_0x01fd
        L_0x0191:
            android.os.Parcelable$Creator<n4.r> r9 = n4.r.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.r r9 = (n4.r) r9
            java.lang.String r2 = r10.readString()
            r10.readString()
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r3.o.h(r9)
            r3.o.e(r2)
            r10.E(r2, r1)
            n4.v4 r3 = new n4.v4
            r3.<init>(r10, r9, r2, r0)
            r10.c(r3)
            goto L_0x01fd
        L_0x01b8:
            android.os.Parcelable$Creator<n4.g8> r9 = n4.g8.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.g8 r9 = (n4.g8) r9
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.y(r9)
            goto L_0x01fd
        L_0x01ca:
            android.os.Parcelable$Creator<n4.z7> r9 = n4.z7.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.z7 r9 = (n4.z7) r9
            android.os.Parcelable$Creator<n4.g8> r0 = n4.g8.CREATOR
            android.os.Parcelable r0 = j4.j0.a(r10, r0)
            n4.g8 r0 = (n4.g8) r0
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.D(r9, r0)
            goto L_0x01fd
        L_0x01e4:
            android.os.Parcelable$Creator<n4.r> r9 = n4.r.CREATOR
            android.os.Parcelable r9 = j4.j0.a(r10, r9)
            n4.r r9 = (n4.r) r9
            android.os.Parcelable$Creator<n4.g8> r0 = n4.g8.CREATOR
            android.os.Parcelable r0 = j4.j0.a(r10, r0)
            n4.g8 r0 = (n4.g8) r0
            j4.j0.b(r10)
            r10 = r8
            n4.z4 r10 = (n4.z4) r10
            r10.q(r9, r0)
        L_0x01fd:
            r11.writeNoException()
        L_0x0200:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.y2.b(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
