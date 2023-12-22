package i4;

import androidx.activity.f;
import c.a;
import c6.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

public abstract class r5 {

    /* renamed from: a  reason: collision with root package name */
    public final p5 f7636a;

    /* renamed from: b  reason: collision with root package name */
    public final p5 f7637b;

    public r5(byte[] bArr) {
        if (j3.c(1)) {
            this.f7636a = a(1, bArr);
            this.f7637b = a(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract p5 a(int i10, byte[] bArr);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        int i10;
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                this.f7637b.c(0, bArr).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i11 = remaining % 16;
                if (i11 == 0) {
                    i10 = remaining;
                } else {
                    i10 = (remaining + 16) - i11;
                }
                ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i10);
                order.putLong(0);
                order.putLong((long) remaining);
                if (b.J(a.o(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    p5 p5Var = this.f7636a;
                    p5Var.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    if (bArr.length == p5Var.a()) {
                        int remaining2 = byteBuffer.remaining();
                        int i12 = (remaining2 / 64) + 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            ByteBuffer c10 = p5Var.c(p5Var.f7588b + i13, bArr);
                            if (i13 == i12 - 1) {
                                b.E(allocate, byteBuffer, c10, remaining2 % 64);
                            } else {
                                b.E(allocate, byteBuffer, c10, 64);
                            }
                        }
                        return allocate.array();
                    }
                    StringBuilder g10 = f.g("The nonce length (in bytes) must be ");
                    g10.append(p5Var.a());
                    throw new GeneralSecurityException(g10.toString());
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
