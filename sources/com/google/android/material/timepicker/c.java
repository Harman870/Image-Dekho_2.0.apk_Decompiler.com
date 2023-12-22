package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import c.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import r5.f;
import r5.g;
import r5.i;

public class c extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final m f3425q;

    /* renamed from: r  reason: collision with root package name */
    public int f3426r;

    /* renamed from: s  reason: collision with root package name */
    public f f3427s;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f fVar = new f();
        this.f3427s = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f11660a.f11681a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.f11718e = gVar;
        aVar.f11719f = gVar;
        aVar.f11720g = gVar;
        aVar.f11721h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.f3427s.k(ColorStateList.valueOf(-1));
        f fVar2 = this.f3427s;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.R, i10, 0);
        this.f3426r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3425q = new m(2, this);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            view.setId(y.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f3425q);
            handler.post(this.f3425q);
        }
    }

    public void k() {
        int i10;
        b bVar = new b();
        bVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(((float) this.f3426r) * 0.66f);
            } else {
                i10 = this.f3426r;
            }
            float f10 = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                if (!bVar.f1116c.containsKey(Integer.valueOf(id2))) {
                    bVar.f1116c.put(Integer.valueOf(id2), new b.a());
                }
                b.C0009b bVar2 = bVar.f1116c.get(Integer.valueOf(id2)).f1120d;
                bVar2.f1171z = R.id.circle_center;
                bVar2.A = i10;
                bVar2.B = f10;
                f10 += 360.0f / ((float) list.size());
            }
        }
        bVar.a(this);
        setConstraintSet((b) null);
        requestLayout();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f3425q);
            handler.post(this.f3425q);
        }
    }

    public final void setBackgroundColor(int i10) {
        this.f3427s.k(ColorStateList.valueOf(i10));
    }
}
