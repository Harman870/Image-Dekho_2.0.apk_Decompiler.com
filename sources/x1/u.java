package x1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import q1.s;
import q1.w;
import y3.a;

public final class u implements w<BitmapDrawable>, s {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f12907a;

    /* renamed from: b  reason: collision with root package name */
    public final w<Bitmap> f12908b;

    public u(Resources resources, w<Bitmap> wVar) {
        a.h(resources);
        this.f12907a = resources;
        a.h(wVar);
        this.f12908b = wVar;
    }

    public final int a() {
        return this.f12908b.a();
    }

    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    public final void c() {
        this.f12908b.c();
    }

    public final Object get() {
        return new BitmapDrawable(this.f12907a, this.f12908b.get());
    }

    public final void initialize() {
        w<Bitmap> wVar = this.f12908b;
        if (wVar instanceof s) {
            ((s) wVar).initialize();
        }
    }
}
