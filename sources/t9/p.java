package t9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class p extends c {
    public final /* synthetic */ Socket k;

    public p(Socket socket) {
        this.k = socket;
    }

    public final IOException m(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void n() {
        StringBuilder sb;
        Level level;
        Logger logger;
        boolean z9;
        try {
            this.k.close();
            return;
        } catch (Exception e10) {
            e = e10;
            logger = q.f12068a;
            level = Level.WARNING;
            sb = new StringBuilder();
        } catch (AssertionError e11) {
            e = e11;
            if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                logger = q.f12068a;
                level = Level.WARNING;
                sb = new StringBuilder();
            } else {
                throw e;
            }
        }
        sb.append("Failed to close timed out socket ");
        sb.append(this.k);
        logger.log(level, sb.toString(), e);
    }
}
