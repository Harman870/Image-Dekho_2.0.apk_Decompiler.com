package j1;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import h0.q;
import h0.s0;
import h0.y;

public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f8000a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager f8001b;

    public b(ViewPager viewPager) {
        this.f8001b = viewPager;
    }

    public final s0 a(View view, s0 s0Var) {
        s0 i10 = y.i(view, s0Var);
        if (i10.f6743a.m()) {
            return i10;
        }
        Rect rect = this.f8000a;
        rect.left = i10.c();
        rect.top = i10.e();
        rect.right = i10.d();
        rect.bottom = i10.b();
        int childCount = this.f8001b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            s0 b10 = y.b(this.f8001b.getChildAt(i11), i10);
            rect.left = Math.min(b10.c(), rect.left);
            rect.top = Math.min(b10.e(), rect.top);
            rect.right = Math.min(b10.d(), rect.right);
            rect.bottom = Math.min(b10.b(), rect.bottom);
        }
        return i10.g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
