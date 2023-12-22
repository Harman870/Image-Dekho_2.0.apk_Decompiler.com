package com.wallpapersindia.app;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.d;
import b.c;
import c3.n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.textfield.TextInputEditText;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import d.f;
import d3.l;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import l8.g;
import m3.m;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;
import z5.b;
import z5.s;

public class LoginScreen extends f implements View.OnClickListener, BackgroundWorker.a {
    public static final /* synthetic */ int K = 0;
    public CheckBox A;
    public Button B;
    public k1.a C;
    public l3.a D;
    public g E;
    public String F = "";
    public String G;
    public long H;
    public b.c I;
    public d J;

    /* renamed from: x  reason: collision with root package name */
    public TextView f5826x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f5827y;

    /* renamed from: z  reason: collision with root package name */
    public TextInputEditText f5828z;

    public class a implements k1.b {
        public a() {
        }

        public final void a(int i10) {
            if (i10 == 0) {
                try {
                    String string = ((Bundle) LoginScreen.this.C.A().f5966a).getString("install_referrer");
                    k1.a aVar = LoginScreen.this.C;
                    aVar.f9042b = 3;
                    if (aVar.f9045e != null) {
                        y3.a.n("Unbinding from service.");
                        aVar.f9043c.unbindService(aVar.f9045e);
                        aVar.f9045e = null;
                    }
                    aVar.f9044d = null;
                    LoginScreen loginScreen = LoginScreen.this;
                    loginScreen.E.b(loginScreen.getString(R.string.referral_code), string);
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    static {
        System.loadLibrary("app");
    }

    public LoginScreen() {
        new String(Base64.decode(ys(), 0));
        this.H = Long.parseLong(new String(Base64.decode(yg(), 0)));
        c cVar = new c();
        n nVar = new n(this);
        ComponentActivity.b bVar = this.f235i;
        StringBuilder g10 = androidx.activity.f.g("activity_rq#");
        g10.append(this.f234h.getAndIncrement());
        this.J = bVar.c(g10.toString(), this, cVar, nVar);
    }

    public final String A(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: finally extract failed */
    public void onClick(View view) {
        Intent intent;
        GoogleSignInAccount googleSignInAccount;
        Intent intent2;
        if (view.getId() == R.id.login_button) {
            Editable text = this.f5828z.getText();
            Objects.requireNonNull(text);
            if (text.toString().length() != 10) {
                Toast.makeText(this, "Enter Paytm Number", 0).show();
                this.f5828z.setError("Enter Valid Paytm Number");
                this.f5828z.requestFocus();
            } else if (this.f5828z.getText().toString().equals(getString(R.string.demo_phone))) {
                this.I.a(new s(A(getString(R.string.demo_email) + getString(R.string.demo_phone) + getString(R.string.demo_id)))).addOnSuccessListener(new h8.c(this)).addOnFailureListener(new c3.g(this));
            } else if (this.f5828z.getText().toString().equals(getString(R.string.demo_phone1))) {
                this.I.a(new s(A(getString(R.string.demo_email1) + getString(R.string.demo_phone1) + getString(R.string.demo_id1)))).addOnSuccessListener(new l(this)).addOnFailureListener(new u2.b(2, this));
            } else if (this.A.isChecked()) {
                m3.n a10 = m3.n.a(this);
                synchronized (a10) {
                    try {
                        googleSignInAccount = a10.f9369b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (googleSignInAccount != null) {
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
                    new HashSet();
                    new HashMap();
                    o.h(googleSignInOptions);
                    HashSet hashSet = new HashSet(googleSignInOptions.f2784b);
                    boolean z9 = googleSignInOptions.f2787e;
                    boolean z10 = googleSignInOptions.f2788f;
                    boolean z11 = googleSignInOptions.f2786d;
                    String str = googleSignInOptions.f2789g;
                    Account account = googleSignInOptions.f2785c;
                    String str2 = googleSignInOptions.f2790h;
                    HashMap y9 = GoogleSignInOptions.y(googleSignInOptions.f2791i);
                    String str3 = googleSignInOptions.f2792j;
                    hashSet.add(GoogleSignInOptions.f2778l);
                    if (hashSet.contains(GoogleSignInOptions.f2781o)) {
                        Scope scope = GoogleSignInOptions.f2780n;
                        if (hashSet.contains(scope)) {
                            hashSet.remove(scope);
                        }
                    }
                    if (z11 && (account == null || !hashSet.isEmpty())) {
                        hashSet.add(GoogleSignInOptions.f2779m);
                    }
                    new l3.a((Activity) this, new GoogleSignInOptions(3, new ArrayList(hashSet), account, z11, z9, z10, str, str2, y9, str3)).c();
                }
                l3.a aVar = this.D;
                Context context = aVar.f10661a;
                int d10 = aVar.d();
                int i10 = d10 - 1;
                if (d10 != 0) {
                    if (i10 == 2) {
                        m.f9366a.a("getFallbackSignInIntent()", new Object[0]);
                        intent2 = m.a(context, (GoogleSignInOptions) aVar.f10664d);
                        intent2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                    } else if (i10 != 3) {
                        m.f9366a.a("getNoImplementationSignInIntent()", new Object[0]);
                        intent2 = m.a(context, (GoogleSignInOptions) aVar.f10664d);
                        intent2.setAction("com.google.android.gms.auth.NO_IMPL");
                    } else {
                        intent2 = m.a(context, (GoogleSignInOptions) aVar.f10664d);
                    }
                    this.J.A(intent2);
                    return;
                }
                throw null;
            } else {
                Toast.makeText(this, "Accept Terms and Condition", 0).show();
            }
        } else {
            if (view.getId() == R.id.pp_text) {
                intent = new Intent(this, PP.class);
            } else if (view.getId() == R.id.tnc_text) {
                intent = new Intent(this, TNC.class);
            } else {
                return;
            }
            startActivity(intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137  */
    @android.annotation.SuppressLint({"HardwareIds"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            r14 = 2131492894(0x7f0c001e, float:1.8609253E38)
            r13.setContentView((int) r14)
            com.google.firebase.auth.FirebaseAuth.getInstance()
            android.content.ContentResolver r14 = r13.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r14 = android.provider.Settings.Secure.getString(r14, r0)
            r13.G = r14
            l8.g r14 = new l8.g
            r14.<init>(r13)
            r13.E = r14
            z5.b r14 = c6.b.q(r13)
            long r0 = r13.H
            z5.r r2 = new z5.r
            r2.<init>(r0)
            com.google.android.gms.tasks.Task r14 = r14.a(r2)
            c3.s r0 = new c3.s
            r0.<init>(r13)
            com.google.android.gms.tasks.Task r14 = r14.addOnSuccessListener(r0)
            k0.b r0 = new k0.b
            r0.<init>(r13)
            r14.addOnFailureListener(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.k
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.o.h(r14)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r14.f2784b
            r0.<init>(r1)
            boolean r7 = r14.f2787e
            boolean r8 = r14.f2788f
            boolean r6 = r14.f2786d
            java.lang.String r9 = r14.f2789g
            android.accounts.Account r5 = r14.f2785c
            java.lang.String r10 = r14.f2790h
            java.util.ArrayList<m3.a> r1 = r14.f2791i
            java.util.HashMap r11 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.y(r1)
            java.lang.String r12 = r14.f2792j
            com.google.android.gms.common.api.Scope r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2778l
            r0.add(r14)
            com.google.android.gms.common.api.Scope r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2781o
            boolean r14 = r0.contains(r14)
            if (r14 == 0) goto L_0x0081
            com.google.android.gms.common.api.Scope r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2780n
            boolean r1 = r0.contains(r14)
            if (r1 == 0) goto L_0x0081
            r0.remove(r14)
        L_0x0081:
            if (r6 == 0) goto L_0x0090
            if (r5 == 0) goto L_0x008b
            boolean r14 = r0.isEmpty()
            if (r14 != 0) goto L_0x0090
        L_0x008b:
            com.google.android.gms.common.api.Scope r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2779m
            r0.add(r14)
        L_0x0090:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r14 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3 = 3
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            l3.a r0 = new l3.a
            r0.<init>((android.app.Activity) r13, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r14)
            r13.D = r0
            k1.a r14 = new k1.a
            r14.<init>(r13)
            r13.C = r14
            com.wallpapersindia.app.LoginScreen$a r0 = new com.wallpapersindia.app.LoginScreen$a
            r0.<init>()
            int r1 = r14.f9042b
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 != r4) goto L_0x00c0
            h3.a r5 = r14.f9044d
            if (r5 == 0) goto L_0x00c0
            k1.a$a r5 = r14.f9045e
            if (r5 == 0) goto L_0x00c0
            r5 = r2
            goto L_0x00c1
        L_0x00c0:
            r5 = r3
        L_0x00c1:
            if (r5 == 0) goto L_0x00cd
            java.lang.String r14 = "Service connection is valid. No need to re-initialize."
            y3.a.n(r14)
            r0.a(r3)
            goto L_0x017a
        L_0x00cd:
            r5 = 3
            if (r1 != r2) goto L_0x00d3
            java.lang.String r14 = "Client is already in the process of connecting to the service."
            goto L_0x00d7
        L_0x00d3:
            if (r1 != r5) goto L_0x00df
            java.lang.String r14 = "Client was already closed and can't be reused. Please create another instance."
        L_0x00d7:
            y3.a.o(r14)
            r0.a(r5)
            goto L_0x017a
        L_0x00df:
            java.lang.String r1 = "Starting install referrer service setup."
            y3.a.n(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r1.<init>(r5)
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "com.android.vending"
            java.lang.String r7 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r5.<init>(r6, r7)
            r1.setComponent(r5)
            android.content.Context r5 = r14.f9043c
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.util.List r5 = r5.queryIntentServices(r1, r3)
            if (r5 == 0) goto L_0x0170
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0170
            java.lang.Object r5 = r5.get(r3)
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ServiceInfo r5 = r5.serviceInfo
            if (r5 == 0) goto L_0x0170
            java.lang.String r7 = r5.packageName
            java.lang.String r5 = r5.name
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0168
            if (r5 == 0) goto L_0x0168
            android.content.Context r5 = r14.f9043c
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x0134 }
            int r5 = r5.versionCode     // Catch:{ NameNotFoundException -> 0x0134 }
            r6 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r5 < r6) goto L_0x0134
            r5 = r2
            goto L_0x0135
        L_0x0134:
            r5 = r3
        L_0x0135:
            if (r5 == 0) goto L_0x0168
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r1)
            k1.a$a r1 = new k1.a$a
            r1.<init>(r0)
            r14.f9045e = r1
            android.content.Context r5 = r14.f9043c     // Catch:{ SecurityException -> 0x015c }
            boolean r1 = r5.bindService(r4, r1, r2)     // Catch:{ SecurityException -> 0x015c }
            if (r1 == 0) goto L_0x0151
            java.lang.String r14 = "Service was bonded successfully."
            y3.a.n(r14)
            goto L_0x017a
        L_0x0151:
            java.lang.String r1 = "Connection to service is blocked."
            y3.a.o(r1)
            r14.f9042b = r3
            r0.a(r2)
            goto L_0x017a
        L_0x015c:
            java.lang.String r1 = "No permission to connect to service."
            y3.a.o(r1)
            r14.f9042b = r3
            r14 = 4
            r0.a(r14)
            goto L_0x017a
        L_0x0168:
            java.lang.String r1 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            y3.a.o(r1)
            r14.f9042b = r3
            goto L_0x0177
        L_0x0170:
            r14.f9042b = r3
            java.lang.String r14 = "Install Referrer service unavailable on device."
            y3.a.n(r14)
        L_0x0177:
            r0.a(r4)
        L_0x017a:
            r14 = 2131296695(0x7f0901b7, float:1.8211314E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r13.f5827y = r14
            r14 = 2131296862(0x7f09025e, float:1.8211653E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r13.f5826x = r14
            r14 = 2131296861(0x7f09025d, float:1.821165E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.CheckBox r14 = (android.widget.CheckBox) r14
            r13.A = r14
            r14 = 2131296558(0x7f09012e, float:1.8211036E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.Button r14 = (android.widget.Button) r14
            r13.B = r14
            r14 = 2131296690(0x7f0901b2, float:1.8211304E38)
            android.view.View r14 = r13.findViewById(r14)
            com.google.android.material.textfield.TextInputEditText r14 = (com.google.android.material.textfield.TextInputEditText) r14
            r13.f5828z = r14
            android.widget.TextView r14 = r13.f5827y
            int r0 = r14.getPaintFlags()
            r0 = r0 | 8
            r14.setPaintFlags(r0)
            android.widget.TextView r14 = r13.f5826x
            int r0 = r14.getPaintFlags()
            r0 = r0 | 8
            r14.setPaintFlags(r0)
            android.widget.Button r14 = r13.B
            r14.setOnClickListener(r13)
            android.widget.TextView r14 = r13.f5826x
            r14.setOnClickListener(r13)
            android.widget.TextView r14 = r13.f5827y
            r14.setOnClickListener(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wallpapersindia.app.LoginScreen.onCreate(android.os.Bundle):void");
    }

    public final void s(int i10, String str, String str2) {
        GoogleSignInAccount googleSignInAccount;
        if (str2.equals(getString(R.string.signup))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (i10 == 200) {
                    g gVar = this.E;
                    gVar.f9254a.edit().remove(getString(R.string.referral_code)).apply();
                    JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                    this.E.b(getString(R.string.id), jSONObject2.getString(getString(R.string.id)));
                    this.E.b(getString(R.string.email), jSONObject2.getString(getString(R.string.email)));
                    this.E.b(getString(R.string.name), jSONObject2.getString(getString(R.string.name)));
                    this.E.b(getString(R.string.image), jSONObject2.getString(getString(R.string.image)));
                    this.E.b(getString(R.string.phone), jSONObject2.getString(getString(R.string.phone)));
                    this.E.b(getString(R.string.redeem_today), jSONObject2.getString(getString(R.string.redeem_today)));
                    this.E.b(getString(R.string.uat), jSONObject.getString(getString(R.string.uat)));
                    this.E.b(getString(R.string.user_balance), jSONObject2.getString(getString(R.string.balance)));
                    this.E.b(getString(R.string.refer_reward), jSONObject.getString(getString(R.string.refer_reward)));
                    this.E.b(getString(R.string.redeem_data), jSONObject.getString(getString(R.string.redeem_data)));
                    this.E.b(getString(R.string.task_click_data), jSONObject.getString(getString(R.string.task_click_data)));
                    this.E.b(getString(R.string.show_self_ads), jSONObject.getString(getString(R.string.show_self_ads)));
                    this.E.b(getString(R.string.redeem_validation_required), jSONObject.getString(getString(R.string.redeem_validation_required)));
                    this.E.b(getString(R.string.task_imration_interval), jSONObject.getString(getString(R.string.task_imration_interval)));
                    this.E.b(getString(R.string.is_ironsource_enabled), jSONObject.getString(getString(R.string.is_ironsource_enabled)));
                    this.E.b(getString(R.string.max_spin_reward), jSONObject.getString(getString(R.string.max_spin_reward)));
                    this.E.b(getString(R.string.spin_remaining), jSONObject.getString(getString(R.string.spin_remaining)));
                    this.E.b(getString(R.string.redeem_count), jSONObject.getString(getString(R.string.redeem_count)));
                    this.E.b(getString(R.string.redeems_list), jSONObject.getString(getString(R.string.redeems_list)));
                    this.E.b(getString(R.string.show_ad), jSONObject.getString(getString(R.string.show_ad)));
                    Intent intent = new Intent(this, HomeScreen.class);
                    intent.setFlags(268468224);
                    startActivity(intent);
                    return;
                }
                String string = jSONObject.getString("message");
                l2.d dVar = new l2.d(this, 1);
                dVar.s("Error");
                dVar.o(string);
                dVar.i();
                dVar.m("Close");
                dVar.V = null;
                dVar.show();
                m3.n a10 = m3.n.a(this);
                synchronized (a10) {
                    googleSignInAccount = a10.f9369b;
                }
                if (googleSignInAccount != null) {
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
                    new HashSet();
                    new HashMap();
                    o.h(googleSignInOptions);
                    HashSet hashSet = new HashSet(googleSignInOptions.f2784b);
                    boolean z9 = googleSignInOptions.f2787e;
                    boolean z10 = googleSignInOptions.f2788f;
                    boolean z11 = googleSignInOptions.f2786d;
                    String str3 = googleSignInOptions.f2789g;
                    Account account = googleSignInOptions.f2785c;
                    String str4 = googleSignInOptions.f2790h;
                    HashMap y9 = GoogleSignInOptions.y(googleSignInOptions.f2791i);
                    String str5 = googleSignInOptions.f2792j;
                    hashSet.add(GoogleSignInOptions.f2778l);
                    if (hashSet.contains(GoogleSignInOptions.f2781o)) {
                        Scope scope = GoogleSignInOptions.f2780n;
                        if (hashSet.contains(scope)) {
                            hashSet.remove(scope);
                        }
                    }
                    if (z11 && (account == null || !hashSet.isEmpty())) {
                        hashSet.add(GoogleSignInOptions.f2779m);
                    }
                    GoogleSignInOptions googleSignInOptions2 = r8;
                    GoogleSignInOptions googleSignInOptions3 = new GoogleSignInOptions(3, new ArrayList(hashSet), account, z11, z9, z10, str3, str4, y9, str5);
                    new l3.a((Activity) this, googleSignInOptions2).c();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                l2.d dVar2 = new l2.d(this, 1);
                dVar2.s("Error");
                dVar2.o("Something Is Wrong Please Retry");
                dVar2.i();
                dVar2.m("Close");
                dVar2.V = null;
                dVar2.show();
                m3.n a11 = m3.n.a(this);
                synchronized (a11) {
                    try {
                        if (a11.f9369b != null) {
                            GoogleSignInOptions googleSignInOptions4 = GoogleSignInOptions.k;
                            new HashSet();
                            new HashMap();
                            o.h(googleSignInOptions4);
                            HashSet hashSet2 = new HashSet(googleSignInOptions4.f2784b);
                            boolean z12 = googleSignInOptions4.f2787e;
                            boolean z13 = googleSignInOptions4.f2788f;
                            boolean z14 = googleSignInOptions4.f2786d;
                            String str6 = googleSignInOptions4.f2789g;
                            Account account2 = googleSignInOptions4.f2785c;
                            String str7 = googleSignInOptions4.f2790h;
                            HashMap y10 = GoogleSignInOptions.y(googleSignInOptions4.f2791i);
                            String str8 = googleSignInOptions4.f2792j;
                            hashSet2.add(GoogleSignInOptions.f2778l);
                            if (hashSet2.contains(GoogleSignInOptions.f2781o)) {
                                Scope scope2 = GoogleSignInOptions.f2780n;
                                if (hashSet2.contains(scope2)) {
                                    hashSet2.remove(scope2);
                                }
                            }
                            if (z14 && (account2 == null || !hashSet2.isEmpty())) {
                                hashSet2.add(GoogleSignInOptions.f2779m);
                            }
                            new l3.a((Activity) this, new GoogleSignInOptions(3, new ArrayList(hashSet2), account2, z14, z12, z13, str6, str7, y10, str8)).c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public native String yg();

    public native String ys();
}
