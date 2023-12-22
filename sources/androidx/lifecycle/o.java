package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap f1753a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap f1754b = new HashMap();

    public static e a(Constructor<? extends e> constructor, Object obj) {
        try {
            return (e) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z9;
        boolean z10;
        HashMap hashMap;
        boolean z11;
        String str;
        Class<k> cls2 = k.class;
        Integer num = (Integer) f1753a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            List<?> list = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = "";
                }
                if (!str.isEmpty()) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!str.isEmpty()) {
                    b10 = str + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                hashMap = f1754b;
                list = Collections.singletonList(constructor);
            } else {
                a aVar = a.f1707c;
                Boolean bool = (Boolean) aVar.f1709b.get(cls);
                if (bool != null) {
                    z9 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                aVar.f1709b.put(cls, Boolean.FALSE);
                                z9 = false;
                                break;
                            } else if (((s) declaredMethods[i11].getAnnotation(s.class)) != null) {
                                aVar.a(cls, declaredMethods);
                                z9 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z9) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (c(superclass) != 1) {
                            list = new ArrayList<>((Collection) f1754b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class cls3 = interfaces[i12];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                list.addAll((Collection) f1754b.get(cls3));
                            }
                            i12++;
                        } else if (list != null) {
                            hashMap = f1754b;
                        }
                    }
                }
            }
            hashMap.put(cls, list);
            i10 = 2;
        }
        f1753a.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
