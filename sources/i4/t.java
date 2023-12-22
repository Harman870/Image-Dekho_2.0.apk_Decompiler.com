package i4;

import androidx.fragment.app.w0;
import i4.s;
import i4.t;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class t<MessageType extends t<MessageType, BuilderType>, BuilderType extends s<MessageType, BuilderType>> implements b2 {
    public int zza = 0;

    public int a(m2 m2Var) {
        throw null;
    }

    public final byte[] e() {
        try {
            c1 c1Var = (c1) this;
            int h10 = c1Var.h();
            byte[] bArr = new byte[h10];
            Logger logger = l0.f7459c;
            i0 i0Var = new i0(bArr, h10);
            c1Var.l(i0Var);
            if (h10 - i0Var.f7377g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(w0.d("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public final d0 i() {
        try {
            c1 c1Var = (c1) this;
            int h10 = c1Var.h();
            d0 d0Var = e0.f7269b;
            byte[] bArr = new byte[h10];
            Logger logger = l0.f7459c;
            i0 i0Var = new i0(bArr, h10);
            c1Var.l(i0Var);
            if (h10 - i0Var.f7377g == 0) {
                return new d0(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(w0.d("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }
}
