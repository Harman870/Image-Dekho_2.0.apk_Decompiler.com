package t4;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import r5.f;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11993a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f11994b;

    public /* synthetic */ a(AppBarLayout appBarLayout, f fVar) {
        this.f11993a = appBarLayout;
        this.f11994b = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AppBarLayout appBarLayout = this.f11993a;
        f fVar = this.f11994b;
        int i10 = AppBarLayout.f2843x;
        appBarLayout.getClass();
        int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.setAlpha(floatValue);
        Iterator it = appBarLayout.f2859q.iterator();
        while (it.hasNext()) {
            AppBarLayout.d dVar = (AppBarLayout.d) it.next();
            ColorStateList colorStateList = fVar.f11660a.f11683c;
            if (colorStateList != null) {
                colorStateList.withAlpha(floatValue).getDefaultColor();
                dVar.a();
            }
        }
    }
}
