package w3;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

@Deprecated
public final class f {
    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
