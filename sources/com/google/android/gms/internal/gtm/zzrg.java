package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r3.o;

public final class zzrg extends zzqz {
    private static final Map zzb;
    /* access modifiers changed from: private */
    public final ArrayList zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("concat", new zzjz());
        hashMap.put("every", new zzka());
        hashMap.put("filter", new zzkb());
        hashMap.put("forEach", new zzkc());
        hashMap.put("indexOf", new zzkd());
        hashMap.put("hasOwnProperty", zzlx.zza);
        hashMap.put("join", new zzke());
        hashMap.put("lastIndexOf", new zzkf());
        hashMap.put("map", new zzkg());
        hashMap.put("pop", new zzkh());
        hashMap.put("push", new zzki());
        hashMap.put("reduce", new zzkj());
        hashMap.put("reduceRight", new zzkk());
        hashMap.put("reverse", new zzkl());
        hashMap.put("shift", new zzkm());
        hashMap.put("slice", new zzkn());
        hashMap.put("some", new zzko());
        hashMap.put("sort", new zzks());
        hashMap.put("splice", new zzkt());
        hashMap.put("toString", new zzmz());
        hashMap.put("unshift", new zzku());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrg(List list) {
        o.h(list);
        this.zzc = new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrg)) {
            return false;
        }
        ArrayList arrayList = ((zzrg) obj).zzc;
        if (this.zzc.size() != arrayList.size()) {
            return false;
        }
        boolean z9 = true;
        for (int i10 = 0; i10 < this.zzc.size(); i10++) {
            z9 = this.zzc.get(i10) == null ? arrayList.get(i10) == null : ((zzqz) this.zzc.get(i10)).equals(arrayList.get(i10));
            if (!z9) {
                break;
            }
        }
        return z9;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException(w0.d("Native Method ", str, " is not defined for type ListWrapper."));
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final Iterator zze() {
        return new zzrf(this, new zzre(this), super.zzd());
    }

    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzqz zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzc.size()) {
            return zzrd.zze;
        }
        zzqz zzqz = (zzqz) this.zzc.get(i10);
        return zzqz == null ? zzrd.zze : zzqz;
    }

    public final List zzk() {
        return this.zzc;
    }

    public final void zzl(int i10, zzqz zzqz) {
        if (i10 >= 0) {
            if (i10 >= this.zzc.size()) {
                zzm(i10 + 1);
            }
            this.zzc.set(i10, zzqz);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void zzm(int i10) {
        o.a("Invalid array length", i10 >= 0);
        if (this.zzc.size() != i10) {
            if (this.zzc.size() < i10) {
                this.zzc.ensureCapacity(i10);
                for (int size = this.zzc.size(); size < i10; size++) {
                    this.zzc.add((Object) null);
                }
                return;
            }
            ArrayList arrayList = this.zzc;
            arrayList.subList(i10, arrayList.size()).clear();
        }
    }

    public final boolean zzn(int i10) {
        return i10 >= 0 && i10 < this.zzc.size() && this.zzc.get(i10) != null;
    }
}
