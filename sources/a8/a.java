package a8;

import android.content.Intent;
import android.view.View;
import com.imgdkh.app.R;
import com.ironsource.sdk.k.e;
import j8.o;
import x8.f;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f211b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f212c;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f210a = i10;
        this.f211b = obj;
        this.f212c = obj2;
    }

    public final void onClick(View view) {
        switch (this.f210a) {
            case 0:
                e eVar = (e) this.f211b;
                e.b bVar = (e.b) this.f212c;
                f.f(eVar, "this$0");
                f.f(bVar, "$viewName");
                e.a aVar = eVar.f5701a;
                if (aVar != null) {
                    aVar.a(bVar);
                    return;
                }
                return;
            default:
                o oVar = (o) this.f211b;
                int i10 = o.T;
                oVar.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", oVar.q().getString(R.string.invite_msg) + ((String) this.f212c));
                oVar.a0(Intent.createChooser(intent, "Share via"));
                return;
        }
    }
}
