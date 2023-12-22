package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: f  reason: collision with root package name */
    public static IronSourceLoggerManager f4670f;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<IronSourceLogger> f4671e;

    public IronSourceLoggerManager() {
        super("IronSourceLoggerManager");
        ArrayList<IronSourceLogger> arrayList = new ArrayList<>();
        this.f4671e = arrayList;
        arrayList.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            if (f4670f == null) {
                f4670f = new IronSourceLoggerManager();
            }
            ironSourceLoggerManager = f4670f;
        }
        return ironSourceLoggerManager;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            IronSourceLoggerManager ironSourceLoggerManager2 = f4670f;
            if (ironSourceLoggerManager2 == null) {
                f4670f = new IronSourceLoggerManager();
            } else {
                ironSourceLoggerManager2.f4667a = i10;
            }
            ironSourceLoggerManager = f4670f;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f4671e.add(ironSourceLogger);
    }

    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (i10 >= this.f4667a) {
            Iterator<IronSourceLogger> it = this.f4671e.iterator();
            while (it.hasNext()) {
                IronSourceLogger next = it.next();
                if (next.f4667a <= i10) {
                    next.log(ironSourceTag, str, i10);
                }
            }
        }
    }

    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f4671e.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
            return;
        }
        Iterator<IronSourceLogger> it2 = this.f4671e.iterator();
        while (it2.hasNext()) {
            it2.next().logException(ironSourceTag, str, th);
        }
    }

    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str != null) {
            IronSourceLogger ironSourceLogger = null;
            Iterator<IronSourceLogger> it = this.f4671e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IronSourceLogger next = it.next();
                if (next.f4668b.equals(str)) {
                    ironSourceLogger = next;
                    break;
                }
            }
            if (ironSourceLogger == null) {
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            } else if (i10 < 0 || i10 > 3) {
                this.f4671e.remove(ironSourceLogger);
            } else {
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag2, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
                ironSourceLogger.setDebugLevel(i10);
            }
        }
    }
}
