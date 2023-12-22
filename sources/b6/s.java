package b6;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f2296a;

    public s() {
        this.f2296a = null;
    }

    public s(TaskCompletionSource taskCompletionSource) {
        this.f2296a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f2296a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }
}
