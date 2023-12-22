package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.activity.f;
import h0.y;

public class s0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f938a;

    /* renamed from: b  reason: collision with root package name */
    public int f939b;

    /* renamed from: c  reason: collision with root package name */
    public int f940c;

    /* renamed from: d  reason: collision with root package name */
    public int f941d;

    /* renamed from: e  reason: collision with root package name */
    public int f942e;

    /* renamed from: f  reason: collision with root package name */
    public int f943f;

    /* renamed from: g  reason: collision with root package name */
    public float f944g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f945h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f946i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f947j;
    public Drawable k;

    /* renamed from: l  reason: collision with root package name */
    public int f948l;

    /* renamed from: m  reason: collision with root package name */
    public int f949m;

    /* renamed from: n  reason: collision with root package name */
    public int f950n;

    /* renamed from: o  reason: collision with root package name */
    public int f951o;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public s0(Context context) {
        this(context, (AttributeSet) null);
    }

    public s0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f938a = true;
        this.f939b = -1;
        this.f940c = 0;
        this.f942e = 8388659;
        int[] iArr = y3.a.f13037s;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        y.m(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z9 = obtainStyledAttributes.getBoolean(2, true);
        if (!z9) {
            setBaselineAligned(z9);
        }
        this.f944g = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f939b = obtainStyledAttributes.getInt(3, -1);
        this.f945h = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = e.a.a(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.f950n = obtainStyledAttributes.getInt(8, 0);
        this.f951o = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i10) {
        this.k.setBounds(getPaddingLeft() + this.f951o, i10, (getWidth() - getPaddingRight()) - this.f951o, this.f949m + i10);
        this.k.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.k.setBounds(i10, getPaddingTop() + this.f951o, this.f948l + i10, (getHeight() - getPaddingBottom()) - this.f951o);
        this.k.draw(canvas);
    }

    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i10 = this.f941d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i10;
        if (this.f939b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f939b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i12 = this.f940c;
                if (this.f941d == 1 && (i10 = this.f942e & 112) != 48) {
                    if (i10 == 16) {
                        i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f943f) / 2;
                    } else if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f943f;
                    }
                }
                return i12 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f939b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f939b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.f951o;
    }

    public int getDividerWidth() {
        return this.f948l;
    }

    public int getGravity() {
        return this.f942e;
    }

    public int getOrientation() {
        return this.f941d;
    }

    public int getShowDividers() {
        return this.f950n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f944g;
    }

    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.f950n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f950n & 4) != 0;
        }
        if ((this.f950n & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.k != null) {
            int i15 = 0;
            if (this.f941d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i15 < virtualChildCount) {
                    View childAt = getChildAt(i15);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i15))) {
                        d(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f949m);
                    }
                    i15++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i14 = (getHeight() - getPaddingBottom()) - this.f949m;
                    } else {
                        i14 = childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin;
                    }
                    d(canvas, i14);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a10 = r1.a(this);
            while (i15 < virtualChildCount2) {
                View childAt3 = getChildAt(i15);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i15))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (a10) {
                        i13 = childAt3.getRight() + aVar.rightMargin;
                    } else {
                        i13 = (childAt3.getLeft() - aVar.leftMargin) - this.f948l;
                    }
                    e(canvas, i13);
                }
                i15++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a10) {
                        i12 = childAt4.getLeft();
                        i11 = aVar2.leftMargin;
                    } else {
                        i10 = childAt4.getRight() + aVar2.rightMargin;
                        e(canvas, i10);
                    }
                } else if (a10) {
                    i10 = getPaddingLeft();
                    e(canvas, i10);
                } else {
                    i12 = getWidth();
                    i11 = getPaddingRight();
                }
                i10 = (i12 - i11) - this.f948l;
                e(canvas, i10);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f941d
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00b9
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f942e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f943f
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f943f
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d1
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b3
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b3
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.s0$a r4 = (androidx.appcompat.widget.s0.a) r4
            int r9 = r4.gravity
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, h0.l0> r17 = h0.y.f6776a
            int r7 = h0.y.e.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x008b
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0096
        L_0x0088:
            int r7 = r11 - r14
            goto L_0x0093
        L_0x008b:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
        L_0x0093:
            int r9 = r4.rightMargin
            int r7 = r7 - r9
        L_0x0096:
            boolean r9 = r0.i(r3)
            if (r9 == 0) goto L_0x009f
            int r9 = r0.f949m
            int r2 = r2 + r9
        L_0x009f:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b3:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00b9:
            boolean r1 = androidx.appcompat.widget.r1.a(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r25.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r25.getVirtualChildCount()
            int r10 = r0.f942e
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f938a
            int[] r12 = r0.f946i
            int[] r13 = r0.f947j
            java.util.WeakHashMap<android.view.View, h0.l0> r14 = h0.y.f6776a
            int r14 = h0.y.e.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x00fe
            r14 = 5
            if (r6 == r14) goto L_0x00f2
            int r6 = r25.getPaddingLeft()
            goto L_0x010a
        L_0x00f2:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f943f
            int r6 = r6 - r14
            goto L_0x010a
        L_0x00fe:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f943f
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010a:
            if (r1 == 0) goto L_0x0110
            int r1 = r9 + -1
            r15 = -1
            goto L_0x0112
        L_0x0110:
            r15 = r8
            r1 = 0
        L_0x0112:
            r18 = r6
            r6 = 0
        L_0x0115:
            if (r6 >= r9) goto L_0x01d1
            int r19 = r15 * r6
            int r8 = r19 + r1
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x012d
            int r18 = r18 + 0
        L_0x0123:
            r28 = r1
            r30 = r9
            r22 = r10
            r1 = 0
        L_0x012a:
            r2 = 1
            goto L_0x01c3
        L_0x012d:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0123
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.s0$a r14 = (androidx.appcompat.widget.s0.a) r14
            r28 = r1
            if (r11 == 0) goto L_0x0155
            int r1 = r14.height
            r30 = r9
            r9 = -1
            if (r1 == r9) goto L_0x0157
            int r9 = r2.getBaseline()
            goto L_0x0158
        L_0x0155:
            r30 = r9
        L_0x0157:
            r9 = -1
        L_0x0158:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x015d
            r1 = r10
        L_0x015d:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0195
            r10 = 48
            if (r1 == r10) goto L_0x0186
            r10 = 80
            if (r1 == r10) goto L_0x0170
            r1 = r4
            r10 = -1
            goto L_0x01a1
        L_0x0170:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x01a1
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r9
            r9 = 2
            r24 = r13[r9]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a1
        L_0x0186:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x01a1
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r9
            int r1 = r23 + r1
            goto L_0x01a1
        L_0x0195:
            r10 = -1
            int r1 = r5 - r21
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x01a1:
            boolean r8 = r0.i(r8)
            if (r8 == 0) goto L_0x01ab
            int r8 = r0.f948l
            int r18 = r18 + r8
        L_0x01ab:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r3 + r18
            int r6 = r6 + 0
            goto L_0x012a
        L_0x01c3:
            int r6 = r6 + r2
            r1 = r28
            r9 = r30
            r8 = r2
            r10 = r22
            r2 = 80
            r3 = 16
            goto L_0x0115
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a8, code lost:
        if (r14 < 0) goto L_0x02aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07cf  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0870  */
    /* JADX WARNING: Removed duplicated region for block: B:418:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.f941d
            r10 = -2
            r12 = 8
            r14 = 1
            r15 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r0 != r14) goto L_0x0383
            r6.f943f = r4
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f939b
            boolean r9 = r6.f945h
            r13 = r4
            r19 = r13
            r20 = r19
            r21 = r20
            r22 = r21
            r24 = r22
            r25 = r24
            r18 = r14
            r23 = r15
            r14 = r25
        L_0x0037:
            if (r14 >= r3) goto L_0x0167
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x0045
            int r11 = r6.f943f
            int r11 = r11 + r4
            r6.f943f = r11
            goto L_0x004d
        L_0x0045:
            int r11 = r26.getVisibility()
            if (r11 != r12) goto L_0x0056
            int r14 = r14 + 0
        L_0x004d:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
        L_0x0053:
            r1 = 1
            goto L_0x0157
        L_0x0056:
            boolean r11 = r6.i(r14)
            if (r11 == 0) goto L_0x0063
            int r11 = r6.f943f
            int r4 = r6.f949m
            int r11 = r11 + r4
            r6.f943f = r11
        L_0x0063:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r11 = r4
            androidx.appcompat.widget.s0$a r11 = (androidx.appcompat.widget.s0.a) r11
            float r4 = r11.weight
            float r23 = r23 + r4
            if (r1 != r5) goto L_0x0091
            int r5 = r11.height
            if (r5 != 0) goto L_0x0091
            int r5 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0091
            int r4 = r6.f943f
            int r5 = r11.topMargin
            int r5 = r5 + r4
            int r12 = r11.bottomMargin
            int r5 = r5 + r12
            int r4 = java.lang.Math.max(r4, r5)
            r6.f943f = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = 0
            r24 = 1
            goto L_0x00dd
        L_0x0091:
            int r5 = r11.height
            if (r5 != 0) goto L_0x009d
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x009d
            r11.height = r10
            r12 = 0
            goto L_0x009f
        L_0x009d:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x009f:
            r4 = 0
            int r5 = (r23 > r15 ? 1 : (r23 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x00a7
            int r5 = r6.f943f
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            r10 = r0
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r15 = 0
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r0) goto L_0x00c2
            r11.height = r12
        L_0x00c2:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f943f
            int r2 = r1 + r0
            int r3 = r11.topMargin
            int r2 = r2 + r3
            int r3 = r11.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + r15
            int r1 = java.lang.Math.max(r1, r2)
            r6.f943f = r1
            if (r9 == 0) goto L_0x00dd
            int r13 = java.lang.Math.max(r0, r13)
        L_0x00dd:
            if (r10 < 0) goto L_0x00e7
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00e7
            int r0 = r6.f943f
            r6.f940c = r0
        L_0x00e7:
            if (r14 >= r10) goto L_0x00f9
            float r0 = r11.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f1
            goto L_0x00f9
        L_0x00f1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            r0 = r30
            r12 = 1073741824(0x40000000, float:2.0)
            if (r0 == r12) goto L_0x0108
            int r1 = r11.width
            r2 = -1
            if (r1 != r2) goto L_0x0108
            r4 = 1
            r25 = 1
            goto L_0x0109
        L_0x0108:
            r4 = r15
        L_0x0109:
            int r1 = r11.leftMargin
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r1
            r3 = r22
            int r3 = java.lang.Math.max(r3, r2)
            int r5 = r26.getMeasuredState()
            r12 = r21
            int r5 = android.view.View.combineMeasuredStates(r12, r5)
            if (r18 == 0) goto L_0x012c
            int r12 = r11.width
            r15 = -1
            if (r12 != r15) goto L_0x012c
            r12 = 1
            goto L_0x012d
        L_0x012c:
            r12 = 0
        L_0x012d:
            float r11 = r11.weight
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x013f
            if (r4 == 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r1 = r2
        L_0x0138:
            r11 = r20
            int r20 = java.lang.Math.max(r11, r1)
            goto L_0x014d
        L_0x013f:
            r11 = r20
            if (r4 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r1 = r2
        L_0x0145:
            r4 = r19
            int r19 = java.lang.Math.max(r4, r1)
            r20 = r11
        L_0x014d:
            int r14 = r14 + 0
            r22 = r3
            r21 = r5
            r18 = r12
            goto L_0x0053
        L_0x0157:
            int r14 = r14 + r1
            r2 = r0
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r10 = -2
            r12 = 8
            r15 = 0
            goto L_0x0037
        L_0x0167:
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r19
            r11 = r20
            r12 = r21
            r3 = r22
            int r1 = r6.f943f
            r10 = r31
            if (r1 <= 0) goto L_0x0187
            boolean r1 = r6.i(r10)
            if (r1 == 0) goto L_0x0187
            int r1 = r6.f943f
            int r2 = r6.f949m
            int r1 = r1 + r2
            r6.f943f = r1
        L_0x0187:
            if (r9 == 0) goto L_0x01d4
            r1 = r29
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0195
            if (r1 != 0) goto L_0x0192
            goto L_0x0195
        L_0x0192:
            r19 = r3
            goto L_0x01d8
        L_0x0195:
            r2 = 0
            r6.f943f = r2
            r5 = r2
        L_0x0199:
            if (r5 >= r10) goto L_0x0192
            android.view.View r14 = r6.getChildAt(r5)
            if (r14 != 0) goto L_0x01a7
            int r14 = r6.f943f
            int r14 = r14 + r2
            r6.f943f = r14
            goto L_0x01b1
        L_0x01a7:
            int r2 = r14.getVisibility()
            r15 = 8
            if (r2 != r15) goto L_0x01b4
            int r5 = r5 + 0
        L_0x01b1:
            r19 = r3
            goto L_0x01ce
        L_0x01b4:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            androidx.appcompat.widget.s0$a r2 = (androidx.appcompat.widget.s0.a) r2
            int r14 = r6.f943f
            int r15 = r14 + r13
            r19 = r3
            int r3 = r2.topMargin
            int r15 = r15 + r3
            int r2 = r2.bottomMargin
            int r15 = r15 + r2
            r2 = 0
            int r15 = r15 + r2
            int r2 = java.lang.Math.max(r14, r15)
            r6.f943f = r2
        L_0x01ce:
            r2 = 1
            int r5 = r5 + r2
            r3 = r19
            r2 = 0
            goto L_0x0199
        L_0x01d4:
            r19 = r3
            r1 = r29
        L_0x01d8:
            int r2 = r6.f943f
            int r3 = r37.getPaddingTop()
            int r5 = r37.getPaddingBottom()
            int r5 = r5 + r3
            int r5 = r5 + r2
            r6.f943f = r5
            int r2 = r37.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r5, r2)
            r3 = 0
            int r2 = android.view.View.resolveSizeAndState(r2, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r2
            int r5 = r6.f943f
            int r3 = r3 - r5
            if (r24 != 0) goto L_0x0245
            if (r3 == 0) goto L_0x0204
            r5 = 0
            int r14 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0204
            goto L_0x0245
        L_0x0204:
            int r3 = java.lang.Math.max(r4, r11)
            if (r9 == 0) goto L_0x0241
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 == r4) goto L_0x0241
            r4 = 0
        L_0x020f:
            if (r4 >= r10) goto L_0x0241
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x023e
            int r5 = r1.getVisibility()
            r9 = 8
            if (r5 != r9) goto L_0x0220
            goto L_0x023e
        L_0x0220:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.appcompat.widget.s0$a r5 = (androidx.appcompat.widget.s0.a) r5
            float r5 = r5.weight
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x023e
            int r5 = r1.getMeasuredWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            r1.measure(r5, r11)
        L_0x023e:
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0241:
            r22 = r19
            goto L_0x0323
        L_0x0245:
            float r5 = r6.f944g
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x024e
            r23 = r5
        L_0x024e:
            r5 = 0
            r6.f943f = r5
            r5 = r4
            r9 = r19
            r4 = 0
        L_0x0255:
            if (r4 >= r10) goto L_0x0312
            android.view.View r11 = r6.getChildAt(r4)
            int r13 = r11.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0267
            r29 = r1
            goto L_0x030c
        L_0x0267:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.appcompat.widget.s0$a r13 = (androidx.appcompat.widget.s0.a) r13
            float r14 = r13.weight
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c0
            float r15 = (float) r3
            float r15 = r15 * r14
            float r15 = r15 / r23
            int r15 = (int) r15
            float r23 = r23 - r14
            int r3 = r3 - r15
            int r14 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r14
            int r14 = r13.leftMargin
            int r16 = r16 + r14
            int r14 = r13.rightMargin
            int r14 = r16 + r14
            r16 = r3
            int r3 = r13.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r7, r14, r3)
            int r14 = r13.height
            if (r14 != 0) goto L_0x02a3
            r14 = 1073741824(0x40000000, float:2.0)
            if (r1 == r14) goto L_0x029f
            goto L_0x02a3
        L_0x029f:
            if (r15 <= 0) goto L_0x02aa
            r14 = r15
            goto L_0x02ab
        L_0x02a3:
            int r14 = r11.getMeasuredHeight()
            int r14 = r14 + r15
            if (r14 >= 0) goto L_0x02ab
        L_0x02aa:
            r14 = 0
        L_0x02ab:
            r15 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r15)
            r11.measure(r3, r14)
            int r3 = r11.getMeasuredState()
            r3 = r3 & -256(0xffffffffffffff00, float:NaN)
            int r12 = android.view.View.combineMeasuredStates(r12, r3)
            r3 = r16
        L_0x02c0:
            int r14 = r13.leftMargin
            int r15 = r13.rightMargin
            int r14 = r14 + r15
            int r15 = r11.getMeasuredWidth()
            int r15 = r15 + r14
            int r9 = java.lang.Math.max(r9, r15)
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x02dd
            int r1 = r13.width
            r16 = r3
            r3 = -1
            if (r1 != r3) goto L_0x02e0
            r1 = 1
            goto L_0x02e1
        L_0x02dd:
            r16 = r3
            r3 = -1
        L_0x02e0:
            r1 = 0
        L_0x02e1:
            if (r1 == 0) goto L_0x02e4
            goto L_0x02e5
        L_0x02e4:
            r14 = r15
        L_0x02e5:
            int r1 = java.lang.Math.max(r5, r14)
            if (r18 == 0) goto L_0x02f1
            int r5 = r13.width
            if (r5 != r3) goto L_0x02f1
            r3 = 1
            goto L_0x02f2
        L_0x02f1:
            r3 = 0
        L_0x02f2:
            int r5 = r6.f943f
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r5
            int r14 = r13.topMargin
            int r11 = r11 + r14
            int r13 = r13.bottomMargin
            int r11 = r11 + r13
            r13 = 0
            int r11 = r11 + r13
            int r5 = java.lang.Math.max(r5, r11)
            r6.f943f = r5
            r5 = r1
            r18 = r3
            r3 = r16
        L_0x030c:
            int r4 = r4 + 1
            r1 = r29
            goto L_0x0255
        L_0x0312:
            int r1 = r6.f943f
            int r3 = r37.getPaddingTop()
            int r4 = r37.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r1
            r6.f943f = r4
            r3 = r5
            r22 = r9
        L_0x0323:
            if (r18 != 0) goto L_0x032a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x032a
            goto L_0x032c
        L_0x032a:
            r3 = r22
        L_0x032c:
            int r0 = r37.getPaddingLeft()
            int r1 = r37.getPaddingRight()
            int r1 = r1 + r0
            int r1 = r1 + r3
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r12)
            r6.setMeasuredDimension(r0, r2)
            if (r25 == 0) goto L_0x08ad
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0352:
            if (r9 >= r10) goto L_0x08ad
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0380
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.s0$a r11 = (androidx.appcompat.widget.s0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0380
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0380:
            int r9 = r9 + 1
            goto L_0x0352
        L_0x0383:
            r0 = r4
            r6.f943f = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f946i
            r12 = 4
            if (r0 == 0) goto L_0x039b
            int[] r0 = r6.f947j
            if (r0 != 0) goto L_0x03a3
        L_0x039b:
            int[] r0 = new int[r12]
            r6.f946i = r0
            int[] r0 = new int[r12]
            r6.f947j = r0
        L_0x03a3:
            int[] r13 = r6.f946i
            int[] r14 = r6.f947j
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r18 = 2
            r13[r18] = r0
            r1 = 1
            r13[r1] = r0
            r2 = 0
            r13[r2] = r0
            r14[r15] = r0
            r14[r18] = r0
            r14[r1] = r0
            r14[r2] = r0
            boolean r5 = r6.f938a
            boolean r4 = r6.f945h
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03c8
            r19 = 1
            goto L_0x03ca
        L_0x03c8:
            r19 = 0
        L_0x03ca:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r12 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r24 = 1
            r32 = 0
        L_0x03d8:
            if (r3 >= r9) goto L_0x0577
            android.view.View r8 = r6.getChildAt(r3)
            if (r8 != 0) goto L_0x03ed
            int r8 = r6.f943f
            r25 = 0
            int r8 = r8 + 0
            r6.f943f = r8
            r25 = r0
            r26 = r2
            goto L_0x03fb
        L_0x03ed:
            r25 = r0
            int r0 = r8.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x0406
            int r3 = r3 + 0
        L_0x03fb:
            r29 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            r4 = 1
            goto L_0x056e
        L_0x0406:
            boolean r0 = r6.i(r3)
            if (r0 == 0) goto L_0x0413
            int r0 = r6.f943f
            int r2 = r6.f948l
            int r0 = r0 + r2
            r6.f943f = r0
        L_0x0413:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.s0$a r2 = (androidx.appcompat.widget.s0.a) r2
            float r0 = r2.weight
            float r28 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0472
            int r1 = r2.width
            if (r1 != 0) goto L_0x0472
            r1 = 0
            int r29 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r29 <= 0) goto L_0x0472
            if (r19 == 0) goto L_0x043a
            int r0 = r6.f943f
            int r1 = r2.leftMargin
            r29 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f943f = r1
            goto L_0x044a
        L_0x043a:
            r29 = r3
            int r0 = r6.f943f
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f943f = r0
        L_0x044a:
            if (r5 == 0) goto L_0x0461
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r29
            r26 = r4
            r29 = r5
            goto L_0x04e9
        L_0x0461:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r29
            r0 = 1073741824(0x40000000, float:2.0)
            r21 = 1
            r26 = r4
            r29 = r5
            goto L_0x04eb
        L_0x0472:
            r29 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x0482
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0483
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x0485
        L_0x0482:
            r1 = 0
        L_0x0483:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0485:
            int r0 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x048e
            int r0 = r6.f943f
            r30 = r0
            goto L_0x0490
        L_0x048e:
            r30 = 0
        L_0x0490:
            r31 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r8
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r29
            r3 = r30
            r26 = r4
            r4 = r39
            r29 = r5
            r5 = r31
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04bb
            r1 = r35
            r1.width = r0
            goto L_0x04bd
        L_0x04bb:
            r1 = r35
        L_0x04bd:
            int r0 = r8.getMeasuredWidth()
            if (r19 == 0) goto L_0x04d1
            int r2 = r6.f943f
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f943f = r3
            goto L_0x04e3
        L_0x04d1:
            r4 = 0
            int r2 = r6.f943f
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f943f = r2
        L_0x04e3:
            if (r26 == 0) goto L_0x04e9
            int r12 = java.lang.Math.max(r0, r12)
        L_0x04e9:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04eb:
            if (r11 == r0) goto L_0x04f6
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x04f6
            r4 = 1
            r22 = 1
            goto L_0x04f7
        L_0x04f6:
            r4 = 0
        L_0x04f7:
            int r0 = r1.topMargin
            int r2 = r1.bottomMargin
            int r0 = r0 + r2
            int r2 = r8.getMeasuredHeight()
            int r2 = r2 + r0
            int r3 = r8.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r15, r3)
            if (r29 == 0) goto L_0x0532
            int r5 = r8.getBaseline()
            r8 = -1
            if (r5 == r8) goto L_0x0532
            int r8 = r1.gravity
            if (r8 >= 0) goto L_0x0518
            int r8 = r6.f942e
        L_0x0518:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r15 = 4
            int r8 = r8 >> r15
            r15 = -2
            r8 = r8 & r15
            r15 = 1
            int r8 = r8 >> r15
            r15 = r13[r8]
            int r15 = java.lang.Math.max(r15, r5)
            r13[r8] = r15
            r15 = r14[r8]
            int r5 = r2 - r5
            int r5 = java.lang.Math.max(r15, r5)
            r14[r8] = r5
        L_0x0532:
            r5 = r34
            int r5 = java.lang.Math.max(r5, r2)
            if (r24 == 0) goto L_0x0541
            int r8 = r1.height
            r15 = -1
            if (r8 != r15) goto L_0x0541
            r8 = 1
            goto L_0x0542
        L_0x0541:
            r8 = 0
        L_0x0542:
            float r1 = r1.weight
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0556
            if (r4 == 0) goto L_0x054c
            goto L_0x054d
        L_0x054c:
            r0 = r2
        L_0x054d:
            r1 = r32
            int r32 = java.lang.Math.max(r1, r0)
            r0 = r33
            goto L_0x0564
        L_0x0556:
            r1 = r32
            if (r4 == 0) goto L_0x055b
            goto L_0x055c
        L_0x055b:
            r0 = r2
        L_0x055c:
            r2 = r33
            int r0 = java.lang.Math.max(r2, r0)
            r32 = r1
        L_0x0564:
            int r1 = r25 + 0
            r15 = r3
            r2 = r5
            r24 = r8
            r4 = 1
            r3 = r1
            r1 = r28
        L_0x056e:
            int r3 = r3 + r4
            r8 = r39
            r4 = r26
            r5 = r29
            goto L_0x03d8
        L_0x0577:
            r26 = r4
            r29 = r5
            r5 = r2
            r2 = r0
            r0 = r32
            int r3 = r6.f943f
            if (r3 <= 0) goto L_0x0590
            boolean r3 = r6.i(r9)
            if (r3 == 0) goto L_0x0590
            int r3 = r6.f943f
            int r4 = r6.f948l
            int r3 = r3 + r4
            r6.f943f = r3
        L_0x0590:
            r3 = 1
            r4 = r13[r3]
            r3 = -1
            r25 = r15
            if (r4 != r3) goto L_0x05ab
            r8 = 0
            r15 = r13[r8]
            if (r15 != r3) goto L_0x05ab
            r8 = r13[r18]
            if (r8 != r3) goto L_0x05ab
            r8 = 3
            r15 = r13[r8]
            if (r15 == r3) goto L_0x05a7
            goto L_0x05ac
        L_0x05a7:
            r3 = r5
            r28 = r11
            goto L_0x05dd
        L_0x05ab:
            r8 = 3
        L_0x05ac:
            r3 = r13[r8]
            r15 = 0
            r8 = r13[r15]
            r15 = r13[r18]
            int r4 = java.lang.Math.max(r4, r15)
            int r4 = java.lang.Math.max(r8, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 3
            r8 = r14[r4]
            r4 = 0
            r15 = r14[r4]
            r28 = r11
            r4 = 1
            r11 = r14[r4]
            r4 = r14[r18]
            int r4 = java.lang.Math.max(r11, r4)
            int r4 = java.lang.Math.max(r15, r4)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = r4 + r3
            int r3 = java.lang.Math.max(r5, r4)
        L_0x05dd:
            if (r26 == 0) goto L_0x062f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r4) goto L_0x05e5
            if (r10 != 0) goto L_0x062f
        L_0x05e5:
            r4 = 0
            r6.f943f = r4
            r5 = r4
        L_0x05e9:
            if (r5 >= r9) goto L_0x062f
            android.view.View r8 = r6.getChildAt(r5)
            if (r8 != 0) goto L_0x05f7
            int r8 = r6.f943f
            int r8 = r8 + r4
            r6.f943f = r8
            goto L_0x062b
        L_0x05f7:
            int r4 = r8.getVisibility()
            r11 = 8
            if (r4 != r11) goto L_0x0602
            int r5 = r5 + 0
            goto L_0x062b
        L_0x0602:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            androidx.appcompat.widget.s0$a r4 = (androidx.appcompat.widget.s0.a) r4
            if (r19 == 0) goto L_0x0618
            int r8 = r6.f943f
            int r11 = r4.leftMargin
            int r11 = r11 + r12
            int r4 = r4.rightMargin
            int r11 = r11 + r4
            r15 = 0
            int r11 = r11 + r15
            int r11 = r11 + r8
            r6.f943f = r11
            goto L_0x062b
        L_0x0618:
            r15 = 0
            int r8 = r6.f943f
            int r11 = r8 + r12
            int r15 = r4.leftMargin
            int r11 = r11 + r15
            int r4 = r4.rightMargin
            int r11 = r11 + r4
            r4 = 0
            int r11 = r11 + r4
            int r4 = java.lang.Math.max(r8, r11)
            r6.f943f = r4
        L_0x062b:
            r4 = 1
            int r5 = r5 + r4
            r4 = 0
            goto L_0x05e9
        L_0x062f:
            int r4 = r6.f943f
            int r5 = r37.getPaddingLeft()
            int r8 = r37.getPaddingRight()
            int r8 = r8 + r5
            int r8 = r8 + r4
            r6.f943f = r8
            int r4 = r37.getSuggestedMinimumWidth()
            int r4 = java.lang.Math.max(r8, r4)
            r5 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r7, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            int r8 = r6.f943f
            int r5 = r5 - r8
            if (r21 != 0) goto L_0x06a1
            if (r5 == 0) goto L_0x065b
            r11 = 0
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x065b
            goto L_0x06a1
        L_0x065b:
            int r0 = java.lang.Math.max(r2, r0)
            if (r26 == 0) goto L_0x0698
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x0698
            r1 = 0
        L_0x0666:
            if (r1 >= r9) goto L_0x0698
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 == 0) goto L_0x0695
            int r5 = r2.getVisibility()
            r10 = 8
            if (r5 != r10) goto L_0x0677
            goto L_0x0695
        L_0x0677:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            androidx.appcompat.widget.s0$a r5 = (androidx.appcompat.widget.s0.a) r5
            float r5 = r5.weight
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0695
            r5 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            int r11 = r2.getMeasuredHeight()
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            r2.measure(r10, r11)
        L_0x0695:
            int r1 = r1 + 1
            goto L_0x0666
        L_0x0698:
            r5 = r39
            r15 = r25
            r12 = r28
        L_0x069e:
            r8 = 0
            goto L_0x0847
        L_0x06a1:
            float r0 = r6.f944g
            r3 = 0
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x06a9
            r1 = r0
        L_0x06a9:
            r0 = 3
            r3 = -1
            r13[r0] = r3
            r13[r18] = r3
            r11 = 1
            r13[r11] = r3
            r12 = 0
            r13[r12] = r3
            r14[r0] = r3
            r14[r18] = r3
            r14[r11] = r3
            r14[r12] = r3
            r6.f943f = r12
            r0 = r2
            r15 = r25
            r2 = -1
            r3 = 0
        L_0x06c4:
            if (r3 >= r9) goto L_0x07ee
            android.view.View r11 = r6.getChildAt(r3)
            if (r11 == 0) goto L_0x07d8
            int r12 = r11.getVisibility()
            r8 = 8
            if (r12 != r8) goto L_0x06d6
            goto L_0x07d8
        L_0x06d6:
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            androidx.appcompat.widget.s0$a r8 = (androidx.appcompat.widget.s0.a) r8
            float r12 = r8.weight
            r21 = 0
            int r25 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r25 <= 0) goto L_0x0735
            float r7 = (float) r5
            float r7 = r7 * r12
            float r7 = r7 / r1
            int r7 = (int) r7
            float r1 = r1 - r12
            int r5 = r5 - r7
            int r12 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r12
            int r12 = r8.topMargin
            int r25 = r25 + r12
            int r12 = r8.bottomMargin
            int r12 = r25 + r12
            r25 = r1
            int r1 = r8.height
            r26 = r5
            r5 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r1)
            int r12 = r8.width
            if (r12 != 0) goto L_0x0714
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x0711
            goto L_0x0714
        L_0x0711:
            if (r7 <= 0) goto L_0x071b
            goto L_0x071c
        L_0x0714:
            int r12 = r11.getMeasuredWidth()
            int r7 = r7 + r12
            if (r7 >= 0) goto L_0x071c
        L_0x071b:
            r7 = 0
        L_0x071c:
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
            int r1 = r11.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r15 = android.view.View.combineMeasuredStates(r15, r1)
            r1 = r25
            r7 = r26
            goto L_0x0738
        L_0x0735:
            r7 = r5
            r5 = r39
        L_0x0738:
            if (r19 == 0) goto L_0x0754
            int r12 = r6.f943f
            int r25 = r11.getMeasuredWidth()
            r26 = r1
            int r1 = r8.leftMargin
            int r25 = r25 + r1
            int r1 = r8.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r12 = r25 + r12
            r6.f943f = r12
            r27 = r7
            goto L_0x0772
        L_0x0754:
            r26 = r1
            r1 = 0
            int r12 = r6.f943f
            int r25 = r11.getMeasuredWidth()
            int r25 = r25 + r12
            int r1 = r8.leftMargin
            int r25 = r25 + r1
            int r1 = r8.rightMargin
            int r25 = r25 + r1
            r27 = r7
            r1 = 0
            int r7 = r25 + 0
            int r1 = java.lang.Math.max(r12, r7)
            r6.f943f = r1
        L_0x0772:
            r12 = r28
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x077f
            int r1 = r8.height
            r7 = -1
            if (r1 != r7) goto L_0x077f
            r1 = 1
            goto L_0x0780
        L_0x077f:
            r1 = 0
        L_0x0780:
            int r7 = r8.topMargin
            r25 = r10
            int r10 = r8.bottomMargin
            int r7 = r7 + r10
            int r10 = r11.getMeasuredHeight()
            int r10 = r10 + r7
            int r2 = java.lang.Math.max(r2, r10)
            if (r1 == 0) goto L_0x0793
            goto L_0x0794
        L_0x0793:
            r7 = r10
        L_0x0794:
            int r0 = java.lang.Math.max(r0, r7)
            if (r24 == 0) goto L_0x07a1
            int r1 = r8.height
            r7 = -1
            if (r1 != r7) goto L_0x07a2
            r1 = 1
            goto L_0x07a3
        L_0x07a1:
            r7 = -1
        L_0x07a2:
            r1 = 0
        L_0x07a3:
            if (r29 == 0) goto L_0x07cf
            int r11 = r11.getBaseline()
            if (r11 == r7) goto L_0x07cf
            int r7 = r8.gravity
            if (r7 >= 0) goto L_0x07b1
            int r7 = r6.f942e
        L_0x07b1:
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r7 = r7 >> r8
            r23 = -2
            r7 = r7 & -2
            r17 = 1
            int r7 = r7 >> 1
            r8 = r13[r7]
            int r8 = java.lang.Math.max(r8, r11)
            r13[r7] = r8
            r8 = r14[r7]
            int r10 = r10 - r11
            int r8 = java.lang.Math.max(r8, r10)
            r14[r7] = r8
            goto L_0x07d1
        L_0x07cf:
            r23 = -2
        L_0x07d1:
            r24 = r1
            r1 = r26
            r7 = r27
            goto L_0x07e3
        L_0x07d8:
            r7 = r5
            r25 = r10
            r12 = r28
            r21 = 0
            r23 = -2
            r5 = r39
        L_0x07e3:
            int r3 = r3 + 1
            r5 = r7
            r28 = r12
            r10 = r25
            r7 = r38
            goto L_0x06c4
        L_0x07ee:
            r5 = r39
            r12 = r28
            int r1 = r6.f943f
            int r3 = r37.getPaddingLeft()
            int r7 = r37.getPaddingRight()
            int r7 = r7 + r3
            int r7 = r7 + r1
            r6.f943f = r7
            r1 = 1
            r3 = r13[r1]
            r1 = -1
            if (r3 != r1) goto L_0x0818
            r7 = 0
            r8 = r13[r7]
            if (r8 != r1) goto L_0x0818
            r7 = r13[r18]
            if (r7 != r1) goto L_0x0818
            r7 = 3
            r8 = r13[r7]
            if (r8 == r1) goto L_0x0815
            goto L_0x0819
        L_0x0815:
            r3 = r2
            goto L_0x069e
        L_0x0818:
            r7 = 3
        L_0x0819:
            r1 = r13[r7]
            r8 = 0
            r10 = r13[r8]
            r11 = r13[r18]
            int r3 = java.lang.Math.max(r3, r11)
            int r3 = java.lang.Math.max(r10, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r14[r7]
            r7 = r14[r8]
            r10 = 1
            r10 = r14[r10]
            r11 = r14[r18]
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = java.lang.Math.max(r7, r10)
            int r3 = java.lang.Math.max(r3, r7)
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r2, r3)
            r3 = r1
        L_0x0847:
            if (r24 != 0) goto L_0x084e
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x084e
            goto L_0x084f
        L_0x084e:
            r0 = r3
        L_0x084f:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r15
            r1 = r1 | r4
            int r2 = r15 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r22 == 0) goto L_0x08ad
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x087a:
            if (r8 >= r9) goto L_0x08ad
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08a9
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.s0$a r11 = (androidx.appcompat.widget.s0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08aa
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08aa
        L_0x08a9:
            r12 = -1
        L_0x08aa:
            int r8 = r8 + 1
            goto L_0x087a
        L_0x08ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z9) {
        this.f938a = z9;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 < 0 || i10 >= getChildCount()) {
            StringBuilder g10 = f.g("base aligned child index out of range (0, ");
            g10.append(getChildCount());
            g10.append(")");
            throw new IllegalArgumentException(g10.toString());
        }
        this.f939b = i10;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.k) {
            this.k = drawable;
            boolean z9 = false;
            if (drawable != null) {
                this.f948l = drawable.getIntrinsicWidth();
                this.f949m = drawable.getIntrinsicHeight();
            } else {
                this.f948l = 0;
                this.f949m = 0;
            }
            if (drawable == null) {
                z9 = true;
            }
            setWillNotDraw(z9);
            requestLayout();
        }
    }

    public void setDividerPadding(int i10) {
        this.f951o = i10;
    }

    public void setGravity(int i10) {
        if (this.f942e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f942e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f942e;
        if ((8388615 & i12) != i11) {
            this.f942e = i11 | (-8388616 & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f945h = z9;
    }

    public void setOrientation(int i10) {
        if (this.f941d != i10) {
            this.f941d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f950n) {
            requestLayout();
        }
        this.f950n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f942e;
        if ((i12 & 112) != i11) {
            this.f942e = i11 | (i12 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f944g = Math.max(0.0f, f10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
