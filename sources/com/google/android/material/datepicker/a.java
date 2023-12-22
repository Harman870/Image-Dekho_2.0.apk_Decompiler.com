package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0027a();

    /* renamed from: a  reason: collision with root package name */
    public final v f3088a;

    /* renamed from: b  reason: collision with root package name */
    public final v f3089b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3090c;

    /* renamed from: d  reason: collision with root package name */
    public v f3091d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3092e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3093f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3094g;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public class C0027a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a((v) parcel.readParcelable(v.class.getClassLoader()), (v) parcel.readParcelable(v.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (v) parcel.readParcelable(v.class.getClassLoader()), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final long f3095f = e0.a(v.a(1900, 0).f3167f);

        /* renamed from: g  reason: collision with root package name */
        public static final long f3096g = e0.a(v.a(2100, 11).f3167f);

        /* renamed from: a  reason: collision with root package name */
        public long f3097a = f3095f;

        /* renamed from: b  reason: collision with root package name */
        public long f3098b = f3096g;

        /* renamed from: c  reason: collision with root package name */
        public Long f3099c;

        /* renamed from: d  reason: collision with root package name */
        public int f3100d;

        /* renamed from: e  reason: collision with root package name */
        public c f3101e = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f3097a = aVar.f3088a.f3167f;
            this.f3098b = aVar.f3089b.f3167f;
            this.f3099c = Long.valueOf(aVar.f3091d.f3167f);
            this.f3100d = aVar.f3092e;
            this.f3101e = aVar.f3090c;
        }
    }

    public interface c extends Parcelable {
        boolean k(long j10);
    }

    public a(v vVar, v vVar2, c cVar, v vVar3, int i10) {
        Objects.requireNonNull(vVar, "start cannot be null");
        Objects.requireNonNull(vVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f3088a = vVar;
        this.f3089b = vVar2;
        this.f3091d = vVar3;
        this.f3092e = i10;
        this.f3090c = cVar;
        if (vVar3 != null && vVar.f3162a.compareTo(vVar3.f3162a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (vVar3 != null && vVar3.f3162a.compareTo(vVar2.f3162a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i10 < 0 || i10 > e0.e((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else if (vVar.f3162a instanceof GregorianCalendar) {
            int i11 = vVar2.f3164c;
            int i12 = vVar.f3164c;
            this.f3094g = (vVar2.f3163b - vVar.f3163b) + ((i11 - i12) * 12) + 1;
            this.f3093f = (i11 - i12) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3088a.equals(aVar.f3088a) || !this.f3089b.equals(aVar.f3089b) || !g0.b.a(this.f3091d, aVar.f3091d) || this.f3092e != aVar.f3092e || !this.f3090c.equals(aVar.f3090c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3088a, this.f3089b, this.f3091d, Integer.valueOf(this.f3092e), this.f3090c});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f3088a, 0);
        parcel.writeParcelable(this.f3089b, 0);
        parcel.writeParcelable(this.f3091d, 0);
        parcel.writeParcelable(this.f3090c, 0);
        parcel.writeInt(this.f3092e);
    }
}
