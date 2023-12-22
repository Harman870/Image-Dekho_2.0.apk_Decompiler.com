package n3;

import androidx.appcompat.widget.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import h6.c;
import i4.fg;
import i4.ng;
import i4.wg;
import i4.xf;
import i6.h;
import java.util.concurrent.ScheduledFuture;
import r3.o;
import u1.t;

public final /* synthetic */ class x implements OnCompleteListener, fg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9575a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9576b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9577c;

    public /* synthetic */ x(c cVar, String str, ScheduledFuture scheduledFuture) {
        this.f9575a = cVar;
        this.f9576b = str;
        this.f9577c = scheduledFuture;
    }

    public /* synthetic */ x(t tVar, c cVar, w wVar) {
        this.f9577c = tVar;
        this.f9575a = cVar;
        this.f9576b = wVar;
    }

    public final void c(xf xfVar) {
        ng ngVar = new ng((c) this.f9575a, ((wg) xfVar).f7777b);
        t tVar = (t) this.f9577c;
        w wVar = (w) this.f9576b;
        tVar.getClass();
        o.h(wVar);
        ((androidx.activity.result.c) tVar.f12166a).t(ngVar, new l(tVar, 3, wVar));
    }

    public final void onComplete(Task task) {
        c cVar = (c) this.f9575a;
        String str = (String) this.f9576b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f9577c;
        synchronized (cVar.f9528a) {
            cVar.f9528a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final void zza(String str) {
        ((w) this.f9576b).f(h.a(str));
    }
}
