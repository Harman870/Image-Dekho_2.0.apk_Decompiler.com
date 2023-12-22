package r3;

import android.content.Context;
import android.util.SparseIntArray;
import o3.e;
import o3.f;
import p3.a;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f11521a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public f f11522b;

    public b0() {
        e eVar = e.f10553d;
        this.f11522b = eVar;
    }

    public final int a(Context context, a.e eVar) {
        o.h(context);
        o.h(eVar);
        int i10 = 0;
        if (!eVar.f()) {
            return 0;
        }
        int g10 = eVar.g();
        int i11 = this.f11521a.get(g10, -1);
        if (i11 == -1) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.f11521a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f11521a.keyAt(i12);
                if (keyAt > g10 && this.f11521a.get(keyAt) == 0) {
                    break;
                }
                i12++;
            }
            if (i10 == -1) {
                i11 = this.f11522b.b(context, g10);
            } else {
                i11 = i10;
            }
            this.f11521a.put(g10, i11);
        }
        return i11;
    }
}
