package j4;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import z3.a;

public interface u0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(x0 x0Var);

    void getAppInstanceId(x0 x0Var);

    void getCachedAppInstanceId(x0 x0Var);

    void getConditionalUserProperties(String str, String str2, x0 x0Var);

    void getCurrentScreenClass(x0 x0Var);

    void getCurrentScreenName(x0 x0Var);

    void getGmpAppId(x0 x0Var);

    void getMaxUserProperties(String str, x0 x0Var);

    void getSessionId(x0 x0Var);

    void getTestFlag(x0 x0Var, int i10);

    void getUserProperties(String str, String str2, boolean z9, x0 x0Var);

    void initForTests(Map map);

    void initialize(a aVar, d1 d1Var, long j10);

    void isDataCollectionEnabled(x0 x0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, x0 x0Var, long j10);

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j10);

    void onActivityDestroyed(a aVar, long j10);

    void onActivityPaused(a aVar, long j10);

    void onActivityResumed(a aVar, long j10);

    void onActivitySaveInstanceState(a aVar, x0 x0Var, long j10);

    void onActivityStarted(a aVar, long j10);

    void onActivityStopped(a aVar, long j10);

    void performAction(Bundle bundle, x0 x0Var, long j10);

    void registerOnMeasurementEventListener(a1 a1Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(a aVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z9);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(a1 a1Var);

    void setInstanceIdProvider(c1 c1Var);

    void setMeasurementEnabled(boolean z9, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, a aVar, boolean z9, long j10);

    void unregisterOnMeasurementEventListener(a1 a1Var);
}
