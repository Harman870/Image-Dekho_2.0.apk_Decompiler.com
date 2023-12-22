package i6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class f0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z9 = false;
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
                    str5 = b.c(readInt, parcel);
                    break;
                case 4:
                    str4 = b.c(readInt, parcel);
                    break;
                case 5:
                    str3 = b.c(readInt, parcel);
                    break;
                case 6:
                    str6 = b.c(readInt, parcel);
                    break;
                case 7:
                    z9 = b.h(readInt, parcel);
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
        return new e0(str, str2, str3, str4, str5, str6, z9, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0[i10];
    }
}
