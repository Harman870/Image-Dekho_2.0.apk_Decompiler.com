package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import b0.a;
import com.imgdkh.app.R;
import java.util.ArrayList;

public final class c extends androidx.appcompat.view.menu.a {

    /* renamed from: j  reason: collision with root package name */
    public d f716j;
    public Drawable k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f717l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f718m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f719n;

    /* renamed from: o  reason: collision with root package name */
    public int f720o;

    /* renamed from: p  reason: collision with root package name */
    public int f721p;

    /* renamed from: q  reason: collision with root package name */
    public int f722q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f723r;

    /* renamed from: s  reason: collision with root package name */
    public final SparseBooleanArray f724s = new SparseBooleanArray();

    /* renamed from: t  reason: collision with root package name */
    public e f725t;
    public a u;

    /* renamed from: v  reason: collision with root package name */
    public C0006c f726v;
    public b w;

    /* renamed from: x  reason: collision with root package name */
    public final f f727x = new f();

    /* renamed from: y  reason: collision with root package name */
    public int f728y;

    public class a extends i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false);
            boolean z9 = false;
            if (!((mVar.A.f483x & 32) == 32 ? true : z9)) {
                View view2 = c.this.f716j;
                this.f492f = view2 == null ? (View) c.this.f390h : view2;
            }
            f fVar = c.this.f727x;
            this.f495i = fVar;
            h.d dVar = this.f496j;
            if (dVar != null) {
                dVar.k(fVar);
            }
        }

        public final void c() {
            c cVar = c.this;
            cVar.u = null;
            cVar.f728y = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class C0006c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public e f731a;

        public C0006c(e eVar) {
            this.f731a = eVar;
        }

        public final void run() {
            f.a aVar;
            androidx.appcompat.view.menu.f fVar = c.this.f385c;
            if (!(fVar == null || (aVar = fVar.f443e) == null)) {
                aVar.b(fVar);
            }
            View view = (View) c.this.f390h;
            if (!(view == null || view.getWindowToken() == null)) {
                e eVar = this.f731a;
                boolean z9 = true;
                if (!eVar.b()) {
                    if (eVar.f492f == null) {
                        z9 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z9) {
                    c.this.f725t = this.f731a;
                }
            }
            c.this.f726v = null;
        }
    }

    public class d extends p implements ActionMenuView.a {

        public class a extends r0 {
            public a(View view) {
                super(view);
            }

            public final h.f b() {
                e eVar = c.this.f725t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public final boolean c() {
                c.this.n();
                return true;
            }

            public final boolean d() {
                c cVar = c.this;
                if (cVar.f726v != null) {
                    return false;
                }
                cVar.g();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            m1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f493g = 8388613;
            f fVar2 = c.this.f727x;
            this.f495i = fVar2;
            h.d dVar2 = this.f496j;
            if (dVar2 != null) {
                dVar2.k(fVar2);
            }
        }

        public final void c() {
            androidx.appcompat.view.menu.f fVar = c.this.f385c;
            if (fVar != null) {
                fVar.c(true);
            }
            c.this.f725t = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        public final void a(androidx.appcompat.view.menu.f fVar, boolean z9) {
            if (fVar instanceof m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f387e;
            if (aVar != null) {
                aVar.a(fVar, z9);
            }
        }

        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f385c) {
                return false;
            }
            cVar.f728y = ((m) fVar).A.f463a;
            j.a aVar = cVar.f387e;
            if (aVar != null) {
                return aVar.b(fVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f737a;

        public class a implements Parcelable.Creator<g> {
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            public final Object[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g() {
        }

        public g(Parcel parcel) {
            this.f737a = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f737a);
        }
    }

    public c(Context context) {
        super(context);
    }

    public final void a(androidx.appcompat.view.menu.f fVar, boolean z9) {
        g();
        a aVar = this.u;
        if (aVar != null && aVar.b()) {
            aVar.f496j.dismiss();
        }
        j.a aVar2 = this.f387e;
        if (aVar2 != null) {
            aVar2.a(fVar, z9);
        }
    }

    public final View b(h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i10 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f386d.inflate(this.f389g, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f390h);
            if (this.w == null) {
                this.w = new b();
            }
            actionMenuItemView.setPopupCallback(this.w);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final void d(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f384b = context;
        LayoutInflater.from(context);
        this.f385c = fVar;
        Resources resources = context.getResources();
        if (!this.f719n) {
            this.f718m = true;
        }
        int i10 = 2;
        this.f720o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f722q = i10;
        int i13 = this.f720o;
        if (this.f718m) {
            if (this.f716j == null) {
                d dVar = new d(this.f383a);
                this.f716j = dVar;
                if (this.f717l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.f717l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f716j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f716j.getMeasuredWidth();
        } else {
            this.f716j = null;
        }
        this.f721p = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final void e(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f737a) > 0 && (findItem = this.f385c.findItem(i10)) != null) {
            h((m) findItem.getSubMenu());
        }
    }

    public final void f() {
        k kVar;
        int i10;
        boolean z9;
        boolean z10;
        h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f390h;
        boolean z11 = false;
        ArrayList<h> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f385c;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l6 = this.f385c.l();
                int size = l6.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    h hVar2 = l6.get(i11);
                    if ((hVar2.f483x & 32) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View b10 = b(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            b10.setPressed(false);
                            b10.jumpDrawablesToCurrentState();
                        }
                        if (b10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b10);
                            }
                            ((ViewGroup) this.f390h).addView(b10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f716j) {
                    z9 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z9 = true;
                }
                if (!z9) {
                    i10++;
                }
            }
        }
        ((View) this.f390h).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f385c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.f447i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                h0.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f385c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f448j;
        }
        if (this.f718m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f716j;
        if (z11) {
            if (dVar == null) {
                this.f716j = new d(this.f383a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f716j.getParent();
            if (viewGroup3 != this.f390h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f716j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f390h;
                d dVar2 = this.f716j;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                cVar.gravity = 16;
                cVar.f577a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null && dVar.getParent() == (kVar = this.f390h)) {
            ((ViewGroup) kVar).removeView(this.f716j);
        }
        ((ActionMenuView) this.f390h).setOverflowReserved(this.f718m);
    }

    public final boolean g() {
        k kVar;
        C0006c cVar = this.f726v;
        if (cVar == null || (kVar = this.f390h) == null) {
            e eVar = this.f725t;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f496j.dismiss();
            }
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f726v = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.f r2 = r0.f519z
            androidx.appcompat.view.menu.f r3 = r8.f385c
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.h r0 = r0.A
            androidx.appcompat.view.menu.k r2 = r8.f390h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r4 = r2.getChildCount()
            r5 = r1
        L_0x0022:
            if (r5 >= r4) goto L_0x003a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.k.a
            if (r7 == 0) goto L_0x0037
            r7 = r6
            androidx.appcompat.view.menu.k$a r7 = (androidx.appcompat.view.menu.k.a) r7
            androidx.appcompat.view.menu.h r7 = r7.getItemData()
            if (r7 != r0) goto L_0x0037
            r3 = r6
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            androidx.appcompat.view.menu.h r0 = r9.A
            int r0 = r0.f463a
            r8.f728y = r0
            int r0 = r9.size()
            r2 = r1
        L_0x0048:
            r4 = 1
            if (r2 >= r0) goto L_0x0060
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005d
            r0 = r4
            goto L_0x0061
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0060:
            r0 = r1
        L_0x0061:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r5 = r8.f384b
            r2.<init>(r5, r9, r3)
            r8.u = r2
            r2.f494h = r0
            h.d r2 = r2.f496j
            if (r2 == 0) goto L_0x0073
            r2.p(r0)
        L_0x0073:
            androidx.appcompat.widget.c$a r0 = r8.u
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007d
        L_0x007b:
            r1 = r4
            goto L_0x0086
        L_0x007d:
            android.view.View r2 = r0.f492f
            if (r2 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            r0.d(r1, r1, r1, r1)
            goto L_0x007b
        L_0x0086:
            if (r1 == 0) goto L_0x0090
            androidx.appcompat.view.menu.j$a r0 = r8.f387e
            if (r0 == 0) goto L_0x008f
            r0.b(r9)
        L_0x008f:
            return r4
        L_0x0090:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.h(androidx.appcompat.view.menu.m):boolean");
    }

    public final boolean i() {
        int i10;
        ArrayList<h> arrayList;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f385c;
        if (fVar != null) {
            arrayList = fVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = cVar.f722q;
        int i13 = cVar.f721p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f390h;
        int i14 = 0;
        boolean z17 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z9 = true;
            if (i14 >= i10) {
                break;
            }
            h hVar = arrayList.get(i14);
            int i17 = hVar.f484y;
            if ((i17 & 2) == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    i16++;
                } else {
                    z17 = true;
                }
            }
            if (cVar.f723r && hVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (cVar.f718m && (z17 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = cVar.f724s;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            h hVar2 = arrayList.get(i19);
            int i21 = hVar2.f484y;
            if ((i21 & 2) == i11) {
                z10 = z9;
            } else {
                z10 = false;
            }
            if (z10) {
                View b10 = cVar.b(hVar2, (View) null, viewGroup);
                b10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = hVar2.f464b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z9);
                }
                hVar2.g(z9);
            } else {
                if ((i21 & true) == z9) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i23 = hVar2.f464b;
                    boolean z18 = sparseBooleanArray.get(i23);
                    if ((i18 > 0 || z18) && i13 > 0) {
                        z12 = z9;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View b11 = cVar.b(hVar2, (View) null, viewGroup);
                        b11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = b11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z12 &= z14;
                    }
                    if (z12 && i23 != 0) {
                        sparseBooleanArray.put(i23, true);
                    } else if (z18) {
                        sparseBooleanArray.put(i23, false);
                        int i24 = 0;
                        while (i24 < i19) {
                            h hVar3 = arrayList.get(i24);
                            if (hVar3.f464b == i23) {
                                if ((hVar3.f483x & 32) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    i18++;
                                }
                                hVar3.g(false);
                            }
                            i24++;
                        }
                    }
                    if (z12) {
                        i18--;
                    }
                    hVar2.g(z12);
                } else {
                    hVar2.g(false);
                    i19++;
                    i11 = 2;
                    cVar = this;
                    z9 = true;
                }
            }
            i19++;
            i11 = 2;
            cVar = this;
            z9 = true;
        }
        return z9;
    }

    public final Parcelable j() {
        g gVar = new g();
        gVar.f737a = this.f728y;
        return gVar;
    }

    public final boolean m() {
        e eVar = this.f725t;
        return eVar != null && eVar.b();
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f718m || m() || (fVar = this.f385c) == null || this.f390h == null || this.f726v != null) {
            return false;
        }
        fVar.i();
        if (fVar.f448j.isEmpty()) {
            return false;
        }
        C0006c cVar = new C0006c(new e(this.f384b, this.f385c, this.f716j));
        this.f726v = cVar;
        ((View) this.f390h).post(cVar);
        return true;
    }
}
