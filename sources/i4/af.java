package i4;

import android.database.Cursor;
import j4.o4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m.b;
import org.json.JSONObject;
import r3.o;

public final class af implements fg, wf {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7190a;

    public /* synthetic */ af(fg fgVar) {
        this.f7190a = fgVar;
    }

    public /* synthetic */ af(o4 o4Var) {
        this.f7190a = o4Var;
    }

    public /* synthetic */ af(String str) {
        o.e(str);
        this.f7190a = str;
    }

    /* JADX INFO: finally extract failed */
    public final Object a() {
        Map map;
        o4 o4Var = (o4) this.f7190a;
        Cursor query = o4Var.f8356a.query(o4Var.f8357b, o4.f8355i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            if (count <= 256) {
                map = new b(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ void c(xf xfVar) {
        ((fg) this.f7190a).c((wg) xfVar);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", (String) this.f7190a);
        return jSONObject.toString();
    }

    public final void zza(String str) {
        ((fg) this.f7190a).zza(str);
    }
}
