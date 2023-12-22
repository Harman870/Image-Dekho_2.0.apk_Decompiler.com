package x1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import o1.h;
import o1.j;
import q1.w;
import r1.d;
import z1.c;
import z1.e;

public final class x implements j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final e f12916a;

    /* renamed from: b  reason: collision with root package name */
    public final d f12917b;

    public x(e eVar, d dVar) {
        this.f12916a = eVar;
        this.f12917b = dVar;
    }

    public final boolean a(Object obj, h hVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        w c10 = this.f12916a.c((Uri) obj, hVar);
        if (c10 == null) {
            return null;
        }
        return n.a(this.f12917b, (Drawable) ((c) c10).get(), i10, i11);
    }
}
