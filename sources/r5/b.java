package r5;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f11656a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11657b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f11656a;
            f10 += ((b) cVar).f11657b;
        }
        this.f11656a = cVar;
        this.f11657b = f10;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f11656a.a(rectF) + this.f11657b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11656a.equals(bVar.f11656a) && this.f11657b == bVar.f11657b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11656a, Float.valueOf(this.f11657b)});
    }
}
