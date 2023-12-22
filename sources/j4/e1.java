package j4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class e1 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z9 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = b.k(readInt, parcel2);
                    break;
                case 2:
                    j11 = b.k(readInt, parcel2);
                    break;
                case 3:
                    z9 = b.h(readInt, parcel2);
                    break;
                case 4:
                    str = b.c(readInt, parcel2);
                    break;
                case 5:
                    str2 = b.c(readInt, parcel2);
                    break;
                case 6:
                    str3 = b.c(readInt, parcel2);
                    break;
                case 7:
                    bundle = b.a(readInt, parcel2);
                    break;
                case 8:
                    str4 = b.c(readInt, parcel2);
                    break;
                default:
                    b.n(readInt, parcel2);
                    break;
            }
        }
        b.g(o10, parcel2);
        return new d1(j10, j11, z9, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d1[i10];
    }
}
