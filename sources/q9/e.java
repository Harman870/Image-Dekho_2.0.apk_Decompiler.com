package q9;

import j9.v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f11397c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f11398d;

    public e(Method method, Method method2) {
        this.f11397c = method;
        this.f11398d = method2;
    }

    public final void g(SSLSocket sSLSocket, String str, List<v> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b10 = f.b(list);
            this.f11397c.invoke(sSLParameters, new Object[]{b10.toArray(new String[b10.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set SSL parameters", e10);
        }
    }

    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f11398d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
