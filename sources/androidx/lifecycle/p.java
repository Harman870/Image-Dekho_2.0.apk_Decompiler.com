package androidx.lifecycle;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.f;
import androidx.appcompat.widget.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import i4.m;
import i4.r1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public final class p implements r1 {

    /* renamed from: a  reason: collision with root package name */
    public Object f1755a;

    public /* synthetic */ p() {
        this.f1755a = new HashMap();
    }

    public /* synthetic */ p(Bundle bundle) {
        this.f1755a = new Bundle(bundle);
    }

    public /* synthetic */ p(Object obj) {
        this.f1755a = obj;
    }

    public static boolean g(Bundle bundle) {
        if (IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(bundle.getString("gcm.n.e")) || IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public static String i(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final boolean a(String str) {
        String f10 = f(str);
        return IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(f10) || Boolean.parseBoolean(f10);
    }

    public final /* synthetic */ m b(l lVar, CharSequence charSequence) {
        return new m(this, lVar, charSequence);
    }

    public final Integer c(String str) {
        String f10 = f(str);
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(f10));
        } catch (NumberFormatException unused) {
            StringBuilder g10 = f.g("Couldn't parse value of ");
            g10.append(i(str));
            g10.append("(");
            g10.append(f10);
            g10.append(") into an int");
            Log.w("NotificationParams", g10.toString());
            return null;
        }
    }

    public final JSONArray d(String str) {
        String f10 = f(str);
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        try {
            return new JSONArray(f10);
        } catch (JSONException unused) {
            StringBuilder g10 = f.g("Malformed JSON for key ");
            g10.append(i(str));
            g10.append(": ");
            g10.append(f10);
            g10.append(", falling back to default");
            Log.w("NotificationParams", g10.toString());
            return null;
        }
    }

    public final String e(Resources resources, String str, String str2) {
        String[] strArr;
        String f10 = f(str2);
        if (!TextUtils.isEmpty(f10)) {
            return f10;
        }
        String f11 = f(str2 + "_loc_key");
        if (TextUtils.isEmpty(f11)) {
            return null;
        }
        int identifier = resources.getIdentifier(f11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", i(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray d10 = d(str2 + "_loc_args");
        if (d10 == null) {
            strArr = null;
        } else {
            int length = d10.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = d10.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            StringBuilder g10 = f.g("Missing format argument for ");
            g10.append(i(str2));
            g10.append(": ");
            g10.append(Arrays.toString(strArr));
            g10.append(" Default value will be used.");
            Log.w("NotificationParams", g10.toString(), e10);
            return null;
        }
    }

    public final String f(String str) {
        String str2;
        Bundle bundle = (Bundle) this.f1755a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (((Bundle) this.f1755a).containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle h() {
        boolean z9;
        Bundle bundle = new Bundle((Bundle) this.f1755a);
        for (String next : ((Bundle) this.f1755a).keySet()) {
            if (next.startsWith("google.c.a.") || next.equals("from")) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
