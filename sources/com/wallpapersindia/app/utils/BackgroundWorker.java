package com.wallpapersindia.app.utils;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.Window;
import c6.b;
import com.imgdkh.app.R;
import e7.h;
import j9.d0;
import j9.q;
import j9.u;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l8.f;
import u9.b0;
import u9.c;
import u9.c0;
import u9.e;
import u9.i;
import u9.y;

public class BackgroundWorker extends AsyncTask<String, Integer, String> {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    public final Context f5847a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5848b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5849c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5850d;

    /* renamed from: e  reason: collision with root package name */
    public int f5851e = 201;

    /* renamed from: f  reason: collision with root package name */
    public f f5852f;

    /* renamed from: g  reason: collision with root package name */
    public Dialog f5853g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5854h = new String(Base64.decode(z(), 0));

    /* renamed from: i  reason: collision with root package name */
    public final String f5855i = new String(Base64.decode(x(), 0));

    /* renamed from: j  reason: collision with root package name */
    public String f5856j = new String(Base64.decode(a(), 0));
    public String k = new String(Base64.decode(b(), 0));

    public interface a {
        void s(int i10, String str, String str2);
    }

    static {
        System.loadLibrary("app");
    }

    public BackgroundWorker(Context context, a aVar, String str, boolean z9) {
        this.f5847a = context;
        this.f5848b = str;
        this.f5849c = aVar;
        this.f5850d = z9;
    }

    public native String a();

    public native String b();

