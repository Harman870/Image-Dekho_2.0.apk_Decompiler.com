package o3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import androidx.fragment.app.z;
import com.imgdkh.app.R;
import q3.f;
import q3.v0;
import r3.o;
import r3.v;
import r3.w;
import r3.x;
import r3.y;
import w3.d;
import w3.g;
import x.k;
import x.m;
import x.n;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10552c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final e f10553d = new e();

    public static AlertDialog e(Context context, int i10, y yVar, DialogInterface.OnCancelListener onCancelListener) {
        int i11;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(v.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 == 1) {
            i11 = R.string.common_google_play_services_install_button;
        } else if (i10 == 2) {
            i11 = R.string.common_google_play_services_update_button;
        } else if (i10 != 3) {
            i11 = 17039370;
        } else {
            i11 = R.string.common_google_play_services_enable_button;
        }
        String string = resources.getString(i11);
        if (string != null) {
            builder.setPositiveButton(string, yVar);
        }
        String c10 = v.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)}), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof p) {
                z w = ((p) activity).w();
                k kVar = new k();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                    alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    kVar.f10569x0 = alertDialog;
                    if (onCancelListener != null) {
                        kVar.f10570y0 = onCancelListener;
                    }
                    kVar.u0 = false;
                    kVar.f1549v0 = true;
                    w.getClass();
                    a aVar = new a(w);
                    aVar.f1503o = true;
                    aVar.c(0, kVar, str, 1);
                    aVar.f();
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            cVar.f10542a = alertDialog;
            if (onCancelListener != null) {
                cVar.f10543b = onCancelListener;
            }
            cVar.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    public final Intent a(Context context, String str, int i10) {
        return super.a(context, str, i10);
    }

    public final int b(Context context, int i10) {
        return super.b(context, i10);
    }

    public final int c(Context context) {
        return super.b(context, f.f10555a);
    }

    public final void d(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e10 = e(activity, i10, new w(activity, super.a(activity, "d", i10)), onCancelListener);
        if (e10 != null) {
            f(activity, e10, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    @TargetApi(20)
    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i10 == 6) {
                str = v.e(context, "common_google_play_services_resolution_required_title");
            } else {
                str = v.c(context, i10);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i10 == 6 || i10 == 19) {
                str2 = v.d(context, "common_google_play_services_resolution_required_text", v.a(context));
            } else {
                str2 = v.b(context, i10);
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            o.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            n nVar = new n(context, (String) null);
            nVar.f12808m = true;
            nVar.f12814s.flags |= 16;
            nVar.f12801e = n.b(str);
            m mVar = new m();
            mVar.f12796b = n.b(str2);
            nVar.d(mVar);
            PackageManager packageManager = context.getPackageManager();
            if (d.f12741a == null) {
                d.f12741a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (d.f12741a.booleanValue()) {
                nVar.f12814s.icon = context.getApplicationInfo().icon;
                nVar.f12806j = 2;
                if (d.a(context)) {
                    nVar.f12798b.add(new k(resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    nVar.f12803g = pendingIntent;
                }
            } else {
                nVar.f12814s.icon = 17301642;
                nVar.f12814s.tickerText = n.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                nVar.f12814s.when = System.currentTimeMillis();
                nVar.f12803g = pendingIntent;
                nVar.f12802f = n.b(str2);
            }
            if (g.a()) {
                o.k(g.a());
                synchronized (f10552c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    nVar.f12812q = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                nVar.f12812q = "com.google.android.gms.availability";
            }
            Notification a10 = nVar.a();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                i.f10562a.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, a10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final void h(Activity activity, f fVar, int i10, v0 v0Var) {
        AlertDialog e10 = e(activity, i10, new x(super.a(activity, "d", i10), fVar), v0Var);
        if (e10 != null) {
            f(activity, e10, "GooglePlayServicesErrorDialog", v0Var);
        }
    }
}
