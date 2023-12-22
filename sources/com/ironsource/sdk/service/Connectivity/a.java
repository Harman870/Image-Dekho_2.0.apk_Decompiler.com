package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f5735a;

    /* renamed from: b  reason: collision with root package name */
    public C0071a f5736b = new C0071a();

    /* renamed from: com.ironsource.sdk.service.Connectivity.a$a  reason: collision with other inner class name */
    public class C0071a extends BroadcastReceiver {
        public C0071a() {
        }

        public void onReceive(Context context, Intent intent) {
            String a10 = com.ironsource.d.a.a(context);
            if (a10.equals("none")) {
                a.this.f5735a.a();
                return;
            }
            d dVar = a.this.f5735a;
            new JSONObject();
            dVar.a(a10);
        }
    }

    public a(d dVar) {
        this.f5735a = dVar;
    }

    public final void a() {
        this.f5736b = null;
    }

    public final void a(Context context) {
        try {
            context.registerReceiver(this.f5736b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b(Context context) {
        try {
            context.unregisterReceiver(this.f5736b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e10) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e10);
        }
    }

    public final JSONObject c(Context context) {
        return new JSONObject();
    }
}
