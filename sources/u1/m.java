package u1;

import j2.l;
import java.util.ArrayDeque;

public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f12130a = new l();

    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f12131d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f12132a;

        /* renamed from: b  reason: collision with root package name */
        public int f12133b;

        /* renamed from: c  reason: collision with root package name */
        public A f12134c;

        static {
            char[] cArr = l.f8029a;
        }

        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f12131d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f12134c = obj;
            aVar.f12133b = 0;
            aVar.f12132a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12133b == aVar.f12133b && this.f12132a == aVar.f12132a && this.f12134c.equals(aVar.f12134c);
        }

        public final int hashCode() {
            return this.f12134c.hashCode() + (((this.f12132a * 31) + this.f12133b) * 31);
        }
    }
}
