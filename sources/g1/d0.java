package g1;

import android.view.View;
import android.view.WindowId;

public final class d0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f6491a;

    public d0(View view) {
        this.f6491a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && ((d0) obj).f6491a.equals(this.f6491a);
    }

    public final int hashCode() {
        return this.f6491a.hashCode();
    }
}
