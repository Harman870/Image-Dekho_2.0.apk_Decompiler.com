package n0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final C0116a f9478b = new C0116a();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f9479a;

    /* renamed from: n0.a$a  reason: collision with other inner class name */
    public class C0116a extends a {
    }

    public a() {
        this.f9479a = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f9479a = readParcelable == null ? f9478b : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f9479a = parcelable == f9478b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9479a, i10);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f9478b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f9478b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}
