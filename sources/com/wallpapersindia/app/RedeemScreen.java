package com.wallpapersindia.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import c3.k;
import c3.n;
import com.google.android.gms.tasks.Task;
import com.imgdkh.app.R;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.wallpapersindia.app.utils.BackgroundWorker;
import d.f;
import d3.l;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import l2.d;
import l8.e;
import l8.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z5.b;
import z5.r;
import z5.s;

public class RedeemScreen extends f implements View.OnClickListener, BackgroundWorker.a {
    public static final /* synthetic */ int T = 0;
    public CardView A;
    public CardView B;
    public CardView C;
    public CardView D;
    public CardView E;
    public CardView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public String O;
    public JSONArray P;
    public Dialog Q;
    public long R = Long.parseLong(new String(Base64.decode(yra(), 0)));
    public b.c S;

    /* renamed from: x  reason: collision with root package name */
    public g f5835x;

    /* renamed from: y  reason: collision with root package name */
    public CardView f5836y;

    /* renamed from: z  reason: collision with root package name */
    public CardView f5837z;

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

    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        String str;
        String str2;
        d dVar;
        String str3 = "Paytm";
        switch (view.getId()) {
            case R.id.paytm_2 /*2131296674*/:
                try {
                    JSONObject jSONObject = this.P.getJSONObject(1);
                    str = jSONObject.getString("redeem_amount");
                    str2 = jSONObject.getString("title");
                    str3 = jSONObject.getString("type");
                    break;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    str = "200";
                    str2 = "2 INR Paytm Voucher";
                    break;
                }
            case R.id.paytm_3 /*2131296676*/:
                try {
                    JSONObject jSONObject2 = this.P.getJSONObject(2);
                    str = jSONObject2.getString("redeem_amount");
                    str2 = jSONObject2.getString("title");
                    str3 = jSONObject2.getString("type");
                    break;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    str = "300";
                    str2 = "3 INR Paytm Voucher";
                    break;
                }
            case R.id.paytm_4 /*2131296678*/:
                try {
                    JSONObject jSONObject3 = this.P.getJSONObject(3);
                    str = jSONObject3.getString("redeem_amount");
                    str2 = jSONObject3.getString("title");
                    str3 = jSONObject3.getString("type");
                    break;
                } catch (JSONException e12) {
                    e12.printStackTrace();
                    str = "400";
                    str2 = "4 INR Paytm Voucher";
                    break;
                }
            case R.id.paytm_5 /*2131296680*/:
                try {
                    JSONObject jSONObject4 = this.P.getJSONObject(4);
                    str = jSONObject4.getString("redeem_amount");
                    str2 = jSONObject4.getString("title");
                    str3 = jSONObject4.getString("type");
                    break;
                } catch (JSONException e13) {
                    e13.printStackTrace();
                    str = "500";
                    str2 = "5 INR Paytm Voucher";
                    break;
                }
            case R.id.paytm_6 /*2131296682*/:
                try {
                    JSONObject jSONObject5 = this.P.getJSONObject(5);
                    str = jSONObject5.getString("redeem_amount");
                    str2 = jSONObject5.getString("title");
                    str3 = jSONObject5.getString("type");
                    break;
                } catch (JSONException e14) {
                    e14.printStackTrace();
                    str = "600";
                    str2 = "6 INR Paytm Voucher";
                    break;
                }
            case R.id.paytm_7 /*2131296684*/:
                try {
                    JSONObject jSONObject6 = this.P.getJSONObject(6);
                    str = jSONObject6.getString("redeem_amount");
                    str2 = jSONObject6.getString("title");
                    str3 = jSONObject6.getString("type");
                    break;
                } catch (JSONException e15) {
                    e15.printStackTrace();
                    str = "700";
                    str2 = "7 INR Paytm Voucher";
                    break;
                }
            case R.id.paytm_8 /*2131296686*/:
                try {
                    JSONObject jSONObject7 = this.P.getJSONObject(7);
                    str = jSONObject7.getString("redeem_amount");
                    str2 = jSONObject7.getString("title");
                    str3 = jSONObject7.getString("type");
                    break;
                } catch (JSONException e16) {
                    e16.printStackTrace();
                    str = "800";
                    str2 = "8 INR Paytm Voucher";
                    break;
                }
            default:
                try {
                    JSONObject jSONObject8 = this.P.getJSONObject(0);
                    str = jSONObject8.getString("redeem_amount");
                    str2 = jSONObject8.getString("title");
                    str3 = jSONObject8.getString("type");
                    break;
                } catch (JSONException e17) {
                    e17.printStackTrace();
                    str = "100";
                    str2 = "1 INR Paytm Voucher";
                    break;
                }
        }
        if (Integer.parseInt(this.f5835x.a(getString(R.string.user_balance))) < Integer.parseInt(str)) {
            dVar = new d(this, 1);
            dVar.s("No Enough Coins");
            dVar.o("You don't have enough coins to purchase the gift voucher.");
            dVar.i();
        } else if (this.f5835x.a(getString(R.string.redeem_today)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            dVar = new d(this, 3);
            dVar.s("Already Requested");
            dVar.o("You can purchase one gift voucher every day. Please try again tomorrow");
            dVar.i();
        } else if (e.b()) {
            e.c(new h8.d(this, str, str2, str3));
            return;
        } else if (this.f5835x.a(getString(R.string.redeem_validation_required)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            Task a10 = this.S.a(new s(A(this.f5835x.a(getString(R.string.id)) + str)));
            this.Q.show();
            a10.addOnSuccessListener(new h8.e(this, str, str2, str3)).addOnFailureListener(new n(this));
            return;
        } else {
            StringBuilder h10 = a.h(str, "recapcha_token");
            h10.append(this.f5835x.a(getString(R.string.id)));
            this.O = A(h10.toString());
            new BackgroundWorker(this, this, getString(R.string.set_redeem), true).execute(new String[]{this.f5835x.a(getString(R.string.uat)), this.f5835x.a(getString(R.string.id)), str, str2, str3, this.O});
            return;
        }
        dVar.m("Close");
        dVar.V = null;
        dVar.show();
    }

    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_redeem_screen);
        Dialog dialog = new Dialog(this);
        this.Q = dialog;
        dialog.requestWindowFeature(1);
        this.Q.requestWindowFeature(1);
        this.Q.setContentView(R.layout.alert_dialog_progress);
        this.Q.setCancelable(false);
        Window window = this.Q.getWindow();
        Objects.requireNonNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (this.Q.getWindow() != null) {
            this.Q.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        b q10 = c6.b.q(this);
        this.Q.show();
        q10.a(new r(this.R)).addOnSuccessListener(new c3.g(this)).addOnFailureListener(new l(this));
        this.f5835x = new g(this);
        this.f5836y = (CardView) findViewById(R.id.paytm_1);
        this.f5837z = (CardView) findViewById(R.id.paytm_2);
        this.A = (CardView) findViewById(R.id.paytm_3);
        this.B = (CardView) findViewById(R.id.paytm_4);
        this.C = (CardView) findViewById(R.id.paytm_5);
        this.D = (CardView) findViewById(R.id.paytm_6);
        this.E = (CardView) findViewById(R.id.paytm_7);
        this.F = (CardView) findViewById(R.id.paytm_8);
        this.G = (TextView) findViewById(R.id.paytm_1_str);
        this.H = (TextView) findViewById(R.id.paytm_2_str);
        this.I = (TextView) findViewById(R.id.paytm_3_str);
        this.J = (TextView) findViewById(R.id.paytm_4_str);
        this.K = (TextView) findViewById(R.id.paytm_5_str);
        this.L = (TextView) findViewById(R.id.paytm_6_str);
        this.M = (TextView) findViewById(R.id.paytm_7_str);
        this.N = (TextView) findViewById(R.id.paytm_8_str);
        this.f5836y.setOnClickListener(this);
        this.f5837z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.D.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.F.setOnClickListener(this);
        try {
            this.P = new JSONArray(this.f5835x.a(getString(R.string.redeem_data)));
            for (int i10 = 0; i10 < this.P.length(); i10++) {
                JSONObject jSONObject = this.P.getJSONObject(i10);
                if (jSONObject.getBoolean("isActive")) {
                    switch (i10) {
                        case 1:
                            this.f5837z.setVisibility(0);
                            textView = this.H;
                            break;
                        case 2:
                            this.A.setVisibility(0);
                            textView = this.I;
                            break;
                        case 3:
                            this.B.setVisibility(0);
                            textView = this.J;
                            break;
                        case 4:
                            this.C.setVisibility(0);
                            textView = this.K;
                            break;
                        case 5:
                            this.D.setVisibility(0);
                            textView = this.L;
                            break;
                        case 6:
                            this.E.setVisibility(0);
                            textView = this.M;
                            break;
                        case 7:
                            this.F.setVisibility(0);
                            textView = this.N;
                            break;
                        default:
                            this.f5836y.setVisibility(0);
                            textView = this.G;
                            break;
                    }
                    textView.setText(jSONObject.getString("title_str"));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void s(int i10, String str, String str2) {
        if (str2.equals(getString(R.string.set_redeem))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (i10 == 200) {
                    this.f5835x.b(getString(R.string.user_balance), jSONObject.getString(getString(R.string.user_balance)));
                    Intent intent = new Intent(this, SplashScreen.class);
                    intent.setFlags(268435456);
                    intent.setFlags(32768);
                    intent.setFlags(67108864);
                    String string = jSONObject.getString("message");
                    d dVar = new d(this, 2);
                    dVar.s("Congratulation");
                    dVar.o(string);
                    dVar.i();
                    k kVar = new k(this, intent);
                    dVar.m("Close");
                    dVar.V = kVar;
                    dVar.setCancelable(false);
                    dVar.setCanceledOnTouchOutside(false);
                    dVar.show();
                    return;
                }
                String string2 = jSONObject.getString("message");
                d dVar2 = new d(this, 1);
                dVar2.s("Error");
                dVar2.o(string2);
                dVar2.i();
                dVar2.m("Close");
                dVar2.V = null;
                dVar2.show();
            } catch (Exception e10) {
                d dVar3 = new d(this, 1);
                dVar3.s("Error");
                dVar3.o("Something Is Wrong Please Retry");
                dVar3.i();
                dVar3.m("Close");
                dVar3.V = null;
                dVar3.show();
                e10.printStackTrace();
            }
        }
    }

    public native String yra();
}
