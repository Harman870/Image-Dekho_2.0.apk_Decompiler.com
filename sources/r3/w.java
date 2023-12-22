package r3;

import android.app.Activity;
import android.content.Intent;

public final class w extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f11644a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f11645b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11646c = 2;

    public w(Activity activity, Intent intent) {
        this.f11644a = intent;
        this.f11645b = activity;
    }

    public final void a() {
        Intent intent = this.f11644a;
        if (intent != null) {
            this.f11645b.startActivityForResult(intent, this.f11646c);
        }
    }
}
