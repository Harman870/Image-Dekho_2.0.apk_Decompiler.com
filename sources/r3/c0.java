package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class c0 implements Parcelable.Creator<l> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.j(readInt, parcel2);
                    break;
                case 2:
                    i11 = b.j(readInt, parcel2);
                    break;
                case 3:
                    i12 = b.j(readInt, parcel2);
                    break;
                case 4:
                    j10 = b.k(readInt, parcel2);
                    break;
                case 5:
                    j11 = b.k(readInt, parcel2);
                    break;
                case 6:
                    str = b.c(readInt, parcel2);
                    break;
                case 7:
                    str2 = b.c(readInt, parcel2);
                    break;
                case 8:
                    i13 = b.j(readInt, parcel2);
                    break;
                case 9:
                    i14 = b.j(readInt, parcel2);
                    break;
                default:
                    b.n(readInt, parcel2);
                    break;
            }
        }
        b.g(o10, parcel2);
        return new l(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
