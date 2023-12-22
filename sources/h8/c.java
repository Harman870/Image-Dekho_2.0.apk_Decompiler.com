package h8;

import android.widget.Toast;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.imgdkh.app.R;
import com.wallpapersindia.app.LoginScreen;
import com.wallpapersindia.app.utils.BackgroundWorker;
import z5.b;

public final /* synthetic */ class c implements OnSuccessListener, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginScreen f7025a;

    public /* synthetic */ c(LoginScreen loginScreen) {
        this.f7025a = loginScreen;
    }

    public final void onFailure(Exception exc) {
        LoginScreen loginScreen = this.f7025a;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        Toast.makeText(loginScreen, "Please Retry", 0).show();
    }

    public final void onSuccess(Object obj) {
        LoginScreen loginScreen = this.f7025a;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        loginScreen.F = ((b.C0178b) obj).a();
        new BackgroundWorker(loginScreen, loginScreen, loginScreen.getString(R.string.signup), true).execute(new String[]{loginScreen.getString(R.string.demo_name), loginScreen.getString(R.string.demo_email), "image", loginScreen.getString(R.string.demo_phone), loginScreen.getString(R.string.demo_id), loginScreen.getString(R.string.demo_id), loginScreen.F, loginScreen.getString(R.string.demo_phone)});
    }
}
