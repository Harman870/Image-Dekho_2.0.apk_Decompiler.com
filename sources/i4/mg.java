package i4;

import android.util.Log;
import androidx.fragment.app.w0;
import org.json.JSONException;
import org.json.JSONObject;

public final class mg implements xf {

    /* renamed from: a  reason: collision with root package name */
    public String f7496a;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f7496a = jSONObject.getString("message");
        } catch (NullPointerException | JSONException e10) {
            String message = e10.getMessage();
            Log.e("i4.mg", "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new bf(w0.d("Failed to parse error for string [", str, "]"), e10);
        }
    }

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        a(str);
        return this;
    }
}
