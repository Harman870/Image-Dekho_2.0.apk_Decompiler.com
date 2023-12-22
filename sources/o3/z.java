package o3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class z implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.c(readInt, parcel);
                    break;
                case 2:
                    z9 = b.h(readInt, parcel);
                    break;
                case 3:
                    z10 = b.h(readInt, parcel);
                    break;
                case 4:
                    iBinder = b.i(readInt, parcel);
                    break;
                case 5:
                    z11 = b.h(readInt, parcel);
                    break;
                case 6:
                    z12 = b.h(readInt, parcel);
                    break;
                default:
                    b.n(readInt, parcel);
                    break;
            }
        }
        b.g(o10, parcel);
        return new y(str, z9, z10, iBinder, z11, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y[i10];
    }
}
