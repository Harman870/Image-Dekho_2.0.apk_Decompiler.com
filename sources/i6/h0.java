package i6;

import android.os.Parcel;
import android.os.Parcelable;
import c2.b;
import c6.f;
import h6.b0;
import h6.l;
import h6.r;
import h6.u;
import i4.wg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r3.o;
import y3.a;

public final class h0 extends l {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a  reason: collision with root package name */
    public wg f7896a;

    /* renamed from: b  reason: collision with root package name */
    public e0 f7897b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7898c;

    /* renamed from: d  reason: collision with root package name */
    public String f7899d;

    /* renamed from: e  reason: collision with root package name */
    public List f7900e;

    /* renamed from: f  reason: collision with root package name */
    public List f7901f;

    /* renamed from: g  reason: collision with root package name */
    public String f7902g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f7903h;

    /* renamed from: i  reason: collision with root package name */
    public j0 f7904i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7905j;
    public b0 k;

    /* renamed from: l  reason: collision with root package name */
    public n f7906l;

    public h0(f fVar, ArrayList arrayList) {
        o.h(fVar);
        fVar.a();
        this.f7898c = fVar.f2495b;
        this.f7899d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f7902g = "2";
        D(arrayList);
    }

    public h0(wg wgVar, e0 e0Var, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, j0 j0Var, boolean z9, b0 b0Var, n nVar) {
        this.f7896a = wgVar;
        this.f7897b = e0Var;
        this.f7898c = str;
        this.f7899d = str2;
        this.f7900e = arrayList;
        this.f7901f = arrayList2;
        this.f7902g = str3;
        this.f7903h = bool;
        this.f7904i = j0Var;
        this.f7905j = z9;
        this.k = b0Var;
        this.f7906l = nVar;
    }

    public final String A() {
        return this.f7897b.f7885a;
    }

    public final boolean B() {
        String str;
        Boolean bool = this.f7903h;
        if (bool == null || bool.booleanValue()) {
            wg wgVar = this.f7896a;
            if (wgVar != null) {
                Map map = (Map) ((Map) l.a(wgVar.f7777b).f11138a).get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z9 = false;
            if (this.f7900e.size() <= 1 && (str == null || !str.equals("custom"))) {
                z9 = true;
            }
            this.f7903h = Boolean.valueOf(z9);
        }
        return this.f7903h.booleanValue();
    }

    public final h0 C() {
        this.f7903h = Boolean.FALSE;
        return this;
    }

    public final synchronized h0 D(List list) {
        o.h(list);
        this.f7900e = new ArrayList(list.size());
        this.f7901f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            u uVar = (u) list.get(i10);
            if (uVar.q().equals("firebase")) {
                this.f7897b = (e0) uVar;
            } else {
                this.f7901f.add(uVar.q());
            }
            this.f7900e.add((e0) uVar);
        }
        if (this.f7897b == null) {
            this.f7897b = (e0) this.f7900e.get(0);
        }
        return this;
    }

    public final wg E() {
        return this.f7896a;
    }

    public final String F() {
        return this.f7896a.f7777b;
    }

    public final String G() {
        return this.f7896a.y();
    }

    public final List H() {
        return this.f7901f;
    }

    public final void I(wg wgVar) {
        o.h(wgVar);
        this.f7896a = wgVar;
    }

    public final void J(ArrayList arrayList) {
        n nVar;
        if (arrayList.isEmpty()) {
            nVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h6.o oVar = (h6.o) it.next();
                if (oVar instanceof r) {
                    arrayList2.add((r) oVar);
                }
            }
            nVar = new n(arrayList2);
        }
        this.f7906l = nVar;
    }

    public final String q() {
        return this.f7897b.f7886b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.A(parcel, 1, this.f7896a, i10);
        a.A(parcel, 2, this.f7897b, i10);
        a.B(parcel, 3, this.f7898c);
        a.B(parcel, 4, this.f7899d);
        a.E(parcel, 5, this.f7900e);
        a.C(parcel, 6, this.f7901f);
        a.B(parcel, 7, this.f7902g);
        Boolean valueOf = Boolean.valueOf(B());
        if (valueOf != null) {
            parcel.writeInt(262152);
            parcel.writeInt(valueOf.booleanValue() ? 1 : 0);
        }
        a.A(parcel, 9, this.f7904i, i10);
        a.u(parcel, 10, this.f7905j);
        a.A(parcel, 11, this.k, i10);
        a.A(parcel, 12, this.f7906l, i10);
        a.S(G, parcel);
    }

    public final /* synthetic */ b x() {
        return new b(this);
    }

    public final List<? extends u> y() {
        return this.f7900e;
    }

    public final String z() {
        String str;
        Map map;
        wg wgVar = this.f7896a;
        if (wgVar == null || (str = wgVar.f7777b) == null || (map = (Map) ((Map) l.a(str).f11138a).get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }
}
