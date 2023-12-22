package c3;

import android.widget.Toast;
import com.google.android.gms.tasks.OnFailureListener;
import com.wallpapersindia.app.RedeemScreen;
import d3.d;
import e3.b;

public final /* synthetic */ class h implements b.a, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2399a;

    public /* synthetic */ h(Object obj) {
        this.f2399a = obj;
    }

    public final Object a() {
        return Integer.valueOf(((d) this.f2399a).f());
    }

    public final void onFailure(Exception exc) {
        RedeemScreen redeemScreen = (RedeemScreen) this.f2399a;
        int i10 = RedeemScreen.T;
        redeemScreen.getClass();
        Toast.makeText(redeemScreen, "Please Retry After Sometime", 1).show();
        if (redeemScreen.Q.isShowing()) {
            redeemScreen.Q.hide();
        }
    }
}
