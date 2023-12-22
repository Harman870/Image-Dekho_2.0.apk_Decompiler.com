package u1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import o1.h;
import u1.n;

public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f12160a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f12161b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f12162a;

        public a(Resources resources) {
            this.f12162a = resources;
        }

        public final n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f12162a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f12163a;

        public b(Resources resources) {
            this.f12163a = resources;
        }

        public final n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f12163a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f12164a;

        public c(Resources resources) {
            this.f12164a = resources;
        }

        public final n<Integer, InputStream> b(r rVar) {
            return new s(this.f12164a, rVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f12165a;

        public d(Resources resources) {
            this.f12165a = resources;
        }

        public final n<Integer, Uri> b(r rVar) {
            return new s(this.f12165a, v.f12168a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f12161b = resources;
        this.f12160a = nVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f12161b.getResourcePackageName(num.intValue()) + '/' + this.f12161b.getResourceTypeName(num.intValue()) + '/' + this.f12161b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f12160a.a(uri, i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
