package q1;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o1.a;
import o1.f;
import o1.l;
import q1.h;
import q1.m;
import u1.n;

public final class x implements h, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final h.a f11148a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f11149b;

    /* renamed from: c  reason: collision with root package name */
    public int f11150c;

    /* renamed from: d  reason: collision with root package name */
    public int f11151d = -1;

    /* renamed from: e  reason: collision with root package name */
    public f f11152e;

    /* renamed from: f  reason: collision with root package name */
    public List<n<File, ?>> f11153f;

    /* renamed from: g  reason: collision with root package name */
    public int f11154g;

    /* renamed from: h  reason: collision with root package name */
    public volatile n.a<?> f11155h;

    /* renamed from: i  reason: collision with root package name */
    public File f11156i;

    /* renamed from: j  reason: collision with root package name */
    public y f11157j;

    public x(i<?> iVar, h.a aVar) {
        this.f11149b = iVar;
        this.f11148a = aVar;
    }

    public final void c(Exception exc) {
        this.f11148a.c(this.f11157j, exc, this.f11155h.f12137c, a.RESOURCE_DISK_CACHE);
    }

    public final void cancel() {
        n.a<?> aVar = this.f11155h;
        if (aVar != null) {
            aVar.f12137c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f11148a.a(this.f11152e, obj, this.f11155h.f12137c, a.RESOURCE_DISK_CACHE, this.f11157j);
    }

    public final boolean e() {
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList a10 = this.f11149b.a();
        if (a10.isEmpty()) {
            return false;
        }
        List<Class<?>> d10 = this.f11149b.d();
        if (!d10.isEmpty()) {
            while (true) {
                List<n<File, ?>> list = this.f11153f;
                if (list != null) {
                    if (this.f11154g < list.size()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        this.f11155h = null;
                        boolean z12 = false;
                        while (!z12) {
                            if (this.f11154g < this.f11153f.size()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                break;
                            }
                            List<n<File, ?>> list2 = this.f11153f;
                            int i10 = this.f11154g;
                            this.f11154g = i10 + 1;
                            File file = this.f11156i;
                            i<?> iVar = this.f11149b;
                            this.f11155h = list2.get(i10).a(file, iVar.f11007e, iVar.f11008f, iVar.f11011i);
                            if (this.f11155h != null) {
                                if (this.f11149b.c(this.f11155h.f12137c.a()) != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    this.f11155h.f12137c.f(this.f11149b.f11016o, this);
                                    z12 = true;
                                }
                            }
                        }
                        return z12;
                    }
                }
                int i11 = this.f11151d + 1;
                this.f11151d = i11;
                if (i11 >= d10.size()) {
                    int i12 = this.f11150c + 1;
                    this.f11150c = i12;
                    if (i12 >= a10.size()) {
                        return false;
                    }
                    this.f11151d = 0;
                }
                f fVar = (f) a10.get(this.f11150c);
                Class cls = d10.get(this.f11151d);
                l<Z> f10 = this.f11149b.f(cls);
                i<?> iVar2 = this.f11149b;
                this.f11157j = new y(iVar2.f11005c.f2553a, fVar, iVar2.f11015n, iVar2.f11007e, iVar2.f11008f, f10, cls, iVar2.f11011i);
                File a11 = ((m.c) iVar2.f11010h).a().a(this.f11157j);
                this.f11156i = a11;
                if (a11 != null) {
                    this.f11152e = fVar;
                    this.f11153f = this.f11149b.f11005c.a().e(a11);
                    this.f11154g = 0;
                }
            }
        } else if (File.class.equals(this.f11149b.k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f11149b.f11006d.getClass() + " to " + this.f11149b.k);
        }
    }
}
