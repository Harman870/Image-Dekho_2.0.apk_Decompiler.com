package d7;

import android.os.Trace;
import j6.d;
import j6.w;

public final /* synthetic */ class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j6.a f6106b;

    public /* synthetic */ a(String str, j6.a aVar) {
        this.f6105a = str;
        this.f6106b = aVar;
    }

    public final Object h(w wVar) {
        String str = this.f6105a;
        j6.a aVar = this.f6106b;
        try {
            Trace.beginSection(str);
            return aVar.f8722f.h(wVar);
        } finally {
            Trace.endSection();
        }
    }
}
