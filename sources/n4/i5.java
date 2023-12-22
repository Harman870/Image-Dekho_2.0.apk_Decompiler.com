package n4;

import android.content.Context;
import android.os.Bundle;
import j4.d1;
import r3.o;

public final class i5 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9836a;

    /* renamed from: b  reason: collision with root package name */
    public String f9837b;

    /* renamed from: c  reason: collision with root package name */
    public String f9838c;

    /* renamed from: d  reason: collision with root package name */
    public String f9839d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f9840e;

    /* renamed from: f  reason: collision with root package name */
    public long f9841f;

    /* renamed from: g  reason: collision with root package name */
    public d1 f9842g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9843h = true;

    /* renamed from: i  reason: collision with root package name */
    public final Long f9844i;

    /* renamed from: j  reason: collision with root package name */
    public String f9845j;

    public i5(Context context, d1 d1Var, Long l6) {
        o.h(context);
        Context applicationContext = context.getApplicationContext();
        o.h(applicationContext);
        this.f9836a = applicationContext;
        this.f9844i = l6;
        if (d1Var != null) {
            this.f9842g = d1Var;
            this.f9837b = d1Var.f8100f;
            this.f9838c = d1Var.f8099e;
            this.f9839d = d1Var.f8098d;
            this.f9843h = d1Var.f8097c;
            this.f9841f = d1Var.f8096b;
            this.f9845j = d1Var.f8102h;
            Bundle bundle = d1Var.f8101g;
            if (bundle != null) {
                this.f9840e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
