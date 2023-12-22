package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();
    private final byte[] mParcelableBytes;

    public class a implements Parcelable.Creator<WrappedParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        public final Object[] newArray(int i10) {
            return new WrappedParcelable[i10];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.mParcelableBytes = parcel.createByteArray();
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.mParcelableBytes = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.mParcelableBytes = bArr;
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.mParcelableBytes;
        if (bArr == null) {
            return null;
        }
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.mParcelableBytes);
    }
}
