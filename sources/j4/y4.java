package j4;

import android.util.Log;
import javax.annotation.Nullable;

public final class y4 extends f5 {
    public y4(c5 c5Var, String str, Long l6) {
        super(c5Var, str, l6);
    }

    @Nullable
    public final /* synthetic */ Object a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f8141b;
            Log.e("PhenotypeFlag", "Invalid long value for " + str2 + ": " + str);
            return null;
        }
    }
}
