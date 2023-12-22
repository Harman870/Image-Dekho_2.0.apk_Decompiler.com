package j4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class y6 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile y6 f8567b;

    /* renamed from: c  reason: collision with root package name */
    public static final y6 f8568c = new y6(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map f8569a;

    public y6() {
        this.f8569a = new HashMap();
    }

    public y6(int i10) {
        this.f8569a = Collections.emptyMap();
    }

    public final k7 a(n8 n8Var, int i10) {
        return (k7) this.f8569a.get(new x6(i10, n8Var));
    }
}
