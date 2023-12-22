package q9;

import j9.v;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import k9.e;

public final class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f11389c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f11390d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f11391e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f11392f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f11393g;

    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f11394a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11395b;

        /* renamed from: c  reason: collision with root package name */
        public String f11396c;

        public a(ArrayList arrayList) {
            this.f11394a = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.f9153b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f11395b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f11394a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str = (String) list.get(i10);
                            if (this.f11394a.contains(str)) {
                                this.f11396c = str;
                                return str;
                            }
                        }
                        String str2 = this.f11394a.get(0);
                        this.f11396c = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f11396c = (String) objArr[0];
                return null;
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f11389c = method;
        this.f11390d = method2;
        this.f11391e = method3;
        this.f11392f = cls;
        this.f11393g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f11391e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    public final void g(SSLSocket sSLSocket, String str, List<v> list) {
        ArrayList b10 = f.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f11392f, this.f11393g}, new a(b10));
            this.f11389c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f11390d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z9 = aVar.f11395b;
            if (!z9 && aVar.f11396c == null) {
                f.f11399a.m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z9) {
                return null;
            } else {
                return aVar.f11396c;
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
