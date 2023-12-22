package u1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o1.h;
import u1.n;

public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f12171b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f12172a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f12173a;

        public a(ContentResolver contentResolver) {
            this.f12173a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f12173a, uri);
        }

        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f12174a;

        public b(ContentResolver contentResolver) {
            this.f12174a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.f12174a, uri);
        }

        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f12175a;

        public d(ContentResolver contentResolver) {
            this.f12175a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new n(this.f12175a, uri);
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f12172a = cVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i2.b(uri), this.f12172a.a(uri));
    }

    public final boolean b(Object obj) {
        return f12171b.contains(((Uri) obj).getScheme());
    }
}
