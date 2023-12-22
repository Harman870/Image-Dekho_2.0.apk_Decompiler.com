package g5;

import android.content.Context;
import android.graphics.Color;
import com.imgdkh.app.R;
import n5.b;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f6574f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6575a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6576b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6577c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6578d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6579e;

    public a(Context context) {
        boolean b10 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int s10 = c6.b.s(context, R.attr.elevationOverlayColor, 0);
        int s11 = c6.b.s(context, R.attr.elevationOverlayAccentColor, 0);
        int s12 = c6.b.s(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f6575a = b10;
        this.f6576b = s10;
        this.f6577c = s11;
        this.f6578d = s12;
        this.f6579e = f10;
    }

    public final int a(int i10, float f10) {
        boolean z9;
        float f11;
        int i11;
        if (!this.f6575a) {
            return i10;
        }
        if (a0.a.c(i10, 255) == this.f6578d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return i10;
        }
        float f12 = this.f6579e;
        if (f12 <= 0.0f || f10 <= 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = Math.min(((((float) Math.log1p((double) (f10 / f12))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i10);
        int v10 = c6.b.v(f11, a0.a.c(i10, 255), this.f6576b);
        if (f11 > 0.0f && (i11 = this.f6577c) != 0) {
            v10 = a0.a.b(a0.a.c(i11, f6574f), v10);
        }
        return a0.a.c(v10, alpha);
    }
}
