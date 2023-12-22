package n4;

import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import j4.j3;
import j4.k3;
import j4.n3;
import j4.o3;
import java.util.Iterator;
import r3.o;

public final /* synthetic */ class o4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10033b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10034c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Parcelable f10035d;

    public /* synthetic */ o4(Object obj, Object obj2, Parcelable parcelable, int i10) {
        this.f10032a = i10;
        this.f10033b = obj;
        this.f10034c = obj2;
        this.f10035d = parcelable;
    }

    public final void run() {
        p pVar;
        switch (this.f10032a) {
            case 0:
                String str = (String) this.f10034c;
                Bundle bundle = (Bundle) this.f10035d;
                i iVar = ((z4) this.f10033b).f10346a.f10284c;
                w7.H(iVar);
                iVar.g();
                iVar.h();
                n4 n4Var = iVar.f9600a;
                o.e(str);
                o.e("dep");
                TextUtils.isEmpty("");
                if (bundle == null || bundle.isEmpty()) {
                    pVar = new p(new Bundle());
                } else {
                    Bundle bundle2 = new Bundle(bundle);
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            n4Var.a().f9828f.a("Param name can't be null");
                        } else {
                            Object k = n4Var.x().k(bundle2.get(next), next);
                            if (k == null) {
                                n4Var.a().f9831i.b("Param value can't be null", n4Var.f9997m.e(next));
                            } else {
                                n4Var.x().y(bundle2, next, k);
                            }
                        }
                        it.remove();
                    }
                    pVar = new p(bundle2);
                }
                y7 y7Var = iVar.f10066b.f10288g;
                w7.H(y7Var);
                j3 x9 = k3.x();
                x9.j();
                k3.J(0, (k3) x9.f8238b);
                for (String next2 : pVar.f10048a.keySet()) {
                    n3 x10 = o3.x();
                    x10.l(next2);
                    Object obj = pVar.f10048a.get(next2);
                    o.h(obj);
                    y7Var.F(x10, obj);
                    x9.m(x10);
                }
                byte[] g10 = ((k3) x9.h()).g();
                iVar.f9600a.a().f9835n.c("Saving default event parameters, appId, data size", iVar.f9600a.f9997m.d(str), Integer.valueOf(g10.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("parameters", g10);
                try {
                    if (iVar.z().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                        iVar.f9600a.a().f9828f.b("Failed to insert default event parameters (got -1). appId", i3.p(str));
                        return;
                    }
                    return;
                } catch (SQLiteException e10) {
                    iVar.f9600a.a().f9828f.c("Error storing default event parameters. appId", i3.p(str), e10);
                    return;
                }
            default:
                g7 g7Var = (g7) this.f10033b;
                g7Var.getClass();
                ((i3) this.f10034c).f9835n.a("AppMeasurementJobService processed last upload request.");
                ((f7) g7Var.f9767a).c((JobParameters) this.f10035d);
                return;
        }
    }
}
