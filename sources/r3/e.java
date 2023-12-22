package r3;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import o3.d;
import r3.i;
import s3.a;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new a1();

    /* renamed from: o  reason: collision with root package name */
    public static final Scope[] f11556o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    public static final d[] f11557p = new d[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f11558a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11559b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11560c;

    /* renamed from: d  reason: collision with root package name */
    public String f11561d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f11562e;

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f11563f;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f11564g;

    /* renamed from: h  reason: collision with root package name */
    public Account f11565h;

    /* renamed from: i  reason: collision with root package name */
    public d[] f11566i;

    /* renamed from: j  reason: collision with root package name */
    public d[] f11567j;
    public final boolean k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11568l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11569m;

    /* renamed from: n  reason: collision with root package name */
    public final String f11570n;

    public e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z9, int i13, boolean z10, String str2) {
        scopeArr = scopeArr == null ? f11556o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f11557p : dVarArr;
        dVarArr2 = dVarArr2 == null ? f11557p : dVarArr2;
        this.f11558a = i10;
        this.f11559b = i11;
        this.f11560c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f11561d = "com.google.android.gms";
        } else {
            this.f11561d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = i.a.f11596b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i h1Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new h1(iBinder);
                int i15 = a.f11497c;
                if (h1Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = h1Var.zzb();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f11565h = account2;
        } else {
            this.f11562e = iBinder;
            this.f11565h = account;
        }
        this.f11563f = scopeArr;
        this.f11564g = bundle;
        this.f11566i = dVarArr;
        this.f11567j = dVarArr2;
        this.k = z9;
        this.f11568l = i13;
        this.f11569m = z10;
        this.f11570n = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        a1.a(this, parcel, i10);
    }
}
