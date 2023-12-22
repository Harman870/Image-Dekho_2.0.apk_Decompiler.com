package s5;

import a7.n0;
import android.util.Log;
import android.widget.RelativeLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import o0.c;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11880b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f11879a = i10;
        this.f11880b = obj;
    }

    public final void run() {
        boolean z9;
        boolean z10;
        RelativeLayout container;
        switch (this.f11879a) {
            case 0:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.f11880b;
                cVar.f3312b = false;
                c cVar2 = SideSheetBehavior.this.f3298i;
                if (cVar2 == null || !cVar2.g()) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.f3297h == 2) {
                        sideSheetBehavior.s(cVar.f3311a);
                        return;
                    }
                    return;
                }
                cVar.a(cVar.f3311a);
                return;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f11880b;
                a aVar = FirebaseMessaging.f3484l;
                FirebaseMessaging.a aVar2 = firebaseMessaging.f3493g;
                synchronized (aVar2) {
                    aVar2.a();
                    Boolean bool = aVar2.f3499c;
                    if (bool != null) {
                        z9 = bool.booleanValue();
                    } else {
                        c6.f fVar = FirebaseMessaging.this.f3487a;
                        fVar.a();
                        z6.a aVar3 = fVar.f2500g.get();
                        synchronized (aVar3) {
                            z10 = aVar3.f13229b;
                        }
                        z9 = z10;
                    }
                }
                if (z9) {
                    firebaseMessaging.d();
                    return;
                }
                return;
            case 2:
                n0.a aVar4 = (n0.a) this.f11880b;
                aVar4.getClass();
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar4.f189a.getAction() + " Releasing WakeLock.");
                aVar4.f190b.trySetResult(null);
                return;
            case 3:
                CountDownLatch countDownLatch = (CountDownLatch) this.f11880b;
                IronSourceThreadManager ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
                x8.f.f(countDownLatch, "$latch");
                countDownLatch.countDown();
                return;
            case 4:
                com.ironsource.mediationsdk.testSuite.a aVar5 = (com.ironsource.mediationsdk.testSuite.a) this.f11880b;
                x8.f.f(aVar5, "this$0");
                RelativeLayout relativeLayout = aVar5.f4893c;
                if (relativeLayout != null) {
                    relativeLayout.removeAllViews();
                }
                TestSuiteActivity testSuiteActivity = aVar5.f4891a.get();
                if (!(testSuiteActivity == null || (container = testSuiteActivity.getContainer()) == null)) {
                    container.removeView(aVar5.f4893c);
                }
                aVar5.f4893c = null;
                return;
            default:
                try {
                    ((Callable) this.f11880b).call();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
