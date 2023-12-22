package m3;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f9356c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d  reason: collision with root package name */
    public static b f9357d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f9358a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f9359b;

    public b(Context context) {
        this.f9359b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        o.h(context);
        ReentrantLock reentrantLock = f9356c;
        reentrantLock.lock();
        try {
            if (f9357d == null) {
                f9357d = new b(context.getApplicationContext());
            }
            b bVar = f9357d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            f9356c.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(g("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.y(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.x(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        o.h(googleSignInOptions);
        f("defaultGoogleSignInAccount", googleSignInAccount.f2774i);
        String str = googleSignInAccount.f2774i;
        String g10 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f2767b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f2768c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f2769d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f2770e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f2776l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f2771f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f2772g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f2773h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f2774i);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.f2775j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, l3.b.f9239a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f2804b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g10, jSONObject.toString());
            String g11 = g("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.f2784b, GoogleSignInOptions.f2782p);
                Iterator<Scope> it = googleSignInOptions.f2784b.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().f2804b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f2785c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f2786d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f2788f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f2787e);
                if (!TextUtils.isEmpty(googleSignInOptions.f2789g)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.f2789g);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.f2790h)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.f2790h);
                }
                f(g11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        this.f9358a.lock();
        try {
            return this.f9359b.getString(str, (String) null);
        } finally {
            this.f9358a.unlock();
        }
    }

    public final void f(String str, String str2) {
        this.f9358a.lock();
        try {
            this.f9359b.edit().putString(str, str2).apply();
        } finally {
            this.f9358a.unlock();
        }
    }
}
