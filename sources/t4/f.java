package t4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import h0.e;
import h0.l0;
import h0.s0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;
import z5.c;

public abstract class f extends g<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f12012c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f12013d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f12014e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f12015f;

    public f() {
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout u;
        int i13;
        s0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (u = u(coordinatorLayout.f(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.d.b(u) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.b() + lastWindowInsets.e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int w = w(u) + size;
        int measuredHeight = u.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            w -= measuredHeight;
        }
        if (i14 == -1) {
            i13 = 1073741824;
        } else {
            i13 = Integer.MIN_VALUE;
        }
        coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec(w, i13));
        return true;
    }

    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout u = u(coordinatorLayout.f(view));
        int i11 = 0;
        if (u != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f12012c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, u.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((u.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            s0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (y.d.b(coordinatorLayout) && !y.d.b(view)) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.f12013d;
            int i12 = fVar.f1237c;
            if (i12 == 0) {
                i12 = 8388659;
            }
            e.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f12015f != 0) {
                float v10 = v(u);
                int i13 = this.f12015f;
                i11 = c.e((int) (v10 * ((float) i13)), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            i11 = rect2.top - u.getBottom();
        } else {
            coordinatorLayout.r(view, i10);
        }
        this.f12014e = i11;
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }
}
