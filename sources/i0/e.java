package i0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import d3.k;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import v5.o;

public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f7089a;

    public e(d dVar) {
        this.f7089a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f7089a.equals(((e) obj).f7089a);
    }

    public final int hashCode() {
        return this.f7089a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z9) {
        boolean z10;
        o oVar = (o) ((k) this.f7089a).f6065a;
        AutoCompleteTextView autoCompleteTextView = oVar.f12551h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                CheckableImageButton checkableImageButton = oVar.f12564d;
                if (z9) {
                    i10 = 2;
                }
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.d.s(checkableImageButton, i10);
            }
        }
    }
}
