package com.wallpapersindia.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatButton;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import d.f;
import d.h;
import d3.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l2.d;
import l8.g;
import org.json.JSONException;
import org.json.JSONObject;
import y.a;

public class SplashScreen extends f implements BackgroundWorker.a {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f5838y = 0;

    /* renamed from: x  reason: collision with root package name */
    public g f5839x;

    static {
        if (h.f5873b != 1) {
            h.f5873b = 1;
            synchronized (h.f5879h) {
                Iterator<WeakReference<h>> it = h.f5878g.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next().get();
                    if (hVar != null) {
                        hVar.d();
                    }
                }
            }
        }
    }

    public final void A() {
        if (this.f5839x.a(getString(R.string.uat)).length() == 0 || this.f5839x.a(getString(R.string.id)).length() == 0) {
            Intent intent = new Intent(this, LoginScreen.class);
            intent.setFlags(268468224);
            startActivity(intent);
            return;
        }
        new BackgroundWorker(this, this, getString(R.string.splash_update), false).execute(new String[]{this.f5839x.a(getString(R.string.uat)), this.f5839x.a(getString(R.string.id))});
    }

    public final void B() {
        d dVar = new d(this, 3);
        dVar.s("Update Available");
        dVar.o("A new version of this app is available on play store.You need to update this app for farther use.");
        dVar.i();
        Context context = dVar.f9212f;
        Object obj = a.f13006a;
        Drawable b10 = a.b.b(context, R.drawable.button_bg);
        dVar.w = b10;
        AppCompatButton appCompatButton = dVar.u;
        if (!(appCompatButton == null || b10 == null)) {
            appCompatButton.setBackground(b10);
        }
        c3.g gVar = new c3.g(this);
        dVar.m("Update");
        dVar.V = gVar;
        l lVar = new l(this);
        dVar.l("Exit");
        dVar.U = lVar;
        dVar.setCancelable(false);
        dVar.setCanceledOnTouchOutside(false);
        dVar.show();
    }

    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash_screen);
        synchronized (c6.f.f2493j) {
            arrayList = new ArrayList(c6.f.k.values());
        }
        if (arrayList.isEmpty()) {
            c6.f.h(this);
        }
        this.f5839x = new g(this);
        new BackgroundWorker(this, this, getString(R.string.pre_splash_update), false).execute(new String[0]);
    }

    public final void s(int i10, String str, String str2) {
        Intent intent;
        if (str2.equals(getString(R.string.pre_splash_update))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (i10 == 200) {
                    String string = jSONObject.getString("fname");
                    String string2 = jSONObject.getString("lname");
                    this.f5839x.b(getString(R.string.fname), string);
                    this.f5839x.b(getString(R.string.lname), string2);
                    A();
                } else {
                    String string3 = jSONObject.getString("message");
                    d dVar = new d(this, 1);
                    dVar.s("Error");
                    dVar.o(string3);
                    dVar.i();
                    dVar.m("Close");
                    dVar.V = null;
                    dVar.show();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                d dVar2 = new d(this, 1);
                dVar2.s("Error");
                dVar2.o("Something Is Wrong Please Retry");
                dVar2.i();
                dVar2.m("Close");
                dVar2.V = null;
                dVar2.show();
            }
        }
        if (str2.equals(getString(R.string.splash_update))) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (i10 == 200) {
                    if (Float.parseFloat(jSONObject2.getString("app_version")) <= Float.parseFloat("2.0")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                        if (jSONObject3.length() == 0) {
                            intent = new Intent(this, LoginScreen.class);
                        } else {
                            this.f5839x.b(getString(R.string.user_balance), jSONObject3.getString(getString(R.string.balance)));
                            this.f5839x.b(getString(R.string.redeem_today), jSONObject3.getString(getString(R.string.redeem_today)));
                            this.f5839x.b(getString(R.string.refer_reward), jSONObject2.getString(getString(R.string.refer_reward)));
                            this.f5839x.b(getString(R.string.redeem_data), jSONObject2.getString(getString(R.string.redeem_data)));
                            this.f5839x.b(getString(R.string.task_click_data), jSONObject2.getString(getString(R.string.task_click_data)));
                            this.f5839x.b(getString(R.string.show_self_ads), jSONObject2.getString(getString(R.string.show_self_ads)));
                            this.f5839x.b(getString(R.string.redeem_validation_required), jSONObject2.getString(getString(R.string.redeem_validation_required)));
                            this.f5839x.b(getString(R.string.task_imration_interval), jSONObject2.getString(getString(R.string.task_imration_interval)));
                            this.f5839x.b(getString(R.string.is_ironsource_enabled), jSONObject2.getString(getString(R.string.is_ironsource_enabled)));
                            this.f5839x.b(getString(R.string.max_spin_reward), jSONObject2.getString(getString(R.string.max_spin_reward)));
                            this.f5839x.b(getString(R.string.spin_remaining), jSONObject2.getString(getString(R.string.spin_remaining)));
                            this.f5839x.b(getString(R.string.redeem_count), jSONObject2.getString(getString(R.string.redeem_count)));
                            this.f5839x.b(getString(R.string.redeems_list), jSONObject2.getString(getString(R.string.redeems_list)));
                            this.f5839x.b(getString(R.string.show_ad), jSONObject2.getString(getString(R.string.show_ad)));
                            intent = new Intent(this, HomeScreen.class);
                        }
                    } else {
                        B();
                        return;
                    }
                } else if (i10 == 401) {
                    intent = new Intent(this, LoginScreen.class);
                } else if (i10 == 500) {
                    d dVar3 = new d(this, 1);
                    dVar3.s("Error");
                    dVar3.o("Internal Error Please Retry");
                    dVar3.i();
                    dVar3.m("Close");
                    dVar3.V = null;
                    dVar3.show();
                    return;
                } else {
                    String string4 = jSONObject2.getString("message");
                    d dVar4 = new d(this, 1);
                    dVar4.s("Error");
                    dVar4.o(string4);
                    dVar4.i();
                    dVar4.m("Close");
                    dVar4.V = null;
                    dVar4.show();
                    return;
                }
                intent.setFlags(268468224);
                startActivity(intent);
            } catch (JSONException e11) {
                e11.printStackTrace();
                d dVar5 = new d(this, 1);
                dVar5.s("Error");
                dVar5.o("Something Is Wrong Please Retry");
                dVar5.i();
                dVar5.m("Close");
                dVar5.V = null;
                dVar5.show();
            }
        }
    }
}
