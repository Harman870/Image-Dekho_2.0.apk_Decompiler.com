package androidx.fragment.app;

import android.util.Log;
import androidx.activity.f;
import androidx.fragment.app.h0;
import androidx.fragment.app.y;
import androidx.lifecycle.g;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import v0.c;

public final class a extends h0 implements y.k {

    /* renamed from: p  reason: collision with root package name */
    public final y f1409p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1410q;

    /* renamed from: r  reason: collision with root package name */
    public int f1411r;

    public a(y yVar) {
        yVar.F();
        u<?> uVar = yVar.f1660o;
        if (uVar != null) {
            uVar.f1636c.getClassLoader();
        }
        this.f1411r = -1;
        this.f1409p = yVar;
    }

    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (y.I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1496g) {
            return true;
        }
        y yVar = this.f1409p;
        if (yVar.f1650d == null) {
            yVar.f1650d = new ArrayList<>();
        }
        yVar.f1650d.add(this);
        return true;
    }

    public final void c(int i10, o oVar, String str, int i11) {
        String str2 = oVar.L;
        if (str2 != null) {
            c.d(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder g10 = f.g("Fragment ");
            g10.append(cls.getCanonicalName());
            g10.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(g10.toString());
        }
        if (str != null) {
            String str3 = oVar.f1583y;
            if (str3 == null || str.equals(str3)) {
                oVar.f1583y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + oVar + ": was " + oVar.f1583y + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = oVar.w;
                if (i12 == 0 || i12 == i10) {
                    oVar.w = i10;
                    oVar.f1582x = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + oVar + ": was " + oVar.w + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new h0.a(i11, oVar));
        oVar.f1579s = this.f1409p;
    }

    public final void e(int i10) {
        if (this.f1496g) {
            if (y.I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f1490a.size();
            for (int i11 = 0; i11 < size; i11++) {
                h0.a aVar = this.f1490a.get(i11);
                o oVar = aVar.f1505b;
                if (oVar != null) {
                    oVar.f1578r += i10;
                    if (y.I(2)) {
                        StringBuilder g10 = f.g("Bump nesting of ");
                        g10.append(aVar.f1505b);
                        g10.append(" to ");
                        g10.append(aVar.f1505b.f1578r);
                        Log.v("FragmentManager", g10.toString());
                    }
                }
            }
        }
    }

    public final int f() {
        return g(false);
    }

    public final int g(boolean z9) {
        int i10;
        if (!this.f1410q) {
            if (y.I(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new q0());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f1410q = true;
            if (this.f1496g) {
                i10 = this.f1409p.f1655i.getAndIncrement();
            } else {
                i10 = -1;
            }
            this.f1411r = i10;
            this.f1409p.w(this, z9);
            return this.f1411r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void h(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1497h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1411r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1410q);
            if (this.f1495f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1495f));
            }
            if (!(this.f1491b == 0 && this.f1492c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1491b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1492c));
            }
            if (!(this.f1493d == 0 && this.f1494e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1493d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1494e));
            }
            if (!(this.f1498i == 0 && this.f1499j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1498i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1499j);
            }
            if (!(this.k == 0 && this.f1500l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1500l);
            }
        }
        if (!this.f1490a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1490a.size();
            for (int i10 = 0; i10 < size; i10++) {
                h0.a aVar = this.f1490a.get(i10);
                switch (aVar.f1504a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder g10 = f.g("cmd=");
                        g10.append(aVar.f1504a);
                        str2 = g10.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1505b);
                if (z9) {
                    if (!(aVar.f1507d == 0 && aVar.f1508e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1507d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1508e));
                    }
                    if (aVar.f1509f != 0 || aVar.f1510g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1509f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1510g));
                    }
                }
            }
        }
    }

    public final a i(o oVar) {
        y yVar = oVar.f1579s;
        if (yVar == null || yVar == this.f1409p) {
            b(new h0.a(3, oVar));
            return this;
        }
        StringBuilder g10 = f.g("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        g10.append(oVar.toString());
        g10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(g10.toString());
    }

    public final a j(o oVar, g.c cVar) {
        if (oVar.f1579s != this.f1409p) {
            StringBuilder g10 = f.g("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            g10.append(this.f1409p);
            throw new IllegalArgumentException(g10.toString());
        } else if (cVar == g.c.INITIALIZED && oVar.f1562a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        } else if (cVar != g.c.DESTROYED) {
            b(new h0.a(oVar, cVar));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1411r >= 0) {
            sb.append(" #");
            sb.append(this.f1411r);
        }
        if (this.f1497h != null) {
            sb.append(" ");
            sb.append(this.f1497h);
        }
        sb.append("}");
        return sb.toString();
    }
}
