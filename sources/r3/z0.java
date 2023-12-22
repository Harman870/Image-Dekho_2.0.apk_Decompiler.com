package r3;

import android.os.Parcelable;

public final class z0 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r11.setDataPosition(r3 + r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = s3.b.o(r11)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r9 = r7
            r5 = r2
            r6 = r5
            r8 = r6
        L_0x000c:
            int r2 = r11.dataPosition()
            if (r2 >= r0) goto L_0x005d
            int r2 = r11.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004e;
                case 3: goto L_0x0049;
                case 4: goto L_0x0038;
                case 5: goto L_0x0033;
                case 6: goto L_0x001e;
                default: goto L_0x001a;
            }
        L_0x001a:
            s3.b.n(r2, r11)
            goto L_0x000c
        L_0x001e:
            int r2 = s3.b.m(r2, r11)
            int r3 = r11.dataPosition()
            if (r2 != 0) goto L_0x002a
            r9 = r1
            goto L_0x000c
        L_0x002a:
            int[] r9 = r11.createIntArray()
        L_0x002e:
            int r3 = r3 + r2
            r11.setDataPosition(r3)
            goto L_0x000c
        L_0x0033:
            int r8 = s3.b.j(r2, r11)
            goto L_0x000c
        L_0x0038:
            int r2 = s3.b.m(r2, r11)
            int r3 = r11.dataPosition()
            if (r2 != 0) goto L_0x0044
            r7 = r1
            goto L_0x000c
        L_0x0044:
            int[] r7 = r11.createIntArray()
            goto L_0x002e
        L_0x0049:
            boolean r6 = s3.b.h(r2, r11)
            goto L_0x000c
        L_0x004e:
            boolean r5 = s3.b.h(r2, r11)
            goto L_0x000c
        L_0x0053:
            android.os.Parcelable$Creator<r3.q> r3 = r3.q.CREATOR
            android.os.Parcelable r2 = s3.b.b(r11, r2, r3)
            r4 = r2
            r3.q r4 = (r3.q) r4
            goto L_0x000c
        L_0x005d:
            s3.b.g(r0, r11)
            r3.d r11 = new r3.d
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.z0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
