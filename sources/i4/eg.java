package i4;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

public class eg {

    /* renamed from: a  reason: collision with root package name */
    public nf f7292a;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f7293b;

    public final Task a(cg cgVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7293b.execute(new dg(this, cgVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
