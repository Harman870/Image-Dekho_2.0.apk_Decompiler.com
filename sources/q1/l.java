package q1;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f11056a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f11057b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final e f11058c = new e();

    public class a extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(o1.a aVar) {
            return aVar == o1.a.REMOTE;
        }

        public final boolean d(boolean z9, o1.a aVar, o1.c cVar) {
            return (aVar == o1.a.RESOURCE_DISK_CACHE || aVar == o1.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(o1.a aVar) {
            return false;
        }

        public final boolean d(boolean z9, o1.a aVar, o1.c cVar) {
            return false;
        }
    }

    public class c extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(o1.a aVar) {
            return (aVar == o1.a.DATA_DISK_CACHE || aVar == o1.a.MEMORY_CACHE) ? false : true;
        }

        public final boolean d(boolean z9, o1.a aVar, o1.c cVar) {
            return false;
        }
    }

    public class d extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(o1.a aVar) {
            return false;
        }

        public final boolean d(boolean z9, o1.a aVar, o1.c cVar) {
            return (aVar == o1.a.RESOURCE_DISK_CACHE || aVar == o1.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(o1.a aVar) {
            return aVar == o1.a.REMOTE;
        }

        public final boolean d(boolean z9, o1.a aVar, o1.c cVar) {
            return ((z9 && aVar == o1.a.DATA_DISK_CACHE) || aVar == o1.a.LOCAL) && cVar == o1.c.TRANSFORMED;
        }
    }

    static {
        new a();
        new d();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(o1.a aVar);

    public abstract boolean d(boolean z9, o1.a aVar, o1.c cVar);
}
