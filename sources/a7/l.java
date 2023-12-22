package a7;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import c3.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import q4.a;
import w3.g;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f172c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static n0 f173d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f174a;

    /* renamed from: b  reason: collision with root package name */
    public final h f175b = new h();

    public l(Context context) {
        this.f174a = context;
    }

    public static Task<Integer> a(Context context, Intent intent) {
        n0 n0Var;
        n0 n0Var2;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (d0.a().c(context)) {
            synchronized (f172c) {
                if (f173d == null) {
                    f173d = new n0(context);
                }
                n0Var2 = f173d;
            }
            synchronized (l0.f177b) {
                if (l0.f178c == null) {
                    a aVar = new a(context, "wake:com.google.firebase.iid.WakeLockHolder");
                    l0.f178c = aVar;
                    synchronized (aVar.f11321a) {
                        aVar.f11327g = true;
                    }
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    l0.f178c.a(l0.f176a);
                }
                n0Var2.b(intent).addOnCompleteListener(new d3.l(intent));
            }
        } else {
            synchronized (f172c) {
                if (f173d == null) {
                    f173d = new n0(context);
                }
                n0Var = f173d;
            }
            n0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f174a;
        boolean z9 = true;
        boolean z10 = g.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z9 = false;
        }
        return (!z10 || z9) ? Tasks.call(this.f175b, new k(context, 0, intent)).continueWithTask(this.f175b, new o(context, intent)) : a(context, intent);
    }
}
