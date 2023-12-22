package l2;

import android.os.Process;
import android.os.StrictMode;
import android.view.inputmethod.InputMethodManager;
import k6.a;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9209c;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f9207a = i10;
        this.f9208b = obj;
        this.f9209c = obj2;
    }

    public final void run() {
        switch (this.f9207a) {
            case 0:
                ((InputMethodManager) this.f9209c).showSoftInput(((d) this.f9208b).X, 1);
                return;
            default:
                a aVar = (a) this.f9208b;
                Runnable runnable = (Runnable) this.f9209c;
                Process.setThreadPriority(aVar.f9064c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f9065d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
        }
    }
}
