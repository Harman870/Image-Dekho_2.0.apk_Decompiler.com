package com.google.android.gms.internal.gtm;

import i3.n;
import j3.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbd extends n {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", (Object) null);
        return n.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(n nVar) {
        zzbd zzbd = (zzbd) nVar;
        zzbd.zza.addAll(this.zza);
        zzbd.zzb.addAll(this.zzb);
        for (Map.Entry entry : this.zzc.entrySet()) {
            String str = (String) entry.getKey();
            for (a aVar : (List) entry.getValue()) {
                if (aVar != null) {
                    String str2 = str == null ? "" : str;
                    if (!zzbd.zzc.containsKey(str2)) {
                        zzbd.zzc.put(str2, new ArrayList());
                    }
                    ((List) zzbd.zzc.get(str2)).add(aVar);
                }
            }
        }
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map zzf() {
        return this.zzc;
    }
}
