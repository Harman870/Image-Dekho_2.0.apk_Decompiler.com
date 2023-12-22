package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import com.imgdkh.app.R;
import h0.l0;
import h0.m0;
import h0.y;

public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0005a f678a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f679b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f680c;

    /* renamed from: d  reason: collision with root package name */
    public c f681d;

    /* renamed from: e  reason: collision with root package name */
    public int f682e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f683f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f684g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f685h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0005a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f686a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f687b;

        public C0005a() {
        }

        public final void a() {
            if (!this.f686a) {
                a aVar = a.this;
                aVar.f683f = null;
                a.super.setVisibility(this.f687b);
            }
        }

        public final void e(View view) {
            this.f686a = true;
        }

        public final void k() {
            a.super.setVisibility(0);
            this.f686a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f678a = new C0005a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f679b = context;
        } else {
            this.f679b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i10, int i11, int i12, View view, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z9) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z9 ? -measuredWidth : measuredWidth;
    }

    public final l0 e(int i10, long j10) {
        l0 l0Var = this.f683f;
        if (l0Var != null) {
            l0Var.b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            l0 a10 = y.a(this);
            a10.a(1.0f);
            a10.c(j10);
            C0005a aVar = this.f678a;
            a.this.f683f = a10;
            aVar.f687b = i10;
            a10.d(aVar);
            return a10;
        }
        l0 a11 = y.a(this);
        a11.a(0.0f);
        a11.c(j10);
        C0005a aVar2 = this.f678a;
        a.this.f683f = a11;
        aVar2.f687b = i10;
        a11.d(aVar2);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.f683f != null ? this.f678a.f687b : getVisibility();
    }

    public int getContentHeight() {
        return this.f682e;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, y3.a.f13024e, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f681d;
        if (cVar != null) {
            Configuration configuration2 = cVar.f384b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else if (i11 >= 360) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            cVar.f722q = i10;
            f fVar = cVar.f385c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f685h = false;
        }
        if (!this.f685h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f685h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f685h = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f684g = false;
        }
        if (!this.f684g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f684g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f684g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f682e = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            l0 l0Var = this.f683f;
            if (l0Var != null) {
                l0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
