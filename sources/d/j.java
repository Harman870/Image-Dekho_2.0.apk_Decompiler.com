package d;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.r1;
import com.imgdkh.app.R;
import h0.l0;
import h0.q;
import h0.s0;
import h0.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import y.a;

public final class j implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f5939a;

    public j(i iVar) {
        this.f5939a = iVar;
    }

    public final s0 a(View view, s0 s0Var) {
        boolean z9;
        View view2;
        s0 s0Var2;
        int i10;
        int i11;
        boolean z10;
        int i12;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        int e10 = s0Var.e();
        i iVar = this.f5939a;
        iVar.getClass();
        int e11 = s0Var.e();
        ActionBarContextView actionBarContextView = iVar.f5900v;
        int i14 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) iVar.f5900v.getLayoutParams();
            boolean z11 = true;
            if (iVar.f5900v.isShown()) {
                if (iVar.f5895r0 == null) {
                    iVar.f5895r0 = new Rect();
                    iVar.f5897s0 = new Rect();
                }
                Rect rect = iVar.f5895r0;
                Rect rect2 = iVar.f5897s0;
                rect.set(s0Var.c(), s0Var.e(), s0Var.d(), s0Var.b());
                ViewGroup viewGroup = iVar.B;
                Method method = r1.f933a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception e12) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e12);
                    }
                }
                int i15 = rect.top;
                int i16 = rect.left;
                int i17 = rect.right;
                ViewGroup viewGroup2 = iVar.B;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                s0 a10 = y.j.a(viewGroup2);
                if (a10 == null) {
                    i10 = 0;
                } else {
                    i10 = a10.c();
                }
                if (a10 == null) {
                    i11 = 0;
                } else {
                    i11 = a10.d();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z10 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z10 = true;
                }
                if (i15 <= 0 || iVar.D != null) {
                    View view3 = iVar.D;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i10;
                        marginLayoutParams.rightMargin = i11;
                        iVar.D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(iVar.k);
                    iVar.D = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i10;
                    layoutParams.rightMargin = i11;
                    iVar.B.addView(iVar.D, -1, layoutParams);
                }
                View view5 = iVar.D;
                if (view5 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && view5.getVisibility() != 0) {
                    View view6 = iVar.D;
                    if ((y.d.g(view6) & 8192) == 0) {
                        z11 = false;
                    }
                    if (z11) {
                        context = iVar.k;
                        i12 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = iVar.k;
                        i12 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = a.f13006a;
                    view6.setBackgroundColor(a.c.a(context, i12));
                }
                if (!iVar.I && z9) {
                    e11 = 0;
                }
                z11 = z10;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z9 = false;
            } else {
                z11 = false;
                z9 = false;
            }
            if (z11) {
                iVar.f5900v.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = iVar.D;
        if (view7 != null) {
            if (z9) {
                i14 = 0;
            }
            view7.setVisibility(i14);
        }
        if (e10 != e11) {
            s0Var2 = s0Var.g(s0Var.c(), e11, s0Var.d(), s0Var.b());
            view2 = view;
        } else {
            view2 = view;
            s0Var2 = s0Var;
        }
        return y.i(view2, s0Var2);
    }
}
