package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import i1.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1253a;
        if (aVar.h(1)) {
            obj = aVar.l();
        }
        remoteActionCompat.f1253a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1254b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f1254b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1255c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.f1255c = charSequence2;
        Object obj2 = remoteActionCompat.f1256d;
        if (aVar.h(4)) {
            obj2 = aVar.j();
        }
        remoteActionCompat.f1256d = (PendingIntent) obj2;
        boolean z9 = remoteActionCompat.f1257e;
        if (aVar.h(5)) {
            z9 = aVar.e();
        }
        remoteActionCompat.f1257e = z9;
        boolean z10 = remoteActionCompat.f1258f;
        if (aVar.h(6)) {
            z10 = aVar.e();
        }
        remoteActionCompat.f1258f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1253a;
        aVar.m(1);
        aVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1254b;
        aVar.m(2);
        aVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1255c;
        aVar.m(3);
        aVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1256d;
        aVar.m(4);
        aVar.r(pendingIntent);
        boolean z9 = remoteActionCompat.f1257e;
        aVar.m(5);
        aVar.n(z9);
        boolean z10 = remoteActionCompat.f1258f;
        aVar.m(6);
        aVar.n(z10);
    }
}
