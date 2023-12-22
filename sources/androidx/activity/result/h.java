package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f309a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f310b;

    /* renamed from: c  reason: collision with root package name */
    public final int f311c;

    /* renamed from: d  reason: collision with root package name */
    public final int f312d;

    public class a implements Parcelable.Creator<h> {
        public final Object createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        public final Object[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f309a = intentSender;
        this.f310b = intent;
        this.f311c = i10;
        this.f312d = i11;
    }

    public h(Parcel parcel) {
        this.f309a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f310b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f311c = parcel.readInt();
        this.f312d = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f309a, i10);
        parcel.writeParcelable(this.f310b, i10);
        parcel.writeInt(this.f311c);
        parcel.writeInt(this.f312d);
    }
}
