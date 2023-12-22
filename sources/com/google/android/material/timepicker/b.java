package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.imgdkh.app.R;
import h0.a;
import i0.f;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3424d;

    public b(ClockFaceView clockFaceView) {
        this.f3424d = clockFaceView;
    }

    public final void d(View view, f fVar) {
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            fVar.f7091a.setTraversalAfter(this.f3424d.f3405x.get(intValue - 1));
        }
        fVar.h(f.b.a(0, 1, intValue, 1, false, view.isSelected()));
        fVar.f7091a.setClickable(true);
        fVar.b(f.a.f7096g);
    }

    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        view.getHitRect(this.f3424d.u);
        float centerX = (float) this.f3424d.u.centerX();
        float centerY = (float) this.f3424d.u.centerY();
        this.f3424d.f3403t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        this.f3424d.f3403t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
