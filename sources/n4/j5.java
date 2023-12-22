package n4;

import android.os.Bundle;
import android.text.TextUtils;

public final /* synthetic */ class j5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a6 f9864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f9865b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9866c;

    public /* synthetic */ j5(a6 a6Var, Bundle bundle, long j10) {
        this.f9864a = a6Var;
        this.f9865b = bundle;
        this.f9866c = j10;
    }

    public final void run() {
        a6 a6Var = this.f9864a;
        Bundle bundle = this.f9865b;
        long j10 = this.f9866c;
        if (TextUtils.isEmpty(a6Var.f9600a.o().m())) {
            a6Var.u(bundle, 0, j10);
        } else {
            a6Var.f9600a.a().k.a("Using developer consent only; google app id found");
        }
    }
}
