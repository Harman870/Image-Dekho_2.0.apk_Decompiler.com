package s6;

import android.util.Base64OutputStream;
import android.widget.Toast;
import androidx.activity.f;
import androidx.fragment.app.p;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j8.g;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11884b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f11883a = i10;
        this.f11884b = obj;
    }

    public final Object call() {
        Toast toast;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.f11883a) {
            case 0:
                f fVar = (f) this.f11884b;
                synchronized (fVar) {
                    j jVar = fVar.f11889a.get();
                    ArrayList c10 = jVar.c();
                    jVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < c10.size(); i10++) {
                        k kVar = (k) c10.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", kVar.b());
                        jSONObject.put("dates", new JSONArray(kVar.a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            base64OutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                g gVar = (g) this.f11884b;
                if (!gVar.d0(gVar.Z) || !gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
                    return null;
                }
                if (gVar.c0(gVar.Z)) {
                    toast = Toast.makeText(gVar.T(), "Install 1 App", 0);
                } else {
                    p T = gVar.T();
                    StringBuilder g10 = f.g("Click On Ad And Wait ");
                    g10.append(gVar.b0(gVar.Z));
                    g10.append(" Second");
                    toast = Toast.makeText(T, g10.toString(), 1);
                }
                toast.show();
                return null;
        }
        throw th;
    }
}
