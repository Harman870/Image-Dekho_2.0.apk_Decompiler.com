package c3;

import a7.j0;
import android.database.Cursor;
import android.net.Uri;
import android.text.Editable;
import android.widget.Toast;
import androidx.activity.result.a;
import c6.f;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.wallpapersindia.app.LoginScreen;
import com.wallpapersindia.app.RedeemScreen;
import d3.o;
import d3.x;
import e3.b;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import z2.c;
import z5.s;

public final /* synthetic */ class n implements b.a, x.a, OnSuccessListener, OnCompleteListener, androidx.activity.result.b, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2413a;

    public /* synthetic */ n(Object obj) {
        this.f2413a = obj;
    }

    public final Object a() {
        ((q) this.f2413a).f2427i.o();
        return null;
    }

    public final Object apply(Object obj) {
        x xVar = (x) this.f2413a;
        Cursor cursor = (Cursor) obj;
        t2.b bVar = x.f6090f;
        xVar.getClass();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            xVar.j((long) i10, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public final void b(Object obj) {
        GoogleSignInAccount googleSignInAccount;
        String str;
        LoginScreen loginScreen = (LoginScreen) this.f2413a;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        if (((a) obj).f288a == -1) {
            m3.n a10 = m3.n.a(loginScreen);
            synchronized (a10) {
                googleSignInAccount = a10.f9369b;
            }
            if (googleSignInAccount != null) {
                Uri uri = googleSignInAccount.f2771f;
                if (uri != null) {
                    str = uri.toString();
                } else {
                    str = "0";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(googleSignInAccount.f2769d);
                Editable text = loginScreen.f5828z.getText();
                Objects.requireNonNull(text);
                sb.append(text);
                sb.append(googleSignInAccount.f2767b);
                loginScreen.I.a(new s(loginScreen.A(sb.toString()))).addOnSuccessListener(new o(loginScreen, googleSignInAccount, str)).addOnFailureListener(new h8.c(loginScreen));
                return;
            }
            Toast.makeText(loginScreen, "Login Failed", 0).show();
            return;
        }
        Toast.makeText(loginScreen, "Error Login Failed", 0).show();
    }

    public final void onComplete(Task task) {
        ((ScheduledFuture) this.f2413a).cancel(false);
    }

    public final void onFailure(Exception exc) {
        RedeemScreen redeemScreen = (RedeemScreen) this.f2413a;
        int i10 = RedeemScreen.T;
        redeemScreen.getClass();
        Toast.makeText(redeemScreen, "Please Retry After Sometime", 1).show();
        if (redeemScreen.Q.isShowing()) {
            redeemScreen.Q.hide();
        }
    }

    public final void onSuccess(Object obj) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        j0 j0Var = (j0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f3484l;
        FirebaseMessaging.a aVar2 = ((FirebaseMessaging) this.f2413a).f3493g;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f3499c;
            if (bool != null) {
                z9 = bool.booleanValue();
            } else {
                f fVar = FirebaseMessaging.this.f3487a;
                fVar.a();
                z6.a aVar3 = fVar.f2500g.get();
                synchronized (aVar3) {
                    z12 = aVar3.f13229b;
                }
                z9 = z12;
            }
        }
        if (z9) {
            if (j0Var.f158h.a() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (j0Var) {
                    z11 = j0Var.f157g;
                }
                if (!z11) {
                    j0Var.f(0);
                }
            }
        }
    }
}
