package d3;

import android.database.Cursor;
import d3.x;
import z2.f;

public final /* synthetic */ class p implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f6076a;

    public /* synthetic */ p(long j10) {
        this.f6076a = j10;
    }

    public final Object apply(Object obj) {
        long j10 = this.f6076a;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new f(cursor.getLong(0), j10);
    }
}
