package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.activity.result.c;

public abstract class u<E> extends c {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1635b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1636c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1637d;

    /* renamed from: e  reason: collision with root package name */
    public final z f1638e = new z();

    public u(p pVar) {
        Handler handler = new Handler();
        this.f1635b = pVar;
        if (pVar != null) {
            this.f1636c = pVar;
            this.f1637d = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract p A();

    public abstract LayoutInflater B();

    public abstract void C();
}
