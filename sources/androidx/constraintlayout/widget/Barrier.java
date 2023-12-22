package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import q.a;
import z5.c;

public class Barrier extends a {

    /* renamed from: i  reason: collision with root package name */
    public int f1038i;

    /* renamed from: j  reason: collision with root package name */
    public int f1039j;
    public a k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.k.f10855v0;
    }

    public int getMargin() {
        return this.k.f10856w0;
    }

    public int getType() {
        return this.f1038i;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.k = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.k.f10855v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.k.f10856w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1106d = this.k;
        k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(q.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1038i
            r3.f1039j = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            if (r0 != r1) goto L_0x0018
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0014
        L_0x0010:
            r5 = 0
        L_0x0011:
            r3.f1039j = r5
            goto L_0x0018
        L_0x0014:
            if (r0 != r1) goto L_0x0018
        L_0x0016:
            r5 = 1
            goto L_0x0011
        L_0x0018:
            boolean r5 = r4 instanceof q.a
            if (r5 == 0) goto L_0x0022
            q.a r4 = (q.a) r4
            int r5 = r3.f1039j
            r4.u0 = r5
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(q.d, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.k.f10855v0 = z9;
    }

    public void setDpMargin(int i10) {
        this.k.f10856w0 = (int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.k.f10856w0 = i10;
    }

    public void setType(int i10) {
        this.f1038i = i10;
    }
}
