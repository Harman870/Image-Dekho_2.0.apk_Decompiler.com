package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class zzd implements Parcelable.Creator<zzc> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                i10 = b.j(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new zzc(str, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzc[i10];
    }
}
