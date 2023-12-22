package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.j.f;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

public class ControllerActivity extends Activity implements z, f {

    /* renamed from: a  reason: collision with root package name */
    public String f5337a;

    /* renamed from: b  reason: collision with root package name */
    public A f5338b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f5339c;
    public int currentRequestedRotation = -1;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f5340d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5341e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f5342f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f5343g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    public final a f5344h = new a();

    /* renamed from: i  reason: collision with root package name */
    public RelativeLayout.LayoutParams f5345i = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: j  reason: collision with root package name */
    public com.ironsource.sdk.g.b f5346j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5347l;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f5341e));
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f5343g.removeCallbacks(controllerActivity.f5344h);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f5343g.postDelayed(controllerActivity2.f5344h, 500);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    public final void a() {
        Logger.i("ControllerActivity", "clearWebviewController");
        A a10 = this.f5338b;
        if (a10 == null) {
            Logger.i("ControllerActivity", "clearWebviewController, null");
            return;
        }
        a10.f5202x = A.g.Gone;
        a10.G = null;
        a10.p0 = null;
        a10.a(this.f5342f, "onDestroy");
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        if ("landscape".equalsIgnoreCase(str)) {
            int k10 = h.k(this);
            Logger.i("ControllerActivity", "setInitiateLandscapeOrientation");
            if (k10 == 0) {
                Logger.i("ControllerActivity", "ROTATION_0");
            } else {
                if (k10 == 2) {
                    Logger.i("ControllerActivity", "ROTATION_180");
                } else if (k10 == 3) {
                    Logger.i("ControllerActivity", "ROTATION_270 Right Landscape");
                } else if (k10 == 1) {
                    Logger.i("ControllerActivity", "ROTATION_90 Left Landscape");
                } else {
                    Logger.i("ControllerActivity", "No Rotation");
                    return;
                }
                setRequestedOrientation(8);
                return;
            }
            setRequestedOrientation(0);
        } else if ("portrait".equalsIgnoreCase(str)) {
            int k11 = h.k(this);
            Logger.i("ControllerActivity", "setInitiatePortraitOrientation");
            if (k11 == 0) {
                Logger.i("ControllerActivity", "ROTATION_0");
            } else if (k11 == 2) {
                Logger.i("ControllerActivity", "ROTATION_180");
                setRequestedOrientation(9);
                return;
            } else if (k11 == 1) {
                Logger.i("ControllerActivity", "ROTATION_270 Right Landscape");
            } else if (k11 == 3) {
                Logger.i("ControllerActivity", "ROTATION_90 Left Landscape");
            } else {
                Logger.i("ControllerActivity", "No Rotation");
                return;
            }
            setRequestedOrientation(1);
        } else if ("device".equalsIgnoreCase(str)) {
            if (h.q(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.i("ControllerActivity", "onBackPressed");
        new com.ironsource.sdk.i.a();
        if (!com.ironsource.sdk.i.a.a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.i("ControllerActivity", "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            A a10 = (A) com.ironsource.sdk.d.b.a((Context) this).f5543a.f5398a;
            this.f5338b = a10;
            a10.w.setId(1);
            A a11 = this.f5338b;
            a11.p0 = this;
            a11.G = this;
            Intent intent = getIntent();
            this.f5342f = intent.getStringExtra("productType");
            this.f5341e = intent.getBooleanExtra("immersive", false);
            this.f5337a = intent.getStringExtra("adViewId");
            this.k = false;
            this.f5347l = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f5341e) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f5344h);
            }
            if (!TextUtils.isEmpty(this.f5342f) && d.e.OfferWall.toString().equalsIgnoreCase(this.f5342f)) {
                if (bundle != null) {
                    com.ironsource.sdk.g.b bVar = (com.ironsource.sdk.g.b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f5346j = bVar;
                        this.f5338b.a(bVar);
                    }
                    finish();
                } else {
                    this.f5346j = this.f5338b.H;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f5339c = relativeLayout;
            setContentView(relativeLayout, this.f5345i);
            String str = this.f5337a;
            this.f5340d = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f5338b.w : com.ironsource.sdk.utils.d.a(getApplicationContext(), e.a().a(str).a());
            if (this.f5339c.findViewById(1) == null && this.f5340d.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            b(stringExtra);
            this.f5339c.addView(this.f5340d, this.f5345i);
        } catch (Exception e10) {
            e10.printStackTrace();
            finish();
        }
    }

    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.i("ControllerActivity", "onDestroy");
        try {
            if (this.f5339c != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f5340d.getParent();
                View findViewById = this.f5337a == null ? viewGroup2.findViewById(1) : e.a().a(this.f5337a).a();
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f5340d);
                    if (!this.k) {
                        Logger.i("ControllerActivity", "onDestroy | destroyedFromBackground");
                        a();
                        return;
                    }
                    return;
                }
                throw new Exception("removeWebViewContainerView | view is null");
            }
            throw new Exception("removeWebViewContainerView | mContainer is null");
        } catch (Exception e10) {
            com.ironsource.sdk.a.f.a(com.ironsource.sdk.a.h.f5120s, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f5086a);
            Logger.i("ControllerActivity", "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            A a10 = this.f5338b;
            if (a10.f5200t != null) {
                a10.f5199s.onHideCustomView();
                return true;
            }
        }
        if (this.f5341e && (i10 == 25 || i10 == 24)) {
            this.f5343g.removeCallbacks(this.f5344h);
            this.f5343g.postDelayed(this.f5344h, 500);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onOrientationChanged(String str, int i10) {
        b(str);
    }

    public void onPause() {
        super.onPause();
        Logger.i("ControllerActivity", "onPause, isFinishing=" + isFinishing());
        com.ironsource.environment.thread.a.f3770a.b(new x.a((AudioManager) getSystemService("audio")));
        A a10 = this.f5338b;
        if (a10 != null) {
            a10.b((Context) this);
            if (!this.f5347l) {
                this.f5338b.i();
            }
            this.f5338b.a(false, "main");
            this.f5338b.a(this.f5342f, "onPause");
        }
        if (isFinishing()) {
            this.k = true;
            a();
        }
    }

    public void onResume() {
        super.onResume();
        Logger.i("ControllerActivity", "onResume");
        A a10 = this.f5338b;
        if (a10 != null) {
            a10.a((Context) this);
            if (!this.f5347l) {
                this.f5338b.j();
            }
            this.f5338b.a(true, "main");
            this.f5338b.a(this.f5342f, "onResume");
        }
        com.ironsource.environment.thread.a.f3770a.b(new x.b((AudioManager) getSystemService("audio")));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f5342f) && d.e.OfferWall.toString().equalsIgnoreCase(this.f5342f)) {
            com.ironsource.sdk.g.b bVar = this.f5346j;
            bVar.f5608d = true;
            bundle.putParcelable("state", bVar);
        }
    }

    public final void onStart() {
        super.onStart();
        Logger.i("ControllerActivity", "onStart");
        A a10 = this.f5338b;
        if (a10 != null) {
            a10.a(this.f5342f, "onStart");
        }
    }

    public final void onStop() {
        super.onStop();
        Logger.i("ControllerActivity", "onStop");
        A a10 = this.f5338b;
        if (a10 != null) {
            a10.a(this.f5342f, "onStop");
        }
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i("ControllerActivity", "onUserLeaveHint");
        A a10 = this.f5338b;
        if (a10 != null) {
            a10.a(this.f5342f, "onUserLeaveHint");
        }
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (this.f5341e && z9) {
            runOnUiThread(this.f5344h);
        }
    }

    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            Logger.i("ControllerActivity", "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z9) {
        runOnUiThread(z9 ? new c() : new d());
    }
}
