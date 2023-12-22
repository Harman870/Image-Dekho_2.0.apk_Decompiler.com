package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import x8.f;

public final class LevelPlayMediaView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LevelPlayMediaView(Context context) {
        super(context);
        f.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LevelPlayMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LevelPlayMediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f.f(context, "context");
    }

    public final void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public final View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }
}
