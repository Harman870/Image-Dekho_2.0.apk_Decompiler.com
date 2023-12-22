package i0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f7086a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7087b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7088c;

    public a(int i10, f fVar, int i11) {
        this.f7086a = i10;
        this.f7087b = fVar;
        this.f7088c = i11;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7086a);
        f fVar = this.f7087b;
        fVar.f7091a.performAction(this.f7088c, bundle);
    }
}
