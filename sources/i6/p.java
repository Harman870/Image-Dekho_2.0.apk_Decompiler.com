package i6;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f7918a = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"}));

    /* renamed from: b  reason: collision with root package name */
    public static final p f7919b = new p();

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator it = f7918a.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.commit();
    }
}
