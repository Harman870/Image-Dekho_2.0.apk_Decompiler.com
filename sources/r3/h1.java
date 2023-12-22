package r3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import e4.a;

public final class h1 extends a implements i {
    public h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
    }

    public final Account zzb() {
        Parcel b10 = b(2, c());
        Account account = (Account) h4.a.a(b10, Account.CREATOR);
        b10.recycle();
        return account;
    }
}
