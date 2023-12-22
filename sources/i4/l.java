package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class l implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.c(readInt, parcel2);
                    break;
                case 3:
                    str2 = b.c(readInt, parcel2);
                    break;
                case 4:
                    str3 = b.c(readInt, parcel2);
                    break;
                case 5:
                    str4 = b.c(readInt, parcel2);
                    break;
                case 6:
                    str5 = b.c(readInt, parcel2);
                    break;
                case 7:
                    str6 = b.c(readInt, parcel2);
                    break;
                case 8:
                    str7 = b.c(readInt, parcel2);
                    break;
                case 9:
                    str8 = b.c(readInt, parcel2);
                    break;
                case 10:
                    z9 = b.h(readInt, parcel2);
                    break;
                case 11:
                    z10 = b.h(readInt, parcel2);
                    break;
                case 12:
                    str9 = b.c(readInt, parcel2);
                    break;
                case 13:
                    str10 = b.c(readInt, parcel2);
                    break;
                case 14:
                    str11 = b.c(readInt, parcel2);
                    break;
                case 15:
                    str12 = b.c(readInt, parcel2);
                    break;
                case 16:
                    z11 = b.h(readInt, parcel2);
                    break;
                case 17:
                    str13 = b.c(readInt, parcel2);
                    break;
                default:
                    b.n(readInt, parcel2);
                    break;
            }
        }
        b.g(o10, parcel2);
        return new k(str, str2, str3, str4, str5, str6, str7, str8, z9, z10, str9, str10, str11, str12, z11, str13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
