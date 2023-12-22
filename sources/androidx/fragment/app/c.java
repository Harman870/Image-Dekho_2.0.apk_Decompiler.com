package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1442a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1443b;

    public class a implements Parcelable.Creator<c> {
        public final Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public final Object[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        this.f1442a = parcel.createStringArrayList();
        this.f1443b = parcel.createTypedArrayList(b.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1442a);
        parcel.writeTypedList(this.f1443b);
    }
}
