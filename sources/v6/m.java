package v6;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import y3.a;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final long f12643b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f12644c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static m f12645d;

    /* renamed from: a  reason: collision with root package name */
    public final a f12646a;

    public m(a aVar) {
        this.f12646a = aVar;
    }

    public final boolean a(x6.a aVar) {
        if (TextUtils.isEmpty(aVar.f12972d)) {
            return true;
        }
        long j10 = aVar.f12975g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f12646a.getClass();
        if (aVar.f12974f + j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f12643b) {
            return true;
        }
        return false;
    }
}
