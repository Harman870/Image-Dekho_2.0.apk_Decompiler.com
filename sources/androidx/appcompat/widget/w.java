package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.imgdkh.app.R;

public final class w extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final x f986a;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        d1.a(getContext(), this);
        x xVar = new x(this);
        this.f986a = xVar;
        xVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f986a;
        Drawable drawable = xVar.f992e;
        if (drawable != null && drawable.isStateful() && drawable.setState(xVar.f991d.getDrawableState())) {
            xVar.f991d.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f986a.f992e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f986a.d(canvas);
    }
}
