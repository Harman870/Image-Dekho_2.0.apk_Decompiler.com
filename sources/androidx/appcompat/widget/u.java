package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.imgdkh.app.R;

public final class u extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final s f957a;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        d1.a(getContext(), this);
        s sVar = new s(this);
        this.f957a = sVar;
        sVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = this.f957a.f937b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