    public final Object doInBackground(Object[] objArr) {
        boolean z9;
        String str;
        String str2;
        String str3;
        String[] strArr = (String[]) objArr;
        boolean z10 = false;
        boolean z11 = false;
        for (NetworkInfo networkInfo : ((ConnectivityManager) this.f5847a.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo.getTypeName().equalsIgnoreCase("WIFI") && networkInfo.isConnected()) {
                z10 = true;
            }
            if (networkInfo.getTypeName().equalsIgnoreCase("MOBILE") && networkInfo.isConnected()) {
                z11 = true;
            }
        }
        if (z10 || z11) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            str3 = this.f5856j;
            str2 = this.k;
            str = "{error:true,message:\"Please turn on your mobile data or wifi for use this application.\"}";
        } else {
            if (this.f5848b.equals(this.f5847a.getString(R.string.checker))) {
                try {
                    b0<d0> a10 = this.f5852f.i(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.checker) + "=" + this.f5847a.getString(R.string.checker)), this.f5855i).a();
                    this.f5851e = a10.f12245a.f8823c;
                    return ((d0) a10.f12246b).o();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.pre_splash_update))) {
                try {
                    b0<d0> a11 = this.f5852f.g(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.pre_splash_update) + "=" + this.f5847a.getString(R.string.pre_splash_update)), this.f5855i).a();
                    this.f5851e = a11.f12245a.f8823c;
                    return ((d0) a11.f12246b).o();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.splash_update))) {
                try {
                    b0<d0> a12 = this.f5852f.f(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.user_id) + "=" + strArr[1]), "Bearer " + strArr[0], this.f5855i).a();
                    this.f5851e = a12.f12245a.f8823c;
                    return ((d0) a12.f12246b).o();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.signup))) {
                try {
                    String str4 = strArr[0];
                    String str5 = strArr[1];
                    String str6 = strArr[2];
                    String str7 = strArr[3];
                    String str8 = strArr[4];
                    b0<d0> a13 = this.f5852f.h(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.email) + "=" + str5 + "&" + this.f5847a.getString(R.string.image) + "=" + str6 + "&" + this.f5847a.getString(R.string.name) + "=" + str4 + "&" + this.f5847a.getString(R.string.phone) + "=" + str7 + "&" + this.f5847a.getString(R.string.password) + "=" + strArr[5] + "&" + this.f5847a.getString(R.string.device_id) + "=" + str8 + "&" + this.f5847a.getString(R.string.referral_code) + "=" + strArr[7] + "&" + this.f5847a.getString(R.string.recapcha_token) + "=" + strArr[6]), this.f5855i).a();
                    this.f5851e = a13.f12245a.f8823c;
                    return ((d0) a13.f12246b).o();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.get_wallpaper))) {
                try {
                    b0<d0> a14 = this.f5852f.a(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.get_wallpaper) + "=" + this.f5847a.getString(R.string.get_wallpaper)), this.f5855i).a();
                    this.f5851e = a14.f12245a.f8823c;
                    return ((d0) a14.f12246b).o();
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.get_transactions))) {
                try {
                    String str9 = strArr[0];
                    b0<d0> a15 = this.f5852f.d(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.user_id) + "=" + strArr[1]), "Bearer " + str9, this.f5855i).a();
                    this.f5851e = a15.f12245a.f8823c;
                    return ((d0) a15.f12246b).o();
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.get_redeems))) {
                try {
                    String str10 = strArr[0];
                    b0<d0> a16 = this.f5852f.c(b.r(this.f5856j, this.k, this.f5847a.getString(R.string.user_id) + "=" + strArr[1]), "Bearer " + str10, this.f5855i).a();
                    this.f5851e = a16.f12245a.f8823c;
                    return ((d0) a16.f12246b).o();
                } catch (Exception e16) {
                    e16.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.set_redeem))) {
                try {
                    String str11 = strArr[0];
                    String str12 = strArr[1];
                    String str13 = strArr[2];
                    b0<d0> a17 = this.f5852f.e(b.r(this.f5856j, this.k, "type=" + strArr[4] + "&title=" + strArr[3] + "&redeem_amount=" + str13 + "&recapcha_token=" + strArr[5] + "&" + this.f5847a.getString(R.string.user_id) + "=" + str12), "Bearer " + str11, this.f5855i).a();
                    this.f5851e = a17.f12245a.f8823c;
                    return ((d0) a17.f12246b).o();
                } catch (Exception e17) {
                    e17.printStackTrace();
                }
            }
            if (this.f5848b.equals(this.f5847a.getString(R.string.add_spin_reward))) {
                try {
                    String str14 = strArr[0];
                    b0<d0> a18 = this.f5852f.b(b.r(this.f5856j, this.k, "spin_reward=" + strArr[2] + "&" + this.f5847a.getString(R.string.user_id) + "=" + strArr[1]), "Bearer " + str14, this.f5855i).a();
                    this.f5851e = a18.f12245a.f8823c;
                    return ((d0) a18.f12246b).o();
                } catch (Exception e18) {
                    e18.printStackTrace();
                }
            }
            str3 = this.f5856j;
            str2 = this.k;
            str = "{error:true,message:\"Server Not Responding Please Try After Some Time.\"}";
        }
        return b.r(str3, str2, str);
    }

    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f5850d) {
            this.f5853g.dismiss();
        }
        String str2 = this.f5856j;
        try {
            String[] split = str.split(":");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(split[1], 0));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, secretKeySpec, ivParameterSpec);
            String str3 = new String(instance.doFinal(Base64.decode(split[0], 0)));
            this.f5849c.s(this.f5851e, str3, this.f5848b);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void onPreExecute() {
        List list;
        List list2;
        int i10;
        StringBuilder sb;
        boolean z9;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f5847a);
        y yVar = y.f12359c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = this.f5854h;
        Objects.requireNonNull(str, "baseUrl == null");
        q.a aVar = new q.a();
        aVar.b((q) null, str);
        q a10 = aVar.a();
        List<String> list3 = a10.f8947f;
        if ("".equals(list3.get(list3.size() - 1))) {
            arrayList.add(new v9.a(new h()));
            u uVar = new u();
            Executor a11 = yVar.a();
            ArrayList arrayList3 = new ArrayList(arrayList2);
            i iVar = new i(a11);
            if (yVar.f12360a) {
                list = Arrays.asList(new c.a[]{e.f12257a, iVar});
            } else {
                list = Collections.singletonList(iVar);
            }
            arrayList3.addAll(list);
            ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + (yVar.f12360a ? 1 : 0));
            arrayList4.add(new u9.a());
            arrayList4.addAll(arrayList);
            if (yVar.f12360a) {
                list2 = Collections.singletonList(u9.u.f12316a);
            } else {
                list2 = Collections.emptyList();
            }
            arrayList4.addAll(list2);
            u9.d0 d0Var = new u9.d0(uVar, a10, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3));
            Class<f> cls = f.class;
            if (cls.isInterface()) {
                ArrayDeque arrayDeque = new ArrayDeque(1);
                arrayDeque.add(cls);
                while (!arrayDeque.isEmpty()) {
                    Class<f> cls2 = (Class) arrayDeque.removeFirst();
                    if (cls2.getTypeParameters().length != 0) {
                        StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                        sb2.append(cls2.getName());
                        if (cls2 != cls) {
                            sb2.append(" which is an interface of ");
                            sb2.append(cls.getName());
                        }
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    Collections.addAll(arrayDeque, cls2.getInterfaces());
                }
                if (d0Var.f12256f) {
                    y yVar2 = y.f12359c;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!yVar2.f12360a || !method.isDefault()) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (!z9 && !Modifier.isStatic(method.getModifiers())) {
                            d0Var.b(method);
                        }
                    }
                }
                this.f5852f = (f) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c0(d0Var));
                Dialog dialog = new Dialog(this.f5847a);
                this.f5853g = dialog;
                dialog.requestWindowFeature(1);
                this.f5853g.requestWindowFeature(1);
                this.f5853g.setContentView(R.layout.alert_dialog_progress);
                this.f5853g.setCancelable(false);
                Window window = this.f5853g.getWindow();
                Objects.requireNonNull(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                if (this.f5853g.getWindow() != null) {
                    this.f5853g.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                if (this.f5850d) {
                    this.f5853g.show();
                }
                if (!this.f5848b.equals(this.f5847a.getString(R.string.pre_splash_update))) {
                    int i11 = 0;
                    for (int i12 = 1; i12 <= 16; i12++) {
                        if (i12 == 1 || i12 == 2 || i12 == 3) {
                            StringBuilder sb3 = new StringBuilder();
                            i10 = i12 - 1;
                            sb3.append(this.f5856j.substring(0, i10));
                            sb3.append(defaultSharedPreferences.getString(this.f5847a.getString(R.string.fname), "").charAt(i11));
                            sb3.append(this.f5856j.substring(i12));
                            this.f5856j = sb3.toString();
                            sb = new StringBuilder();
                        } else {
                            if (!(i12 % 2 == 0 || i12 % 3 == 0)) {
                                StringBuilder sb4 = new StringBuilder();
                                i10 = i12 - 1;
                                sb4.append(this.f5856j.substring(0, i10));
                                sb4.append(defaultSharedPreferences.getString(this.f5847a.getString(R.string.fname), "").charAt(i11));
                                sb4.append(this.f5856j.substring(i12));
                                this.f5856j = sb4.toString();
                                sb = new StringBuilder();
                            }
                        }
                        sb.append(this.k.substring(0, i10));
                        sb.append(defaultSharedPreferences.getString(this.f5847a.getString(R.string.lname), "").charAt(i11));
                        sb.append(this.k.substring(i12));
                        this.k = sb.toString();
                        i11++;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + a10);
    }

    public native String x();

    public native String z();
}
