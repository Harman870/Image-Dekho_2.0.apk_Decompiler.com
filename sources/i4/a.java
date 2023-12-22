package i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.o;

public final class a extends s3.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final String f7175a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7176b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7177c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7178d;

    public a(long j10, String str, String str2, String str3) {
        this.f7175a = str;
        o.e(str2);
        this.f7176b = str2;
        this.f7177c = str3;
        this.f7178d = j10;
    }

    public static ArrayList x(JSONArray jSONArray) {
        long j10;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String optString = jSONObject.optString("phoneInfo", (String) null);
            String optString2 = jSONObject.optString("mfaEnrollmentId", (String) null);
            String optString3 = jSONObject.optString("displayName", (String) null);
            String replaceAll = jSONObject.optString("enrolledAt", "").replaceAll("\\.[0-9]{0,9}Z$|Z$", ".000Z");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                j10 = simpleDateFormat.parse(replaceAll).getTime();
            } catch (ParseException e10) {
                Log.w("MfaInfo", "Could not parse timestamp as ISOString", e10);
                j10 = 0;
            }
            a aVar = new a(j10, optString, optString2, optString3);
            jSONObject.optString("unobfuscatedPhoneInfo");
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7175a);
        y3.a.B(parcel, 2, this.f7176b);
        y3.a.B(parcel, 3, this.f7177c);
        y3.a.y(parcel, 4, this.f7178d);
        y3.a.S(G, parcel);
    }
}
