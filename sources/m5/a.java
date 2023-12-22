package m5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import com.imgdkh.app.R;
import j5.s;
import l0.b;
import n5.c;

public final class a extends t {

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f9375g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f9376e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9377f;

    public a(Context context, AttributeSet attributeSet) {
        super(x5.a.a(context, attributeSet, R.attr.radioButtonStyle, 2132018227), attributeSet);
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, c.a.L, R.attr.radioButtonStyle, 2132018227, new int[0]);
        if (d10.hasValue(0)) {
            b.c(this, c.a(context2, d10, 0));
        }
        this.f9377f = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9376e == null) {
            int t10 = c6.b.t(this, R.attr.colorControlActivated);
            int t11 = c6.b.t(this, R.attr.colorOnSurface);
            int t12 = c6.b.t(this, R.attr.colorSurface);
            this.f9376e = new ColorStateList(f9375g, new int[]{c6.b.v(1.0f, t12, t10), c6.b.v(0.54f, t12, t11), c6.b.v(0.38f, t12, t11), c6.b.v(0.38f, t12, t11)});
        }
        return this.f9376e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9377f && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f9377f = z9;
        b.c(this, z9 ? getMaterialThemeColorsTintList() : null);
    }
}
