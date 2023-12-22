package n4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class d implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        z7 z7Var = null;
        String str3 = null;
        r rVar = null;
        r rVar2 = null;
        r rVar3 = null;
        boolean z9 = false;
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
                    z7Var = (z7) b.b(parcel2, readInt, z7.CREATOR);
                    break;
                case 5:
                    j10 = b.k(readInt, parcel2);
                    break;
                case 6:
                    z9 = b.h(readInt, parcel2);
                    break;
                case 7:
                    str3 = b.c(readInt, parcel2);
                    break;
                case 8:
                    rVar = (r) b.b(parcel2, readInt, r.CREATOR);
                    break;
                case 9:
                    j11 = b.k(readInt, parcel2);
                    break;
                case 10:
                    rVar2 = (r) b.b(parcel2, readInt, r.CREATOR);
                    break;
                case 11:
                    j12 = b.k(readInt, parcel2);
                    break;
                case 12:
                    rVar3 = (r) b.b(parcel2, readInt, r.CREATOR);
                    break;
                default:
                    b.n(readInt, parcel2);
                    break;
            }
        }
        b.g(o10, parcel2);
        return new c(str, str2, z7Var, j10, z9, str3, rVar, j11, rVar2, j12, rVar3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
