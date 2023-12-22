package a7;

import android.util.Log;
import androidx.fragment.app.w0;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f128d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f129a;

    /* renamed from: b  reason: collision with root package name */
    public final String f130b;

    /* renamed from: c  reason: collision with root package name */
    public final String f131c;

    public g0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f128d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f129a = str3;
        this.f130b = str;
        this.f131c = w0.d(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f129a.equals(g0Var.f129a) && this.f130b.equals(g0Var.f130b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f130b, this.f129a});
    }
}
