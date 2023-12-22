package i3;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzfc;
import i3.c;
import j3.a;
import j3.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7126a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public b f7127b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7128c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f7129d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f7130e = new ArrayList();

    public final void a(a aVar, String str) {
        if (aVar == null) {
            zzfc.zze("product should be non-null");
            return;
        }
        if (str == null) {
            str = "";
        }
        if (!this.f7128c.containsKey(str)) {
            this.f7128c.put(str, new ArrayList());
        }
        ((List) this.f7128c.get(str)).add(aVar);
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap(this.f7126a);
        b bVar = this.f7127b;
        if (bVar != null) {
            hashMap.putAll(new HashMap(bVar.f8034a));
        }
        Iterator it = this.f7129d.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            hashMap.putAll(((j3.c) it.next()).a(i.a(i10, "&promo")));
            i10++;
        }
        Iterator it2 = this.f7130e.iterator();
        int i11 = 1;
        while (it2.hasNext()) {
            hashMap.putAll(((a) it2.next()).a(i.a(i11, "&pr")));
            i11++;
        }
        int i12 = 1;
        for (Map.Entry entry : this.f7128c.entrySet()) {
            String a10 = i.a(i12, "&il");
            int i13 = 1;
            for (a a11 : (List) entry.getValue()) {
                hashMap.putAll(a11.a(a10.concat(i.a(i13, "pi"))));
                i13++;
            }
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                hashMap.put(a10.concat("nm"), (String) entry.getKey());
            }
            i12++;
        }
        return hashMap;
    }

    public final void c(String str, String str2) {
        this.f7126a.put(str, str2);
    }
}
