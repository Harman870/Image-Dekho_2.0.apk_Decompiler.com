package j4;

import android.net.Uri;
import m.b;

public final class v4 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8505a = new b();

    public static synchronized Uri a() {
        synchronized (v4.class) {
            b bVar = f8505a;
            Uri uri = (Uri) bVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            bVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
