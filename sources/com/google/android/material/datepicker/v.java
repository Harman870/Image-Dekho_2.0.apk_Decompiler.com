package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class v implements Comparable<v>, Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3162a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3163b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3164c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3165d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3166e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3167f;

    /* renamed from: g  reason: collision with root package name */
    public String f3168g;

    public class a implements Parcelable.Creator<v> {
        public final Object createFromParcel(Parcel parcel) {
            return v.a(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new v[i10];
        }
    }

    public v(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c10 = e0.c(calendar);
        this.f3162a = c10;
        this.f3163b = c10.get(2);
        this.f3164c = c10.get(1);
        this.f3165d = c10.getMaximum(7);
        this.f3166e = c10.getActualMaximum(5);
        this.f3167f = c10.getTimeInMillis();
    }

    public static v a(int i10, int i11) {
        Calendar e10 = e0.e((Calendar) null);
        e10.set(1, i10);
        e10.set(2, i11);
        return new v(e10);
    }

    public static v b(long j10) {
        Calendar e10 = e0.e((Calendar) null);
        e10.setTimeInMillis(j10);
        return new v(e10);
    }

    public final String c() {
        if (this.f3168g == null) {
            this.f3168g = e0.b("yMMMM", Locale.getDefault()).format(new Date(this.f3162a.getTimeInMillis()));
        }
        return this.f3168g;
    }

    public final int compareTo(Object obj) {
        return this.f3162a.compareTo(((v) obj).f3162a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3163b == vVar.f3163b && this.f3164c == vVar.f3164c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3163b), Integer.valueOf(this.f3164c)});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3164c);
        parcel.writeInt(this.f3163b);
    }
}
