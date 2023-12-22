package u1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.f;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import o1.h;
import u1.n;

public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12125a;

    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f12126a;

        public a(Context context) {
            this.f12126a = context;
        }

        public final n<Uri, File> b(r rVar) {
            return new j(this.f12126a);
        }
    }

    public static class b implements d<File> {

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f12127c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f12128a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f12129b;

        public b(Context context, Uri uri) {
            this.f12128a = context;
            this.f12129b = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final o1.a e() {
            return o1.a.LOCAL;
        }

        public final void f(com.bumptech.glide.j jVar, d.a<? super File> aVar) {
            Cursor query = this.f12128a.getContentResolver().query(this.f12129b, f12127c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder g10 = f.g("Failed to find file path for: ");
                g10.append(this.f12129b);
                aVar.c(new FileNotFoundException(g10.toString()));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public j(Context context) {
        this.f12125a = context;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i2.b(uri), new b(this.f12125a, uri));
    }

    public final boolean b(Object obj) {
        return y3.a.m((Uri) obj);
    }
}
