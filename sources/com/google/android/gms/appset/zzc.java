package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.zza);
        y3.a.x(parcel, 2, this.zzb);
        y3.a.S(G, parcel);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
