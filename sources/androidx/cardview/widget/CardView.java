package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.c0;
import com.imgdkh.app.R;
import l.b;

public class CardView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1029f = {16842801};

    /* renamed from: g  reason: collision with root package name */
    public static final y3.a f1030g = new y3.a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f1031a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1032b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1033c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1034d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final a f1035e;

    public class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1036a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1034d.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1033c;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        ColorStateList colorStateList;
        Resources resources;
        int i10;
        Rect rect = new Rect();
        this.f1033c = rect;
        a aVar = new a();
        this.f1035e = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c0.f1720d, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1029f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i10 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i10 = R.color.cardview_dark_background;
            }
            colorStateList = ColorStateList.valueOf(resources.getColor(i10));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1031a = obtainStyledAttributes.getBoolean(7, false);
        this.f1032b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        y3.a aVar2 = f1030g;
        b bVar = new b(dimension, colorStateList);
        aVar.f1036a = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        aVar2.t(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) this.f1035e.f1036a).f9169h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1033c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1033c.left;
    }

    public int getContentPaddingRight() {
        return this.f1033c.right;
    }

    public int getContentPaddingTop() {
        return this.f1033c.top;
    }

    public float getMaxCardElevation() {
        return ((b) this.f1035e.f1036a).f9166e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1032b;
    }

    public float getRadius() {
        return ((b) this.f1035e.f1036a).f9162a;
    }

    public boolean getUseCompatPadding() {
        return this.f1031a;
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        a aVar = this.f1035e;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        b bVar = (b) aVar.f1036a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f1030g.t(this.f1035e, f10);
    }

    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z9) {
        if (z9 != this.f1032b) {
            this.f1032b = z9;
            y3.a aVar = f1030g;
            a aVar2 = this.f1035e;
            aVar.t(aVar2, ((b) aVar2.f1036a).f9166e);
        }
    }

    public void setRadius(float f10) {
        b bVar = (b) this.f1035e.f1036a;
        if (f10 != bVar.f9162a) {
            bVar.f9162a = f10;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f1031a != z9) {
            this.f1031a = z9;
            y3.a aVar = f1030g;
            a aVar2 = this.f1035e;
            aVar.t(aVar2, ((b) aVar2.f1036a).f9166e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) this.f1035e.f1036a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }
}
