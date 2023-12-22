package a4;

import android.os.IBinder;
import android.os.Parcel;
import e4.a;
import z3.a;
import z3.b;

public final class e extends a {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
    }

    public final z3.a E(b bVar, String str, int i10, b bVar2) {
        Parcel c10 = c();
        h4.a.c(c10, bVar);
        c10.writeString(str);
        c10.writeInt(i10);
        h4.a.c(c10, bVar2);
        Parcel b10 = b(8, c10);
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }

    public final z3.a F(b bVar, String str, int i10) {
        Parcel c10 = c();
        h4.a.c(c10, bVar);
        c10.writeString(str);
        c10.writeInt(i10);
        Parcel b10 = b(4, c10);
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }

    public final z3.a G(b bVar, String str, boolean z9, long j10) {
        Parcel c10 = c();
        h4.a.c(c10, bVar);
        c10.writeString(str);
        c10.writeInt(z9 ? 1 : 0);
        c10.writeLong(j10);
        Parcel b10 = b(7, c10);
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }

    public final z3.a d(b bVar, String str, int i10) {
        Parcel c10 = c();
        h4.a.c(c10, bVar);
        c10.writeString(str);
        c10.writeInt(i10);
        Parcel b10 = b(2, c10);
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }
}
