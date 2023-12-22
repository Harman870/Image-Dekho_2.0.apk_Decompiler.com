package h0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import d.z;
import java.util.Iterator;
import r5.f;

public final /* synthetic */ class j0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6704c;

    public /* synthetic */ j0(Object obj, int i10, Object obj2) {
        this.f6702a = i10;
        this.f6703b = obj;
        this.f6704c = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6702a) {
            case 0:
                ((View) z.this.f6003d.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) this.f6703b;
                int i10 = AppBarLayout.f2843x;
                appBarLayout.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((f) this.f6704c).j(floatValue);
                Drawable drawable = appBarLayout.u;
                if (drawable instanceof f) {
                    ((f) drawable).j(floatValue);
                }
                Iterator it = appBarLayout.f2859q.iterator();
                while (it.hasNext()) {
                    ((AppBarLayout.d) it.next()).a();
                }
                return;
        }
    }
}
