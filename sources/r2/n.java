package r2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.Log;
import o2.b;
import q2.c;
import q2.f;
import q2.g;

public final class n extends g {

    public class a extends c {
        public int E;

        public a(int i10) {
            this.E = i10;
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            b bVar = new b(this);
            int i10 = 0;
            bVar.e(fArr, f.u, new Integer[]{0, -90, -179, -180, -270, -360});
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.75f);
            bVar.d(fArr, f.w, new Float[]{valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf});
            bVar.d(fArr, f.f11172x, new Float[]{valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf});
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            bVar.d(fArr, f.f11174z, new Float[]{valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3});
            bVar.f10525c = 1800;
            bVar.b(fArr);
            int i11 = this.E;
            if (i11 < 0) {
                Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            } else {
                i10 = i11;
            }
            bVar.f10526d = i10;
            return bVar.a();
        }
    }

    public final void k(f... fVarArr) {
    }

    public final f[] l() {
        return new f[]{new a(0), new a(3)};
    }

    public final void onBoundsChange(Rect rect) {
        Rect a10 = f.a(rect);
        super.onBoundsChange(a10);
        for (int i10 = 0; i10 < j(); i10++) {
            f i11 = i(i10);
            int i12 = a10.left;
            i11.f(i12, a10.top, (a10.width() / 4) + i12, (a10.height() / 4) + a10.top);
        }
    }
}
