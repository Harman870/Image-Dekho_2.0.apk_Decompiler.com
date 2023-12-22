package d3;

import android.database.sqlite.SQLiteDatabase;
import d3.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import t2.d;
import w2.h;
import w2.j;
import w2.s;

public final /* synthetic */ class w implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f6089b;

    public /* synthetic */ w(x xVar, s sVar) {
        this.f6088a = xVar;
        this.f6089b = sVar;
    }

    public final Object apply(Object obj) {
        x xVar = this.f6088a;
        s sVar = this.f6089b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList v10 = xVar.v(sQLiteDatabase, sVar, xVar.f6094d.c());
        for (d dVar : d.values()) {
            if (dVar != sVar.d()) {
                int c10 = xVar.f6094d.c() - v10.size();
                if (c10 <= 0) {
                    break;
                }
                j.a a10 = s.a();
                a10.b(sVar.b());
                a10.c(dVar);
                a10.f12708b = sVar.c();
                v10.addAll(xVar.v(sQLiteDatabase, a10.a(), c10));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < v10.size(); i10++) {
            sb.append(((i) v10.get(i10)).b());
            if (i10 < v10.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        x.E(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new k(hashMap));
        ListIterator listIterator = v10.listIterator();
        while (listIterator.hasNext()) {
            i iVar = (i) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(iVar.b()))) {
                h.a i11 = iVar.a().i();
                for (x.b bVar : (Set) hashMap.get(Long.valueOf(iVar.b()))) {
                    i11.a(bVar.f6096a, bVar.f6097b);
                }
                listIterator.set(new b(iVar.b(), iVar.c(), i11.b()));
            }
        }
        return v10;
    }
}
