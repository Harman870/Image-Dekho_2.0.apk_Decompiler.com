package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.h0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1422a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f1423b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1424c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1425d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1426e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1427f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1428g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1429h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f1430i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1431j;
    public final CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<String> f1432l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f1433m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1434n;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f1422a = parcel.createIntArray();
        this.f1423b = parcel.createStringArrayList();
        this.f1424c = parcel.createIntArray();
        this.f1425d = parcel.createIntArray();
        this.f1426e = parcel.readInt();
        this.f1427f = parcel.readString();
        this.f1428g = parcel.readInt();
        this.f1429h = parcel.readInt();
        this.f1430i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1431j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1432l = parcel.createStringArrayList();
        this.f1433m = parcel.createStringArrayList();
        this.f1434n = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f1490a.size();
        this.f1422a = new int[(size * 6)];
        if (aVar.f1496g) {
            this.f1423b = new ArrayList<>(size);
            this.f1424c = new int[size];
            this.f1425d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                h0.a aVar2 = aVar.f1490a.get(i10);
                int i12 = i11 + 1;
                this.f1422a[i11] = aVar2.f1504a;
                ArrayList<String> arrayList = this.f1423b;
                o oVar = aVar2.f1505b;
                arrayList.add(oVar != null ? oVar.f1567f : null);
                int[] iArr = this.f1422a;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f1506c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f1507d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f1508e;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f1509f;
                iArr[i16] = aVar2.f1510g;
                this.f1424c[i10] = aVar2.f1511h.ordinal();
                this.f1425d[i10] = aVar2.f1512i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f1426e = aVar.f1495f;
            this.f1427f = aVar.f1497h;
            this.f1428g = aVar.f1411r;
            this.f1429h = aVar.f1498i;
            this.f1430i = aVar.f1499j;
            this.f1431j = aVar.k;
            this.k = aVar.f1500l;
            this.f1432l = aVar.f1501m;
            this.f1433m = aVar.f1502n;
            this.f1434n = aVar.f1503o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1422a);
        parcel.writeStringList(this.f1423b);
        parcel.writeIntArray(this.f1424c);
        parcel.writeIntArray(this.f1425d);
        parcel.writeInt(this.f1426e);
        parcel.writeString(this.f1427f);
        parcel.writeInt(this.f1428g);
        parcel.writeInt(this.f1429h);
        TextUtils.writeToParcel(this.f1430i, parcel, 0);
        parcel.writeInt(this.f1431j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.f1432l);
        parcel.writeStringList(this.f1433m);
        parcel.writeInt(this.f1434n ? 1 : 0);
    }
}
