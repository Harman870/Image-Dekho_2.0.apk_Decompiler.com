package y0;

import android.os.Parcel;
import androidx.appcompat.widget.l;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i4.he;
import i4.ld;
import i4.m;
import i4.qe;
import i4.r1;
import j9.e0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import m9.f;
import p3.a;
import p3.b;
import q3.j;
import r3.r;
import r3.s;
import t3.d;

public final class c implements j, Continuation, r1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13011a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(int i10) {
        this(TimeUnit.MINUTES);
        if (i10 == 5) {
        } else if (i10 != 6) {
            this.f13011a = new ArrayList();
        } else {
            this.f13011a = new LinkedHashSet();
        }
    }

    public /* synthetic */ c(TimeUnit timeUnit) {
        this.f13011a = new f(timeUnit);
    }

    /* JADX INFO: finally extract failed */
    public final void a(a.e eVar, TaskCompletionSource taskCompletionSource) {
        r rVar = (r) this.f13011a;
        a<s> aVar = t3.c.k;
        t3.a aVar2 = (t3.a) ((d) eVar).v();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f6380b);
        int i10 = f4.c.f6381a;
        if (rVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            rVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f6379a.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final m b(l lVar, CharSequence charSequence) {
        return new m(lVar, charSequence, new he(((qe) ((ld) this.f13011a)).f7623a.matcher(charSequence)));
    }

    public final synchronized void c(e0 e0Var) {
        ((Set) this.f13011a).remove(e0Var);
    }

    public final Object then(Task task) {
        Exception exc;
        c4.l lVar = (c4.l) this.f13011a;
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof b)) {
            return task;
        }
        int i10 = ((b) exception).f10660a.f2811b;
        if (i10 == 43001 || i10 == 43002 || i10 == 43003 || i10 == 17) {
            return lVar.f2457b.getAppSetIdInfo();
        }
        if (i10 == 43000) {
            exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
        } else if (i10 != 15) {
            return task;
        } else {
            exc = new Exception("The operation to get app set ID timed out. Please try again later.");
        }
        return Tasks.forException(exc);
    }

    public /* synthetic */ c(Object obj) {
        this.f13011a = obj;
    }
}
