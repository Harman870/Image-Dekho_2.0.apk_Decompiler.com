package k1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.activity.result.c;
import com.wallpapersindia.app.LoginScreen;
import d.u;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public int f9042b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Context f9043c;

    /* renamed from: d  reason: collision with root package name */
    public h3.a f9044d;

    /* renamed from: e  reason: collision with root package name */
    public C0106a f9045e;

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    public final class C0106a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final b f9046a;

        public C0106a(LoginScreen.a aVar) {
            this.f9046a = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            /*
                r2 = this;
                java.lang.String r3 = "Install Referrer service connected."
                y3.a.n(r3)
                k1.a r3 = k1.a.this
                int r0 = h3.a.C0095a.f6878a
                if (r4 != 0) goto L_0x000d
                r4 = 0
                goto L_0x0021
            L_0x000d:
                java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
                android.os.IInterface r0 = r4.queryLocalInterface(r0)
                boolean r1 = r0 instanceof h3.a
                if (r1 == 0) goto L_0x001b
                r4 = r0
                h3.a r4 = (h3.a) r4
                goto L_0x0021
            L_0x001b:
                h3.a$a$a r0 = new h3.a$a$a
                r0.<init>(r4)
                r4 = r0
            L_0x0021:
                r3.f9044d = r4
                k1.a r3 = k1.a.this
                r4 = 2
                r3.f9042b = r4
                k1.b r3 = r2.f9046a
                r4 = 0
                com.wallpapersindia.app.LoginScreen$a r3 = (com.wallpapersindia.app.LoginScreen.a) r3
                r3.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.a.C0106a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            y3.a.o("Install Referrer service disconnected.");
            a aVar = a.this;
            aVar.f9044d = null;
            aVar.f9042b = 0;
            this.f9046a.getClass();
        }
    }

    public a(Context context) {
        this.f9043c = context.getApplicationContext();
    }

    public final u A() {
        boolean z9;
        if (this.f9042b != 2 || this.f9044d == null || this.f9045e == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f9043c.getPackageName());
            try {
                return new u(this.f9044d.e(bundle));
            } catch (RemoteException e10) {
                y3.a.o("RemoteException getting install referrer information");
                this.f9042b = 0;
                throw e10;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }
}
