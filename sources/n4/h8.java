package n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class h8 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        boolean z9;
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        boolean z14 = true;
        String str10 = "";
        String str11 = str10;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = -2147483648L;
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
                    j10 = b.k(readInt, parcel2);
                    break;
                case 7:
                    j11 = b.k(readInt, parcel2);
                    break;
                case 8:
                    str5 = b.c(readInt, parcel2);
                    break;
                case 9:
                    z13 = b.h(readInt, parcel2);
                    break;
                case 10:
                    z10 = b.h(readInt, parcel2);
                    break;
                case 11:
                    j16 = b.k(readInt, parcel2);
                    break;
                case 12:
                    str6 = b.c(readInt, parcel2);
                    break;
                case 13:
                    j12 = b.k(readInt, parcel2);
                    break;
                case 14:
                    j13 = b.k(readInt, parcel2);
                    break;
                case 15:
                    i10 = b.j(readInt, parcel2);
                    break;
                case 16:
                    z14 = b.h(readInt, parcel2);
                    break;
                case 18:
                    z11 = b.h(readInt, parcel2);
                    break;
                case 19:
                    str7 = b.c(readInt, parcel2);
                    break;
                case 21:
                    int m2 = b.m(readInt, parcel2);
                    if (m2 != 0) {
                        b.p(parcel2, m2, 4);
                        if (parcel.readInt() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j14 = b.k(readInt, parcel2);
                    break;
                case 23:
                    arrayList = b.d(readInt, parcel2);
                    break;
                case 24:
                    str8 = b.c(readInt, parcel2);
                    break;
                case 25:
                    str10 = b.c(readInt, parcel2);
                    break;
                case 26:
                    str11 = b.c(readInt, parcel2);
                    break;
                case 27:
                    str9 = b.c(readInt, parcel2);
                    break;
                case 28:
                    z12 = b.h(readInt, parcel2);
                    break;
                case 29:
                    j15 = b.k(readInt, parcel2);
                    break;
                default:
                    b.n(readInt, parcel2);
                    break;
            }
        }
        b.g(o10, parcel2);
        return new g8(str, str2, str3, str4, j10, j11, str5, z13, z10, j16, str6, j12, j13, i10, z14, z11, str7, bool, j14, arrayList, str8, str10, str11, str9, z12, j15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g8[i10];
    }
}
