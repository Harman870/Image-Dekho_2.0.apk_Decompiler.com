package g7;

import androidx.activity.result.c;
import java.lang.reflect.Method;

public final class q extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f6639b;

    public q(Method method) {
        this.f6639b = method;
    }

    public final <T> T h(Class<T> cls) {
        c.d(cls);
        return this.f6639b.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
