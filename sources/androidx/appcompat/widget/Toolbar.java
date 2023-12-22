package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.n;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.imgdkh.app.R;
import d.a;
import h0.k;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final h0.h G;
    public ArrayList<MenuItem> H;
    public h I;
    public final a J;
    public l1 K;
    public c L;
    public f M;
    public j.a N;
    public f.a O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final b T;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f641a;

    /* renamed from: b  reason: collision with root package name */
    public i0 f642b;

    /* renamed from: c  reason: collision with root package name */
    public i0 f643c;

    /* renamed from: d  reason: collision with root package name */
    public n f644d;

    /* renamed from: e  reason: collision with root package name */
    public p f645e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f646f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f647g;

    /* renamed from: h  reason: collision with root package name */
    public n f648h;

    /* renamed from: i  reason: collision with root package name */
    public View f649i;

    /* renamed from: j  reason: collision with root package name */
    public Context f650j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public int f651l;

    /* renamed from: m  reason: collision with root package name */
    public int f652m;

    /* renamed from: n  reason: collision with root package name */
    public int f653n;

    /* renamed from: o  reason: collision with root package name */
    public int f654o;

    /* renamed from: p  reason: collision with root package name */
    public int f655p;

    /* renamed from: q  reason: collision with root package name */
    public int f656q;

    /* renamed from: r  reason: collision with root package name */
    public int f657r;

    /* renamed from: s  reason: collision with root package name */
    public int f658s;

    /* renamed from: t  reason: collision with root package name */
    public a1 f659t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f660v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f661x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f662y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f663z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f641a;
            if (actionMenuView != null && (cVar = actionMenuView.f572t) != null) {
                cVar.n();
            }
        }
    }

    public class c implements f.a {
        public c() {
        }

        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.O;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        public final void b(androidx.appcompat.view.menu.f fVar) {
            boolean z9;
            c cVar = Toolbar.this.f641a.f572t;
            if (cVar == null || !cVar.m()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                Iterator<k> it = Toolbar.this.G.f6701a.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            f.a aVar = Toolbar.this.O;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            f fVar = Toolbar.this.M;
            if (fVar == null) {
                hVar = null;
            } else {
                hVar = fVar.f669b;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new n(runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements j {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f668a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f669b;

        public f() {
        }

        public final void a(androidx.appcompat.view.menu.f fVar, boolean z9) {
        }

        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            View view = Toolbar.this.f649i;
            if (view instanceof g.b) {
                ((g.b) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f649i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f648h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f649i = null;
            int size = toolbar3.E.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.E.get(size));
                } else {
                    toolbar3.E.clear();
                    this.f669b = null;
                    Toolbar.this.requestLayout();
                    hVar.C = false;
                    hVar.f475n.p(false);
                    Toolbar.this.s();
                    return true;
                }
            }
        }

        public final void d(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f668a;
            if (!(fVar2 == null || (hVar = this.f669b) == null)) {
                fVar2.d(hVar);
            }
            this.f668a = fVar;
        }

        public final void e(Parcelable parcelable) {
        }

        public final void f() {
            if (this.f669b != null) {
                androidx.appcompat.view.menu.f fVar = this.f668a;
                boolean z9 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f668a.getItem(i10) == this.f669b) {
                            z9 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z9) {
                    c(this.f669b);
                }
            }
        }

        public final int getId() {
            return 0;
        }

        public final boolean h(m mVar) {
            return false;
        }

        public final boolean i() {
            return false;
        }

        public final Parcelable j() {
            return null;
        }

        public final boolean l(androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f648h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f648h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f648h);
            }
            Toolbar.this.f649i = hVar.getActionView();
            this.f669b = hVar;
            ViewParent parent2 = Toolbar.this.f649i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f649i);
                }
                Toolbar.this.getClass();
                g gVar = new g();
                Toolbar toolbar4 = Toolbar.this;
                gVar.f5858a = 8388611 | (toolbar4.f653n & 112);
                gVar.f671b = 2;
                toolbar4.f649i.setLayoutParams(gVar);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f649i);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((g) childAt.getLayoutParams()).f671b == 2 || childAt == toolbar6.f641a)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.E.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            hVar.C = true;
            hVar.f475n.p(false);
            View view = Toolbar.this.f649i;
            if (view instanceof g.b) {
                ((g.b) view).onActionViewExpanded();
            }
            Toolbar.this.s();
            return true;
        }
    }

    public static class g extends a.C0073a {

        /* renamed from: b  reason: collision with root package name */
        public int f671b = 0;

        public g() {
            this.f5858a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(g gVar) {
            super((a.C0073a) gVar);
            this.f671b = gVar.f671b;
        }

        public g(a.C0073a aVar) {
            super(aVar);
        }
    }

    public interface h {
    }

    public static class i extends n0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f672c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f673d;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f672c = parcel.readInt();
            this.f673d = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f672c);
            parcel.writeInt(this.f673d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new h0.h();
        this.H = new ArrayList<>();
        this.J = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = y3.a.C;
        i1 m2 = i1.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        y.m(this, context, iArr, attributeSet, m2.f809b, R.attr.toolbarStyle);
        this.f651l = m2.i(28, 0);
        this.f652m = m2.i(19, 0);
        this.w = m2.f809b.getInteger(0, this.w);
        this.f653n = m2.f809b.getInteger(2, 48);
        int c10 = m2.c(22, 0);
        c10 = m2.l(27) ? m2.c(27, c10) : c10;
        this.f658s = c10;
        this.f657r = c10;
        this.f656q = c10;
        this.f655p = c10;
        int c11 = m2.c(25, -1);
        if (c11 >= 0) {
            this.f655p = c11;
        }
        int c12 = m2.c(24, -1);
        if (c12 >= 0) {
            this.f656q = c12;
        }
        int c13 = m2.c(26, -1);
        if (c13 >= 0) {
            this.f657r = c13;
        }
        int c14 = m2.c(23, -1);
        if (c14 >= 0) {
            this.f658s = c14;
        }
        this.f654o = m2.d(13, -1);
        int c15 = m2.c(9, Integer.MIN_VALUE);
        int c16 = m2.c(5, Integer.MIN_VALUE);
        int d10 = m2.d(7, 0);
        int d11 = m2.d(8, 0);
        if (this.f659t == null) {
            this.f659t = new a1();
        }
        a1 a1Var = this.f659t;
        a1Var.f698h = false;
        if (d10 != Integer.MIN_VALUE) {
            a1Var.f695e = d10;
            a1Var.f691a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            a1Var.f696f = d11;
            a1Var.f692b = d11;
        }
        if (!(c15 == Integer.MIN_VALUE && c16 == Integer.MIN_VALUE)) {
            a1Var.a(c15, c16);
        }
        this.u = m2.c(10, Integer.MIN_VALUE);
        this.f660v = m2.c(6, Integer.MIN_VALUE);
        this.f646f = m2.e(4);
        this.f647g = m2.k(3);
        CharSequence k10 = m2.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m2.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f650j = getContext();
        setPopupTheme(m2.i(17, 0));
        Drawable e10 = m2.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m2.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m2.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m2.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m2.l(29)) {
            setTitleTextColor(m2.b(29));
        }
        if (m2.l(20)) {
            setSubtitleTextColor(m2.b(20));
        }
        if (m2.l(14)) {
            k(m2.i(14, 0));
        }
        m2.n();
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0073a ? new g((a.C0073a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new g.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h0.g.b(marginLayoutParams) + h0.g.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i10) {
        boolean z9;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.d(this) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, y.e.d(this));
        arrayList.clear();
        if (z9) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f671b == 0 && r(childAt)) {
                    int i12 = gVar.f5858a;
                    WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                    int d10 = y.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f671b == 0 && r(childAt2)) {
                int i14 = gVar2.f5858a;
                WeakHashMap<View, l0> weakHashMap3 = y.f6776a;
                int d11 = y.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z9) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = new g();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = g(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f671b = 1;
        if (!z9 || this.f649i == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.E.add(view);
    }

    public final void c() {
        if (this.f648h == null) {
            n nVar = new n(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f648h = nVar;
            nVar.setImageDrawable(this.f646f);
            this.f648h.setContentDescription(this.f647g);
            g gVar = new g();
            gVar.f5858a = 8388611 | (this.f653n & 112);
            gVar.f671b = 2;
            this.f648h.setLayoutParams(gVar);
            this.f648h.setOnClickListener(new d());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f641a;
        if (actionMenuView.f568p == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.f641a.setExpandedActionViewsExclusive(true);
            fVar.b(this.M, this.f650j);
            s();
        }
    }

    public final void e() {
        if (this.f641a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f641a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f641a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f641a;
            j.a aVar = this.N;
            c cVar = new c();
            actionMenuView2.u = aVar;
            actionMenuView2.f573v = cVar;
            g gVar = new g();
            gVar.f5858a = 8388613 | (this.f653n & 112);
            this.f641a.setLayoutParams(gVar);
            b(this.f641a, false);
        }
    }

    public final void f() {
        if (this.f644d == null) {
            this.f644d = new n(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f5858a = 8388611 | (this.f653n & 112);
            this.f644d.setLayoutParams(gVar);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        n nVar = this.f648h;
        if (nVar != null) {
            return nVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        n nVar = this.f648h;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        a1 a1Var = this.f659t;
        if (a1Var == null) {
            return 0;
        }
        if (a1Var.f697g) {
            return a1Var.f691a;
        }
        return a1Var.f692b;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f660v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        a1 a1Var = this.f659t;
        if (a1Var != null) {
            return a1Var.f691a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        a1 a1Var = this.f659t;
        if (a1Var != null) {
            return a1Var.f692b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        a1 a1Var = this.f659t;
        if (a1Var == null) {
            return 0;
        }
        if (a1Var.f697g) {
            return a1Var.f692b;
        }
        return a1Var.f691a;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z9;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f641a;
        if (actionMenuView == null || (fVar = actionMenuView.f568p) == null || !fVar.hasVisibleItems()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return Math.max(getContentInsetEnd(), Math.max(this.f660v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        p pVar = this.f645e;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        p pVar = this.f645e;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f641a.getMenu();
    }

    public View getNavButtonView() {
        return this.f644d;
    }

    public CharSequence getNavigationContentDescription() {
        n nVar = this.f644d;
        if (nVar != null) {
            return nVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        n nVar = this.f644d;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f641a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f650j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.f662y;
    }

    public final TextView getSubtitleTextView() {
        return this.f643c;
    }

    public CharSequence getTitle() {
        return this.f661x;
    }

    public int getTitleMarginBottom() {
        return this.f658s;
    }

    public int getTitleMarginEnd() {
        return this.f656q;
    }

    public int getTitleMarginStart() {
        return this.f655p;
    }

    public int getTitleMarginTop() {
        return this.f657r;
    }

    public final TextView getTitleTextView() {
        return this.f642b;
    }

    public n0 getWrapper() {
        if (this.K == null) {
            this.K = new l1(this, true);
        }
        return this.K;
    }

    public final int h(View view, int i10) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = gVar.f5858a & 112;
        if (!(i12 == 16 || i12 == 48 || i12 == 80)) {
            i12 = this.w & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = gVar.topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = gVar.bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        h0.h hVar = this.G;
        getMenuInflater();
        Iterator<k> it2 = hVar.f6701a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + gVar.rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + gVar.leftMargin);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        s();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x028a A[LOOP:0: B:104:0x0288->B:105:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ac A[LOOP:1: B:107:0x02aa->B:108:0x02ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d1 A[LOOP:2: B:110:0x02cf->B:111:0x02d1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0326 A[LOOP:3: B:118:0x0324->B:119:0x0326, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            int r1 = h0.y.e.d(r20)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.F
            r11[r2] = r3
            r11[r3] = r3
            int r12 = h0.y.d.d(r20)
            if (r12 < 0) goto L_0x003c
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            androidx.appcompat.widget.n r13 = r0.f644d
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x0055
            androidx.appcompat.widget.n r13 = r0.f644d
            if (r1 == 0) goto L_0x0050
            int r13 = r0.o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.n(r13, r6, r12, r11)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            androidx.appcompat.widget.n r15 = r0.f648h
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x006c
            androidx.appcompat.widget.n r15 = r0.f648h
            if (r1 == 0) goto L_0x0068
            int r14 = r0.o(r15, r14, r12, r11)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.n(r15, r13, r12, r11)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f641a
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f641a
            if (r1 == 0) goto L_0x007d
            int r13 = r0.n(r15, r13, r12, r11)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.o(r15, r14, r12, r11)
        L_0x0081:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f649i
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f649i
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00bc:
            androidx.appcompat.widget.p r13 = r0.f645e
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00d1
            androidx.appcompat.widget.p r13 = r0.f645e
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00d1:
            androidx.appcompat.widget.i0 r13 = r0.f642b
            boolean r13 = r0.r(r13)
            androidx.appcompat.widget.i0 r14 = r0.f643c
            boolean r14 = r0.r(r14)
            if (r13 == 0) goto L_0x00f8
            androidx.appcompat.widget.i0 r15 = r0.f642b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r3 = r15.topMargin
            r24 = r7
            androidx.appcompat.widget.i0 r7 = r0.f642b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r24 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            androidx.appcompat.widget.i0 r3 = r0.f643c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.i0 r4 = r0.f643c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r23 = r12
            goto L_0x027a
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            androidx.appcompat.widget.i0 r3 = r0.f642b
            goto L_0x0129
        L_0x0127:
            androidx.appcompat.widget.i0 r3 = r0.f643c
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            androidx.appcompat.widget.i0 r4 = r0.f643c
            goto L_0x0130
        L_0x012e:
            androidx.appcompat.widget.i0 r4 = r0.f642b
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            if (r13 == 0) goto L_0x0146
            androidx.appcompat.widget.i0 r15 = r0.f642b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            androidx.appcompat.widget.i0 r15 = r0.f643c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.w
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x0197
            r6 = 80
            if (r15 == r6) goto L_0x018b
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.f657r
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x0174
            r6 = r15
            goto L_0x0189
        L_0x0174:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.f658s
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0189
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0189:
            int r8 = r8 + r6
            goto L_0x01a4
        L_0x018b:
            r23 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f658s
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01a4
        L_0x0197:
            r23 = r12
            int r4 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.f657r
            int r8 = r4 + r3
        L_0x01a4:
            if (r1 == 0) goto L_0x0213
            if (r17 == 0) goto L_0x01ab
            int r1 = r0.f655p
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01e3
            androidx.appcompat.widget.i0 r1 = r0.f642b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            androidx.appcompat.widget.i0 r3 = r0.f642b
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.i0 r4 = r0.f642b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i0 r5 = r0.f642b
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.f656q
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01e4
        L_0x01e3:
            r3 = r10
        L_0x01e4:
            if (r14 == 0) goto L_0x020a
            androidx.appcompat.widget.i0 r1 = r0.f643c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.i0 r1 = r0.f643c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.i0 r4 = r0.f643c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i0 r5 = r0.f643c
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.f656q
            int r1 = r10 - r1
            goto L_0x020b
        L_0x020a:
            r1 = r10
        L_0x020b:
            if (r17 == 0) goto L_0x027a
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x027a
        L_0x0213:
            if (r17 == 0) goto L_0x0218
            int r1 = r0.f655p
            goto L_0x0219
        L_0x0218:
            r1 = 0
        L_0x0219:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x024e
            androidx.appcompat.widget.i0 r1 = r0.f642b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            androidx.appcompat.widget.i0 r3 = r0.f642b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.i0 r4 = r0.f642b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i0 r5 = r0.f642b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f656q
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x024f
        L_0x024e:
            r3 = r2
        L_0x024f:
            if (r14 == 0) goto L_0x0273
            androidx.appcompat.widget.i0 r1 = r0.f643c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.i0 r1 = r0.f643c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.i0 r4 = r0.f643c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i0 r5 = r0.f643c
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.f656q
            int r1 = r1 + r4
            goto L_0x0274
        L_0x0273:
            r1 = r2
        L_0x0274:
            if (r17 == 0) goto L_0x027a
            int r2 = java.lang.Math.max(r3, r1)
        L_0x027a:
            java.util.ArrayList<android.view.View> r1 = r0.D
            r3 = 3
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.D
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0288:
            if (r2 >= r1) goto L_0x029b
            java.util.ArrayList<android.view.View> r4 = r0.D
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.n(r4, r3, r12, r11)
            int r2 = r2 + 1
            goto L_0x0288
        L_0x029b:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.D
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.D
            int r1 = r1.size()
            r2 = 0
        L_0x02aa:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<android.view.View> r4 = r0.D
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.o(r4, r10, r12, r11)
            int r2 = r2 + 1
            goto L_0x02aa
        L_0x02bb:
            java.util.ArrayList<android.view.View> r1 = r0.D
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.D
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02cf:
            if (r5 >= r4) goto L_0x0302
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r9 = (androidx.appcompat.widget.Toolbar.g) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02cf
        L_0x0302:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x0312
            goto L_0x0319
        L_0x0312:
            if (r6 <= r10) goto L_0x0318
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0319
        L_0x0318:
            r3 = r4
        L_0x0319:
            java.util.ArrayList<android.view.View> r1 = r0.D
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x0324:
            if (r3 >= r1) goto L_0x0335
            java.util.ArrayList<android.view.View> r4 = r0.D
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.n(r4, r2, r12, r11)
            int r3 = r3 + 1
            goto L_0x0324
        L_0x0335:
            java.util.ArrayList<android.view.View> r1 = r0.D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z9;
        int[] iArr = this.F;
        char a10 = r1.a(this);
        char c10 = a10 ^ 1;
        int i19 = 0;
        if (r(this.f644d)) {
            q(this.f644d, i10, 0, i11, this.f654o);
            i14 = i(this.f644d) + this.f644d.getMeasuredWidth();
            i13 = Math.max(0, j(this.f644d) + this.f644d.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.f644d.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (r(this.f648h)) {
            q(this.f648h, i10, 0, i11, this.f654o);
            i14 = i(this.f648h) + this.f648h.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f648h) + this.f648h.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f648h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14) + 0;
        iArr[a10] = Math.max(0, currentContentInsetStart - i14);
        if (r(this.f641a)) {
            q(this.f641a, i10, max, i11, this.f654o);
            i15 = i(this.f641a) + this.f641a.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f641a) + this.f641a.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f641a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (r(this.f649i)) {
            max2 += p(this.f649i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f649i) + this.f649i.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f649i.getMeasuredState());
        }
        if (r(this.f645e)) {
            max2 += p(this.f645e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f645e) + this.f645e.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f645e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f671b == 0 && r(childAt)) {
                max2 += p(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, j(childAt) + childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f657r + this.f658s;
        int i22 = this.f655p + this.f656q;
        if (r(this.f642b)) {
            p(this.f642b, i10, max2 + i22, i11, i21, iArr);
            int i23 = i(this.f642b) + this.f642b.getMeasuredWidth();
            i16 = j(this.f642b) + this.f642b.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i12, this.f642b.getMeasuredState());
            i17 = i23;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (r(this.f643c)) {
            i17 = Math.max(i17, p(this.f643c, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += j(this.f643c) + this.f643c.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i18, this.f643c.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i17, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount2) {
                    z9 = true;
                    break;
                }
                View childAt2 = getChildAt(i25);
                if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i25++;
            }
        }
        z9 = false;
        if (!z9) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f9479a);
        ActionMenuView actionMenuView = this.f641a;
        if (actionMenuView != null) {
            fVar = actionMenuView.f568p;
        } else {
            fVar = null;
        }
        int i10 = iVar.f672c;
        if (!(i10 == 0 || this.M == null || fVar == null || (findItem = fVar.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f673d) {
            removeCallbacks(this.T);
            post(this.T);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.a1 r0 = r2.f659t
            if (r0 != 0) goto L_0x000e
            androidx.appcompat.widget.a1 r0 = new androidx.appcompat.widget.a1
            r0.<init>()
            r2.f659t = r0
        L_0x000e:
            androidx.appcompat.widget.a1 r0 = r2.f659t
            r1 = 1
            if (r3 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            boolean r3 = r0.f697g
            if (r1 != r3) goto L_0x001a
            goto L_0x0048
        L_0x001a:
            r0.f697g = r1
            boolean r3 = r0.f698h
            if (r3 == 0) goto L_0x0040
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0032
            int r1 = r0.f694d
            if (r1 == r3) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            int r1 = r0.f695e
        L_0x002b:
            r0.f691a = r1
            int r1 = r0.f693c
            if (r1 == r3) goto L_0x0044
            goto L_0x0046
        L_0x0032:
            int r1 = r0.f693c
            if (r1 == r3) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            int r1 = r0.f695e
        L_0x0039:
            r0.f691a = r1
            int r1 = r0.f694d
            if (r1 == r3) goto L_0x0044
            goto L_0x0046
        L_0x0040:
            int r3 = r0.f695e
            r0.f691a = r3
        L_0x0044:
            int r1 = r0.f696f
        L_0x0046:
            r0.f692b = r1
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r1 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar$i r0 = new androidx.appcompat.widget.Toolbar$i
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$f r1 = r4.M
            if (r1 == 0) goto L_0x0015
            androidx.appcompat.view.menu.h r1 = r1.f669b
            if (r1 == 0) goto L_0x0015
            int r1 = r1.f463a
            r0.f672c = r1
        L_0x0015:
            androidx.appcompat.widget.ActionMenuView r1 = r4.f641a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002b
            androidx.appcompat.widget.c r1 = r1.f572t
            if (r1 == 0) goto L_0x0027
            boolean r1 = r1.m()
            if (r1 == 0) goto L_0x0027
            r1 = r2
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r0.f673d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r4.S != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x0052
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.e.a(r4)
            androidx.appcompat.widget.Toolbar$f r1 = r4.M
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            androidx.appcompat.view.menu.h r1 = r1.f669b
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0028
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            boolean r1 = h0.y.g.b(r4)
            if (r1 == 0) goto L_0x0028
            boolean r1 = r4.S
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            if (r2 == 0) goto L_0x0044
            android.window.OnBackInvokedDispatcher r1 = r4.R
            if (r1 != 0) goto L_0x0044
            android.window.OnBackInvokedCallback r1 = r4.Q
            if (r1 != 0) goto L_0x003e
            androidx.appcompat.widget.j1 r1 = new androidx.appcompat.widget.j1
            r1.<init>(r3, r4)
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.widget.Toolbar.e.b(r1)
            r4.Q = r1
        L_0x003e:
            android.window.OnBackInvokedCallback r1 = r4.Q
            androidx.appcompat.widget.Toolbar.e.c(r0, r1)
            goto L_0x0050
        L_0x0044:
            if (r2 != 0) goto L_0x0052
            android.window.OnBackInvokedDispatcher r0 = r4.R
            if (r0 == 0) goto L_0x0052
            android.window.OnBackInvokedCallback r1 = r4.Q
            androidx.appcompat.widget.Toolbar.e.d(r0, r1)
            r0 = 0
        L_0x0050:
            r4.R = r0
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.s():void");
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.S != z9) {
            this.S = z9;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        n nVar = this.f648h;
        if (nVar != null) {
            nVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(e.a.a(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f648h.setImageDrawable(drawable);
            return;
        }
        n nVar = this.f648h;
        if (nVar != null) {
            nVar.setImageDrawable(this.f646f);
        }
    }

    public void setCollapsible(boolean z9) {
        this.P = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f660v) {
            this.f660v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.u) {
            this.u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(e.a.a(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f645e == null) {
                this.f645e = new p(getContext());
            }
            if (!m(this.f645e)) {
                b(this.f645e, true);
            }
        } else {
            p pVar = this.f645e;
            if (pVar != null && m(pVar)) {
                removeView(this.f645e);
                this.E.remove(this.f645e);
            }
        }
        p pVar2 = this.f645e;
        if (pVar2 != null) {
            pVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f645e == null) {
            this.f645e = new p(getContext());
        }
        p pVar = this.f645e;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        n nVar = this.f644d;
        if (nVar != null) {
            nVar.setContentDescription(charSequence);
            m1.a(this.f644d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(e.a.a(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f644d)) {
                b(this.f644d, true);
            }
        } else {
            n nVar = this.f644d;
            if (nVar != null && m(nVar)) {
                removeView(this.f644d);
                this.E.remove(this.f644d);
            }
        }
        n nVar2 = this.f644d;
        if (nVar2 != null) {
            nVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f644d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f641a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.k != i10) {
            this.k = i10;
            if (i10 == 0) {
                this.f650j = getContext();
            } else {
                this.f650j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f643c == null) {
                Context context = getContext();
                i0 i0Var = new i0(context, (AttributeSet) null);
                this.f643c = i0Var;
                i0Var.setSingleLine();
                this.f643c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f652m;
                if (i10 != 0) {
                    this.f643c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f643c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f643c)) {
                b(this.f643c, true);
            }
        } else {
            i0 i0Var2 = this.f643c;
            if (i0Var2 != null && m(i0Var2)) {
                removeView(this.f643c);
                this.E.remove(this.f643c);
            }
        }
        i0 i0Var3 = this.f643c;
        if (i0Var3 != null) {
            i0Var3.setText(charSequence);
        }
        this.f662y = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        i0 i0Var = this.f643c;
        if (i0Var != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f642b == null) {
                Context context = getContext();
                i0 i0Var = new i0(context, (AttributeSet) null);
                this.f642b = i0Var;
                i0Var.setSingleLine();
                this.f642b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f651l;
                if (i10 != 0) {
                    this.f642b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f663z;
                if (colorStateList != null) {
                    this.f642b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f642b)) {
                b(this.f642b, true);
            }
        } else {
            i0 i0Var2 = this.f642b;
            if (i0Var2 != null && m(i0Var2)) {
                removeView(this.f642b);
                this.E.remove(this.f642b);
            }
        }
        i0 i0Var3 = this.f642b;
        if (i0Var3 != null) {
            i0Var3.setText(charSequence);
        }
        this.f661x = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f658s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f656q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f655p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f657r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f663z = colorStateList;
        i0 i0Var = this.f642b;
        if (i0Var != null) {
            i0Var.setTextColor(colorStateList);
        }
    }
}
