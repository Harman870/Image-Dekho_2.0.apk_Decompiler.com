package v1;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import o1.h;
import p1.a;
import u1.n;
import u1.o;
import u1.r;

public final class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12401a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f12402a;

        public a(Context context) {
            this.f12402a = context;
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new b(this.f12402a);
        }
    }

    public b(Context context) {
        this.f12401a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        boolean z9;
        Uri uri = (Uri) obj;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return null;
        }
        i2.b bVar = new i2.b(uri);
        Context context = this.f12401a;
        return new n.a(bVar, p1.a.c(context, uri, new a.C0124a(context.getContentResolver())));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!y3.a.m(uri) || uri.getPathSegments().contains("video")) {
            return false;
        }
        return true;
    }
}
