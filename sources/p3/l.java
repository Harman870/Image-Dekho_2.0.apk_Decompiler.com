package p3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import s3.b;

public final class l implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                str = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new Scope(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
