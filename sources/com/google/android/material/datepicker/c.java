package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c.a;
import com.imgdkh.app.R;
import n5.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3108a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3109b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3110c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3111d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3112e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3113f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3114g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f3115h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.c(context, i.class.getCanonicalName(), R.attr.materialCalendarStyle).data, a.I);
        this.f3108a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f3114g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3109b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3110c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = n5.c.a(context, obtainStyledAttributes, 6);
        this.f3111d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3112e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3113f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f3115h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
