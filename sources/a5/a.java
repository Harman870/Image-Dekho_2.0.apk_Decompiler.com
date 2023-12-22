package a5;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.concurrent.Callable;
import x8.f;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f57a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f58b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f57a = i10;
        this.f58b = obj;
    }

    public final void run() {
        switch (this.f57a) {
            case 1:
                TestSuiteActivity testSuiteActivity = (TestSuiteActivity) this.f58b;
                int i10 = TestSuiteActivity.f4887d;
                f.f(testSuiteActivity, "this$0");
                testSuiteActivity.finish();
                return;
            default:
                try {
                    ((Callable) this.f58b).call();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
