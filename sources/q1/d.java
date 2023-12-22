package q1;

public final class d extends RuntimeException {
    public d(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
