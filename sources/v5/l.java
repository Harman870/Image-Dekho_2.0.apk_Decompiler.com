package v5;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class l implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12545a;

    public /* synthetic */ l(o oVar) {
        this.f12545a = oVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z9;
        o oVar = this.f12545a;
        oVar.getClass();
        if (motionEvent.getAction() == 1) {
            long currentTimeMillis = System.currentTimeMillis() - oVar.f12557o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                oVar.f12555m = false;
            }
            oVar.u();
            oVar.f12555m = true;
            oVar.f12557o = System.currentTimeMillis();
        }
        return false;
    }
}
