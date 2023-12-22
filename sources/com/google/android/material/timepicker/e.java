package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f3429a;

    public e(TimePickerView timePickerView) {
        this.f3429a = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f3429a;
        int i10 = TimePickerView.f3420r;
        timePickerView.getClass();
        return false;
    }
}
