package x;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import h0.f;
import m.h;

public class i extends Activity implements l, f.a {

    /* renamed from: a  reason: collision with root package name */
    public m f12782a = new m(this);

    public i() {
        new h();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.a(decorView, keyEvent)) {
            return f.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        m mVar = this.f12782a;
        mVar.e("markState");
        g.c cVar = g.c.CREATED;
        mVar.e("setCurrentState");
        mVar.g(cVar);
        super.onSaveInstanceState(bundle);
    }

    public m r() {
        return this.f12782a;
    }
}
