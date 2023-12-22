package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import x8.f;

public interface l<I, O> {

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f4449a;

        public static void a(Runnable runnable, boolean z9) {
            f.f(runnable, "runnable");
            if (z9) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0, 2, (Object) null);
            }
        }

        public static void a(String str, String str2) {
            f.f(str, ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID);
            f.f(str2, "message");
            IronLog ironLog = IronLog.CALLBACK;
            ironLog.info(str2 + " instanceId=" + str + ' ');
        }

        public final T a() {
            return this.f4449a;
        }

        public final void a(T t10) {
            this.f4449a = t10;
        }
    }

    O a(I i10);
}
