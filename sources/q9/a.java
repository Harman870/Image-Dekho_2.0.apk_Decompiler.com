package q9;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import j9.v;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
public final class a extends b {
    public a() {
        super((Class) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public final void g(SSLSocket sSLSocket, String str, List<v> list) {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) f.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Nullable
    @IgnoreJRERequirement
    public final String j(SSLSocket sSLSocket) {
        String c10 = sSLSocket.getApplicationProtocol();
        if (c10 == null || c10.isEmpty()) {
            return null;
        }
        return c10;
    }
}
