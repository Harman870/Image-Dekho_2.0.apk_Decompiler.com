package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import z3.a;

public final class s0 extends h0 implements u0 {
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeLong(j10);
        d(23, b10);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        j0.c(b10, bundle);
        d(9, b10);
    }

    public final void endAdUnitExposure(String str, long j10) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeLong(j10);
        d(24, b10);
    }

    public final void generateEventId(x0 x0Var) {
        Parcel b10 = b();
        j0.d(b10, x0Var);
        d(22, b10);
    }

    public final void getCachedAppInstanceId(x0 x0Var) {
        Parcel b10 = b();
        j0.d(b10, x0Var);
        d(19, b10);
    }

    public final void getConditionalUserProperties(String str, String str2, x0 x0Var) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        j0.d(b10, x0Var);
        d(10, b10);
    }

    public final void getCurrentScreenClass(x0 x0Var) {
        Parcel b10 = b();
        j0.d(b10, x0Var);
        d(17, b10);
    }

    public final void getCurrentScreenName(x0 x0Var) {
        Parcel b10 = b();
        j0.d(b10, x0Var);
        d(16, b10);
    }

    public final void getGmpAppId(x0 x0Var) {
        Parcel b10 = b();
        j0.d(b10, x0Var);
        d(21, b10);
    }

    public final void getMaxUserProperties(String str, x0 x0Var) {
        Parcel b10 = b();
        b10.writeString(str);
        j0.d(b10, x0Var);
        d(6, b10);
    }

    public final void getUserProperties(String str, String str2, boolean z9, x0 x0Var) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        ClassLoader classLoader = j0.f8270a;
        b10.writeInt(z9 ? 1 : 0);
        j0.d(b10, x0Var);
        d(5, b10);
    }

    public final void initialize(a aVar, d1 d1Var, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        j0.c(b10, d1Var);
        b10.writeLong(j10);
        d(1, b10);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        j0.c(b10, bundle);
        b10.writeInt(z9 ? 1 : 0);
        b10.writeInt(z10 ? 1 : 0);
        b10.writeLong(j10);
        d(2, b10);
    }

    public final void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) {
        Parcel b10 = b();
        b10.writeInt(5);
        b10.writeString(str);
        j0.d(b10, aVar);
        j0.d(b10, aVar2);
        j0.d(b10, aVar3);
        d(33, b10);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        j0.c(b10, bundle);
        b10.writeLong(j10);
        d(27, b10);
    }

    public final void onActivityDestroyed(a aVar, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        b10.writeLong(j10);
        d(28, b10);
    }

    public final void onActivityPaused(a aVar, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        b10.writeLong(j10);
        d(29, b10);
    }

    public final void onActivityResumed(a aVar, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        b10.writeLong(j10);
        d(30, b10);
    }

    public final void onActivitySaveInstanceState(a aVar, x0 x0Var, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        j0.d(b10, x0Var);
        b10.writeLong(j10);
        d(31, b10);
    }

    public final void onActivityStarted(a aVar, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        b10.writeLong(j10);
        d(25, b10);
    }

    public final void onActivityStopped(a aVar, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        b10.writeLong(j10);
        d(26, b10);
    }

    public final void registerOnMeasurementEventListener(a1 a1Var) {
        Parcel b10 = b();
        j0.d(b10, a1Var);
        d(35, b10);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel b10 = b();
        j0.c(b10, bundle);
        b10.writeLong(j10);
        d(8, b10);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j10) {
        Parcel b10 = b();
        j0.d(b10, aVar);
        b10.writeString(str);
        b10.writeString(str2);
        b10.writeLong(j10);
        d(15, b10);
    }

    public final void setDataCollectionEnabled(boolean z9) {
        Parcel b10 = b();
        ClassLoader classLoader = j0.f8270a;
        b10.writeInt(z9 ? 1 : 0);
        d(39, b10);
    }

    public final void setEventInterceptor(a1 a1Var) {
        Parcel b10 = b();
        j0.d(b10, a1Var);
        d(34, b10);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z9, long j10) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        j0.d(b10, aVar);
        b10.writeInt(z9 ? 1 : 0);
        b10.writeLong(j10);
        d(4, b10);
    }
}
