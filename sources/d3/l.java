package d3;

import a7.l0;
import android.content.Intent;
import android.database.Cursor;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.imgdkh.app.R;
import com.wallpapersindia.app.LoginScreen;
import com.wallpapersindia.app.RedeemScreen;
import com.wallpapersindia.app.SplashScreen;
import com.wallpapersindia.app.utils.BackgroundWorker;
import d3.x;
import l2.d;
import z2.c;
import z5.b;

public final /* synthetic */ class l implements x.a, OnCompleteListener, OnSuccessListener, OnFailureListener, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f6066a;

    public /* synthetic */ l(Object obj) {
        this.f6066a = obj;
    }

    public final Object apply(Object obj) {
        x xVar = (x) this.f6066a;
        Cursor cursor = (Cursor) obj;
        xVar.getClass();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            xVar.j((long) i10, c.a.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final void c(d dVar) {
        int i10 = SplashScreen.f5838y;
        ((SplashScreen) this.f6066a).finish();
    }

    public final void onComplete(Task task) {
        l0.a((Intent) this.f6066a);
    }

    public final void onFailure(Exception exc) {
        RedeemScreen redeemScreen = (RedeemScreen) this.f6066a;
        int i10 = RedeemScreen.T;
        redeemScreen.getClass();
        Toast.makeText(redeemScreen, "Please Retry After Sometime", 1).show();
        if (redeemScreen.Q.isShowing()) {
            redeemScreen.Q.hide();
        }
    }

    public final void onSuccess(Object obj) {
        LoginScreen loginScreen = (LoginScreen) this.f6066a;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        loginScreen.F = ((b.C0178b) obj).a();
        new BackgroundWorker(loginScreen, loginScreen, loginScreen.getString(R.string.signup), true).execute(new String[]{loginScreen.getString(R.string.demo_name1), loginScreen.getString(R.string.demo_email1), "image", loginScreen.getString(R.string.demo_phone1), loginScreen.getString(R.string.demo_id1), loginScreen.getString(R.string.demo_id1), loginScreen.F, loginScreen.getString(R.string.demo_phone1)});
    }
}
