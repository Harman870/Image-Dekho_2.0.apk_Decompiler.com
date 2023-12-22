package androidx.fragment.app;

import androidx.fragment.app.o;
import m.h;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static final h<ClassLoader, h<String, Class<?>>> f1621a = new h<>();

    public static Class<?> a(ClassLoader classLoader, String str) {
        h<ClassLoader, h<String, Class<?>>> hVar = f1621a;
        h orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new h();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends o> b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new o.c(w0.d("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        } catch (ClassCastException e11) {
            throw new o.c(w0.d("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        }
    }
}
