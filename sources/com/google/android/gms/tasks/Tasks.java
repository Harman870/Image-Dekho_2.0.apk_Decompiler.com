package com.google.android.gms.tasks;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l4.a;
import r3.o;

public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(Task<TResult> task) {
        o.g("Must not be called on the main application thread");
        if (task == null) {
            throw new NullPointerException("Task must not be null");
        } else if (task.isComplete()) {
            return zza(task);
        } else {
            zzad zzad = new zzad((zzac) null);
            zzb(task, zzad);
            zzad.zza();
            return zza(task);
        }
    }

    @Deprecated
    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @Deprecated
    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        } else if (callable != null) {
            zzw zzw = new zzw();
            executor.execute(new zzz(zzw, callable));
            return zzw;
        } else {
            throw new NullPointerException("Callback must not be null");
        }
    }

    public static <TResult> Task<TResult> forCanceled() {
        zzw zzw = new zzw();
        zzw.zzc();
        return zzw;
    }

    public static <TResult> Task<TResult> forException(Exception exc) {
        zzw zzw = new zzw();
        zzw.zza(exc);
        return zzw;
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzw = new zzw();
        zzw.zzb(tresult);
        return zzw;
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult((Object) null);
        }
        for (Task task : collection) {
            if (task == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzw = new zzw();
        zzaf zzaf = new zzaf(collection.size(), zzw);
        for (Task zzb : collection) {
            zzb(zzb, zzaf);
        }
        return zzw;
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult((Object) null) : whenAll((Collection<? extends Task<?>>) Arrays.asList(taskArr));
    }

    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(Collections.emptyList());
        }
        return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new zzab(collection));
    }

    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.emptyList()) : whenAllComplete((Collection<? extends Task<?>>) Arrays.asList(taskArr));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(Collections.emptyList());
        }
        return whenAll((Collection<? extends Task<?>>) collection).continueWith(TaskExecutors.MAIN_THREAD, new zzaa(collection));
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.emptyList()) : whenAllSuccess((Collection<? extends Task>) Arrays.asList(taskArr));
    }

    public static <T> Task<T> withTimeout(Task<T> task, long j10, TimeUnit timeUnit) {
        if (task != null) {
            o.a("Timeout must be positive", j10 > 0);
            if (timeUnit != null) {
                zzb zzb = new zzb();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzb);
                a aVar = new a(Looper.getMainLooper());
                aVar.postDelayed(new zzx(taskCompletionSource), timeUnit.toMillis(j10));
                task.addOnCompleteListener(new zzy(aVar, taskCompletionSource, zzb));
                return taskCompletionSource.getTask();
            }
            throw new NullPointerException("TimeUnit must not be null");
        }
        throw new NullPointerException("Task must not be null");
    }

    private static Object zza(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzae) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzae);
        task.addOnFailureListener(executor, (OnFailureListener) zzae);
        task.addOnCanceledListener(executor, (OnCanceledListener) zzae);
    }

    public static <TResult> TResult await(Task<TResult> task, long j10, TimeUnit timeUnit) {
        o.g("Must not be called on the main application thread");
        if (task == null) {
            throw new NullPointerException("Task must not be null");
        } else if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        } else if (task.isComplete()) {
            return zza(task);
        } else {
            zzad zzad = new zzad((zzac) null);
            zzb(task, zzad);
            if (zzad.zzb(j10, timeUnit)) {
                return zza(task);
            }
            throw new TimeoutException("Timed out waiting for Task");
        }
    }
}
