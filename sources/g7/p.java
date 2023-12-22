package g7;

import androidx.activity.result.c;
import java.lang.reflect.Method;

public final class p extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f6637b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6638c;

    public p(int i10, Method method) {
        this.f6637b = method;
        this.f6638c = i10;
    }

    public final <T> T h(Class<T> cls) {
        c.d(cls);
        return this.f6637b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f6638c)});
    }
}
