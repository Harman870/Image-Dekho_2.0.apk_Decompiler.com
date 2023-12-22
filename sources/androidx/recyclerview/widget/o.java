package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.v {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2132i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2133j = new DecelerateInterpolator();
    public PointF k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2134l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2135m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f2136n;

    /* renamed from: o  reason: collision with root package name */
    public int f2137o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f2138p = 0;

    public o(Context context) {
        this.f2134l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public void c(View view, RecyclerView.v.a aVar) {
        int i10;
        int i11;
        int i12;
        PointF pointF = this.k;
        int i13 = -1;
        int i14 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i10 = 0;
        } else if (i12 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int f10 = f(view, i10);
        PointF pointF2 = this.k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i13 = 0;
        } else if (i11 > 0) {
            i13 = 1;
        }
        RecyclerView.l lVar = this.f1908c;
        if (lVar != null && lVar.f()) {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            i14 = e((view.getTop() - ((RecyclerView.m) view.getLayoutParams()).f1887b.top) - mVar.topMargin, view.getBottom() + ((RecyclerView.m) view.getLayoutParams()).f1887b.bottom + mVar.bottomMargin, lVar.F(), lVar.f1879o - lVar.C(), i13);
        }
        int ceil = (int) Math.ceil(((double) h((int) Math.sqrt((double) ((i14 * i14) + (f10 * f10))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2133j;
            aVar.f1914a = -f10;
            aVar.f1915b = -i14;
            aVar.f1916c = ceil;
            aVar.f1918e = decelerateInterpolator;
            aVar.f1919f = true;
        }
    }

    public int f(View view, int i10) {
        RecyclerView.l lVar = this.f1908c;
        if (lVar == null || !lVar.e()) {
            return 0;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return e((view.getLeft() - ((RecyclerView.m) view.getLayoutParams()).f1887b.left) - mVar.leftMargin, view.getRight() + ((RecyclerView.m) view.getLayoutParams()).f1887b.right + mVar.rightMargin, lVar.D(), lVar.f1878n - lVar.E(), i10);
    }

    public float g(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int h(int i10) {
        float abs = (float) Math.abs(i10);
        if (!this.f2135m) {
            this.f2136n = g(this.f2134l);
            this.f2135m = true;
        }
        return (int) Math.ceil((double) (abs * this.f2136n));
    }
}
