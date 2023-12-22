package i4;

import android.util.Log;
import h6.a;
import h6.c;
import org.json.JSONObject;
import r3.h;
import r3.o;

public final class ng implements wf {

    /* renamed from: a  reason: collision with root package name */
    public final String f7534a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7535b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7536c;

    static {
        String simpleName = ng.class.getSimpleName();
        if (r3 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : new String[0]) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        new h(simpleName, (String) null);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(simpleName, i10)) {
            i10++;
        }
    }

    public ng(c cVar, String str) {
        String str2 = cVar.f6902a;
        o.e(str2);
        this.f7534a = str2;
        String str3 = cVar.f6904c;
        o.e(str3);
        this.f7535b = str3;
        this.f7536c = str;
    }

    public final String zza() {
        a aVar;
        String str;
        String str2 = this.f7535b;
        int i10 = a.f6892c;
        o.e(str2);
        String str3 = null;
        try {
            aVar = new a(str2);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            str = aVar.f6893a;
        } else {
            str = null;
        }
        if (aVar != null) {
            str3 = aVar.f6894b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f7534a);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f7536c;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
