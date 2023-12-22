package h8;

import c3.h;
import com.google.android.gms.tasks.Task;
import com.imgdkh.app.R;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.wallpapersindia.app.RedeemScreen;
import com.wallpapersindia.app.utils.BackgroundWorker;
import java.util.concurrent.Callable;
import z5.s;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RedeemScreen f7026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7028c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f7029d;

    public /* synthetic */ d(RedeemScreen redeemScreen, String str, String str2, String str3) {
        this.f7026a = redeemScreen;
        this.f7027b = str;
        this.f7028c = str2;
        this.f7029d = str3;
    }

    public final Object call() {
        RedeemScreen redeemScreen = this.f7026a;
        String str = this.f7027b;
        String str2 = this.f7028c;
        String str3 = this.f7029d;
        if (redeemScreen.f5835x.a(redeemScreen.getString(R.string.redeem_validation_required)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            Task a10 = redeemScreen.S.a(new s(redeemScreen.A(redeemScreen.f5835x.a(redeemScreen.getString(R.string.id)) + str)));
            redeemScreen.Q.show();
            a10.addOnSuccessListener(new f(redeemScreen, str, str2, str3)).addOnFailureListener(new h(redeemScreen));
            return null;
        }
        StringBuilder h10 = a.h(str, "recapcha_token");
        h10.append(redeemScreen.f5835x.a(redeemScreen.getString(R.string.id)));
        redeemScreen.O = redeemScreen.A(h10.toString());
        new BackgroundWorker(redeemScreen, redeemScreen, redeemScreen.getString(R.string.set_redeem), true).execute(new String[]{redeemScreen.f5835x.a(redeemScreen.getString(R.string.uat)), redeemScreen.f5835x.a(redeemScreen.getString(R.string.id)), str, str2, str3, redeemScreen.O});
        return null;
    }
}
