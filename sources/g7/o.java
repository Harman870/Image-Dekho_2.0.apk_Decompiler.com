package g7;

import androidx.activity.result.c;
import java.lang.reflect.Method;

public final class o extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f6635b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6636c;

    public o(Object obj, Method method) {
        this.f6635b = method;
        this.f6636c = obj;
    }

    public final <T> T h(Class<T> cls) {
        c.d(cls);
        return this.f6635b.invoke(this.f6636c, new Object[]{cls});
    }
}
