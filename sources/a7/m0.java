package a7;

import a7.j;
import a7.n0;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import c3.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

public final class m0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f180b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f181a;

    public interface a {
    }

    public m0(j.a aVar) {
        this.f181a = aVar;
    }

    public final void a(n0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            a aVar2 = this.f181a;
            Intent intent = aVar.f189a;
            j jVar = j.this;
            jVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            jVar.f143a.execute(new i(jVar, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener((Executor) new h(), new s(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
