package h6;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import r3.o;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f6892c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f6893a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6894b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        Collections.unmodifiableMap(hashMap);
    }

    public a(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 == null || a11 == null || a12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        o.e(a10);
        o.e(a11);
        this.f6893a = a11;
        o.e(a12);
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f6894b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            o.e(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
