package p7;

import com.ironsource.lifecycle.c;
import com.ironsource.lifecycle.d;
import java.util.Iterator;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ d f10703a;

    public a(d dVar) {
        this.f10703a = dVar;
    }

    public final void run() {
        Iterator it = this.f10703a.f3801f.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }
}
