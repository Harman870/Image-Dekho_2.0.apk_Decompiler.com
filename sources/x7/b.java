package x7;

import com.ironsource.environment.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a {
    public b(int i10) {
        this.f12991b = i10;
    }

    public final String a(ArrayList<a> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f12990a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (!arrayList.isEmpty()) {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject c10 = a.c(it.next());
                    if (c10 != null) {
                        jSONArray.put(c10);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", b(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    public final String c() {
        return "ironbeast";
    }
}
