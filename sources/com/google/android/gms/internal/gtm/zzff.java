package com.google.android.gms.internal.gtm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import r3.o;

final class zzff {
    public final /* synthetic */ zzfg zza;
    private int zzb;
    private final ByteArrayOutputStream zzc = new ByteArrayOutputStream();

    public zzff(zzfg zzfg) {
        this.zza = zzfg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzez zzez) {
        o.h(zzez);
        int i10 = this.zzb + 1;
        this.zza.zzw();
        if (i10 > zzcv.zzg()) {
            return false;
        }
        String zza2 = this.zza.zza(zzez, false);
        if (zza2 == null) {
            this.zza.zzz().zzb(zzez, "Error formatting hit");
            return true;
        }
        byte[] bytes = zza2.getBytes();
        int length = bytes.length;
        this.zza.zzw();
        if (length > zzcv.zzf()) {
            this.zza.zzz().zzb(zzez, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.zzc.size() > 0) {
            length++;
        }
        int size = this.zzc.size() + length;
        this.zza.zzw();
        if (size > ((Integer) zzew.zzA.zzb()).intValue()) {
            return false;
        }
        try {
            if (this.zzc.size() > 0) {
                this.zzc.write(zzfg.zza);
            }
            this.zzc.write(bytes);
            this.zzb++;
            return true;
        } catch (IOException e10) {
            this.zza.zzJ("Failed to write payload when batching hits", e10);
            return true;
        }
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}
