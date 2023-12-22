package o1;

import java.io.IOException;

public final class e extends IOException {
    public e(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}
