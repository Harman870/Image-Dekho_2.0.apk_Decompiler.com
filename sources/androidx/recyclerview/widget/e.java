package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2035b;

    public e(k kVar, ArrayList arrayList) {
        this.f2035b = kVar;
        this.f2034a = arrayList;
    }

    public final void run() {
        Iterator it = this.f2034a.iterator();
        while (it.hasNext()) {
            RecyclerView.z zVar = (RecyclerView.z) it.next();
            k kVar = this.f2035b;
            kVar.getClass();
            View view = zVar.f1942a;
            ViewPropertyAnimator animate = view.animate();
            kVar.f2065o.add(zVar);
            animate.alpha(1.0f).setDuration(kVar.f1859c).setListener(new g(view, animate, kVar, zVar)).start();
        }
        this.f2034a.clear();
        this.f2035b.f2062l.remove(this.f2034a);
    }
}
