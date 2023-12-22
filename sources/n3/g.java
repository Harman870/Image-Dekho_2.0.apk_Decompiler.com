package n3;

import android.util.Log;

public final class g extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z9) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z9);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return h.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return h.class;
    }
}
