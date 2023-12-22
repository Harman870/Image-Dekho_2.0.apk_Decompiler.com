package c3;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.f;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.wallpapersindia.app.LoginScreen;
import com.wallpapersindia.app.RedeemScreen;
import com.wallpapersindia.app.SplashScreen;
import d3.c;
import e3.b;
import l2.d;
import z5.b;

public final /* synthetic */ class g implements b.a, OnFailureListener, OnSuccessListener, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2398a;

    public /* synthetic */ g(Object obj) {
        this.f2398a = obj;
    }

    public final Object a() {
        return ((c) this.f2398a).a();
    }

    public final void c(d dVar) {
        SplashScreen splashScreen = (SplashScreen) this.f2398a;
        int i10 = SplashScreen.f5838y;
        splashScreen.getClass();
        StringBuilder g10 = f.g("market://details?id=");
        g10.append(splashScreen.getPackageName());
        splashScreen.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(g10.toString())));
    }

    public final void onFailure(Exception exc) {
        LoginScreen loginScreen = (LoginScreen) this.f2398a;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        Toast.makeText(loginScreen, "Please Retry", 0).show();
    }

    public final void onSuccess(Object obj) {
        RedeemScreen redeemScreen = (RedeemScreen) this.f2398a;
        redeemScreen.S = (b.c) obj;
        if (redeemScreen.Q.isShowing()) {
            redeemScreen.Q.hide();
        }
    }
}
