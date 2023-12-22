package i6;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.l;
import androidx.lifecycle.p;
import i4.r1;
import i4.r9;
import i4.yd;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m.b;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.o;
import u3.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7916a = new a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        byte[] bArr;
        o.e(str);
        List j10 = new l((r1) new p((Object) new r9())).j(str);
        if (j10.size() < 2) {
            f7916a.c("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) j10.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            b c10 = c(new String(bArr, "UTF-8"));
            if (c10 == null) {
                return new HashMap();
            }
            return c10;
        } catch (UnsupportedEncodingException e10) {
            f7916a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new yd(e10);
        }
    }

    public static b d(JSONObject jSONObject) {
        b bVar = new b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }
}
