package x5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.imgdkh.app.R;
import g.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12968a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12969b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12969b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof c) || ((c) context).f6396a != resourceId) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (resourceId == 0 || z9) {
            return context;
        }
        c cVar = new c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f12968a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
