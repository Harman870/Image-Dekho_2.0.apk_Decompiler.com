package n3;

import android.os.Parcel;
import android.os.Parcelable;

public final class f implements Parcelable.Creator<h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new h(parcel.readStrongBinder());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
