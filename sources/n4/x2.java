package n4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import j4.h0;
import j4.j0;
import java.util.ArrayList;
import java.util.List;

public final class x2 extends h0 implements z2 {
    public x2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List A(String str, String str2, g8 g8Var) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        j0.c(b10, g8Var);
        Parcel c10 = c(16, b10);
        ArrayList<c> createTypedArrayList = c10.createTypedArrayList(c.CREATOR);
        c10.recycle();
        return createTypedArrayList;
    }

    public final void B(g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, g8Var);
        d(6, b10);
    }

    public final void D(z7 z7Var, g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, z7Var);
        j0.c(b10, g8Var);
        d(2, b10);
    }

    public final void f(long j10, String str, String str2, String str3) {
        Parcel b10 = b();
        b10.writeLong(j10);
        b10.writeString(str);
        b10.writeString(str2);
        b10.writeString(str3);
        d(10, b10);
    }

    public final void i(Bundle bundle, g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, bundle);
        j0.c(b10, g8Var);
        d(19, b10);
    }

    public final void k(c cVar, g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, cVar);
        j0.c(b10, g8Var);
        d(12, b10);
    }

    public final List n(String str, String str2, String str3, boolean z9) {
        Parcel b10 = b();
        b10.writeString((String) null);
        b10.writeString(str2);
        b10.writeString(str3);
        ClassLoader classLoader = j0.f8270a;
        b10.writeInt(z9 ? 1 : 0);
        Parcel c10 = c(15, b10);
        ArrayList<z7> createTypedArrayList = c10.createTypedArrayList(z7.CREATOR);
        c10.recycle();
        return createTypedArrayList;
    }

    public final ArrayList p(g8 g8Var, boolean z9) {
        Parcel b10 = b();
        j0.c(b10, g8Var);
        b10.writeInt(z9 ? 1 : 0);
        Parcel c10 = c(7, b10);
        ArrayList<z7> createTypedArrayList = c10.createTypedArrayList(z7.CREATOR);
        c10.recycle();
        return createTypedArrayList;
    }

    public final void q(r rVar, g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, rVar);
        j0.c(b10, g8Var);
        d(1, b10);
    }

    public final void r(g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, g8Var);
        d(20, b10);
    }

    public final List s(String str, String str2, boolean z9, g8 g8Var) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        ClassLoader classLoader = j0.f8270a;
        b10.writeInt(z9 ? 1 : 0);
        j0.c(b10, g8Var);
        Parcel c10 = c(14, b10);
        ArrayList<z7> createTypedArrayList = c10.createTypedArrayList(z7.CREATOR);
        c10.recycle();
        return createTypedArrayList;
    }

    public final String t(g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, g8Var);
        Parcel c10 = c(11, b10);
        String readString = c10.readString();
        c10.recycle();
        return readString;
    }

    public final byte[] u(r rVar, String str) {
        Parcel b10 = b();
        j0.c(b10, rVar);
        b10.writeString(str);
        Parcel c10 = c(9, b10);
        byte[] createByteArray = c10.createByteArray();
        c10.recycle();
        return createByteArray;
    }

    public final void v(g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, g8Var);
        d(18, b10);
    }

    public final void y(g8 g8Var) {
        Parcel b10 = b();
        j0.c(b10, g8Var);
        d(4, b10);
    }

    public final List zzg(String str, String str2, String str3) {
        Parcel b10 = b();
        b10.writeString((String) null);
        b10.writeString(str2);
        b10.writeString(str3);
        Parcel c10 = c(17, b10);
        ArrayList<c> createTypedArrayList = c10.createTypedArrayList(c.CREATOR);
        c10.recycle();
        return createTypedArrayList;
    }
}
