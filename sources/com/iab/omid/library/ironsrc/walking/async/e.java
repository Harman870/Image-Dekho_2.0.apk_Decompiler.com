package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public class e extends a {
    public e(b.C0036b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        c c10 = c.c();
        if (c10 != null) {
            for (a next : c10.b()) {
                if (this.f3617c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f3619e);
                }
            }
        }
    }

    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f3618d.toString();
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
