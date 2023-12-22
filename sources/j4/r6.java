package j4;

public class r6 {
    public static int a(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long b(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }
}
