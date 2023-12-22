package j5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.imgdkh.app.R;
import java.util.ArrayList;

public final class i implements androidx.appcompat.view.menu.j {
    public int A = -1;
    public final a B = new a();

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f8640a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f8641b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.view.menu.f f8642c;

    /* renamed from: d  reason: collision with root package name */
    public int f8643d;

    /* renamed from: e  reason: collision with root package name */
    public c f8644e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f8645f;

    /* renamed from: g  reason: collision with root package name */
    public int f8646g = 0;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f8647h;

    /* renamed from: i  reason: collision with root package name */
    public int f8648i = 0;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f8649j;
    public ColorStateList k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f8650l;

    /* renamed from: m  reason: collision with root package name */
    public RippleDrawable f8651m;

    /* renamed from: n  reason: collision with root package name */
    public int f8652n;

    /* renamed from: o  reason: collision with root package name */
    public int f8653o;

    /* renamed from: p  reason: collision with root package name */
    public int f8654p;

    /* renamed from: q  reason: collision with root package name */
    public int f8655q;

    /* renamed from: r  reason: collision with root package name */
    public int f8656r;

    /* renamed from: s  reason: collision with root package name */
    public int f8657s;

    /* renamed from: t  reason: collision with root package name */
    public int f8658t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8659v;
    public boolean w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f8660x;

    /* renamed from: y  reason: collision with root package name */
    public int f8661y;

