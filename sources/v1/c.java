package v1;

import android.content.Context;
import android.net.Uri;
import i2.b;
import java.io.InputStream;
import o1.h;
import p1.a;
import u1.n;
import u1.o;
import u1.r;
import x1.c0;

public final class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12403a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f12404a;

        public a(Context context) {
            this.f12404a = context;
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new c(this.f12404a);
        }
    }

    public c(Context context) {
        this.f12403a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        boolean z9;
        Uri uri = (Uri) obj;
        boolean z10 = true;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            Long l6 = (Long) hVar.c(c0.f12844d);
            if (l6 == null || l6.longValue() != -1) {
                z10 = false;
            }
            if (z10) {
                b bVar = new b(uri);
                Context context = this.f12403a;
                return new n.a(bVar, p1.a.c(context, uri, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!y3.a.m(uri) || !uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }
}
