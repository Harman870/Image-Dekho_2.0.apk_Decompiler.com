package j8;

import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f8784a;

    public /* synthetic */ e(g gVar) {
        this.f8784a = gVar;
    }

    public final Object call() {
        g gVar = this.f8784a;
        if (!gVar.d0(gVar.Z) || !gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING) || gVar.f8787o0) {
            return null;
        }
        gVar.f8787o0 = true;
        int b02 = gVar.b0(gVar.Z);
        int[] iArr = {b02};
        h hVar = new h(gVar, 1000 * ((long) iArr[0]), iArr, b02);
        gVar.f8788q0 = hVar;
        hVar.start();
        return null;
    }
}
