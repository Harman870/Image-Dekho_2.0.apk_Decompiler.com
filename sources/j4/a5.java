package j4;

import android.util.Log;
import javax.annotation.Nullable;

public final class a5 extends f5 {
    public a5(c5 c5Var, Double d10) {
        super(c5Var, "measurement.test.double_flag", d10);
    }

    @Nullable
    public final /* synthetic */ Object a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f8141b;
            Log.e("PhenotypeFlag", "Invalid double value for " + str2 + ": " + str);
            return null;
        }
    }
}
