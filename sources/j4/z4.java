package j4;

import android.util.Log;
import javax.annotation.Nullable;

public final class z4 extends f5 {
    public z4(c5 c5Var, String str, Boolean bool) {
        super(c5Var, str, bool);
    }

    @Nullable
    public final /* synthetic */ Object a(String str) {
        if (k4.f8285b.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (k4.f8286c.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f8141b;
        Log.e("PhenotypeFlag", "Invalid boolean value for " + str2 + ": " + str);
        return null;
    }
}
