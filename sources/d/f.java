package d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.q1;
import androidx.fragment.app.p;
import com.imgdkh.app.R;
import d.c;
import d.i;
import d.t;
import java.util.ArrayList;
import x.a;
import x.j;
import y.a;

public class f extends p implements g, c.b {
    public i w;

    public f() {
        this.f231e.f6042b.b("androidx:appcompat", new d(this));
        u(new e(this));
    }

    private void v() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        x8.f.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        x8.f.f(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        z().c(view, layoutParams);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(z().e(context));
    }

    public final void closeOptionsMenu() {
        a j10 = z().j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j10 == null || !j10.a()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a j10 = z().j();
        if (keyCode != 82 || j10 == null || !j10.j(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final <T extends View> T findViewById(int i10) {
        return z().f(i10);
    }

    public final MenuInflater getMenuInflater() {
        return z().i();
    }

    public final Resources getResources() {
        int i10 = q1.f921a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        z().l();
    }

    public final c.a j() {
        i iVar = (i) z();
        iVar.getClass();
        return new i.b();
    }

    public final void k() {
    }

    public final void n() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z().n(configuration);
    }

    public final void onContentChanged() {
    }

    public final void onDestroy() {
        super.onDestroy();
        z().p();
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z9;
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent intent;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a j10 = z().j();
        if (menuItem.getItemId() != 16908332 || j10 == null || (j10.d() & 4) == 0) {
            return false;
        }
        Intent a10 = j.a(this);
        if (a10 == null) {
            return false;
        }
        if (j.a.c(this, a10)) {
            ArrayList arrayList = new ArrayList();
            Intent a11 = j.a(this);
            if (a11 == null) {
                a11 = j.a(this);
            }
            if (a11 != null) {
                ComponentName component = a11.getComponent();
                if (component == null) {
                    component = a11.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        String b10 = j.b(this, component);
                        if (b10 == null) {
                            intent = null;
                        } else {
                            ComponentName componentName = new ComponentName(component.getPackageName(), b10);
                            if (j.b(this, componentName) == null) {
                                intent = Intent.makeMainActivity(componentName);
                            } else {
                                intent = new Intent().setComponent(componentName);
                            }
                        }
                        if (intent == null) {
                            break;
                        }
                        arrayList.add(size, intent);
                        component = intent.getComponent();
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e10);
                    }
                }
                arrayList.add(a11);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = a.f13006a;
                a.C0168a.a(this, intentArr, (Bundle) null);
                try {
                    int i11 = x.a.f12762c;
                    a.C0165a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            j.a.b(this, a10);
            return true;
        }
    }

    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((i) z()).K();
    }

    public final void onPostResume() {
        super.onPostResume();
        z().q();
    }

    public final void onStart() {
        super.onStart();
        z().r();
    }

    public final void onStop() {
        super.onStop();
        z().s();
    }

    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        z().A(charSequence);
    }

    public final void openOptionsMenu() {
        a j10 = z().j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j10 == null || !j10.k()) {
            super.openOptionsMenu();
        }
    }

    public final void q() {
    }

    public final void setContentView(int i10) {
        v();
        z().v(i10);
    }

    public void setContentView(View view) {
        v();
        z().w(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        z().x(view, layoutParams);
    }

    public final void setTheme(int i10) {
        super.setTheme(i10);
        z().z(i10);
    }

    public final void y() {
        z().l();
    }

    public final h z() {
        if (this.w == null) {
            t.a aVar = h.f5872a;
            this.w = new i(this, (Window) null, this, this);
        }
        return this.w;
    }
}
