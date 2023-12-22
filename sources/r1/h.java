package r1;

public final class h implements a<int[]> {
    public final String a() {
        return "IntegerArrayPool";
    }

    public final int b(Object obj) {
        return ((int[]) obj).length;
    }

    public final int c() {
        return 4;
    }

    public final Object newArray(int i10) {
        return new int[i10];
    }
}
