package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class d extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1208a = true;

    public d(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z9) {
        this.f1208a = z9;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1208a || aVar.f1055a != i10) {
            aVar.f1055a = i10;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1208a || aVar.f1057b != i10) {
            aVar.f1057b = i10;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1208a || aVar.f1059c != f10) {
            aVar.f1059c = f10;
            setLayoutParams(aVar);
        }
    }

    public void setVisibility(int i10) {
    }
}
