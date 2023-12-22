package i4;

import android.util.Log;

public final class r {
    public static bf a(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + message);
        return new bf("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }
}
