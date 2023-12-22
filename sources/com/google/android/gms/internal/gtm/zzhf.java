package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import w3.b;
import y3.a;

final class zzhf extends Thread implements zzhd {
    private static zzhf zza;
    private final LinkedBlockingQueue zzb = new LinkedBlockingQueue();
    private volatile boolean zzc = false;
    /* access modifiers changed from: private */
    public volatile zzhg zze;
    /* access modifiers changed from: private */
    public final Context zzf;
    private final b zzg = a.P;

    private zzhf(Context context) {
        super("GAThread");
        this.zzf = context != null ? context.getApplicationContext() : null;
        start();
    }

    public static zzhf zzd(Context context) {
        if (zza == null) {
            zza = new zzhf(context);
        }
        return zza;
    }

    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.zzb.take();
                if (!this.zzc) {
                    runnable.run();
                }
            } catch (InterruptedException e10) {
                try {
                    zzho.zzc(e10.toString());
                } catch (Exception e11) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    e11.printStackTrace(printStream);
                    printStream.flush();
                    zzho.zza("Error on Google TagManager Thread: ".concat(new String(byteArrayOutputStream.toByteArray())));
                    zzho.zza("Google TagManager is shutting down.");
                    this.zzc = true;
                }
            }
        }
    }

    public final void zza(Runnable runnable) {
        this.zzb.add(runnable);
    }

    public final void zzb(String str, String str2, String str3, Map map, String str4) {
        this.zzb.add(new zzhe(this, this, this.zzg.currentTimeMillis(), str, str2, str3, map, str4));
    }
}
