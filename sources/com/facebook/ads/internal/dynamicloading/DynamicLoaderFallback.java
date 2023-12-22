package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
class DynamicLoaderFallback {
    /* access modifiers changed from: private */
    public static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f2730a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f2731b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List f2732c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List f2733d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Map f2734e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f2735f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ List f2736g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Method f2737h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Method f2738i;

        public a(ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
            this.f2730a = arrayList;
            this.f2731b = hashMap;
            this.f2732c = arrayList2;
            this.f2733d = arrayList3;
            this.f2734e = hashMap2;
            this.f2735f = arrayList4;
            this.f2736g = arrayList5;
            this.f2737h = method;
            this.f2738i = method2;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f2730a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f2731b))) {
                }
                for (Method access$100 : this.f2732c) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$100) && DynamicLoaderFallback.reportError(obj, this.f2731b)) {
                        return null;
                    }
                }
                return null;
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                    obj2 = obj;
                } else {
                    obj2 = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                }
                Iterator it2 = this.f2733d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f2734e.get(obj), objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method access$1002 : this.f2735f) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1002)) {
                        this.f2734e.put(obj2, obj);
                    }
                }
                for (Method access$1003 : this.f2736g) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1003)) {
                        for (Ad ad : objArr) {
                            if (ad instanceof Ad) {
                                this.f2731b.put(obj2, ad);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f2737h)) {
                    this.f2731b.put(objArr[1], objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f2738i)) {
                    this.f2731b.put(objArr[1], objArr[0]);
                }
                return obj2;
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdListener f2739a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f2740b;

        public b(AdListener adListener, Ad ad) {
            this.f2739a = adListener;
            this.f2740b = ad;
        }

        public final void run() {
            this.f2739a.onError(this.f2740b, new AdError(-1, DynamicLoaderFactory.DEX_LOADING_ERROR_MESSAGE));
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Method f2741a;

        /* renamed from: b  reason: collision with root package name */
        public final a f2742b = new a();

        public class a implements InvocationHandler {
            public a() {
            }

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.f2741a = method;
                return null;
            }
        }

        public final <T> T a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f2742b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        Class cls = DynamicLoader.class;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c();
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.a(cls);
        dynamicLoader.createInterstitialAd((Context) null, (String) null, (InterstitialAd) null);
        arrayList5.add(cVar.f2741a);
        dynamicLoader.createRewardedVideoAd((Context) null, (String) null, (RewardedVideoAd) null);
        arrayList5.add(cVar.f2741a);
        Class cls2 = cls;
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.f2741a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.f2741a);
        dynamicLoader.createNativeAdApi((NativeAd) null, (NativeAdBaseApi) null);
        Method method = cVar.f2741a;
        dynamicLoader.createNativeBannerAdApi((NativeBannerAd) null, (NativeAdBaseApi) null);
        Method method2 = cVar.f2741a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.f2741a);
        nativeAdBaseApi.loadAd((NativeAdBase.NativeLoadAdConfig) null);
        arrayList2.add(cVar.f2741a);
        nativeAdBaseApi.buildLoadAdConfig((NativeAdBase) null);
        arrayList4.add(cVar.f2741a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.f2741a);
        interstitialAdApi.loadAd((InterstitialAd.InterstitialLoadAdConfig) null);
        arrayList2.add(cVar.f2741a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f2741a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.f2741a);
        rewardedVideoAdApi.loadAd((RewardedVideoAd.RewardedVideoLoadAdConfig) null);
        arrayList2.add(cVar.f2741a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f2741a);
        AdViewApi adViewApi = (AdViewApi) cVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.f2741a);
        adViewApi.loadAd((AdView.AdViewLoadConfig) null);
        arrayList2.add(cVar.f2741a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.f2741a);
        ((AdView.AdViewLoadConfigBuilder) cVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener((AdListener) null);
        arrayList3.add(cVar.f2741a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener((NativeAdListener) null);
        arrayList3.add(cVar.f2741a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener((InterstitialAdListener) null);
        arrayList3.add(cVar.f2741a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener((RewardedVideoAdListener) null);
        arrayList3.add(cVar.f2741a);
        a aVar = new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls2}, aVar);
    }

    /* access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad), 500);
        return true;
    }
}
