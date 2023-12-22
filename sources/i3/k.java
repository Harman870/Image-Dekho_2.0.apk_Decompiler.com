package i3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

public final class k implements v {

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f7145b;

    /* renamed from: a  reason: collision with root package name */
    public final LogPrinter f7146a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f7145b = builder.build();
    }

    public final void a(l lVar) {
        ArrayList arrayList = new ArrayList(lVar.f7153g.values());
        Collections.sort(arrayList, new j());
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String obj = ((n) arrayList.get(i10)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f7146a.println(sb.toString());
    }

    public final Uri zzb() {
        return f7145b;
    }
}
