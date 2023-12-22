package o3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r3.o;

public final class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10531a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f10532b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public final IBinder a(TimeUnit timeUnit) {
        o.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f10531a) {
            this.f10531a = true;
            IBinder iBinder = (IBinder) this.f10532b.poll(10000, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10532b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
