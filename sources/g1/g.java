package g1;

import android.view.View;
import java.util.ArrayList;

public final class g extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f6494a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6495b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6496c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6497d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f6498e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6499f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f6500g;

    public g(f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f6500g = fVar;
        this.f6494a = obj;
        this.f6495b = arrayList;
        this.f6498e = obj2;
        this.f6499f = arrayList2;
    }

    public final void b(k kVar) {
        kVar.z(this);
    }

    public final void e(k kVar) {
        Object obj = this.f6494a;
        if (obj != null) {
            this.f6500g.s(obj, this.f6495b, (ArrayList<View>) null);
        }
        Object obj2 = this.f6496c;
        if (obj2 != null) {
            this.f6500g.s(obj2, this.f6497d, (ArrayList<View>) null);
        }
        Object obj3 = this.f6498e;
        if (obj3 != null) {
            this.f6500g.s(obj3, this.f6499f, (ArrayList<View>) null);
        }
    }
}
