package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.a;
import w3.i;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public final List f7268a;

    public e() {
        this.f7268a = new ArrayList();
    }

    public e(ArrayList arrayList) {
        this.f7268a = (arrayList == null || arrayList.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
    }

    public static e x(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new e(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new c() : new c(i.a(jSONObject.optString("federatedId", (String) null)), i.a(jSONObject.optString("displayName", (String) null)), i.a(jSONObject.optString("photoUrl", (String) null)), i.a(jSONObject.optString("providerId", (String) null)), (String) null, i.a(jSONObject.optString("phoneNumber", (String) null)), i.a(jSONObject.optString("email", (String) null))));
        }
        return new e(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.E(parcel, 2, this.f7268a);
        y3.a.S(G, parcel);
    }
}
