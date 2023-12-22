package i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import h6.b0;
import s3.a;

public final class re extends a {
    public static final Parcelable.Creator<re> CREATOR = new se();

    /* renamed from: a  reason: collision with root package name */
    public final Status f7646a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f7647b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7648c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7649d;

    public re(Status status, b0 b0Var, String str, String str2) {
        this.f7646a = status;
        this.f7647b = b0Var;
        this.f7648c = str;
        this.f7649d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 1, this.f7646a, i10);
        y3.a.A(parcel, 2, this.f7647b, i10);
        y3.a.B(parcel, 3, this.f7648c);
        y3.a.B(parcel, 4, this.f7649d);
        y3.a.S(G, parcel);
    }
}
