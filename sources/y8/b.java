package y8;

import java.util.Random;
import x8.f;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final a f13072c = new a();

    public static final class a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random b() {
        Object obj = this.f13072c.get();
        f.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
