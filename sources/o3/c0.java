package o3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import javax.annotation.Nullable;
import r3.i1;
import r3.j0;
import r3.j1;
import s3.a;
import z3.b;

public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: a  reason: collision with root package name */
    public final String f10545a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final t f10546b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10547c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10548d;

    public c0(String str, @Nullable IBinder iBinder, boolean z9, boolean z10) {
        this.f10545a = str;
        u uVar = null;
        if (iBinder != null) {
            try {
                int i10 = j1.f11600b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                z3.a a10 = (queryLocalInterface instanceof j0 ? (j0) queryLocalInterface : new i1(iBinder)).a();
                byte[] bArr = a10 == null ? null : (byte[]) b.F(a10);
                if (bArr != null) {
                    uVar = new u(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f10546b = uVar;
        this.f10547c = z9;
        this.f10548d = z10;
    }

    public c0(String str, @Nullable t tVar, boolean z9, boolean z10) {
        this.f10545a = str;
        this.f10546b = tVar;
        this.f10547c = z9;
        this.f10548d = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f10545a);
        t tVar = this.f10546b;
        if (tVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            tVar = null;
        }
        y3.a.w(parcel, 2, tVar);
        y3.a.u(parcel, 3, this.f10547c);
        y3.a.u(parcel, 4, this.f10548d);
        y3.a.S(G, parcel);
    }
}
