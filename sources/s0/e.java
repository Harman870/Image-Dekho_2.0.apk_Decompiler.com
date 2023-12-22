package s0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.f;
import androidx.emoji2.text.j;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f11812a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11813b;

    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f11812a = keyListener;
        this.f11813b = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f11812a.clearMetaKeyState(view, editable, i10);
    }

    public final int getInputType() {
        return this.f11812a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z9;
        boolean z10;
        this.f11813b.getClass();
        Object obj = f.f1342i;
        if (i10 == 67) {
            z9 = j.a(editable, keyEvent, false);
        } else if (i10 != 112) {
            z9 = false;
        } else {
            z9 = j.a(editable, keyEvent, true);
        }
        if (z9) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f11812a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f11812a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f11812a.onKeyUp(view, editable, i10, keyEvent);
    }
}
