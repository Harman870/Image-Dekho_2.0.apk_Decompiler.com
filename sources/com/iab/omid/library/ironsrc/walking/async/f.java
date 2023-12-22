package com.iab.omid.library.ironsrc.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b.C0036b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        c c10 = c.c();
        if (c10 != null) {
            for (a next : c10.b()) {
                if (this.f3617c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().b(str, this.f3619e);
                }
            }
        }
    }

    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.utils.c.h(this.f3618d, this.f3621b.a())) {
            return null;
        }
        this.f3621b.a(this.f3618d);
        return this.f3618d.toString();
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
