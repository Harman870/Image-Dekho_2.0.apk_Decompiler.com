package i4;

import c6.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.b;
import h6.l;
import i6.j;
import java.util.ArrayList;

public abstract class cg {

    /* renamed from: a  reason: collision with root package name */
    public final int f7234a;

    /* renamed from: b  reason: collision with root package name */
    public final bg f7235b = new bg(this);

    /* renamed from: c  reason: collision with root package name */
    public f f7236c;

    /* renamed from: d  reason: collision with root package name */
    public l f7237d;

    /* renamed from: e  reason: collision with root package name */
    public Object f7238e;

    /* renamed from: f  reason: collision with root package name */
    public j f7239f;

    /* renamed from: g  reason: collision with root package name */
    public wg f7240g;

    /* renamed from: h  reason: collision with root package name */
    public rg f7241h;

    /* renamed from: i  reason: collision with root package name */
    public b f7242i;

    /* renamed from: j  reason: collision with root package name */
    public te f7243j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public Object f7244l;

    /* renamed from: m  reason: collision with root package name */
    public h6 f7245m;

    public cg(int i10) {
        new ArrayList();
        this.f7234a = i10;
    }

    public abstract String a();

    public abstract void b();

    public abstract void c(TaskCompletionSource taskCompletionSource, nf nfVar);

    public final void d(f fVar) {
        if (fVar != null) {
            this.f7236c = fVar;
            return;
        }
        throw new NullPointerException("firebaseApp cannot be null");
    }

    public final void e(Status status) {
        this.k = true;
        this.f7245m.b((Object) null, status);
    }

    public final void f(Object obj) {
        this.k = true;
        this.f7244l = obj;
        this.f7245m.b(obj, (Status) null);
    }
}
