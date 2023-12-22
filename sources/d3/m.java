package d3;

import android.database.Cursor;
import d3.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t2.b;
import w2.h;
import w2.s;

public final /* synthetic */ class m implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6067a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f6068b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f6069c;

    public /* synthetic */ m(x xVar, ArrayList arrayList, s sVar) {
        this.f6067a = xVar;
        this.f6068b = arrayList;
        this.f6069c = sVar;
    }

    public final Object apply(Object obj) {
        boolean z9;
        b bVar;
        b bVar2;
        x xVar = this.f6067a;
        List list = this.f6068b;
        s sVar = this.f6069c;
        Cursor cursor = (Cursor) obj;
        xVar.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            h.a aVar = new h.a();
            aVar.f12698f = new HashMap();
            aVar.d(cursor.getString(1));
            aVar.f12696d = Long.valueOf(cursor.getLong(2));
            aVar.f12697e = Long.valueOf(cursor.getLong(3));
            if (z9) {
                String string = cursor.getString(4);
                if (string == null) {
                    bVar2 = x.f6090f;
                } else {
                    bVar2 = new b(string);
                }
                aVar.c(new w2.m(bVar2, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    bVar = x.f6090f;
                } else {
                    bVar = new b(string2);
                }
                aVar.c(new w2.m(bVar, (byte[]) x.E(xVar.s().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), new q(1))));
            }
            if (!cursor.isNull(6)) {
                aVar.f12694b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new b(j10, sVar, aVar.b()));
        }
        return null;
    }
}
