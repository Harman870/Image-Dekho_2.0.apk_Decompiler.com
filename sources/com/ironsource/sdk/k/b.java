package com.ironsource.sdk.k;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.g.g;
import com.ironsource.sdk.k.e;
import com.ironsource.sdk.utils.Logger;
import java.util.LinkedHashMap;
import x8.f;

public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final String f5682a = "ISNNativeAdContainer";

    /* renamed from: b  reason: collision with root package name */
    public e.c f5683b;

    public interface a {
        void a(g gVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        f.f(context, "context");
        new LinkedHashMap();
    }

    public final g a() {
        boolean z9 = true;
        boolean z10 = getVisibility() == 0;
        if (getWindowVisibility() != 0) {
            z9 = false;
        }
        return new g(z10, z9, isShown());
    }

    public final void onVisibilityChanged(View view, int i10) {
        f.f(view, "changedView");
        String str = this.f5682a;
        Logger.i(str, "onVisibilityChanged: " + i10);
        e.c cVar = this.f5683b;
        if (cVar != null) {
            cVar.a(a());
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        String str = this.f5682a;
        Logger.i(str, "onWindowVisibilityChanged: " + i10);
        e.c cVar = this.f5683b;
        if (cVar != null) {
            cVar.a(a());
        }
    }
}
