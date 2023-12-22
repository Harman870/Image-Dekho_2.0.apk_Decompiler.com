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
import android.util.Log;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import b1.a;
import c6.b;
import c6.f;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import i4.lg;
import i4.qf;
import i4.rf;
import i6.h;
import i6.u;
import i6.v;
import i6.y;
import i6.z;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import r3.o;
import y.a;

public class RecaptchaActivity extends p implements rf {

    /* renamed from: x  reason: collision with root package name */
    public static final ExecutorService f3477x = b.C();

    /* renamed from: y  reason: collision with root package name */
    public static long f3478y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final v f3479z = v.f7927b;
    public boolean w = false;

    public final void A(Status status) {
        f3478y = 0;
        this.w = false;
        Intent intent = new Intent();
        HashMap hashMap = u.f7926a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        f3479z.f7928a.getClass();
        i6.p.a(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final Uri.Builder a(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f e10 = f.e(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(e10);
        y yVar = y.f7930a;
        Context applicationContext = getApplicationContext();
        synchronized (yVar) {
            o.e(str);
            o.e(uuid);
            SharedPreferences b10 = y.b(applicationContext, str);
            y.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra3);
            edit.apply();
        }
        String c10 = z.a(getApplicationContext(), e10.f()).c();
        String str3 = null;
        if (TextUtils.isEmpty(c10)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            A(h.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.f3465g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.f3465g) {
            }
        } else {
            str3 = y3.a.L();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
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
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            intent2.setData(uri);
            Object obj = y.a.f13006a;
            a.C0168a.b(this, intent2, (Bundle) null);
            return;
        }
        Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        f((Status) null);
    }

    public final HttpURLConnection i(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            rf.f7650b0.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f3478y < 30000) {
                Log.e("RecaptchaActivity", "Could not start operation - already in progress");
                return;
            }
            f3478y = currentTimeMillis;
            if (bundle != null) {
                this.w = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        Log.e("RecaptchaActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        z();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String string;
        boolean isEmpty;
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
                y yVar = y.f7930a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (yVar) {
                    o.e(packageName);
                    o.e(stringExtra2);
                    SharedPreferences b10 = y.b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String string2 = b10.getString(format, (String) null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    string = b10.getString(format2, (String) null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    A(h.a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = z.a(getApplicationContext(), f.e(str).f()).b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f3478y = 0;
                this.w = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                b1.a.a(this).b(intent2);
                SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit2.putString("recaptchaToken", queryParameter);
                edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                edit2.putLong("timestamp", System.currentTimeMillis());
                edit2.commit();
                finish();
            }
        } else if (!this.w) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                new qf(packageName2, c0.e(w3.a.a(this, packageName2)).toLowerCase(Locale.US), intent3, f.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f3477x, new Void[0]);
            } catch (PackageManager.NameNotFoundException e10) {
                String obj = e10.toString();
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + " " + obj);
                f((Status) null);
            }
            this.w = true;
        } else {
            z();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.w);
    }

    public final void z() {
        f3478y = 0;
        this.w = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b1.a.a(this).b(intent);
        f3479z.f7928a.getClass();
        i6.p.a(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final Context zza() {
        return getApplicationContext();
    }
}
