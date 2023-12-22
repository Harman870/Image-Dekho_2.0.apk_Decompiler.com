package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import androidx.lifecycle.e0;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import com.imgdkh.app.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import v0.c;
import v0.e;
import y.a;

public class o implements ComponentCallbacks, View.OnCreateContextMenuListener, l, f0, f, d1.d {
    public static final Object S = new Object();
    public boolean A;
    public boolean B;
    public boolean C = true;
    public boolean D;
    public ViewGroup E;
    public View F;
    public boolean G;
    public boolean H = true;
    public b I;
    public boolean J;
    public boolean K;
    public String L;
    public g.c M = g.c.RESUMED;
    public m N;
    public p0 O;
    public q<l> P = new q<>();
    public d1.c Q;
    public final ArrayList<d> R;

    /* renamed from: a  reason: collision with root package name */
    public int f1562a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1563b;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Parcelable> f1564c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f1565d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f1566e;

    /* renamed from: f  reason: collision with root package name */
    public String f1567f = UUID.randomUUID().toString();

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1568g;

    /* renamed from: h  reason: collision with root package name */
    public o f1569h;

    /* renamed from: i  reason: collision with root package name */
    public String f1570i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f1571j;
    public Boolean k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1572l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1573m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1574n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1575o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1576p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1577q;

    /* renamed from: r  reason: collision with root package name */
    public int f1578r;

    /* renamed from: s  reason: collision with root package name */
    public y f1579s;

    /* renamed from: t  reason: collision with root package name */
    public u<?> f1580t;
    public z u = new z();

    /* renamed from: v  reason: collision with root package name */
    public o f1581v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public int f1582x;

    /* renamed from: y  reason: collision with root package name */
    public String f1583y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1584z;

    public class a extends androidx.activity.result.c {
        public a() {
        }

        public final View i(int i10) {
            View view = o.this.F;
            if (view != null) {
                return view.findViewById(i10);
            }
            StringBuilder g10 = androidx.activity.f.g("Fragment ");
            g10.append(o.this);
            g10.append(" does not have a view");
            throw new IllegalStateException(g10.toString());
        }

