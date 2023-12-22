package y;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import x.r;
import z.f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13006a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13007b = new Object();

    /* renamed from: y.a$a  reason: collision with other inner class name */
    public static class C0168a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static class b {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class c {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class d {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (d0.a.a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (new r(context).f12822a.areNotificationsEnabled()) {
                return 0;
            }
            return -1;
        }
    }

    public static ColorStateList b(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.f13100c) {
            SparseArray sparseArray = f.f13099b.get(dVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (cVar = (f.c) sparseArray.get(i10)) == null)) {
                if (!cVar.f13102b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f13103c == 0) && (theme == null || cVar.f13103c != theme.hashCode()))) {
                    sparseArray.remove(i10);
                } else {
                    colorStateList2 = cVar.f13101a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = f.f13098a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z9 = true;
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            z9 = false;
        }
        if (!z9) {
            try {
                colorStateList = z.b.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return f.b.b(resources, i10, theme);
        }
        synchronized (f.f13100c) {
            WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = f.f13099b;
            SparseArray sparseArray2 = weakHashMap.get(dVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(dVar, sparseArray2);
            }
            sparseArray2.append(i10, new f.c(colorStateList, dVar.f13104a.getConfiguration(), theme));
        }
        return colorStateList;
    }
}
