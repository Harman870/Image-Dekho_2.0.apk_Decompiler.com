package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.imgdkh.app.R;
import h0.s0;
import h0.y;
import java.util.ArrayList;
import java.util.Iterator;
import x8.f;
import y3.a;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1405a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1406b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1407c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1408d = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        f.f(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.O, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    public final void a(View view) {
        if (this.f1406b.contains(view)) {
            this.f1405a.add(view);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        o oVar;
        f.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof o) {
            oVar = (o) tag;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        s0 s0Var;
        f.f(windowInsets, "insets");
        s0 i10 = s0.i((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1407c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            f.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            s0Var = s0.i((View) null, onApplyWindowInsets);
        } else {
            s0Var = y.i(this, i10);
        }
        if (!s0Var.f6743a.m()) {
            int i11 = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i12 = i11 + 1;
                    y.b(getChildAt(i11), s0Var);
                    if (i12 >= childCount) {
                        break;
                    }
                    i11 = i12;
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        f.f(canvas, "canvas");
        if (this.f1408d) {
            Iterator it = this.f1405a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f.f(canvas, "canvas");
        f.f(view, "child");
        if (!this.f1408d || !(!this.f1405a.isEmpty()) || !this.f1405a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        f.f(view, "view");
        this.f1406b.remove(view);
        if (this.f1405a.remove(view)) {
            this.f1408d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends o> F getFragment() {
        o oVar;
        y yVar;
        p pVar = null;
        View view = this;
        while (true) {
            if (view == null) {
                oVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof o) {
                oVar = (o) tag;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (oVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof p) {
                    pVar = (p) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (pVar != null) {
                yVar = pVar.w();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (oVar.w()) {
            yVar = oVar.k();
        } else {
            throw new IllegalStateException("The Fragment " + oVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return yVar.C(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f.f(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i10 = childCount - 1;
                View childAt = getChildAt(childCount);
                f.e(childAt, "view");
                a(childAt);
                if (i10 < 0) {
                    break;
                }
                childCount = i10;
            }
        }
        super.removeAllViewsInLayout();
    }

    public final void removeView(View view) {
        f.f(view, "view");
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        f.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    public final void removeViewInLayout(View view) {
        f.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        if (i10 < i12) {
            int i13 = i10;
            while (true) {
                int i14 = i13 + 1;
                View childAt = getChildAt(i13);
                f.e(childAt, "view");
                a(childAt);
                if (i14 >= i12) {
                    break;
                }
                i13 = i14;
            }
        }
        super.removeViews(i10, i11);
    }

    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        if (i10 < i12) {
            int i13 = i10;
            while (true) {
                int i14 = i13 + 1;
                View childAt = getChildAt(i13);
                f.e(childAt, "view");
                a(childAt);
                if (i14 >= i12) {
                    break;
                }
                i13 = i14;
            }
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z9) {
        this.f1408d = z9;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f.f(onApplyWindowInsetsListener, "listener");
        this.f1407c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        f.f(view, "view");
        if (view.getParent() == this) {
            this.f1406b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, y yVar) {
        super(context, attributeSet);
        View view;
        f.f(context, "context");
        f.f(attributeSet, "attrs");
        f.f(yVar, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.O, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        o C = yVar.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                String j10 = string != null ? f.j(string, " with tag ") : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + j10);
            }
            t F = yVar.F();
            context.getClassLoader();
            Activity activity = null;
            o v10 = o.v(y.this.f1660o.f1636c, classAttribute, (Bundle) null);
            f.e(v10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            v10.D = true;
            u<?> uVar = v10.f1580t;
            if ((uVar != null ? uVar.f1635b : activity) != null) {
                v10.D = true;
            }
            a aVar = new a(yVar);
            aVar.f1503o = true;
            v10.E = this;
            aVar.c(getId(), v10, string, 1);
            if (!aVar.f1496g) {
                aVar.f1409p.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = yVar.f1649c.f().iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            o oVar = f0Var.f1473c;
            if (oVar.f1582x == getId() && (view = oVar.F) != null && view.getParent() == null) {
                oVar.E = this;
                f0Var.b();
            }
        }
    }
}
