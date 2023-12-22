package u5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.f;
import m.h;

public final class a extends n0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0155a();

    /* renamed from: c  reason: collision with root package name */
    public final h<String, Bundle> f12202c;

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    public class C0155a implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null);
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f12202c = new h<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f12202c.put(strArr[i10], bundleArr[i10]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f12202c = new h<>();
    }

    public final String toString() {
        StringBuilder g10 = f.g("ExtendableSavedState{");
        g10.append(Integer.toHexString(System.identityHashCode(this)));
        g10.append(" states=");
        g10.append(this.f12202c);
        g10.append("}");
        return g10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9479a, i10);
        int i11 = this.f12202c.f9301c;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = this.f12202c.h(i12);
            bundleArr[i12] = this.f12202c.l(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
