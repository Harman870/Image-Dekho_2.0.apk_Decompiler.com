package j8;

import android.os.CountDownTimer;

public final class i extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f8797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8798b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f8799c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(g gVar, long j10, int[] iArr, int i10) {
        super(j10, 5000);
        this.f8799c = gVar;
        this.f8797a = iArr;
        this.f8798b = i10;
    }

    public final void onFinish() {
        this.f8797a[0] = this.f8798b;
        g gVar = this.f8799c;
        gVar.p0 = true;
        gVar.f8787o0 = false;
    }

    public final void onTick(long j10) {
        int[] iArr = this.f8797a;
        iArr[0] = iArr[0] - 5;
    }
}
