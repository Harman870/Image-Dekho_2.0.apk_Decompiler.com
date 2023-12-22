package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import h0.l0;
import h0.y;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l0.k;
import z.f;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f700a;

    /* renamed from: b  reason: collision with root package name */
    public g1 f701b;

    /* renamed from: c  reason: collision with root package name */
    public g1 f702c;

    /* renamed from: d  reason: collision with root package name */
    public g1 f703d;

    /* renamed from: e  reason: collision with root package name */
    public g1 f704e;

    /* renamed from: f  reason: collision with root package name */
    public g1 f705f;

    /* renamed from: g  reason: collision with root package name */
    public g1 f706g;

    /* renamed from: h  reason: collision with root package name */
    public g1 f707h;

    /* renamed from: i  reason: collision with root package name */
    public final j0 f708i;

    /* renamed from: j  reason: collision with root package name */
    public int f709j = 0;
    public int k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f710l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f711m;

    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f712a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f713b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f714c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f712a = i10;
            this.f713b = i11;
            this.f714c = weakReference;
        }

        public final void c(int i10) {
        }

        public final void d(Typeface typeface) {
            int i10;
            boolean z9;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f712a) != -1) {
                if ((this.f713b & 2) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                typeface = e.a(typeface, i10, z9);
            }
            b0 b0Var = b0.this;
            WeakReference weakReference = this.f714c;
            if (b0Var.f711m) {
                b0Var.f710l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    if (y.g.b(textView)) {
                        textView.post(new c0(textView, typeface, b0Var.f709j));
                    } else {
                        textView.setTypeface(typeface, b0Var.f709j);
                    }
                }
            }
        }
    }

    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z9) {
            return Typeface.create(typeface, i10, z9);
        }
    }

    public b0(TextView textView) {
        this.f700a = textView;
        this.f708i = new j0(textView);
    }

    public static g1 c(Context context, j jVar, int i10) {
        ColorStateList h10;
        synchronized (jVar) {
            h10 = jVar.f813a.h(context, i10);
        }
        if (h10 == null) {
            return null;
        }
        g1 g1Var = new g1();
        g1Var.f786d = true;
        g1Var.f783a = h10;
        return g1Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z9;
        int i12;
        CharSequence charSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 == 129 || i16 == 225 || i16 == 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    if (length <= 2048) {
                        k0.a.c(editorInfo, text, i10, i11);
                        return;
                    }
                    int i17 = i11 - i10;
                    if (i17 > 1024) {
                        i12 = 0;
                    } else {
                        i12 = i17;
                    }
                    int i18 = 2048 - i12;
                    int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (((double) i18) * 0.8d)));
                    int min2 = Math.min(i10, i18 - min);
                    int i19 = i10 - min2;
                    if (Character.isLowSurrogate(text.charAt(i19))) {
                        i19++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                        min--;
                    }
                    int i20 = min2 + i12 + min;
                    if (i12 != i17) {
                        charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11)});
                    } else {
                        charSequence = text.subSequence(i19, i20 + i19);
                    }
                    int i21 = min2 + 0;
                    k0.a.c(editorInfo, charSequence, i21, i12 + i21);
                    return;
                }
            }
            k0.a.c(editorInfo, (CharSequence) null, 0, 0);
        }
    }

    public final void a(Drawable drawable, g1 g1Var) {
        if (drawable != null && g1Var != null) {
            j.e(drawable, g1Var, this.f700a.getDrawableState());
        }
    }

    public final void b() {
        if (!(this.f701b == null && this.f702c == null && this.f703d == null && this.f704e == null)) {
            Drawable[] compoundDrawables = this.f700a.getCompoundDrawables();
            a(compoundDrawables[0], this.f701b);
            a(compoundDrawables[1], this.f702c);
            a(compoundDrawables[2], this.f703d);
            a(compoundDrawables[3], this.f704e);
        }
        if (this.f705f != null || this.f706g != null) {
            Drawable[] a10 = b.a(this.f700a);
            a(a10[0], this.f705f);
            a(a10[2], this.f706g);
        }
    }

    public final ColorStateList d() {
        g1 g1Var = this.f707h;
        if (g1Var != null) {
            return g1Var.f783a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        g1 g1Var = this.f707h;
        if (g1Var != null) {
            return g1Var.f784b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i10) {
        String str;
        String str2;
        boolean z9;
        boolean z10;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i11;
        int i12;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        int i13 = i10;
        Context context = this.f700a.getContext();
        j a10 = j.a();
        int[] iArr = y3.a.f13030l;
        i1 m2 = i1.m(context, attributeSet2, iArr, i13);
        TextView textView = this.f700a;
        y.m(textView, textView.getContext(), iArr, attributeSet, m2.f809b, i10);
        int i14 = m2.i(0, -1);
        if (m2.l(3)) {
            this.f701b = c(context, a10, m2.i(3, 0));
        }
        if (m2.l(1)) {
            this.f702c = c(context, a10, m2.i(1, 0));
        }
        if (m2.l(4)) {
            this.f703d = c(context, a10, m2.i(4, 0));
        }
        if (m2.l(2)) {
            this.f704e = c(context, a10, m2.i(2, 0));
        }
        int i15 = Build.VERSION.SDK_INT;
        if (m2.l(5)) {
            this.f705f = c(context, a10, m2.i(5, 0));
        }
        if (m2.l(6)) {
            this.f706g = c(context, a10, m2.i(6, 0));
        }
        m2.n();
        boolean z11 = this.f700a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (i14 != -1) {
            i1 i1Var = new i1(context, context.obtainStyledAttributes(i14, y3.a.B));
            if (z11 || !i1Var.l(14)) {
                z10 = false;
                z9 = false;
            } else {
                z10 = i1Var.a(14, false);
                z9 = true;
            }
            n(context, i1Var);
            if (i1Var.l(15)) {
                str2 = i1Var.j(15);
            } else {
                str2 = null;
            }
            if (i15 < 26 || !i1Var.l(13)) {
                str = null;
            } else {
                str = i1Var.j(13);
            }
            i1Var.n();
        } else {
            z10 = false;
            z9 = false;
            str2 = null;
            str = null;
        }
        i1 i1Var2 = new i1(context, context.obtainStyledAttributes(attributeSet2, y3.a.B, i13, 0));
        if (!z11 && i1Var2.l(14)) {
            z10 = i1Var2.a(14, false);
            z9 = true;
        }
        if (i1Var2.l(15)) {
            str2 = i1Var2.j(15);
        }
        if (i15 >= 26 && i1Var2.l(13)) {
            str = i1Var2.j(13);
        }
        String str3 = str;
        if (i15 >= 28 && i1Var2.l(0) && i1Var2.d(0, -1) == 0) {
            this.f700a.setTextSize(0, 0.0f);
        }
        n(context, i1Var2);
        i1Var2.n();
        if (!z11 && z9) {
            this.f700a.setAllCaps(z10);
        }
        Typeface typeface = this.f710l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f700a.setTypeface(typeface, this.f709j);
            } else {
                this.f700a.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            d.d(this.f700a, str3);
        }
        if (str2 != null) {
            c.b(this.f700a, c.a(str2));
        }
        j0 j0Var = this.f708i;
        Context context2 = j0Var.f831j;
        int[] iArr2 = y3.a.f13031m;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr2, i13, 0);
        TextView textView2 = j0Var.f830i;
        y.m(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            j0Var.f822a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f10 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f11 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f12 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr3[i16] = obtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                j0Var.f827f = j0.b(iArr3);
                j0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!j0Var.i()) {
            j0Var.f822a = 0;
        } else if (j0Var.f822a == 1) {
            if (!j0Var.f828g) {
                DisplayMetrics displayMetrics = j0Var.f831j.getResources().getDisplayMetrics();
                if (f11 == -1.0f) {
                    i12 = 2;
                    f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (f12 == -1.0f) {
                    f12 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                if (f10 == -1.0f) {
                    f10 = 1.0f;
                }
                j0Var.j(f11, f12, f10);
            }
            j0Var.g();
        }
        if (r1.f934b) {
            j0 j0Var2 = this.f708i;
            if (j0Var2.f822a != 0) {
                int[] iArr4 = j0Var2.f827f;
                if (iArr4.length > 0) {
                    if (((float) d.a(this.f700a)) != -1.0f) {
                        d.b(this.f700a, Math.round(this.f708i.f825d), Math.round(this.f708i.f826e), Math.round(this.f708i.f824c), 0);
                    } else {
                        d.c(this.f700a, iArr4, 0);
                    }
                }
            }
        }
        i1 i1Var3 = new i1(context, context.obtainStyledAttributes(attributeSet2, y3.a.f13031m));
        int i17 = i1Var3.i(8, -1);
        if (i17 != -1) {
            drawable = a10.b(context, i17);
        } else {
            drawable = null;
        }
        int i18 = i1Var3.i(13, -1);
        if (i18 != -1) {
            drawable2 = a10.b(context, i18);
        } else {
            drawable2 = null;
        }
        int i19 = i1Var3.i(9, -1);
        if (i19 != -1) {
            drawable3 = a10.b(context, i19);
        } else {
            drawable3 = null;
        }
        int i20 = i1Var3.i(6, -1);
        if (i20 != -1) {
            drawable4 = a10.b(context, i20);
        } else {
            drawable4 = null;
        }
        int i21 = i1Var3.i(10, -1);
        if (i21 != -1) {
            drawable5 = a10.b(context, i21);
        } else {
            drawable5 = null;
        }
        int i22 = i1Var3.i(7, -1);
        if (i22 != -1) {
            drawable6 = a10.b(context, i22);
        } else {
            drawable6 = null;
        }
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a11 = b.a(this.f700a);
            TextView textView3 = this.f700a;
            if (drawable5 == null) {
                drawable5 = a11[0];
            }
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            if (drawable6 == null) {
                drawable6 = a11[2];
            }
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            b.b(textView3, drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            Drawable[] a12 = b.a(this.f700a);
            Drawable drawable7 = a12[0];
            if (drawable7 == null && a12[2] == null) {
                Drawable[] compoundDrawables = this.f700a.getCompoundDrawables();
                TextView textView4 = this.f700a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                TextView textView5 = this.f700a;
                if (drawable2 == null) {
                    drawable2 = a12[1];
                }
                Drawable drawable8 = a12[2];
                if (drawable4 == null) {
                    drawable4 = a12[3];
                }
                b.b(textView5, drawable7, drawable2, drawable8, drawable4);
            }
        }
        if (i1Var3.l(11)) {
            ColorStateList b10 = i1Var3.b(11);
            TextView textView6 = this.f700a;
            textView6.getClass();
            k.c.f(textView6, b10);
        }
        if (i1Var3.l(12)) {
            i11 = -1;
            PorterDuff.Mode b11 = o0.b(i1Var3.h(12, -1), (PorterDuff.Mode) null);
            TextView textView7 = this.f700a;
            textView7.getClass();
            k.c.g(textView7, b11);
        } else {
            i11 = -1;
        }
        int d10 = i1Var3.d(15, i11);
        int d11 = i1Var3.d(18, i11);
        int d12 = i1Var3.d(19, i11);
        i1Var3.n();
        if (d10 != i11) {
            k.b(this.f700a, d10);
        }
        if (d11 != i11) {
            k.c(this.f700a, d11);
        }
        if (d12 != i11) {
            TextView textView8 = this.f700a;
            c6.b.n(d12);
            int fontMetricsInt = textView8.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (d12 != fontMetricsInt) {
                textView8.setLineSpacing((float) (d12 - fontMetricsInt), 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String j10;
        i1 i1Var = new i1(context, context.obtainStyledAttributes(i10, y3.a.B));
        if (i1Var.l(14)) {
            this.f700a.setAllCaps(i1Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i1Var.l(0) && i1Var.d(0, -1) == 0) {
            this.f700a.setTextSize(0, 0.0f);
        }
        n(context, i1Var);
        if (i11 >= 26 && i1Var.l(13) && (j10 = i1Var.j(13)) != null) {
            d.d(this.f700a, j10);
        }
        i1Var.n();
        Typeface typeface = this.f710l;
        if (typeface != null) {
            this.f700a.setTypeface(typeface, this.f709j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        j0 j0Var = this.f708i;
        if (j0Var.i()) {
            DisplayMetrics displayMetrics = j0Var.f831j.getResources().getDisplayMetrics();
            j0Var.j(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (j0Var.g()) {
                j0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        j0 j0Var = this.f708i;
        if (j0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = j0Var.f831j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                j0Var.f827f = j0.b(iArr2);
                if (!j0Var.h()) {
                    StringBuilder g10 = androidx.activity.f.g("None of the preset sizes is valid: ");
                    g10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(g10.toString());
                }
            } else {
                j0Var.f828g = false;
            }
            if (j0Var.g()) {
                j0Var.a();
            }
        }
    }

    public final void k(int i10) {
        j0 j0Var = this.f708i;
        if (!j0Var.i()) {
            return;
        }
        if (i10 == 0) {
            j0Var.f822a = 0;
            j0Var.f825d = -1.0f;
            j0Var.f826e = -1.0f;
            j0Var.f824c = -1.0f;
            j0Var.f827f = new int[0];
            j0Var.f823b = false;
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = j0Var.f831j.getResources().getDisplayMetrics();
            j0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (j0Var.g()) {
                j0Var.a();
            }
        } else {
            throw new IllegalArgumentException(androidx.activity.e.a("Unknown auto-size text type: ", i10));
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f707h == null) {
            this.f707h = new g1();
        }
        g1 g1Var = this.f707h;
        g1Var.f783a = colorStateList;
        g1Var.f786d = colorStateList != null;
        this.f701b = g1Var;
        this.f702c = g1Var;
        this.f703d = g1Var;
        this.f704e = g1Var;
        this.f705f = g1Var;
        this.f706g = g1Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f707h == null) {
            this.f707h = new g1();
        }
        g1 g1Var = this.f707h;
        g1Var.f784b = mode;
        g1Var.f785c = mode != null;
        this.f701b = g1Var;
        this.f702c = g1Var;
        this.f703d = g1Var;
        this.f704e = g1Var;
        this.f705f = g1Var;
        this.f706g = g1Var;
    }

    public final void n(Context context, i1 i1Var) {
        String j10;
        Typeface typeface;
        Typeface typeface2;
        this.f709j = i1Var.h(2, this.f709j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z9 = false;
        if (i10 >= 28) {
            int h10 = i1Var.h(11, -1);
            this.k = h10;
            if (h10 != -1) {
                this.f709j = (this.f709j & 2) | 0;
            }
        }
        int i11 = 10;
        if (i1Var.l(10) || i1Var.l(12)) {
            this.f710l = null;
            if (i1Var.l(12)) {
                i11 = 12;
            }
            int i12 = this.k;
            int i13 = this.f709j;
            if (!context.isRestricted()) {
                try {
                    Typeface g10 = i1Var.g(i11, this.f709j, new a(i12, i13, new WeakReference(this.f700a)));
                    if (g10 != null) {
                        if (i10 >= 28 && this.k != -1) {
                            g10 = e.a(Typeface.create(g10, 0), this.k, (this.f709j & 2) != 0);
                        }
                        this.f710l = g10;
                    }
                    this.f711m = this.f710l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f710l == null && (j10 = i1Var.j(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    typeface = Typeface.create(j10, this.f709j);
                } else {
                    Typeface create = Typeface.create(j10, 0);
                    int i14 = this.k;
                    if ((this.f709j & 2) != 0) {
                        z9 = true;
                    }
                    typeface = e.a(create, i14, z9);
                }
                this.f710l = typeface;
            }
        } else if (i1Var.l(1)) {
            this.f711m = false;
            int h11 = i1Var.h(1, 1);
            if (h11 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (h11 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (h11 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f710l = typeface2;
        }
    }
}
