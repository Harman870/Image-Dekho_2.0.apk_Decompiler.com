package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.gtm.zzav;

public abstract class zzcq extends zzav implements zzcr {
    public zzcq() {
        super("com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public static zzcr asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        return queryLocalInterface instanceof zzcr ? (zzcr) queryLocalInterface : new zzcp(iBinder);
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r13v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            java.lang.String r13 = "com.google.android.gms.tagmanager.ICustomEvaluatorProxy"
            java.lang.String r0 = "com.google.android.gms.tagmanager.IMeasurementProxy"
            r1 = 1
            r2 = 0
            if (r10 == r1) goto L_0x007b
            r3 = 2
            if (r10 == r3) goto L_0x0064
            r3 = 3
            if (r10 == r3) goto L_0x0010
            r10 = 0
            return r10
        L_0x0010:
            android.os.Parcelable$Creator r10 = android.content.Intent.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.gtm.zzaw.zza(r11, r10)
            r4 = r10
            android.content.Intent r4 = (android.content.Intent) r4
            android.os.IBinder r10 = r11.readStrongBinder()
            z3.a r5 = z3.a.C0177a.E(r10)
            android.os.IBinder r10 = r11.readStrongBinder()
            z3.a r6 = z3.a.C0177a.E(r10)
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0031
            r7 = r2
            goto L_0x0042
        L_0x0031:
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.tagmanager.zzco
            if (r3 == 0) goto L_0x003c
            com.google.android.gms.tagmanager.zzco r0 = (com.google.android.gms.tagmanager.zzco) r0
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.tagmanager.zzcm r0 = new com.google.android.gms.tagmanager.zzcm
            r0.<init>(r10)
        L_0x0041:
            r7 = r0
        L_0x0042:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x004a
        L_0x0048:
            r8 = r2
            goto L_0x005c
        L_0x004a:
            android.os.IInterface r13 = r10.queryLocalInterface(r13)
            boolean r0 = r13 instanceof com.google.android.gms.tagmanager.zzcf
            if (r0 == 0) goto L_0x0056
            r2 = r13
            com.google.android.gms.tagmanager.zzcf r2 = (com.google.android.gms.tagmanager.zzcf) r2
            goto L_0x0048
        L_0x0056:
            com.google.android.gms.tagmanager.zzcd r2 = new com.google.android.gms.tagmanager.zzcd
            r2.<init>(r10)
            goto L_0x0048
        L_0x005c:
            com.google.android.gms.internal.gtm.zzaw.zzc(r11)
            r3 = r9
            r3.previewIntent(r4, r5, r6, r7, r8)
            goto L_0x00b9
        L_0x0064:
            android.os.Parcelable$Creator r10 = android.content.Intent.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.gtm.zzaw.zza(r11, r10)
            android.content.Intent r10 = (android.content.Intent) r10
            android.os.IBinder r13 = r11.readStrongBinder()
            z3.a r13 = z3.a.C0177a.E(r13)
            com.google.android.gms.internal.gtm.zzaw.zzc(r11)
            r9.preview(r10, r13)
            goto L_0x00b9
        L_0x007b:
            android.os.IBinder r10 = r11.readStrongBinder()
            z3.a r10 = z3.a.C0177a.E(r10)
            android.os.IBinder r3 = r11.readStrongBinder()
            if (r3 != 0) goto L_0x008b
            r0 = r2
            goto L_0x009b
        L_0x008b:
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r4 = r0 instanceof com.google.android.gms.tagmanager.zzco
            if (r4 == 0) goto L_0x0096
            com.google.android.gms.tagmanager.zzco r0 = (com.google.android.gms.tagmanager.zzco) r0
            goto L_0x009b
        L_0x0096:
            com.google.android.gms.tagmanager.zzcm r0 = new com.google.android.gms.tagmanager.zzcm
            r0.<init>(r3)
        L_0x009b:
            android.os.IBinder r3 = r11.readStrongBinder()
            if (r3 != 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            android.os.IInterface r13 = r3.queryLocalInterface(r13)
            boolean r2 = r13 instanceof com.google.android.gms.tagmanager.zzcf
            if (r2 == 0) goto L_0x00ae
            r2 = r13
            com.google.android.gms.tagmanager.zzcf r2 = (com.google.android.gms.tagmanager.zzcf) r2
            goto L_0x00b3
        L_0x00ae:
            com.google.android.gms.tagmanager.zzcd r2 = new com.google.android.gms.tagmanager.zzcd
            r2.<init>(r3)
        L_0x00b3:
            com.google.android.gms.internal.gtm.zzaw.zzc(r11)
            r9.initialize(r10, r0, r2)
        L_0x00b9:
            r12.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzcq.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
