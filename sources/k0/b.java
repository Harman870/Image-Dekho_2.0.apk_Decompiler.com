package k0;

import a7.p;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.Toast;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.wallpapersindia.app.LoginScreen;
import d3.q;
import h0.c;
import h0.y;
import j8.f;
import j8.g;
import java.io.IOException;
import l2.d;
import l8.e;

public final /* synthetic */ class b implements e, Continuation, OnFailureListener, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9034a;

    public /* synthetic */ b(Object obj) {
        this.f9034a = obj;
    }

    public final boolean a(f fVar, int i10, Bundle bundle) {
        c.b bVar;
        View view = (View) this.f9034a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                fVar.f9037a.d();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f9037a.b();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.f9037a.a(), new ClipData.Item(fVar.f9037a.c()));
        if (i11 >= 31) {
            bVar = new c.a(clipData, 2);
        } else {
            bVar = new c.C0090c(clipData, 2);
        }
        bVar.a(fVar.f9037a.e());
        bVar.setExtras(bundle);
        if (y.j(view, bVar.build()) == null) {
            return true;
        }
        return false;
    }

    public final void c(d dVar) {
        g gVar = (g) this.f9034a;
        int i10 = g.f8786v0;
        gVar.getClass();
        dVar.dismiss();
        gVar.j();
        if (e.b()) {
            gVar.j();
            try {
                IronSource.setLevelPlayInterstitialListener(new l8.c(new f(gVar), new j8.d(gVar), new j8.e(gVar)));
                IronSource.showInterstitial();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else if (gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            d dVar2 = new d(gVar.j(), 2);
            dVar2.s("Ops!!!");
            dVar2.o("Ads are not available at this point of time. Please try again after some time. Or close and reopen the app.");
            dVar2.i();
            q qVar = new q(4);
            dVar2.m("Okay");
            dVar2.V = qVar;
            dVar2.show();
        } else {
            gVar.f0();
        }
    }

    public final void onFailure(Exception exc) {
        LoginScreen loginScreen = (LoginScreen) this.f9034a;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        Toast.makeText(loginScreen, "Please Retry", 0).show();
    }

    public final Object then(Task task) {
        ((p) this.f9034a).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
