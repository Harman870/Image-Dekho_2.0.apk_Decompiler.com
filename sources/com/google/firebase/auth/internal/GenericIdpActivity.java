package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import b1.a;
import c6.b;
import c6.f;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import i4.k;
import i4.kg;
import i4.lg;
import i4.qf;
import i4.rf;
import i4.we;
import i6.h;
import i6.u;
import i6.v;
import i6.y;
import i6.z;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;
import y.a;

@KeepName
public class GenericIdpActivity extends p implements rf {

    /* renamed from: y  reason: collision with root package name */
    public static long f3474y;

    /* renamed from: z  reason: collision with root package name */
    public static final v f3475z = v.f7927b;
    public final ExecutorService w = b.C();

    /* renamed from: x  reason: collision with root package name */
    public boolean f3476x = false;

    public final void A(Status status) {
        f3474y = 0;
        this.f3476x = false;
        Intent intent = new Intent();
        HashMap hashMap = u.f7926a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        v vVar = f3475z;
        Context applicationContext = getApplicationContext();
        vVar.getClass();
        v.a(applicationContext, status);
        finish();
    }

    /* JADX INFO: finally extract failed */
    public final Uri.Builder a(Intent intent, String str, String str2) {
        String str3;
        String str4;
        String str5;
        boolean z9;
        boolean z10;
        Intent intent2 = intent;
        String str6 = str;
        Uri.Builder appendPath = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            str3 = null;
        } else {
            str3 = TextUtils.join(",", stringArrayListExtra);
        }
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str4 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(next, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str4 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        try {
            str5 = new String(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes()));
            int length = str5.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                char charAt = str5.charAt(i10);
                if (charAt < 'A' || charAt > 'Z') {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    char[] charArray = str5.toCharArray();
                    while (i10 < length) {
                        char c10 = charArray[i10];
                        if (c10 < 'A' || c10 > 'Z') {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            charArray[i10] = (char) (c10 ^ ' ');
                        }
                        i10++;
                    }
                    str5 = String.valueOf(charArray);
                } else {
                    i10++;
                }
            }
        } catch (NoSuchAlgorithmException unused2) {
            rf.f7650b0.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            str5 = null;
        }
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        y yVar = y.f7930a;
        Context applicationContext = getApplicationContext();
        synchronized (yVar) {
            try {
                o.e(str);
                o.e(uuid);
                o.e(str5);
                o.e(stringExtra4);
                SharedPreferences b10 = y.b(applicationContext, str6);
                y.a(b10);
                SharedPreferences.Editor edit = b10.edit();
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{uuid}), str5);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), action);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{uuid}), stringExtra2);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra4);
                edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        String c11 = z.a(getApplicationContext(), f.e(stringExtra4).f()).c();
        if (TextUtils.isEmpty(c11)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            A(h.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
        } else {
            if (str5 != null) {
                appendPath.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str5).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str6).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c11);
                if (!TextUtils.isEmpty(str3)) {
                    appendPath.appendQueryParameter("scopes", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    appendPath.appendQueryParameter("customParameters", str4);
                }
                if (TextUtils.isEmpty(stringExtra3)) {
                    return appendPath;
                }
                appendPath.appendQueryParameter("tid", stringExtra3);
                return appendPath;
            }
        }
        return null;
    }

    public final String d(String str) {
        return lg.a(str);
    }

    public final void f(Status status) {
        if (status == null) {
            z();
        } else {
            A(status);
        }
    }

    public final void g(String str, Uri uri) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                x.h.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                intent2.putExtras(bundle);
            }
            intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent2.putExtras(new Bundle());
            intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            intent2.setData(uri);
            Object obj = y.a.f13006a;
            a.C0168a.b(this, intent2, (Bundle) null);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        f((Status) null);
    }

    public final HttpURLConnection i(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f3474y < 30000) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f3474y = currentTimeMillis;
            if (bundle != null) {
                this.f3476x = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        z();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        kg kgVar;
        we weVar;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                A(u.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                z();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (y.f7930a) {
                    o.e(packageName);
                    o.e(stringExtra2);
                    SharedPreferences b10 = y.b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{stringExtra2});
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{stringExtra2});
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    String string = b10.getString(format, (String) null);
                    String string2 = b10.getString(format2, (String) null);
                    String string3 = b10.getString(format3, (String) null);
                    String string4 = b10.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = b10.getString(format4, (String) null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    if (string == null || string2 == null || string3 == null) {
                        weVar = null;
                    } else {
                        weVar = new we(string, string2, string3, string4, string5);
                    }
                }
                if (weVar == null) {
                    z();
                }
                if (booleanExtra) {
                    stringExtra = z.a(getApplicationContext(), f.e((String) weVar.f7774e).f()).b(stringExtra);
                }
                k kVar = new k(weVar, stringExtra);
                String str2 = (String) weVar.f7773d;
                String str3 = (String) weVar.f7771b;
                kVar.f7424n = str2;
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str3)) {
                    f3474y = 0;
                    this.f3476x = false;
                    Intent intent2 = new Intent();
                    Parcel obtain = Parcel.obtain();
                    kVar.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str3);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    b1.a.a(this).b(intent2);
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    Parcel obtain2 = Parcel.obtain();
                    kVar.writeToParcel(obtain2, 0);
                    byte[] marshall2 = obtain2.marshall();
                    obtain2.recycle();
                    if (marshall2 != null) {
                        str = Base64.encodeToString(marshall2, 10);
                    }
                    edit2.putString("verifyAssertionRequest", str);
                    edit2.putString("operation", str3);
                    edit2.putString("tenantId", str2);
                    edit2.putLong("timestamp", System.currentTimeMillis());
                    edit2.commit();
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(str3));
                z();
            }
        } else if (!this.f3476x) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = c0.e(w3.a.a(this, packageName2)).toLowerCase(Locale.US);
                f e10 = f.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                m.b bVar = lg.f7482a;
                e10.a();
                if (!bVar.containsKey(e10.f2496c.f2506a)) {
                    new qf(packageName2, lowerCase, getIntent(), e10, this).executeOnExecutor(this.w, new Void[0]);
                    this.f3476x = true;
                    return;
                }
                e10.a();
                String str4 = e10.f2496c.f2506a;
                synchronized (bVar) {
                    kgVar = (kg) bVar.getOrDefault(str4, null);
                }
                if (kgVar == null) {
                    throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + e11.toString());
                f((Status) null);
            }
        } else {
            z();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f3476x);
    }

    public final void z() {
        f3474y = 0;
        this.f3476x = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b1.a.a(this).b(intent);
        v vVar = f3475z;
        Status a10 = h.a("WEB_CONTEXT_CANCELED");
        vVar.getClass();
        v.a(this, a10);
        finish();
    }

    public final Context zza() {
        return getApplicationContext();
    }
}
