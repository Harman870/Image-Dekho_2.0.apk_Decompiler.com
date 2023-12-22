package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    private final String zza;
    private final String zzb;

    public zza(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.zza);
        y3.a.B(parcel, 2, this.zzb);
        y3.a.S(G, parcel);
    }
}
