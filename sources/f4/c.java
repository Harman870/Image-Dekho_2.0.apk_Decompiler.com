package f4;

import android.os.Parcel;
import android.os.Parcelable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6381a = 0;

    static {
        c.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
