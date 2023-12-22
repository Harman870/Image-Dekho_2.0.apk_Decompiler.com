package j8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f8802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8803b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Vibrator f8804c;

    public /* synthetic */ l(o oVar, String str, Vibrator vibrator) {
        this.f8802a = oVar;
        this.f8803b = str;
        this.f8804c = vibrator;
    }

    public final void onClick(View view) {
        o oVar = this.f8802a;
        String str = this.f8803b;
        Vibrator vibrator = this.f8804c;
        int i10 = o.T;
        ((ClipboardManager) oVar.T().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("refer_code_daily_game_App", str));
        Toast.makeText(oVar.j(), "Copied", 0).show();
        vibrator.vibrate(200);
    }
}
