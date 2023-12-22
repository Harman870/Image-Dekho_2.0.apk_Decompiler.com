package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import f4.f;
import o3.b;
import o3.e;
import q3.d;
import r3.o;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2801b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f2802a = 0;

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2802a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d f10 = d.f(this);
                if (i11 == -1) {
                    f fVar = f10.f11224n;
                    fVar.sendMessage(fVar.obtainMessage(3));
                } else if (i11 == 0) {
                    f10.g(new b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f2802a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f2802a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2802a = bundle.getInt("resolution");
        }
        if (this.f2802a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.f2802a = 1;
                        return;
                    } catch (ActivityNotFoundException e10) {
                        if (extras.getBoolean("notify_manager", true)) {
                            d.f(this).g(new b(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj = pendingIntent.toString();
                            StringBuilder sb = new StringBuilder(obj.length() + 36);
                            sb.append("Activity not found while launching ");
                            sb.append(obj);
                            sb.append(".");
                            String sb2 = sb.toString();
                            if (Build.FINGERPRINT.contains("generic")) {
                                sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", sb2, e10);
                        }
                        this.f2802a = 1;
                    } catch (IntentSender.SendIntentException e11) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    }
                } else {
                    o.h(num);
                    e.f10553d.d(this, num.intValue(), this);
                    this.f2802a = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2802a);
        super.onSaveInstanceState(bundle);
    }
}
