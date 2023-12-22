package i4;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import n3.w;
import r3.o;
import u3.a;

public final class xe implements fg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f7794a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ rg f7795b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f7796c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ wg f7797d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ fg f7798e;

    public xe(w wVar, g gVar, fg fgVar, rg rgVar, wg wgVar) {
        this.f7794a = gVar;
        this.f7795b = rgVar;
        this.f7796c = wVar;
        this.f7797d = wgVar;
        this.f7798e = fgVar;
    }

    public final void c(xf xfVar) {
        String str;
        h hVar = (h) xfVar;
        g gVar = this.f7794a;
        gVar.getClass();
        o.e("EMAIL");
        List list = null;
        if (gVar.f7320d.f7374b.contains("EMAIL")) {
            this.f7795b.f7652b = null;
        } else {
            String str2 = this.f7794a.f7318b;
            if (str2 != null) {
                this.f7795b.f7652b = str2;
            }
        }
        g gVar2 = this.f7794a;
        gVar2.getClass();
        o.e("DISPLAY_NAME");
        if (gVar2.f7320d.f7374b.contains("DISPLAY_NAME")) {
            this.f7795b.f7654d = null;
        } else {
            this.f7794a.getClass();
        }
        g gVar3 = this.f7794a;
        gVar3.getClass();
        o.e("PHOTO_URL");
        if (gVar3.f7320d.f7374b.contains("PHOTO_URL")) {
            this.f7795b.f7655e = null;
        } else {
            this.f7794a.getClass();
        }
        if (!TextUtils.isEmpty(this.f7794a.f7319c)) {
            rg rgVar = this.f7795b;
            byte[] bytes = "redacted".getBytes();
            if (bytes == null) {
                str = null;
            } else {
                str = Base64.encodeToString(bytes, 0);
            }
            rgVar.getClass();
            o.e(str);
            rgVar.f7657g = str;
        }
        e eVar = hVar.f7336a;
        if (eVar != null) {
            list = eVar.f7268a;
        }
        if (list == null) {
            list = new ArrayList();
        }
        rg rgVar2 = this.f7795b;
        rgVar2.getClass();
        e eVar2 = new e();
        rgVar2.f7656f = eVar2;
        eVar2.f7268a.addAll(list);
        w wVar = this.f7796c;
        wg wgVar = this.f7797d;
        o.h(wgVar);
        String str3 = hVar.f7337b;
        String str4 = hVar.f7338c;
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            wgVar = new wg(str4, str3, Long.valueOf(hVar.f7339d), wgVar.f7779d);
        }
        rg rgVar3 = this.f7795b;
        wVar.getClass();
        try {
            ((lf) wVar.f9573a).d(wgVar, rgVar3);
        } catch (RemoteException e10) {
            ((a) wVar.f9574b).b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(String str) {
        this.f7798e.zza(str);
    }
}
