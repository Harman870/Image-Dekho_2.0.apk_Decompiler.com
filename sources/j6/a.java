package j6;

import d3.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f8717a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<v<? super T>> f8718b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<k> f8719c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8720d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8721e;

    /* renamed from: f  reason: collision with root package name */
    public final d<T> f8722f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<Class<?>> f8723g;

    /* renamed from: j6.a$a  reason: collision with other inner class name */
    public static class C0105a<T> {

        /* renamed from: a  reason: collision with root package name */
        public String f8724a = null;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f8725b;

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f8726c;

        /* renamed from: d  reason: collision with root package name */
        public int f8727d;

        /* renamed from: e  reason: collision with root package name */
        public int f8728e;

        /* renamed from: f  reason: collision with root package name */
        public d<T> f8729f;

        /* renamed from: g  reason: collision with root package name */
        public final HashSet f8730g;

        public C0105a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f8725b = hashSet;
            this.f8726c = new HashSet();
            int i10 = 0;
            this.f8727d = 0;
            this.f8728e = 0;
            this.f8730g = new HashSet();
            hashSet.add(v.a(cls));
            int length = clsArr.length;
            while (i10 < length) {
                Class cls2 = clsArr[i10];
                if (cls2 != null) {
                    this.f8725b.add(v.a(cls2));
                    i10++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
        }

        public final void a(k kVar) {
            if (!this.f8725b.contains(kVar.f8748a)) {
                this.f8726c.add(kVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final a<T> b() {
            boolean z9;
            if (this.f8729f != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return new a(this.f8724a, new HashSet(this.f8725b), new HashSet(this.f8726c), this.f8727d, this.f8728e, this.f8729f, this.f8730g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i10) {
            if (this.f8727d == 0) {
                this.f8727d = i10;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public a(String str, Set<v<? super T>> set, Set<k> set2, int i10, int i11, d<T> dVar, Set<Class<?>> set3) {
        this.f8717a = str;
        this.f8718b = Collections.unmodifiableSet(set);
        this.f8719c = Collections.unmodifiableSet(set2);
        this.f8720d = i10;
        this.f8721e = i11;
        this.f8722f = dVar;
        this.f8723g = Collections.unmodifiableSet(set3);
    }

    public static <T> C0105a<T> a(Class<T> cls) {
        return new C0105a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> a<T> b(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v.a(cls));
        int length = clsArr.length;
        int i10 = 0;
        while (i10 < length) {
            Class<? super T> cls2 = clsArr[i10];
            if (cls2 != null) {
                hashSet.add(v.a(cls2));
                i10++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new k(t10), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8718b.toArray()) + ">{" + this.f8720d + ", type=" + this.f8721e + ", deps=" + Arrays.toString(this.f8719c.toArray()) + "}";
    }
}
