package com.ironsource.sdk.service.Connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public String f5739a = com.ironsource.sdk.c.e.f5173a;

    /* renamed from: b  reason: collision with root package name */
    public int f5740b = 23;

    /* renamed from: c  reason: collision with root package name */
    public final d f5741c;

    /* renamed from: d  reason: collision with root package name */
    public a f5742d;

    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Context f5743a;

        public a(Context context) {
            this.f5743a = context;
        }

        public final void onAvailable(Network network) {
            if (network != null) {
                d dVar = e.this.f5741c;
                String a10 = com.ironsource.d.a.a(network, this.f5743a);
                com.ironsource.d.a.a(this.f5743a, network);
                dVar.a(a10);
                return;
            }
            d dVar2 = e.this.f5741c;
            String a11 = com.ironsource.d.a.a(this.f5743a);
            Context context = this.f5743a;
            com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
            dVar2.a(a11);
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                e.this.f5741c.a(com.ironsource.d.a.a(network, this.f5743a), com.ironsource.d.a.a(this.f5743a, network));
            }
        }

        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                e.this.f5741c.a(com.ironsource.d.a.a(network, this.f5743a), com.ironsource.d.a.a(this.f5743a, network));
            }
        }

        public final void onLost(Network network) {
            if (com.ironsource.d.a.a(this.f5743a).equals("none")) {
                e.this.f5741c.a();
            }
        }
    }

    public e(d dVar) {
        this.f5741c = dVar;
    }

    public final void a() {
        this.f5742d = null;
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= this.f5740b) {
            b(context);
            if (com.ironsource.d.a.a(context).equals("none")) {
                this.f5741c.a();
            }
            if (this.f5742d == null) {
                this.f5742d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f5742d);
                }
            } catch (Exception unused) {
                Log.e(this.f5739a, "NetworkCallback was not able to register");
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final void b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f5740b && this.f5742d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f5742d);
            } catch (Exception unused) {
                Log.e(this.f5739a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    public final JSONObject c(Context context) {
        return com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
    }
}
