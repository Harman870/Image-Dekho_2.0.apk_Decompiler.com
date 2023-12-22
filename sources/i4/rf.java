package i4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import u3.a;

public interface rf {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f7650b0 = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Uri.Builder a(Intent intent, String str, String str2);

    String d(String str);

    void f(Status status);

    void g(String str, Uri uri);

    HttpURLConnection i(URL url);

    Context zza();
}
