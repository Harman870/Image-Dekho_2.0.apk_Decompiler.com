package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import x8.f;

public abstract class a<I, O> {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static final class C0016a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f2192a;

        public C0016a(T t10) {
            this.f2192a = t10;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0016a b(ComponentActivity componentActivity, Object obj) {
        f.f(componentActivity, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i10);
}
