package b6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2270a;

    public /* synthetic */ a(b bVar) {
        this.f2270a = bVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2270a.f2273b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        b bVar = this.f2270a;
        bVar.a().post(new y(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2270a.f2273b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        b bVar = this.f2270a;
        bVar.a().post(new z(this));
    }
}
