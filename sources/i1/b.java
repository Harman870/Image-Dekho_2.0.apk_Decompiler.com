package i1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.e;
import java.lang.reflect.Method;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f7113d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f7114e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7115f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7116g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7117h;

    /* renamed from: i  reason: collision with root package name */
    public int f7118i;

    /* renamed from: j  reason: collision with root package name */
    public int f7119j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new m.b(), new m.b(), new m.b());
    }

    public b(Parcel parcel, int i10, int i11, String str, m.b<String, Method> bVar, m.b<String, Method> bVar2, m.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f7113d = new SparseIntArray();
        this.f7118i = -1;
        this.k = -1;
        this.f7114e = parcel;
        this.f7115f = i10;
        this.f7116g = i11;
        this.f7119j = i10;
        this.f7117h = str;
    }

    public final b a() {
        Parcel parcel = this.f7114e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f7119j;
        if (i10 == this.f7115f) {
            i10 = this.f7116g;
        }
        return new b(parcel, dataPosition, i10, e.c(new StringBuilder(), this.f7117h, "  "), this.f7110a, this.f7111b, this.f7112c);
    }

    public final boolean e() {
        return this.f7114e.readInt() != 0;
    }

    public final byte[] f() {
        int readInt = this.f7114e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f7114e.readByteArray(bArr);
        return bArr;
    }

    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f7114e);
    }

    public final boolean h(int i10) {
        while (this.f7119j < this.f7116g) {
            int i11 = this.k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f7114e.setDataPosition(this.f7119j);
            int readInt = this.f7114e.readInt();
            this.k = this.f7114e.readInt();
            this.f7119j += readInt;
        }
        return this.k == i10;
    }

    public final int i() {
        return this.f7114e.readInt();
    }

    public final <T extends Parcelable> T j() {
        return this.f7114e.readParcelable(b.class.getClassLoader());
    }

    public final String k() {
        return this.f7114e.readString();
    }

    public final void m(int i10) {
        u();
        this.f7118i = i10;
        this.f7113d.put(i10, this.f7114e.dataPosition());
        q(0);
        q(i10);
    }

    public final void n(boolean z9) {
        this.f7114e.writeInt(z9 ? 1 : 0);
    }

    public final void o(byte[] bArr) {
        if (bArr != null) {
            this.f7114e.writeInt(bArr.length);
            this.f7114e.writeByteArray(bArr);
            return;
        }
        this.f7114e.writeInt(-1);
    }

    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f7114e, 0);
    }

    public final void q(int i10) {
        this.f7114e.writeInt(i10);
    }

    public final void r(Parcelable parcelable) {
        this.f7114e.writeParcelable(parcelable, 0);
    }

    public final void s(String str) {
        this.f7114e.writeString(str);
    }

    public final void u() {
        int i10 = this.f7118i;
        if (i10 >= 0) {
            int i11 = this.f7113d.get(i10);
            int dataPosition = this.f7114e.dataPosition();
            this.f7114e.setDataPosition(i11);
            this.f7114e.writeInt(dataPosition - i11);
            this.f7114e.setDataPosition(dataPosition);
        }
    }
}
