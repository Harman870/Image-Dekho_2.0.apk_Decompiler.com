package j8;

import android.os.CountDownTimer;

public final class h extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f8794a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8795b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f8796c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(g gVar, long j10, int[] iArr, int i10) {
        super(j10, 5000);
        this.f8796c = gVar;
        this.f8794a = iArr;
        this.f8795b = i10;
    }

    public final void onFinish() {
        this.f8794a[0] = this.f8795b;
        g gVar = this.f8796c;
        gVar.p0 = true;
        gVar.f8787o0 = false;
    }

    public final void onTick(long j10) {
        int[] iArr = this.f8794a;
        iArr[0] = iArr[0] - 5;
    }
}
