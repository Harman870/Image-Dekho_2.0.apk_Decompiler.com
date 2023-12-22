package n4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;
import y3.a;

public final class s implements Parcelable.Creator {
    public static void a(r rVar, Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 2, rVar.f10085a);
        a.A(parcel, 3, rVar.f10086b, i10);
        a.B(parcel, 4, rVar.f10087c);
        a.y(parcel, 5, rVar.f10088d);
        a.S(G, parcel);
    }

    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        p pVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.c(readInt, parcel);
            } else if (c10 == 3) {
                pVar = (p) b.b(parcel, readInt, p.CREATOR);
            } else if (c10 == 4) {
                str2 = b.c(readInt, parcel);
            } else if (c10 != 5) {
                b.n(readInt, parcel);
            } else {
                j10 = b.k(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new r(str, pVar, str2, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
