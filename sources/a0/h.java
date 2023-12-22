package a0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.activity.f;
import e0.m;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z.d;

public class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f23f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f24g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f25h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f26i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f27j;
    public final Method k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f28l;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m(cls2);
            method2 = n(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = o(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder g10 = f.g("Unable to collect necessary methods for class ");
            g10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", g10.toString(), e10);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f23f = cls;
        this.f24g = constructor;
        this.f25h = method3;
        this.f26i = method2;
        this.f27j = method;
        this.k = method4;
        this.f28l = method5;
    }

    public static Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public static Method n(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        if (!l()) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f24g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0172d dVar : cVar.f13085a) {
            if (!i(context, obj, dVar.f13086a, dVar.f13090e, dVar.f13087b, dVar.f13088c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f13089d))) {
                try {
                    this.k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    public final Typeface b(Context context, m[] mVarArr, int i10) {
        Object obj;
        Typeface j10;
        boolean z9;
        ParcelFileDescriptor openFileDescriptor;
        if (mVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            m f10 = f(i10, mVarArr);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f6151a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.f6153c).setItalic(f10.f6154d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (m mVar : mVarArr) {
                if (mVar.f6155e == 0) {
                    Uri uri = mVar.f6151a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, m.e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f24g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            boolean z10 = false;
            for (m mVar2 : mVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f6151a);
                if (byteBuffer != null) {
                    try {
                        z9 = ((Boolean) this.f26i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(mVar2.f6152b), null, Integer.valueOf(mVar2.f6153c), Integer.valueOf(mVar2.f6154d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z9 = false;
                    }
                    if (!z9) {
                        try {
                            this.k.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                        }
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                try {
                    this.k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                }
                return null;
            } else if (k(obj) && (j10 = j(obj)) != null) {
                return Typeface.create(j10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f24g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f25h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f23f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f28l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f27j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f25h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f25h != null;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
