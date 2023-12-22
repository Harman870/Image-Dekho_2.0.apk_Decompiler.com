package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.y;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e0> f1412a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f1413b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f1414c;

    /* renamed from: d  reason: collision with root package name */
    public b[] f1415d;

    /* renamed from: e  reason: collision with root package name */
    public int f1416e;

    /* renamed from: f  reason: collision with root package name */
    public String f1417f = null;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f1418g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<c> f1419h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<String> f1420i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<Bundle> f1421j = new ArrayList<>();
    public ArrayList<y.j> k;

    public class a implements Parcelable.Creator<a0> {
        public final Object createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        public final Object[] newArray(int i10) {
            return new a0[i10];
        }
    }

    public a0() {
    }

    public a0(Parcel parcel) {
        this.f1412a = parcel.createTypedArrayList(e0.CREATOR);
        this.f1413b = parcel.createStringArrayList();
        this.f1414c = parcel.createStringArrayList();
        this.f1415d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1416e = parcel.readInt();
        this.f1417f = parcel.readString();
        this.f1418g = parcel.createStringArrayList();
        this.f1419h = parcel.createTypedArrayList(c.CREATOR);
        this.f1420i = parcel.createStringArrayList();
        this.f1421j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.k = parcel.createTypedArrayList(y.j.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f1412a);
        parcel.writeStringList(this.f1413b);
        parcel.writeStringList(this.f1414c);
        parcel.writeTypedArray(this.f1415d, i10);
        parcel.writeInt(this.f1416e);
        parcel.writeString(this.f1417f);
        parcel.writeStringList(this.f1418g);
        parcel.writeTypedList(this.f1419h);
        parcel.writeStringList(this.f1420i);
        parcel.writeTypedList(this.f1421j);
        parcel.writeTypedList(this.k);
    }
}
