package d;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.imgdkh.app.R;

public final class c implements DrawerLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public final a f5860a;

    /* renamed from: b  reason: collision with root package name */
    public final DrawerLayout f5861b;

    /* renamed from: c  reason: collision with root package name */
    public f.b f5862c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5863d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5864e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5865f = false;

    public interface a {
        boolean a();

        void b(f.b bVar, int i10);

        Drawable c();

        void d(int i10);

        Context e();
    }

    public interface b {
        a j();
    }

    /* renamed from: d.c$c  reason: collision with other inner class name */
    public static class C0074c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f5866a;

        /* renamed from: d.c$c$a */
        public static class a {
            public static void a(ActionBar actionBar, int i10) {
                actionBar.setHomeActionContentDescription(i10);
            }

            public static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C0074c(Activity activity) {
            this.f5866a = activity;
        }

        public final boolean a() {
            ActionBar actionBar = this.f5866a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public final void b(f.b bVar, int i10) {
            ActionBar actionBar = this.f5866a.getActionBar();
            if (actionBar != null) {
                a.b(actionBar, bVar);
                a.a(actionBar, i10);
            }
        }

        public final Drawable c() {
            TypedArray obtainStyledAttributes = e().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        public final void d(int i10) {
            ActionBar actionBar = this.f5866a.getActionBar();
            if (actionBar != null) {
                a.a(actionBar, i10);
            }
        }

        public final Context e() {
            ActionBar actionBar = this.f5866a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f5866a;
        }
    }

    public static class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Toolbar f5867a;

        /* renamed from: b  reason: collision with root package name */
        public final Drawable f5868b;

        /* renamed from: c  reason: collision with root package name */
        public final CharSequence f5869c;

        public d(Toolbar toolbar) {
            this.f5867a = toolbar;
            this.f5868b = toolbar.getNavigationIcon();
            this.f5869c = toolbar.getNavigationContentDescription();
        }

        public final boolean a() {
            return true;
        }

        public final void b(f.b bVar, int i10) {
            this.f5867a.setNavigationIcon((Drawable) bVar);
            d(i10);
        }

        public final Drawable c() {
            return this.f5868b;
        }

        public final void d(int i10) {
            if (i10 == 0) {
                this.f5867a.setNavigationContentDescription(this.f5869c);
            } else {
                this.f5867a.setNavigationContentDescription(i10);
            }
        }

        public final Context e() {
            return this.f5867a.getContext();
        }
    }

    public c(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f5860a = new d(toolbar);
            toolbar.setNavigationOnClickListener(new b(this));
        } else if (activity instanceof b) {
            this.f5860a = ((b) activity).j();
        } else {
            this.f5860a = new C0074c(activity);
        }
        this.f5861b = drawerLayout;
        this.f5863d = R.string.navigation_drawer_open;
        this.f5864e = R.string.navigation_drawer_close;
        this.f5862c = new f.b(this.f5860a.e());
        this.f5860a.c();
    }

    public final void a() {
        e(1.0f);
        this.f5860a.d(this.f5864e);
    }

    public final void b() {
    }

    public final void c(float f10) {
        e(Math.min(1.0f, Math.max(0.0f, f10)));
    }

    public final void d() {
        e(0.0f);
        this.f5860a.d(this.f5863d);
    }

    public final void e(float f10) {
        f.b bVar;
        boolean z9;
        if (f10 == 1.0f) {
            bVar = this.f5862c;
            z9 = true;
        } else {
            if (f10 == 0.0f) {
                bVar = this.f5862c;
                z9 = false;
            }
            this.f5862c.setProgress(f10);
        }
        bVar.a(z9);
        this.f5862c.setProgress(f10);
    }
}
