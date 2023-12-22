package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class d implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.c(readInt, parcel);
                    break;
                case 3:
                    str2 = b.c(readInt, parcel);
                    break;
                case 4:
                    str3 = b.c(readInt, parcel);
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
                case 8:
                    str7 = b.c(readInt, parcel);
                    break;
                default:
                    b.n(readInt, parcel);
                    break;
            }
        }
        b.g(o10, parcel);
        return new c(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
