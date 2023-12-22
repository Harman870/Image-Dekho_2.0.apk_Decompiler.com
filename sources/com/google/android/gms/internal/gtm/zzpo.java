package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.activity.e;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r3.o;
import w3.b;
import y3.a;

public final class zzpo {
    public final Map zza = new HashMap();
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzqa zzc;
    private final b zzd;
    private final Map zze;

    public zzpo(Context context) {
        HashMap hashMap = new HashMap();
        zzqa zzqa = new zzqa(context);
        a aVar = a.P;
        this.zzb = context.getApplicationContext();
        this.zzd = aVar;
        this.zzc = zzqa;
        this.zze = hashMap;
    }

    public final void zzb(zzpt zzpt, List list, int i10, zzpl zzpl, zzgu zzgu) {
        int i11;
        long j10;
        List list2 = list;
        if (i10 == 0) {
            zzho.zzd("Starting to fetch a new resource");
            i11 = 0;
        } else {
            i11 = i10;
        }
        if (i11 >= list.size()) {
            String concat = "There is no valid resource for the container: ".concat(String.valueOf(zzpt.zza().zzb()));
            zzho.zzd(concat);
            zzpl.zza(new zzpv(new Status(16, concat), ((Integer) list2.get(i11 - 1)).intValue(), (zzpu) null, (zzqs) null));
            return;
        }
        zzpl zzpl2 = zzpl;
        int intValue = ((Integer) list2.get(i11)).intValue();
        if (intValue == 0) {
            zzph zza2 = zzpt.zza();
            zzpn zzpn = (zzpn) this.zza.get(zza2.zzb());
            if (!zzpt.zza().zzg()) {
                if (zzpn != null) {
                    j10 = zzpn.zza();
                } else {
                    j10 = this.zzc.zza(zza2.zzb());
                }
                if (j10 + 900000 >= this.zzd.currentTimeMillis()) {
                    zzb(zzpt, list, i11 + 1, zzpl, zzgu);
                    return;
                }
            }
            zzqg zzqg = (zzqg) this.zze.get(zzpt.zzc());
            if (zzqg == null) {
                zzqg = new zzqg();
                this.zze.put(zzpt.zzc(), zzqg);
            }
            zzho.zzd("Attempting to fetch container " + zza2.zzb() + " from network");
            zzqg.zza(this.zzb, zzpt, 0, new zzpm(this, 0, zzpt, zzps.zza, list, i11, zzpl, zzgu));
        } else if (intValue == 1) {
            zzph zza3 = zzpt.zza();
            zzho.zzd("Attempting to fetch container " + zza3.zzb() + " from a saved resource");
            this.zzc.zze(zza3.zzd(), new zzpm(this, 1, zzpt, zzps.zza, list, i11, zzpl, (zzgu) null));
        } else if (intValue == 2) {
            zzph zza4 = zzpt.zza();
            zzho.zzd("Attempting to fetch container " + zza4.zzb() + " from the default resource");
            this.zzc.zzc(zza4.zzd(), zza4.zzc(), new zzpm(this, 2, zzpt, zzps.zza, list, i11, zzpl, (zzgu) null));
        } else {
            throw new UnsupportedOperationException(e.a("Unknown fetching source: ", i11));
        }
    }

    public final void zzc(String str, String str2, String str3, List list, zzpl zzpl, zzgu zzgu) {
        boolean z9;
        o.b(!list.isEmpty());
        zzpt zzpt = new zzpt();
        zzhv zza2 = zzhv.zza();
        if (zza2.zzd()) {
            String str4 = str;
            if (str.equals(zza2.zzc())) {
                z9 = true;
                zzpt.zzb(new zzph(str, str2, str3, z9, zzhv.zza().zzb(), ""));
                zzb(zzpt, Collections.unmodifiableList(list), 0, zzpl, zzgu);
            }
        } else {
            String str5 = str;
        }
        z9 = false;
        zzpt.zzb(new zzph(str, str2, str3, z9, zzhv.zza().zzb(), ""));
        zzb(zzpt, Collections.unmodifiableList(list), 0, zzpl, zzgu);
    }

    public final void zzd(Status status, zzpu zzpu) {
        String zzb2 = zzpu.zzb().zzb();
        zzqj zzc2 = zzpu.zzc();
        if (this.zza.containsKey(zzb2)) {
            zzpn zzpn = (zzpn) this.zza.get(zzb2);
            zzpn.zzc(this.zzd.currentTimeMillis());
            if (status == Status.f2805f) {
                zzpn.zzd(status);
                zzpn.zzb(zzc2);
                return;
            }
            return;
        }
        this.zza.put(zzb2, new zzpn(status, zzc2, this.zzd.currentTimeMillis()));
    }
}
