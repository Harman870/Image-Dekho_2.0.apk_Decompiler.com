package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import h0.g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y.a;

public class f implements c0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f438y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f439a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f440b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f441c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f442d;

    /* renamed from: e  reason: collision with root package name */
    public a f443e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<h> f444f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<h> f445g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f446h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<h> f447i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<h> f448j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public int f449l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f450m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f451n;

    /* renamed from: o  reason: collision with root package name */
    public View f452o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f453p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f454q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f455r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f456s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<h> f457t = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<j>> u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public h f458v;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f459x;

    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z9;
        boolean z10 = false;
        this.f439a = context;
        Resources resources = context.getResources();
        this.f440b = resources;
        this.f444f = new ArrayList<>();
        this.f445g = new ArrayList<>();
        this.f446h = true;
        this.f447i = new ArrayList<>();
        this.f448j = new ArrayList<>();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = g0.f6700a;
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = g0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        this.f442d = z10;
    }

    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = (-65536 & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = f438y;
            if (i14 < 6) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                h hVar = new h(this, i10, i11, i12, i15, charSequence, this.f449l);
                ArrayList<h> arrayList = this.f444f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f466d <= i15) {
                            i13 = size + 1;
                            break;
                        }
                    } else {
                        i13 = 0;
                        break;
                    }
                }
                arrayList.add(i13, hVar);
                p(true);
                return hVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f440b.getString(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f440b.getString(i13));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f439a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            androidx.appcompat.view.menu.h r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f469g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f440b.getString(i10));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f440b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h a10 = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f439a, this, a10);
        a10.f476o = mVar;
        mVar.setHeaderTitle(a10.f467e);
        return mVar;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.u.add(new WeakReference(jVar));
        jVar.d(context, this);
        this.k = true;
    }

    public final void c(boolean z9) {
        if (!this.f456s) {
            this.f456s = true;
            Iterator<WeakReference<j>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.u.remove(next);
                } else {
                    jVar.a(this, z9);
                }
            }
            this.f456s = false;
        }
    }

    public final void clear() {
        h hVar = this.f458v;
        if (hVar != null) {
            d(hVar);
        }
        this.f444f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f451n = null;
        this.f450m = null;
        this.f452o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        boolean z9 = false;
        if (!this.u.isEmpty() && this.f458v == hVar) {
            w();
            Iterator<WeakReference<j>> it = this.u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.u.remove(next);
                } else {
                    z9 = jVar.c(hVar);
                    if (z9) {
                        break;
                    }
                }
            }
            v();
            if (z9) {
                this.f458v = null;
            }
        }
        return z9;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f443e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        boolean z9 = false;
        if (this.u.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                this.u.remove(next);
            } else {
                z9 = jVar.l(hVar);
                if (z9) {
                    break;
                }
            }
        }
        v();
        if (z9) {
            this.f458v = hVar;
        }
        return z9;
    }

    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f444f.get(i11);
            if (hVar.f463a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f476o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<h> arrayList = this.f457t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (n2) {
                c10 = hVar.f472j;
            } else {
                c10 = hVar.f470h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n2 && c10 == 8 && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i10) {
        return this.f444f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean z9;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f444f.size();
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = this.f444f.get(i12);
                if (hVar.hasSubMenu()) {
                    hVar.f476o.h(arrayList, i10, keyEvent);
                }
                if (n2) {
                    c10 = hVar.f472j;
                } else {
                    c10 = hVar.f470h;
                }
                if (n2) {
                    i11 = hVar.k;
                } else {
                    i11 = hVar.f471i;
                }
                if ((modifiers & 69647) == (i11 & 69647)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n2 && c10 == 8 && i10 == 67)) && hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f459x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f444f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z9;
        ArrayList<h> arrayList;
        ArrayList<h> l6 = l();
        if (this.k) {
            Iterator<WeakReference<j>> it = this.u.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.u.remove(next);
                } else {
                    z10 |= jVar.i();
                }
            }
            if (z10) {
                this.f447i.clear();
                this.f448j.clear();
                int size = l6.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = l6.get(i10);
                    if ((hVar.f483x & 32) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        arrayList = this.f447i;
                    } else {
                        arrayList = this.f448j;
                    }
                    arrayList.add(hVar);
                }
            } else {
                this.f447i.clear();
                this.f448j.clear();
                this.f448j.addAll(l());
            }
            this.k = false;
        }
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        if (!this.f446h) {
            return this.f445g;
        }
        this.f445g.clear();
        int size = this.f444f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f444f.get(i10);
            if (hVar.isVisible()) {
                this.f445g.add(hVar);
            }
        }
        this.f446h = false;
        this.k = true;
        return this.f445g;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.f441c;
    }

    public boolean o() {
        return this.f442d;
    }

    public void p(boolean z9) {
        if (!this.f453p) {
            if (z9) {
                this.f446h = true;
                this.k = true;
            }
            if (!this.u.isEmpty()) {
                w();
                Iterator<WeakReference<j>> it = this.u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        this.u.remove(next);
                    } else {
                        jVar.f();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f454q = true;
        if (z9) {
            this.f455r = true;
        }
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), (j) null, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z9;
        h g10 = g(i10, keyEvent);
        if (g10 != null) {
            z9 = q(g10, (j) null, i11);
        } else {
            z9 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r1 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if ((r9 & 1) == 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c6, code lost:
        if (r1 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L_0x00cc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00cc
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f477p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0040
        L_0x0019:
            androidx.appcompat.view.menu.f r1 = r7.f475n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            android.content.Intent r1 = r7.f469g
            if (r1 == 0) goto L_0x0036
            androidx.appcompat.view.menu.f r3 = r7.f475n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f439a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0040
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            h0.b r1 = r7.A
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0042
        L_0x0040:
            r1 = r2
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            h0.b r3 = r7.A
            if (r3 == 0) goto L_0x004f
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004f
            r4 = r2
            goto L_0x0050
        L_0x004f:
            r4 = r0
        L_0x0050:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x005f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00cb
            goto L_0x00c8
        L_0x005f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006d
            if (r4 == 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00cb
            goto L_0x00c8
        L_0x006d:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0074
            r6.c(r0)
        L_0x0074:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0088
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f439a
            r9.<init>(r5, r6, r7)
            r7.f476o = r9
            java.lang.CharSequence r5 = r7.f467e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0088:
            androidx.appcompat.view.menu.m r7 = r7.f476o
            if (r4 == 0) goto L_0x008f
            r3.f(r7)
        L_0x008f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0098
            goto L_0x00c5
        L_0x0098:
            if (r8 == 0) goto L_0x009e
            boolean r0 = r8.h(r7)
        L_0x009e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r8 = r6.u
            java.util.Iterator r8 = r8.iterator()
        L_0x00a4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.j r3 = (androidx.appcompat.view.menu.j) r3
            if (r3 != 0) goto L_0x00be
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r3 = r6.u
            r3.remove(r9)
            goto L_0x00a4
        L_0x00be:
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r3.h(r7)
            goto L_0x00a4
        L_0x00c5:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00cb
        L_0x00c8:
            r6.c(r2)
        L_0x00cb:
            return r1
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        Iterator<WeakReference<j>> it = this.u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.u.remove(next);
            }
        }
    }

    public final void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (this.f444f.get(i12).f464b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = this.f444f.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || this.f444f.get(i12).f464b != i10) {
                    p(true);
                } else {
                    if (i12 >= 0 && i12 < this.f444f.size()) {
                        this.f444f.remove(i12);
                    }
                    i11 = i13;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f444f.get(i11).f463a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0 && i11 < this.f444f.size()) {
            this.f444f.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).s(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i10, boolean z9, boolean z10) {
        int size = this.f444f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f444f.get(i11);
            if (hVar.f464b == i10) {
                hVar.f(z10);
                hVar.setCheckable(z9);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z9) {
        this.w = z9;
    }

    public final void setGroupEnabled(int i10, boolean z9) {
        int size = this.f444f.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f444f.get(i11);
            if (hVar.f464b == i10) {
                hVar.setEnabled(z9);
            }
        }
    }

    public final void setGroupVisible(int i10, boolean z9) {
        int i11;
        boolean z10;
        int size = this.f444f.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            h hVar = this.f444f.get(i12);
            if (hVar.f464b == i10) {
                int i13 = hVar.f483x;
                int i14 = i13 & -9;
                if (z9) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                hVar.f483x = i15;
                if (i13 != i15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z9) {
        this.f441c = z9;
        p(false);
    }

    public final int size() {
        return this.f444f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f440b;
        if (view != null) {
            this.f452o = view;
            this.f450m = null;
            this.f451n = null;
        } else {
            if (i10 > 0) {
                this.f450m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f450m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f439a;
                Object obj = y.a.f13006a;
                this.f451n = a.b.b(context, i11);
            } else if (drawable != null) {
                this.f451n = drawable;
            }
            this.f452o = null;
        }
        p(false);
    }

    public final void v() {
        this.f453p = false;
        if (this.f454q) {
            this.f454q = false;
            p(this.f455r);
        }
    }

    public final void w() {
        if (!this.f453p) {
            this.f453p = true;
            this.f454q = false;
            this.f455r = false;
        }
    }
}
