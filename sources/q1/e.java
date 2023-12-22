package q1;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import o1.a;
import o1.f;
import q1.h;
import q1.m;
import u1.n;

public final class e implements h, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f10989a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f10990b;

    /* renamed from: c  reason: collision with root package name */
    public final h.a f10991c;

    /* renamed from: d  reason: collision with root package name */
    public int f10992d = -1;

    /* renamed from: e  reason: collision with root package name */
    public f f10993e;

    /* renamed from: f  reason: collision with root package name */
    public List<n<File, ?>> f10994f;

    /* renamed from: g  reason: collision with root package name */
    public int f10995g;

    /* renamed from: h  reason: collision with root package name */
    public volatile n.a<?> f10996h;

    /* renamed from: i  reason: collision with root package name */
    public File f10997i;

    public e(List<f> list, i<?> iVar, h.a aVar) {
        this.f10989a = list;
        this.f10990b = iVar;
        this.f10991c = aVar;
    }

    public final void c(Exception exc) {
        this.f10991c.c(this.f10993e, exc, this.f10996h.f12137c, a.DATA_DISK_CACHE);
    }

    public final void cancel() {
        n.a<?> aVar = this.f10996h;
        if (aVar != null) {
            aVar.f12137c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f10991c.a(this.f10993e, obj, this.f10996h.f12137c, a.DATA_DISK_CACHE, this.f10993e);
    }

    public final boolean e() {
        boolean z9;
        boolean z10;
        boolean z11;
        while (true) {
            List<n<File, ?>> list = this.f10994f;
            if (list != null) {
                if (this.f10995g < list.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    this.f10996h = null;
                    boolean z12 = false;
                    while (!z12) {
                        if (this.f10995g < this.f10994f.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f10994f;
                        int i10 = this.f10995g;
                        this.f10995g = i10 + 1;
                        File file = this.f10997i;
                        i<?> iVar = this.f10990b;
                        this.f10996h = list2.get(i10).a(file, iVar.f11007e, iVar.f11008f, iVar.f11011i);
                        if (this.f10996h != null) {
                            if (this.f10990b.c(this.f10996h.f12137c.a()) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f10996h.f12137c.f(this.f10990b.f11016o, this);
                                z12 = true;
                            }
                        }
                    }
                    return z12;
                }
            }
            int i11 = this.f10992d + 1;
            this.f10992d = i11;
            if (i11 >= this.f10989a.size()) {
                return false;
            }
            f fVar = this.f10989a.get(this.f10992d);
            i<?> iVar2 = this.f10990b;
            File a10 = ((m.c) iVar2.f11010h).a().a(new f(fVar, iVar2.f11015n));
            this.f10997i = a10;
            if (a10 != null) {
                this.f10993e = fVar;
                this.f10994f = this.f10990b.f11005c.a().e(a10);
                this.f10995g = 0;
            }
        }
    }
}
