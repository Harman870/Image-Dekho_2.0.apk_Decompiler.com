package r3;

import android.content.Intent;
import q3.f;

public final class x extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f11648a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f11649b;

    public x(Intent intent, f fVar) {
        this.f11648a = intent;
        this.f11649b = fVar;
    }

    public final void a() {
        Intent intent = this.f11648a;
        if (intent != null) {
            this.f11649b.startActivityForResult(intent, 2);
        }
    }
}
