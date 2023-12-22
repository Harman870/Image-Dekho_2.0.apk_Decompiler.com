package g7;

import androidx.activity.f;
import androidx.activity.result.c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class b implements m<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final c f6587a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6588b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Type f6589c;

    public b(Class cls, Type type) {
        c cVar;
        this.f6588b = cls;
        this.f6589c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            cVar = new o(declaredField.get((Object) null), cls2.getMethod("allocateInstance", new Class[]{Class.class}));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                cVar = new p(intValue, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    cVar = new q(declaredMethod3);
                } catch (Exception unused3) {
                    cVar = new r();
                }
            }
        }
        this.f6587a = cVar;
    }

    public final Object j() {
        try {
            return this.f6587a.h(this.f6588b);
        } catch (Exception e10) {
            StringBuilder g10 = f.g("Unable to invoke no-args constructor for ");
            g10.append(this.f6589c);
            g10.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(g10.toString(), e10);
        }
    }
}
