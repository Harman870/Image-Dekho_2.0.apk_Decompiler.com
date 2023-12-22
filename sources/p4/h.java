package p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class h implements Parcelable.Creator<g> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = b.d(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                str = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new g(str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
