package com.wallpapersindia.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.z;
import c3.s;
import com.google.android.material.navigation.NavigationView;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import d.c;
import d.f;
import d3.q;
import f.b;
import j8.k;
import java.util.ArrayList;
import l2.d;
import l8.e;
import l8.g;
import y.a;

public class HomeScreen extends f implements NavigationView.a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x  reason: collision with root package name */
    public g f5823x;

    /* renamed from: y  reason: collision with root package name */
    public DrawerLayout f5824y;

    /* renamed from: z  reason: collision with root package name */
    public NavigationView f5825z;

    public final void onBackPressed() {
        boolean z9;
        View e10 = this.f5824y.e(8388611);
        if (e10 != null) {
            z9 = DrawerLayout.n(e10);
        } else {
            z9 = false;
        }
        if (z9) {
            this.f5824y.c();
        } else if (this.f5825z.getMenu().findItem(R.id.nav_home).isChecked()) {
            d dVar = new d(this, 4);
            dVar.p(R.drawable.ic_exit);
            dVar.s("Are you Sure ?");
            dVar.i();
            Context context = dVar.f9212f;
            Object obj = a.f13006a;
            Drawable b10 = a.b.b(context, R.drawable.button_bg);
            dVar.w = b10;
            AppCompatButton appCompatButton = dVar.u;
            if (!(appCompatButton == null || b10 == null)) {
                appCompatButton.setBackground(b10);
            }
            s sVar = new s(this);
            dVar.m("Exit");
            dVar.V = sVar;
            q qVar = new q(3);
            dVar.l("Cancel");
            dVar.U = qVar;
            dVar.show();
        } else {
            this.f5825z.setCheckedItem((int) R.id.nav_home);
            z w = w();
            k kVar = new k();
            w.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(w);
            aVar.d(R.id.frame_layout, kVar);
            aVar.f();
        }
    }

    public final void onCreate(Bundle bundle) {
        int i10;
        NavigationView navigationView;
        boolean z9;
        float f10;
        int i11;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_home_screen);
        this.f5823x = new g(this);
        e.a(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bannerContainer);
        boolean z10 = false;
        try {
            IronSourceBannerLayout createBanner = IronSource.createBanner(this, ISBannerSize.BANNER);
            frameLayout.addView(createBanner, 0, new FrameLayout.LayoutParams(-1, -2));
            IronSource.loadBanner(createBanner);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        e.d(this);
        this.f5825z = (NavigationView) findViewById(R.id.nav_view);
        if (this.f5823x.a(getString(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            this.f5825z.getMenu().clear();
            navigationView = this.f5825z;
            i10 = R.menu.activity_main_drawer;
        } else {
            this.f5825z.getMenu().clear();
            navigationView = this.f5825z;
            i10 = R.menu.activity_main_drawer_0;
        }
        navigationView.d(i10);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        z().y(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.f5824y = drawerLayout;
        c cVar = new c(this, drawerLayout, toolbar);
        DrawerLayout drawerLayout2 = this.f5824y;
        if (drawerLayout2.f1313t == null) {
            drawerLayout2.f1313t = new ArrayList();
        }
        drawerLayout2.f1313t.add(cVar);
        View e11 = cVar.f5861b.e(8388611);
        if (e11 != null) {
            z9 = DrawerLayout.n(e11);
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        cVar.e(f10);
        b bVar = cVar.f5862c;
        View e12 = cVar.f5861b.e(8388611);
        if (e12 != null) {
            z10 = DrawerLayout.n(e12);
        }
        if (z10) {
            i11 = cVar.f5864e;
        } else {
            i11 = cVar.f5863d;
        }
        if (!cVar.f5865f && !cVar.f5860a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            cVar.f5865f = true;
        }
        cVar.f5860a.b(bVar, i11);
        NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view);
        navigationView2.setNavigationItemSelectedListener(this);
        navigationView2.setCheckedItem((int) R.id.nav_home);
        z w = w();
        k kVar = new k();
        w.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(w);
        aVar.d(R.id.frame_layout, kVar);
        aVar.f();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public final void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        IronSource.onResume(this);
    }
}
