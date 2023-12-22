package d;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import d.r;
import d.t;
import d0.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import m.d;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static t.a f5872a = new t.a(new t.b());

    /* renamed from: b  reason: collision with root package name */
    public static int f5873b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static f f5874c = null;

    /* renamed from: d  reason: collision with root package name */
    public static f f5875d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f5876e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f5877f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final d<WeakReference<h>> f5878g = new d<>();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f5879h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f5880i = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean m(Context context) {
        if (f5876e == null) {
            try {
                int i10 = r.f5958a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, r.class), r.a.a() | 128).metaData;
                if (bundle != null) {
                    f5876e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f5876e = Boolean.FALSE;
            }
        }
        return f5876e.booleanValue();
    }

    public static void t(h hVar) {
        synchronized (f5879h) {
            Iterator<WeakReference<h>> it = f5878g.iterator();
            while (it.hasNext()) {
                h hVar2 = (h) it.next().get();
                if (hVar2 == hVar || hVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public Context e(Context context) {
        return context;
    }

    public abstract <T extends View> T f(int i10);

    public Context g() {
        return null;
    }

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract a j();

    public abstract void k();

    public abstract void l();

    public abstract void n(Configuration configuration);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i10);

    public abstract void v(int i10);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public void z(int i10) {
    }
}
