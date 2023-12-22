package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import w3.i;

public final class pg extends a implements xf<pg> {
    public static final Parcelable.Creator<pg> CREATOR = new qg();

    /* renamed from: b  reason: collision with root package name */
    public static final String f7598b = pg.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public tg f7599a;

    public pg() {
    }

    public pg(tg tgVar) {
        tg tgVar2;
        if (tgVar == null) {
            tgVar2 = new tg();
        } else {
            List list = tgVar.f7693a;
            tg tgVar3 = new tg();
            if (list != null && !list.isEmpty()) {
                tgVar3.f7693a.addAll(list);
            }
            tgVar2 = tgVar3;
        }
        this.f7599a = tgVar2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 2, this.f7599a, i10);
        y3.a.S(G, parcel);
    }

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        tg tgVar;
        int i10;
        rg rgVar;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                tgVar = new tg();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z9 = false;
                        int i11 = 0;
                        while (i11 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 == null) {
                                rgVar = new rg();
                                i10 = i11;
                            } else {
                                i10 = i11;
                                rgVar = new rg(i.a(jSONObject2.optString("localId", (String) null)), i.a(jSONObject2.optString("email", (String) null)), jSONObject2.optBoolean("emailVerified", z9), i.a(jSONObject2.optString("displayName", (String) null)), i.a(jSONObject2.optString("photoUrl", (String) null)), e.x(jSONObject2.optJSONArray("providerUserInfo")), i.a(jSONObject2.optString("rawPassword", (String) null)), i.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (b0) null, a.x(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(rgVar);
                            i11 = i10 + 1;
                            z9 = false;
                        }
                        tgVar = new tg(arrayList);
                    }
                }
                tgVar = new tg(new ArrayList());
            }
            this.f7599a = tgVar;
            return this;
        } catch (JSONException e10) {
            e = e10;
            throw r.a(e, f7598b, str2);
        } catch (NullPointerException e11) {
            e = e11;
            throw r.a(e, f7598b, str2);
        }
    }
}
