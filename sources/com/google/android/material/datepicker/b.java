package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import c.a;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import n5.c;
import r5.f;
import r5.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3102a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f3103b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3104c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f3105d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3106e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3107f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, i iVar, Rect rect) {
        c6.b.n(rect.left);
        c6.b.n(rect.top);
        c6.b.n(rect.right);
        c6.b.n(rect.bottom);
        this.f3102a = rect;
        this.f3103b = colorStateList2;
        this.f3104c = colorStateList;
        this.f3105d = colorStateList3;
        this.f3106e = i10;
        this.f3107f = iVar;
    }

    public static b a(Context context, int i10) {
        boolean z9;
        if (i10 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        c6.b.l("Cannot create a CalendarItemStyle with a styleResId of 0", z9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a.J);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        i iVar = new i(i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new r5.a((float) 0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, iVar, rect);
    }

    public final void b(TextView textView) {
        f fVar = new f();
        f fVar2 = new f();
        fVar.setShapeAppearanceModel(this.f3107f);
        fVar2.setShapeAppearanceModel(this.f3107f);
        fVar.k(this.f3104c);
        ColorStateList colorStateList = this.f3105d;
        fVar.f11660a.k = (float) this.f3106e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f11660a;
        if (bVar.f11684d != colorStateList) {
            bVar.f11684d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        textView.setTextColor(this.f3103b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f3103b.withAlpha(30), fVar, fVar2);
        Rect rect = this.f3102a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.q(textView, insetDrawable);
    }
}
