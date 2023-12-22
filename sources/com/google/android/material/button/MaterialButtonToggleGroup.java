package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import com.imgdkh.app.R;
import h0.g;
import h0.l0;
import h0.y;
import i0.f;
import j5.s;
import j5.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import r5.i;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2991a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final e f2992b = new e();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<d> f2993c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final a f2994d = new a();

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f2995e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2996f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2997g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2998h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2999i;

    /* renamed from: j  reason: collision with root package name */
    public HashSet f3000j = new HashSet();

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends h0.a {
        public b() {
        }

        public final void d(View view, f fVar) {
            int i10;
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i11 = MaterialButtonToggleGroup.k;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    if (i12 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                            i10++;
                        }
                        i12++;
                    }
                }
                fVar.h(f.b.a(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
            }
            i10 = -1;
            fVar.h(f.b.a(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final r5.a f3003e = new r5.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public r5.c f3004a;

        /* renamed from: b  reason: collision with root package name */
        public r5.c f3005b;

        /* renamed from: c  reason: collision with root package name */
        public r5.c f3006c;

        /* renamed from: d  reason: collision with root package name */
        public r5.c f3007d;

        public c(r5.c cVar, r5.c cVar2, r5.c cVar3, r5.c cVar4) {
            this.f3004a = cVar;
            this.f3005b = cVar3;
            this.f3006c = cVar4;
            this.f3007d = cVar2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(x5.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018234), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d10 = s.d(getContext(), attributeSet, c.a.H, R.attr.materialButtonToggleGroupStyle, 2132018234, new int[0]);
        setSingleSelection(d10.getBoolean(3, false));
        this.f2999i = d10.getResourceId(1, -1);
        this.f2998h = d10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            materialButton.setId(y.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2992b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton c10 = c(i10);
                int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    g.g(layoutParams, 0);
                    g.h(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    g.h(layoutParams, 0);
                }
                c10.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                g.g(layoutParams3, 0);
                g.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2991a.add(new c(shapeAppearanceModel.f11707e, shapeAppearanceModel.f11710h, shapeAppearanceModel.f11708f, shapeAppearanceModel.f11709g));
        materialButton.setEnabled(isEnabled());
        y.n(materialButton, new b());
    }

    public final void b(int i10, boolean z9) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f3000j);
        if (z9 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f2997g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z9 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f2998h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2994d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f2995e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.f3000j;
        this.f3000j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2996f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2996f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f2993c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z9;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                i shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                c cVar2 = (c) this.f2991a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i10 == firstVisibleChildIndex) {
                        if (!z9) {
                            r5.c cVar3 = cVar2.f3004a;
                            r5.a aVar2 = c.f3003e;
                            cVar = new c(cVar3, aVar2, cVar2.f3005b, aVar2);
                        } else if (x.a(this)) {
                            r5.a aVar3 = c.f3003e;
                            cVar = new c(aVar3, aVar3, cVar2.f3005b, cVar2.f3006c);
                        } else {
                            r5.c cVar4 = cVar2.f3004a;
                            r5.c cVar5 = cVar2.f3007d;
                            r5.a aVar4 = c.f3003e;
                            cVar = new c(cVar4, cVar5, aVar4, aVar4);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z9) {
                        r5.a aVar5 = c.f3003e;
                        cVar = new c(aVar5, cVar2.f3007d, aVar5, cVar2.f3006c);
                    } else if (x.a(this)) {
                        r5.c cVar6 = cVar2.f3004a;
                        r5.c cVar7 = cVar2.f3007d;
                        r5.a aVar6 = c.f3003e;
                        cVar = new c(cVar6, cVar7, aVar6, aVar6);
                    } else {
                        r5.a aVar7 = c.f3003e;
                        cVar = new c(aVar7, aVar7, cVar2.f3005b, cVar2.f3006c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.e(0.0f);
                    aVar.f(0.0f);
                    aVar.d(0.0f);
                    aVar.c(0.0f);
                } else {
                    aVar.f11718e = cVar2.f3004a;
                    aVar.f11721h = cVar2.f3007d;
                    aVar.f11719f = cVar2.f3005b;
                    aVar.f11720g = cVar2.f3006c;
                }
                c10.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2997g || this.f3000j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3000j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            if (this.f3000j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f2995e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f2999i;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f2997g) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i10);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = obtain;
        accessibilityNodeInfo.setCollectionInfo(obtain);
    }

    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2991a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z9);
        }
    }

    public void setSelectionRequired(boolean z9) {
        this.f2998h = z9;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z9) {
        Class cls;
        if (this.f2997g != z9) {
            this.f2997g = z9;
            e(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (this.f2997g) {
                cls = RadioButton.class;
            } else {
                cls = ToggleButton.class;
            }
            c(i10).setA11yClassName(cls.getName());
        }
    }
}
