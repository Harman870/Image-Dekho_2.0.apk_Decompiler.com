package k9;

public abstract class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f9149a;

    public b(String str, Object... objArr) {
        this.f9149a = e.j(str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f9149a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
