package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f9537a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f9538b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f9539c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f9540d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f9541e;

    public /* synthetic */ i(b bVar, Intent intent, Context context, boolean z9, BroadcastReceiver.PendingResult pendingResult) {
        this.f9537a = bVar;
        this.f9538b = intent;
        this.f9539c = context;
        this.f9540d = z9;
        this.f9541e = pendingResult;
    }

    public final void run() {
        b bVar = this.f9537a;
        Intent intent = this.f9538b;
        Context context = this.f9539c;
        boolean z9 = this.f9540d;
        BroadcastReceiver.PendingResult pendingResult = this.f9541e;
        bVar.getClass();
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int d10 = intent2 != null ? bVar.d(context, intent2) : bVar.c(context, intent);
            if (z9) {
                pendingResult.setResultCode(d10);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
