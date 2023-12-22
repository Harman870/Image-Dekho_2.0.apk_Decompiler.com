package h7;

import g7.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class o {
    public static final u A;
    public static final s B;
    public static final w C = new w();

    /* renamed from: a  reason: collision with root package name */
    public static final p f6982a = new p(Class.class, new e7.s(new k()));

    /* renamed from: b  reason: collision with root package name */
    public static final p f6983b = new p(BitSet.class, new e7.s(new v()));

    /* renamed from: c  reason: collision with root package name */
    public static final y f6984c = new y();

    /* renamed from: d  reason: collision with root package name */
    public static final q f6985d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f6986e = new q(Byte.TYPE, Byte.class, new z());

    /* renamed from: f  reason: collision with root package name */
    public static final q f6987f = new q(Short.TYPE, Short.class, new a0());

    /* renamed from: g  reason: collision with root package name */
    public static final q f6988g = new q(Integer.TYPE, Integer.class, new b0());

    /* renamed from: h  reason: collision with root package name */
    public static final p f6989h = new p(AtomicInteger.class, new e7.s(new c0()));

    /* renamed from: i  reason: collision with root package name */
    public static final p f6990i = new p(AtomicBoolean.class, new e7.s(new d0()));

    /* renamed from: j  reason: collision with root package name */
    public static final p f6991j = new p(AtomicIntegerArray.class, new e7.s(new a()));
    public static final b k = new b();

    /* renamed from: l  reason: collision with root package name */
    public static final p f6992l = new p(Number.class, new e());

    /* renamed from: m  reason: collision with root package name */
    public static final q f6993m = new q(Character.TYPE, Character.class, new f());

    /* renamed from: n  reason: collision with root package name */
    public static final h f6994n = new h();

    /* renamed from: o  reason: collision with root package name */
    public static final i f6995o = new i();

    /* renamed from: p  reason: collision with root package name */
    public static final p f6996p;

    /* renamed from: q  reason: collision with root package name */
    public static final p f6997q = new p(StringBuilder.class, new j());

    /* renamed from: r  reason: collision with root package name */
    public static final p f6998r = new p(StringBuffer.class, new l());

    /* renamed from: s  reason: collision with root package name */
    public static final p f6999s = new p(URL.class, new m());

    /* renamed from: t  reason: collision with root package name */
    public static final p f7000t = new p(URI.class, new n());
    public static final s u = new s(InetAddress.class, new C0098o());

    /* renamed from: v  reason: collision with root package name */
    public static final p f7001v = new p(UUID.class, new p());
    public static final p w = new p(Currency.class, new e7.s(new q()));

    /* renamed from: x  reason: collision with root package name */
    public static final r f7002x = new r();

    /* renamed from: y  reason: collision with root package name */
    public static final r f7003y = new r(Calendar.class, GregorianCalendar.class, new s());

    /* renamed from: z  reason: collision with root package name */
    public static final p f7004z = new p(Locale.class, new t());

    public static class a extends e7.t<AtomicIntegerArray> {
        public final Object a(k7.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.A()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.O()));
                } catch (NumberFormatException e10) {
                    throw new e7.r((Exception) e10);
                }
            }
            aVar.s();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        public final void b(k7.b bVar, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            bVar.c();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.L((long) atomicIntegerArray.get(i10));
            }
            bVar.s();
        }
    }

    public static class a0 extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.O());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    public static class b extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                return Long.valueOf(aVar.P());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    public static class b0 extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                return Integer.valueOf(aVar.O());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    public static class c extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return Float.valueOf((float) aVar.N());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    public static class c0 extends e7.t<AtomicInteger> {
        public final Object a(k7.a aVar) {
            try {
                return new AtomicInteger(aVar.O());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.L((long) ((AtomicInteger) obj).get());
        }
    }

    public static class d extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return Double.valueOf(aVar.N());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    public static class d0 extends e7.t<AtomicBoolean> {
        public final Object a(k7.a aVar) {
            return new AtomicBoolean(aVar.M());
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.P(((AtomicBoolean) obj).get());
        }
    }

    public static class e extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            int W = aVar.W();
            int b10 = o.g.b(W);
            if (b10 == 5 || b10 == 6) {
                return new g7.k(aVar.U());
            }
            if (b10 == 8) {
                aVar.S();
                return null;
            }
            StringBuilder g10 = androidx.activity.f.g("Expecting number, got: ");
            g10.append(com.ironsource.adapters.ironsource.a.l(W));
            throw new e7.r(g10.toString());
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    public static final class e0<T extends Enum<T>> extends e7.t<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f7005a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f7006b = new HashMap();

        public e0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    f7.b bVar = (f7.b) cls.getField(name).getAnnotation(f7.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.f7005a.put(put, enumR);
                        }
                    }
                    this.f7005a.put(name, enumR);
                    this.f7006b.put(enumR, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return (Enum) this.f7005a.get(aVar.U());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            Enum enumR = (Enum) obj;
            bVar.O(enumR == null ? null : (String) this.f7006b.get(enumR));
        }
    }

    public static class f extends e7.t<Character> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            String U = aVar.U();
            if (U.length() == 1) {
                return Character.valueOf(U.charAt(0));
            }
            throw new e7.r(com.ironsource.adapters.ironsource.a.g("Expecting character, got: ", U));
        }

        public final void b(k7.b bVar, Object obj) {
            Character ch = (Character) obj;
            bVar.O(ch == null ? null : String.valueOf(ch));
        }
    }

    public static class g extends e7.t<String> {
        public final Object a(k7.a aVar) {
            int W = aVar.W();
            if (W != 9) {
                return W == 8 ? Boolean.toString(aVar.M()) : aVar.U();
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.O((String) obj);
        }
    }

    public static class h extends e7.t<BigDecimal> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                return new BigDecimal(aVar.U());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((BigDecimal) obj);
        }
    }

    public static class i extends e7.t<BigInteger> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                return new BigInteger(aVar.U());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((BigInteger) obj);
        }
    }

    public static class j extends e7.t<StringBuilder> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return new StringBuilder(aVar.U());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            bVar.O(sb == null ? null : sb.toString());
        }
    }

    public static class k extends e7.t<Class> {
        public final Object a(k7.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final void b(k7.b bVar, Object obj) {
            StringBuilder g10 = androidx.activity.f.g("Attempted to serialize java.lang.Class: ");
            g10.append(((Class) obj).getName());
            g10.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(g10.toString());
        }
    }

    public static class l extends e7.t<StringBuffer> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return new StringBuffer(aVar.U());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            bVar.O(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public static class m extends e7.t<URL> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
            } else {
                String U = aVar.U();
                if (!"null".equals(U)) {
                    return new URL(U);
                }
            }
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            URL url = (URL) obj;
            bVar.O(url == null ? null : url.toExternalForm());
        }
    }

    public static class n extends e7.t<URI> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
            } else {
                try {
                    String U = aVar.U();
                    if (!"null".equals(U)) {
                        return new URI(U);
                    }
                } catch (URISyntaxException e10) {
                    throw new e7.m((Exception) e10);
                }
            }
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            URI uri = (URI) obj;
            bVar.O(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: h7.o$o  reason: collision with other inner class name */
    public static class C0098o extends e7.t<InetAddress> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return InetAddress.getByName(aVar.U());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            bVar.O(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public static class p extends e7.t<UUID> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return UUID.fromString(aVar.U());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            UUID uuid = (UUID) obj;
            bVar.O(uuid == null ? null : uuid.toString());
        }
    }

    public static class q extends e7.t<Currency> {
        public final Object a(k7.a aVar) {
            return Currency.getInstance(aVar.U());
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.O(((Currency) obj).getCurrencyCode());
        }
    }

    public static class r implements e7.u {

        public class a extends e7.t<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e7.t f7007a;

            public a(e7.t tVar) {
                this.f7007a = tVar;
            }

            public final Object a(k7.a aVar) {
                Date date = (Date) this.f7007a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            public final void b(k7.b bVar, Object obj) {
                this.f7007a.b(bVar, (Timestamp) obj);
            }
        }

        public final <T> e7.t<T> b(e7.h hVar, j7.a<T> aVar) {
            if (aVar.f8776a != Timestamp.class) {
                return null;
            }
            hVar.getClass();
            return new a(hVar.b(new j7.a(Date.class)));
        }
    }

    public static class s extends e7.t<Calendar> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.W() != 4) {
                String Q = aVar.Q();
                int O = aVar.O();
                if ("year".equals(Q)) {
                    i10 = O;
                } else if ("month".equals(Q)) {
                    i11 = O;
                } else if ("dayOfMonth".equals(Q)) {
                    i12 = O;
                } else if ("hourOfDay".equals(Q)) {
                    i13 = O;
                } else if ("minute".equals(Q)) {
                    i14 = O;
                } else if ("second".equals(Q)) {
                    i15 = O;
                }
            }
            aVar.t();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        public final void b(k7.b bVar, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                bVar.v();
                return;
            }
            bVar.j();
            bVar.u("year");
            bVar.L((long) calendar.get(1));
            bVar.u("month");
            bVar.L((long) calendar.get(2));
            bVar.u("dayOfMonth");
            bVar.L((long) calendar.get(5));
            bVar.u("hourOfDay");
            bVar.L((long) calendar.get(11));
            bVar.u("minute");
            bVar.L((long) calendar.get(12));
            bVar.u("second");
            bVar.L((long) calendar.get(13));
            bVar.t();
        }
    }

    public static class t extends e7.t<Locale> {
        public final Object a(k7.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.U(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str != null) {
                locale = new Locale(nextToken, nextToken2, str);
            }
            return locale;
        }

        public final void b(k7.b bVar, Object obj) {
            Locale locale = (Locale) obj;
            bVar.O(locale == null ? null : locale.toString());
        }
    }

    public static class u extends e7.t<e7.l> {
        public static e7.l c(k7.a aVar) {
            int b10 = o.g.b(aVar.W());
            if (b10 == 0) {
                e7.j jVar = new e7.j();
                aVar.a();
                while (aVar.A()) {
                    Object c10 = c(aVar);
                    if (c10 == null) {
                        c10 = e7.n.f6209a;
                    }
                    jVar.f6208a.add(c10);
                }
                aVar.s();
                return jVar;
            } else if (b10 == 2) {
                e7.o oVar = new e7.o();
                aVar.c();
                while (aVar.A()) {
                    String Q = aVar.Q();
                    Object c11 = c(aVar);
                    if (c11 == null) {
                        c11 = e7.n.f6209a;
                    }
                    oVar.f6210a.put(Q, c11);
                }
                aVar.t();
                return oVar;
            } else if (b10 == 5) {
                return new e7.p(aVar.U());
            } else {
                if (b10 == 6) {
                    return new e7.p((Number) new g7.k(aVar.U()));
                }
                if (b10 == 7) {
                    return new e7.p(Boolean.valueOf(aVar.M()));
                }
                if (b10 == 8) {
                    aVar.S();
                    return e7.n.f6209a;
                }
                throw new IllegalArgumentException();
            }
        }

        public static void d(e7.l lVar, k7.b bVar) {
            boolean z9;
            if (lVar == null || (lVar instanceof e7.n)) {
                bVar.v();
            } else if (lVar instanceof e7.p) {
                e7.p a10 = lVar.a();
                Object obj = a10.f6212a;
                if (obj instanceof Number) {
                    bVar.N(a10.g());
                } else if (obj instanceof Boolean) {
                    bVar.P(a10.d());
                } else {
                    bVar.O(a10.h());
                }
            } else {
                boolean z10 = lVar instanceof e7.j;
                if (z10) {
                    bVar.c();
                    if (z10) {
                        Iterator<e7.l> it = ((e7.j) lVar).iterator();
                        while (it.hasNext()) {
                            d(it.next(), bVar);
                        }
                        bVar.s();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + lVar);
                }
                boolean z11 = lVar instanceof e7.o;
                if (z11) {
                    bVar.j();
                    if (z11) {
                        g7.l lVar2 = g7.l.this;
                        l.e<K, V> eVar = lVar2.f6617e.f6629d;
                        int i10 = lVar2.f6616d;
                        while (true) {
                            l.e<K, V> eVar2 = lVar2.f6617e;
                            if (eVar != eVar2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!z9) {
                                bVar.t();
                                return;
                            } else if (eVar == eVar2) {
                                throw new NoSuchElementException();
                            } else if (lVar2.f6616d == i10) {
                                l.e<K, V> eVar3 = eVar.f6629d;
                                bVar.u((String) eVar.f6631f);
                                d((e7.l) eVar.f6632g, bVar);
                                eVar = eVar3;
                            } else {
                                throw new ConcurrentModificationException();
                            }
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Object: " + lVar);
                    }
                } else {
                    StringBuilder g10 = androidx.activity.f.g("Couldn't write ");
                    g10.append(lVar.getClass());
                    throw new IllegalArgumentException(g10.toString());
                }
            }
        }

        public final /* bridge */ /* synthetic */ Object a(k7.a aVar) {
            return c(aVar);
        }

        public final /* bridge */ /* synthetic */ void b(k7.b bVar, Object obj) {
            d((e7.l) obj, bVar);
        }
    }

    public static class v extends e7.t<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r8.O() != 0) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(k7.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                int r1 = r8.W()
                r2 = 0
                r3 = r2
            L_0x000e:
                r4 = 2
                if (r1 == r4) goto L_0x0067
                int r4 = o.g.b(r1)
                r5 = 5
                r6 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 6
                if (r4 == r5) goto L_0x003b
                r5 = 7
                if (r4 != r5) goto L_0x0024
                boolean r1 = r8.M()
                goto L_0x004f
            L_0x0024:
                e7.r r8 = new e7.r
                java.lang.String r0 = "Invalid bitset value type: "
                java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
                java.lang.String r1 = com.ironsource.adapters.ironsource.a.l(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x003b:
                int r1 = r8.O()
                if (r1 == 0) goto L_0x004d
                goto L_0x004e
            L_0x0042:
                java.lang.String r1 = r8.U()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005b }
                if (r1 == 0) goto L_0x004d
                goto L_0x004e
            L_0x004d:
                r6 = r2
            L_0x004e:
                r1 = r6
            L_0x004f:
                if (r1 == 0) goto L_0x0054
                r0.set(r3)
            L_0x0054:
                int r3 = r3 + 1
                int r1 = r8.W()
                goto L_0x000e
            L_0x005b:
                e7.r r8 = new e7.r
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = com.ironsource.adapters.ironsource.a.g(r0, r1)
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0067:
                r8.s()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h7.o.v.a(k7.a):java.lang.Object");
        }

        public final void b(k7.b bVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            bVar.c();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.L(bitSet.get(i10) ? 1 : 0);
            }
            bVar.s();
        }
    }

    public static class w implements e7.u {
        public final <T> e7.t<T> b(e7.h hVar, j7.a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.f8776a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new e0(cls2);
        }
    }

    public static class x extends e7.t<Boolean> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            return Boolean.valueOf(aVar.W() == 6 ? Boolean.parseBoolean(aVar.U()) : aVar.M());
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.M((Boolean) obj);
        }
    }

    public static class y extends e7.t<Boolean> {
        public final Object a(k7.a aVar) {
            if (aVar.W() != 9) {
                return Boolean.valueOf(aVar.U());
            }
            aVar.S();
            return null;
        }

        public final void b(k7.b bVar, Object obj) {
            Boolean bool = (Boolean) obj;
            bVar.O(bool == null ? "null" : bool.toString());
        }
    }

    public static class z extends e7.t<Number> {
        public final Object a(k7.a aVar) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.O());
            } catch (NumberFormatException e10) {
                throw new e7.r((Exception) e10);
            }
        }

        public final void b(k7.b bVar, Object obj) {
            bVar.N((Number) obj);
        }
    }

    static {
        x xVar = new x();
        f6985d = new q(Boolean.TYPE, Boolean.class, xVar);
        new c();
        new d();
        g gVar = new g();
        f6996p = new p(String.class, gVar);
        u uVar = new u();
        A = uVar;
        B = new s(e7.l.class, uVar);
    }
}
