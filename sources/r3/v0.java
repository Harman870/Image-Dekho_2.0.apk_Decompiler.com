package r3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import o3.b;
import r3.b;

public final class v0 extends i0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f11642g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f11643h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v0(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f11643h = bVar;
        this.f11642g = iBinder;
    }

    public final void c(b bVar) {
        b.C0136b bVar2 = this.f11643h.f11514p;
        if (bVar2 != null) {
            bVar2.b(bVar);
        }
        this.f11643h.getClass();
        System.currentTimeMillis();
    }

    public final boolean d() {
        String str;
        try {
            IBinder iBinder = this.f11642g;
            o.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f11643h.w().equals(interfaceDescriptor)) {
                str = "service descriptor mismatch: " + this.f11643h.w() + " vs. " + interfaceDescriptor;
                Log.w("GmsClient", str);
                return false;
            }
            IInterface o10 = this.f11643h.o(this.f11642g);
            if (o10 == null) {
                return false;
            }
            if (!b.A(this.f11643h, 2, 4, o10) && !b.A(this.f11643h, 3, 4, o10)) {
                return false;
            }
            b bVar = this.f11643h;
            bVar.f11518t = null;
            b.a aVar = bVar.f11513o;
            if (aVar != null) {
                aVar.d();
            }
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
