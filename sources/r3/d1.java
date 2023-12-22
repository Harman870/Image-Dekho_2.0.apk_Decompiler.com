package r3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public final class d1 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f11555a;

    public /* synthetic */ d1(e1 e1Var) {
        this.f11555a = e1Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f11555a.f11575d) {
                try {
                    b1 b1Var = (b1) message.obj;
                    c1 c1Var = (c1) this.f11555a.f11575d.get(b1Var);
                    if (c1Var != null && c1Var.f11539a.isEmpty()) {
                        if (c1Var.f11541c) {
                            c1Var.f11545g.f11577f.removeMessages(1, c1Var.f11543e);
                            e1 e1Var = c1Var.f11545g;
                            e1Var.f11578g.c(e1Var.f11576e, c1Var);
                            c1Var.f11541c = false;
                            c1Var.f11540b = 2;
                        }
                        this.f11555a.f11575d.remove(b1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f11555a.f11575d) {
                b1 b1Var2 = (b1) message.obj;
                c1 c1Var2 = (c1) this.f11555a.f11575d.get(b1Var2);
                if (c1Var2 != null && c1Var2.f11540b == 3) {
                    String valueOf = String.valueOf(b1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName componentName = c1Var2.f11544f;
                    if (componentName == null) {
                        b1Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = b1Var2.f11525b;
                        o.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    c1Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
