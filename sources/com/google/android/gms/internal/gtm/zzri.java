package com.google.android.gms.internal.gtm;

import java.util.List;
import r3.o;

public final class zzri extends zzqz {
    private final String zzb;
    private final List zzc;

    public zzri(String str, List list) {
        if (str != null) {
            o.h(list);
            this.zzb = str;
            this.zzc = list;
            return;
        }
        throw new NullPointerException("Instruction name must be a string.");
    }

    /* renamed from: toString */
    public final String zzc() {
        String str = this.zzb;
        String obj = this.zzc.toString();
        return "*" + str + ": " + obj;
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zzc;
    }
}
