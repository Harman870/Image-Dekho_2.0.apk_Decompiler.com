package com.ironsource.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3655a = true;

    /* renamed from: b  reason: collision with root package name */
    public IronSourceError f3656b = null;

    public static String a(Context context) {
        return a(b(context), context);
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        String a10;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                String a11 = a.AnonymousClass1.a(context);
                if (TextUtils.isEmpty(a11)) {
                    return "none";
                }
                return a11;
            }
            if (networkCapabilities.hasTransport(1)) {
                a10 = "wifi";
            } else if (networkCapabilities.hasTransport(0)) {
                a10 = "3g";
            } else {
                a10 = a.AnonymousClass1.a(context);
                if (TextUtils.isEmpty(a10)) {
                    return "none";
                }
            }
            return a10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", c(context));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    @SuppressLint({"MissingPermission"})
    public static Network b(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean c(Context context) {
        Network b10 = b(context);
        String str = "";
        if (!(b10 == null || context == null)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(b10);
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            str = "wifi";
                        } else if (networkCapabilities.hasTransport(0)) {
                            str = "cellular";
                        } else if (networkCapabilities.hasTransport(4)) {
                            str = "vpn";
                        } else if (networkCapabilities.hasTransport(3)) {
                            str = "ethernet";
                        } else if (networkCapabilities.hasTransport(5)) {
                            str = "wifiAware";
                        } else if (networkCapabilities.hasTransport(6)) {
                            str = "lowpan";
                        } else if (networkCapabilities.hasTransport(2)) {
                            str = "bluetooth";
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return str.equals("vpn");
    }

    public void a(IronSourceError ironSourceError) {
        this.f3655a = false;
        this.f3656b = ironSourceError;
    }

    public boolean a() {
        return this.f3655a;
    }

    public IronSourceError b() {
        return this.f3656b;
    }

    public String toString() {
        StringBuilder sb;
        if (a()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f3655a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f3655a);
            sb.append(", IronSourceError:");
            sb.append(this.f3656b);
        }
        return sb.toString();
    }
}
