package a7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import j8.g;
import j8.j;
import l2.d;

public final /* synthetic */ class a0 implements Continuation, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f97a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f98b;

    public /* synthetic */ a0(Object obj, String str) {
        this.f98b = obj;
        this.f97a = str;
    }

    public final void c(d dVar) {
        g gVar = (g) this.f98b;
        String str = this.f97a;
        int i10 = g.f8786v0;
        gVar.getClass();
        dVar.dismiss();
        new BackgroundWorker(gVar.j(), gVar, gVar.t(R.string.add_spin_reward), true).execute(new String[]{gVar.W.a(gVar.t(R.string.uat)), gVar.W.a(gVar.t(R.string.id)), str});
        int i11 = gVar.f8791t0;
        int[] iArr = {i11};
        gVar.u0 = i11;
        j jVar = new j(gVar, ((long) iArr[0]) * 1000, iArr);
        gVar.f8789r0 = jVar;
        jVar.start();
    }

    public final Object then(Task task) {
        b0 b0Var = (b0) this.f98b;
        String str = this.f97a;
        synchronized (b0Var) {
            b0Var.f102b.remove(str);
        }
        return task;
    }
}
