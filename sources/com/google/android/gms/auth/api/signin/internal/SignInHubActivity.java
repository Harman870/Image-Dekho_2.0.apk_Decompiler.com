package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.p;
import androidx.lifecycle.l;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Modifier;
import java.util.Set;
import m3.f;
import m3.n;
import m3.u;
import p3.d;
import z0.a;
import z0.b;

@KeepName
public class SignInHubActivity extends p {
    public static boolean B = false;
    public Intent A;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public SignInConfiguration f2798x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2799y;

    /* renamed from: z  reason: collision with root package name */
    public int f2800z;

    public final void A(int i10) {
        Status status = new Status(i10, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        B = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.w) {
            setResult(0);
            if (i10 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.f2794b) != null) {
                        n a10 = n.a(this);
                        GoogleSignInOptions googleSignInOptions = this.f2798x.f2797b;
                        googleSignInAccount.getClass();
                        synchronized (a10) {
                            a10.f9368a.d(googleSignInAccount, googleSignInOptions);
                            a10.f9369b = googleSignInAccount;
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f2799y = true;
                        this.f2800z = i11;
                        this.A = intent;
                        z();
                        return;
                    } else if (intent.hasExtra(IronSourceConstants.EVENTS_ERROR_CODE)) {
                        int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        A(intExtra);
                        return;
                    }
                }
                A(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            A(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f2798x = signInConfiguration;
            if (bundle != null) {
                boolean z9 = bundle.getBoolean("signingInGoogleApiClients");
                this.f2799y = z9;
                if (z9) {
                    this.f2800z = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.A = intent2;
                    z();
                }
            } else if (B) {
                setResult(0);
                A(12502);
            } else {
                B = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    str = "com.google.android.gms";
                } else {
                    str = getPackageName();
                }
                intent3.setPackage(str);
                intent3.putExtra("config", this.f2798x);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.w = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    A(17);
                }
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        B = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f2799y);
        if (this.f2799y) {
            bundle.putInt("signInResultCode", this.f2800z);
            bundle.putParcelable("signInResultData", this.A);
        }
    }

    public final void z() {
        b a10 = a.a(this);
        u uVar = new u(this);
        if (a10.f13125b.f13136d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            b.a aVar = (b.a) a10.f13125b.f13135c.e(0, (Integer) null);
            if (aVar == null) {
                Class<f> cls = f.class;
                try {
                    a10.f13125b.f13136d = true;
                    Set<d> set = d.f10674a;
                    synchronized (set) {
                    }
                    f fVar = new f(this, set);
                    if (cls.isMemberClass()) {
                        if (!Modifier.isStatic(cls.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fVar);
                        }
                    }
                    b.a aVar2 = new b.a(fVar);
                    a10.f13125b.f13135c.f(0, aVar2);
                    a10.f13125b.f13136d = false;
                    l lVar = a10.f13124a;
                    b.C0174b<D> bVar = new b.C0174b<>(aVar2.f13128n, uVar);
                    aVar2.d(lVar, bVar);
                    b.C0174b<D> bVar2 = aVar2.f13130p;
                    if (bVar2 != null) {
                        aVar2.h(bVar2);
                    }
                    aVar2.f13129o = lVar;
                    aVar2.f13130p = bVar;
                } catch (Throwable th) {
                    a10.f13125b.f13136d = false;
                    throw th;
                }
            } else {
                l lVar2 = a10.f13124a;
                b.C0174b<D> bVar3 = new b.C0174b<>(aVar.f13128n, uVar);
                aVar.d(lVar2, bVar3);
                b.C0174b<D> bVar4 = aVar.f13130p;
                if (bVar4 != null) {
                    aVar.h(bVar4);
                }
                aVar.f13129o = lVar2;
                aVar.f13130p = bVar3;
            }
            B = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }
}
