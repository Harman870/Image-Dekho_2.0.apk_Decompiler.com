package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.ironsource.sdk.mediation.R;

public final class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f6395f;

    /* renamed from: a  reason: collision with root package name */
    public int f6396a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f6397b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f6398c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f6399d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f6400e;

    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super((Context) null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f6396a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f6397b = theme;
    }

    public final void a(Configuration configuration) {
        if (this.f6400e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f6399d == null) {
            this.f6399d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f6397b == null) {
            this.f6397b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f6397b.setTo(theme);
            }
        }
        this.f6397b.applyStyle(this.f6396a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f6395f) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f6400e
            if (r0 != 0) goto L_0x0036
            android.content.res.Configuration r0 = r3.f6399d
            if (r0 == 0) goto L_0x0030
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f6395f
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f6395f = r1
        L_0x001c:
            android.content.res.Configuration r1 = f6395f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0030
        L_0x0025:
            android.content.res.Configuration r0 = r3.f6399d
            android.content.Context r0 = g.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L_0x0034
        L_0x0030:
            android.content.res.Resources r0 = super.getResources()
        L_0x0034:
            r3.f6400e = r0
        L_0x0036:
            android.content.res.Resources r0 = r3.f6400e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.getResources():android.content.res.Resources");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f6398c == null) {
            this.f6398c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f6398c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f6397b;
        if (theme != null) {
            return theme;
        }
        if (this.f6396a == 0) {
            this.f6396a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f6397b;
    }

    public final void setTheme(int i10) {
        if (this.f6396a != i10) {
            this.f6396a = i10;
            b();
        }
    }
}
