package i4;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class p6 {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7589d = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final o6 f7590a;

    /* renamed from: b  reason: collision with root package name */
    public final BigInteger f7591b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public BigInteger f7592c = BigInteger.ZERO;

    public p6(byte[] bArr, byte[] bArr2, BigInteger bigInteger, o6 o6Var) {
        this.f7591b = bigInteger;
        this.f7590a = o6Var;
    }
}
