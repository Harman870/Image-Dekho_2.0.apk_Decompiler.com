package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.a;
import com.google.android.material.timepicker.ClockHandView;
import com.imgdkh.app.R;
import h0.y;
import java.util.Arrays;
import n5.c;

class ClockFaceView extends c implements ClockHandView.a {
    public final float[] A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public String[] F;
    public float G;
    public final ColorStateList H;

    /* renamed from: t  reason: collision with root package name */
    public final ClockHandView f3403t;
    public final Rect u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public final RectF f3404v = new RectF();
    public final Rect w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public final SparseArray<TextView> f3405x;

    /* renamed from: y  reason: collision with root package name */
    public final b f3406y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f3407z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f3405x = sparseArray;
        this.A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2368z, R.attr.materialClockStyle, 2132018294);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.H = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3403t = clockHandView;
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.f3407z = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f3410c.add(this);
        int defaultColor = y.a.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3406y = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.F = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < Math.max(this.F.length, size); i10++) {
            TextView textView = this.f3405x.get(i10);
            if (i10 >= this.F.length) {
                removeView(textView);
                this.f3405x.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.f3405x.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.F[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z9 = i11 > 1 ? true : z9;
                y.n(textView, this.f3406y);
                textView.setTextColor(this.H);
            }
        }
        ClockHandView clockHandView2 = this.f3403t;
        if (clockHandView2.f3409b && !z9) {
            clockHandView2.f3419m = 1;
        }
        clockHandView2.f3409b = z9;
        clockHandView2.invalidate();
        this.C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void a(float f10) {
        if (Math.abs(this.G - f10) > 0.001f) {
            this.G = f10;
            l();
        }
    }

    public final void k() {
        super.k();
        for (int i10 = 0; i10 < this.f3405x.size(); i10++) {
            this.f3405x.get(i10).setVisibility(0);
        }
    }

    public final void l() {
        boolean z9;
        RadialGradient radialGradient;
        RectF rectF = this.f3403t.f3414g;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f3405x.size(); i10++) {
            TextView textView2 = this.f3405x.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.u);
                this.f3404v.set(this.u);
                this.f3404v.union(rectF);
                float height = this.f3404v.height() * this.f3404v.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
        }
        for (int i11 = 0; i11 < this.f3405x.size(); i11++) {
            TextView textView3 = this.f3405x.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                textView3.setSelected(z9);
                textView3.getHitRect(this.u);
                this.f3404v.set(this.u);
                textView3.getLineBounds(0, this.w);
                RectF rectF2 = this.f3404v;
                Rect rect = this.w;
                rectF2.inset((float) rect.left, (float) rect.top);
                if (!RectF.intersects(rectF, this.f3404v)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.f3404v.left, rectF.centerY() - this.f3404v.top, 0.5f * rectF.width(), this.f3407z, this.A, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(1, this.F.length, false, 1);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = obtain;
        accessibilityNodeInfo.setCollectionInfo(obtain);
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        l();
    }

    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.E) / Math.max(Math.max(((float) this.C) / ((float) displayMetrics.heightPixels), ((float) this.D) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
