package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import i1.a;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(i1.a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f1259a
            r2 = 1
            boolean r2 = r5.h(r2)
            if (r2 != 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            int r1 = r5.i()
        L_0x0013:
            r0.f1259a = r1
            byte[] r1 = r0.f1261c
            r2 = 2
            boolean r3 = r5.h(r2)
            if (r3 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            byte[] r1 = r5.f()
        L_0x0023:
            r0.f1261c = r1
            android.os.Parcelable r1 = r0.f1262d
            r3 = 3
            boolean r4 = r5.h(r3)
            if (r4 != 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            android.os.Parcelable r1 = r5.j()
        L_0x0033:
            r0.f1262d = r1
            int r1 = r0.f1263e
            r4 = 4
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            int r1 = r5.i()
        L_0x0043:
            r0.f1263e = r1
            int r1 = r0.f1264f
            r4 = 5
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            int r1 = r5.i()
        L_0x0053:
            r0.f1264f = r1
            android.content.res.ColorStateList r1 = r0.f1265g
            r4 = 6
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            android.os.Parcelable r1 = r5.j()
        L_0x0063:
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f1265g = r1
            java.lang.String r1 = r0.f1267i
            r4 = 7
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            java.lang.String r1 = r5.k()
        L_0x0075:
            r0.f1267i = r1
            java.lang.String r1 = r0.f1268j
            r4 = 8
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            java.lang.String r1 = r5.k()
        L_0x0086:
            r0.f1268j = r1
            java.lang.String r5 = r0.f1267i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f1266h = r5
            int r5 = r0.f1259a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00d0;
                case 0: goto L_0x0096;
                case 1: goto L_0x00bf;
                case 2: goto L_0x009c;
                case 3: goto L_0x0097;
                case 4: goto L_0x009c;
                case 5: goto L_0x00bf;
                case 6: goto L_0x009c;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x00df
        L_0x0097:
            byte[] r5 = r0.f1261c
            r0.f1260b = r5
            goto L_0x00df
        L_0x009c:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f1261c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f1260b = r5
            int r3 = r0.f1259a
            if (r3 != r2) goto L_0x00df
            java.lang.String r2 = r0.f1268j
            if (r2 != 0) goto L_0x00df
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r5 = r5.split(r3, r2)
            r5 = r5[r1]
            r0.f1268j = r5
            goto L_0x00df
        L_0x00bf:
            android.os.Parcelable r5 = r0.f1262d
            if (r5 == 0) goto L_0x00c4
            goto L_0x00d4
        L_0x00c4:
            byte[] r5 = r0.f1261c
            r0.f1260b = r5
            r0.f1259a = r3
            r0.f1263e = r1
            int r5 = r5.length
            r0.f1264f = r5
            goto L_0x00df
        L_0x00d0:
            android.os.Parcelable r5 = r0.f1262d
            if (r5 == 0) goto L_0x00d7
        L_0x00d4:
            r0.f1260b = r5
            goto L_0x00df
        L_0x00d7:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(i1.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1267i = iconCompat.f1266h.name();
        switch (iconCompat.f1259a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1262d = (Parcelable) iconCompat.f1260b;
                break;
            case 2:
                iconCompat.f1261c = ((String) iconCompat.f1260b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1261c = (byte[]) iconCompat.f1260b;
                break;
            case 4:
            case 6:
                iconCompat.f1261c = iconCompat.f1260b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1259a;
        if (-1 != i10) {
            aVar.m(1);
            aVar.q(i10);
        }
        byte[] bArr = iconCompat.f1261c;
        if (bArr != null) {
            aVar.m(2);
            aVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.f1262d;
        if (parcelable != null) {
            aVar.m(3);
            aVar.r(parcelable);
        }
        int i11 = iconCompat.f1263e;
        if (i11 != 0) {
            aVar.m(4);
            aVar.q(i11);
        }
        int i12 = iconCompat.f1264f;
        if (i12 != 0) {
            aVar.m(5);
            aVar.q(i12);
        }
        ColorStateList colorStateList = iconCompat.f1265g;
        if (colorStateList != null) {
            aVar.m(6);
            aVar.r(colorStateList);
        }
        String str = iconCompat.f1267i;
        if (str != null) {
            aVar.m(7);
            aVar.s(str);
        }
        String str2 = iconCompat.f1268j;
        if (str2 != null) {
            aVar.m(8);
            aVar.s(str2);
        }
    }
}
