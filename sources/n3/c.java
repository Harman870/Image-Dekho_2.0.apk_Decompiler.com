package n3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g4.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import m.h;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static int f9525h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f9526i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f9527j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    @GuardedBy("responseCallbacks")

    /* renamed from: a  reason: collision with root package name */
    public final h<String, TaskCompletionSource<Bundle>> f9528a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f9529b;

    /* renamed from: c  reason: collision with root package name */
    public final v f9530c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f9531d;

    /* renamed from: e  reason: collision with root package name */
    public Messenger f9532e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f9533f;

    /* renamed from: g  reason: collision with root package name */
    public h f9534g;

    public c(Context context) {
        this.f9529b = context;
        this.f9530c = new v(context);
        this.f9532e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f9531d = scheduledThreadPoolExecutor;
    }

    public final Task<Bundle> a(Bundle bundle) {
        String num;
        String str;
        Class<c> cls = c.class;
        synchronized (cls) {
            int i10 = f9525h;
            f9525h = i10 + 1;
            num = Integer.toString(i10);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f9528a) {
            this.f9528a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f9530c.a() == 2) {
            str = "com.google.iid.TOKEN_REQUEST";
        } else {
            str = "com.google.android.c2dm.intent.REGISTER";
        }
        intent.setAction(str);
        intent.putExtras(bundle);
        Context context = this.f9529b;
        synchronized (cls) {
            if (f9526i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f9526i = PendingIntent.getBroadcast(context, 0, intent2, a.f6573a);
            }
            intent.putExtra("app", f9526i);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 5);
        sb.append("|ID|");
        sb.append(num);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f9532e);
        if (!(this.f9533f == null && this.f9534g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f9533f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f9534g.f9536a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener((Executor) z.f9580a, new x(this, num, (ScheduledFuture) this.f9531d.schedule(new y(0, taskCompletionSource), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f9530c.a() == 2) {
            this.f9529b.sendBroadcast(intent);
        } else {
            this.f9529b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener((Executor) z.f9580a, new x(this, num, (ScheduledFuture) this.f9531d.schedule(new y(0, taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f9528a) {
            TaskCompletionSource remove = this.f9528a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.setResult(bundle);
        }
    }
}
