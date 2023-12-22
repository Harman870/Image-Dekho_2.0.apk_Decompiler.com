package r1;

public final class f implements a<byte[]> {
    public final String a() {
        return "ByteArrayPool";
    }

    public final int b(Object obj) {
        return ((byte[]) obj).length;
    }

    public final int c() {
        return 1;
    }

    public final Object newArray(int i10) {
        return new byte[i10];
    }
}
