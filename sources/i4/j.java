package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class j implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                arrayList = b.d(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new i(arrayList, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
