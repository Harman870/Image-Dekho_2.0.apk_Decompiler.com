package i4;

public class e8 extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e8(int i10, String str, Exception exc) {
        super("Creating a LegacyProtoKey failed", exc);
        if (i10 != 1) {
        } else {
            super(str, exc);
        }
    }

    public /* synthetic */ e8(Exception exc) {
        super(exc);
    }

    public /* synthetic */ e8(String str) {
        super(str);
    }
}
