package z5;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import b6.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.adapters.ironsource.IronSourceAdapter;

public final class i extends h {

    /* renamed from: c  reason: collision with root package name */
    public final r f13210c = new r("OnRequestIntegrityTokenCallback");

    public i(l lVar, TaskCompletionSource taskCompletionSource) {
        super(lVar, taskCompletionSource);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f13210c.b("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f13208a.trySetException(new a(i10, (Throwable) null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f13208a;
        n nVar = new n();
        nVar.C(bundle.getString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY));
        nVar.B(this.f13210c);
        nVar.A((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(nVar.D());
    }
}
