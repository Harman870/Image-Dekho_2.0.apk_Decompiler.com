package q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.h;
import r.i;
import r.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f10874a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f10875b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10876c;

    /* renamed from: d  reason: collision with root package name */
    public final d f10877d;

    /* renamed from: e  reason: collision with root package name */
    public final a f10878e;

    /* renamed from: f  reason: collision with root package name */
    public c f10879f;

    /* renamed from: g  reason: collision with root package name */
    public int f10880g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f10881h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public h f10882i;

    public enum a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f10877d = dVar;
        this.f10878e = aVar;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z9) {
        if (cVar == null) {
            j();
            return true;
        } else if (!z9 && !i(cVar)) {
            return false;
        } else {
            this.f10879f = cVar;
            if (cVar.f10874a == null) {
                cVar.f10874a = new HashSet<>();
            }
            HashSet<c> hashSet = this.f10879f.f10874a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f10880g = i10;
            this.f10881h = i11;
            return true;
        }
    }

    public final void c(int i10, o oVar, ArrayList arrayList) {
        HashSet<c> hashSet = this.f10874a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f10877d, i10, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.f10876c) {
            return 0;
        }
        return this.f10875b;
    }

    public final int e() {
        c cVar;
        if (this.f10877d.f10911j0 == 8) {
            return 0;
        }
        int i10 = this.f10881h;
        if (i10 == Integer.MIN_VALUE || (cVar = this.f10879f) == null || cVar.f10877d.f10911j0 != 8) {
            return this.f10880g;
        }
        return i10;
    }

    public final c f() {
        switch (this.f10878e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f10877d.M;
            case 2:
                return this.f10877d.N;
            case 3:
                return this.f10877d.K;
            case 4:
                return this.f10877d.L;
            default:
                throw new AssertionError(this.f10878e.name());
        }
    }

    public final boolean g() {
        HashSet<c> hashSet = this.f10874a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f10879f != null;
    }

    public final boolean i(c cVar) {
        boolean z9;
        boolean z10;
        a aVar = a.CENTER_Y;
        a aVar2 = a.RIGHT;
        a aVar3 = a.CENTER_X;
        a aVar4 = a.LEFT;
        a aVar5 = a.BASELINE;
        boolean z11 = false;
        if (cVar == null) {
            return false;
        }
        a aVar6 = cVar.f10878e;
        a aVar7 = this.f10878e;
        if (aVar6 != aVar7) {
            switch (aVar7.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (aVar6 == aVar4 || aVar6 == aVar2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!(cVar.f10877d instanceof g)) {
                        return z9;
                    }
                    if (z9 || aVar6 == aVar3) {
                        z11 = true;
                    }
                    return z11;
                case 2:
                case 4:
                    if (aVar6 == a.TOP || aVar6 == a.BOTTOM) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!(cVar.f10877d instanceof g)) {
                        return z10;
                    }
                    if (z10 || aVar6 == aVar) {
                        z11 = true;
                    }
                    return z11;
                case 5:
                    if (aVar6 == aVar4 || aVar6 == aVar2) {
                        return false;
                    }
                    return true;
                case 6:
                    if (aVar6 == aVar5 || aVar6 == aVar3 || aVar6 == aVar) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.f10878e.name());
            }
        } else if (aVar7 != aVar5 || (cVar.f10877d.F && this.f10877d.F)) {
            return true;
        } else {
            return false;
        }
    }

    public final void j() {
        HashSet<c> hashSet;
        c cVar = this.f10879f;
        if (!(cVar == null || (hashSet = cVar.f10874a) == null)) {
            hashSet.remove(this);
            if (this.f10879f.f10874a.size() == 0) {
                this.f10879f.f10874a = null;
            }
        }
        this.f10874a = null;
        this.f10879f = null;
        this.f10880g = 0;
        this.f10881h = Integer.MIN_VALUE;
        this.f10876c = false;
        this.f10875b = 0;
    }

    public final void k() {
        h hVar = this.f10882i;
        if (hVar == null) {
            this.f10882i = new h(1);
        } else {
            hVar.c();
        }
    }

    public final void l(int i10) {
        this.f10875b = i10;
        this.f10876c = true;
    }

    public final String toString() {
        return this.f10877d.f10912k0 + ":" + this.f10878e.toString();
    }
}
