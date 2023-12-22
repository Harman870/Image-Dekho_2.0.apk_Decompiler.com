package j8;

import a7.a0;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.f;
import androidx.fragment.app.o;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import java.util.Objects;
import java.util.Random;
import l2.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends o implements BackgroundWorker.a {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f8786v0 = 0;
    public TextView T;
    public EditText U;
    public Button V;
    public l8.g W;
    public String X;
    public TextView Y;
    public int Z = 0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8787o0 = false;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public CountDownTimer f8788q0;

    /* renamed from: r0  reason: collision with root package name */
    public CountDownTimer f8789r0;

    /* renamed from: s0  reason: collision with root package name */
    public Dialog f8790s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f8791t0 = 10;
    public int u0 = 0;

    public class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f8792a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10, int[] iArr) {
            super(j10, 1000);
            this.f8792a = iArr;
        }

        public final void onFinish() {
            int[] iArr = this.f8792a;
            g gVar = g.this;
            iArr[0] = gVar.f8791t0;
            gVar.u0 = 0;
            gVar.V.setEnabled(true);
            g.this.V.setText("Submit");
        }

        public final void onTick(long j10) {
            int[] iArr = this.f8792a;
            iArr[0] = iArr[0] - 1;
            g gVar = g.this;
            gVar.u0--;
            gVar.V.setEnabled(false);
            Button button = g.this.V;
            StringBuilder g10 = f.g("Please Wait ");
            g10.append(this.f8792a[0]);
            button.setText(g10.toString());
        }
    }

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_captcha, viewGroup, false);
        Dialog dialog = new Dialog(j());
        this.f8790s0 = dialog;
        dialog.requestWindowFeature(1);
        this.f8790s0.requestWindowFeature(1);
        this.f8790s0.setContentView(R.layout.alert_dialog_progress);
        this.f8790s0.setCancelable(false);
        Window window = this.f8790s0.getWindow();
        Objects.requireNonNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (this.f8790s0.getWindow() != null) {
            this.f8790s0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        this.W = new l8.g(j());
        this.Y = (TextView) inflate.findViewById(R.id.captcha_available);
        this.T = (TextView) inflate.findViewById(R.id.captcha_text);
        this.U = (EditText) inflate.findViewById(R.id.captcha_edittext);
        this.V = (Button) inflate.findViewById(R.id.submit_captcha);
        if (!this.W.a(t(R.string.task_imration_interval)).equals("")) {
            this.f8791t0 = Integer.parseInt(this.W.a(t(R.string.task_imration_interval)));
        }
        e0();
        this.V.setOnClickListener(new a(this));
        try {
            if (!this.W.a("remaining_captcha_duration").equals("") && !this.W.a("remaining_captcha_duration").equals("0")) {
                int parseInt = Integer.parseInt(this.W.a("remaining_captcha_duration"));
                int currentTimeMillis = (int) ((System.currentTimeMillis() - Long.parseLong(this.W.a("remaining_captcha_duration_time"))) / 1000);
                if (currentTimeMillis < parseInt) {
                    int i10 = parseInt - currentTimeMillis;
                    this.u0 = i10;
                    int[] iArr = {i10};
                    a aVar = new a(((long) iArr[0]) * 1000, iArr);
                    this.f8789r0 = aVar;
                    aVar.start();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return inflate;
    }

    public final void F() {
        this.D = true;
    }

    public final void M() {
        if (this.f8789r0 != null) {
            int i10 = this.u0;
            if (i10 > 0) {
                this.W.b("remaining_captcha_duration", String.valueOf(i10));
            } else {
                this.W.b("remaining_captcha_duration", String.valueOf(0));
            }
            this.W.b("remaining_captcha_duration_time", String.valueOf(System.currentTimeMillis()));
        }
        this.D = true;
    }

    public final int b0(int i10) {
        try {
            JSONArray jSONArray = new JSONArray(this.W.a(t(R.string.task_click_data)));
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject.getBoolean("isActive") && Integer.parseInt(jSONObject.getString("click_on")) == i10) {
                    return Integer.parseInt(jSONObject.getString("count_down_time"));
                }
            }
            return 20;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return 20;
        }
    }

    public final boolean c0(int i10) {
        try {
            JSONArray jSONArray = new JSONArray(this.W.a(t(R.string.task_click_data)));
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject.getBoolean("isActive") && Integer.parseInt(jSONObject.getString("click_on")) == i10) {
                    return Integer.parseInt(jSONObject.getString("type")) == 0;
                }
            }
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    public final boolean d0(int i10) {
        try {
            JSONArray jSONArray = new JSONArray(this.W.a(t(R.string.task_click_data)));
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject.getBoolean("isActive") && Integer.parseInt(jSONObject.getString("click_on")) == i10) {
                    return true;
                }
            }
            return false;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void e0() {
        try {
            Random random = new Random();
            StringBuilder sb = new StringBuilder(10);
            for (int i10 = 0; i10 < 10; i10++) {
                sb.append("qwertyuiopasdfghjklzxcvbnm".charAt(random.nextInt(26)));
            }
            String sb2 = sb.toString();
            this.X = sb2;
            this.T.setText(sb2);
            this.U.setText("");
            String a10 = this.W.a(t(R.string.spin_remaining));
            this.Y.setText(String.format("%s Captcha", new Object[]{a10}));
            this.Z = Integer.parseInt(a10);
        } catch (Exception e10) {
            this.Y.setText("0 Captcha");
            this.Z = 0;
            e10.printStackTrace();
        }
    }

    public final void f0() {
        String str;
        if (!this.W.a(t(R.string.max_spin_reward)).equals("")) {
            str = this.W.a(t(R.string.max_spin_reward));
        } else {
            str = "10";
        }
        if (this.Z > 0) {
            d dVar = new d(j(), 2);
            dVar.s("Congratulations");
            dVar.o("Congratulations you have won " + str + " coins by captcha. Click below button to add coins in your Wallet.");
            dVar.i();
            a0 a0Var = new a0(this, str);
            dVar.m("Add To Wallet");
            dVar.V = a0Var;
            dVar.show();
            return;
        }
        d dVar2 = new d(j(), 3);
        dVar2.s("Captcha Not Available");
        dVar2.o("You have 0 captcha left. Now come back tomorrow and renew captcha.");
        dVar2.i();
        dVar2.m("Close");
        dVar2.V = null;
        dVar2.show();
    }

    public final void g0() {
        if (this.f8787o0) {
            this.f8787o0 = false;
            this.p0 = false;
            this.f8788q0.cancel();
            d dVar = new d(T(), 3);
            dVar.s("Opps");
            dVar.o("Please install 1 application by clicking on ad and then continue your task");
            dVar.i();
            dVar.m("Close");
            dVar.V = null;
            dVar.show();
        } else if (this.p0) {
            this.p0 = false;
            f0();
        }
    }

    public final void s(int i10, String str, String str2) {
        if (str2.equals(t(R.string.add_spin_reward))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (i10 == 200) {
                    Toast.makeText(j(), "Reward Added", 0).show();
                    String string = jSONObject.getString(t(R.string.user_balance));
                    String string2 = jSONObject.getString(t(R.string.spin_remaining));
                    this.W.b(t(R.string.user_balance), string);
                    this.W.b(t(R.string.spin_remaining), string2);
                    e0();
                    return;
                }
                String string3 = jSONObject.getString("message");
                d dVar = new d(j(), 1);
                dVar.s("Error");
                dVar.o(string3);
                dVar.i();
                dVar.m("Close");
                dVar.V = null;
                dVar.show();
            } catch (JSONException e10) {
                d dVar2 = new d(j(), 1);
                dVar2.s("Error");
                dVar2.o("Something Is Wrong Please Retry");
                dVar2.i();
                dVar2.m("Close");
                dVar2.V = null;
                dVar2.show();
                e10.printStackTrace();
            }
        }
    }
}
