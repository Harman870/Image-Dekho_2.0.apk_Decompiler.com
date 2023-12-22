package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import k5.a;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f3327a;

    /* renamed from: b  reason: collision with root package name */
    public Button f3328b;

    /* renamed from: c  reason: collision with root package name */
    public int f3329c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.d(context, R.attr.motionEasingEmphasizedInterpolator, s4.a.f11856b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z9;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f3327a.getPaddingTop() == i11 && this.f3327a.getPaddingBottom() == i12) {
            return z9;
        }
        TextView textView = this.f3327a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.g(textView)) {
            y.e.k(textView, y.e.f(textView), i11, y.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f3328b;
    }

    public TextView getMessageView() {
        return this.f3327a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3327a = (TextView) findViewById(R.id.snackbar_text);
        this.f3328b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (a(0, r0, r0) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099789(0x7f06008d, float:1.7811941E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099788(0x7f06008c, float:1.781194E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f3327a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L_0x0032
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L_0x0032
            r3 = r1
            goto L_0x0033
        L_0x0032:
            r3 = r4
        L_0x0033:
            if (r3 == 0) goto L_0x004c
            int r5 = r7.f3329c
            if (r5 <= 0) goto L_0x004c
            android.widget.Button r5 = r7.f3328b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3329c
            if (r5 <= r6) goto L_0x004c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x004c:
            if (r3 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = r4
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            super.onMeasure(r8, r9)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f3329c = i10;
    }
}
