package j4;

import android.database.ContentObserver;
import android.os.Handler;

public final class i4 extends ContentObserver {
    public i4() {
        super((Handler) null);
    }

    public final void onChange(boolean z9) {
        k4.f8287d.set(true);
    }
}
