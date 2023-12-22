package l8;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import l2.d;

public final /* synthetic */ class a implements d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9246b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9247c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f9248d;

    public /* synthetic */ a(g gVar, String str, Activity activity, String str2) {
        this.f9245a = gVar;
        this.f9246b = str;
        this.f9247c = activity;
        this.f9248d = str2;
    }

    public final void c(d dVar) {
        g gVar = this.f9245a;
        String str = this.f9246b;
        Activity activity = this.f9247c;
        String str2 = this.f9248d;
        gVar.b(str, IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
        dVar.dismiss();
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
    }
}
