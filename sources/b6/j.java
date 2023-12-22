package b6;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2290a = 0;

    static {
        j.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(e.a("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
