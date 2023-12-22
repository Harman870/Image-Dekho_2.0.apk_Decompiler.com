package u9;

import j9.p;
import j9.q;
import j9.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Method f12213a;

    /* renamed from: b  reason: collision with root package name */
    public final q f12214b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12215c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f12216d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final p f12217e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final s f12218f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12219g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12220h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12221i;

    /* renamed from: j  reason: collision with root package name */
    public final x<?>[] f12222j;
    public final boolean k;

    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f12223x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f12224y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final d0 f12225a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f12226b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f12227c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f12228d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f12229e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12230f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12231g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12232h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12233i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f12234j;
        public boolean k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f12235l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f12236m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        public String f12237n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f12238o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f12239p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f12240q;
        @Nullable

        /* renamed from: r  reason: collision with root package name */
        public String f12241r;
        @Nullable

        /* renamed from: s  reason: collision with root package name */
        public p f12242s;
        @Nullable

        /* renamed from: t  reason: collision with root package name */
        public s f12243t;
        @Nullable
        public LinkedHashSet u;
        @Nullable

        /* renamed from: v  reason: collision with root package name */
        public x<?>[] f12244v;
        public boolean w;

        public a(d0 d0Var, Method method) {
            this.f12225a = d0Var;
            this.f12226b = method;
            this.f12227c = method.getAnnotations();
            this.f12229e = method.getGenericParameterTypes();
            this.f12228d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z9) {
            String str3 = this.f12237n;
            if (str3 == null) {
                this.f12237n = str;
                this.f12238o = z9;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f12223x.matcher(substring).find()) {
                            throw h0.i(this.f12226b, (Exception) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f12241r = str2;
                    Matcher matcher = f12223x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.u = linkedHashSet;
                    return;
                }
                return;
            }
            throw h0.i(this.f12226b, (Exception) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (h0.g(type)) {
                throw h0.j(this.f12226b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public a0(a aVar) {
        this.f12213a = aVar.f12226b;
        this.f12214b = aVar.f12225a.f12253c;
        this.f12215c = aVar.f12237n;
        this.f12216d = aVar.f12241r;
        this.f12217e = aVar.f12242s;
        this.f12218f = aVar.f12243t;
        this.f12219g = aVar.f12238o;
        this.f12220h = aVar.f12239p;
        this.f12221i = aVar.f12240q;
        this.f12222j = aVar.f12244v;
        this.k = aVar.w;
    }
}
