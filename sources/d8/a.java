package d8;

import java.io.InputStream;
import java.net.URL;
import x8.f;

public final class a implements com.ironsource.sdk.utils.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6107a = new a();

    public final InputStream a(String str) {
        f.f(str, "url");
        InputStream openStream = new URL(str).openStream();
        f.e(openStream, "URL(url).openStream()");
        return openStream;
    }
}
