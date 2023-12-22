package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p3.l;
import r3.o;
import s3.a;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    public final int f2803a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2804b;

    public Scope() {
        throw null;
    }

    public Scope(int i10, String str) {
        o.f("scopeUri must not be null or empty", str);
        this.f2803a = i10;
        this.f2804b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2804b.equals(((Scope) obj).f2804b);
    }

    public final int hashCode() {
        return this.f2804b.hashCode();
    }

    public final String toString() {
        return this.f2804b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f2803a);
        y3.a.B(parcel, 2, this.f2804b);
        y3.a.S(G, parcel);
    }
}
