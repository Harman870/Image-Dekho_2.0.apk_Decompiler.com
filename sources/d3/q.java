package d3;

import android.database.Cursor;
import d3.x;
import e3.a;
import java.util.ArrayList;
import l2.d;

public final /* synthetic */ class q implements x.a, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6077a;

    public /* synthetic */ q(int i10) {
        this.f6077a = i10;
    }

    public final Object apply(Object obj) {
        switch (this.f6077a) {
            case 0:
                throw new a("Timed out while trying to acquire the lock.", (Throwable) obj);
            default:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }

    public final void c(d dVar) {
        switch (this.f6077a) {
            case 3:
                dVar.dismiss();
                return;
            default:
                dVar.dismiss();
                return;
        }
    }
}
