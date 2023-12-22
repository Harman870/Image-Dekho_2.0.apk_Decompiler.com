package i3;

import androidx.activity.e;
import com.google.android.gms.internal.gtm.zzfc;

public final class i {
    public static String a(int i10, String str) {
        if (i10 > 0) {
            return e.a(str, i10);
        }
        zzfc.zzb("index out of range for prefix", str);
        return "";
    }
}
