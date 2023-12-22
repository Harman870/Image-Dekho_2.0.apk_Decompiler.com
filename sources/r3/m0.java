package r3;

import android.os.IBinder;
import android.os.Parcel;
import e4.a;
import o3.a0;
import o3.c0;
import o3.y;
import z3.b;

public final class m0 extends a implements o0 {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
    }

    public final a0 h(y yVar) {
        Parcel c10 = c();
        int i10 = h4.a.f6879a;
        c10.writeInt(1);
        yVar.writeToParcel(c10, 0);
        Parcel b10 = b(6, c10);
        a0 a0Var = (a0) h4.a.a(b10, a0.CREATOR);
        b10.recycle();
        return a0Var;
    }

    public final boolean m(c0 c0Var, b bVar) {
        Parcel c10 = c();
        int i10 = h4.a.f6879a;
        boolean z9 = true;
        c10.writeInt(1);
        c0Var.writeToParcel(c10, 0);
        h4.a.c(c10, bVar);
        Parcel b10 = b(5, c10);
        if (b10.readInt() == 0) {
            z9 = false;
        }
        b10.recycle();
        return z9;
    }

    public final boolean zzi() {
        boolean z9;
        Parcel b10 = b(7, c());
        int i10 = h4.a.f6879a;
        if (b10.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        b10.recycle();
        return z9;
    }
}
