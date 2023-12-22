package j5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class l extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    public class a implements Parcelable.ClassLoaderCreator<l> {
        public final Object createFromParcel(Parcel parcel) {
            return new l(parcel, (ClassLoader) null);
        }

        public final Object[] newArray(int i10) {
            return new l[i10];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new l(parcel, classLoader);
        }
    }

    public l() {
    }

    public l(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(iArr[i10], readParcelableArray[i10]);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = keyAt(i11);
            parcelableArr[i11] = (Parcelable) valueAt(i11);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
