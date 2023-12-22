package n5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.activity.result.c;
import z.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f10363a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10365c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10366d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10367e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10368f;

    /* renamed from: g  reason: collision with root package name */
    public final float f10369g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10370h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10371i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f10372j;
    public float k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10373l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10374m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f10375n;

    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f10376a;

        public a(c cVar) {
            this.f10376a = cVar;
        }

        public final void c(int i10) {
            d.this.f10374m = true;
            this.f10376a.k(i10);
        }

        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f10375n = Typeface.create(typeface, dVar.f10365c);
            d dVar2 = d.this;
            dVar2.f10374m = true;
            this.f10376a.l(dVar2.f10375n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, c.a.X);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f10372j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f10365c = obtainStyledAttributes.getInt(2, 0);
        this.f10366d = obtainStyledAttributes.getInt(1, 1);
        int i11 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f10373l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f10364b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f10363a = c.a(context, obtainStyledAttributes, 6);
        this.f10367e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f10368f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f10369g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, c.a.N);
        this.f10370h = obtainStyledAttributes2.hasValue(0);
        this.f10371i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f10375n == null && (str = this.f10364b) != null) {
            this.f10375n = Typeface.create(str, this.f10365c);
        }
        if (this.f10375n == null) {
            int i10 = this.f10366d;
            this.f10375n = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f10375n = Typeface.create(this.f10375n, this.f10365c);
        }
    }

    public final Typeface b(Context context) {
        if (this.f10374m) {
            return this.f10375n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = f.a(context, this.f10373l);
                this.f10375n = a10;
                if (a10 != null) {
                    this.f10375n = Typeface.create(a10, this.f10365c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                StringBuilder g10 = androidx.activity.f.g("Error loading font ");
                g10.append(this.f10364b);
                Log.d("TextAppearance", g10.toString(), e10);
            }
        }
        a();
        this.f10374m = true;
        return this.f10375n;
    }

    public final void c(Context context, c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f10373l;
        if (i10 == 0) {
            this.f10374m = true;
        }
        if (this.f10374m) {
            cVar.l(this.f10375n, true);
            return;
        }
        try {
            a aVar = new a(cVar);
            ThreadLocal<TypedValue> threadLocal = f.f13098a;
            if (context.isRestricted()) {
                aVar.a(-4);
                return;
            }
            f.b(context, i10, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f10374m = true;
            cVar.k(1);
        } catch (Exception e10) {
            StringBuilder g10 = androidx.activity.f.g("Error loading font ");
            g10.append(this.f10364b);
            Log.d("TextAppearance", g10.toString(), e10);
            this.f10374m = true;
            cVar.k(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f10373l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = z.f.f13098a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = z.f.b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f10372j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f10369g;
        float f11 = this.f10367e;
        float f12 = this.f10368f;
        ColorStateList colorStateList2 = this.f10363a;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f10375n);
        c(context, new e(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z9;
        float f10;
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f10365c & (~typeface.getStyle());
        if ((i10 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setFakeBoldText(z9);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.k);
        if (this.f10370h) {
            textPaint.setLetterSpacing(this.f10371i);
        }
    }
}
