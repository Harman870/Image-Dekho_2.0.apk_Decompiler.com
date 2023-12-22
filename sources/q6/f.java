package q6;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import n6.b;
import n6.c;
import n6.d;
import n6.e;

public final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f11349f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final c f11350g = new c("key", androidx.activity.f.j(androidx.activity.e.d(d.class, new a(1))));

    /* renamed from: h  reason: collision with root package name */
    public static final c f11351h = new c("value", androidx.activity.f.j(androidx.activity.e.d(d.class, new a(2))));

    /* renamed from: i  reason: collision with root package name */
    public static final e f11352i = new e();

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f11353a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f11354b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, n6.f<?>> f11355c;

    /* renamed from: d  reason: collision with root package name */
    public final d<Object> f11356d;

    /* renamed from: e  reason: collision with root package name */
    public final i f11357e = new i(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, d dVar) {
        this.f11353a = byteArrayOutputStream;
        this.f11354b = map;
        this.f11355c = map2;
        this.f11356d = dVar;
    }

    public static int g(c cVar) {
        d dVar = (d) ((Annotation) cVar.f10383b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f11345a;
        }
        throw new b("Field has no @Protobuf config");
    }

    public final e a(c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final e b(c cVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) ((Annotation) cVar.f10383b.get(d.class));
            if (dVar != null) {
                h(((a) dVar).f11345a << 3);
                i(j10);
            } else {
                throw new b("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final e c(c cVar, int i10) {
        e(cVar, i10, true);
        return this;
    }

    public final f d(c cVar, Object obj, boolean z9) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z9 && charSequence.length() == 0) {
                return this;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f11349f);
            h(bytes.length);
            this.f11353a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object d10 : (Collection) obj) {
                d(cVar, d10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry f10 : ((Map) obj).entrySet()) {
                f(f11352i, cVar, f10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z9 || doubleValue != 0.0d) {
                h((g(cVar) << 3) | 1);
                this.f11353a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z9 || floatValue != 0.0f) {
                h((g(cVar) << 3) | 5);
                this.f11353a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z9 || longValue != 0) {
                d dVar = (d) ((Annotation) cVar.f10383b.get(d.class));
                if (dVar != null) {
                    h(((a) dVar).f11345a << 3);
                    i(longValue);
                } else {
                    throw new b("Field has no @Protobuf config");
                }
            }
            return this;
        } else if (obj instanceof Boolean) {
            e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z9 && bArr.length == 0) {
                return this;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f11353a.write(bArr);
            return this;
        } else {
            d dVar2 = this.f11354b.get(obj.getClass());
            if (dVar2 != null) {
                f(dVar2, cVar, obj, z9);
                return this;
            }
            n6.f fVar = this.f11355c.get(obj.getClass());
            if (fVar != null) {
                i iVar = this.f11357e;
                iVar.f11362a = false;
                iVar.f11364c = cVar;
                iVar.f11363b = z9;
                fVar.a(obj, iVar);
                return this;
            } else if (obj instanceof c) {
                e(cVar, ((c) obj).a(), true);
                return this;
            } else if (obj instanceof Enum) {
                e(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                f(this.f11356d, cVar, obj, z9);
                return this;
            }
        }
    }

    public final void e(c cVar, int i10, boolean z9) {
        if (!z9 || i10 != 0) {
            d dVar = (d) ((Annotation) cVar.f10383b.get(d.class));
            if (dVar != null) {
                h(((a) dVar).f11345a << 3);
                h(i10);
                return;
            }
            throw new b("Field has no @Protobuf config");
        }
    }

    public final void f(d dVar, c cVar, Object obj, boolean z9) {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f11353a;
            this.f11353a = bVar;
            dVar.a(obj, this);
            this.f11353a = outputStream;
            long j10 = bVar.f11346a;
            bVar.close();
            if (!z9 || j10 != 0) {
                h((g(cVar) << 3) | 2);
                i(j10);
                dVar.a(obj, this);
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(int i10) {
        while (((long) (i10 & -128)) != 0) {
            this.f11353a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f11353a.write(i10 & 127);
    }

    public final void i(long j10) {
        while ((-128 & j10) != 0) {
            this.f11353a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f11353a.write(((int) j10) & 127);
    }
}