    /* renamed from: z  reason: collision with root package name */
    public int f8662z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            c cVar = i.this.f8644e;
            boolean z9 = true;
            if (cVar != null) {
                cVar.f8666e = true;
            }
            androidx.appcompat.view.menu.h itemData = navigationMenuItemView.getItemData();
            i iVar = i.this;
            boolean q10 = iVar.f8642c.q(itemData, iVar, 0);
            if (itemData == null || !itemData.isCheckable() || !q10) {
                z9 = false;
            } else {
                i.this.f8644e.h(itemData);
            }
            i iVar2 = i.this;
            c cVar2 = iVar2.f8644e;
            if (cVar2 != null) {
                cVar2.f8666e = false;
            }
            if (z9) {
                iVar2.f();
            }
        }
    }

    public static class b extends l {
        public b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    public class c extends RecyclerView.d<l> {

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f8664c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f8665d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8666e;

        public c() {
            g();
        }

        public final int a() {
            return this.f8664c.size();
        }

        public final long b(int i10) {
            return (long) i10;
        }

        public final int c(int i10) {
            e eVar = this.f8664c.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (!(eVar instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((g) eVar).f8670a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.android.material.internal.NavigationMenuItemView} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.widget.TextView} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.google.android.material.internal.NavigationMenuItemView} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.google.android.material.internal.NavigationMenuItemView} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.google.android.material.internal.NavigationMenuItemView} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(androidx.recyclerview.widget.RecyclerView.z r6, int r7) {
            /*
                r5 = this;
                j5.i$l r6 = (j5.i.l) r6
                int r0 = r5.c(r7)
                if (r0 == 0) goto L_0x006a
                r1 = 1
                if (r0 == r1) goto L_0x0030
                r2 = 2
                if (r0 == r2) goto L_0x0017
                r2 = 3
                if (r0 == r2) goto L_0x0013
                goto L_0x00ea
            L_0x0013:
                android.view.View r6 = r6.f1942a
                goto L_0x00e2
            L_0x0017:
                java.util.ArrayList<j5.i$e> r0 = r5.f8664c
                java.lang.Object r7 = r0.get(r7)
                j5.i$f r7 = (j5.i.f) r7
                android.view.View r6 = r6.f1942a
                j5.i r0 = j5.i.this
                int r1 = r0.f8656r
                int r2 = r7.f8668a
                int r0 = r0.f8657s
                int r7 = r7.f8669b
                r6.setPadding(r1, r2, r0, r7)
                goto L_0x00ea
            L_0x0030:
                android.view.View r6 = r6.f1942a
                android.widget.TextView r6 = (android.widget.TextView) r6
                java.util.ArrayList<j5.i$e> r0 = r5.f8664c
                java.lang.Object r0 = r0.get(r7)
                j5.i$g r0 = (j5.i.g) r0
                androidx.appcompat.view.menu.h r0 = r0.f8670a
                java.lang.CharSequence r0 = r0.f467e
                r6.setText(r0)
                j5.i r0 = j5.i.this
                int r0 = r0.f8646g
                if (r0 == 0) goto L_0x004c
                r6.setTextAppearance(r0)
            L_0x004c:
                j5.i r0 = j5.i.this
                int r0 = r0.f8658t
                int r2 = r6.getPaddingTop()
                j5.i r3 = j5.i.this
                int r3 = r3.u
                int r4 = r6.getPaddingBottom()
                r6.setPadding(r0, r2, r3, r4)
                j5.i r0 = j5.i.this
                android.content.res.ColorStateList r0 = r0.f8647h
                if (r0 == 0) goto L_0x00e2
                r6.setTextColor(r0)
                goto L_0x00e2
            L_0x006a:
                android.view.View r6 = r6.f1942a
                com.google.android.material.internal.NavigationMenuItemView r6 = (com.google.android.material.internal.NavigationMenuItemView) r6
                j5.i r0 = j5.i.this
                android.content.res.ColorStateList r0 = r0.k
                r6.setIconTintList(r0)
                j5.i r0 = j5.i.this
                int r0 = r0.f8648i
                if (r0 == 0) goto L_0x007e
                r6.setTextAppearance(r0)
            L_0x007e:
                j5.i r0 = j5.i.this
                android.content.res.ColorStateList r0 = r0.f8649j
                if (r0 == 0) goto L_0x0087
                r6.setTextColor(r0)
            L_0x0087:
                j5.i r0 = j5.i.this
                android.graphics.drawable.Drawable r0 = r0.f8650l
                if (r0 == 0) goto L_0x0096
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                goto L_0x0097
            L_0x0096:
                r0 = 0
            L_0x0097:
                java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
                h0.y.d.q(r6, r0)
                j5.i r0 = j5.i.this
                android.graphics.drawable.RippleDrawable r0 = r0.f8651m
                if (r0 == 0) goto L_0x00ad
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                android.graphics.drawable.Drawable r0 = r0.newDrawable()
                r6.setForeground(r0)
            L_0x00ad:
                java.util.ArrayList<j5.i$e> r0 = r5.f8664c
                java.lang.Object r0 = r0.get(r7)
                j5.i$g r0 = (j5.i.g) r0
                boolean r1 = r0.f8671b
                r6.setNeedsEmptyIcon(r1)
                j5.i r1 = j5.i.this
                int r2 = r1.f8652n
                int r1 = r1.f8653o
                r6.setPadding(r2, r1, r2, r1)
                j5.i r1 = j5.i.this
                int r1 = r1.f8654p
                r6.setIconPadding(r1)
                j5.i r1 = j5.i.this
                boolean r2 = r1.f8659v
                if (r2 == 0) goto L_0x00d5
                int r1 = r1.f8655q
                r6.setIconSize(r1)
            L_0x00d5:
                j5.i r1 = j5.i.this
                int r1 = r1.f8660x
                r6.setMaxLines(r1)
                androidx.appcompat.view.menu.h r0 = r0.f8670a
                r1 = 0
                r6.c(r0)
            L_0x00e2:
                j5.j r0 = new j5.j
                r0.<init>(r5, r7, r1)
                h0.y.n(r6, r0)
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.i.c.d(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public final RecyclerView.z e(RecyclerView recyclerView, int i10) {
            RecyclerView.z zVar;
            if (i10 == 0) {
                i iVar = i.this;
                zVar = new C0104i(iVar.f8645f, recyclerView, iVar.B);
            } else if (i10 == 1) {
                zVar = new k(i.this.f8645f, recyclerView);
            } else if (i10 == 2) {
                zVar = new j(i.this.f8645f, recyclerView);
            } else if (i10 != 3) {
                return null;
            } else {
                return new b(i.this.f8641b);
            }
            return zVar;
        }

        public final void f(RecyclerView.z zVar) {
            l lVar = (l) zVar;
            if (lVar instanceof C0104i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f1942a;
                FrameLayout frameLayout = navigationMenuItemView.f3264z;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f3263y.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public final void g() {
            if (!this.f8666e) {
                this.f8666e = true;
                this.f8664c.clear();
                this.f8664c.add(new d());
                int i10 = -1;
                int size = i.this.f8642c.l().size();
                boolean z9 = false;
                int i11 = 0;
                boolean z10 = false;
                int i12 = 0;
                while (i11 < size) {
                    androidx.appcompat.view.menu.h hVar = i.this.f8642c.l().get(i11);
                    if (hVar.isChecked()) {
                        h(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.f(z9);
                    }
                    if (hVar.hasSubMenu()) {
                        m mVar = hVar.f476o;
                        if (mVar.hasVisibleItems()) {
                            if (i11 != 0) {
                                this.f8664c.add(new f(i.this.f8662z, z9 ? 1 : 0));
                            }
                            this.f8664c.add(new g(hVar));
                            int size2 = mVar.size();
                            int i13 = z9;
                            int i14 = i13;
                            while (i13 < size2) {
                                androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) mVar.getItem(i13);
                                if (hVar2.isVisible()) {
                                    if (i14 == 0 && hVar2.getIcon() != null) {
                                        i14 = 1;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.f(z9);
                                    }
                                    if (hVar.isChecked()) {
                                        h(hVar);
                                    }
                                    this.f8664c.add(new g(hVar2));
                                }
                                i13++;
                                z9 = false;
                            }
                            if (i14 != 0) {
                                int size3 = this.f8664c.size();
                                for (int size4 = this.f8664c.size(); size4 < size3; size4++) {
                                    ((g) this.f8664c.get(size4)).f8671b = true;
                                }
                            }
                        }
                    } else {
                        int i15 = hVar.f464b;
                        if (i15 != i10) {
                            i12 = this.f8664c.size();
                            if (hVar.getIcon() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i11 != 0) {
                                i12++;
                                ArrayList<e> arrayList = this.f8664c;
                                int i16 = i.this.f8662z;
                                arrayList.add(new f(i16, i16));
                            }
                        } else if (!z10 && hVar.getIcon() != null) {
                            int size5 = this.f8664c.size();
                            for (int i17 = i12; i17 < size5; i17++) {
                                ((g) this.f8664c.get(i17)).f8671b = true;
                            }
                            z10 = true;
                        }
                        g gVar = new g(hVar);
                        gVar.f8671b = z10;
                        this.f8664c.add(gVar);
                        i10 = i15;
                    }
                    i11++;
                    z9 = false;
                }
                this.f8666e = z9;
            }
        }

        public final void h(androidx.appcompat.view.menu.h hVar) {
            if (this.f8665d != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.f8665d;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f8665d = hVar;
                hVar.setChecked(true);
            }
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f8668a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8669b;

        public f(int i10, int i11) {
            this.f8668a = i10;
            this.f8669b = i11;
        }
    }

    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f8670a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8671b;

        public g(androidx.appcompat.view.menu.h hVar) {
            this.f8670a = hVar;
        }
    }

    public class h extends x {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        public final void d(View view, i0.f fVar) {
            int i10;
            int i11;
            super.d(view, fVar);
            c cVar = i.this.f8644e;
            if (i.this.f8641b.getChildCount() == 0) {
                i11 = 0;
                i10 = 0;
            } else {
                i10 = 1;
                i11 = 0;
            }
            while (i11 < i.this.f8644e.a()) {
                int c10 = i.this.f8644e.c(i11);
                if (c10 == 0 || c10 == 1) {
                    i10++;
                }
                i11++;
            }
            fVar.f7091a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 1, false));
        }
    }

    /* renamed from: j5.i$i  reason: collision with other inner class name */
    public static class C0104i extends l {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0104i(android.view.LayoutInflater r3, androidx.recyclerview.widget.RecyclerView r4, j5.i.a r5) {
            /*
                r2 = this;
                r0 = 2131492916(0x7f0c0034, float:1.8609297E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.i.C0104i.<init>(android.view.LayoutInflater, androidx.recyclerview.widget.RecyclerView, j5.i$a):void");
        }
    }

    public static class j extends l {
        public j(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, recyclerView, false));
        }
    }

    public static class k extends l {
        public k(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, recyclerView, false));
        }
    }

    public static abstract class l extends RecyclerView.z {
        public l(View view) {
            super(view);
        }
    }

    public final void a(androidx.appcompat.view.menu.f fVar, boolean z9) {
    }

    public final boolean c(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public final void d(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f8645f = LayoutInflater.from(context);
        this.f8642c = fVar;
        this.f8662z = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void e(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        l lVar;
        androidx.appcompat.view.menu.h hVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f8640a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f8644e;
                cVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                if (i10 != 0) {
                    cVar.f8666e = true;
                    int size = cVar.f8664c.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        e eVar = cVar.f8664c.get(i11);
                        if ((eVar instanceof g) && (hVar2 = ((g) eVar).f8670a) != null && hVar2.f463a == i10) {
                            cVar.h(hVar2);
                            break;
                        }
                        i11++;
                    }
                    cVar.f8666e = false;
                    cVar.g();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f8664c.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar2 = cVar.f8664c.get(i12);
                        if (!(!(eVar2 instanceof g) || (hVar = ((g) eVar2).f8670a) == null || (actionView = hVar.getActionView()) == null || (lVar = (l) sparseParcelableArray2.get(hVar.f463a)) == null)) {
                            actionView.restoreHierarchyState(lVar);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f8641b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void f() {
        c cVar = this.f8644e;
        if (cVar != null) {
            cVar.g();
            cVar.f1855a.b();
        }
    }

    public final int getId() {
        return this.f8643d;
    }

    public final boolean h(m mVar) {
        return false;
    }

    public final boolean i() {
        return false;
    }

    public final Parcelable j() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f8640a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f8640a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f8644e;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.h hVar = cVar.f8665d;
            if (hVar != null) {
                bundle2.putInt("android:menu:checked", hVar.f463a);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = cVar.f8664c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = cVar.f8664c.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h hVar2 = ((g) eVar).f8670a;
                    if (hVar2 != null) {
                        view = hVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        l lVar = new l();
                        view.saveHierarchyState(lVar);
                        sparseArray2.put(hVar2.f463a, lVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f8641b != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f8641b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final boolean l(androidx.appcompat.view.menu.h hVar) {
        return false;
    }
}
