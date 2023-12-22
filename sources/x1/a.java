package x1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o1.h;
import o1.j;
import q1.w;

public final class a<DataType> implements j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final j<DataType, Bitmap> f12837a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f12838b;

    public a(Resources resources, j<DataType, Bitmap> jVar) {
        this.f12838b = resources;
        this.f12837a = jVar;
    }

    public final boolean a(DataType datatype, h hVar) {
        return this.f12837a.a(datatype, hVar);
    }

    public final w<BitmapDrawable> b(DataType datatype, int i10, int i11, h hVar) {
        w<Bitmap> b10 = this.f12837a.b(datatype, i10, i11, hVar);
        Resources resources = this.f12838b;
        if (b10 == null) {
            return null;
        }
        return new u(resources, b10);
    }
}
