package androidx.databinding;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends a {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f1293a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList f1294b = new CopyOnWriteArrayList();

    public MergedDataBinderMapper() {
        new CopyOnWriteArrayList();
    }

    public final void b(a aVar) {
        if (this.f1293a.add(aVar.getClass())) {
            this.f1294b.add(aVar);
            for (a b10 : aVar.a()) {
                b(b10);
            }
        }
    }
}