        public final boolean m() {
            return o.this.F != null;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1586a;

        /* renamed from: b  reason: collision with root package name */
        public int f1587b;

        /* renamed from: c  reason: collision with root package name */
        public int f1588c;

        /* renamed from: d  reason: collision with root package name */
        public int f1589d;

        /* renamed from: e  reason: collision with root package name */
        public int f1590e;

        /* renamed from: f  reason: collision with root package name */
        public int f1591f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f1592g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f1593h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1594i;

        /* renamed from: j  reason: collision with root package name */
        public Object f1595j;
        public Object k;

        /* renamed from: l  reason: collision with root package name */
        public float f1596l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public View f1597m = null;

        public b() {
            Object obj = o.S;
            this.f1594i = obj;
            this.f1595j = obj;
            this.k = obj;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class d {
        public abstract void a();
    }

    public o() {
        new AtomicInteger();
        this.R = new ArrayList<>();
        this.N = new m(this);
        this.Q = new d1.c(this);
    }

    @Deprecated
    public static o v(Context context, String str, Bundle bundle) {
        try {
            o oVar = (o) t.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(oVar.getClass().getClassLoader());
                oVar.Y(bundle);
            }
            return oVar;
        } catch (InstantiationException e10) {
            throw new c(w0.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (IllegalAccessException e11) {
            throw new c(w0.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new c(w0.d("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new c(w0.d("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    @Deprecated
    public void A() {
        this.D = true;
    }

    @Deprecated
    public void B(int i10, int i11, Intent intent) {
        if (y.I(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void C(Context context) {
        Activity activity;
        this.D = true;
        u<?> uVar = this.f1580t;
        if (uVar == null) {
            activity = null;
        } else {
            activity = uVar.f1635b;
        }
        if (activity != null) {
            this.D = true;
        }
    }

    public void D(Bundle bundle) {
        boolean z9;
        this.D = true;
        W(bundle);
        z zVar = this.u;
        if (zVar.f1659n >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            zVar.f1669z = false;
            zVar.A = false;
            zVar.G.f1441h = false;
            zVar.u(1);
        }
    }

    public View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void F() {
        this.D = true;
    }

    public void G() {
        this.D = true;
    }

    public void H() {
        this.D = true;
    }

    public LayoutInflater I(Bundle bundle) {
        u<?> uVar = this.f1580t;
        if (uVar != null) {
            LayoutInflater B2 = uVar.B();
            B2.setFactory2(this.u.f1652f);
            return B2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void J() {
        this.D = true;
    }

    public void K(Bundle bundle) {
    }

    public void L() {
        this.D = true;
    }

    public void M() {
        this.D = true;
    }

    public void N(Bundle bundle) {
        this.D = true;
    }

    public void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.N();
        boolean z9 = true;
        this.f1577q = true;
        this.O = new p0(p());
        View E2 = E(layoutInflater, viewGroup, bundle);
        this.F = E2;
        if (E2 != null) {
            this.O.d();
            this.F.setTag(R.id.view_tree_lifecycle_owner, this.O);
            this.F.setTag(R.id.view_tree_view_model_store_owner, this.O);
            View view = this.F;
            p0 p0Var = this.O;
            x8.f.f(view, "<this>");
            view.setTag(R.id.view_tree_saved_state_registry_owner, p0Var);
            this.P.i(this.O);
            return;
        }
        if (this.O.f1605b == null) {
            z9 = false;
        }
        if (!z9) {
            this.O = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void P() {
        onLowMemory();
        this.u.m();
    }

    public final void Q(boolean z9) {
        this.u.n(z9);
    }

    public final void R(boolean z9) {
        this.u.s(z9);
    }

    public final boolean S() {
        if (!this.f1584z) {
            return false | this.u.t();
        }
        return false;
    }

    public final p T() {
        p j10 = j();
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context U() {
        Context l6 = l();
        if (l6 != null) {
            return l6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View V() {
        View view = this.F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void W(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.u.S(parcelable);
            z zVar = this.u;
            zVar.f1669z = false;
            zVar.A = false;
            zVar.G.f1441h = false;
            zVar.u(1);
        }
    }

    public final void X(int i10, int i11, int i12, int i13) {
        if (this.I != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            i().f1587b = i10;
            i().f1588c = i11;
            i().f1589d = i12;
            i().f1590e = i13;
        }
    }

    public final void Y(Bundle bundle) {
        boolean z9;
        y yVar = this.f1579s;
        if (yVar != null) {
            if (yVar.f1669z || yVar.A) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1568g = bundle;
    }

    @Deprecated
    public final void Z(boolean z9) {
        c.C0160c cVar = v0.c.f12386a;
        e eVar = new e(this, z9);
        v0.c.c(eVar);
        c.C0160c a10 = v0.c.a(this);
        if (a10.f12395a.contains(c.a.DETECT_SET_USER_VISIBLE_HINT) && v0.c.f(a10, getClass(), e.class)) {
            v0.c.b(a10, eVar);
        }
        boolean z10 = true;
        if (!this.H && z9 && this.f1562a < 5 && this.f1579s != null && w() && this.K) {
            y yVar = this.f1579s;
            f0 g10 = yVar.g(this);
            o oVar = g10.f1473c;
            if (oVar.G) {
                if (yVar.f1648b) {
                    yVar.C = true;
                } else {
                    oVar.G = false;
                    g10.k();
                }
            }
        }
        this.H = z9;
        if (this.f1562a >= 5 || z9) {
            z10 = false;
        }
        this.G = z10;
        if (this.f1563b != null) {
            this.f1566e = Boolean.valueOf(z9);
        }
    }

    public final void a0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        u<?> uVar = this.f1580t;
        if (uVar != null) {
            Context context = uVar.f1636c;
            Object obj = y.a.f13006a;
            a.C0168a.b(context, intent, (Bundle) null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final d1.b c() {
        return this.Q.f6042b;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public androidx.activity.result.c g() {
        return new a();
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1582x));
        printWriter.print(" mTag=");
        printWriter.println(this.f1583y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1562a);
        printWriter.print(" mWho=");
        printWriter.print(this.f1567f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1578r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1572l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1573m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1574n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1575o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1584z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.C);
        printWriter.print(" mHasMenu=");
        int i17 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.H);
        if (this.f1579s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1579s);
        }
        if (this.f1580t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1580t);
        }
        if (this.f1581v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1581v);
        }
        if (this.f1568g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1568g);
        }
        if (this.f1563b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1563b);
        }
        if (this.f1564c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1564c);
        }
        if (this.f1565d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1565d);
        }
        o oVar = this.f1569h;
        if (oVar == null) {
            y yVar = this.f1579s;
            if (yVar == null || (str2 = this.f1570i) == null) {
                oVar = null;
            } else {
                oVar = yVar.B(str2);
            }
        }
        if (oVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(oVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1571j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        b bVar = this.I;
        if (bVar == null) {
            z9 = false;
        } else {
            z9 = bVar.f1586a;
        }
        printWriter.println(z9);
        b bVar2 = this.I;
        if (bVar2 == null) {
            i10 = 0;
        } else {
            i10 = bVar2.f1587b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            b bVar3 = this.I;
            if (bVar3 == null) {
                i16 = 0;
            } else {
                i16 = bVar3.f1587b;
            }
            printWriter.println(i16);
        }
        b bVar4 = this.I;
        if (bVar4 == null) {
            i11 = 0;
        } else {
            i11 = bVar4.f1588c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            b bVar5 = this.I;
            if (bVar5 == null) {
                i15 = 0;
            } else {
                i15 = bVar5.f1588c;
            }
            printWriter.println(i15);
        }
        b bVar6 = this.I;
        if (bVar6 == null) {
            i12 = 0;
        } else {
            i12 = bVar6.f1589d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            b bVar7 = this.I;
            if (bVar7 == null) {
                i14 = 0;
            } else {
                i14 = bVar7.f1589d;
            }
            printWriter.println(i14);
        }
        b bVar8 = this.I;
        if (bVar8 == null) {
            i13 = 0;
        } else {
            i13 = bVar8.f1590e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            b bVar9 = this.I;
            if (bVar9 != null) {
                i17 = bVar9.f1590e;
            }
            printWriter.println(i17);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.F);
        }
        if (l() != null) {
            z0.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        this.u.v(com.ironsource.adapters.ironsource.a.g(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final b i() {
        if (this.I == null) {
            this.I = new b();
        }
        return this.I;
    }

    public final p j() {
        u<?> uVar = this.f1580t;
        if (uVar == null) {
            return null;
        }
        return (p) uVar.f1635b;
    }

    public final y k() {
        if (this.f1580t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context l() {
        u<?> uVar = this.f1580t;
        if (uVar == null) {
            return null;
        }
        return uVar.f1636c;
    }

    public final int n() {
        g.c cVar = this.M;
        return (cVar == g.c.INITIALIZED || this.f1581v == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f1581v.n());
    }

    public final y o() {
        y yVar = this.f1579s;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        T().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onLowMemory() {
        this.D = true;
    }

    public final e0 p() {
        if (this.f1579s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (n() != 1) {
            b0 b0Var = this.f1579s.G;
            e0 e0Var = b0Var.f1438e.get(this.f1567f);
            if (e0Var != null) {
                return e0Var;
            }
            e0 e0Var2 = new e0();
            b0Var.f1438e.put(this.f1567f, e0Var2);
            return e0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final Resources q() {
        return U().getResources();
    }

    public final m r() {
        return this.N;
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        if (this.f1580t != null) {
            y o10 = o();
            if (o10.u != null) {
                o10.f1667x.addLast(new y.j(this.f1567f, i10));
                o10.u.A(intent);
                return;
            }
            u<?> uVar = o10.f1660o;
            if (i10 == -1) {
                Context context = uVar.f1636c;
                Object obj = y.a.f13006a;
                a.C0168a.b(context, intent, (Bundle) null);
                return;
            }
            uVar.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final String t(int i10) {
        return q().getString(i10);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1567f);
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.f1583y != null) {
            sb.append(" tag=");
            sb.append(this.f1583y);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        this.N = new m(this);
        this.Q = new d1.c(this);
        this.L = this.f1567f;
        this.f1567f = UUID.randomUUID().toString();
        this.f1572l = false;
        this.f1573m = false;
        this.f1574n = false;
        this.f1575o = false;
        this.f1576p = false;
        this.f1578r = 0;
        this.f1579s = null;
        this.u = new z();
        this.f1580t = null;
        this.w = 0;
        this.f1582x = 0;
        this.f1583y = null;
        this.f1584z = false;
        this.A = false;
    }

    public final boolean w() {
        return this.f1580t != null && this.f1572l;
    }

    public final boolean x() {
        if (!this.f1584z) {
            y yVar = this.f1579s;
            if (yVar == null) {
                return false;
            }
            o oVar = this.f1581v;
            yVar.getClass();
            return oVar == null ? false : oVar.x();
        }
    }

    public final boolean y() {
        return this.f1578r > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z() {
        /*
            r1 = this;
            boolean r0 = r1.w()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.x()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.F
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.F
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.z():boolean");
    }
}
