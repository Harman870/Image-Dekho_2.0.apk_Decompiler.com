package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c6.f;
import com.google.android.gms.tasks.Tasks;
import d6.a;
import j4.c2;
import j4.i1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.b6;
import r3.o;
import v6.e;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f3457b;

    /* renamed from: a  reason: collision with root package name */
    public final c2 f3458a;

    public FirebaseAnalytics(c2 c2Var) {
        o.h(c2Var);
        this.f3458a = c2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f3457b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f3457b == null) {
                    f3457b = new FirebaseAnalytics(c2.c(context, (Bundle) null));
                }
            }
        }
        return f3457b;
    }

    @Keep
    public static b6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        c2 c10 = c2.c(context, bundle);
        if (c10 == null) {
            return null;
        }
        return new a(c10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = e.f12626m;
            return (String) Tasks.await(((e) f.d().b(v6.f.class)).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        c2 c2Var = this.f3458a;
        c2Var.getClass();
        c2Var.b(new i1(c2Var, activity, str, str2));
    }
}
