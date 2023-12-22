package com.wallpapersindia.app.pro;

import a7.k;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import d.f;
import j8.c;
import l8.d;
import l8.e;
import l8.g;

public class MainActivityPro extends f implements View.OnClickListener {
    public static final /* synthetic */ int K = 0;
    public CardView A;
    public CardView B;
    public CardView C;
    public CardView D;
    public CardView E;
    public CardView F;
    public CardView G;
    public CardView H;
    public CardView I;
    public g J;

    /* renamed from: x  reason: collision with root package name */
    public CardView f5844x;

    /* renamed from: y  reason: collision with root package name */
    public CardView f5845y;

    /* renamed from: z  reason: collision with root package name */
    public CardView f5846z;

    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        boolean z9;
        if (view.getId() == R.id.watch_video_card) {
            try {
                if (!IronSource.isRewardedVideoAvailable()) {
                    IronSource.loadRewardedVideo();
                }
                z9 = IronSource.isRewardedVideoAvailable();
            } catch (Exception e10) {
                e10.printStackTrace();
                z9 = false;
            }
            if (z9) {
                try {
                    IronSource.setLevelPlayRewardedVideoManualListener(new d(new c(1, this)));
                    IronSource.showRewardedVideo();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                l2.d dVar = new l2.d(this, 3);
                dVar.s("Ops !!!");
                dVar.o("Reward Video not available at this time. Please try after few minutes.");
                dVar.i();
                dVar.m("Close");
                dVar.V = null;
                dVar.show();
            }
        } else if (e.b()) {
            e.c(new k(this, 2, view));
        } else {
            view.getId();
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main_pro);
        this.J = new g(this);
        e.a(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bannerContainer);
        try {
            IronSourceBannerLayout createBanner = IronSource.createBanner(this, ISBannerSize.BANNER);
            frameLayout.addView(createBanner, 0, new FrameLayout.LayoutParams(-1, -2));
            IronSource.loadBanner(createBanner);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.J.a(getString(R.string.how_to_use_session)).equals("")) {
            l2.d dVar = new l2.d(this, 4);
            dVar.p(R.drawable.app_icon);
            dVar.s("How To Use");
            dVar.o("1. Watch 5 Reward Video Daily And Win Bonus Coins<br/><br/>2. Spin 10 time Daily And Win Bonus Coins.<br/><br/>3. Read 10 News Daily And Win Bonus Coins.<br/><br/>4. Refer A Friend And Win Extra 100 Coin Per Refer.<br/>");
            dVar.i();
            dVar.m("Close");
            dVar.V = null;
            dVar.show();
        } else {
            e.d(this);
        }
        this.f5844x = (CardView) findViewById(R.id.exit_card);
        this.f5845y = (CardView) findViewById(R.id.rate_us_card);
        this.f5846z = (CardView) findViewById(R.id.telegram_card);
        this.A = (CardView) findViewById(R.id.tnc_card);
        this.B = (CardView) findViewById(R.id.pp_card);
        this.C = (CardView) findViewById(R.id.news_card);
        this.D = (CardView) findViewById(R.id.redeem_card);
        this.E = (CardView) findViewById(R.id.refer_card);
        this.F = (CardView) findViewById(R.id.wallet_card);
        this.G = (CardView) findViewById(R.id.spacial_offer_card);
        this.H = (CardView) findViewById(R.id.spin_card);
        this.I = (CardView) findViewById(R.id.watch_video_card);
        StringBuilder g10 = androidx.activity.f.g("Hi ");
        g10.append(this.J.a(getString(R.string.name)).split(" ")[0]);
        g10.append("!");
        ((TextView) findViewById(R.id.heading)).setText(g10.toString());
        this.f5844x.setOnClickListener(this);
        this.f5845y.setOnClickListener(this);
        this.f5846z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.D.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.G.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.I.setOnClickListener(this);
    }
}
