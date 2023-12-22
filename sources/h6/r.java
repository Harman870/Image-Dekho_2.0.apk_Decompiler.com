package h6;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import i4.yd;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;
import y3.a;

public final class r extends o {
    public static final Parcelable.Creator<r> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    public final String f6921a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f6922b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6923c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6924d;

    public r(long j10, String str, @Nullable String str2, String str3) {
        o.e(str);
        this.f6921a = str;
        this.f6922b = str2;
        this.f6923c = j10;
        o.e(str3);
        this.f6924d = str3;
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6921a);
        a.B(parcel, 2, this.f6922b);
        a.y(parcel, 3, this.f6923c);
        a.B(parcel, 4, this.f6924d);
        a.S(G, parcel);
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f6921a);
            jSONObject.putOpt("displayName", this.f6922b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6923c));
            jSONObject.putOpt("phoneNumber", this.f6924d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new yd(e10);
        }
    }
}
