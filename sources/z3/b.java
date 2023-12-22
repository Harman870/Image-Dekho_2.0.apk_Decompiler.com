package z3;

import android.os.IBinder;
import androidx.activity.e;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import r3.o;
import z3.a;

public final class b<T> extends a.C0177a {

    /* renamed from: b  reason: collision with root package name */
    public final Object f13174b;

    public b(Object obj) {
        this.f13174b = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T F(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f13174b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            o.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(e.a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
    }
}
