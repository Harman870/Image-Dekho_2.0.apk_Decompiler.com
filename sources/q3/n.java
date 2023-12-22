package q3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p3.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f11262a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<TaskCompletionSource<?>, Boolean> f11263b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z9, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f11262a) {
            hashMap = new HashMap(this.f11262a);
        }
        synchronized (this.f11263b) {
            hashMap2 = new HashMap(this.f11263b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new b(status));
            }
        }
    }
}
