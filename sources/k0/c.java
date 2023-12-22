package k0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import k0.f;

public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9035a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f9035a = bVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        f fVar;
        e eVar = this.f9035a;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            fVar = new f(new f.a(inputContentInfo));
        } else {
            fVar = null;
        }
        if (((b) eVar).a(fVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
