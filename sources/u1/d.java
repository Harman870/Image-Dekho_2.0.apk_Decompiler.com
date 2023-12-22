package u1;

import android.util.Base64;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o1.h;
import u1.n;

public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f12102a;

    public interface a<Data> {
    }

    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final String f12103a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f12104b;

        /* renamed from: c  reason: collision with root package name */
        public ByteArrayInputStream f12105c;

        public b(String str, a<Data> aVar) {
            this.f12103a = str;
            this.f12104b = aVar;
        }

        public final Class<Data> a() {
            ((c.a) this.f12104b).getClass();
            return InputStream.class;
        }

        public final void b() {
            try {
                a<Data> aVar = this.f12104b;
                ByteArrayInputStream byteArrayInputStream = this.f12105c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        public final void cancel() {
        }

        public final o1.a e() {
            return o1.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f12104b).a(this.f12103a);
                this.f12105c = a10;
                aVar.d(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f12106a = new a();

        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public final n<Model, InputStream> b(r rVar) {
            return new d(this.f12106a);
        }
    }

    public d(c.a aVar) {
        this.f12102a = aVar;
    }

    public final n.a<Data> a(Model model, int i10, int i11, h hVar) {
        return new n.a<>(new i2.b(model), new b(model.toString(), this.f12102a));
    }

    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
