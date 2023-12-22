package r5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import q5.a;
import r5.l;

public final class k extends l.f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f11737c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f11738d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f11737c = arrayList;
        this.f11738d = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        for (l.f a10 : this.f11737c) {
            a10.a(this.f11738d, aVar, i10, canvas);
        }
    }
}
