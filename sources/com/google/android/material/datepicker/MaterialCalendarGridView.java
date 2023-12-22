package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.imgdkh.app.R;
import g0.c;
import h0.y;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3086a = e0.e((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3087b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (q.g0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3087b = q.h0(getContext(), R.attr.nestedScrollable);
        y.n(this, new p());
    }

    /* renamed from: a */
    public final w getAdapter() {
        return (w) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w a10 = getAdapter();
        d<?> dVar = a10.f3172b;
        c cVar = a10.f3174d;
        int max = Math.max(a10.b(), getFirstVisiblePosition());
        int min = Math.min((a10.b() + a10.f3171a.f3166e) - 1, getLastVisiblePosition());
        a10.getItem(max);
        a10.getItem(min);
        for (c<Long, Long> cVar2 : dVar.j()) {
            cVar2.getClass();
        }
    }

    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        int i11;
        if (z9) {
            if (i10 == 33) {
                w a10 = getAdapter();
                i11 = (a10.b() + a10.f3171a.f3166e) - 1;
            } else if (i10 == 130) {
                i11 = getAdapter().b();
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
            setSelection(i11);
            return;
        }
        super.onFocusChanged(false, i10, rect);
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f3087b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof w) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), w.class.getCanonicalName()}));
        }
    }

    public final void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            i10 = getAdapter().b();
        }
        super.setSelection(i10);
    }
}
