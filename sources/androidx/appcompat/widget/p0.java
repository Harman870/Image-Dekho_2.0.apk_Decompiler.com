package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.imgdkh.app.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l0.g;

public class p0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f892a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f893b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f894c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f895d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f896e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f897f;

    /* renamed from: g  reason: collision with root package name */
    public d f898g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f899h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f900i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f901j;
    public g k;

    /* renamed from: l  reason: collision with root package name */
    public f f902l;

    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static Method f903a;

        /* renamed from: b  reason: collision with root package name */
        public static Method f904b;

        /* renamed from: c  reason: collision with root package name */
        public static Method f905c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f906d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f903a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f904b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f905c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z9) {
            absListView.setSelectedChildViewEnabled(z9);
        }
    }

    public static class d extends f.a {

        /* renamed from: b  reason: collision with root package name */
        public boolean f907b = true;

        public d(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f907b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f10, float f11) {
            if (this.f907b) {
                super.setHotspot(f10, f11);
            }
        }

        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f907b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f907b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z9, boolean z10) {
            if (this.f907b) {
                return super.setVisible(z9, z10);
            }
            return false;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f908a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f908a = field;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            p0 p0Var = p0.this;
            p0Var.f902l = null;
            p0Var.drawableStateChanged();
        }
    }

    public p0(Context context, boolean z9) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f900i = z9;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z9) {
        d dVar = this.f898g;
        if (dVar != null) {
            dVar.f907b = z9;
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0017
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x001e
            r0 = r5
            goto L_0x0143
        L_0x0015:
            r0 = r5
            goto L_0x0018
        L_0x0017:
            r0 = r4
        L_0x0018:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0021
        L_0x001e:
            r0 = r4
            goto L_0x0143
        L_0x0021:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0035
            r4 = r5
            goto L_0x0143
        L_0x0035:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f901j = r5
            androidx.appcompat.widget.p0.a.a(r1, r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004f
            r1.setPressed(r5)
        L_0x004f:
            r16.layoutChildren()
            int r0 = r1.f897f
            if (r0 == r9) goto L_0x006c
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006c
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r4)
        L_0x006c:
            r1.f897f = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            androidx.appcompat.widget.p0.a.a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0088
            r10.setPressed(r5)
        L_0x0088:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0092
            if (r8 == r9) goto L_0x0092
            r12 = r5
            goto L_0x0093
        L_0x0092:
            r12 = r4
        L_0x0093:
            if (r12 == 0) goto L_0x0098
            r11.setVisible(r4, r4)
        L_0x0098:
            android.graphics.Rect r0 = r1.f892a
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            r0.set(r13, r14, r15, r4)
            int r4 = r0.left
            int r13 = r1.f893b
            int r4 = r4 - r13
            r0.left = r4
            int r4 = r0.top
            int r13 = r1.f894c
            int r4 = r4 - r13
            r0.top = r4
            int r4 = r0.right
            int r13 = r1.f895d
            int r4 = r4 + r13
            r0.right = r4
            int r4 = r0.bottom
            int r13 = r1.f896e
            int r4 = r4 + r13
            r0.bottom = r4
            boolean r0 = d0.a.a()
            if (r0 == 0) goto L_0x00d4
            boolean r0 = androidx.appcompat.widget.p0.c.a(r16)
            goto L_0x00e3
        L_0x00d4:
            java.lang.reflect.Field r0 = androidx.appcompat.widget.p0.e.f908a
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00dd }
            goto L_0x00e3
        L_0x00dd:
            r0 = move-exception
            r4 = r0
            r4.printStackTrace()
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            boolean r4 = r10.isEnabled()
            if (r4 == r0) goto L_0x0109
            r0 = r0 ^ r5
            boolean r4 = d0.a.a()
            if (r4 == 0) goto L_0x00f4
            androidx.appcompat.widget.p0.c.b(r1, r0)
            goto L_0x0104
        L_0x00f4:
            java.lang.reflect.Field r4 = androidx.appcompat.widget.p0.e.f908a
            if (r4 == 0) goto L_0x0104
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r4.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0104:
            if (r8 == r9) goto L_0x0109
            r16.refreshDrawableState()
        L_0x0109:
            if (r12 == 0) goto L_0x0126
            android.graphics.Rect r0 = r1.f892a
            float r4 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x011d
            r12 = r5
            goto L_0x011e
        L_0x011d:
            r12 = 0
        L_0x011e:
            r13 = 0
            r11.setVisible(r12, r13)
            b0.a.b.e(r11, r4, r0)
            goto L_0x0127
        L_0x0126:
            r13 = 0
        L_0x0127:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0132
            if (r8 == r9) goto L_0x0132
            b0.a.b.e(r0, r7, r6)
        L_0x0132:
            r1.setSelectorEnabled(r13)
            r16.refreshDrawableState()
            if (r3 != r5) goto L_0x0141
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0141:
            r0 = r5
            r4 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            if (r4 == 0) goto L_0x0160
        L_0x0147:
            r3 = 0
            r1.f901j = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r4 = r1.f897f
            int r6 = r16.getFirstVisiblePosition()
            int r4 = r4 - r6
            android.view.View r4 = r1.getChildAt(r4)
            if (r4 == 0) goto L_0x0160
            r4.setPressed(r3)
        L_0x0160:
            if (r0 == 0) goto L_0x0177
            l0.g r3 = r1.k
            if (r3 != 0) goto L_0x016d
            l0.g r3 = new l0.g
            r3.<init>(r1)
            r1.k = r3
        L_0x016d:
            l0.g r3 = r1.k
            boolean r4 = r3.f9189p
            r3.f9189p = r5
            r3.onTouch(r1, r2)
            goto L_0x0185
        L_0x0177:
            l0.g r2 = r1.k
            if (r2 == 0) goto L_0x0185
            boolean r3 = r2.f9189p
            if (r3 == 0) goto L_0x0182
            r2.d()
        L_0x0182:
            r3 = 0
            r2.f9189p = r3
        L_0x0185:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f892a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f892a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f902l == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.f901j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        return this.f900i || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f900i || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f900i || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f900i && this.f899h) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.f902l = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f902l == null) {
            f fVar = new f();
            this.f902l = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f906d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f903a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            b.f904b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            b.f905c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException | InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f901j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f897f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f902l;
        if (fVar != null) {
            p0 p0Var = p0.this;
            p0Var.f902l = null;
            p0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z9) {
        this.f899h = z9;
    }

    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f898g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f893b = rect.left;
        this.f894c = rect.top;
        this.f895d = rect.right;
        this.f896e = rect.bottom;
    }
}
