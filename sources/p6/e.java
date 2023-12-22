package p6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import n6.d;
import n6.f;
import n6.g;

public final class e implements o6.a<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10688e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f10689f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final c f10690g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final a f10691h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10692a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f10693b;

    /* renamed from: c  reason: collision with root package name */
    public a f10694c = f10688e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10695d = false;

    public static final class a implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f10696a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f10696a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public final void a(Object obj, Object obj2) {
            ((g) obj2).d(f10696a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f10692a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f10693b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f10689f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f10690g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f10691h);
        hashMap.remove(cls3);
    }

    public final o6.a a(Class cls, d dVar) {
        this.f10692a.put(cls, dVar);
        this.f10693b.remove(cls);
        return this;
    }
}
