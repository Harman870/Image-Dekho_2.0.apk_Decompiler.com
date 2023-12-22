package h6;

import android.os.Parcel;
import android.os.Parcelable;
import i4.k;
import s3.b;

public final class c0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        k kVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.c(readInt, parcel);
                    break;
                case 2:
                    str2 = b.c(readInt, parcel);
                    break;
                case 3:
                    str3 = b.c(readInt, parcel);
                    break;
                case 4:
                    kVar = (k) b.b(parcel, readInt, k.CREATOR);
                    break;
                case 5:
                    str4 = b.c(readInt, parcel);
                    break;
                case 6:
                    str5 = b.c(readInt, parcel);
                    break;
                case 7:
                    str6 = b.c(readInt, parcel);
                    break;
                default:
                    b.n(readInt, parcel);
                    break;
            }
        }
        b.g(o10, parcel);
        return new b0(str, str2, str3, kVar, str4, str5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b0[i10];
    }
}
