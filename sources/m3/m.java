package m3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import f4.f;
import java.util.Iterator;
import java.util.Set;
import p3.d;
import u3.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9366a = new a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f9366a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        n.a(context).b();
        Set<d> set = d.f10674a;
        synchronized (set) {
        }
        Iterator<d> it = set.iterator();
        if (!it.hasNext()) {
            synchronized (q3.d.f11210r) {
                q3.d dVar = q3.d.f11211s;
                if (dVar != null) {
                    dVar.f11220i.incrementAndGet();
                    f fVar = dVar.f11224n;
                    fVar.sendMessageAtFrontOfQueue(fVar.obtainMessage(10));
                }
            }
            return;
        }
        it.next().getClass();
        throw new UnsupportedOperationException();
    }
}
