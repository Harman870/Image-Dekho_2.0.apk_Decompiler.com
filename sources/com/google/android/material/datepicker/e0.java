package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<d0> f3120a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar e10 = e((Calendar) null);
        e10.setTimeInMillis(j10);
        return c(e10).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar c(Calendar calendar) {
        Calendar e10 = e(calendar);
        Calendar e11 = e((Calendar) null);
        e11.set(e10.get(1), e10.get(2), e10.get(5));
        return e11;
    }

    public static Calendar d() {
        Calendar calendar;
        d0 d0Var = f3120a.get();
        if (d0Var == null) {
            d0Var = d0.f3116c;
        }
        java.util.TimeZone timeZone = d0Var.f3118b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l6 = d0Var.f3117a;
        if (l6 != null) {
            calendar.setTimeInMillis(l6.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar e(Calendar calendar) {
        Calendar instance = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
