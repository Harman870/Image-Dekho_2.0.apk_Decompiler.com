package b6;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w0;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2295a;

    public r(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f2295a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return w0.d(str, " : ", str2);
    }

    public final void a(String str, RemoteException remoteException, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", c(this.f2295a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f2295a, str, objArr));
        }
    }
}
