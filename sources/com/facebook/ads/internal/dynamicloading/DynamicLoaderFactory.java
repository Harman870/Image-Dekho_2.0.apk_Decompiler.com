package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.e;
import androidx.activity.f;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.Preconditions;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dalvik.system.DexClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Keep
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX = "audience_network.dex";
    private static final String CODE_CACHE_DIR = "code_cache";
    public static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = "releaseDL".equals(BuildConfig.BUILD_TYPE);
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static boolean sFallbackMode;
    /* access modifiers changed from: private */
    public static final AtomicBoolean sInitializing = new AtomicBoolean();
    private static boolean sUseLegacyClassLoader = true;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2723a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f2724b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ MultithreadedBundleWrapper f2725c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AudienceNetworkAds.InitListener f2726d;

        public a(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z9) {
            this.f2723a = context;
            this.f2724b = z9;
            this.f2725c = multithreadedBundleWrapper;
            this.f2726d = initListener;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            r5 = r1;
         */
        @android.annotation.SuppressLint({"CatchGeneralException"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                android.content.Context r0 = r10.f2723a
                com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.registerActivityCallbacks(r0)
                java.lang.Class<com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory> r0 = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.class
                monitor-enter(r0)
                r1 = 0
                r2 = 0
                r6 = r1
                r3 = r2
            L_0x000c:
                r4 = 3
                if (r3 >= r4) goto L_0x003a
                android.content.Context r4 = r10.f2723a     // Catch:{ all -> 0x0016 }
                com.facebook.ads.internal.dynamicloading.DynamicLoader r1 = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.doMakeLoader(r4, r2)     // Catch:{ all -> 0x0016 }
                goto L_0x003a
            L_0x0016:
                r4 = move-exception
                r5 = 2
                if (r3 != r5) goto L_0x0032
                boolean r5 = r10.f2724b     // Catch:{ all -> 0x004f }
                if (r5 != 0) goto L_0x0030
                android.content.Context r5 = r10.f2723a     // Catch:{ all -> 0x004f }
                java.lang.String r6 = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.createErrorMessage(r4)     // Catch:{ all -> 0x004f }
                r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
                com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.reportDexLoadingIssue(r5, r6, r7)     // Catch:{ all -> 0x004f }
                r5 = 1
                com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.setFallbackMode(r5)     // Catch:{ all -> 0x004f }
            L_0x0030:
                r6 = r4
                goto L_0x0037
            L_0x0032:
                r4 = 200(0xc8, double:9.9E-322)
                android.os.SystemClock.sleep(r4)     // Catch:{ all -> 0x004f }
            L_0x0037:
                int r3 = r3 + 1
                goto L_0x000c
            L_0x003a:
                r5 = r1
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                android.content.Context r4 = r10.f2723a
                boolean r7 = r10.f2724b
                com.facebook.ads.internal.settings.MultithreadedBundleWrapper r8 = r10.f2725c
                com.facebook.ads.AudienceNetworkAds$InitListener r9 = r10.f2726d
                com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.doCallInitialize(r4, r5, r6, r7, r8, r9)
                java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.sInitializing
                r0.set(r2)
                return
            L_0x004f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.a.run():void");
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AudienceNetworkAds.InitListener f2727a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Throwable f2728b;

        public b(AudienceNetworkAds.InitListener initListener, Throwable th) {
            this.f2727a = initListener;
            this.f2728b = th;
        }

        public final void run() {
            this.f2727a.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.f2728b));
        }
    }

    public class c implements AudienceNetworkAds.InitResult {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f2729a;

        public c(Throwable th) {
            this.f2729a = th;
        }

        public final String getMessage() {
            return DynamicLoaderFactory.createErrorMessage(this.f2729a);
        }

        public final boolean isSuccess() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(Throwable th) {
        return new c(th);
    }

    /* access modifiers changed from: private */
    public static String createErrorMessage(Throwable th) {
        StringBuilder g10 = f.g("Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.\n");
        g10.append(stackTraceToString(th));
        return g10.toString();
    }

    @TargetApi(26)
    private static ClassLoader createInMemoryClassLoader(Context context) {
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()), DynamicLoaderFactory.class.getClassLoader());
            }
        }
    }

    /* access modifiers changed from: private */
    public static void doCallInitialize(Context context, DynamicLoader dynamicLoader, Throwable th, boolean z9, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        if (th != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(initListener, th), 100);
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
            }
        } else if (dynamicLoader != null) {
            AudienceNetworkAdsApi createAudienceNetworkAdsApi = dynamicLoader.createAudienceNetworkAdsApi();
            if (z9) {
                createAudienceNetworkAdsApi.onContentProviderCreated(context);
            } else {
                createAudienceNetworkAdsApi.initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z9) {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader = atomicReference.get();
        if (dynamicLoader == null) {
            if (!LOAD_FROM_ASSETS) {
                dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            } else {
                long currentTimeMillis = System.currentTimeMillis() - System.currentTimeMillis();
                Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + currentTimeMillis);
                dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            }
            if (z9) {
                dynamicLoader.maybeInitInternally(context);
            }
            atomicReference.set(dynamicLoader);
        }
        return dynamicLoader;
    }

    @SuppressLint({"PrivateApi", "CatchGeneralException"})
    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th);
            return null;
        }
    }

    private static File getCacheCodeDirLegacy(Context context, File file) {
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (IOException unused) {
            File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    private static File getCodeCacheDir(Context context, File file) {
        return context.getCodeCacheDir();
    }

    public static DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file) {
        File file2 = new File(file, AUDIENCE_NETWORK_CODE_PATH);
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z9) {
        if (z9 || !sInitializing.getAndSet(true)) {
            new Thread(new a(context, multithreadedBundleWrapper, initListener, z9)).start();
        }
    }

    public static synchronized boolean isFallbackMode() {
        boolean z9;
        synchronized (DynamicLoaderFactory.class) {
            z9 = sFallbackMode;
        }
        return z9;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return createInMemoryClassLoader(context);
        }
        if (sUseLegacyClassLoader) {
            return makeLegacyAdsSdkClassLoader(context);
        }
        File secondaryDir = getSecondaryDir(getCodeCacheDir(context, new File(context.getApplicationInfo().dataDir)));
        StringBuilder sb = new StringBuilder();
        sb.append(secondaryDir.getPath());
        String c10 = e.c(sb, File.separator, AUDIENCE_NETWORK_DEX);
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(c10);
        byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(secondaryDir.getPath());
                File file = new File(e.c(sb2, File.separator, OPTIMIZED_DEX_PATH));
                mkdirChecked(file);
                return new DexClassLoader(c10, file.getPath(), (String) null, context.getClassLoader());
            }
        }
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String c10 = e.c(sb, File.separator, AUDIENCE_NETWORK_DEX);
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(c10);
        byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                return new DexClassLoader(c10, context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), (String) null, DynamicLoaderFactory.class.getClassLoader());
            }
        }
    }

    public static synchronized DynamicLoader makeLoader(Context context) {
        DynamicLoader makeLoader;
        synchronized (DynamicLoaderFactory.class) {
            makeLoader = makeLoader(context, true);
        }
        return makeLoader;
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoader(Context context, boolean z9) {
        DynamicLoader doMakeLoader;
        synchronized (DynamicLoaderFactory.class) {
            Preconditions.checkNotNull(context, "Context can not be null.");
            try {
                doMakeLoader = doMakeLoader(context, z9);
            } catch (Throwable th) {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
                DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th), 0.1d);
                DynamicLoader makeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
                sDynamicLoader.set(makeFallbackLoader);
                sFallbackMode = true;
                return makeFallbackLoader;
            }
        }
        return doMakeLoader;
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoaderUnsafe() {
        synchronized (DynamicLoaderFactory.class) {
            AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
            if (atomicReference.get() == null) {
                Context applicationContextViaReflection = getApplicationContextViaReflection();
                if (applicationContextViaReflection != null) {
                    DynamicLoader makeLoader = makeLoader(applicationContextViaReflection, true);
                    return makeLoader;
                }
                throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
            }
            DynamicLoader dynamicLoader = atomicReference.get();
            return dynamicLoader;
        }
    }

    private static void mkdirChecked(File file) {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder g10 = f.g("Failed to create dir ");
                g10.append(file.getPath());
                g10.append(". Parent file is null.");
                str = g10.toString();
            } else {
                StringBuilder g11 = f.g("Failed to create dir ");
                g11.append(file.getPath());
                g11.append(". parent file is a dir ");
                g11.append(parentFile.isDirectory());
                g11.append(", a file ");
                g11.append(parentFile.isFile());
                g11.append(", exists ");
                g11.append(parentFile.exists());
                g11.append(", readable ");
                g11.append(parentFile.canRead());
                g11.append(", writable ");
                g11.append(parentFile.canWrite());
                str = g11.toString();
            }
            Log.e(AudienceNetworkAds.TAG, str);
            StringBuilder g12 = f.g("Failed to create directory ");
            g12.append(file.getPath());
            g12.append(", detailed message: ");
            g12.append(str);
            throw new IOException(g12.toString());
        }
    }

    public static synchronized void setFallbackMode(boolean z9) {
        synchronized (DynamicLoaderFactory.class) {
            if (z9) {
                sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
            } else {
                sDynamicLoader.set((Object) null);
                sFallbackMode = false;
            }
        }
    }

    public static void setUseLegacyClassLoader(boolean z9) {
        sUseLegacyClassLoader = z9;
    }

    private static String stackTraceToString(Throwable th) {
        return Log.getStackTraceString(th);
    }
}
