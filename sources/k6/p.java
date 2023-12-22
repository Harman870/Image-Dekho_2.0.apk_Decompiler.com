package k6;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import j6.d;
import j6.w;

public final /* synthetic */ class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9103a;

    public /* synthetic */ p(int i10) {
        this.f9103a = i10;
    }

    public final Object h(w wVar) {
        switch (this.f9103a) {
            case 0:
                return ExecutorsRegistrar.f3480a.get();
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(wVar);
        }
    }
}
