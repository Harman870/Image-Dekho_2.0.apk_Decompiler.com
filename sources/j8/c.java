package j8;

import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.wallpapersindia.app.pro.MainActivityPro;
import d3.j;
import java.util.concurrent.Callable;
import l2.d;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8782b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f8781a = i10;
        this.f8782b = obj;
    }

    public final Object call() {
        switch (this.f8781a) {
            case 0:
                g gVar = (g) this.f8782b;
                if (gVar.d0(gVar.Z) && gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING) && !gVar.f8787o0) {
                    gVar.f8787o0 = true;
                    int b02 = gVar.b0(gVar.Z);
                    int[] iArr = {b02};
                    i iVar = new i(gVar, 1000 * ((long) iArr[0]), iArr, b02);
                    gVar.f8788q0 = iVar;
                    iVar.start();
                }
                return null;
            default:
                MainActivityPro mainActivityPro = (MainActivityPro) this.f8782b;
                int i10 = MainActivityPro.K;
                mainActivityPro.getClass();
                d dVar = new d(mainActivityPro, 2);
                dVar.s("Congratulations");
                dVar.o("You won reward video bonus. Click Below button to add reward in your wallet.");
                dVar.i();
                j jVar = new j(3);
                dVar.m("Add Bonus");
                dVar.V = jVar;
                dVar.show();
                return null;
        }
    }
}
