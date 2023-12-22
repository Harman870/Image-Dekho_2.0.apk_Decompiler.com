package i4;

import android.os.RemoteException;
import android.text.TextUtils;
import h6.b0;
import java.util.List;
import n3.w;
import u3.a;

public final class ye implements fg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fg f7821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7822b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7823c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Boolean f7824d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b0 f7825e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f7826f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ wg f7827g;

    public ye(w wVar, fg fgVar, wg wgVar, b0 b0Var, Boolean bool, String str, String str2) {
        this.f7821a = fgVar;
        this.f7822b = str;
        this.f7823c = str2;
        this.f7824d = bool;
        this.f7825e = b0Var;
        this.f7826f = wVar;
        this.f7827g = wgVar;
    }

    public final void c(xf xfVar) {
        List list;
        int i10;
        List list2 = ((pg) xfVar).f7599a.f7693a;
        if (list2 == null || list2.isEmpty()) {
            this.f7821a.zza("No users.");
            return;
        }
        rg rgVar = (rg) list2.get(0);
        e eVar = rgVar.f7656f;
        if (eVar != null) {
            list = eVar.f7268a;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(this.f7822b)) {
                i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (((c) list.get(i10)).f7218d.equals(this.f7822b)) {
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            ((c) list.get(i10)).f7219e = this.f7823c;
        }
        rgVar.k = this.f7824d.booleanValue();
        rgVar.f7661l = this.f7825e;
        w wVar = this.f7826f;
        wg wgVar = this.f7827g;
        wVar.getClass();
        try {
            ((lf) wVar.f9573a).d(wgVar, rgVar);
        } catch (RemoteException e10) {
            ((a) wVar.f9574b).b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(String str) {
        this.f7821a.zza(str);
    }
}
