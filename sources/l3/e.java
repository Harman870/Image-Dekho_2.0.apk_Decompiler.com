package l3;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class e implements Parcelable.Creator<GoogleSignInOptions> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = s3.b.o(r15)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r8 = r7
            r9 = r8
            r5 = r2
            r6 = r5
            r10 = r6
            r11 = r10
            r13 = r11
        L_0x000f:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x005c
            int r1 = r15.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 1: goto L_0x0057;
                case 2: goto L_0x0050;
                case 3: goto L_0x0046;
                case 4: goto L_0x0041;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x0032;
                case 8: goto L_0x002d;
                case 9: goto L_0x0026;
                case 10: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            s3.b.n(r1, r15)
            goto L_0x000f
        L_0x0021:
            java.lang.String r13 = s3.b.c(r1, r15)
            goto L_0x000f
        L_0x0026:
            android.os.Parcelable$Creator<m3.a> r2 = m3.a.CREATOR
            java.util.ArrayList r2 = s3.b.f(r15, r1, r2)
            goto L_0x000f
        L_0x002d:
            java.lang.String r11 = s3.b.c(r1, r15)
            goto L_0x000f
        L_0x0032:
            java.lang.String r10 = s3.b.c(r1, r15)
            goto L_0x000f
        L_0x0037:
            boolean r9 = s3.b.h(r1, r15)
            goto L_0x000f
        L_0x003c:
            boolean r8 = s3.b.h(r1, r15)
            goto L_0x000f
        L_0x0041:
            boolean r7 = s3.b.h(r1, r15)
            goto L_0x000f
        L_0x0046:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = s3.b.b(r15, r1, r3)
            r6 = r1
            android.accounts.Account r6 = (android.accounts.Account) r6
            goto L_0x000f
        L_0x0050:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r5 = s3.b.f(r15, r1, r3)
            goto L_0x000f
        L_0x0057:
            int r4 = s3.b.j(r1, r15)
            goto L_0x000f
        L_0x005c:
            s3.b.g(r0, r15)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r15 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.HashMap r12 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.y(r2)
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
