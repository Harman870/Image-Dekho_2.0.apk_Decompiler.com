package i3;

import android.os.Process;

public final class s extends Thread {
    public s(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
