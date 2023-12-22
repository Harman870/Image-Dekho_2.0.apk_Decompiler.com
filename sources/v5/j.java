package v5;

import android.content.Intent;
import android.view.View;
import com.wallpapersindia.app.RedeemScreen;
import j8.r;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12542a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12543b;

    public /* synthetic */ j(int i10, Object obj) {
        this.f12542a = i10;
        this.f12543b = obj;
    }

    public final void onClick(View view) {
        switch (this.f12542a) {
            case 0:
                r rVar = (r) this.f12543b;
                int i10 = r.X;
                rVar.getClass();
                rVar.a0(new Intent(rVar.j(), RedeemScreen.class));
                return;
            default:
                r rVar = (r) this.f12543b;
                int i10 = r.X;
                rVar.getClass();
                rVar.a0(new Intent(rVar.j(), RedeemScreen.class));
                return;
        }
    }
}
