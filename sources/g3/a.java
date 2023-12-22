package g3;

import android.util.SparseArray;
import androidx.activity.e;
import java.util.HashMap;
import t2.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<d> f6571a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, Integer> f6572b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f6572b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f6572b.put(d.VERY_LOW, 1);
        f6572b.put(d.HIGHEST, 2);
        for (d next : f6572b.keySet()) {
            f6571a.append(f6572b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f6572b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f6571a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(e.a("Unknown Priority for value ", i10));
    }
}
