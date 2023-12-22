package b6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z5.h;

public class i extends Binder implements IInterface {
    public i() {
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        p pVar = (p) this;
        if (i10 == 2) {
            j.b(parcel);
            pVar.l((Bundle) j.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 == 3) {
            j.b(parcel);
            pVar.e((Bundle) j.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 == 4) {
            Bundle bundle = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            h hVar = (h) pVar;
            hVar.f13209b.f13216d.c(hVar.f13208a);
            return true;
        } else if (i10 != 5) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            h hVar2 = (h) pVar;
            hVar2.f13209b.f13216d.c(hVar2.f13208a);
            return true;
        }
    }
}
