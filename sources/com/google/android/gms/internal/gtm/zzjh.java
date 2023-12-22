package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import androidx.fragment.app.w0;
import com.google.android.gms.tagmanager.zzcf;
import com.google.android.gms.tagmanager.zzco;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.o;
import v3.a;

public final class zzjh {
    private static final Pattern zza = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    private static volatile zzjh zzb;
    /* access modifiers changed from: private */
    public final Context zzd;
    /* access modifiers changed from: private */
    public final zzco zze;
    /* access modifiers changed from: private */
    public final zzjq zzf;
    /* access modifiers changed from: private */
    public final ExecutorService zzg;
    private final ScheduledExecutorService zzh;
    /* access modifiers changed from: private */
    public final zzhv zzi;
    private final zzjc zzj;
    /* access modifiers changed from: private */
    public final Object zzk = new Object();
    private String zzl;
    private String zzm;
    /* access modifiers changed from: private */
    public int zzn = 1;
    /* access modifiers changed from: private */
    public final Queue zzo = new LinkedList();
    /* access modifiers changed from: private */
    public volatile boolean zzp = false;
    private volatile boolean zzq = false;

    static {
        new zzir();
    }

    public zzjh(Context context, zzco zzco, zzcf zzcf, zzjq zzjq, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zzhv zzhv, zzjc zzjc) {
        o.h(context);
        o.h(zzco);
        this.zzd = context;
        this.zze = zzco;
        this.zzf = zzjq;
        this.zzg = executorService;
        this.zzh = scheduledExecutorService;
        this.zzi = zzhv;
        this.zzj = zzjc;
    }

    public static zzjh zzf(Context context, zzco zzco, zzcf zzcf) {
        o.h(context);
        zzjh zzjh = zzb;
        if (zzjh == null) {
            synchronized (zzjh.class) {
                zzjh = zzb;
                if (zzjh == null) {
                    zzjh = new zzjh(context, zzco, zzcf, new zzjq(context, a.b()), zzjn.zza(context), zzjp.zza, zzhv.zza(), new zzjc(context));
                    zzb = zzjh;
                }
            }
        }
        return zzjh;
    }

    /* access modifiers changed from: private */
    public final Pair zzp(String[] strArr) {
        String str;
        String str2;
        zzho.zzd("Looking up container asset.");
        String str3 = this.zzl;
        if (str3 != null && (str2 = this.zzm) != null) {
            return Pair.create(str3, str2);
        }
        try {
            String[] zzb2 = this.zzj.zzb("containers");
            boolean z9 = false;
            for (int i10 = 0; i10 < zzb2.length; i10++) {
                Pattern pattern = zza;
                Matcher matcher = pattern.matcher(zzb2[i10]);
                if (!matcher.matches()) {
                    str = String.format("Ignoring container asset %s (does not match %s)", new Object[]{zzb2[i10], pattern.pattern()});
                } else if (!z9) {
                    this.zzl = matcher.group(1);
                    this.zzm = w0.d("containers", File.separator, zzb2[i10]);
                    zzho.zzd("Asset found for container ".concat(String.valueOf(this.zzl)));
                    z9 = true;
                } else {
                    str = "Extra container asset found, will not be loaded: ".concat(String.valueOf(zzb2[i10]));
                }
                zzho.zze(str);
            }
            if (!z9) {
                zzho.zze("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] zza2 = this.zzj.zza();
                    boolean z10 = false;
                    for (int i11 = 0; i11 < zza2.length; i11++) {
                        Matcher matcher2 = zza.matcher(zza2[i11]);
                        if (matcher2.matches()) {
                            if (!z10) {
                                String group = matcher2.group(1);
                                this.zzl = group;
                                this.zzm = zza2[i11];
                                zzho.zzd("Asset found for container ".concat(String.valueOf(group)));
                                zzho.zze("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z10 = true;
                            } else {
                                zzho.zze("Extra container asset found, will not be loaded: ".concat(String.valueOf(zza2[i11])));
                            }
                        }
                    }
                } catch (IOException e10) {
                    zzho.zzb("Failed to enumerate assets.", e10);
                    return Pair.create((Object) null, (Object) null);
                }
            }
            return Pair.create(this.zzl, this.zzm);
        } catch (IOException e11) {
            zzho.zzb(String.format("Failed to enumerate assets in folder %s", new Object[]{"containers"}), e11);
            return Pair.create((Object) null, (Object) null);
        }
    }

    public final void zzm(String[] strArr) {
        zzho.zzd("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzk) {
            if (!this.zzp) {
                try {
                    Context context = this.zzd;
                    try {
                        ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService"), 0);
                        if (serviceInfo != null && serviceInfo.enabled) {
                            Pair zzp2 = zzp((String[]) null);
                            String str = (String) zzp2.first;
                            String str2 = (String) zzp2.second;
                            if (str == null || str2 == null) {
                                zzho.zze("Tag Manager's event handler WILL NOT be installed (no container loaded)");
                            } else {
                                zzho.zzc("Loading container " + str);
                                this.zzg.execute(new zziw(this, str, str2, (String) null));
                                this.zzh.schedule(new zziy(this), 5000, TimeUnit.MILLISECONDS);
                                if (!this.zzq) {
                                    zzho.zzc("Installing Tag Manager event handler.");
                                    this.zzq = true;
                                    this.zze.zze(new zzit(this));
                                    try {
                                        this.zze.zzd(new zziv(this));
                                    } catch (RemoteException e10) {
                                        zzgv.zzb("Error communicating with measurement proxy: ", e10, this.zzd);
                                    }
                                    this.zzd.registerComponentCallbacks(new zzja(this));
                                    zzho.zzc("Tag Manager event handler installed.");
                                }
                            }
                            this.zzp = true;
                            zzho.zzc("Tag Manager initialization took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    zzho.zze("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                    this.zzp = true;
                } catch (RemoteException e11) {
                    zzgv.zzb("Error communicating with measurement proxy: ", e11, this.zzd);
                } catch (Throwable th) {
                    this.zzp = true;
                    throw th;
                }
            }
        }
    }

    public final void zzn(Uri uri) {
        this.zzg.execute(new zzjb(this, uri));
    }
}
