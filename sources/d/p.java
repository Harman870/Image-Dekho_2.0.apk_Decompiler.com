package d;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.j;
import d.t;
import h0.f;

public class p extends j implements g {

    /* renamed from: c  reason: collision with root package name */
    public i f5944c;

    /* renamed from: d  reason: collision with root package name */
    public final o f5945d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903437(0x7f03018d, float:1.7413692E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            d.o r2 = new d.o
            r3 = r4
            androidx.appcompat.app.b r3 = (androidx.appcompat.app.b) r3
            r2.<init>(r3)
            r4.f5945d = r2
            d.h r2 = r4.d()
            if (r6 != 0) goto L_0x0037
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0037:
            r5 = r2
            d.i r5 = (d.i) r5
            r5.U = r6
            r2.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.p.<init>(android.content.Context, int):void");
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().c(view, layoutParams);
    }

    public final h d() {
        if (this.f5944c == null) {
            t.a aVar = h.f5872a;
            this.f5944c = new i(getContext(), getWindow(), this, this);
        }
        return this.f5944c;
    }

    public final void dismiss() {
        super.dismiss();
        d().p();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.b(this.f5945d, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final <T extends View> T findViewById(int i10) {
        return d().f(i10);
    }

    public final void invalidateOptionsMenu() {
        d().l();
    }

    public final void k() {
    }

    public final void n() {
    }

    public void onCreate(Bundle bundle) {
        d().k();
        super.onCreate(bundle);
        d().o();
    }

    public final void onStop() {
        super.onStop();
        d().s();
    }

    public final void q() {
    }

    public final void setContentView(int i10) {
        d().v(i10);
    }

    public final void setContentView(View view) {
        d().w(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().x(view, layoutParams);
    }

    public final void setTitle(int i10) {
        super.setTitle(i10);
        d().A(getContext().getString(i10));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().A(charSequence);
    }
}
