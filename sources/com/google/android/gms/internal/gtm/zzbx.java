package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import i3.t;
import java.util.ArrayList;
import java.util.Iterator;
import r3.o;
import w3.b;
import y3.a;

@SuppressLint({"StaticFieldLeak"})
public final class zzbx {
    private static volatile zzbx zza;
    private final Context zzb;
    private final Context zzc;
    private final b zzd = a.P;
    private final zzcv zze = new zzcv(this);
    private final zzfd zzf;
    private final t zzg;
    private final zzbs zzh;
    private final zzda zzi;
    private final zzfv zzj;
    private final zzfj zzk;
    private final i3.b zzl;
    private final zzcp zzm;
    private final zzbk zzn;
    private final zzch zzo;
    private final zzcz zzp;

    public zzbx(zzby zzby) {
        Context zza2 = zzby.zza();
        o.i(zza2, "Application context can't be null");
        Context zzb2 = zzby.zzb();
        o.h(zzb2);
        this.zzb = zza2;
        this.zzc = zzb2;
        zzfd zzfd = new zzfd(this);
        zzfd.zzW();
        this.zzf = zzfd;
        zzfd zzm2 = zzm();
        String str = zzbv.zza;
        zzm2.zzL("Google Analytics " + str + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfj zzfj = new zzfj(this);
        zzfj.zzW();
        this.zzk = zzfj;
        zzfv zzfv = new zzfv(this);
        zzfv.zzW();
        this.zzj = zzfv;
        zzbs zzbs = new zzbs(this, zzby);
        zzcp zzcp = new zzcp(this);
        zzbk zzbk = new zzbk(this);
        zzch zzch = new zzch(this);
        zzcz zzcz = new zzcz(this);
        if (t.f7161f == null) {
            synchronized (t.class) {
                if (t.f7161f == null) {
                    t.f7161f = new t(zza2);
                }
            }
        }
        t tVar = t.f7161f;
        tVar.f7166e = new zzbw(this);
        this.zzg = tVar;
        i3.b bVar = new i3.b(this);
        zzcp.zzW();
        this.zzm = zzcp;
        zzbk.zzW();
        this.zzn = zzbk;
        zzch.zzW();
        this.zzo = zzch;
        zzcz.zzW();
        this.zzp = zzcz;
        zzda zzda = new zzda(this);
        zzda.zzW();
        this.zzi = zzda;
        zzbs.zzW();
        this.zzh = zzbs;
        zzfv zzq = bVar.f7139d.zzq();
        zzq.zzf();
        if (zzq.zze()) {
            bVar.f7124g = zzq.zzc();
        }
        zzq.zzf();
        bVar.f7123f = true;
        this.zzl = bVar;
        zzbs.zzm();
    }

    public static zzbx zzg(Context context) {
        o.h(context);
        if (zza == null) {
            synchronized (zzbx.class) {
                if (zza == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzbx zzbx = new zzbx(new zzby(context));
                    zza = zzbx;
                    ArrayList arrayList = i3.b.f7122i;
                    synchronized (i3.b.class) {
                        try {
                            ArrayList arrayList2 = i3.b.f7122i;
                            if (arrayList2 != null) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                i3.b.f7122i = null;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = ((Long) zzew.zzQ.zzb()).longValue();
                    if (elapsedRealtime2 > longValue) {
                        zzbx.zzm().zzS("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbu zzbu) {
        if (zzbu != null) {
            o.a("Analytics service not initialized", zzbu.zzX());
            return;
        }
        throw new NullPointerException("Analytics service not created/initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final i3.b zzc() {
        o.h(this.zzl);
        o.a("Analytics instance not initialized", this.zzl.f7123f);
        return this.zzl;
    }

    public final t zzd() {
        o.h(this.zzg);
        return this.zzg;
    }

    public final zzbk zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbs zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzch zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcp zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzcv zzj() {
        return this.zze;
    }

    public final zzcz zzk() {
        return this.zzp;
    }

    public final zzda zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfd zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfd zzn() {
        return this.zzf;
    }

    public final zzfj zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfj zzp() {
        zzfj zzfj = this.zzk;
        if (zzfj == null || !zzfj.zzX()) {
            return null;
        }
        return zzfj;
    }

    public final zzfv zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final b zzr() {
        return this.zzd;
    }
}
