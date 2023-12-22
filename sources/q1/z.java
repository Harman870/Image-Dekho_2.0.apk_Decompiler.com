package q1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11167a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11168b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).c();
            return true;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z9) {
        if (!this.f11167a) {
            if (!z9) {
                this.f11167a = true;
                wVar.c();
                this.f11167a = false;
            }
        }
        this.f11168b.obtainMessage(1, wVar).sendToTarget();
    }
}
