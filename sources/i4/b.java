package i4;

import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = s3.b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = s3.b.c(readInt, parcel);
            } else if (c10 == 2) {
                str2 = s3.b.c(readInt, parcel);
            } else if (c10 == 3) {
                str3 = s3.b.c(readInt, parcel);
            } else if (c10 != 4) {
                s3.b.n(readInt, parcel);
            } else {
                j10 = s3.b.k(readInt, parcel);
            }
        }
        s3.b.g(o10, parcel);
        return new a(j10, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
