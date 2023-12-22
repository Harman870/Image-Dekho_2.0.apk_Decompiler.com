package q1;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import o1.c;
import o1.h;
import o1.k;
import r1.d;
import x1.b;

public final class t implements k {

    /* renamed from: a  reason: collision with root package name */
    public Object f11138a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11139b;

    public /* synthetic */ t() {
        this.f11138a = new HashMap();
        this.f11139b = new HashMap();
    }

    public /* synthetic */ t(String str, Map map) {
        this.f11139b = str;
        this.f11138a = map;
    }

    public /* synthetic */ t(d dVar, b bVar) {
        this.f11138a = dVar;
        this.f11139b = bVar;
    }

    public final c c(h hVar) {
        return ((k) this.f11139b).c(hVar);
    }

    public final boolean d(Object obj, File file, h hVar) {
        return ((k) this.f11139b).d(new x1.d(((BitmapDrawable) ((w) obj).get()).getBitmap(), (d) this.f11138a), file, hVar);
    }
}
