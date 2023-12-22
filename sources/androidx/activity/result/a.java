package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.f;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0003a();

    /* renamed from: a  reason: collision with root package name */
    public final int f288a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f289b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    public class C0003a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Intent intent, int i10) {
        this.f288a = i10;
        this.f289b = intent;
    }

    public a(Parcel parcel) {
        this.f288a = parcel.readInt();
        this.f289b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder g10 = f.g("ActivityResult{resultCode=");
        int i10 = this.f288a;
        if (i10 == -1) {
            str = "RESULT_OK";
        } else if (i10 != 0) {
            str = String.valueOf(i10);
        } else {
            str = "RESULT_CANCELED";
        }
        g10.append(str);
        g10.append(", data=");
        g10.append(this.f289b);
        g10.append('}');
        return g10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f288a);
        parcel.writeInt(this.f289b == null ? 0 : 1);
        Intent intent = this.f289b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
