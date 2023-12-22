package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.b0;
import y.a;
import z.f;

public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f808a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f809b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f810c;

    public i1(Context context, TypedArray typedArray) {
        this.f808a = context;
        this.f809b = typedArray;
    }

    public static i1 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new i1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z9) {
        return this.f809b.getBoolean(i10, z9);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList b10;
        if (!this.f809b.hasValue(i10) || (resourceId = this.f809b.getResourceId(i10, 0)) == 0 || (b10 = a.b(this.f808a, resourceId)) == null) {
            return this.f809b.getColorStateList(i10);
        }
        return b10;
    }

    public final int c(int i10, int i11) {
        return this.f809b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f809b.getDimensionPixelSize(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f809b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f809b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f809b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f808a
            android.graphics.drawable.Drawable r3 = e.a.a(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f809b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i1.e(int):android.graphics.drawable.Drawable");
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable f10;
        if (!this.f809b.hasValue(i10) || (resourceId = this.f809b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        j a10 = j.a();
        Context context = this.f808a;
        synchronized (a10) {
            f10 = a10.f813a.f(context, resourceId, true);
        }
        return f10;
    }

    public final Typeface g(int i10, int i11, b0.a aVar) {
        int resourceId = this.f809b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f810c == null) {
            this.f810c = new TypedValue();
        }
        Context context = this.f808a;
        TypedValue typedValue = this.f810c;
        ThreadLocal<TypedValue> threadLocal = f.f13098a;
        if (context.isRestricted()) {
            return null;
        }
        return f.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f809b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f809b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f809b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f809b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f809b.hasValue(i10);
    }

    public final void n() {
        this.f809b.recycle();
    }
}
