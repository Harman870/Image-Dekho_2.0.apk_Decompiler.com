package u1;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import u1.n;

public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f12094a;

    /* renamed from: b  reason: collision with root package name */
    public final C0150a<Data> f12095b;

    /* renamed from: u1.a$a  reason: collision with other inner class name */
    public interface C0150a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, AssetFileDescriptor>, C0150a<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f12096a;

        public b(AssetManager assetManager) {
            this.f12096a = assetManager;
        }

        public final d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new a(this.f12096a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, C0150a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f12097a;

        public c(AssetManager assetManager) {
            this.f12097a = assetManager;
        }

        public final d<InputStream> a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new a(this.f12097a, this);
        }
    }

    public a(AssetManager assetManager, C0150a<Data> aVar) {
        this.f12094a = assetManager;
        this.f12095b = aVar;
    }

    public final n.a a(Object obj, int i10, int i11, o1.h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i2.b(uri), this.f12095b.a(this.f12094a, uri.toString().substring(22)));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
