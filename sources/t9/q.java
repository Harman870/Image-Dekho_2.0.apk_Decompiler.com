package t9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f12068a = Logger.getLogger(q.class.getName());

    public static a a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            p pVar = new p(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(pVar, new n(outputStream, pVar));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static b b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            p pVar = new p(socket);
            InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return new b(pVar, new o(inputStream, pVar));
            }
            throw new IllegalArgumentException("in == null");
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
