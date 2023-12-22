package i6;

import android.content.Context;
import android.content.SharedPreferences;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f7930a = new y();

    public static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    public static final SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }
}
