package a7;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.c0;
import c6.f;
import c7.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import k0.b;
import n3.c;
import n3.t;
import n3.u;
import n3.v;
import n3.w;
import n3.z;
import s6.i;
import u6.a;
import v6.j;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final f f191a;

    /* renamed from: b  reason: collision with root package name */
    public final s f192b;

    /* renamed from: c  reason: collision with root package name */
    public final c f193c;

    /* renamed from: d  reason: collision with root package name */
    public final a<g> f194d;

    /* renamed from: e  reason: collision with root package name */
    public final a<i> f195e;

    /* renamed from: f  reason: collision with root package name */
    public final v6.f f196f;

    public p(f fVar, s sVar, a<g> aVar, a<i> aVar2, v6.f fVar2) {
        fVar.a();
        c cVar = new c(fVar.f2494a);
        this.f191a = fVar;
        this.f192b = sVar;
        this.f193c = cVar;
        this.f194d = aVar;
        this.f195e = aVar2;
        this.f196f = fVar2;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new o(), new b(this));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String str4;
        String str5;
        int b10;
        PackageInfo b11;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        f fVar = this.f191a;
        fVar.a();
        bundle.putString("gmp_app_id", fVar.f2496c.f2507b);
        s sVar = this.f192b;
        synchronized (sVar) {
            if (sVar.f203d == 0 && (b11 = sVar.b("com.google.android.gms")) != null) {
                sVar.f203d = b11.versionCode;
            }
            i10 = sVar.f203d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        s sVar2 = this.f192b;
        synchronized (sVar2) {
            if (sVar2.f201b == null) {
                sVar2.d();
            }
            str3 = sVar2.f201b;
        }
        bundle.putString("app_ver", str3);
        s sVar3 = this.f192b;
        synchronized (sVar3) {
            if (sVar3.f202c == null) {
                sVar3.d();
            }
            str4 = sVar3.f202c;
        }
        bundle.putString("app_ver_name", str4);
        f fVar2 = this.f191a;
        fVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fVar2.f2495b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a10 = ((j) Tasks.await(this.f196f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f196f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        i iVar = this.f195e.get();
        g gVar = this.f194d.get();
        if (iVar != null && gVar != null && (b10 = iVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(o.g.b(b10)));
            bundle.putString("Firebase-Client", gVar.a());
        }
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        int i10;
        int i11;
        PackageInfo packageInfo;
        try {
            b(str, str2, bundle);
            c cVar = this.f193c;
            v vVar = cVar.f9530c;
            synchronized (vVar) {
                if (vVar.f9571b == 0) {
                    try {
                        packageInfo = y3.c.a(vVar.f9570a).b(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e10) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(valueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        vVar.f9571b = packageInfo.versionCode;
                    }
                }
                i10 = vVar.f9571b;
            }
            if (i10 >= 12000000) {
                u a10 = u.a(cVar.f9529b);
                synchronized (a10) {
                    i11 = a10.f9569d;
                    a10.f9569d = i11 + 1;
                }
                return a10.b(new t(i11, bundle)).continueWith(z.f9580a, c0.f1723g);
            } else if (cVar.f9530c.a() != 0) {
                return cVar.a(bundle).continueWithTask(z.f9580a, new w((Object) cVar, (Object) bundle));
            } else {
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.forException(e11);
        }
    }
}
