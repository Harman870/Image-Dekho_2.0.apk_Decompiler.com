package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.v0;
import androidx.appcompat.widget.w0;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class b extends h.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b  reason: collision with root package name */
    public final Context f392b;

    /* renamed from: c  reason: collision with root package name */
    public final int f393c;

    /* renamed from: d  reason: collision with root package name */
    public final int f394d;

    /* renamed from: e  reason: collision with root package name */
    public final int f395e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f396f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f397g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f398h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f399i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final a f400j = new a();
    public final C0004b k = new C0004b();

    /* renamed from: l  reason: collision with root package name */
    public final c f401l = new c();

    /* renamed from: m  reason: collision with root package name */
    public int f402m;

    /* renamed from: n  reason: collision with root package name */
    public int f403n;

    /* renamed from: o  reason: collision with root package name */
    public View f404o;

    /* renamed from: p  reason: collision with root package name */
    public View f405p;

    /* renamed from: q  reason: collision with root package name */
    public int f406q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f407r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f408s;

    /* renamed from: t  reason: collision with root package name */
    public int f409t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f410v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public j.a f411x;

    /* renamed from: y  reason: collision with root package name */
    public ViewTreeObserver f412y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow.OnDismissListener f413z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (b.this.b() && b.this.f399i.size() > 0 && !((d) b.this.f399i.get(0)).f417a.f979y) {
                View view = b.this.f405p;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                Iterator it = b.this.f399i.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f417a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0004b implements View.OnAttachStateChangeListener {
        public C0004b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f412y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f412y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f412y.removeGlobalOnLayoutListener(bVar.f400j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements v0 {
        public c() {
        }

        public final void a(f fVar, MenuItem menuItem) {
            b.this.f397g.removeCallbacksAndMessages(fVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(androidx.appcompat.view.menu.f r6, androidx.appcompat.view.menu.h r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r0 = r0.f397g
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r0 = r0.f399i
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r4 = r4.f399i
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
                androidx.appcompat.view.menu.f r4 = r4.f418b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r0 = r0.f399i
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.ArrayList r0 = r0.f399i
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            L_0x0041:
                androidx.appcompat.view.menu.c r0 = new androidx.appcompat.view.menu.c
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.b.this
                android.os.Handler r7 = r7.f397g
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.d(androidx.appcompat.view.menu.f, androidx.appcompat.view.menu.h):void");
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final w0 f417a;

        /* renamed from: b  reason: collision with root package name */
        public final f f418b;

        /* renamed from: c  reason: collision with root package name */
        public final int f419c;

        public d(w0 w0Var, f fVar, int i10) {
            this.f417a = w0Var;
            this.f418b = fVar;
            this.f419c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z9) {
        int i12 = 0;
        this.f402m = 0;
        this.f403n = 0;
        this.f392b = context;
        this.f404o = view;
        this.f394d = i10;
        this.f395e = i11;
        this.f396f = z9;
        this.f410v = false;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        this.f406q = y.e.d(view) != 1 ? 1 : i12;
        Resources resources = context.getResources();
        this.f393c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f397g = new Handler();
    }

    public final void a(f fVar, boolean z9) {
        int i10;
        int size = this.f399i.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (fVar == ((d) this.f399i.get(i11)).f418b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int i12 = i11 + 1;
            if (i12 < this.f399i.size()) {
                ((d) this.f399i.get(i12)).f418b.c(false);
            }
            d dVar = (d) this.f399i.remove(i11);
            dVar.f418b.r(this);
            if (this.A) {
                w0.a.b(dVar.f417a.f980z, (Transition) null);
                dVar.f417a.f980z.setAnimationStyle(0);
            }
            dVar.f417a.dismiss();
            int size2 = this.f399i.size();
            if (size2 > 0) {
                i10 = ((d) this.f399i.get(size2 - 1)).f419c;
            } else {
                View view = this.f404o;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (y.e.d(view) == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            }
            this.f406q = i10;
            if (size2 == 0) {
                dismiss();
                j.a aVar = this.f411x;
                if (aVar != null) {
                    aVar.a(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f412y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f412y.removeGlobalOnLayoutListener(this.f400j);
                    }
                    this.f412y = null;
                }
                this.f405p.removeOnAttachStateChangeListener(this.k);
                this.f413z.onDismiss();
            } else if (z9) {
                ((d) this.f399i.get(0)).f418b.c(false);
            }
        }
    }

    public final boolean b() {
        return this.f399i.size() > 0 && ((d) this.f399i.get(0)).f417a.b();
    }

    public final void dismiss() {
        int size = this.f399i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f399i.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f417a.b()) {
                        dVar.f417a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void e(Parcelable parcelable) {
    }

    public final void f() {
        Iterator it = this.f399i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f417a.f960c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    public final p0 g() {
        if (this.f399i.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f399i;
        return ((d) arrayList.get(arrayList.size() - 1)).f417a.f960c;
    }

    public final boolean h(m mVar) {
        Iterator it = this.f399i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f418b) {
                dVar.f417a.f960c.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m(mVar);
        j.a aVar = this.f411x;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final Parcelable j() {
        return null;
    }

    public final void k(j.a aVar) {
        this.f411x = aVar;
    }

    public final void m(f fVar) {
        fVar.b(this, this.f392b);
        if (b()) {
            w(fVar);
        } else {
            this.f398h.add(fVar);
        }
    }

    public final void o(View view) {
        if (this.f404o != view) {
            this.f404o = view;
            int i10 = this.f402m;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            this.f403n = Gravity.getAbsoluteGravity(i10, y.e.d(view));
        }
    }

    public final void onDismiss() {
        d dVar;
        int size = this.f399i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f399i.get(i10);
            if (!dVar.f417a.b()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f418b.c(false);
        }
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(boolean z9) {
        this.f410v = z9;
    }

    public final void q(int i10) {
        if (this.f402m != i10) {
            this.f402m = i10;
            View view = this.f404o;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            this.f403n = Gravity.getAbsoluteGravity(i10, y.e.d(view));
        }
    }

    public final void r(int i10) {
        this.f407r = true;
        this.f409t = i10;
    }

    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f413z = onDismissListener;
    }

    public final void show() {
        if (!b()) {
            Iterator it = this.f398h.iterator();
            while (it.hasNext()) {
                w((f) it.next());
            }
            this.f398h.clear();
            View view = this.f404o;
            this.f405p = view;
            if (view != null) {
                boolean z9 = this.f412y == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f412y = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f400j);
                }
                this.f405p.addOnAttachStateChangeListener(this.k);
            }
        }
    }

    public final void t(boolean z9) {
        this.w = z9;
    }

    public final void u(int i10) {
        this.f408s = true;
        this.u = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0144, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014a, code lost:
        if ((r11[0] - r4) < 0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014e, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(androidx.appcompat.view.menu.f r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f392b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.e r3 = new androidx.appcompat.view.menu.e
            boolean r4 = r0.f396f
            r5 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.b()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.f410v
            if (r4 == 0) goto L_0x0022
            r3.f434c = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.b()
            if (r4 == 0) goto L_0x002e
            boolean r4 = h.d.v(r17)
            r3.f434c = r4
        L_0x002e:
            android.content.Context r4 = r0.f392b
            int r6 = r0.f393c
            int r4 = h.d.n(r3, r4, r6)
            androidx.appcompat.widget.w0 r6 = new androidx.appcompat.widget.w0
            android.content.Context r7 = r0.f392b
            int r8 = r0.f394d
            int r9 = r0.f395e
            r6.<init>(r7, r8, r9)
            androidx.appcompat.view.menu.b$c r7 = r0.f401l
            r6.C = r7
            r6.f972p = r0
            androidx.appcompat.widget.r r7 = r6.f980z
            r7.setOnDismissListener(r0)
            android.view.View r7 = r0.f404o
            r6.f971o = r7
            int r7 = r0.f403n
            r6.f968l = r7
            r6.f979y = r5
            androidx.appcompat.widget.r r7 = r6.f980z
            r7.setFocusable(r5)
            androidx.appcompat.widget.r r7 = r6.f980z
            r8 = 2
            r7.setInputMethodMode(r8)
            r6.o(r3)
            r6.q(r4)
            int r3 = r0.f403n
            r6.f968l = r3
            java.util.ArrayList r3 = r0.f399i
            int r3 = r3.size()
            r7 = 0
            if (r3 <= 0) goto L_0x00e8
            java.util.ArrayList r3 = r0.f399i
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.b.d) r3
            androidx.appcompat.view.menu.f r10 = r3.f418b
            int r11 = r10.size()
            r12 = r7
        L_0x0088:
            if (r12 >= r11) goto L_0x009e
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x009b
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            int r12 = r12 + 1
            goto L_0x0088
        L_0x009e:
            r13 = 0
        L_0x009f:
            if (r13 != 0) goto L_0x00a2
            goto L_0x00e9
        L_0x00a2:
            androidx.appcompat.widget.w0 r10 = r3.f417a
            androidx.appcompat.widget.p0 r10 = r10.f960c
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00bb
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.e r11 = (androidx.appcompat.view.menu.e) r11
            goto L_0x00be
        L_0x00bb:
            androidx.appcompat.view.menu.e r11 = (androidx.appcompat.view.menu.e) r11
            r12 = r7
        L_0x00be:
            int r14 = r11.getCount()
            r15 = r7
        L_0x00c3:
            r8 = -1
            if (r15 >= r14) goto L_0x00d0
            androidx.appcompat.view.menu.h r9 = r11.getItem(r15)
            if (r13 != r9) goto L_0x00cd
            goto L_0x00d1
        L_0x00cd:
            int r15 = r15 + 1
            goto L_0x00c3
        L_0x00d0:
            r15 = r8
        L_0x00d1:
            if (r15 != r8) goto L_0x00d4
            goto L_0x00e9
        L_0x00d4:
            int r15 = r15 + r12
            int r8 = r10.getFirstVisiblePosition()
            int r15 = r15 - r8
            if (r15 < 0) goto L_0x00e9
            int r8 = r10.getChildCount()
            if (r15 < r8) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            android.view.View r8 = r10.getChildAt(r15)
            goto L_0x00ea
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            r8 = 0
        L_0x00ea:
            if (r8 == 0) goto L_0x01b4
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x010a
            java.lang.reflect.Method r9 = androidx.appcompat.widget.w0.D
            if (r9 == 0) goto L_0x010f
            androidx.appcompat.widget.r r10 = r6.f980z     // Catch:{ Exception -> 0x0102 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0102 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0102 }
            r11[r7] = r12     // Catch:{ Exception -> 0x0102 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0102 }
            goto L_0x010f
        L_0x0102:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x010f
        L_0x010a:
            androidx.appcompat.widget.r r9 = r6.f980z
            androidx.appcompat.widget.w0.b.a(r9, r7)
        L_0x010f:
            androidx.appcompat.widget.r r9 = r6.f980z
            r10 = 0
            androidx.appcompat.widget.w0.a.a(r9, r10)
            java.util.ArrayList r9 = r0.f399i
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.b.d) r9
            androidx.appcompat.widget.w0 r9 = r9.f417a
            androidx.appcompat.widget.p0 r9 = r9.f960c
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.f405p
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.f406q
            if (r12 != r5) goto L_0x0147
            r11 = r11[r7]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r10 = r10.right
            if (r9 <= r10) goto L_0x014c
            goto L_0x014e
        L_0x0147:
            r9 = r11[r7]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x014e
        L_0x014c:
            r9 = r5
            goto L_0x014f
        L_0x014e:
            r9 = r7
        L_0x014f:
            if (r9 != r5) goto L_0x0153
            r10 = r5
            goto L_0x0154
        L_0x0153:
            r10 = r7
        L_0x0154:
            r0.f406q = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0162
            r6.f971o = r8
            r9 = r7
            r13 = r9
            goto L_0x0193
        L_0x0162:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.f404o
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r8.getLocationOnScreen(r9)
            int r13 = r0.f403n
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0189
            r13 = r11[r7]
            android.view.View r14 = r0.f404o
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r7] = r14
            r13 = r9[r7]
            int r14 = r8.getWidth()
            int r14 = r14 + r13
            r9[r7] = r14
        L_0x0189:
            r13 = r9[r7]
            r14 = r11[r7]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x0193:
            int r11 = r0.f403n
            r11 = r11 & r12
            if (r11 != r12) goto L_0x01a1
            if (r10 == 0) goto L_0x019c
            int r13 = r13 + r4
            goto L_0x01aa
        L_0x019c:
            int r4 = r8.getWidth()
            goto L_0x01a9
        L_0x01a1:
            if (r10 == 0) goto L_0x01a9
            int r4 = r8.getWidth()
            int r13 = r13 + r4
            goto L_0x01aa
        L_0x01a9:
            int r13 = r13 - r4
        L_0x01aa:
            r6.f963f = r13
            r6.k = r5
            r6.f967j = r5
            r6.i(r9)
            goto L_0x01d2
        L_0x01b4:
            boolean r4 = r0.f407r
            if (r4 == 0) goto L_0x01bc
            int r4 = r0.f409t
            r6.f963f = r4
        L_0x01bc:
            boolean r4 = r0.f408s
            if (r4 == 0) goto L_0x01c5
            int r4 = r0.u
            r6.i(r4)
        L_0x01c5:
            android.graphics.Rect r4 = r0.f6673a
            if (r4 == 0) goto L_0x01cf
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x01d0
        L_0x01cf:
            r10 = 0
        L_0x01d0:
            r6.f978x = r10
        L_0x01d2:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f406q
            r4.<init>(r6, r1, r5)
            java.util.ArrayList r5 = r0.f399i
            r5.add(r4)
            r6.show()
            androidx.appcompat.widget.p0 r4 = r6.f960c
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0211
            boolean r3 = r0.w
            if (r3 == 0) goto L_0x0211
            java.lang.CharSequence r3 = r1.f450m
            if (r3 == 0) goto L_0x0211
            r3 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r2 = r2.inflate(r3, r4, r7)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r7)
            java.lang.CharSequence r1 = r1.f450m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r7)
            r6.show()
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.w(androidx.appcompat.view.menu.f):void");
    }
}
