package n3;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.RemoteException;
import b6.b;
import b6.f;
import b6.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.m;
import e7.t;
import i4.bg;
import i4.lf;
import i4.te;
import j4.c0;
import j4.p;
import j9.d0;
import j9.s;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import o.c;
import q3.u0;
import r3.o;
import t9.g;
import u3.a;
import z5.d;
import z5.l;
import z5.q;

public final /* synthetic */ class w implements Continuation, c0, f, OnCompleteListener, u9.f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9573a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9574b;

    public /* synthetic */ w(bg bgVar, a aVar) {
        o.h(bgVar);
        this.f9573a = bgVar;
        o.h(aVar);
        this.f9574b = aVar;
    }

    public /* synthetic */ w(Object obj, Object obj2) {
        this.f9573a = obj;
        this.f9574b = obj2;
    }

    public /* synthetic */ w(String str) {
        this.f9573a = str;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new d((l) ((h) this.f9573a).a(), (q) ((h) this.f9574b).a());
    }

    public final c a(p pVar) {
        c a10 = ((c) this.f9573a).a();
        String str = (String) this.f9574b;
        a10.e(str, pVar);
        ((Map) a10.f10424d).put(str, Boolean.TRUE);
        return a10;
    }

    public final Object b(Object obj) {
        d0 d0Var = (d0) obj;
        e7.h hVar = (e7.h) this.f9573a;
        d0.a aVar = d0Var.f8863a;
        if (aVar == null) {
            g j10 = d0Var.j();
            s c10 = d0Var.c();
            Charset charset = StandardCharsets.UTF_8;
            if (c10 != null) {
                try {
                    String str = c10.f8963c;
                    if (str != null) {
                        charset = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            aVar = new d0.a(j10, charset);
            d0Var.f8863a = aVar;
        }
        hVar.getClass();
        k7.a aVar2 = new k7.a(aVar);
        aVar2.f9119b = false;
        try {
            Object a10 = ((t) this.f9574b).a(aVar2);
            if (aVar2.W() == 10) {
                return a10;
            }
            throw new m("JSON document was not fully consumed.");
        } finally {
            d0Var.close();
        }
    }

    public final String c() {
        return (String) this.f9573a;
    }

    public final Map d() {
        return (Map) this.f9574b;
    }

    public final void e(te teVar) {
        try {
            ((lf) this.f9573a).b(teVar);
        } catch (RemoteException e10) {
            ((a) this.f9574b).b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void f(Status status) {
        try {
            ((lf) this.f9573a).f(status);
        } catch (RemoteException e10) {
            ((a) this.f9574b).b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void onComplete(Task task) {
        b bVar = (b) this.f9573a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9574b;
        synchronized (bVar.f2277f) {
            bVar.f2276e.remove(taskCompletionSource);
        }
    }

    public final Object then(Task task) {
        boolean z9;
        c cVar = (c) this.f9573a;
        Bundle bundle = (Bundle) this.f9574b;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 == null || !bundle2.containsKey("google.messenger")) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return task;
        }
        return cVar.a(bundle).onSuccessTask(z.f9580a, c.a.f2352n);
    }

    public w(u0 u0Var, AlertDialog alertDialog) {
        this.f9574b = u0Var;
        this.f9573a = alertDialog;
    }
}
