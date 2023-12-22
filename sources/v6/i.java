package v6;

import com.google.android.gms.tasks.TaskCompletionSource;
import x6.a;

public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource<String> f12640a;

    public i(TaskCompletionSource<String> taskCompletionSource) {
        this.f12640a = taskCompletionSource;
    }

    public final boolean a(a aVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (aVar.f() == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            if (aVar.f() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (aVar.f() == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
            }
        }
        this.f12640a.trySetResult(aVar.f12970b);
        return true;
    }

    public final boolean b(Exception exc) {
        return false;
    }
}
