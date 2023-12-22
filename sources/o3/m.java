package o3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class m implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 == 2) {
                i11 = b.j(readInt, parcel);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) b.b(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                str = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new b(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
