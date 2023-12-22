package j8;

import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f8780a;

    public /* synthetic */ b(g gVar) {
        this.f8780a = gVar;
    }

    public final Object call() {
        g gVar = this.f8780a;
        if (!gVar.d0(gVar.Z) || !gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            gVar.f0();
            return null;
        }
        gVar.g0();
        return null;
    }
}
