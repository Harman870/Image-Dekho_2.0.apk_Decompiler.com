package n3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends s3.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public Intent f9523a;

    public a(Intent intent) {
        this.f9523a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 1, this.f9523a, i10);
        y3.a.S(G, parcel);
    }
}
