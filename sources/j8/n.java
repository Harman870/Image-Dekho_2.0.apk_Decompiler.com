package j8;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.imgdkh.app.R;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f8808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8809b;

    public /* synthetic */ n(o oVar, String str) {
        this.f8808a = oVar;
        this.f8809b = str;
    }

    public final void onClick(View view) {
        o oVar = this.f8808a;
        String str = this.f8809b;
        int i10 = o.T;
        oVar.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage("com.whatsapp");
        intent.putExtra("android.intent.extra.TEXT", oVar.q().getString(R.string.invite_msg) + str);
        try {
            oVar.a0(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(oVar.j(), "Install Whatsapp", 0).show();
        }
    }
}
