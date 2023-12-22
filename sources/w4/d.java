package w4;

import android.view.View;
import android.view.animation.LinearInterpolator;
import h0.r0;
import h0.s0;
import java.util.Iterator;
import java.util.List;
import s4.a;

public final class d extends r0.b {

    /* renamed from: c  reason: collision with root package name */
    public final View f12755c;

    /* renamed from: d  reason: collision with root package name */
    public int f12756d;

    /* renamed from: e  reason: collision with root package name */
    public int f12757e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f12758f = new int[2];

    public d(View view) {
        this.f12755c = view;
    }

    public final s0 a(s0 s0Var, List<r0> list) {
        Iterator<r0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r0 next = it.next();
            if ((next.f6715a.c() & 8) != 0) {
                int i10 = this.f12757e;
                float b10 = next.f6715a.b();
                LinearInterpolator linearInterpolator = a.f11855a;
                this.f12755c.setTranslationY((float) (Math.round(b10 * ((float) (0 - i10))) + i10));
                break;
            }
        }
        return s0Var;
    }
}
