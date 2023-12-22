package j4;

import c.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class a9 extends h9 {
    public a9(int i10) {
        super(i10);
    }

    public final void a() {
        Iterable<Map.Entry> iterable;
        if (!this.f8221d) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry entry = (Map.Entry) this.f8219b.get(i10);
                if (((c7) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.f8220c.isEmpty()) {
                iterable = a.k;
            } else {
                iterable = this.f8220c.entrySet();
            }
            for (Map.Entry entry2 : iterable) {
                if (((c7) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
