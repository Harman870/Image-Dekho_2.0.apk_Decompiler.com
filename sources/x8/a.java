package x8;

import java.io.Serializable;

public abstract class a implements b9.a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient b9.a f12993a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12994b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f12995c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12996d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12997e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12998f;

    /* renamed from: x8.a$a  reason: collision with other inner class name */
    public static class C0167a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final C0167a f12999a = new C0167a();
    }

    public a() {
        this(C0167a.f12999a, (Class) null, (String) null, (String) null, false);
    }

    public a(Object obj, Class cls, String str, String str2, boolean z9) {
        this.f12994b = obj;
        this.f12995c = cls;
        this.f12996d = str;
        this.f12997e = str2;
        this.f12998f = z9;
    }

    public abstract i a();

    public final b b() {
        b bVar;
        Class cls = this.f12995c;
        if (cls == null) {
            return null;
        }
        if (this.f12998f) {
            k.f13004a.getClass();
            bVar = new h(cls);
        } else {
            k.f13004a.getClass();
            bVar = new c(cls);
        }
        return bVar;
    }
}
