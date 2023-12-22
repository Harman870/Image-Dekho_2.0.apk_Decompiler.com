package i4;

import c6.b;
import e9.t;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import n4.z;

public final class kd {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f7447b = Logger.getLogger(kd.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f7448c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7449d;

    /* renamed from: e  reason: collision with root package name */
    public static final kd f7450e = new kd(new v8());

    /* renamed from: f  reason: collision with root package name */
    public static final kd f7451f = new kd(new z());

    /* renamed from: g  reason: collision with root package name */
    public static final kd f7452g = new kd(new t());

    /* renamed from: h  reason: collision with root package name */
    public static final kd f7453h = new kd(new j3());

    /* renamed from: i  reason: collision with root package name */
    public static final kd f7454i = new kd(new b(0));

    /* renamed from: a  reason: collision with root package name */
    public final md f7455a;

    static {
        if (w5.a()) {
            f7448c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f7449d = false;
        } else {
            f7448c = ud.a() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList();
            f7449d = true;
        }
    }

    public kd(md mdVar) {
        this.f7455a = mdVar;
    }

    public static ArrayList b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f7447b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Iterator it = f7448c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f7455a.b(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (f7449d) {
            return this.f7455a.b(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
