package kotlinx.coroutines.android;

import android.os.Looper;
import e9.s0;
import f9.a;
import f9.c;
import h9.i;
import java.util.List;

public final class AndroidDispatcherFactory implements i {
    public s0 createDispatcher(List<? extends i> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new a(c.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
