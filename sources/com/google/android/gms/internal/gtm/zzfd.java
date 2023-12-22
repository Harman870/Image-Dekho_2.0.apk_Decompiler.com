package com.google.android.gms.internal.gtm;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import r3.o;

public final class zzfd extends zzbu {
    private static zzfd zza;

    public zzfd(zzbx zzbx) {
        super(zzbx);
    }

    public static zzfd zza() {
        return zza;
    }

    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? obj.toString() : obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
        Long l6 = (Long) obj;
        int i10 = (Math.abs(l6.longValue()) > 100 ? 1 : (Math.abs(l6.longValue()) == 100 ? 0 : -1));
        String obj2 = obj.toString();
        if (i10 < 0) {
            return obj2;
        }
        char charAt = obj2.charAt(0);
        String valueOf = String.valueOf(Math.abs(l6.longValue()));
        StringBuilder sb = new StringBuilder();
        if (charAt != '-') {
            str = "";
        }
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
        sb.append("...");
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d));
        return sb.toString();
    }

    public final void zzb(zzez zzez, String str) {
        zzR("Discarding hit. ".concat(str), zzez != null ? zzez.toString() : "no hit data");
    }

    public final void zzc(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        zzR("Discarding hit. ".concat(str), sb.toString());
    }

    public final void zzd() {
        synchronized (zzfd.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i10, String str, Object obj, Object obj2, Object obj3) {
        char c10;
        o.h(str);
        if (zzw().zzb()) {
            zzw();
            c10 = 'C';
        } else {
            zzw();
            c10 = 'c';
        }
        String str2 = "3" + "01VDIWEA?".charAt(i10) + c10 + zzbv.zza + ":" + zzbt.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
        if (str2.length() > 1024) {
            str2 = str2.substring(0, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        }
        zzfj zzp = zzt().zzp();
        if (zzp != null) {
            zzp.zze().zzc(str2);
        }
    }
}
