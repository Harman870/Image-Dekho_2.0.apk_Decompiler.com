package i4;

import android.content.Context;
import android.util.Log;
import c6.f;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutionException;
import r3.o;
import s6.h;
import y3.a;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7191a;

    /* renamed from: b  reason: collision with root package name */
    public gg f7192b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7193c;

    /* renamed from: d  reason: collision with root package name */
    public final f f7194d;

    public ag(Context context, f fVar, String str) {
        o.h(context);
        this.f7191a = context;
        o.h(fVar);
        this.f7194d = fVar;
        this.f7193c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void a(HttpURLConnection httpURLConnection) {
        String concat = String.valueOf(this.f7193c).concat("/FirebaseCore-Android");
        if (this.f7192b == null) {
            Context context = this.f7191a;
            this.f7192b = new gg(context, context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Package", this.f7192b.f7334a);
        httpURLConnection.setRequestProperty("X-Android-Cert", this.f7192b.f7335b);
        httpURLConnection.setRequestProperty("Accept-Language", a.L());
        httpURLConnection.setRequestProperty("X-Client-Version", concat);
        String str = null;
        httpURLConnection.setRequestProperty("X-Firebase-Locale", (String) null);
        f fVar = this.f7194d;
        fVar.a();
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", fVar.f2496c.f2507b);
        h hVar = (h) FirebaseAuth.getInstance(this.f7194d).f3469l.get();
        if (hVar != null) {
            try {
                str = (String) Tasks.await(hVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e10.getMessage())));
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", str);
    }
}
