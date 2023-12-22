package b3;

import a7.l;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import c6.f;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import e3.b;
import w2.n;
import w2.s;

public final /* synthetic */ class b implements b.a, SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2255b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2256c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f2254a = obj;
        this.f2255b = obj2;
        this.f2256c = obj3;
    }

    public final Object a() {
        c cVar = (c) this.f2254a;
        s sVar = (s) this.f2255b;
        cVar.f2261d.k(sVar, (n) this.f2256c);
        cVar.f2258a.b(sVar, 1);
        return null;
    }

    public final Task then(Object obj) {
        a aVar;
        String str;
        String str2;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2254a;
        String str3 = (String) this.f2255b;
        a.C0033a aVar2 = (a.C0033a) this.f2256c;
        String str4 = (String) obj;
        Context context = firebaseMessaging.f3490d;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.f3484l == null) {
                FirebaseMessaging.f3484l = new a(context);
            }
            aVar = FirebaseMessaging.f3484l;
        }
        f fVar = firebaseMessaging.f3487a;
        fVar.a();
        if ("[DEFAULT]".equals(fVar.f2495b)) {
            str = "";
        } else {
            str = firebaseMessaging.f3487a.f();
        }
        a7.s sVar = firebaseMessaging.f3495i;
        synchronized (sVar) {
            if (sVar.f201b == null) {
                sVar.d();
            }
            str2 = sVar.f201b;
        }
        synchronized (aVar) {
            String a10 = a.C0033a.a(System.currentTimeMillis(), str4, str2);
            if (a10 != null) {
                SharedPreferences.Editor edit = aVar.f3502a.edit();
                edit.putString(a.a(str, str3), a10);
                edit.commit();
            }
        }
        if (aVar2 == null || !str4.equals(aVar2.f3504a)) {
            f fVar2 = firebaseMessaging.f3487a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f2495b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder g10 = androidx.activity.f.g("Invoking onNewToken for app: ");
                    f fVar3 = firebaseMessaging.f3487a;
                    fVar3.a();
                    g10.append(fVar3.f2495b);
                    Log.d("FirebaseMessaging", g10.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str4);
                new l(firebaseMessaging.f3490d).b(intent);
            }
        }
        return Tasks.forResult(str4);
    }
}
