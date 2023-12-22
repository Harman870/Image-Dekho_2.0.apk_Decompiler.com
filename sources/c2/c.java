package c2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i4.wf;
import o1.h;
import org.json.JSONObject;
import q1.w;
import r3.o;
import x1.d;

public final class c implements d, wf {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2372a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2373b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2374c;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.f2372a = obj;
        this.f2373b = obj2;
        this.f2374c = obj3;
    }

    public /* synthetic */ c(String str, String str2, String str3) {
        o.e(str);
        this.f2372a = str;
        o.e(str2);
        this.f2373b = str2;
        this.f2374c = str3;
    }

    public final w a(w wVar, h hVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((d) this.f2373b).a(d.d(((BitmapDrawable) drawable).getBitmap(), (r1.d) this.f2372a), hVar);
        }
        if (drawable instanceof b2.c) {
            return ((d) this.f2374c).a(wVar, hVar);
        }
        return null;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", (String) this.f2372a);
        jSONObject.put("password", (String) this.f2373b);
        jSONObject.put("returnSecureToken", true);
        String str = (String) this.f2374c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
