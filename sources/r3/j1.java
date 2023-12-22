package r3;

import android.os.Parcel;
import c4.a;
import o3.t;

public abstract class j1 extends a implements j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11600b = 0;

    public j1() {
        super("com.google.android.gms.common.internal.ICertData", 2);
    }

    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            z3.a a10 = ((t) this).a();
            parcel2.writeNoException();
            h4.a.c(parcel2, a10);
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = ((t) this).f10577c;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        }
        return true;
    }
}
