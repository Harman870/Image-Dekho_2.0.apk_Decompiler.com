package a7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.imgdkh.app.R;
import com.wallpapersindia.app.HomeScreen;
import com.wallpapersindia.app.pro.MainActivityPro;
import j8.o;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f160b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f161c;

    public /* synthetic */ k(Object obj, int i10, Object obj2) {
        this.f159a = i10;
        this.f160b = obj;
        this.f161c = obj2;
    }

    public final Object call() {
        int i10;
        ComponentName componentName;
        String str = null;
        switch (this.f159a) {
            case 0:
                Context context = (Context) this.f160b;
                Intent intent = (Intent) this.f161c;
                d0 a10 = d0.a();
                a10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                a10.f111d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a10) {
                    String str2 = a10.f108a;
                    if (str2 != null) {
                        str = str2;
                    } else {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null) {
                            ServiceInfo serviceInfo = resolveService.serviceInfo;
                            if (serviceInfo != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName)) {
                                    String str3 = serviceInfo.name;
                                    if (str3 != null) {
                                        if (str3.startsWith(".")) {
                                            str = context.getPackageName() + serviceInfo.name;
                                        } else {
                                            str = serviceInfo.name;
                                        }
                                        a10.f108a = str;
                                    }
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + str);
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a10.c(context)) {
                        componentName = l0.b(context, intent2);
                    } else {
                        componentName = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentName == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                } catch (IllegalStateException e11) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
                    i10 = 402;
                }
                return Integer.valueOf(i10);
            case 1:
                y yVar = (y) this.f160b;
                int i11 = HomeScreen.A;
                yVar.getClass();
                a aVar = new a(yVar);
                aVar.d(R.id.frame_layout, (o) this.f161c);
                aVar.f();
                return null;
            default:
                int i12 = MainActivityPro.K;
                ((MainActivityPro) this.f160b).getClass();
                ((View) this.f161c).getId();
                return null;
        }
    }
}
