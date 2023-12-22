package n4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;
import y3.a;

public final class a8 implements Parcelable.Creator {
    public static void a(z7 z7Var, Parcel parcel) {
        int G = a.G(20293, parcel);
        a.x(parcel, 1, z7Var.f10353a);
        a.B(parcel, 2, z7Var.f10354b);
        a.y(parcel, 3, z7Var.f10355c);
        a.z(parcel, 4, z7Var.f10356d);
        a.B(parcel, 6, z7Var.f10357e);
        a.B(parcel, 7, z7Var.f10358f);
        Double d10 = z7Var.f10359g;
        if (d10 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d10.doubleValue());
        }
        a.S(G, parcel);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        Long l6 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.j(readInt, parcel2);
                    break;
                case 2:
                    str = b.c(readInt, parcel2);
                    break;
                case 3:
                    j10 = b.k(readInt, parcel2);
                    break;
                case 4:
                    l6 = b.l(readInt, parcel2);
                    break;
                case 5:
                    int m2 = b.m(readInt, parcel2);
                    if (m2 != 0) {
                        b.p(parcel2, m2, 4);
                        f10 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f10 = null;
                        break;
                    }
                case 6:
                    str2 = b.c(readInt, parcel2);
                    break;
                case 7:
                    str3 = b.c(readInt, parcel2);
                    break;
                case 8:
                    int m8 = b.m(readInt, parcel2);
                    if (m8 != 0) {
                        b.p(parcel2, m8, 8);
                        d10 = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d10 = null;
                        break;
                    }
                default:
                    b.n(readInt, parcel2);
                    break;
            }
        }
        b.g(o10, parcel2);
        return new z7(i10, str, j10, l6, f10, str2, str3, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new z7[i10];
    }
}
