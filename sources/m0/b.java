package m0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.c1;

public final class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f9316a;

    public interface a {
    }

    public b(a aVar) {
        this.f9316a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return ((c1) this.f9316a).d((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            m0.b$a r0 = r3.f9316a
            androidx.appcompat.widget.c1 r0 = (androidx.appcompat.widget.c1) r0
            if (r4 != 0) goto L_0x0009
            java.lang.String r4 = ""
            goto L_0x0010
        L_0x0009:
            r0.getClass()
            java.lang.String r4 = r4.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.k
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0036
            androidx.appcompat.widget.SearchView r1 = r0.k
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f742l     // Catch:{ RuntimeException -> 0x002e }
            android.database.Cursor r4 = r0.h(r1, r4)     // Catch:{ RuntimeException -> 0x002e }
            if (r4 == 0) goto L_0x0036
            r4.getCount()     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x0037
        L_0x002e:
            r4 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r4)
        L_0x0036:
            r4 = r2
        L_0x0037:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r4 == 0) goto L_0x0047
            int r1 = r4.getCount()
            r0.count = r1
            r0.values = r4
            goto L_0x004c
        L_0x0047:
            r4 = 0
            r0.count = r4
            r0.values = r2
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f9316a;
        Cursor cursor = ((a) aVar).f9309c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((c1) aVar).c((Cursor) obj);
        }
    }
}
