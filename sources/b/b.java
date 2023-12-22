package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o8.e;
import p8.g;
import p8.j;
import x8.f;
import z5.c;

public final class b extends a<String[], Map<String, Boolean>> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        f.f(componentActivity, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
        f.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0016a b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        f.f(componentActivity, "context");
        boolean z9 = true;
        if (strArr.length == 0) {
            return new a.C0016a(g.f10706a);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(y.a.a(componentActivity, strArr[i10]) == 0)) {
                z9 = false;
                break;
            }
            i10++;
        }
        if (!z9) {
            return null;
        }
        int m2 = c.m(strArr.length);
        if (m2 < 16) {
            m2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new a.C0016a(linkedHashMap);
    }

    public final Object c(Intent intent, int i10) {
        boolean z9;
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    arrayList.add(Boolean.valueOf(z9));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(p8.a.u(arrayList2), p8.a.u(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new e(it.next(), it2.next()));
                }
                return j.z(arrayList3);
            }
        }
        return g.f10706a;
    }
}
