package h0;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f6681a;

    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(m mVar) {
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.f6681a != null) {
            StringBuilder g10 = f.g("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            g10.append(getClass().getSimpleName());
            g10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", g10.toString());
        }
        this.f6681a = aVar;
    }
}
