package d3;

import android.database.Cursor;
import d3.x;
import i0.d;
import i8.d;
import j6.w;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final /* synthetic */ class k implements x.a, d, d.a, j6.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f6065a;

    public /* synthetic */ k(Object obj) {
        this.f6065a = obj;
    }

    public Object apply(Object obj) {
        Map map = (Map) this.f6065a;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new x.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public Object h(w wVar) {
        return this.f6065a;
    }
}
