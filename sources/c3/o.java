package c3;

import a7.h;
import a7.l;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e3.b;
import java.util.Map;
import w2.u;
import w3.g;
import z2.c;

public final /* synthetic */ class o implements b.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2414a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2415b;

    public /* synthetic */ o(Object obj, Object obj2) {
        this.f2414a = obj;
        this.f2415b = obj2;
    }

    public final Object a() {
        q qVar = (q) this.f2414a;
        qVar.getClass();
        for (Map.Entry entry : ((Map) this.f2415b).entrySet()) {
            qVar.f2427i.j((long) ((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public final Object then(Task task) {
        Context context = (Context) this.f2414a;
        Intent intent = (Intent) this.f2415b;
        Object obj = l.f172c;
        return (!g.a() || ((Integer) task.getResult()).intValue() != 402) ? task : l.a(context, intent).continueWith(new h(), new u());
    }
}
