package x7;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f12990a;

    /* renamed from: b  reason: collision with root package name */
    public int f12991b;

    /* renamed from: c  reason: collision with root package name */
    public String f12992c;

    public static JSONObject c(com.ironsource.environment.c.a aVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(aVar.c()) ? new JSONObject(aVar.c()) : new JSONObject();
            jSONObject.put("eventId", aVar.a());
            jSONObject.put("timestamp", aVar.b());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public abstract String a(ArrayList<com.ironsource.environment.c.a> arrayList, JSONObject jSONObject);

    public abstract String b();

    public final String b(JSONArray jSONArray) {
        try {
            if (this.f12990a != null) {
                JSONObject jSONObject = new JSONObject(this.f12990a.toString());
                jSONObject.put("timestamp", IronSourceUtils.getTimestamp());
                jSONObject.put(this.f12991b != 2 ? "events" : "InterstitialEvents", jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public abstract String c();
}
