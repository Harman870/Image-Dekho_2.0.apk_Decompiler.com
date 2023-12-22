package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzav;

public abstract class zzcn extends zzav implements zzco {
    public zzcn() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.tagmanager.zzcl] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.google.android.gms.tagmanager.zzci] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r10 = 2
            if (r7 == r10) goto L_0x005f
            r10 = 11
            if (r7 == r10) goto L_0x0054
            r10 = 21
            r0 = 0
            if (r7 == r10) goto L_0x0033
            r10 = 22
            if (r7 == r10) goto L_0x0012
            r7 = 0
            return r7
        L_0x0012:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r10 = "com.google.android.gms.tagmanager.IMeasurementEventListener"
            android.os.IInterface r10 = r7.queryLocalInterface(r10)
            boolean r0 = r10 instanceof com.google.android.gms.tagmanager.zzci
            if (r0 == 0) goto L_0x0027
            r0 = r10
            com.google.android.gms.tagmanager.zzci r0 = (com.google.android.gms.tagmanager.zzci) r0
            goto L_0x002c
        L_0x0027:
            com.google.android.gms.tagmanager.zzcg r0 = new com.google.android.gms.tagmanager.zzcg
            r0.<init>(r7)
        L_0x002c:
            com.google.android.gms.internal.gtm.zzaw.zzc(r8)
            r6.zzd(r0)
            goto L_0x007b
        L_0x0033:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r10 = "com.google.android.gms.tagmanager.IMeasurementInterceptor"
            android.os.IInterface r10 = r7.queryLocalInterface(r10)
            boolean r0 = r10 instanceof com.google.android.gms.tagmanager.zzcl
            if (r0 == 0) goto L_0x0048
            r0 = r10
            com.google.android.gms.tagmanager.zzcl r0 = (com.google.android.gms.tagmanager.zzcl) r0
            goto L_0x004d
        L_0x0048:
            com.google.android.gms.tagmanager.zzcj r0 = new com.google.android.gms.tagmanager.zzcj
            r0.<init>(r7)
        L_0x004d:
            com.google.android.gms.internal.gtm.zzaw.zzc(r8)
            r6.zze(r0)
            goto L_0x007b
        L_0x0054:
            java.util.Map r7 = r6.zzb()
            r9.writeNoException()
            r9.writeMap(r7)
            goto L_0x007e
        L_0x005f:
            java.lang.String r1 = r8.readString()
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.gtm.zzaw.zza(r8, r7)
            r3 = r7
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r8.readLong()
            com.google.android.gms.internal.gtm.zzaw.zzc(r8)
            r0 = r6
            r0.zzc(r1, r2, r3, r4)
        L_0x007b:
            r9.writeNoException()
        L_0x007e:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzcn.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
