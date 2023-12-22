package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.f;
import androidx.fragment.app.o;
import androidx.fragment.app.t0;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import v0.c;
import z0.b;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final w f1471a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f1472b;

    /* renamed from: c  reason: collision with root package name */
    public final o f1473c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1474d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1475e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1476a;

        public a(View view) {
            this.f1476a = view;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f1476a.removeOnAttachStateChangeListener(this);
            View view2 = this.f1476a;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.h.c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public f0(w wVar, g0 g0Var, o oVar) {
        this.f1471a = wVar;
        this.f1472b = g0Var;
        this.f1473c = oVar;
    }

    public f0(w wVar, g0 g0Var, o oVar, e0 e0Var) {
        this.f1471a = wVar;
        this.f1472b = g0Var;
        this.f1473c = oVar;
        oVar.f1564c = null;
        oVar.f1565d = null;
        oVar.f1578r = 0;
        oVar.f1575o = false;
        oVar.f1572l = false;
        o oVar2 = oVar.f1569h;
        oVar.f1570i = oVar2 != null ? oVar2.f1567f : null;
        oVar.f1569h = null;
        Bundle bundle = e0Var.f1468m;
        oVar.f1563b = bundle == null ? new Bundle() : bundle;
    }

    public f0(w wVar, g0 g0Var, ClassLoader classLoader, t tVar, e0 e0Var) {
        this.f1471a = wVar;
        this.f1472b = g0Var;
        o v10 = o.v(y.this.f1660o.f1636c, e0Var.f1457a, (Bundle) null);
        Bundle bundle = e0Var.f1466j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        v10.Y(e0Var.f1466j);
        v10.f1567f = e0Var.f1458b;
        v10.f1574n = e0Var.f1459c;
        v10.f1576p = true;
        v10.w = e0Var.f1460d;
        v10.f1582x = e0Var.f1461e;
        v10.f1583y = e0Var.f1462f;
        v10.B = e0Var.f1463g;
        v10.f1573m = e0Var.f1464h;
        v10.A = e0Var.f1465i;
        v10.f1584z = e0Var.k;
        v10.M = g.c.values()[e0Var.f1467l];
        Bundle bundle2 = e0Var.f1468m;
        v10.f1563b = bundle2 == null ? new Bundle() : bundle2;
        this.f1473c = v10;
        if (y.I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + v10);
        }
    }

    public final void a() {
        if (y.I(3)) {
            StringBuilder g10 = f.g("moveto ACTIVITY_CREATED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        Bundle bundle = oVar.f1563b;
        oVar.u.N();
        oVar.f1562a = 3;
        oVar.D = false;
        oVar.A();
        if (oVar.D) {
            if (y.I(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + oVar);
            }
            View view = oVar.F;
            if (view != null) {
                Bundle bundle2 = oVar.f1563b;
                SparseArray<Parcelable> sparseArray = oVar.f1564c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    oVar.f1564c = null;
                }
                if (oVar.F != null) {
                    p0 p0Var = oVar.O;
                    p0Var.f1606c.b(oVar.f1565d);
                    oVar.f1565d = null;
                }
                oVar.D = false;
                oVar.N(bundle2);
                if (!oVar.D) {
                    throw new y0("Fragment " + oVar + " did not call through to super.onViewStateRestored()");
                } else if (oVar.F != null) {
                    oVar.O.a(g.b.ON_CREATE);
                }
            }
            oVar.f1563b = null;
            z zVar = oVar.u;
            zVar.f1669z = false;
            zVar.A = false;
            zVar.G.f1441h = false;
            zVar.u(4);
            w wVar = this.f1471a;
            Bundle bundle3 = this.f1473c.f1563b;
            wVar.a(false);
            return;
        }
        throw new y0("Fragment " + oVar + " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        View view;
        View view2;
        g0 g0Var = this.f1472b;
        o oVar = this.f1473c;
        g0Var.getClass();
        ViewGroup viewGroup = oVar.E;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) g0Var.f1482a).indexOf(oVar);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) g0Var.f1482a).size()) {
                            break;
                        }
                        o oVar2 = (o) ((ArrayList) g0Var.f1482a).get(indexOf);
                        if (oVar2.E == viewGroup && (view = oVar2.F) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    o oVar3 = (o) ((ArrayList) g0Var.f1482a).get(i11);
                    if (oVar3.E == viewGroup && (view2 = oVar3.F) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        o oVar4 = this.f1473c;
        oVar4.E.addView(oVar4.F, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.fragment.app.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.y.I(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "moveto ATTACHED: "
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            androidx.fragment.app.o r1 = r6.f1473c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x001b:
            androidx.fragment.app.o r0 = r6.f1473c
            androidx.fragment.app.o r1 = r0.f1569h
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            r4 = 0
            java.lang.String r5 = "Fragment "
            if (r1 == 0) goto L_0x0064
            androidx.fragment.app.g0 r0 = r6.f1472b
            java.lang.String r1 = r1.f1567f
            java.lang.Object r0 = r0.f1483b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.f0 r0 = (androidx.fragment.app.f0) r0
            if (r0 == 0) goto L_0x0044
            androidx.fragment.app.o r1 = r6.f1473c
            androidx.fragment.app.o r2 = r1.f1569h
            java.lang.String r2 = r2.f1567f
            r1.f1570i = r2
            r1.f1569h = r4
            r4 = r0
            goto L_0x0092
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = androidx.activity.f.g(r5)
            androidx.fragment.app.o r4 = r6.f1473c
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.o r3 = r6.f1473c
            androidx.fragment.app.o r3 = r3.f1569h
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            java.lang.String r0 = r0.f1570i
            if (r0 == 0) goto L_0x0092
            androidx.fragment.app.g0 r1 = r6.f1472b
            java.lang.Object r1 = r1.f1483b
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            r4 = r0
            androidx.fragment.app.f0 r4 = (androidx.fragment.app.f0) r4
            if (r4 == 0) goto L_0x0078
            goto L_0x0092
        L_0x0078:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = androidx.activity.f.g(r5)
            androidx.fragment.app.o r4 = r6.f1473c
            r1.append(r4)
            r1.append(r3)
            androidx.fragment.app.o r3 = r6.f1473c
            java.lang.String r3 = r3.f1570i
            java.lang.String r1 = androidx.activity.e.c(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L_0x0092:
            if (r4 == 0) goto L_0x0097
            r4.k()
        L_0x0097:
            androidx.fragment.app.o r0 = r6.f1473c
            androidx.fragment.app.y r1 = r0.f1579s
            androidx.fragment.app.u<?> r2 = r1.f1660o
            r0.f1580t = r2
            androidx.fragment.app.o r1 = r1.f1662q
            r0.f1581v = r1
            androidx.fragment.app.w r0 = r6.f1471a
            r1 = 0
            r0.g(r1)
            androidx.fragment.app.o r0 = r6.f1473c
            java.util.ArrayList<androidx.fragment.app.o$d> r2 = r0.R
            java.util.Iterator r2 = r2.iterator()
        L_0x00b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.o$d r3 = (androidx.fragment.app.o.d) r3
            r3.a()
            goto L_0x00b1
        L_0x00c1:
            java.util.ArrayList<androidx.fragment.app.o$d> r2 = r0.R
            r2.clear()
            androidx.fragment.app.z r2 = r0.u
            androidx.fragment.app.u<?> r3 = r0.f1580t
            androidx.activity.result.c r4 = r0.g()
            r2.c(r3, r4, r0)
            r0.f1562a = r1
            r0.D = r1
            androidx.fragment.app.u<?> r2 = r0.f1580t
            android.content.Context r2 = r2.f1636c
            r0.C(r2)
            boolean r2 = r0.D
            if (r2 == 0) goto L_0x010b
            androidx.fragment.app.y r2 = r0.f1579s
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.c0> r2 = r2.f1658m
            java.util.Iterator r2 = r2.iterator()
        L_0x00e8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f8
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.c0 r3 = (androidx.fragment.app.c0) r3
            r3.a()
            goto L_0x00e8
        L_0x00f8:
            androidx.fragment.app.z r0 = r0.u
            r0.f1669z = r1
            r0.A = r1
            androidx.fragment.app.b0 r2 = r0.G
            r2.f1441h = r1
            r0.u(r1)
            androidx.fragment.app.w r0 = r6.f1471a
            r0.b(r1)
            return
        L_0x010b:
            androidx.fragment.app.y0 r1 = new androidx.fragment.app.y0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = " did not call through to super.onAttach()"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.c():void");
    }

    public final int d() {
        o oVar = this.f1473c;
        if (oVar.f1579s == null) {
            return oVar.f1562a;
        }
        int i10 = this.f1475e;
        int ordinal = oVar.M.ordinal();
        int i11 = 0;
        if (ordinal == 1) {
            i10 = Math.min(i10, 0);
        } else if (ordinal == 2) {
            i10 = Math.min(i10, 1);
        } else if (ordinal == 3) {
            i10 = Math.min(i10, 5);
        } else if (ordinal != 4) {
            i10 = Math.min(i10, -1);
        }
        o oVar2 = this.f1473c;
        if (oVar2.f1574n) {
            if (oVar2.f1575o) {
                i10 = Math.max(this.f1475e, 2);
                View view = this.f1473c.F;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f1475e < 4 ? Math.min(i10, oVar2.f1562a) : Math.min(i10, 1);
            }
        }
        if (!this.f1473c.f1572l) {
            i10 = Math.min(i10, 1);
        }
        o oVar3 = this.f1473c;
        ViewGroup viewGroup = oVar3.E;
        t0.b bVar = null;
        if (viewGroup != null) {
            t0 f10 = t0.f(viewGroup, oVar3.o().G());
            f10.getClass();
            t0.b d10 = f10.d(this.f1473c);
            if (d10 != null) {
                i11 = d10.f1629b;
            }
            o oVar4 = this.f1473c;
            Iterator<t0.b> it = f10.f1624c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t0.b next = it.next();
                if (next.f1630c.equals(oVar4) && !next.f1633f) {
                    bVar = next;
                    break;
                }
            }
            if (bVar != null && (i11 == 0 || i11 == 1)) {
                i11 = bVar.f1629b;
            }
        }
        if (i11 == 2) {
            i10 = Math.min(i10, 6);
        } else if (i11 == 3) {
            i10 = Math.max(i10, 3);
        } else {
            o oVar5 = this.f1473c;
            if (oVar5.f1573m) {
                if (oVar5.y()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        o oVar6 = this.f1473c;
        if (oVar6.G && oVar6.f1562a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (y.I(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f1473c);
        }
        return i10;
    }

    public final void e() {
        if (y.I(3)) {
            StringBuilder g10 = f.g("moveto CREATED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        if (!oVar.K) {
            this.f1471a.h(false);
            o oVar2 = this.f1473c;
            Bundle bundle = oVar2.f1563b;
            oVar2.u.N();
            oVar2.f1562a = 1;
            oVar2.D = false;
            oVar2.N.a(new Fragment$5(oVar2));
            oVar2.Q.b(bundle);
            oVar2.D(bundle);
            oVar2.K = true;
            if (oVar2.D) {
                oVar2.N.f(g.b.ON_CREATE);
                w wVar = this.f1471a;
                Bundle bundle2 = this.f1473c.f1563b;
                wVar.c(false);
                return;
            }
            throw new y0("Fragment " + oVar2 + " did not call through to super.onCreate()");
        }
        oVar.W(oVar.f1563b);
        this.f1473c.f1562a = 1;
    }

    public final void f() {
        String str;
        if (!this.f1473c.f1574n) {
            if (y.I(3)) {
                StringBuilder g10 = f.g("moveto CREATE_VIEW: ");
                g10.append(this.f1473c);
                Log.d("FragmentManager", g10.toString());
            }
            o oVar = this.f1473c;
            LayoutInflater I = oVar.I(oVar.f1563b);
            ViewGroup viewGroup = null;
            o oVar2 = this.f1473c;
            ViewGroup viewGroup2 = oVar2.E;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = oVar2.f1582x;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) oVar2.f1579s.f1661p.i(i10);
                        if (viewGroup == null) {
                            o oVar3 = this.f1473c;
                            if (!oVar3.f1576p) {
                                try {
                                    str = oVar3.q().getResourceName(this.f1473c.f1582x);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder g11 = f.g("No view found for id 0x");
                                g11.append(Integer.toHexString(this.f1473c.f1582x));
                                g11.append(" (");
                                g11.append(str);
                                g11.append(") for fragment ");
                                g11.append(this.f1473c);
                                throw new IllegalArgumentException(g11.toString());
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            o oVar4 = this.f1473c;
                            c.C0160c cVar = c.f12386a;
                            x8.f.f(oVar4, "fragment");
                            v0.g gVar = new v0.g(oVar4, viewGroup);
                            c.c(gVar);
                            c.C0160c a10 = c.a(oVar4);
                            if (a10.f12395a.contains(c.a.DETECT_WRONG_FRAGMENT_CONTAINER) && c.f(a10, oVar4.getClass(), v0.g.class)) {
                                c.b(a10, gVar);
                            }
                        }
                    } else {
                        StringBuilder g12 = f.g("Cannot create fragment ");
                        g12.append(this.f1473c);
                        g12.append(" for a container view with no id");
                        throw new IllegalArgumentException(g12.toString());
                    }
                }
            }
            o oVar5 = this.f1473c;
            oVar5.E = viewGroup;
            oVar5.O(I, viewGroup, oVar5.f1563b);
            View view = this.f1473c.F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                o oVar6 = this.f1473c;
                oVar6.F.setTag(R.id.fragment_container_view_tag, oVar6);
                if (viewGroup != null) {
                    b();
                }
                o oVar7 = this.f1473c;
                if (oVar7.f1584z) {
                    oVar7.F.setVisibility(8);
                }
                View view2 = this.f1473c.F;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (y.g.b(view2)) {
                    y.h.c(this.f1473c.F);
                } else {
                    View view3 = this.f1473c.F;
                    view3.addOnAttachStateChangeListener(new a(view3));
                }
                this.f1473c.u.u(2);
                w wVar = this.f1471a;
                View view4 = this.f1473c.F;
                wVar.m(false);
                int visibility = this.f1473c.F.getVisibility();
                this.f1473c.i().f1596l = this.f1473c.F.getAlpha();
                o oVar8 = this.f1473c;
                if (oVar8.E != null && visibility == 0) {
                    View findFocus = oVar8.F.findFocus();
                    if (findFocus != null) {
                        this.f1473c.i().f1597m = findFocus;
                        if (y.I(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1473c);
                        }
                    }
                    this.f1473c.F.setAlpha(0.0f);
                }
            }
            this.f1473c.f1562a = 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r3 != false) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.y.I(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "movefrom CREATED: "
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            androidx.fragment.app.o r1 = r7.f1473c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x001b:
            androidx.fragment.app.o r0 = r7.f1473c
            boolean r1 = r0.f1573m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002b
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x002b
            r0 = r3
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            r1 = 0
            if (r0 == 0) goto L_0x003d
            androidx.fragment.app.o r4 = r7.f1473c
            r4.getClass()
            androidx.fragment.app.g0 r4 = r7.f1472b
            androidx.fragment.app.o r5 = r7.f1473c
            java.lang.String r5 = r5.f1567f
            r4.k(r5, r1)
        L_0x003d:
            if (r0 != 0) goto L_0x005f
            androidx.fragment.app.g0 r4 = r7.f1472b
            java.lang.Object r4 = r4.f1485d
            androidx.fragment.app.b0 r4 = (androidx.fragment.app.b0) r4
            androidx.fragment.app.o r5 = r7.f1473c
            java.util.HashMap<java.lang.String, androidx.fragment.app.o> r6 = r4.f1436c
            java.lang.String r5 = r5.f1567f
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            boolean r5 = r4.f1439f
            if (r5 == 0) goto L_0x0059
            boolean r4 = r4.f1440g
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r4 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r4 = r2
            goto L_0x0060
        L_0x005f:
            r4 = r3
        L_0x0060:
            if (r4 == 0) goto L_0x0112
            androidx.fragment.app.o r4 = r7.f1473c
            androidx.fragment.app.u<?> r4 = r4.f1580t
            boolean r5 = r4 instanceof androidx.lifecycle.f0
            if (r5 == 0) goto L_0x0073
            androidx.fragment.app.g0 r3 = r7.f1472b
            java.lang.Object r3 = r3.f1485d
            androidx.fragment.app.b0 r3 = (androidx.fragment.app.b0) r3
            boolean r3 = r3.f1440g
            goto L_0x0080
        L_0x0073:
            android.content.Context r4 = r4.f1636c
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0080
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isChangingConfigurations()
            r3 = r3 ^ r4
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            androidx.fragment.app.o r0 = r7.f1473c
            r0.getClass()
            goto L_0x008a
        L_0x0088:
            if (r3 == 0) goto L_0x0095
        L_0x008a:
            androidx.fragment.app.g0 r0 = r7.f1472b
            java.lang.Object r0 = r0.f1485d
            androidx.fragment.app.b0 r0 = (androidx.fragment.app.b0) r0
            androidx.fragment.app.o r3 = r7.f1473c
            r0.b(r3)
        L_0x0095:
            androidx.fragment.app.o r0 = r7.f1473c
            androidx.fragment.app.z r3 = r0.u
            r3.l()
            androidx.lifecycle.m r3 = r0.N
            androidx.lifecycle.g$b r4 = androidx.lifecycle.g.b.ON_DESTROY
            r3.f(r4)
            r0.f1562a = r2
            r0.D = r2
            r0.K = r2
            r0.F()
            boolean r3 = r0.D
            if (r3 == 0) goto L_0x00f6
            androidx.fragment.app.w r0 = r7.f1471a
            r0.d(r2)
            androidx.fragment.app.g0 r0 = r7.f1472b
            java.util.ArrayList r0 = r0.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x00bf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e2
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.f0 r2 = (androidx.fragment.app.f0) r2
            if (r2 == 0) goto L_0x00bf
            androidx.fragment.app.o r2 = r2.f1473c
            androidx.fragment.app.o r3 = r7.f1473c
            java.lang.String r3 = r3.f1567f
            java.lang.String r4 = r2.f1570i
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bf
            androidx.fragment.app.o r3 = r7.f1473c
            r2.f1569h = r3
            r2.f1570i = r1
            goto L_0x00bf
        L_0x00e2:
            androidx.fragment.app.o r0 = r7.f1473c
            java.lang.String r1 = r0.f1570i
            if (r1 == 0) goto L_0x00f0
            androidx.fragment.app.g0 r2 = r7.f1472b
            androidx.fragment.app.o r1 = r2.d(r1)
            r0.f1569h = r1
        L_0x00f0:
            androidx.fragment.app.g0 r0 = r7.f1472b
            r0.j(r7)
            goto L_0x012c
        L_0x00f6:
            androidx.fragment.app.y0 r1 = new androidx.fragment.app.y0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " did not call through to super.onDestroy()"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0112:
            androidx.fragment.app.o r0 = r7.f1473c
            java.lang.String r0 = r0.f1570i
            if (r0 == 0) goto L_0x0128
            androidx.fragment.app.g0 r1 = r7.f1472b
            androidx.fragment.app.o r0 = r1.d(r0)
            if (r0 == 0) goto L_0x0128
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x0128
            androidx.fragment.app.o r1 = r7.f1473c
            r1.f1569h = r0
        L_0x0128:
            androidx.fragment.app.o r0 = r7.f1473c
            r0.f1562a = r2
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.g():void");
    }

    public final void h() {
        View view;
        if (y.I(3)) {
            StringBuilder g10 = f.g("movefrom CREATE_VIEW: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        ViewGroup viewGroup = oVar.E;
        if (!(viewGroup == null || (view = oVar.F) == null)) {
            viewGroup.removeView(view);
        }
        o oVar2 = this.f1473c;
        oVar2.u.u(1);
        if (oVar2.F != null) {
            p0 p0Var = oVar2.O;
            p0Var.d();
            if (p0Var.f1605b.f1744b.a(g.c.CREATED)) {
                oVar2.O.a(g.b.ON_DESTROY);
            }
        }
        oVar2.f1562a = 1;
        oVar2.D = false;
        oVar2.G();
        if (oVar2.D) {
            b.c cVar = z0.a.a(oVar2).f13125b;
            int g11 = cVar.f13135c.g();
            for (int i10 = 0; i10 < g11; i10++) {
                cVar.f13135c.h(i10).j();
            }
            oVar2.f1577q = false;
            this.f1471a.n(false);
            o oVar3 = this.f1473c;
            oVar3.E = null;
            oVar3.F = null;
            oVar3.O = null;
            oVar3.P.i(null);
            this.f1473c.f1575o = false;
            return;
        }
        throw new y0("Fragment " + oVar2 + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        if (y.I(3)) {
            StringBuilder g10 = f.g("movefrom ATTACHED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        oVar.f1562a = -1;
        boolean z9 = false;
        oVar.D = false;
        oVar.H();
        if (oVar.D) {
            z zVar = oVar.u;
            if (!zVar.B) {
                zVar.l();
                oVar.u = new z();
            }
            this.f1471a.e(false);
            o oVar2 = this.f1473c;
            oVar2.f1562a = -1;
            oVar2.f1580t = null;
            oVar2.f1581v = null;
            oVar2.f1579s = null;
            boolean z10 = true;
            if (oVar2.f1573m && !oVar2.y()) {
                z9 = true;
            }
            if (!z9) {
                b0 b0Var = (b0) this.f1472b.f1485d;
                if (b0Var.f1436c.containsKey(this.f1473c.f1567f) && b0Var.f1439f) {
                    z10 = b0Var.f1440g;
                }
                if (!z10) {
                    return;
                }
            }
            if (y.I(3)) {
                StringBuilder g11 = f.g("initState called for fragment: ");
                g11.append(this.f1473c);
                Log.d("FragmentManager", g11.toString());
            }
            this.f1473c.u();
            return;
        }
        throw new y0("Fragment " + oVar + " did not call through to super.onDetach()");
    }

    public final void j() {
        o oVar = this.f1473c;
        if (oVar.f1574n && oVar.f1575o && !oVar.f1577q) {
            if (y.I(3)) {
                StringBuilder g10 = f.g("moveto CREATE_VIEW: ");
                g10.append(this.f1473c);
                Log.d("FragmentManager", g10.toString());
            }
            o oVar2 = this.f1473c;
            oVar2.O(oVar2.I(oVar2.f1563b), (ViewGroup) null, this.f1473c.f1563b);
            View view = this.f1473c.F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                o oVar3 = this.f1473c;
                oVar3.F.setTag(R.id.fragment_container_view_tag, oVar3);
                o oVar4 = this.f1473c;
                if (oVar4.f1584z) {
                    oVar4.F.setVisibility(8);
                }
                this.f1473c.u.u(2);
                w wVar = this.f1471a;
                View view2 = this.f1473c.F;
                wVar.m(false);
                this.f1473c.f1562a = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f1474d) {
            try {
                this.f1474d = true;
                boolean z9 = false;
                while (true) {
                    int d10 = d();
                    o oVar = this.f1473c;
                    int i10 = oVar.f1562a;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f1473c.f1562a = 1;
                                    break;
                                case 2:
                                    oVar.f1575o = false;
                                    oVar.f1562a = 2;
                                    break;
                                case 3:
                                    if (y.I(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1473c);
                                    }
                                    this.f1473c.getClass();
                                    o oVar2 = this.f1473c;
                                    if (oVar2.F != null && oVar2.f1564c == null) {
                                        p();
                                    }
                                    o oVar3 = this.f1473c;
                                    if (!(oVar3.F == null || (viewGroup2 = oVar3.E) == null)) {
                                        t0 f10 = t0.f(viewGroup2, oVar3.o().G());
                                        f10.getClass();
                                        if (y.I(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1473c);
                                        }
                                        f10.a(1, 3, this);
                                    }
                                    this.f1473c.f1562a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    oVar.f1562a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(oVar.F == null || (viewGroup3 = oVar.E) == null)) {
                                        t0 f11 = t0.f(viewGroup3, oVar.o().G());
                                        int b10 = w0.b(this.f1473c.F.getVisibility());
                                        f11.getClass();
                                        if (y.I(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1473c);
                                        }
                                        f11.a(b10, 2, this);
                                    }
                                    this.f1473c.f1562a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    oVar.f1562a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z9 = true;
                    } else {
                        if (!z9 && i10 == -1 && oVar.f1573m && !oVar.y()) {
                            this.f1473c.getClass();
                            if (y.I(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1473c);
                            }
                            ((b0) this.f1472b.f1485d).b(this.f1473c);
                            this.f1472b.j(this);
                            if (y.I(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f1473c);
                            }
                            this.f1473c.u();
                        }
                        o oVar4 = this.f1473c;
                        if (oVar4.J) {
                            if (!(oVar4.F == null || (viewGroup = oVar4.E) == null)) {
                                t0 f12 = t0.f(viewGroup, oVar4.o().G());
                                if (this.f1473c.f1584z) {
                                    f12.getClass();
                                    if (y.I(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1473c);
                                    }
                                    f12.a(3, 1, this);
                                } else {
                                    f12.getClass();
                                    if (y.I(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1473c);
                                    }
                                    f12.a(2, 1, this);
                                }
                            }
                            o oVar5 = this.f1473c;
                            y yVar = oVar5.f1579s;
                            if (yVar != null && oVar5.f1572l && y.J(oVar5)) {
                                yVar.f1668y = true;
                            }
                            o oVar6 = this.f1473c;
                            oVar6.J = false;
                            oVar6.u.o();
                        }
                        this.f1474d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f1474d = false;
                throw th;
            }
        } else if (y.I(2)) {
            StringBuilder g10 = f.g("Ignoring re-entrant call to moveToExpectedState() for ");
            g10.append(this.f1473c);
            Log.v("FragmentManager", g10.toString());
        }
    }

    public final void l() {
        if (y.I(3)) {
            StringBuilder g10 = f.g("movefrom RESUMED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        oVar.u.u(5);
        if (oVar.F != null) {
            oVar.O.a(g.b.ON_PAUSE);
        }
        oVar.N.f(g.b.ON_PAUSE);
        oVar.f1562a = 6;
        oVar.D = true;
        this.f1471a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        Bundle bundle = this.f1473c.f1563b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            o oVar = this.f1473c;
            oVar.f1564c = oVar.f1563b.getSparseParcelableArray("android:view_state");
            o oVar2 = this.f1473c;
            oVar2.f1565d = oVar2.f1563b.getBundle("android:view_registry_state");
            o oVar3 = this.f1473c;
            oVar3.f1570i = oVar3.f1563b.getString("android:target_state");
            o oVar4 = this.f1473c;
            if (oVar4.f1570i != null) {
                oVar4.f1571j = oVar4.f1563b.getInt("android:target_req_state", 0);
            }
            o oVar5 = this.f1473c;
            Boolean bool = oVar5.f1566e;
            if (bool != null) {
                oVar5.H = bool.booleanValue();
                this.f1473c.f1566e = null;
            } else {
                oVar5.H = oVar5.f1563b.getBoolean("android:user_visible_hint", true);
            }
            o oVar6 = this.f1473c;
            if (!oVar6.H) {
                oVar6.G = true;
            }
        }
    }

    public final void n() {
        View view;
        boolean z9;
        String str;
        if (y.I(3)) {
            StringBuilder g10 = f.g("moveto RESUMED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        o.b bVar = oVar.I;
        if (bVar == null) {
            view = null;
        } else {
            view = bVar.f1597m;
        }
        if (view != null) {
            if (view != oVar.F) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z9 = false;
                        break;
                    } else if (parent == this.f1473c.F) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z9 = true;
            if (z9) {
                boolean requestFocus = view.requestFocus();
                if (y.I(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (requestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(this.f1473c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f1473c.F.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.f1473c.i().f1597m = null;
        o oVar2 = this.f1473c;
        oVar2.u.N();
        oVar2.u.y(true);
        oVar2.f1562a = 7;
        oVar2.D = false;
        oVar2.J();
        if (oVar2.D) {
            m mVar = oVar2.N;
            g.b bVar2 = g.b.ON_RESUME;
            mVar.f(bVar2);
            if (oVar2.F != null) {
                oVar2.O.a(bVar2);
            }
            z zVar = oVar2.u;
            zVar.f1669z = false;
            zVar.A = false;
            zVar.G.f1441h = false;
            zVar.u(7);
            this.f1471a.i(false);
            o oVar3 = this.f1473c;
            oVar3.f1563b = null;
            oVar3.f1564c = null;
            oVar3.f1565d = null;
            return;
        }
        throw new y0("Fragment " + oVar2 + " did not call through to super.onResume()");
    }

    public final void o() {
        e0 e0Var = new e0(this.f1473c);
        o oVar = this.f1473c;
        if (oVar.f1562a <= -1 || e0Var.f1468m != null) {
            e0Var.f1468m = oVar.f1563b;
        } else {
            Bundle bundle = new Bundle();
            o oVar2 = this.f1473c;
            oVar2.K(bundle);
            oVar2.Q.c(bundle);
            a0 T = oVar2.u.T();
            if (T != null) {
                bundle.putParcelable("android:support:fragments", T);
            }
            this.f1471a.j(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f1473c.F != null) {
                p();
            }
            if (this.f1473c.f1564c != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f1473c.f1564c);
            }
            if (this.f1473c.f1565d != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f1473c.f1565d);
            }
            if (!this.f1473c.H) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f1473c.H);
            }
            e0Var.f1468m = bundle;
            if (this.f1473c.f1570i != null) {
                if (bundle == null) {
                    e0Var.f1468m = new Bundle();
                }
                e0Var.f1468m.putString("android:target_state", this.f1473c.f1570i);
                int i10 = this.f1473c.f1571j;
                if (i10 != 0) {
                    e0Var.f1468m.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f1472b.k(this.f1473c.f1567f, e0Var);
    }

    public final void p() {
        if (this.f1473c.F != null) {
            if (y.I(2)) {
                StringBuilder g10 = f.g("Saving view state for fragment ");
                g10.append(this.f1473c);
                g10.append(" with view ");
                g10.append(this.f1473c.F);
                Log.v("FragmentManager", g10.toString());
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1473c.F.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1473c.f1564c = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1473c.O.f1606c.c(bundle);
            if (!bundle.isEmpty()) {
                this.f1473c.f1565d = bundle;
            }
        }
    }

    public final void q() {
        if (y.I(3)) {
            StringBuilder g10 = f.g("moveto STARTED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        oVar.u.N();
        oVar.u.y(true);
        oVar.f1562a = 5;
        oVar.D = false;
        oVar.L();
        if (oVar.D) {
            m mVar = oVar.N;
            g.b bVar = g.b.ON_START;
            mVar.f(bVar);
            if (oVar.F != null) {
                oVar.O.a(bVar);
            }
            z zVar = oVar.u;
            zVar.f1669z = false;
            zVar.A = false;
            zVar.G.f1441h = false;
            zVar.u(5);
            this.f1471a.k(false);
            return;
        }
        throw new y0("Fragment " + oVar + " did not call through to super.onStart()");
    }

    public final void r() {
        if (y.I(3)) {
            StringBuilder g10 = f.g("movefrom STARTED: ");
            g10.append(this.f1473c);
            Log.d("FragmentManager", g10.toString());
        }
        o oVar = this.f1473c;
        z zVar = oVar.u;
        zVar.A = true;
        zVar.G.f1441h = true;
        zVar.u(4);
        if (oVar.F != null) {
            oVar.O.a(g.b.ON_STOP);
        }
        oVar.N.f(g.b.ON_STOP);
        oVar.f1562a = 4;
        oVar.D = false;
        oVar.M();
        if (oVar.D) {
            this.f1471a.l(false);
            return;
        }
        throw new y0("Fragment " + oVar + " did not call through to super.onStop()");
    }
}
