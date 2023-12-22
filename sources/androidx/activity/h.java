package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f271b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f272c;

    public h(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f272c = bVar;
        this.f270a = i10;
        this.f271b = sendIntentException;
    }

    public final void run() {
        this.f272c.a(this.f270a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f271b));
    }
}
