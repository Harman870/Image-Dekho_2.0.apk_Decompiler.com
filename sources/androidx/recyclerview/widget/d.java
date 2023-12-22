package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2033b;

    public d(k kVar, ArrayList arrayList) {
        this.f2033b = kVar;
        this.f2032a = arrayList;
    }

    public final void run() {
        View view;
        Iterator it = this.f2032a.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f2033b;
            kVar.getClass();
            RecyclerView.z zVar = aVar.f2069a;
            View view2 = null;
            if (zVar == null) {
                view = null;
            } else {
                view = zVar.f1942a;
            }
            RecyclerView.z zVar2 = aVar.f2070b;
            if (zVar2 != null) {
                view2 = zVar2.f1942a;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(kVar.f1862f);
                kVar.f2068r.add(aVar.f2069a);
                duration.translationX((float) (aVar.f2073e - aVar.f2071c));
                duration.translationY((float) (aVar.f2074f - aVar.f2072d));
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                kVar.f2068r.add(aVar.f2070b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f1862f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
            }
        }
        this.f2032a.clear();
        this.f2033b.f2064n.remove(this.f2032a);
    }
}
