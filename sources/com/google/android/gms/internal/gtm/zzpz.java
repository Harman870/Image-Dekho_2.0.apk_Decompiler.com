package com.google.android.gms.internal.gtm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class zzpz implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ byte[] zzb;
    public final /* synthetic */ zzqa zzc;

    public zzpz(zzqa zzqa, String str, byte[] bArr) {
        this.zzc = zzqa;
        this.zza = str;
        this.zzb = bArr;
    }

    public final void run() {
        zzqa zzqa = this.zzc;
        String str = this.zza;
        byte[] bArr = this.zzb;
        File zzb2 = zzqa.zzb(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zzb2);
            try {
                fileOutputStream.write(bArr);
                try {
                    fileOutputStream.close();
                    zzho.zzd("Resource " + str + " saved on Disk.");
                } catch (IOException unused) {
                    zzho.zza("Error closing stream for writing resource to disk");
                }
            } catch (IOException unused2) {
                zzho.zza("Error writing resource to disk. Removing resource from disk");
                zzb2.delete();
                try {
                    fileOutputStream.close();
                    zzho.zzd("Resource " + str + " saved on Disk.");
                } catch (IOException unused3) {
                    zzho.zza("Error closing stream for writing resource to disk");
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    zzho.zzd("Resource " + str + " saved on Disk.");
                } catch (IOException unused4) {
                    zzho.zza("Error closing stream for writing resource to disk");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zzho.zza("Error opening resource file for writing");
        }
    }
}
