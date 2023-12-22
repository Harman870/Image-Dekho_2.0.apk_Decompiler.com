package a7;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f136c;

    public /* synthetic */ i(j jVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f134a = jVar;
        this.f135b = intent;
        this.f136c = taskCompletionSource;
    }

    public final void run() {
        j jVar = this.f134a;
        Intent intent = this.f135b;
        TaskCompletionSource taskCompletionSource = this.f136c;
        jVar.getClass();
        try {
            jVar.c(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }
}
