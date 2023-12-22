package n3;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9561a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<T> f9562b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f9563c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f9564d;

    public r(int i10, int i11, Bundle bundle) {
        this.f9561a = i10;
        this.f9563c = i11;
        this.f9564d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(sVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f9562b.setException(sVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f9562b.setResult(bundle);
    }

    public final String toString() {
        int i10 = this.f9563c;
        int i11 = this.f9561a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i10);
        sb.append(" id=");
        sb.append(i11);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
