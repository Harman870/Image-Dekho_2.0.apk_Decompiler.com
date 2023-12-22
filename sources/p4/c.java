package p4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class c implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 == 2) {
                i11 = b.j(readInt, parcel);
            } else if (c10 != 3) {
                b.n(readInt, parcel);
            } else {
                intent = (Intent) b.b(parcel, readInt, Intent.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new b(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
