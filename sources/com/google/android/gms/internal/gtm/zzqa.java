package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

public final class zzqa {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzpw zzc;

    public zzqa(Context context) {
        ExecutorService zza2 = zzgb.zza().zza(2);
        zzpw zzpw = new zzpw(context);
        this.zza = context;
        this.zzb = zza2;
        this.zzc = zzpw;
    }

    private static final byte[] zzh(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            while (true) {
                int read = inputStream.read(bArr, 0, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused) {
                        zzho.zze("Error closing stream for reading resource from disk");
                        return null;
                    }
                }
            }
        } catch (IOException unused2) {
            try {
                zzho.zze("Failed to read the resource from disk");
                try {
                } catch (IOException unused3) {
                    zzho.zze("Error closing stream for reading resource from disk");
                    return null;
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    zzho.zze("Error closing stream for reading resource from disk");
                    return null;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static final String zzi(String str) {
        return "resource_".concat(String.valueOf(str));
    }

    public final long zza(String str) {
        File zzb2 = zzb(str);
        if (zzb2.exists()) {
            return zzb2.lastModified();
        }
        return 0;
    }

    public final File zzb(String str) {
        return new File(this.zza.getDir("google_tagmanager", 0), zzi(str));
    }

    public final void zzc(String str, String str2, zzpk zzpk) {
        this.zzb.execute(new zzpy(this, str, str2, zzpk));
    }

    public final void zzd(String str, String str2, zzpk zzpk) {
        zzho.zzd("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            zzho.zzd("Default asset file is not specified. Not proceeding with the loading");
        } else {
            try {
                InputStream open = this.zzc.zza.getAssets().open(str2);
                if (open != null) {
                    zzpk.zzc(zzh(open));
                    return;
                } else {
                    zzpk.zzb(0, 2);
                    return;
                }
            } catch (IOException unused) {
                zzho.zza("Default asset file not found. " + str + ". Filename: " + str2);
            }
        }
        zzpk.zzb(0, 2);
    }

    public final void zze(String str, zzpk zzpk) {
        this.zzb.execute(new zzpx(this, str, zzpk));
    }

    public final void zzf(String str, zzpk zzpk) {
        zzho.zzd("Starting to load a saved resource file from Disk.");
        try {
            zzpk.zzc(zzh(new FileInputStream(zzb(str))));
        } catch (FileNotFoundException unused) {
            zzho.zza("Saved resource not found: ".concat(zzi(str)));
            zzpk.zzb(0, 1);
        }
    }

    public final void zzg(String str, byte[] bArr) {
        this.zzb.execute(new zzpz(this, str, bArr));
    }
}
