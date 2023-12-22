package m3;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import e4.c;
import p3.a;
import p3.h;
import q3.a0;

public final class i extends l {
    public i(a0 a0Var) {
        super(a0Var);
    }

    public final void a(a.e eVar) {
        g gVar = (g) eVar;
        r rVar = (r) gVar.v();
        h hVar = new h(this);
        GoogleSignInOptions googleSignInOptions = gVar.B;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(rVar.f6187c);
        int i10 = c.f6189a;
        obtain.writeStrongBinder(hVar);
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.f6186b.transact(102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }
}
