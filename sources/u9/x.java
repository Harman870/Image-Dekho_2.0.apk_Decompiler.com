package u9;

import androidx.fragment.app.w0;
import j9.a0;
import j9.p;
import j9.t;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import u9.a;

public abstract class x<T> {

    public static final class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12320a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12321b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, a0> f12322c;

        public a(Method method, int i10, f<T, a0> fVar) {
            this.f12320a = method;
            this.f12321b = i10;
            this.f12322c = fVar;
        }

        public final void a(z zVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    zVar.k = this.f12322c.b(t10);
                } catch (IOException e10) {
                    Method method = this.f12320a;
                    int i10 = this.f12321b;
                    throw h0.k(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw h0.j(this.f12320a, this.f12321b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class b<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f12323a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f12324b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12325c;

        public b(String str, boolean z9) {
            a.d dVar = a.d.f12210a;
            Objects.requireNonNull(str, "name == null");
            this.f12323a = str;
            this.f12324b = dVar;
            this.f12325c = z9;
        }

        public final void a(z zVar, @Nullable T t10) {
            String b10;
            if (t10 != null && (b10 = this.f12324b.b(t10)) != null) {
                zVar.a(this.f12323a, b10, this.f12325c);
            }
        }
    }

    public static final class c<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12326a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12327b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12328c;

        public c(Method method, int i10, boolean z9) {
            this.f12326a = method;
            this.f12327b = i10;
            this.f12328c = z9;
        }

        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.a(str, obj2, this.f12328c);
                            } else {
                                Method method = this.f12326a;
                                int i10 = this.f12327b;
                                throw h0.j(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.j(this.f12326a, this.f12327b, w0.d("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(this.f12326a, this.f12327b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(this.f12326a, this.f12327b, "Field map was null.", new Object[0]);
        }
    }

    public static final class d<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f12329a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f12330b;

        public d(String str) {
            a.d dVar = a.d.f12210a;
            Objects.requireNonNull(str, "name == null");
            this.f12329a = str;
            this.f12330b = dVar;
        }

        public final void a(z zVar, @Nullable T t10) {
            String b10;
            if (t10 != null && (b10 = this.f12330b.b(t10)) != null) {
                zVar.b(this.f12329a, b10);
            }
        }
    }

    public static final class e<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12331a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12332b;

        public e(Method method, int i10) {
            this.f12331a = method;
            this.f12332b = i10;
        }

        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.b(str, value.toString());
                        } else {
                            throw h0.j(this.f12331a, this.f12332b, w0.d("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(this.f12331a, this.f12332b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(this.f12331a, this.f12332b, "Header map was null.", new Object[0]);
        }
    }

    public static final class f extends x<p> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12333a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12334b;

        public f(int i10, Method method) {
            this.f12333a = method;
            this.f12334b = i10;
        }

        public final void a(z zVar, @Nullable Object obj) {
            p pVar = (p) obj;
            if (pVar != null) {
                p.a aVar = zVar.f12370f;
                aVar.getClass();
                int length = pVar.f8939a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    aVar.b(pVar.d(i10), pVar.g(i10));
                }
                return;
            }
            throw h0.j(this.f12333a, this.f12334b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class g<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12335a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12336b;

        /* renamed from: c  reason: collision with root package name */
        public final p f12337c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, a0> f12338d;

        public g(Method method, int i10, p pVar, f<T, a0> fVar) {
            this.f12335a = method;
            this.f12336b = i10;
            this.f12337c = pVar;
            this.f12338d = fVar;
        }

        public final void a(z zVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    zVar.c(this.f12337c, this.f12338d.b(t10));
                } catch (IOException e10) {
                    Method method = this.f12335a;
                    int i10 = this.f12336b;
                    throw h0.j(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    public static final class h<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12339a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12340b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, a0> f12341c;

        /* renamed from: d  reason: collision with root package name */
        public final String f12342d;

        public h(Method method, int i10, f<T, a0> fVar, String str) {
            this.f12339a = method;
            this.f12340b = i10;
            this.f12341c = fVar;
            this.f12342d = str;
        }

        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.c(p.f("Content-Disposition", w0.d("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f12342d), this.f12341c.b(value));
                        } else {
                            throw h0.j(this.f12339a, this.f12340b, w0.d("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(this.f12339a, this.f12340b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(this.f12339a, this.f12340b, "Part map was null.", new Object[0]);
        }
    }

    public static final class i<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12343a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12344b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12345c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, String> f12346d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f12347e;

        public i(Method method, int i10, String str, boolean z9) {
            a.d dVar = a.d.f12210a;
            this.f12343a = method;
            this.f12344b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f12345c = str;
            this.f12346d = dVar;
            this.f12347e = z9;
        }

        public final void a(z zVar, @Nullable T t10) {
            String str;
            int i10;
            int i11;
            z zVar2 = zVar;
            T t11 = t10;
            if (t11 != null) {
                String str2 = this.f12345c;
                String b10 = this.f12346d.b(t11);
                boolean z9 = this.f12347e;
                if (zVar2.f12367c != null) {
                    int length = b10.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            str = b10;
                            break;
                        }
                        int codePointAt = b10.codePointAt(i12);
                        i10 = -1;
                        i11 = 127;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z9 && (codePointAt == 47 || codePointAt == 37))) {
                            t9.e eVar = new t9.e();
                            eVar.W(0, i12, b10);
                            t9.e eVar2 = null;
                        } else {
                            i12 += Character.charCount(codePointAt);
                        }
                    }
                    t9.e eVar3 = new t9.e();
                    eVar3.W(0, i12, b10);
                    t9.e eVar22 = null;
                    while (i12 < length) {
                        int codePointAt2 = b10.codePointAt(i12);
                        if (!z9 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= i11 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i10 || (!z9 && (codePointAt2 == 47 || codePointAt2 == 37))) {
                                if (eVar22 == null) {
                                    eVar22 = new t9.e();
                                }
                                eVar22.X(codePointAt2);
                                while (!eVar22.p()) {
                                    byte readByte = eVar22.readByte() & 255;
                                    eVar3.R(37);
                                    char[] cArr = z.f12363l;
                                    eVar3.R(cArr[(readByte >> 4) & 15]);
                                    eVar3.R(cArr[readByte & 15]);
                                }
                            } else {
                                eVar3.X(codePointAt2);
                            }
                        }
                        i12 += Character.charCount(codePointAt2);
                        i10 = -1;
                        i11 = 127;
                    }
                    str = eVar3.M();
                    String replace = zVar2.f12367c.replace("{" + str2 + "}", str);
                    if (!z.f12364m.matcher(replace).matches()) {
                        zVar2.f12367c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g("@Path parameters shouldn't perform path traversal ('.' or '..'): ", b10));
                }
                throw new AssertionError();
            }
            throw h0.j(this.f12343a, this.f12344b, androidx.activity.e.c(androidx.activity.f.g("Path parameter \""), this.f12345c, "\" value must not be null."), new Object[0]);
        }
    }

    public static final class j<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f12348a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f12349b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12350c;

        public j(String str, boolean z9) {
            a.d dVar = a.d.f12210a;
            Objects.requireNonNull(str, "name == null");
            this.f12348a = str;
            this.f12349b = dVar;
            this.f12350c = z9;
        }

        public final void a(z zVar, @Nullable T t10) {
            String b10;
            if (t10 != null && (b10 = this.f12349b.b(t10)) != null) {
                zVar.d(this.f12348a, b10, this.f12350c);
            }
        }
    }

    public static final class k<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12351a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12352b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12353c;

        public k(Method method, int i10, boolean z9) {
            this.f12351a = method;
            this.f12352b = i10;
            this.f12353c = z9;
        }

        public final void a(z zVar, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.d(str, obj2, this.f12353c);
                            } else {
                                Method method = this.f12351a;
                                int i10 = this.f12352b;
                                throw h0.j(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.j(this.f12351a, this.f12352b, w0.d("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.j(this.f12351a, this.f12352b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.j(this.f12351a, this.f12352b, "Query map was null", new Object[0]);
        }
    }

    public static final class l<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12354a;

        public l(boolean z9) {
            this.f12354a = z9;
        }

        public final void a(z zVar, @Nullable T t10) {
            if (t10 != null) {
                zVar.d(t10.toString(), (String) null, this.f12354a);
            }
        }
    }

    public static final class m extends x<t.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f12355a = new m();

        public final void a(z zVar, @Nullable Object obj) {
            t.b bVar = (t.b) obj;
            if (bVar != null) {
                zVar.f12373i.f8975c.add(bVar);
            }
        }
    }

    public static final class n extends x<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f12356a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12357b;

        public n(int i10, Method method) {
            this.f12356a = method;
            this.f12357b = i10;
        }

        public final void a(z zVar, @Nullable Object obj) {
            if (obj != null) {
                zVar.f12367c = obj.toString();
                return;
            }
            throw h0.j(this.f12356a, this.f12357b, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class o<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f12358a;

        public o(Class<T> cls) {
            this.f12358a = cls;
        }

        public final void a(z zVar, @Nullable T t10) {
            zVar.f12369e.d(this.f12358a, t10);
        }
    }

    public abstract void a(z zVar, @Nullable T t10);
}
