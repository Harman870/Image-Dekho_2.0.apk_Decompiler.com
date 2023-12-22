package g7;

import androidx.activity.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class d implements m<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Constructor f6593a;

    public d(Constructor constructor) {
        this.f6593a = constructor;
    }

    public final Object j() {
        try {
            return this.f6593a.newInstance((Object[]) null);
        } catch (InstantiationException e10) {
            StringBuilder g10 = f.g("Failed to invoke ");
            g10.append(this.f6593a);
            g10.append(" with no args");
            throw new RuntimeException(g10.toString(), e10);
        } catch (InvocationTargetException e11) {
            StringBuilder g11 = f.g("Failed to invoke ");
            g11.append(this.f6593a);
            g11.append(" with no args");
            throw new RuntimeException(g11.toString(), e11.getTargetException());
        } catch (IllegalAccessException e12) {
            throw new AssertionError(e12);
        }
    }
}
