package r3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

public final class b1 {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f11523d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f11524a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11525b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11526c;

    public b1(String str, String str2, boolean z9) {
        o.e(str);
        this.f11524a = str;
        o.e(str2);
        this.f11525b = str2;
        this.f11526c = z9;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        if (this.f11524a == null) {
            return new Intent().setComponent((ComponentName) null);
        }
        if (this.f11526c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f11524a);
            try {
                bundle = context.getContentResolver().call(f11523d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f11524a)));
            }
        }
        return intent == null ? new Intent(this.f11524a).setPackage(this.f11525b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return m.a(this.f11524a, b1Var.f11524a) && m.a(this.f11525b, b1Var.f11525b) && m.a((Object) null, (Object) null) && this.f11526c == b1Var.f11526c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11524a, this.f11525b, null, 4225, Boolean.valueOf(this.f11526c)});
    }

    public final String toString() {
        String str = this.f11524a;
        if (str != null) {
            return str;
        }
        o.h((Object) null);
        throw null;
    }
}
