package com.google.android.gms.internal.gtm;

import i3.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzbb extends n {
    private final Map zza = new HashMap();

    public final String toString() {
        return n.zza(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzc(n nVar) {
        zzbb zzbb = (zzbb) nVar;
        o.h(zzbb);
        zzbb.zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        o.e(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        o.f("Name can not be empty or \"&\"", str);
        this.zza.put(str, str2);
    }
}
