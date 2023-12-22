package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;

public final class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public b f1199a;

    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0  reason: collision with root package name */
        public float f1200r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f1201s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f1202t0;
        public float u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f1203v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f1204w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f1205x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f1206y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f1207z0;

        public a() {
            this.f1200r0 = 1.0f;
            this.f1201s0 = false;
            this.f1202t0 = 0.0f;
            this.u0 = 0.0f;
            this.f1203v0 = 0.0f;
            this.f1204w0 = 0.0f;
            this.f1205x0 = 1.0f;
            this.f1206y0 = 1.0f;
            this.f1207z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1200r0 = 1.0f;
            this.f1201s0 = false;
            this.f1202t0 = 0.0f;
            this.u0 = 0.0f;
            this.f1203v0 = 0.0f;
            this.f1204w0 = 0.0f;
            this.f1205x0 = 1.0f;
            this.f1206y0 = 1.0f;
            this.f1207z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.c.f13188m);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f1200r0 = obtainStyledAttributes.getFloat(index, this.f1200r0);
                } else if (index == 28) {
                    this.f1202t0 = obtainStyledAttributes.getFloat(index, this.f1202t0);
                    this.f1201s0 = true;
                } else if (index == 23) {
                    this.f1203v0 = obtainStyledAttributes.getFloat(index, this.f1203v0);
                } else if (index == 24) {
                    this.f1204w0 = obtainStyledAttributes.getFloat(index, this.f1204w0);
                } else if (index == 22) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 20) {
                    this.f1205x0 = obtainStyledAttributes.getFloat(index, this.f1205x0);
                } else if (index == 21) {
                    this.f1206y0 = obtainStyledAttributes.getFloat(index, this.f1206y0);
                } else if (index == 16) {
                    this.f1207z0 = obtainStyledAttributes.getFloat(index, this.f1207z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f1199a == null) {
            this.f1199a = new b();
        }
        b bVar = this.f1199a;
        bVar.getClass();
        int childCount = getChildCount();
        bVar.f1116c.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f1115b || id != -1) {
                if (!bVar.f1116c.containsKey(Integer.valueOf(id))) {
                    bVar.f1116c.put(Integer.valueOf(id), new b.a());
                }
                b.a aVar2 = bVar.f1116c.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof a) {
                        a aVar3 = (a) childAt;
                        aVar2.c(id, aVar);
                        if (aVar3 instanceof Barrier) {
                            b.C0009b bVar2 = aVar2.f1120d;
                            bVar2.f1149h0 = 1;
                            Barrier barrier = (Barrier) aVar3;
                            bVar2.f1145f0 = barrier.getType();
                            aVar2.f1120d.f1151i0 = barrier.getReferencedIds();
                            aVar2.f1120d.f1147g0 = barrier.getMargin();
                        }
                    }
                    aVar2.c(id, aVar);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1199a;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }
}
