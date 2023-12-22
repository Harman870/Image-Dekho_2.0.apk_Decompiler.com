package h6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class x implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    z9 = b.h(readInt, parcel);
                    break;
                case 4:
                    str3 = b.c(readInt, parcel);
                    break;
                case 5:
                    z10 = b.h(readInt, parcel);
                    break;
                case 6:
                    str4 = b.c(readInt, parcel);
                    break;
                case 7:
                    str5 = b.c(readInt, parcel);
                    break;
                default:
                    b.n(readInt, parcel);
                    break;
            }
        }
        b.g(o10, parcel);
        return new q(str, str2, z9, str3, z10, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
