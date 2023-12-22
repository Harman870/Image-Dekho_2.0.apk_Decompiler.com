package j4;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

public final class n4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o4 f8334a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n4(o4 o4Var) {
        super((Handler) null);
        this.f8334a = o4Var;
    }

    public final void onChange(boolean z9) {
        o4 o4Var = this.f8334a;
        synchronized (o4Var.f8360e) {
            o4Var.f8361f = null;
            o4Var.f8358c.run();
        }
        synchronized (o4Var) {
            Iterator it = o4Var.f8362g.iterator();
            while (it.hasNext()) {
                ((p4) it.next()).zza();
            }
        }
    }
}
