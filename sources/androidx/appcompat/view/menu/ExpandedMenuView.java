package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import e.a;

public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f365b = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    public f f366a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f365b, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable2 = a.a(context, resourceId2);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(1);
            } else {
                drawable = a.a(context, resourceId);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(h hVar) {
        return this.f366a.q(hVar, (j) null, 0);
    }

    public final void b(f fVar) {
        this.f366a = fVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((h) getAdapter().getItem(i10));
    }
}
