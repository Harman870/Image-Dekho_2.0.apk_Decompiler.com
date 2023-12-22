package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import y3.a;

public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f761a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f762b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f763c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f764d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f765e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f766f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f767g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.f13032n);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f762b, d10.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f761a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f10 = typedValue.getFloat();
        int c10 = c(context, i10);
        return a0.a.c(c10, Math.round(((float) Color.alpha(c10)) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f767g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f767g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = y.a.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
