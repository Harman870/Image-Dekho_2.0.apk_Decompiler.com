package i6;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b;
import h6.b0;
import h6.o;
import h6.r;
import java.util.ArrayList;
import java.util.Iterator;
import y3.a;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7880a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final f f7881b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7882c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f7883d;

    /* renamed from: e  reason: collision with root package name */
    public final h0 f7884e;

    public d(ArrayList arrayList, f fVar, String str, b0 b0Var, h0 h0Var) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof r) {
                this.f7880a.add((r) oVar);
            }
        }
        r3.o.h(fVar);
        this.f7881b = fVar;
        r3.o.e(str);
        this.f7882c = str;
        this.f7883d = b0Var;
        this.f7884e = h0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.E(parcel, 1, this.f7880a);
        a.A(parcel, 2, this.f7881b, i10);
        a.B(parcel, 3, this.f7882c);
        a.A(parcel, 4, this.f7883d, i10);
        a.A(parcel, 5, this.f7884e, i10);
        a.S(G, parcel);
    }
}
