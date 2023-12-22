package h8;

import com.google.android.gms.tasks.OnSuccessListener;
import com.imgdkh.app.R;
import com.wallpapersindia.app.RedeemScreen;
import com.wallpapersindia.app.utils.BackgroundWorker;
import z5.b;

public final /* synthetic */ class e implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RedeemScreen f7030a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7031b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7032c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f7033d;

    public /* synthetic */ e(RedeemScreen redeemScreen, String str, String str2, String str3) {
        this.f7030a = redeemScreen;
        this.f7031b = str;
        this.f7032c = str2;
        this.f7033d = str3;
    }

    public final void onSuccess(Object obj) {
        RedeemScreen redeemScreen = this.f7030a;
        String str = this.f7031b;
        String str2 = this.f7032c;
        String str3 = this.f7033d;
        b.C0178b bVar = (b.C0178b) obj;
        if (redeemScreen.Q.isShowing()) {
            redeemScreen.Q.hide();
        }
        redeemScreen.O = bVar.a();
        new BackgroundWorker(redeemScreen, redeemScreen, redeemScreen.getString(R.string.set_redeem), true).execute(new String[]{redeemScreen.f5835x.a(redeemScreen.getString(R.string.uat)), redeemScreen.f5835x.a(redeemScreen.getString(R.string.id)), str, str2, str3, redeemScreen.O});
    }
}
