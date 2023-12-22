package i4;

public final class w2 extends RuntimeException {
    public w2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
