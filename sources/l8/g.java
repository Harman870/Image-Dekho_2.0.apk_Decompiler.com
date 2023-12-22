package l8;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f9254a;

    public g(Context context) {
        this.f9254a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public final String a(String str) {
        return this.f9254a.getString(str, "");
    }

    public final void b(String str, String str2) {
        this.f9254a.edit().putString(str, str2).apply();
    }
}
