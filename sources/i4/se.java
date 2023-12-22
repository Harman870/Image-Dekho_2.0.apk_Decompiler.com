package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import h6.b0;
import s3.b;

public final class se implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Status status = null;
        b0 b0Var = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                status = (Status) b.b(parcel, readInt, Status.CREATOR);
            } else if (c10 == 2) {
                b0Var = (b0) b.b(parcel, readInt, b0.CREATOR);
            } else if (c10 == 3) {
                str = b.c(readInt, parcel);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                str2 = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new re(status, b0Var, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new re[i10];
    }
}
