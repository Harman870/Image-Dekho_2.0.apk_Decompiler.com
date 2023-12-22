package c7;

import android.content.Context;
import d3.k;
import j6.a;

public final class f {

    public interface a<T> {
        String b(Context context);
    }

    public static j6.a<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        a.C0105a<d> a10 = j6.a.a(d.class);
        a10.f8728e = 1;
        a10.f8729f = new k(aVar);
        return a10.b();
    }

    public static j6.a<?> b(String str, a<Context> aVar) {
        a.C0105a<d> a10 = j6.a.a(d.class);
        a10.f8728e = 1;
        a10.a(j6.k.a(Context.class));
        a10.f8729f = new e(str, aVar);
        return a10.b();
    }
}
