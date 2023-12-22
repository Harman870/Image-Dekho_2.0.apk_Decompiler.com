package h7;

import e7.h;
import e7.r;
import e7.t;
import e7.u;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import k7.b;

public final class k extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6969b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f6970a = new SimpleDateFormat("MMM d, yyyy");

    public static class a implements u {
        public final <T> t<T> b(h hVar, j7.a<T> aVar) {
            if (aVar.f8776a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    public final Object a(k7.a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.W() == 9) {
                aVar.S();
                date = null;
            } else {
                try {
                    date = new Date(this.f6970a.parse(aVar.U()).getTime());
                } catch (ParseException e10) {
                    throw new r((Exception) e10);
                }
            }
        }
        return date;
    }

    public final void b(b bVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            bVar.O(date == null ? null : this.f6970a.format(date));
        }
    }
}
