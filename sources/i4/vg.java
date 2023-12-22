package i4;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class vg implements xf {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f7748a;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7748a = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.f7748a.add(optJSONArray.getString(i10));
                }
            }
        } catch (JSONException e10) {
            throw r.a(e10, "vg", str);
        }
    }

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        a(str);
        return this;
    }
}
