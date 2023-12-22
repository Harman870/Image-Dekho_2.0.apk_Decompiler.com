package i6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h6.b0;
import java.util.List;
import s3.c;
import y3.a;

public final class c0 implements c {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: a  reason: collision with root package name */
    public h0 f7877a;

    /* renamed from: b  reason: collision with root package name */
    public a0 f7878b;

    /* renamed from: c  reason: collision with root package name */
    public b0 f7879c;

    public c0(h0 h0Var) {
        this.f7877a = h0Var;
        List list = h0Var.f7900e;
        this.f7878b = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!TextUtils.isEmpty(((e0) list.get(i10)).f7892h)) {
                this.f7878b = new a0(((e0) list.get(i10)).f7886b, ((e0) list.get(i10)).f7892h, h0Var.f7905j);
            }
        }
        if (this.f7878b == null) {
            this.f7878b = new a0(h0Var.f7905j);
        }
        this.f7879c = h0Var.k;
    }

    public c0(h0 h0Var, a0 a0Var, b0 b0Var) {
        this.f7877a = h0Var;
        this.f7878b = a0Var;
        this.f7879c = b0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.A(parcel, 1, this.f7877a, i10);
        a.A(parcel, 2, this.f7878b, i10);
        a.A(parcel, 3, this.f7879c, i10);
        a.S(G, parcel);
    }
}
