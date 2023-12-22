package d3;

import com.google.auto.value.AutoValue;
import com.ironsource.adapters.ironsource.a;

@AutoValue
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6052a;

    static {
        String str;
        Long l6 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l10 = 604800000L;
        Integer num3 = 81920;
        if (l6 == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = a.g(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = a.g(str, " criticalSectionEnterTimeoutMs");
        }
        if (l10 == null) {
            str = a.g(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = a.g(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f6052a = new a(l6.longValue(), num.intValue(), num2.intValue(), l10.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException(a.g("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
