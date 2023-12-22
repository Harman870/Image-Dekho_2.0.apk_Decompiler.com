package a1;

import android.content.Context;

public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f34a;

    /* renamed from: b  reason: collision with root package name */
    public a<D> f35b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f39f = false;

    public interface a<D> {
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public final void a() {
        a aVar = (a) this;
        if (aVar.f30h != null) {
            if (!aVar.f36c) {
                aVar.f39f = true;
            }
            if (aVar.f31i != null) {
                aVar.f30h.getClass();
            } else {
                aVar.f30h.getClass();
                a<D>.a aVar2 = aVar.f30h;
                aVar2.f45d.set(true);
                if (aVar2.f43b.cancel(false)) {
                    aVar.f31i = aVar.f30h;
                }
            }
            aVar.f30h = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        y3.a.e(this, sb);
        sb.append(" id=");
        sb.append(this.f34a);
        sb.append("}");
        return sb.toString();
    }
}
