package androidx.lifecycle;

import androidx.activity.f;
import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f1707c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1708a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1709b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0012a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f1710a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, g.b> f1711b;

        public C0012a(HashMap hashMap) {
            this.f1711b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                g.b bVar = (g.b) entry.getValue();
                List list = (List) this.f1710a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1710a.put(bVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, l lVar, g.b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i10 = bVar2.f1712a;
                        if (i10 == 0) {
                            bVar2.f1713b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            bVar2.f1713b.invoke(obj, new Object[]{lVar});
                        } else if (i10 == 2) {
                            bVar2.f1713b.invoke(obj, new Object[]{lVar, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1712a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1713b;

        public b(int i10, Method method) {
            this.f1712a = i10;
            this.f1713b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1712a == bVar.f1712a && this.f1713b.getName().equals(bVar.f1713b.getName());
        }

        public final int hashCode() {
            return this.f1713b.getName().hashCode() + (this.f1712a * 31);
        }
    }

    public static void c(HashMap hashMap, b bVar, g.b bVar2, Class cls) {
        g.b bVar3 = (g.b) hashMap.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f1713b;
            StringBuilder g10 = f.g("Method ");
            g10.append(method.getName());
            g10.append(" in ");
            g10.append(cls.getName());
            g10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            g10.append(bVar3);
            g10.append(", new value ");
            g10.append(bVar2);
            throw new IllegalArgumentException(g10.toString());
        } else if (bVar3 == null) {
            hashMap.put(bVar, bVar2);
        }
    }

    public final C0012a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1711b);
        }
        for (Class b10 : cls.getInterfaces()) {
            for (Map.Entry next : b(b10).f1711b.entrySet()) {
                c(hashMap, (b) next.getKey(), (g.b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (parameterTypes[0].isAssignableFrom(l.class)) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                g.b value = sVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == g.b.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i10, method), value, cls);
                    z9 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0012a aVar = new C0012a(hashMap);
        this.f1708a.put(cls, aVar);
        this.f1709b.put(cls, Boolean.valueOf(z9));
        return aVar;
    }

    public final C0012a b(Class<?> cls) {
        C0012a aVar = (C0012a) this.f1708a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }
}
