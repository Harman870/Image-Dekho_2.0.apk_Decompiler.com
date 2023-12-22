package j5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import i0.f;

public final class a extends h0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f8598d;

    public a(CheckableImageButton checkableImageButton) {
        this.f8598d = checkableImageButton;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f8598d.isChecked());
    }

    public final void d(View view, f fVar) {
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        fVar.f7091a.setCheckable(this.f8598d.f3258e);
        fVar.f7091a.setChecked(this.f8598d.isChecked());
    }
}
