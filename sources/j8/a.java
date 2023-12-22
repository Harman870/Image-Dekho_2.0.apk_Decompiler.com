package j8;

import android.view.View;
import android.widget.Toast;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import l2.d;
import l8.c;
import l8.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s6.b;
import w2.u;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f8779a;

    public /* synthetic */ a(g gVar) {
        this.f8779a = gVar;
    }

    public final void onClick(View view) {
        d dVar;
        String str;
        g gVar = this.f8779a;
        if (gVar.U.getText().toString().equals(gVar.X)) {
            if (!gVar.d0(gVar.Z) || !gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
                gVar.j();
                if (e.b()) {
                    gVar.j();
                    try {
                        IronSource.setLevelPlayInterstitialListener(new c(new b(1, gVar), new b(gVar), new c(0, gVar)));
                        IronSource.showInterstitial();
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                } else if (gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
                    dVar = new d(gVar.j(), 2);
                    dVar.s("Ops!!!");
                    dVar.o("Ads are not available at this point of time. Please try again after some time. Or close and reopen the app.");
                    dVar.i();
                    u uVar = new u();
                    dVar.m("Okay");
                    dVar.V = uVar;
                } else {
                    gVar.f0();
                    return;
                }
            } else {
                dVar = new d(gVar.j(), 2);
                dVar.s("Important!!!");
                int i10 = gVar.Z;
                try {
                    JSONArray jSONArray = new JSONArray(gVar.W.a(gVar.t(R.string.task_click_data)));
                    int i11 = 0;
                    while (true) {
                        if (i11 >= jSONArray.length()) {
                            str = gVar.t(R.string.default_msg_for_task);
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        if (jSONObject.getBoolean("isActive") && Integer.parseInt(jSONObject.getString("click_on")) == i10) {
                            str = jSONObject.getString("msg");
                            break;
                        }
                        i11++;
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    str = gVar.t(R.string.default_msg_for_task);
                }
                dVar.o(str);
                dVar.i();
                k0.b bVar = new k0.b(gVar);
                dVar.m("Okay");
                dVar.V = bVar;
                dVar.setCancelable(false);
                dVar.setCanceledOnTouchOutside(false);
            }
            dVar.show();
            return;
        }
        Toast.makeText(gVar.j(), "Please Enter Valid Captcha", 0).show();
    }
}
