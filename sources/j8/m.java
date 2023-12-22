package j8;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f8805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8806b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Vibrator f8807c;

    public /* synthetic */ m(o oVar, String str, Vibrator vibrator) {
        this.f8805a = oVar;
        this.f8806b = str;
        this.f8807c = vibrator;
    }

    public final void onClick(View view) {
        o oVar = this.f8805a;
        String str = this.f8806b;
        Vibrator vibrator = this.f8807c;
        int i10 = o.T;
        ((ClipboardManager) oVar.T().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("refer_code_daily_game_App", str));
        Toast.makeText(oVar.j(), "Copied", 0).show();
        vibrator.vibrate(200);
    }
}
