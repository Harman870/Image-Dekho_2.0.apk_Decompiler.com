package q3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.w0;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import m.b;

public final class z0 extends Fragment implements f {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f11314d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f11315a = Collections.synchronizedMap(new b());

    /* renamed from: b  reason: collision with root package name */
    public int f11316b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f11317c;

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f11315a.containsKey(str)) {
            this.f11315a.put(str, lifecycleCallback);
            if (this.f11316b > 0) {
                new h4.b(Looper.getMainLooper()).post(new y0(this, lifecycleCallback, str, 0));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(w0.d("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final LifecycleCallback d(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f11315a.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f11315a.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final Activity f() {
        return getActivity();
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f11315a.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11316b = 1;
        this.f11317c = bundle;
        for (Map.Entry entry : this.f11315a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f11316b = 5;
        for (LifecycleCallback onDestroy : this.f11315a.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f11316b = 3;
        for (LifecycleCallback onResume : this.f11315a.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f11315a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f11316b = 2;
        for (LifecycleCallback onStart : this.f11315a.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f11316b = 4;
        for (LifecycleCallback onStop : this.f11315a.values()) {
            onStop.onStop();
        }
    }
}
