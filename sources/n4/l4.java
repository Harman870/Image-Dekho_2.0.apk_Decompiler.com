package n4;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import r3.o;

public final class l4 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9914a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue f9915b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9916c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m4 f9917d;

    public l4(m4 m4Var, String str, BlockingQueue blockingQueue) {
        this.f9917d = m4Var;
        o.h(blockingQueue);
        this.f9914a = new Object();
        this.f9915b = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f9917d.f9956i) {
            try {
                if (!this.f9916c) {
                    this.f9917d.f9957j.release();
                    this.f9917d.f9956i.notifyAll();
                    m4 m4Var = this.f9917d;
                    if (this == m4Var.f9950c) {
                        m4Var.f9950c = null;
                    } else if (this == m4Var.f9951d) {
                        m4Var.f9951d = null;
                    } else {
                        m4Var.f9600a.a().f9828f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f9916c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        int i10;
        boolean z9 = false;
        while (!z9) {
            try {
                this.f9917d.f9957j.acquire();
                z9 = true;
            } catch (InterruptedException e10) {
                this.f9917d.f9600a.a().f9831i.b(String.valueOf(getName()).concat(" was interrupted"), e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                k4 k4Var = (k4) this.f9915b.poll();
                if (k4Var != null) {
                    if (true != k4Var.f9888b) {
                        i10 = 10;
                    } else {
                        i10 = threadPriority;
                    }
                    Process.setThreadPriority(i10);
                    k4Var.run();
                } else {
                    synchronized (this.f9914a) {
                        try {
                            if (this.f9915b.peek() == null) {
                                this.f9917d.getClass();
                                this.f9914a.wait(30000);
                            }
                        } catch (InterruptedException e11) {
                            this.f9917d.f9600a.a().f9831i.b(String.valueOf(getName()).concat(" was interrupted"), e11);
                        } catch (Throwable th) {
                            while (true) {
                            }
                            throw th;
                        }
                    }
                    synchronized (this.f9917d.f9956i) {
                        if (this.f9915b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
