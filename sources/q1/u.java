package q1;

import androidx.activity.f;
import com.bumptech.glide.load.data.e;
import g0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.a;
import o1.h;
import q1.j;

public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final d<List<Throwable>> f11140a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f11141b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11142c;

    public u(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f11140a = cVar;
        if (!list.isEmpty()) {
            this.f11141b = list;
            StringBuilder g10 = f.g("Failed LoadPath{");
            g10.append(cls.getSimpleName());
            g10.append("->");
            g10.append(cls2.getSimpleName());
            g10.append("->");
            g10.append(cls3.getSimpleName());
            g10.append("}");
            this.f11142c = g10.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w a(int i10, int i11, h hVar, e eVar, j.b bVar) {
        w wVar;
        List<Throwable> b10 = this.f11140a.b();
        y3.a.h(b10);
        List list = b10;
        try {
            int size = this.f11141b.size();
            wVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                wVar = ((k) this.f11141b.get(i12)).a(i10, i11, hVar, eVar, bVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (r e10) {
            list.add(e10);
        } catch (Throwable th) {
            this.f11140a.a(list);
            throw th;
        }
        if (wVar != null) {
            this.f11140a.a(list);
            return wVar;
        }
        throw new r(this.f11142c, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder g10 = f.g("LoadPath{decodePaths=");
        g10.append(Arrays.toString(this.f11141b.toArray()));
        g10.append('}');
        return g10.toString();
    }
}
