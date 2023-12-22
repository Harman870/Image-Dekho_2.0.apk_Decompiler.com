package j4;

import androidx.fragment.app.w0;
import j4.e6;
import j4.f6;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public abstract class f6<MessageType extends f6<MessageType, BuilderType>, BuilderType extends e6<MessageType, BuilderType>> implements n8 {
    public int zzb = 0;

    public static void f(Iterable iterable, r7 r7Var) {
        Charset charset = s7.f8462a;
        iterable.getClass();
        if (iterable instanceof y7) {
            List b10 = ((y7) iterable).b();
            y7 y7Var = (y7) r7Var;
            int size = r7Var.size();
            for (Object next : b10) {
                if (next == null) {
                    String str = "Element at index " + (y7Var.size() - size) + " is null.";
                    int size2 = y7Var.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            y7Var.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof q6) {
                    y7Var.v((q6) next);
                } else {
                    y7Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof u8)) {
            if ((r7Var instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) r7Var).ensureCapacity(((Collection) iterable).size() + r7Var.size());
            }
            int size3 = r7Var.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (r7Var.size() - size3) + " is null.";
                    int size4 = r7Var.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            r7Var.remove(size4);
                        } else {
                            throw new NullPointerException(str2);
                        }
                    }
                } else {
                    r7Var.add(next2);
                }
            }
        } else {
            r7Var.addAll((Collection) iterable);
        }
    }

    public int a(y8 y8Var) {
        throw null;
    }

    public final o6 d() {
        try {
            m7 m7Var = (m7) this;
            int e10 = m7Var.e();
            o6 o6Var = q6.f8402b;
            byte[] bArr = new byte[e10];
            Logger logger = u6.f8492x;
            s6 s6Var = new s6(bArr, e10);
            y8 a10 = v8.f8521c.a(m7Var.getClass());
            v6 v6Var = s6Var.w;
            if (v6Var == null) {
                v6Var = new v6(s6Var);
            }
            a10.g(m7Var, v6Var);
            if (e10 - s6Var.B == 0) {
                return new o6(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            throw new RuntimeException(w0.d("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e11);
        }
    }

    public final byte[] g() {
        try {
            m7 m7Var = (m7) this;
            int e10 = m7Var.e();
            byte[] bArr = new byte[e10];
            Logger logger = u6.f8492x;
            s6 s6Var = new s6(bArr, e10);
            y8 a10 = v8.f8521c.a(m7Var.getClass());
            v6 v6Var = s6Var.w;
            if (v6Var == null) {
                v6Var = new v6(s6Var);
            }
            a10.g(m7Var, v6Var);
            if (e10 - s6Var.B == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e11) {
            throw new RuntimeException(w0.d("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e11);
        }
    }
}
