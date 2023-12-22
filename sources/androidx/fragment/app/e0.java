package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f1457a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1458b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1459c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1460d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1461e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1462f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1463g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1464h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1465i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f1466j;
    public final boolean k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1467l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f1468m;

    public class a implements Parcelable.Creator<e0> {
        public final Object createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        public final Object[] newArray(int i10) {
            return new e0[i10];
        }
    }

    public e0(Parcel parcel) {
        this.f1457a = parcel.readString();
        this.f1458b = parcel.readString();
        boolean z9 = true;
        this.f1459c = parcel.readInt() != 0;
        this.f1460d = parcel.readInt();
        this.f1461e = parcel.readInt();
        this.f1462f = parcel.readString();
        this.f1463g = parcel.readInt() != 0;
        this.f1464h = parcel.readInt() != 0;
        this.f1465i = parcel.readInt() != 0;
        this.f1466j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z9;
        this.f1468m = parcel.readBundle();
        this.f1467l = parcel.readInt();
    }

    public e0(o oVar) {
        this.f1457a = oVar.getClass().getName();
        this.f1458b = oVar.f1567f;
        this.f1459c = oVar.f1574n;
        this.f1460d = oVar.w;
        this.f1461e = oVar.f1582x;
        this.f1462f = oVar.f1583y;
        this.f1463g = oVar.B;
        this.f1464h = oVar.f1573m;
        this.f1465i = oVar.A;
        this.f1466j = oVar.f1568g;
        this.k = oVar.f1584z;
        this.f1467l = oVar.M.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1457a);
        sb.append(" (");
        sb.append(this.f1458b);
        sb.append(")}:");
        if (this.f1459c) {
            sb.append(" fromLayout");
        }
        if (this.f1461e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1461e));
        }
        String str = this.f1462f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1462f);
        }
        if (this.f1463g) {
            sb.append(" retainInstance");
        }
        if (this.f1464h) {
            sb.append(" removing");
        }
        if (this.f1465i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1457a);
        parcel.writeString(this.f1458b);
        parcel.writeInt(this.f1459c ? 1 : 0);
        parcel.writeInt(this.f1460d);
        parcel.writeInt(this.f1461e);
        parcel.writeString(this.f1462f);
        parcel.writeInt(this.f1463g ? 1 : 0);
        parcel.writeInt(this.f1464h ? 1 : 0);
        parcel.writeInt(this.f1465i ? 1 : 0);
        parcel.writeBundle(this.f1466j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.f1468m);
        parcel.writeInt(this.f1467l);
    }
}
