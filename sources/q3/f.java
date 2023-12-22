package q3;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface f {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback d(Class cls, String str);

    Activity f();

    void startActivityForResult(Intent intent, int i10);
}
