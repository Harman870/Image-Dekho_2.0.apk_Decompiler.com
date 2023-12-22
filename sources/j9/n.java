package j9;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import k9.e;
import t9.f;

public final class n extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final s f8930c = s.a("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f8931a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f8932b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f8933a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f8934b = new ArrayList();
    }

    public n(ArrayList arrayList, ArrayList arrayList2) {
        this.f8931a = e.l(arrayList);
        this.f8932b = e.l(arrayList2);
    }

    public final long a() {
        return d((f) null, true);
    }

    public final s b() {
        return f8930c;
    }

    public final void c(f fVar) {
        d(fVar, false);
    }

    public final long d(@Nullable f fVar, boolean z9) {
        t9.e eVar;
        if (z9) {
            eVar = new t9.e();
        } else {
            eVar = fVar.d();
        }
        int size = this.f8931a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                eVar.R(38);
            }
            String str = this.f8931a.get(i10);
            eVar.getClass();
            eVar.W(0, str.length(), str);
            eVar.R(61);
            String str2 = this.f8932b.get(i10);
            eVar.W(0, str2.length(), str2);
        }
        if (!z9) {
            return 0;
        }
        long j10 = eVar.f12045b;
        eVar.c();
        return j10;
    }
}
