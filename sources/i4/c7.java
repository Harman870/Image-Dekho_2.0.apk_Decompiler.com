package i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import y3.a;

public final class c7 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences.Editor f7227a;

    public c7(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f7227a = (str == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str, 0)).edit();
    }

    public final void a(jb jbVar) {
        if (!this.f7227a.putString("GenericIdpKeyset", a.O(jbVar.e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void b(gc gcVar) {
        if (!this.f7227a.putString("GenericIdpKeyset", a.O(gcVar.e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
