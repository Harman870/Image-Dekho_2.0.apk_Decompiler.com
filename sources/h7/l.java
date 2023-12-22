package h7;

import e7.h;
import e7.r;
import e7.t;
import e7.u;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import k7.b;

public final class l extends t<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6971b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f6972a = new SimpleDateFormat("hh:mm:ss a");

    public static class a implements u {
        public final <T> t<T> b(h hVar, j7.a<T> aVar) {
            if (aVar.f8776a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    public final Object a(k7.a aVar) {
        synchronized (this) {
            if (aVar.W() == 9) {
                aVar.S();
                return null;
            }
            try {
                Time time = new Time(this.f6972a.parse(aVar.U()).getTime());
                return time;
            } catch (ParseException e10) {
                throw new r((Exception) e10);
            }
        }
    }

    public final void b(b bVar, Object obj) {
        Time time = (Time) obj;
        synchronized (this) {
            bVar.O(time == null ? null : this.f6972a.format(time));
        }
    }
}
