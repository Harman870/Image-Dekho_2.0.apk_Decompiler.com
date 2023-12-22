package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import i1.b;
import i1.c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final c f2154a;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f2154a = new b(parcel).l();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).t(this.f2154a);
    }
}
