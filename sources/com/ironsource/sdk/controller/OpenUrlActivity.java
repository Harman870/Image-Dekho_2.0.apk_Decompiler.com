package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: j  reason: collision with root package name */
    public static final int f5355j = SDKUtils.generateViewId();
    public static final int k = SDKUtils.generateViewId();

    /* renamed from: a  reason: collision with root package name */
    public WebView f5356a = null;

    /* renamed from: b  reason: collision with root package name */
    public A f5357b;

    /* renamed from: c  reason: collision with root package name */
    public ProgressBar f5358c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5359d;

    /* renamed from: e  reason: collision with root package name */
    public RelativeLayout f5360e;

    /* renamed from: f  reason: collision with root package name */
    public String f5361f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f5362g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    public boolean f5363h = false;

    /* renamed from: i  reason: collision with root package name */
    public final b f5364i = new b();

    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        public final void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f5362g.removeCallbacks(openUrlActivity.f5364i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f5362g.postDelayed(openUrlActivity2.f5364i, 500);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f5363h));
        }
    }

    public class c extends WebViewClient {
        public c() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f5358c.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f5358c.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            List<String> b10 = com.ironsource.sdk.utils.b.a().b();
            if (!b10.isEmpty()) {
                for (String contains : b10) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f5357b.b();
                        } catch (Exception e10) {
                            StringBuilder sb = new StringBuilder();
                            if (e10 instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            A a10 = OpenUrlActivity.this.f5357b;
                            if (a10 != null) {
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                String str3 = str;
                                if (TextUtils.isEmpty(sb2)) {
                                    str2 = "activity failed to open with unspecified reason";
                                } else {
                                    str2 = sb2;
                                }
                                a10.b(A.b("failedToStartStoreActivity", A.a("errMsg", str2, "url", str3, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        A a10;
        if (this.f5359d && (a10 = this.f5357b) != null) {
            a10.d("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f5356a.stopLoading();
        this.f5356a.clearHistory();
        try {
            this.f5356a.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f5356a.canGoBack()) {
            this.f5356a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.f5357b = (A) com.ironsource.sdk.d.b.a((Context) this).f5543a.f5398a;
            requestWindowFeature(1);
            getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            Bundle extras = getIntent().getExtras();
            this.f5361f = extras.getString(A.f5181c);
            this.f5359d = extras.getBoolean(A.f5182d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f5363h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.f5364i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f5360e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e10) {
            e10.printStackTrace();
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f5356a;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f5363h && (i10 == 25 || i10 == 24)) {
            this.f5362g.postDelayed(this.f5364i, 500);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        A a10 = this.f5357b;
        if (a10 != null) {
            a10.a(false, "secondary");
            if (this.f5360e != null && (viewGroup = (ViewGroup) this.f5356a.getParent()) != null) {
                if (viewGroup.findViewById(f5355j) != null) {
                    viewGroup.removeView(this.f5356a);
                }
                if (viewGroup.findViewById(k) != null) {
                    viewGroup.removeView(this.f5358c);
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f5356a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f5356a = webView;
            webView.setId(f5355j);
            this.f5356a.getSettings().setJavaScriptEnabled(true);
            this.f5356a.setWebViewClient(new c());
            loadUrl(this.f5361f);
        }
        if (findViewById(f5355j) == null) {
            this.f5360e.addView(this.f5356a, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f5358c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, 16973939));
            this.f5358c = progressBar;
            progressBar.setId(k);
        }
        if (findViewById(k) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f5358c.setLayoutParams(layoutParams);
            this.f5358c.setVisibility(4);
            this.f5360e.addView(this.f5358c);
        }
        A a10 = this.f5357b;
        if (a10 != null) {
            a10.a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (this.f5363h && z9) {
            runOnUiThread(this.f5364i);
        }
    }
}
