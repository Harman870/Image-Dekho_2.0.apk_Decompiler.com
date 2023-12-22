package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.mediationsdk.U;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends Thread {

    /* renamed from: j  reason: collision with root package name */
    public static final AnonymousClass1 f3686j = new m7.a() {
        public static String a(int i10) {
            String str = "not defined message for " + i10;
            if (i10 != 404) {
                switch (i10) {
                    case IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL /*1004*/:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i10) {
                            case IronSourceError.AUCTION_ERROR_DECOMPRESSION /*1008*/:
                                return "socket timeout exception";
                            case 1009:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND /*1011*/:
                                return "http error code";
                            default:
                                switch (i10) {
                                    case IronSourceError.ERROR_NT_EMPTY_DEFAULT_PLACEMENT /*1018*/:
                                        return "file not found exception";
                                    case IronSourceError.ERROR_BN_EMPTY_DEFAULT_PLACEMENT /*1019*/:
                                        return "out of memory exception";
                                    case 1020:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        public static String a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb = new StringBuilder();
            if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null)) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = "wifi";
                        } else {
                            sb.append(typeName);
                        }
                        sb.append(str);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return sb.toString();
        }

        public static String a(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        public static String a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(b(str.getBytes("UTF-8"), (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e10.getMessage());
                e10.printStackTrace();
                return "";
            }
        }

        public static Map<String, Object> a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        public static void a(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                context.startActivity(intent);
                return;
            }
            throw new Exception("url is null");
        }

        public static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        public static JSONObject b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }

        public static boolean b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static byte[] b(byte[] bArr, RSAPublicKey rSAPublicKey) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, rSAPublicKey);
                return instance.doFinal(bArr);
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e10.getMessage());
                throw new RuntimeException(e10);
            }
        }

        public static int c(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }

        public static String c() {
            try {
                new U();
                return U.a();
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        public static int d(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }

        public static boolean d() {
            try {
                new U();
                U.a();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static String e(Context context) {
            if (context == null) {
                return "";
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : "";
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        public static int f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return -1;
        }

        public final void a() {
        }

        public final void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    };
    public static final C0040a k = new C0040a();

    /* renamed from: a  reason: collision with root package name */
    public m7.a f3687a = f3686j;

    /* renamed from: b  reason: collision with root package name */
    public C0040a f3688b = k;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f3689c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final int f3690d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3691e = false;

    /* renamed from: f  reason: collision with root package name */
    public volatile int f3692f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3693g = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f3694h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final b f3695i = new b();

    /* renamed from: com.ironsource.environment.a$a  reason: collision with other inner class name */
    public static class C0040a implements m7.b {
        public final void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            a aVar = a.this;
            aVar.f3692f = (aVar.f3692f + 1) % Integer.MAX_VALUE;
        }
    }

    public a(int i10) {
        this.f3690d = i10;
    }

    public final void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f3694h < this.f3693g) {
            int i11 = this.f3692f;
            this.f3689c.post(this.f3695i);
            try {
                Thread.sleep((long) this.f3690d);
                if (this.f3692f != i11) {
                    this.f3694h = 0;
                } else if (this.f3691e || !Debug.isDebuggerConnected()) {
                    this.f3694h++;
                    this.f3687a.a();
                    String str = e.f3724c;
                    if (str != null && !str.trim().isEmpty()) {
                        new c(e.f3724c, String.valueOf(System.currentTimeMillis()), "ANR").d();
                    }
                } else {
                    if (this.f3692f != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f3692f;
                }
            } catch (InterruptedException e10) {
                this.f3688b.a(e10);
                return;
            }
        }
        if (this.f3694h >= this.f3693g) {
            this.f3687a.b();
        }
    }
}
