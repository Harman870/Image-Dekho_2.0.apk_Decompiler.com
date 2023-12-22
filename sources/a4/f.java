package a4;

import android.os.IBinder;
import android.os.Parcel;
import e4.a;
import z3.a;
import z3.b;

public final class f extends a {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
    }

    public final z3.a E(b bVar, String str, int i10, b bVar2) {
        Parcel c10 = c();
        h4.a.c(c10, bVar);
        c10.writeString(str);
        c10.writeInt(i10);
        h4.a.c(c10, bVar2);
        Parcel b10 = b(3, c10);
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }

    public final z3.a d(b bVar, String str, int i10, b bVar2) {
        Parcel c10 = c();
        h4.a.c(c10, bVar);
        c10.writeString(str);
        c10.writeInt(i10);
        h4.a.c(c10, bVar2);
        Parcel b10 = b(2, c10);
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }
}
