package i4;

import c.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class o2 extends u2 {
    public o2(int i10) {
        super(i10);
    }

    public final void a() {
        Iterable<Map.Entry> iterable;
        if (!this.f7704d) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry entry = (Map.Entry) this.f7702b.get(i10);
                if (((t0) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.f7703c.isEmpty()) {
                iterable = a.f2348i;
            } else {
                iterable = this.f7703c.entrySet();
            }
            for (Map.Entry entry2 : iterable) {
                if (((t0) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
