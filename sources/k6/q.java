package k6;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import j6.d;
import j6.w;

public final /* synthetic */ class q implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9104a;

    public /* synthetic */ q(int i10) {
        this.f9104a = i10;
    }

    public final Object h(w wVar) {
        switch (this.f9104a) {
            case 0:
                return ExecutorsRegistrar.f3482c.get();
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(wVar);
        }
    }
}
