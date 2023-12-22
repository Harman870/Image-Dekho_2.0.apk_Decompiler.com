package j4;

import android.database.ContentObserver;
import android.os.Handler;

public final class r4 extends ContentObserver {
    public r4() {
        super((Handler) null);
    }

    public final void onChange(boolean z9) {
        f5.f8139h.incrementAndGet();
    }
}
