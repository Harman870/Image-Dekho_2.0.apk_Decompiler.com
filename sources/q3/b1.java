package q3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.o;
import androidx.fragment.app.w0;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import m.b;

public final class b1 extends o implements f {
    public static final WeakHashMap W = new WeakHashMap();
    public final Map T = Collections.synchronizedMap(new b());
    public int U = 0;
    public Bundle V;

    public final void B(int i10, int i11, Intent intent) {
        super.B(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.T.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void D(Bundle bundle) {
        super.D(bundle);
        this.U = 1;
        this.V = bundle;
        for (Map.Entry entry : this.T.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void F() {
        this.D = true;
        this.U = 5;
        for (LifecycleCallback onDestroy : this.T.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void J() {
        this.D = true;
        this.U = 3;
        for (LifecycleCallback onResume : this.T.values()) {
            onResume.onResume();
        }
    }

    public final void K(Bundle bundle) {
        for (Map.Entry entry : this.T.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void L() {
        this.D = true;
        this.U = 2;
        for (LifecycleCallback onStart : this.T.values()) {
            onStart.onStart();
        }
    }

    public final void M() {
        this.D = true;
        this.U = 4;
        for (LifecycleCallback onStop : this.T.values()) {
            onStop.onStop();
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.T.containsKey(str)) {
            this.T.put(str, lifecycleCallback);
            if (this.U > 0) {
                new h4.b(Looper.getMainLooper()).post(new a1(this, lifecycleCallback, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(w0.d("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final LifecycleCallback d(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.T.get(str));
    }

    public final /* synthetic */ Activity f() {
        return j();
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.T.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
