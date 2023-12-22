package h8;

import com.google.android.gms.tasks.OnSuccessListener;
import com.imgdkh.app.R;
import com.wallpapersindia.app.RedeemScreen;
import com.wallpapersindia.app.utils.BackgroundWorker;
import z5.b;

public final /* synthetic */ class f implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RedeemScreen f7034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7035b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7036c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f7037d;

    public /* synthetic */ f(RedeemScreen redeemScreen, String str, String str2, String str3) {
        this.f7034a = redeemScreen;
        this.f7035b = str;
        this.f7036c = str2;
        this.f7037d = str3;
    }

    public final void onSuccess(Object obj) {
        RedeemScreen redeemScreen = this.f7034a;
        String str = this.f7035b;
        String str2 = this.f7036c;
        String str3 = this.f7037d;
        b.C0178b bVar = (b.C0178b) obj;
        if (redeemScreen.Q.isShowing()) {
            redeemScreen.Q.hide();
        }
        redeemScreen.O = bVar.a();
        new BackgroundWorker(redeemScreen, redeemScreen, redeemScreen.getString(R.string.set_redeem), true).execute(new String[]{redeemScreen.f5835x.a(redeemScreen.getString(R.string.uat)), redeemScreen.f5835x.a(redeemScreen.getString(R.string.id)), str, str2, str3, redeemScreen.O});
    }
}
