package d3;

import a7.t;
import android.database.Cursor;
import android.util.Base64;
import b7.b;
import d3.x;
import g3.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import q6.h;
import w2.j;

public final /* synthetic */ class s implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6080a;

    public /* synthetic */ s(int i10) {
        this.f6080a = i10;
    }

    public final Object apply(Object obj) {
        byte[] bArr;
        switch (this.f6080a) {
            case 0:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    j.a a10 = w2.s.a();
                    a10.b(cursor.getString(1));
                    a10.c(a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    if (string == null) {
                        bArr = null;
                    } else {
                        bArr = Base64.decode(string, 0);
                    }
                    a10.f12708b = bArr;
                    arrayList.add(a10.a());
                }
                return arrayList;
            default:
                b bVar = (b) obj;
                bVar.getClass();
                h hVar = t.f205a;
                hVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hVar.a(bVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }
}
