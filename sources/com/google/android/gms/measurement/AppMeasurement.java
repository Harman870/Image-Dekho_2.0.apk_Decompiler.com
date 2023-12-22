package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m4.a;
import m4.b;
import m4.c;
import n4.b6;
import n4.n4;
import r3.o;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f2836b;

    /* renamed from: a  reason: collision with root package name */
    public final c f2837a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            o.h(bundle);
            this.mAppId = (String) z5.c.u(bundle, "app_id", cls2, (Object) null);
            this.mOrigin = (String) z5.c.u(bundle, "origin", cls2, (Object) null);
            this.mName = (String) z5.c.u(bundle, "name", cls2, (Object) null);
            this.mValue = z5.c.u(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) z5.c.u(bundle, "trigger_event_name", cls2, (Object) null);
            this.mTriggerTimeout = ((Long) z5.c.u(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) z5.c.u(bundle, "timed_out_event_name", cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) z5.c.u(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) z5.c.u(bundle, "triggered_event_name", cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) z5.c.u(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) z5.c.u(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) z5.c.u(bundle, "expired_event_name", cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) z5.c.u(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) z5.c.u(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) z5.c.u(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) z5.c.u(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    public AppMeasurement(b6 b6Var) {
        this.f2837a = new b(b6Var);
    }

    public AppMeasurement(n4 n4Var) {
        this.f2837a = new a(n4Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f2836b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f2836b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r3 = "getScionFrontendApiImplementation"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{  }
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r8 = 1
            r5[r8] = r6     // Catch:{  }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r14     // Catch:{  }
            r3[r8] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            n4.b6 r2 = (n4.b6) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((n4.b6) r2)     // Catch:{ all -> 0x0056 }
            f2836b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            j4.d1 r13 = new j4.d1     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            n4.n4 r14 = n4.n4.s(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((n4.n4) r14)     // Catch:{ all -> 0x0056 }
            f2836b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f2836b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f2837a.a(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f2837a.c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f2837a.h(str);
    }

    @Keep
    public long generateEventId() {
        return this.f2837a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f2837a.b();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> d10 = this.f2837a.d(str, str2);
        ArrayList arrayList = new ArrayList(d10 == null ? 0 : d10.size());
        for (Bundle conditionalUserProperty : d10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f2837a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f2837a.f();
    }

    @Keep
    public String getGmpAppId() {
        return this.f2837a.j();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f2837a.zza(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z9) {
        return this.f2837a.e(str, str2, z9);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f2837a.l(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        o.h(conditionalUserProperty);
        c cVar = this.f2837a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            z5.c.y(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.k(bundle);
    }
}
