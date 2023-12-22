package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.a;
import x8.f;

public final class c extends a<Intent, a> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        f.f(componentActivity, "context");
        return intent;
    }

    public final Object c(Intent intent, int i10) {
        return new a(intent, i10);
    }
}
