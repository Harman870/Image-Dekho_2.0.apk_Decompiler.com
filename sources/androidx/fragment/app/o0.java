package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d0.d;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public abstract class o0 {
    public static void d(View view, List list) {
        boolean z9;
        boolean z10;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z9 = false;
                break;
            } else if (list.get(i10) == view) {
                z9 = true;
                break;
            } else {
                i10++;
            }
        }
        if (!z9) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.i.k(view) != null) {
                list.add(view);
            }
            for (int i11 = size; i11 < list.size(); i11++) {
                View view2 = (View) list.get(i11);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = viewGroup.getChildAt(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size) {
                                z10 = false;
                                break;
                            } else if (list.get(i13) == childAt) {
                                z10 = true;
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (!z10 && y.i.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.g.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2);

    public abstract void k(Object obj, View view, ArrayList<View> arrayList);

    public abstract void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void m(View view, Object obj);

    public abstract void n(Object obj, Rect rect);

    public void o(Object obj, d dVar, l lVar) {
        lVar.run();
    }

    public abstract void p(Object obj, View view, ArrayList<View> arrayList);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object r(Object obj);
}
