package w2;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import t2.d;
import w2.j;

@AutoValue
public abstract class s {

    @AutoValue.Builder
    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        aVar.c(d.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
