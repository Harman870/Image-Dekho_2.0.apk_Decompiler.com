package u1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o1.h;
import u1.n;

public final class e<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f12107a;

    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f12108a;

        public a(d<Data> dVar) {
            this.f12108a = dVar;
        }

        public final n<File, Data> b(r rVar) {
            return new e(this.f12108a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public final Object b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public final void c(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final File f12109a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f12110b;

        /* renamed from: c  reason: collision with root package name */
        public Data f12111c;

        public c(File file, d<Data> dVar) {
            this.f12109a = file;
            this.f12110b = dVar;
        }

        public final Class<Data> a() {
            return this.f12110b.a();
        }

        public final void b() {
            Data data = this.f12111c;
            if (data != null) {
                try {
                    this.f12110b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public final void cancel() {
        }

        public final o1.a e() {
            return o1.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f12110b.b(this.f12109a);
                this.f12111c = b10;
                aVar.d(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: u1.e$e  reason: collision with other inner class name */
    public static class C0153e extends a<InputStream> {

        /* renamed from: u1.e$e$a */
        public class a implements d<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(File file) {
                return new FileInputStream(file);
            }

            public final void c(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public C0153e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f12107a = dVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        File file = (File) obj;
        return new n.a(new i2.b(file), new c(file, this.f12107a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
