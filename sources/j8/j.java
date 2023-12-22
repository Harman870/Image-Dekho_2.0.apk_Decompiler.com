package j8;

import android.os.CountDownTimer;
import android.widget.Button;
import androidx.activity.f;

public final class j extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f8800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f8801b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(g gVar, long j10, int[] iArr) {
        super(j10, 1000);
        this.f8801b = gVar;
        this.f8800a = iArr;
    }

    public final void onFinish() {
        int[] iArr = this.f8800a;
        g gVar = this.f8801b;
        iArr[0] = gVar.f8791t0;
        gVar.u0 = 0;
        gVar.V.setEnabled(true);
        this.f8801b.V.setText("Submit");
    }

    public final void onTick(long j10) {
        int[] iArr = this.f8800a;
        iArr[0] = iArr[0] - 1;
        g gVar = this.f8801b;
        gVar.u0--;
        gVar.V.setEnabled(false);
        Button button = this.f8801b.V;
        StringBuilder g10 = f.g("Please Wait ");
        g10.append(this.f8800a[0]);
        button.setText(g10.toString());
    }
}
