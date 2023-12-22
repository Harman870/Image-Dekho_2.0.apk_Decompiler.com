package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

public final class zzqp {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;

    public /* synthetic */ zzqp(List list, List list2, List list3, List list4, zzqo zzqo) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableList(list2);
        this.zzc = Collections.unmodifiableList(list3);
        this.zzd = Collections.unmodifiableList(list4);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        return "Positive predicates: " + valueOf + "  Negative predicates: " + valueOf2 + "  Add tags: " + valueOf3 + "  Remove tags: " + valueOf4;
    }

    public final List zza() {
        return this.zzc;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zza;
    }

    public final List zzd() {
        return this.zzd;
    }
}
