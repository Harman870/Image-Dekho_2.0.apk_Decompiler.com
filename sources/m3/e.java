package m3;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import q3.a0;
import q3.k;
import r3.o;
import u3.a;

public final class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9360c = new a("RevokeAccessOperation", new String[0]);

    /* renamed from: a  reason: collision with root package name */
    public final String f9361a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9362b = new k((a0) null);

    public e(String str) {
        o.e(str);
        this.f9361a = str;
    }

    public final void run() {
        Status status = Status.f2807h;
        try {
            String str = this.f9361a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2805f;
            } else {
                f9360c.c("Unable to revoke access!", new Object[0]);
            }
            a aVar = f9360c;
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f9360c.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f9360c.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f9362b.setResult(status);
    }
}
