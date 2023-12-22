package b8;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f2338a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2339b;

    public c(a aVar, Handler handler) {
        this.f2339b = aVar;
        this.f2338a = handler;
    }

    public final void run() {
        int i10;
        com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.f2339b.f2330a.getParent(), this.f2339b.f2330a.getName());
        Message message = new Message();
        message.obj = cVar;
        String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
        if (makeDir == null) {
            i10 = 1020;
        } else {
            a aVar = this.f2339b;
            i10 = new b(new a(cVar, aVar.f2331b, aVar.f2332c, aVar.f2333d, aVar.f2334e), makeDir).call().f5727a;
            if (i10 == 200) {
                i10 = 1016;
            }
        }
        message.what = i10;
        this.f2338a.sendMessage(message);
    }
}
