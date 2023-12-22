package d0;

import android.content.Context;
import android.os.UserManager;

public final class j {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
