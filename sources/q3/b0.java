package q3;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f4.f;
import n3.w;

public final class b0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f11206a;

    /* renamed from: b  reason: collision with root package name */
    public final w f11207b;

    public b0(w wVar) {
        this.f11207b = wVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            w wVar = this.f11207b;
            v0 v0Var = ((u0) wVar.f9574b).f11280b;
            v0Var.f11283b.set((Object) null);
            f fVar = ((o) v0Var).f11265f.f11224n;
            fVar.sendMessage(fVar.obtainMessage(3));
            if (((Dialog) wVar.f9573a).isShowing()) {
                ((Dialog) wVar.f9573a).dismiss();
            }
            synchronized (this) {
                Context context2 = this.f11206a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f11206a = null;
            }
        }
    }
}
