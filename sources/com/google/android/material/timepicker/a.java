package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3423a;

    public a(ClockFaceView clockFaceView) {
        this.f3423a = clockFaceView;
    }

    public final boolean onPreDraw() {
        if (!this.f3423a.isShown()) {
            return true;
        }
        this.f3423a.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f3423a;
        int height = ((this.f3423a.getHeight() / 2) - clockFaceView.f3403t.f3411d) - clockFaceView.B;
        if (height != clockFaceView.f3426r) {
            clockFaceView.f3426r = height;
            clockFaceView.k();
            ClockHandView clockHandView = clockFaceView.f3403t;
            clockHandView.f3418l = clockFaceView.f3426r;
            clockHandView.invalidate();
        }
        return true;
    }
}
