package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import q.i;
import t.d;
import z5.c;

public abstract class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1103a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    public int f1104b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1105c;

    /* renamed from: d  reason: collision with root package name */
    public i f1106d;

    /* renamed from: e  reason: collision with root package name */
    public String f1107e;

    /* renamed from: f  reason: collision with root package name */
    public String f1108f;

    /* renamed from: g  reason: collision with root package name */
    public View[] f1109g = null;

    /* renamed from: h  reason: collision with root package name */
    public HashMap<Integer, String> f1110h = new HashMap<>();

    public a(Context context) {
        super(context);
        this.f1105c = context;
        i((AttributeSet) null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1105c = context;
        i(attributeSet);
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        Integer num;
        HashMap<String, Integer> hashMap;
        if (str != null && str.length() != 0 && this.f1105c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getParent();
            }
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            int i10 = 0;
            if (isInEditMode() && constraintLayout != null) {
                if (!(trim instanceof String) || (hashMap = constraintLayout.f1052m) == null || !hashMap.containsKey(trim)) {
                    num = null;
                } else {
                    num = constraintLayout.f1052m.get(trim);
                }
                if (num instanceof Integer) {
                    i10 = num.intValue();
                }
            }
            if (i10 == 0 && constraintLayout != null) {
                i10 = h(constraintLayout, trim);
            }
            if (i10 == 0) {
                try {
                    i10 = d.class.getField(trim).getInt((Object) null);
                } catch (Exception unused) {
                }
            }
            if (i10 == 0) {
                i10 = this.f1105c.getResources().getIdentifier(trim, "id", this.f1105c.getPackageName());
            }
            if (i10 != 0) {
                this.f1110h.put(Integer.valueOf(i10), trim);
                d(i10);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void d(int i10) {
        if (i10 != getId()) {
            int i11 = this.f1104b + 1;
            int[] iArr = this.f1103a;
            if (i11 > iArr.length) {
                this.f1103a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1103a;
            int i12 = this.f1104b;
            iArr2[i12] = i10;
            this.f1104b = i12 + 1;
        }
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f1105c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        StringBuilder g10 = f.g("to use ConstraintTag view ");
                        g10.append(childAt.getClass().getSimpleName());
                        g10.append(" must have an ID");
                        Log.w("ConstraintHelper", g10.toString());
                    } else {
                        d(childAt.getId());
                    }
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1104b; i10++) {
            View view = constraintLayout.f1041a.get(this.f1103a[i10]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1103a, this.f1104b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1105c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1107e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1108f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(q.d dVar, boolean z9) {
    }

    public final void k() {
        if (this.f1106d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).f1086q0 = this.f1106d;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1107e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1108f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1107e = str;
        if (str != null) {
            int i10 = 0;
            this.f1104b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    c(str.substring(i10));
                    return;
                } else {
                    c(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1108f = str;
        if (str != null) {
            int i10 = 0;
            this.f1104b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    e(str.substring(i10));
                    return;
                } else {
                    e(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1107e = null;
        this.f1104b = 0;
        for (int d10 : iArr) {
            d(d10);
        }
    }

    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1107e == null) {
            d(i10);
        }
    }
}
