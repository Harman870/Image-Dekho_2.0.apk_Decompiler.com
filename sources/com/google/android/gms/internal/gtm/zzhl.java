package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzhl extends zzav implements zzhm {
    public zzhl() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public static zzhm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        return queryLocalInterface instanceof zzhm ? (zzhm) queryLocalInterface : new zzhk(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r11 = 1
            if (r8 == r11) goto L_0x006b
            r0 = 2
            if (r8 == r0) goto L_0x003c
            r0 = 3
            if (r8 == r0) goto L_0x0038
            r0 = 101(0x65, float:1.42E-43)
            if (r8 == r0) goto L_0x0017
            r9 = 102(0x66, float:1.43E-43)
            if (r8 == r9) goto L_0x0013
            r8 = 0
            return r8
        L_0x0013:
            r7.zze()
            goto L_0x007d
        L_0x0017:
            java.lang.String r1 = r9.readString()
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.gtm.zzaw.zza(r9, r8)
            r2 = r8
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = r9.readString()
            long r4 = r9.readLong()
            boolean r6 = com.google.android.gms.internal.gtm.zzaw.zzf(r9)
            com.google.android.gms.internal.gtm.zzaw.zzc(r9)
            r0 = r7
            r0.zzf(r1, r2, r3, r4, r6)
            goto L_0x007d
        L_0x0038:
            r7.zzi()
            goto L_0x007d
        L_0x003c:
            java.lang.String r8 = r9.readString()
            java.lang.String r0 = r9.readString()
            java.lang.String r1 = r9.readString()
            android.os.IBinder r2 = r9.readStrongBinder()
            if (r2 != 0) goto L_0x0050
            r2 = 0
            goto L_0x0064
        L_0x0050:
            java.lang.String r3 = "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.gtm.zzhj
            if (r4 == 0) goto L_0x005e
            r2 = r3
            com.google.android.gms.internal.gtm.zzhj r2 = (com.google.android.gms.internal.gtm.zzhj) r2
            goto L_0x0064
        L_0x005e:
            com.google.android.gms.internal.gtm.zzhh r3 = new com.google.android.gms.internal.gtm.zzhh
            r3.<init>(r2)
            r2 = r3
        L_0x0064:
            com.google.android.gms.internal.gtm.zzaw.zzc(r9)
            r7.zzh(r8, r0, r1, r2)
            goto L_0x007d
        L_0x006b:
            java.lang.String r8 = r9.readString()
            java.lang.String r0 = r9.readString()
            java.lang.String r1 = r9.readString()
            com.google.android.gms.internal.gtm.zzaw.zzc(r9)
            r7.zzg(r8, r0, r1)
        L_0x007d:
            r10.writeNoException()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzhl.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
