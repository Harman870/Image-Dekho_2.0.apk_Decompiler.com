package x7;

import com.ironsource.environment.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends a {
    public c(int i10) {
        this.f12991b = i10;
    }

    public final String a(ArrayList<a> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f12990a = jSONObject;
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
        return b(jSONArray);
    }

    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    public final String c() {
        return "outcome";
    }
}
