package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import x8.f;

public class j extends Dialog implements l, o {

    /* renamed from: a  reason: collision with root package name */
    public m f275a;

    /* renamed from: b  reason: collision with root package name */
    public final OnBackPressedDispatcher f276b = new OnBackPressedDispatcher(new i(0, this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, int i10) {
        super(context, i10);
        f.f(context, "context");
    }

    public static void a(j jVar) {
        f.f(jVar, "this$0");
        super.onBackPressed();
    }

    public final OnBackPressedDispatcher b() {
        return this.f276b;
    }

    public final void onBackPressed() {
        this.f276b.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f276b;
            onBackPressedDispatcher.f253e = getOnBackInvokedDispatcher();
            onBackPressedDispatcher.c();
        }
        m mVar = this.f275a;
        if (mVar == null) {
            mVar = new m(this);
            this.f275a = mVar;
        }
        mVar.f(g.b.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m mVar = this.f275a;
        if (mVar == null) {
            mVar = new m(this);
            this.f275a = mVar;
        }
        mVar.f(g.b.ON_RESUME);
    }

    public void onStop() {
        m mVar = this.f275a;
        if (mVar == null) {
            mVar = new m(this);
            this.f275a = mVar;
        }
        mVar.f(g.b.ON_DESTROY);
        this.f275a = null;
        super.onStop();
    }

    public final m r() {
        m mVar = this.f275a;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this);
        this.f275a = mVar2;
        return mVar2;
    }
}
